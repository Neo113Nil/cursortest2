package com.startapp.simple.bloomfilter.algo;

import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MurmurHash {
    public static long hash64(ByteBuffer byteBuffer, int i4, int i5, long j4) {
        long j5 = -4132994306676758123L;
        long j6 = (j4 & KeyboardMap.kValueMask) ^ (i5 * (-4132994306676758123L));
        int i6 = 0;
        while (i6 < (i5 >> 3)) {
            int i7 = i4 + (i6 << 3);
            long j7 = j5;
            long j8 = ((byteBuffer.get(i7) & 255) + ((byteBuffer.get(i7 + 1) & 255) << 8) + ((byteBuffer.get(i7 + 2) & 255) << 16) + ((byteBuffer.get(i7 + 3) & 255) << 24) + ((byteBuffer.get(i7 + 4) & 255) << 32) + ((byteBuffer.get(i7 + 5) & 255) << 40) + ((byteBuffer.get(i7 + 6) & 255) << 48) + ((byteBuffer.get(i7 + 7) & 255) << 56)) * j7;
            j6 = (j6 ^ ((j8 ^ (j8 >>> 47)) * j7)) * j7;
            i6++;
            j5 = j7;
        }
        long j9 = j5;
        switch (i5 & 7) {
            case 7:
                j6 ^= byteBuffer.get(((i4 + i5) - r4) + 6) << 48;
            case 6:
                j6 ^= byteBuffer.get(((i4 + i5) - r4) + 5) << 40;
            case 5:
                j6 ^= byteBuffer.get(((i4 + i5) - r4) + 4) << 32;
            case 4:
                j6 ^= byteBuffer.get(((i4 + i5) - r4) + 3) << 24;
            case 3:
                j6 ^= byteBuffer.get(((i4 + i5) - r4) + 2) << 16;
            case 2:
                j6 ^= byteBuffer.get(((i4 + i5) - r4) + 1) << 8;
            case 1:
                j6 = (byteBuffer.get((i4 + i5) - r4) ^ j6) * j9;
                break;
        }
        long j10 = ((j6 >>> 47) ^ j6) * j9;
        return j10 ^ (j10 >>> 47);
    }
}
