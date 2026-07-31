package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class MurmurHash {
    public static long hash64(ByteBuffer byteBuffer, int i, int i2, long j) {
        long j2 = -4132994306676758123L;
        long j3 = (j & 4294967295L) ^ (i2 * (-4132994306676758123L));
        int i3 = 0;
        while (i3 < (i2 >> 3)) {
            int i4 = i + (i3 << 3);
            long j4 = j2;
            long j5 = ((byteBuffer.get(i4) & 255) + ((byteBuffer.get(i4 + 1) & 255) << 8) + ((byteBuffer.get(i4 + 2) & 255) << 16) + ((byteBuffer.get(i4 + 3) & 255) << 24) + ((byteBuffer.get(i4 + 4) & 255) << 32) + ((byteBuffer.get(i4 + 5) & 255) << 40) + ((byteBuffer.get(i4 + 6) & 255) << 48) + ((byteBuffer.get(i4 + 7) & 255) << 56)) * j4;
            j3 = (j3 ^ ((j5 ^ (j5 >>> 47)) * j4)) * j4;
            i3++;
            j2 = j4;
        }
        long j6 = j2;
        switch (i2 & 7) {
            case 7:
                j3 ^= byteBuffer.get(((i + i2) - r4) + 6) << 48;
            case 6:
                j3 ^= byteBuffer.get(((i + i2) - r4) + 5) << 40;
            case 5:
                j3 ^= byteBuffer.get(((i + i2) - r4) + 4) << 32;
            case 4:
                j3 ^= byteBuffer.get(((i + i2) - r4) + 3) << 24;
            case 3:
                j3 ^= byteBuffer.get(((i + i2) - r4) + 2) << 16;
            case 2:
                j3 ^= byteBuffer.get(((i + i2) - r4) + 1) << 8;
            case 1:
                j3 = (byteBuffer.get((i + i2) - r4) ^ j3) * j6;
                break;
        }
        long j7 = ((j3 >>> 47) ^ j3) * j6;
        return j7 ^ (j7 >>> 47);
    }
}
