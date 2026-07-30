package okio;

import okio.c;

/* loaded from: classes5.dex */
public abstract class d1 {
    private static final c.a DEFAULT__new_UnsafeCursor = new c.a();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b8, int i8) {
        return b8 & i8;
    }

    public static final boolean arrayRangeEquals(byte[] a8, int i8, byte[] b8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(a8, "a");
        kotlin.jvm.internal.s.checkNotNullParameter(b8, "b");
        if (i10 <= 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (a8[i11 + i8] != b8[i11 + i9]) {
                return false;
            }
            if (i12 >= i10) {
                return true;
            }
            i11 = i12;
        }
    }

    public static final void checkOffsetAndCount(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException("size=" + j8 + " offset=" + j9 + " byteCount=" + j10);
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final c.a getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }

    public static final int leftRotate(int i8, int i9) {
        return (i8 >>> (32 - i9)) | (i8 << i9);
    }

    public static final long minOf(long j8, int i8) {
        return Math.min(j8, i8);
    }

    public static final c.a resolveDefaultParameter(c.a unsafeCursor) {
        kotlin.jvm.internal.s.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new c.a() : unsafeCursor;
    }

    public static final int reverseBytes(int i8) {
        return ((i8 & 255) << 24) | (((-16777216) & i8) >>> 24) | ((16711680 & i8) >>> 8) | ((65280 & i8) << 8);
    }

    public static final long rightRotate(long j8, int i8) {
        return (j8 << (64 - i8)) | (j8 >>> i8);
    }

    public static final int shl(byte b8, int i8) {
        return b8 << i8;
    }

    public static final int shr(byte b8, int i8) {
        return b8 >> i8;
    }

    public static final String toHexString(byte b8) {
        String concatToString;
        concatToString = kotlin.text.t.concatToString(new char[]{okio.internal.e.getHEX_DIGIT_CHARS()[(b8 >> 4) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[b8 & 15]});
        return concatToString;
    }

    public static final byte xor(byte b8, byte b9) {
        return (byte) (b8 ^ b9);
    }

    public static final long and(byte b8, long j8) {
        return b8 & j8;
    }

    public static final long minOf(int i8, long j8) {
        return Math.min(i8, j8);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(byteString, "<this>");
        return i8 == DEFAULT__ByteString_size ? byteString.size() : i8;
    }

    public static final long reverseBytes(long j8) {
        return ((j8 & 255) << 56) | (((-72057594037927936L) & j8) >>> 56) | ((71776119061217280L & j8) >>> 40) | ((280375465082880L & j8) >>> 24) | ((1095216660480L & j8) >>> 8) | ((4278190080L & j8) << 8) | ((16711680 & j8) << 24) | ((65280 & j8) << 40);
    }

    public static final long and(int i8, long j8) {
        return i8 & j8;
    }

    public static final short reverseBytes(short s7) {
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >>> 8));
    }

    public static final String toHexString(int i8) {
        if (i8 == 0) {
            return "0";
        }
        int i9 = 0;
        char[] cArr = {okio.internal.e.getHEX_DIGIT_CHARS()[(i8 >> 28) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[(i8 >> 24) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[(i8 >> 20) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[(i8 >> 16) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[(i8 >> 12) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[(i8 >> 8) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[(i8 >> 4) & 15], okio.internal.e.getHEX_DIGIT_CHARS()[i8 & 15]};
        while (i9 < 8 && cArr[i9] == '0') {
            i9++;
        }
        return kotlin.text.t.concatToString(cArr, i9, 8);
    }

    public static final String toHexString(long j8) {
        if (j8 == 0) {
            return "0";
        }
        int i8 = 0;
        char[] cArr = {okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 60) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 56) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 52) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 48) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 44) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 40) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 36) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 32) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 28) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 24) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 20) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 16) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 12) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 8) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) ((j8 >> 4) & 15)], okio.internal.e.getHEX_DIGIT_CHARS()[(int) (j8 & 15)]};
        while (i8 < 16 && cArr[i8] == '0') {
            i8++;
        }
        return kotlin.text.t.concatToString(cArr, i8, 16);
    }
}
