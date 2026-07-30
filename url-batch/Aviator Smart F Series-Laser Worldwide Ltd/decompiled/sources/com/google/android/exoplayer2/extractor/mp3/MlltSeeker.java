package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
final class MlltSeeker implements Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private MlltSeeker(long[] jArr, long[] jArr2, long j8) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j8 == C.TIME_UNSET ? Util.msToUs(jArr2[jArr2.length - 1]) : j8;
    }

    public static MlltSeeker create(long j8, MlltFrame mlltFrame, long j9) {
        int length = mlltFrame.bytesDeviations.length;
        int i8 = length + 1;
        long[] jArr = new long[i8];
        long[] jArr2 = new long[i8];
        jArr[0] = j8;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i9 = 1; i9 <= length; i9++) {
            int i10 = i9 - 1;
            j8 += mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i10];
            j10 += mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i10];
            jArr[i9] = j8;
            jArr2[i9] = j10;
        }
        return new MlltSeeker(jArr, jArr2, j9);
    }

    private static Pair<Long, Long> linearlyInterpolate(long j8, long[] jArr, long[] jArr2) {
        int binarySearchFloor = Util.binarySearchFloor(jArr, j8, true, true);
        long j9 = jArr[binarySearchFloor];
        long j10 = jArr2[binarySearchFloor];
        int i8 = binarySearchFloor + 1;
        if (i8 == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((jArr[i8] == j9 ? i.DOUBLE_EPSILON : (j8 - j9) / (r6 - j9)) * (jArr2[i8] - j10))) + j10));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        Pair<Long, Long> linearlyInterpolate = linearlyInterpolate(Util.usToMs(Util.constrainValue(j8, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) linearlyInterpolate.first).longValue()), ((Long) linearlyInterpolate.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j8) {
        return Util.msToUs(((Long) linearlyInterpolate(j8, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
