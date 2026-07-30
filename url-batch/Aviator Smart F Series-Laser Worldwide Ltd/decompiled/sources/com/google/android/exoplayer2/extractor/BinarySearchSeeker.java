package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final BinarySearchSeekMap seekMap;

    @Nullable
    protected SeekOperationParams seekOperationParams;
    protected final TimestampSeeker timestampSeeker;

    public static class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j8, long j9, long j10, long j11, long j12, long j13) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j8;
            this.floorTimePosition = j9;
            this.ceilingTimePosition = j10;
            this.floorBytePosition = j11;
            this.ceilingBytePosition = j12;
            this.approxBytesPerFrame = j13;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j8) {
            return new SeekMap.SeekPoints(new SeekPoint(j8, SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j8), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j8) {
            return this.seekTimestampConverter.timeUsToTargetTime(j8);
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j8) {
            return j8;
        }
    }

    protected static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        protected SeekOperationParams(long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
            this.seekTimeUs = j8;
            this.targetTimePosition = j9;
            this.floorTimePosition = j10;
            this.ceilingTimePosition = j11;
            this.floorBytePosition = j12;
            this.ceilingBytePosition = j13;
            this.approxBytesPerFrame = j14;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j9, j10, j11, j12, j13, j14);
        }

        protected static long calculateNextSearchBytePosition(long j8, long j9, long j10, long j11, long j12, long j13) {
            if (j11 + 1 >= j12 || j9 + 1 >= j10) {
                return j11;
            }
            long j14 = (long) ((j8 - j9) * ((j12 - j11) / (j10 - j9)));
            return Util.constrainValue(((j14 + j11) - j13) - (j14 / 20), j11, j12 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j8, long j9) {
            this.ceilingTimePosition = j8;
            this.ceilingBytePosition = j9;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j8, long j9) {
            this.floorTimePosition = j8;
            this.floorBytePosition = j9;
            updateNextSearchBytePosition();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j8);
    }

    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int i8, long j8, long j9) {
            this.type = i8;
            this.timestampToUpdate = j8;
            this.bytePositionToUpdate = j9;
        }

        public static TimestampSearchResult overestimatedResult(long j8, long j9) {
            return new TimestampSearchResult(-1, j8, j9);
        }

        public static TimestampSearchResult targetFoundResult(long j8) {
            return new TimestampSearchResult(0, C.TIME_UNSET, j8);
        }

        public static TimestampSearchResult underestimatedResult(long j8, long j9) {
            return new TimestampSearchResult(-2, j8, j9);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface TimestampSeeker {
        void onSeekFinished();

        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j8);
    }

    protected BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j8, long j9, long j10, long j11, long j12, long j13, int i8) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i8;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, j8, j9, j10, j11, j12, j13);
    }

    protected SeekOperationParams createSeekParamsForTargetTimeUs(long j8) {
        return new SeekOperationParams(j8, this.seekMap.timeUsToTargetTime(j8), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            SeekOperationParams seekOperationParams = (SeekOperationParams) Assertions.checkStateNotNull(this.seekOperationParams);
            long floorBytePosition = seekOperationParams.getFloorBytePosition();
            long ceilingBytePosition = seekOperationParams.getCeilingBytePosition();
            long nextSearchBytePosition = seekOperationParams.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.minimumSearchRange) {
                markSeekOperationFinished(false, floorBytePosition);
                return seekToPosition(extractorInput, floorBytePosition, positionHolder);
            }
            if (!skipInputUntilPosition(extractorInput, nextSearchBytePosition)) {
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            extractorInput.resetPeekPosition();
            TimestampSearchResult searchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
            int i8 = searchForTimestamp.type;
            if (i8 == -3) {
                markSeekOperationFinished(false, nextSearchBytePosition);
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            if (i8 == -2) {
                seekOperationParams.updateSeekFloor(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
            } else {
                if (i8 != -1) {
                    if (i8 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    skipInputUntilPosition(extractorInput, searchForTimestamp.bytePositionToUpdate);
                    markSeekOperationFinished(true, searchForTimestamp.bytePositionToUpdate);
                    return seekToPosition(extractorInput, searchForTimestamp.bytePositionToUpdate, positionHolder);
                }
                seekOperationParams.updateSeekCeiling(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
            }
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    protected final void markSeekOperationFinished(boolean z7, long j8) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(z7, j8);
    }

    protected void onSeekOperationFinished(boolean z7, long j8) {
    }

    protected final int seekToPosition(ExtractorInput extractorInput, long j8, PositionHolder positionHolder) {
        if (j8 == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j8;
        return 1;
    }

    public final void setSeekTargetUs(long j8) {
        SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j8) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j8);
        }
    }

    protected final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j8) {
        long position = j8 - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }
}
