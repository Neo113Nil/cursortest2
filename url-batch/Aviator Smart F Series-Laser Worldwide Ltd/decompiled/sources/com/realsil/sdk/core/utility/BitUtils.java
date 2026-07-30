package com.realsil.sdk.core.utility;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.realsil.sdk.dfu.i.a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import java.util.function.IntFunction;
import y5.u;

/* loaded from: classes4.dex */
public final class BitUtils {
    public static int bEIntToBytes(byte[] bArr) {
        return uint8(bArr[3]) + (uint8(bArr[0]) << 24) + (uint8(bArr[1]) << 16) + (uint8(bArr[2]) << 8);
    }

    public static long bitAt(int i8) {
        return 1 << i8;
    }

    public static int bytesToBEInt(byte[] bArr) {
        return uint8(bArr[3]) + (uint8(bArr[0]) << 24) + (uint8(bArr[1]) << 16) + (uint8(bArr[2]) << 8);
    }

    public static int bytesToLEInt(byte[] bArr) {
        return Integer.reverseBytes(bytesToBEInt(bArr));
    }

    public static void checkArgument(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static String flagsToString(int i8, IntFunction<String> intFunction) {
        Object apply;
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        while (i8 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i8);
            i8 &= ~numberOfTrailingZeros;
            if (i9 > 0) {
                sb.append(", ");
            }
            if (Build.VERSION.SDK_INT >= 24) {
                apply = intFunction.apply(numberOfTrailingZeros);
                sb.append((String) apply);
            }
            i9++;
        }
        wrap(sb, "[", "]");
        return sb.toString();
    }

    public static int getUint16(ByteBuffer byteBuffer, int i8) {
        return uint16(byteBuffer.getShort(i8));
    }

    public static long getUint32(ByteBuffer byteBuffer, int i8) {
        return uint32(byteBuffer.getInt(i8));
    }

    public static int getUint8(ByteBuffer byteBuffer, int i8) {
        return uint8(byteBuffer.get(i8));
    }

    public static boolean isBitSet(long j8, int i8) {
        return (j8 & bitAt(i8)) != 0;
    }

    public static boolean maskedEquals(byte b8, byte b9, byte b10) {
        return (b8 & b10) == (b9 & b10);
    }

    public static long packBits(int[] iArr) {
        long j8 = 0;
        for (int i8 : iArr) {
            j8 |= 1 << i8;
        }
        return j8;
    }

    public static void put(ByteBuffer byteBuffer, int i8, byte[] bArr) {
        int position = byteBuffer.position();
        byteBuffer.position(i8);
        byteBuffer.put(bArr);
        byteBuffer.position(position);
    }

    public static int uint16(byte b8, byte b9) {
        return ((b8 & 255) << 8) | (b9 & 255);
    }

    public static long uint32(int i8) {
        return i8 & a.INVALID_VERSION_32;
    }

    public static int uint8(byte b8) {
        return b8 & 255;
    }

    public static int[] unpackBits(long j8) {
        int[] iArr = new int[Long.bitCount(j8)];
        int i8 = 0;
        int i9 = 0;
        while (j8 > 0) {
            if ((j8 & 1) == 1) {
                iArr[i8] = i9;
                i8++;
            }
            j8 >>= 1;
            i9++;
        }
        return iArr;
    }

    public static void wrap(StringBuilder sb, String str, String str2) {
        sb.insert(0, str);
        sb.append(str2);
    }

    public static void checkArgument(boolean z7, @NonNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static boolean maskedEquals(long j8, long j9, long j10) {
        return (j8 & j10) == (j9 & j10);
    }

    public static int uint16(short s7) {
        return s7 & u.MAX_VALUE;
    }

    public static boolean maskedEquals(UUID uuid, UUID uuid2, @Nullable UUID uuid3) {
        return uuid3 == null ? Objects.equals(uuid, uuid2) : maskedEquals(uuid.getLeastSignificantBits(), uuid2.getLeastSignificantBits(), uuid3.getLeastSignificantBits()) && maskedEquals(uuid.getMostSignificantBits(), uuid2.getMostSignificantBits(), uuid3.getMostSignificantBits());
    }

    public static boolean maskedEquals(byte[] bArr, byte[] bArr2, @Nullable byte[] bArr3) {
        if (bArr == null || bArr2 == null) {
            return bArr == bArr2;
        }
        checkArgument(bArr.length == bArr2.length, "Inputs must be of same size");
        if (bArr3 == null) {
            return Arrays.equals(bArr, bArr2);
        }
        checkArgument(bArr.length == bArr3.length, "Mask must be of same size as inputs");
        for (int i8 = 0; i8 < bArr3.length; i8++) {
            if (!maskedEquals(bArr[i8], bArr2[i8], bArr3[i8])) {
                return false;
            }
        }
        return true;
    }
}
