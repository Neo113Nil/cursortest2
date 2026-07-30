package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

@Deprecated
/* loaded from: classes3.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;

    @Nullable
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    public interface ProgressListener {
        void onProgress(long j8, long j9, long j10);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, @Nullable byte[] bArr, @Nullable ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    private long getLength() {
        long j8 = this.endPosition;
        if (j8 == -1) {
            return -1L;
        }
        return j8 - this.dataSpec.position;
    }

    private void onNewBytesCached(long j8) {
        this.bytesCached += j8;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j8);
        }
    }

    private void onRequestEndPosition(long j8) {
        if (this.endPosition == j8) {
            return;
        }
        this.endPosition = j8;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: IOException -> 0x0068, TryCatch #0 {IOException -> 0x0068, blocks: (B:25:0x0064, B:33:0x006f, B:36:0x007d, B:42:0x0085), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085 A[Catch: IOException -> 0x0068, TRY_LEAVE, TryCatch #0 {IOException -> 0x0068, blocks: (B:25:0x0064, B:33:0x006f, B:36:0x007d, B:42:0x0085), top: B:24:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long readBlockToCache(long j8, long j9) {
        long j10;
        int i8;
        boolean z7 = true;
        boolean z8 = j8 + j9 == this.endPosition || j9 == -1;
        if (j9 != -1) {
            try {
                j10 = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j8).setLength(j9).build());
            } catch (IOException unused) {
                DataSourceUtil.closeQuietly(this.dataSource);
            }
            if (!z7) {
                throwIfCanceled();
                try {
                    j10 = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j8).setLength(-1L).build());
                } catch (IOException e8) {
                    DataSourceUtil.closeQuietly(this.dataSource);
                    throw e8;
                }
            }
            if (z8 && j10 != -1) {
                try {
                    onRequestEndPosition(j10 + j8);
                } catch (IOException e9) {
                    DataSourceUtil.closeQuietly(this.dataSource);
                    throw e9;
                }
            }
            i8 = 0;
            int i9 = 0;
            while (i8 != -1) {
                throwIfCanceled();
                CacheDataSource cacheDataSource = this.dataSource;
                byte[] bArr = this.temporaryBuffer;
                i8 = cacheDataSource.read(bArr, 0, bArr.length);
                if (i8 != -1) {
                    onNewBytesCached(i8);
                    i9 += i8;
                }
            }
            if (z8) {
                onRequestEndPosition(j8 + i9);
            }
            this.dataSource.close();
            return i9;
        }
        j10 = -1;
        z7 = false;
        if (!z7) {
        }
        if (z8) {
            onRequestEndPosition(j10 + j8);
        }
        i8 = 0;
        int i92 = 0;
        while (i8 != -1) {
        }
        if (z8) {
        }
        this.dataSource.close();
        return i92;
    }

    private void throwIfCanceled() {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }

    @WorkerThread
    public void cache() {
        throwIfCanceled();
        Cache cache = this.cache;
        String str = this.cacheKey;
        DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.dataSpec;
        long j8 = dataSpec2.length;
        if (j8 != -1) {
            this.endPosition = dataSpec2.position + j8;
        } else {
            long a8 = c.a(this.cache.getContentMetadata(this.cacheKey));
            if (a8 == -1) {
                a8 = -1;
            }
            this.endPosition = a8;
        }
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j9 = this.endPosition;
            if (j9 != -1 && this.nextPosition >= j9) {
                return;
            }
            throwIfCanceled();
            long j10 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j10 == -1 ? Long.MAX_VALUE : j10 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j11 = -cachedLength;
                if (j11 == Long.MAX_VALUE) {
                    j11 = -1;
                }
                long j12 = this.nextPosition;
                this.nextPosition = j12 + readBlockToCache(j12, j11);
            }
        }
    }

    public void cancel() {
        this.isCanceled = true;
    }
}
