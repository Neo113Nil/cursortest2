package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j8, long j9) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j8;
        this.dataEndPosition = j9;
    }

    @Nullable
    public static VbriSeeker create(long j8, long j9, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0) {
            return null;
        }
        int i8 = header.sampleRate;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(readInt, (i8 >= 32000 ? 1152 : 576) * 1000000, i8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j10 = j9 + header.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i9 = 0;
        long j11 = j9;
        while (i9 < readUnsignedShort) {
            int i10 = readUnsignedShort2;
            long j12 = j10;
            jArr[i9] = (i9 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i9] = Math.max(j11, j12);
            if (readUnsignedShort3 == 1) {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            } else if (readUnsignedShort3 == 2) {
                readUnsignedByte = parsableByteArray.readUnsignedShort();
            } else if (readUnsignedShort3 == 3) {
                readUnsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (readUnsignedShort3 != 4) {
                    return null;
                }
                readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j11 += readUnsignedByte * i10;
            i9++;
            jArr = jArr;
            readUnsignedShort2 = i10;
            j10 = j12;
        }
        long[] jArr3 = jArr;
        if (j8 != -1 && j8 != j11) {
            Log.w(TAG, "VBRI data size mismatch: " + j8 + ", " + j11);
        }
        return new VbriSeeker(jArr3, jArr2, scaleLargeTimestamp, j11);
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
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j8, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs >= j8 || binarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i8 = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i8], this.positions[i8]));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j8) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j8, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
