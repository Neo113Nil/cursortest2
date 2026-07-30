package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
final class WavSeekMap implements SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final WavFormat wavFormat;

    public WavSeekMap(WavFormat wavFormat, int i8, long j8, long j9) {
        this.wavFormat = wavFormat;
        this.framesPerBlock = i8;
        this.firstBlockPosition = j8;
        long j10 = (j9 - j8) / wavFormat.blockSize;
        this.blockCount = j10;
        this.durationUs = blockIndexToTimeUs(j10);
    }

    private long blockIndexToTimeUs(long j8) {
        return Util.scaleLargeTimestamp(j8 * this.framesPerBlock, 1000000L, this.wavFormat.frameRateHz);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        long constrainValue = Util.constrainValue((this.wavFormat.frameRateHz * j8) / (this.framesPerBlock * 1000000), 0L, this.blockCount - 1);
        long j9 = this.firstBlockPosition + (this.wavFormat.blockSize * constrainValue);
        long blockIndexToTimeUs = blockIndexToTimeUs(constrainValue);
        SeekPoint seekPoint = new SeekPoint(blockIndexToTimeUs, j9);
        if (blockIndexToTimeUs >= j8 || constrainValue == this.blockCount - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j10 = constrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(blockIndexToTimeUs(j10), this.firstBlockPosition + (this.wavFormat.blockSize * j10)));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
