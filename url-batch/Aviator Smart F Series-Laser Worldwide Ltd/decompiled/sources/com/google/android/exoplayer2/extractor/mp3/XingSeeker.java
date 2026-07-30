package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;

    @Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j8, int i8, long j9) {
        this(j8, i8, j9, -1L, null);
    }

    @Nullable
    public static XingSeeker create(long j8, long j9, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt;
        int i8 = header.samplesPerFrame;
        int i9 = header.sampleRate;
        int readInt = parsableByteArray.readInt();
        if ((readInt & 1) != 1 || (readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedIntToInt, i8 * 1000000, i9);
        if ((readInt & 6) != 6) {
            return new XingSeeker(j9, header.frameSize, scaleLargeTimestamp);
        }
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i10 = 0; i10 < 100; i10++) {
            jArr[i10] = parsableByteArray.readUnsignedByte();
        }
        if (j8 != -1) {
            long j10 = j9 + readUnsignedInt;
            if (j8 != j10) {
                Log.w(TAG, "XING data size mismatch: " + j8 + ", " + j10);
            }
        }
        return new XingSeeker(j9, header.frameSize, scaleLargeTimestamp, readUnsignedInt, jArr);
    }

    private long getTimeUsForTableIndex(int i8) {
        return (this.durationUs * i8) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long constrainValue = Util.constrainValue(j8, 0L, this.durationUs);
        double d8 = (constrainValue * 100.0d) / this.durationUs;
        double d9 = i.DOUBLE_EPSILON;
        if (d8 > i.DOUBLE_EPSILON) {
            if (d8 >= 100.0d) {
                d9 = 256.0d;
            } else {
                int i8 = (int) d8;
                double d10 = ((long[]) Assertions.checkStateNotNull(this.tableOfContents))[i8];
                d9 = d10 + ((d8 - i8) * ((i8 == 99 ? 256.0d : r3[i8 + 1]) - d10));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d9 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j8) {
        long j9 = j8 - this.dataStartPosition;
        if (!isSeekable() || j9 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
        double d8 = (j9 * 256.0d) / this.dataSize;
        int binarySearchFloor = Util.binarySearchFloor(jArr, (long) d8, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(binarySearchFloor);
        long j10 = jArr[binarySearchFloor];
        int i8 = binarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i8);
        return timeUsForTableIndex + Math.round((j10 == (binarySearchFloor == 99 ? 256L : jArr[i8]) ? i.DOUBLE_EPSILON : (d8 - j10) / (r0 - j10)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    private XingSeeker(long j8, int i8, long j9, long j10, @Nullable long[] jArr) {
        this.dataStartPosition = j8;
        this.xingFrameSize = i8;
        this.durationUs = j9;
        this.tableOfContents = jArr;
        this.dataSize = j10;
        this.dataEndPosition = j10 != -1 ? j8 + j10 : -1L;
    }
}
