package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class lt3 {

    /* renamed from: a, reason: collision with root package name */
    private static final it3 f8071a;

    static {
        if (gt3.a() && gt3.b()) {
            int i7 = do3.f4265a;
        }
        f8071a = new jt3();
    }

    static /* bridge */ /* synthetic */ int c(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            if (b7 > -12) {
                return -1;
            }
            return b7;
        }
        if (i9 == 1) {
            return k(b7, bArr[i7]);
        }
        if (i9 == 2) {
            return l(b7, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0100, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int d(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        char charAt;
        int length = charSequence.length();
        int i12 = i8 + i7;
        int i13 = 0;
        while (i13 < length && (i11 = i13 + i7) < i12 && (charAt = charSequence.charAt(i13)) < 128) {
            bArr[i11] = (byte) charAt;
            i13++;
        }
        int i14 = i7 + i13;
        while (i13 < length) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 >= 128 || i14 >= i12) {
                if (charAt2 < 2048 && i14 <= i12 - 2) {
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                    i14 = i15 + 1;
                    bArr[i15] = (byte) ((charAt2 & '?') | 128);
                } else {
                    if ((charAt2 >= 55296 && charAt2 <= 57343) || i14 > i12 - 3) {
                        if (i14 > i12 - 4) {
                            if (charAt2 >= 55296 && charAt2 <= 57343 && ((i10 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                                throw new kt3(i13, length);
                            }
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Failed writing ");
                            sb.append(charAt2);
                            sb.append(" at index ");
                            sb.append(i14);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        int i16 = i13 + 1;
                        if (i16 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i16);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i17 = i14 + 1;
                                bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                int i18 = i17 + 1;
                                bArr[i17] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i18 + 1;
                                bArr[i18] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 = i19 + 1;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        throw new kt3(i13 - 1, length);
                    }
                    int i20 = i14 + 1;
                    bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                    int i21 = i20 + 1;
                    bArr[i20] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i9 = i21 + 1;
                    bArr[i21] = (byte) ((charAt2 & '?') | 128);
                }
                i13++;
            } else {
                i9 = i14 + 1;
                bArr[i14] = (byte) charAt2;
            }
            i14 = i9;
            i13++;
        }
        return i14;
    }

    static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = charSequence.length();
                while (i8 < length2) {
                    char charAt2 = charSequence.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i8) < 65536) {
                                throw new kt3(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i9 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int f(int i7, byte[] bArr, int i8, int i9) {
        return f8071a.a(i7, bArr, i8, i9);
    }

    static String g(ByteBuffer byteBuffer, int i7, int i8) {
        it3 it3Var = f8071a;
        if (byteBuffer.hasArray()) {
            return it3Var.b(byteBuffer.array(), byteBuffer.arrayOffset() + i7, i8);
        }
        byteBuffer.isDirect();
        return it3.d(byteBuffer, i7, i8);
    }

    static String h(byte[] bArr, int i7, int i8) {
        return f8071a.b(bArr, i7, i8);
    }

    public static boolean i(byte[] bArr) {
        return f8071a.c(bArr, 0, bArr.length);
    }

    public static boolean j(byte[] bArr, int i7, int i8) {
        return f8071a.c(bArr, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }
}
