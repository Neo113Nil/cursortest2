package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b3 {
    static {
        int i3 = q0.f2690a;
    }

    public static boolean a(byte[] bArr, int i3, int i10) {
        while (i3 < i10 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i10) {
            return true;
        }
        while (i3 < i10) {
            int i11 = i3 + 1;
            byte b10 = bArr[i3];
            if (b10 >= 0) {
                i3 = i11;
            } else {
                if (b10 < -32) {
                    if (i11 < i10 && b10 >= -62) {
                        i3 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b10 >= -16) {
                    if (i11 >= i10 - 2) {
                        return false;
                    }
                    int i12 = i3 + 2;
                    byte b11 = bArr[i11];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i13 = i3 + 3;
                            if (bArr[i12] <= -65) {
                                i3 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i11 >= i10 - 1) {
                    return false;
                }
                int i14 = i3 + 2;
                byte b12 = bArr[i11];
                if (b12 > -65 || (b10 == -32 && b12 < -96)) {
                    return false;
                }
                if (b10 == -19 && b12 >= -96) {
                    return false;
                }
                i3 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i3 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                try {
                    int length2 = str.length();
                    while (i10 < length2) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 2048) {
                            i3 += (127 - charAt2) >>> 31;
                        } else {
                            i3 += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) < 65536) {
                                    throw new a3(r0.a(length2, i10, (byte) 32, "Unpaired surrogate at index ", " of "));
                                }
                                i10++;
                            }
                        }
                        i10++;
                    }
                    i11 += i3;
                } catch (a3 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i11 >= length) {
            return i11;
        }
        long j = i11 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(String str, byte[] bArr, int i3, int i10) {
        int i11;
        int i12;
        int length;
        int i13;
        char charAt;
        int length2 = str.length();
        int i14 = 0;
        while (true) {
            i11 = i3 + i10;
            if (i14 >= length2 || (i13 = i14 + i3) >= i11 || (charAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) charAt;
            i14++;
        }
        int i15 = i3 + i14;
        while (i14 < length2) {
            char charAt2 = str.charAt(i14);
            if (charAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) charAt2;
                i15++;
            } else if (charAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 <= i11 - 4) {
                        i14++;
                        if (i14 != str.length()) {
                            char charAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int i16 = i15 + 3;
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i3 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i3, length);
                    } else {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i12 = i14 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i12)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i3 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i3, length);
                    }
                    return i3 + length;
                }
                bArr[i15] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static String d(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i3) - i10) | i3 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i3), Integer.valueOf(i10)));
        }
        int i11 = i3 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i3 < i11) {
            byte b10 = bArr[i3];
            if (b10 < 0) {
                break;
            }
            i3++;
            cArr[i12] = (char) b10;
            i12++;
        }
        while (i3 < i11) {
            int i13 = i3 + 1;
            byte b11 = bArr[i3];
            if (b11 >= 0) {
                cArr[i12] = (char) b11;
                i12++;
                i3 = i13;
                while (i3 < i11) {
                    byte b12 = bArr[i3];
                    if (b12 >= 0) {
                        i3++;
                        cArr[i12] = (char) b12;
                        i12++;
                    }
                }
            } else {
                if (b11 >= -32) {
                    if (b11 >= -16) {
                        if (i13 >= i11 - 2) {
                            a2.r.o("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        byte b13 = bArr[i13];
                        int i14 = i3 + 3;
                        byte b14 = bArr[i3 + 2];
                        i3 += 4;
                        byte b15 = bArr[i14];
                        if (!hg.e(b13)) {
                            if ((((b13 + 112) + (b11 << 28)) >> 30) == 0 && !hg.e(b14) && !hg.e(b15)) {
                                int i15 = ((b13 & 63) << 12) | ((b11 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                cArr[i12] = (char) ((i15 >>> 10) + 55232);
                                cArr[i12 + 1] = (char) ((i15 & 1023) + 56320);
                                i12 += 2;
                            }
                        }
                        a2.r.o("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    if (i13 >= i11 - 1) {
                        a2.r.o("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    int i16 = i12 + 1;
                    int i17 = i3 + 2;
                    byte b16 = bArr[i13];
                    i3 += 3;
                    byte b17 = bArr[i17];
                    if (!hg.e(b16)) {
                        if (b11 == -32) {
                            if (b16 >= -96) {
                                b11 = -32;
                            }
                        }
                        if (b11 == -19) {
                            if (b16 < -96) {
                                b11 = -19;
                            }
                        }
                        if (!hg.e(b17)) {
                            cArr[i12] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                            i12 = i16;
                        }
                    }
                    a2.r.o("Protocol message had invalid UTF-8.");
                    return null;
                }
                if (i13 >= i11) {
                    a2.r.o("Protocol message had invalid UTF-8.");
                    return null;
                }
                int i18 = i12 + 1;
                i3 += 2;
                byte b18 = bArr[i13];
                if (b11 < -62 || hg.e(b18)) {
                    a2.r.o("Protocol message had invalid UTF-8.");
                    return null;
                }
                cArr[i12] = (char) ((b18 & 63) | ((b11 & 31) << 6));
                i12 = i18;
            }
        }
        return new String(cArr, 0, i12);
    }
}
