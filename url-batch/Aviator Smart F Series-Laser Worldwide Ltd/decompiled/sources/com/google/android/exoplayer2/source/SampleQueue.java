package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
public class SampleQueue implements TrackOutput {

    @VisibleForTesting
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;

    @Nullable
    private DrmSession currentDrmSession;

    @Nullable
    private Format downstreamFormat;

    @Nullable
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;

    @Nullable
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;

    @Nullable
    private Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;

    @Nullable
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;

    @Nullable
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private long upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private long[] sourceIds = new long[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata = new SpannedData<>(new Consumer() { // from class: com.google.android.exoplayer2.source.h0
        @Override // com.google.android.exoplayer2.util.Consumer
        public final void accept(Object obj) {
            SampleQueue.lambda$new$0((SampleQueue.SharedSampleMetadata) obj);
        }
    });
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    static final class SampleExtrasHolder {

        @Nullable
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;

        SampleExtrasHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final Format format;

        private SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = format;
            this.drmSessionReference = drmSessionReference;
        }
    }

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    protected SampleQueue(Allocator allocator, @Nullable DrmSessionManager drmSessionManager, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(allocator);
    }

    private synchronized boolean attemptSplice(long j8) {
        if (this.length == 0) {
            return j8 > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j8) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j8));
        return true;
    }

    private synchronized void commitSample(long j8, int i8, long j9, int i9, @Nullable TrackOutput.CryptoData cryptoData) {
        try {
            int i10 = this.length;
            if (i10 > 0) {
                int relativeIndex = getRelativeIndex(i10 - 1);
                Assertions.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j9);
            }
            this.isLastSampleQueued = (536870912 & i8) != 0;
            this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j8);
            int relativeIndex2 = getRelativeIndex(this.length);
            this.timesUs[relativeIndex2] = j8;
            this.offsets[relativeIndex2] = j9;
            this.sizes[relativeIndex2] = i9;
            this.flags[relativeIndex2] = i8;
            this.cryptoDatas[relativeIndex2] = cryptoData;
            this.sourceIds[relativeIndex2] = this.upstreamSourceId;
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
                DrmSessionManager drmSessionManager = this.drmSessionManager;
                this.sharedSampleMetadata.appendSpan(getWriteIndex(), new SharedSampleMetadata((Format) Assertions.checkNotNull(this.upstreamFormat), drmSessionManager != null ? drmSessionManager.preacquireSession(this.drmEventDispatcher, this.upstreamFormat) : DrmSessionManager.DrmSessionReference.EMPTY));
            }
            int i11 = this.length + 1;
            this.length = i11;
            int i12 = this.capacity;
            if (i11 == i12) {
                int i13 = i12 + 1000;
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                long[] jArr3 = new long[i13];
                int[] iArr = new int[i13];
                int[] iArr2 = new int[i13];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i13];
                int i14 = this.relativeFirstIndex;
                int i15 = i12 - i14;
                System.arraycopy(this.offsets, i14, jArr2, 0, i15);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i15);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr, 0, i15);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr2, 0, i15);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i15);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, jArr, 0, i15);
                int i16 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr2, i15, i16);
                System.arraycopy(this.timesUs, 0, jArr3, i15, i16);
                System.arraycopy(this.flags, 0, iArr, i15, i16);
                System.arraycopy(this.sizes, 0, iArr2, i15, i16);
                System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i15, i16);
                System.arraycopy(this.sourceIds, 0, jArr, i15, i16);
                this.offsets = jArr2;
                this.timesUs = jArr3;
                this.flags = iArr;
                this.sizes = iArr2;
                this.cryptoDatas = cryptoDataArr;
                this.sourceIds = jArr;
                this.relativeFirstIndex = 0;
                this.capacity = i13;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int countUnreadSamplesBefore(long j8) {
        int i8 = this.length;
        int relativeIndex = getRelativeIndex(i8 - 1);
        while (i8 > this.readPosition && this.timesUs[relativeIndex] >= j8) {
            i8--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i8;
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j8, boolean z7, boolean z8) {
        int i8;
        try {
            int i9 = this.length;
            if (i9 != 0) {
                long[] jArr = this.timesUs;
                int i10 = this.relativeFirstIndex;
                if (j8 >= jArr[i10]) {
                    if (z8 && (i8 = this.readPosition) != i9) {
                        i9 = i8 + 1;
                    }
                    int findSampleBefore = findSampleBefore(i10, i9, j8, z7);
                    if (findSampleBefore == -1) {
                        return -1L;
                    }
                    return discardSamples(findSampleBefore);
                }
            }
            return -1L;
        } finally {
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i8 = this.length;
        if (i8 == 0) {
            return -1L;
        }
        return discardSamples(i8);
    }

    @GuardedBy("this")
    private long discardSamples(int i8) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i8));
        this.length -= i8;
        int i9 = this.absoluteFirstIndex + i8;
        this.absoluteFirstIndex = i9;
        int i10 = this.relativeFirstIndex + i8;
        this.relativeFirstIndex = i10;
        int i11 = this.capacity;
        if (i10 >= i11) {
            this.relativeFirstIndex = i10 - i11;
        }
        int i12 = this.readPosition - i8;
        this.readPosition = i12;
        if (i12 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i9);
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i13 = this.relativeFirstIndex;
        if (i13 == 0) {
            i13 = this.capacity;
        }
        return this.offsets[i13 - 1] + this.sizes[r6];
    }

    private long discardUpstreamSampleMetadata(int i8) {
        int writeIndex = getWriteIndex() - i8;
        boolean z7 = false;
        Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i9 = this.length - writeIndex;
        this.length = i9;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i9));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z7 = true;
        }
        this.isLastSampleQueued = z7;
        this.sharedSampleMetadata.discardFrom(i8);
        int i10 = this.length;
        if (i10 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i10 - 1)] + this.sizes[r9];
    }

    private int findSampleBefore(int i8, int i9, long j8, boolean z7) {
        int i10 = -1;
        for (int i11 = 0; i11 < i9; i11++) {
            long j9 = this.timesUs[i8];
            if (j9 > j8) {
                return i10;
            }
            if (!z7 || (this.flags[i8] & 1) != 0) {
                if (j9 == j8) {
                    return i11;
                }
                i10 = i11;
            }
            i8++;
            if (i8 == this.capacity) {
                i8 = 0;
            }
        }
        return i10;
    }

    private long getLargestTimestamp(int i8) {
        long j8 = Long.MIN_VALUE;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i8 - 1);
        for (int i9 = 0; i9 < i8; i9++) {
            j8 = Math.max(j8, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return j8;
    }

    private int getRelativeIndex(int i8) {
        int i9 = this.relativeFirstIndex + i8;
        int i10 = this.capacity;
        return i9 < i10 ? i9 : i9 - i10;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(SharedSampleMetadata sharedSampleMetadata) {
        sharedSampleMetadata.drmSessionReference.release();
    }

    private boolean mayReadSample(int i8) {
        DrmSession drmSession = this.currentDrmSession;
        return drmSession == null || drmSession.getState() == 4 || ((this.flags[i8] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys());
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
        Format format2 = this.downstreamFormat;
        boolean z7 = format2 == null;
        DrmInitData drmInitData = z7 ? null : format2.drmInitData;
        this.downstreamFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z7 || !Util.areEqual(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession acquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = acquireSession;
            formatHolder.drmSession = acquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z7, boolean z8, SampleExtrasHolder sampleExtrasHolder) {
        try {
            decoderInputBuffer.waitingForKeys = false;
            if (!hasNextSample()) {
                if (!z8 && !this.isLastSampleQueued) {
                    Format format = this.upstreamFormat;
                    if (format == null || (!z7 && format == this.downstreamFormat)) {
                        return -3;
                    }
                    onFormatResult((Format) Assertions.checkNotNull(format), formatHolder);
                    return -5;
                }
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            Format format2 = this.sharedSampleMetadata.get(getReadIndex()).format;
            if (!z7 && format2 == this.downstreamFormat) {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!mayReadSample(relativeIndex)) {
                    decoderInputBuffer.waitingForKeys = true;
                    return -3;
                }
                decoderInputBuffer.setFlags(this.flags[relativeIndex]);
                if (this.readPosition == this.length - 1 && (z8 || this.isLastSampleQueued)) {
                    decoderInputBuffer.addFlag(536870912);
                }
                long j8 = this.timesUs[relativeIndex];
                decoderInputBuffer.timeUs = j8;
                if (j8 < this.startTimeUs) {
                    decoderInputBuffer.addFlag(Integer.MIN_VALUE);
                }
                sampleExtrasHolder.size = this.sizes[relativeIndex];
                sampleExtrasHolder.offset = this.offsets[relativeIndex];
                sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
                return -4;
            }
            onFormatResult(format2, formatHolder);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        try {
            this.upstreamFormatRequired = false;
            if (Util.areEqual(format, this.upstreamFormat)) {
                return false;
            }
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(format)) {
                this.upstreamFormat = format;
            } else {
                this.upstreamFormat = this.sharedSampleMetadata.getEndValue().format;
            }
            Format format2 = this.upstreamFormat;
            this.upstreamAllSamplesAreSyncSamples = MimeTypes.allSamplesAreSyncSamples(format2.sampleMimeType, format2.codecs);
            this.loggedUnexpectedNonSyncSample = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i8 = this.readPosition;
        if (i8 == 0) {
            return -1L;
        }
        return discardSamples(i8);
    }

    public final void discardTo(long j8, boolean z7, boolean z8) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j8, z7, z8));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j8) {
        if (this.length == 0) {
            return;
        }
        Assertions.checkArgument(j8 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j8));
    }

    public final void discardUpstreamSamples(int i8) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i8));
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    @CallSuper
    protected Format getAdjustedUpstreamFormat(Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int getSkipCount(long j8, boolean z7) {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j8 >= this.timesUs[relativeIndex]) {
            if (j8 > this.largestQueuedTimestampUs && z7) {
                return this.length - this.readPosition;
            }
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j8, true);
            if (findSampleBefore == -1) {
                return 0;
            }
            return findSampleBefore;
        }
        return 0;
    }

    @Nullable
    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    protected final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    @CallSuper
    public synchronized boolean isReady(boolean z7) {
        Format format;
        boolean z8 = true;
        if (hasNextSample()) {
            if (this.sharedSampleMetadata.get(getReadIndex()).format != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.readPosition));
        }
        if (!z7 && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
            z8 = false;
        }
        return z8;
    }

    @CallSuper
    public void maybeThrowError() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    @CallSuper
    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    @CallSuper
    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i8, boolean z7) {
        int peekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i8 & 2) != 0, z7, this.extrasHolder);
        if (peekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z8 = (i8 & 1) != 0;
            if ((i8 & 4) == 0) {
                if (z8) {
                    this.sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
                } else {
                    this.sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
                }
            }
            if (!z8) {
                this.readPosition++;
            }
        }
        return peekSampleMetadata;
    }

    @CallSuper
    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ int sampleData(DataReader dataReader, int i8, boolean z7) {
        return com.google.android.exoplayer2.extractor.f.a(this, dataReader, i8, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sampleMetadata(long j8, int i8, int i9, int i10, @Nullable TrackOutput.CryptoData cryptoData) {
        int i11;
        if (this.upstreamFormatAdjustmentRequired) {
            format((Format) Assertions.checkStateNotNull(this.unadjustedUpstreamFormat));
        }
        int i12 = i8 & 1;
        boolean z7 = i12 != 0;
        if (this.upstreamKeyframeRequired) {
            if (!z7) {
                return;
            } else {
                this.upstreamKeyframeRequired = false;
            }
        }
        long j9 = this.sampleOffsetUs + j8;
        if (this.upstreamAllSamplesAreSyncSamples) {
            if (j9 < this.startTimeUs) {
                return;
            }
            if (i12 == 0) {
                if (!this.loggedUnexpectedNonSyncSample) {
                    Log.w(TAG, "Overriding unexpected non-sync sample for format: " + this.upstreamFormat);
                    this.loggedUnexpectedNonSyncSample = true;
                }
                i11 = i8 | 1;
                if (this.pendingSplice) {
                    if (!z7 || !attemptSplice(j9)) {
                        return;
                    } else {
                        this.pendingSplice = false;
                    }
                }
                commitSample(j9, i11, (this.sampleDataQueue.getTotalBytesWritten() - i9) - i10, i9, cryptoData);
            }
        }
        i11 = i8;
        if (this.pendingSplice) {
        }
        commitSample(j9, i11, (this.sampleDataQueue.getTotalBytesWritten() - i9) - i10, i9, cryptoData);
    }

    public final synchronized boolean seekTo(int i8) {
        rewind();
        int i9 = this.absoluteFirstIndex;
        if (i8 >= i9 && i8 <= this.length + i9) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i8 - i9;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j8) {
        if (this.sampleOffsetUs != j8) {
            this.sampleOffsetUs = j8;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j8) {
        this.startTimeUs = j8;
    }

    public final void setUpstreamFormatChangeListener(@Nullable UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final synchronized void skip(int i8) {
        boolean z7;
        if (i8 >= 0) {
            try {
                if (this.readPosition + i8 <= this.length) {
                    z7 = true;
                    Assertions.checkArgument(z7);
                    this.readPosition += i8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z7 = false;
        Assertions.checkArgument(z7);
        this.readPosition += i8;
    }

    public final void sourceId(long j8) {
        this.upstreamSourceId = j8;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    @CallSuper
    public void reset(boolean z7) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z7) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i8) {
        com.google.android.exoplayer2.extractor.f.b(this, parsableByteArray, i8);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i8, boolean z7, int i9) {
        return this.sampleDataQueue.sampleData(dataReader, i8, z7);
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, PlayerId.UNSET);
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i8, int i9) {
        this.sampleDataQueue.sampleData(parsableByteArray, i8);
    }

    public final synchronized boolean seekTo(long j8, boolean z7) {
        rewind();
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j8 >= this.timesUs[relativeIndex] && (j8 <= this.largestQueuedTimestampUs || z7)) {
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j8, true);
            if (findSampleBefore == -1) {
                return false;
            }
            this.startTimeUs = j8;
            this.readPosition += findSampleBefore;
            return true;
        }
        return false;
    }
}
