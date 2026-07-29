package com.mopub.nativeads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Predicate;
import com.mopub.common.CacheService;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class HttpDiskCompositeDataSource implements DataSource {

    @VisibleForTesting
    static final int BLOCK_SIZE = 512000;

    @VisibleForTesting
    static final String EXPECTED_FILE_SIZE_KEY_PREFIX = "expectedsize-";
    private static final int HTTP_RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE = 416;

    @VisibleForTesting
    static final String INTERVALS_KEY_PREFIX = "intervals-sorted-";
    private static final String LENGTH = "length";

    @VisibleForTesting
    static final int LENGTH_UNBOUNDED = -1;
    private static final String START = "start";
    private byte[] mCachedBytes;
    private int mDataBlockOffset;
    private DataSpec mDataSpec;
    private Integer mExpectedFileLength;
    private final HttpDataSource mHttpDataSource;
    private final TreeSet<IntInterval> mIntervals;
    private boolean mIsDirty;
    private boolean mIsHttpSourceOpen;
    private String mKey;
    private int mSegment;
    private int mStartInDataBlock;
    private int mStartInFile;

    private static boolean areBytesAvailableInCache(int i, int i2, int i3) {
        return i > i2 + i3;
    }

    public HttpDiskCompositeDataSource(Context context, String str) {
        this(context, str, new DefaultHttpDataSource(str, (Predicate) null));
    }

    @VisibleForTesting
    HttpDiskCompositeDataSource(Context context, String str, HttpDataSource httpDataSource) {
        this.mExpectedFileLength = null;
        this.mHttpDataSource = httpDataSource;
        CacheService.initialize(context);
        this.mIntervals = new TreeSet<>();
    }

    public long open(DataSpec dataSpec) throws IOException {
        Preconditions.checkNotNull(dataSpec);
        if (dataSpec.uri == null) {
            return -1L;
        }
        this.mIsDirty = false;
        this.mDataSpec = dataSpec;
        this.mKey = dataSpec.uri.toString();
        if (this.mKey == null) {
            return -1L;
        }
        this.mStartInFile = (int) dataSpec.absoluteStreamPosition;
        this.mSegment = this.mStartInFile / BLOCK_SIZE;
        this.mCachedBytes = CacheService.getFromDiskCache(this.mSegment + this.mKey);
        this.mStartInDataBlock = this.mStartInFile % BLOCK_SIZE;
        this.mDataBlockOffset = 0;
        this.mExpectedFileLength = getExpectedFileLengthFromDisk(this.mKey);
        populateIntervalsFromDisk(this.mKey, this.mIntervals);
        int firstContiguousPointAfter = getFirstContiguousPointAfter(this.mStartInFile, this.mIntervals);
        if (this.mCachedBytes == null) {
            this.mCachedBytes = new byte[BLOCK_SIZE];
            if (firstContiguousPointAfter > this.mStartInFile) {
                MoPubLog.d("Cache segment " + this.mSegment + " was evicted. Invalidating cache");
                this.mIntervals.clear();
                firstContiguousPointAfter = (int) dataSpec.absoluteStreamPosition;
            }
        }
        if (this.mExpectedFileLength != null && firstContiguousPointAfter == this.mExpectedFileLength.intValue()) {
            return dataSpec.length == -1 ? this.mExpectedFileLength.intValue() - this.mStartInFile : dataSpec.length;
        }
        long j = this.mDataSpec.length == -1 ? -1L : this.mDataSpec.length - (firstContiguousPointAfter - this.mStartInFile);
        try {
            long open = this.mHttpDataSource.open(new DataSpec(dataSpec.uri, firstContiguousPointAfter, j, dataSpec.key, dataSpec.flags));
            if (this.mExpectedFileLength == null && j == -1) {
                this.mExpectedFileLength = Integer.valueOf((int) (this.mStartInFile + open));
                CacheService.putToDiskCache(EXPECTED_FILE_SIZE_KEY_PREFIX + this.mKey, String.valueOf(this.mExpectedFileLength).getBytes());
            }
            this.mIsHttpSourceOpen = true;
            return open;
        } catch (HttpDataSource.InvalidResponseCodeException e) {
            if (e.responseCode == HTTP_RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE) {
                long intValue = this.mExpectedFileLength == null ? firstContiguousPointAfter - this.mStartInFile : this.mExpectedFileLength.intValue() - this.mStartInFile;
                this.mIsHttpSourceOpen = false;
                return intValue;
            }
            throw e;
        }
    }

    private static void populateIntervalsFromDisk(String str, TreeSet<IntInterval> treeSet) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(treeSet);
        treeSet.clear();
        byte[] fromDiskCache = CacheService.getFromDiskCache(INTERVALS_KEY_PREFIX + str);
        if (fromDiskCache != null) {
            try {
                JSONArray jSONArray = new JSONArray(new String(fromDiskCache));
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = new JSONObject((String) jSONArray.get(i));
                    treeSet.add(new IntInterval(jSONObject.getInt("start"), jSONObject.getInt(LENGTH)));
                }
            } catch (ClassCastException unused) {
                MoPubLog.d("clearing cache since unable to read json data");
                treeSet.clear();
            } catch (JSONException e) {
                MoPubLog.d("clearing cache since invalid json intervals found", e);
                treeSet.clear();
            }
        }
    }

    private static Integer getExpectedFileLengthFromDisk(String str) {
        Preconditions.checkNotNull(str);
        byte[] fromDiskCache = CacheService.getFromDiskCache(EXPECTED_FILE_SIZE_KEY_PREFIX + str);
        if (fromDiskCache == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(new String(fromDiskCache)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public Uri getUri() {
        if (this.mDataSpec != null) {
            return this.mDataSpec.uri;
        }
        return null;
    }

    public void close() throws IOException {
        if (!TextUtils.isEmpty(this.mKey) && this.mCachedBytes != null) {
            CacheService.putToDiskCache(this.mSegment + this.mKey, this.mCachedBytes);
            addNewInterval(this.mIntervals, this.mStartInFile, this.mDataBlockOffset);
            writeIntervalsToDisk(this.mIntervals, this.mKey);
        }
        this.mCachedBytes = null;
        this.mHttpDataSource.close();
        this.mIsHttpSourceOpen = false;
        this.mStartInFile = 0;
        this.mDataBlockOffset = 0;
        this.mStartInDataBlock = 0;
        this.mExpectedFileLength = null;
        this.mIsDirty = false;
    }

    private static void writeIntervalsToDisk(TreeSet<IntInterval> treeSet, String str) {
        Preconditions.checkNotNull(treeSet);
        Preconditions.checkNotNull(str);
        JSONArray jSONArray = new JSONArray();
        Iterator<IntInterval> it = treeSet.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        CacheService.putToDiskCache(INTERVALS_KEY_PREFIX + str, jSONArray.toString().getBytes());
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > BLOCK_SIZE) {
            MoPubLog.d("Reading more than the block size (512000 bytes) at once is not possible. length = " + i2);
            return -1;
        }
        if (this.mDataSpec == null) {
            MoPubLog.d("Unable to read from data source when no spec provided");
            return -1;
        }
        if (this.mCachedBytes == null) {
            MoPubLog.d("No cache set up. Call open before read.");
            return -1;
        }
        int i3 = (BLOCK_SIZE - this.mStartInDataBlock) - this.mDataBlockOffset;
        int firstContiguousPointAfter = getFirstContiguousPointAfter(this.mStartInFile + this.mDataBlockOffset, this.mIntervals);
        int min = Math.min((firstContiguousPointAfter - this.mStartInFile) - this.mDataBlockOffset, i2);
        if (!areBytesAvailableInCache(firstContiguousPointAfter, this.mStartInFile, this.mDataBlockOffset)) {
            min = 0;
        } else if (min <= i3) {
            System.arraycopy(this.mCachedBytes, this.mStartInDataBlock + this.mDataBlockOffset, bArr, i, min);
            this.mDataBlockOffset += min;
            min += 0;
        } else {
            System.arraycopy(this.mCachedBytes, this.mStartInDataBlock + this.mDataBlockOffset, bArr, i, i3);
            this.mDataBlockOffset += i3;
            int i4 = i3 + 0;
            writeCacheToDiskAndClearVariables();
            this.mCachedBytes = CacheService.getFromDiskCache(this.mSegment + this.mKey);
            if (this.mCachedBytes == null) {
                MoPubLog.d("Unexpected cache miss. Invalidating cache");
                this.mIntervals.clear();
                this.mCachedBytes = new byte[BLOCK_SIZE];
                this.mHttpDataSource.close();
                this.mHttpDataSource.open(new DataSpec(this.mDataSpec.uri, this.mStartInFile + this.mDataBlockOffset, -1L, this.mDataSpec.key, this.mDataSpec.flags));
                this.mIsHttpSourceOpen = true;
                min = i4;
            } else {
                int i5 = i + i4;
                int i6 = min - i4;
                System.arraycopy(this.mCachedBytes, this.mStartInDataBlock + this.mDataBlockOffset, bArr, i5, i6);
                this.mDataBlockOffset += i6;
            }
        }
        int i7 = i2 - min;
        if (i7 <= 0) {
            return min;
        }
        this.mIsDirty = true;
        if (!this.mIsHttpSourceOpen) {
            MoPubLog.d("end of cache reached. No http source open");
            return -1;
        }
        int i8 = i + min;
        int read = this.mHttpDataSource.read(bArr, i8, i7);
        int i9 = (BLOCK_SIZE - this.mStartInDataBlock) - this.mDataBlockOffset;
        if (i9 < read) {
            System.arraycopy(bArr, i8, this.mCachedBytes, this.mStartInDataBlock + this.mDataBlockOffset, i9);
            this.mDataBlockOffset += i9;
            writeCacheToDiskAndClearVariables();
            this.mCachedBytes = CacheService.getFromDiskCache(this.mSegment + this.mKey);
            if (this.mCachedBytes == null) {
                this.mCachedBytes = new byte[BLOCK_SIZE];
            }
            int i10 = read - i9;
            System.arraycopy(bArr, i + i9 + min, this.mCachedBytes, this.mStartInDataBlock + this.mDataBlockOffset, i10);
            this.mDataBlockOffset += i10;
        } else {
            System.arraycopy(bArr, i8, this.mCachedBytes, this.mStartInDataBlock + this.mDataBlockOffset, read);
            this.mDataBlockOffset += read;
        }
        return read + min;
    }

    private void writeCacheToDiskAndClearVariables() {
        CacheService.putToDiskCache(this.mSegment + this.mKey, this.mCachedBytes);
        addNewInterval(this.mIntervals, this.mStartInFile, this.mDataBlockOffset);
        this.mStartInDataBlock = 0;
        this.mStartInFile = this.mStartInFile + this.mDataBlockOffset;
        this.mDataBlockOffset = 0;
        this.mSegment = this.mStartInFile / BLOCK_SIZE;
    }

    @VisibleForTesting
    static int getFirstContiguousPointAfter(int i, TreeSet<IntInterval> treeSet) {
        Preconditions.checkNotNull(treeSet);
        Iterator<IntInterval> it = treeSet.iterator();
        while (it.hasNext()) {
            IntInterval next = it.next();
            if (next.getStart() <= i) {
                i = Math.max(i, next.getStart() + next.getLength());
            }
        }
        return i;
    }

    @VisibleForTesting
    static void addNewInterval(TreeSet<IntInterval> treeSet, int i, int i2) {
        Preconditions.checkNotNull(treeSet);
        if (getFirstContiguousPointAfter(i, treeSet) >= i + i2) {
            return;
        }
        treeSet.add(new IntInterval(i, i2));
    }
}
