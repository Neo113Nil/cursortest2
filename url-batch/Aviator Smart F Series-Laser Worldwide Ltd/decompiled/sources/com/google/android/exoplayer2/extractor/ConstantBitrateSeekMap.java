package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;

@Deprecated
/* loaded from: classes3.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long j8, long j9, int i8, int i9) {
        this(j8, j9, i8, i9, false);
    }

    private long getFramePositionForTimeUs(long j8) {
        long j9 = (j8 * this.bitrate) / com.baidu.bbalbscesium.j.b.f3998f;
        int i8 = this.frameSize;
        long j10 = (j9 / i8) * i8;
        long j11 = this.dataSize;
        if (j11 != -1) {
            j10 = Math.min(j10, j11 - i8);
        }
        return this.firstFrameBytePosition + Math.max(j10, 0L);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j8);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j8) {
            int i8 = this.frameSize;
            if (i8 + framePositionForTimeUs < this.inputLength) {
                long j9 = framePositionForTimeUs + i8;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j9), j9));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUsAtPosition(long j8) {
        return getTimeUsAtPosition(j8, this.firstFrameBytePosition, this.bitrate);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    public ConstantBitrateSeekMap(long j8, long j9, int i8, int i9, boolean z7) {
        this.inputLength = j8;
        this.firstFrameBytePosition = j9;
        this.frameSize = i9 == -1 ? 1 : i9;
        this.bitrate = i8;
        this.allowSeeksIfLengthUnknown = z7;
        if (j8 == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j8 - j9;
            this.durationUs = getTimeUsAtPosition(j8, j9, i8);
        }
    }

    private static long getTimeUsAtPosition(long j8, long j9, int i8) {
        return (Math.max(0L, j8 - j9) * com.baidu.bbalbscesium.j.b.f3998f) / i8;
    }
}
