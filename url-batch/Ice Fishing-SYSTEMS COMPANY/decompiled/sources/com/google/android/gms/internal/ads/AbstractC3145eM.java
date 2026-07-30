package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.eM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3145eM {

    /* renamed from: a, reason: collision with root package name */
    public static final C3307hK f30346a;

    static {
        int i = KK.f25952a;
        f30346a = new C3307hK((byte) 0, 10);
    }

    public static boolean a(byte[] bArr, int i, int i4) {
        f30346a.getClass();
        while (i < i4 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i4) {
            return true;
        }
        while (i < i4) {
            int i9 = i + 1;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                i = i9;
            } else if (b9 < -32) {
                if (i9 >= i4 || b9 < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i9] > -65) {
                    return false;
                }
            } else if (b9 < -16) {
                if (i9 >= i4 - 1) {
                    return false;
                }
                int i10 = i + 2;
                byte b10 = bArr[i9];
                if (b10 > -65) {
                    return false;
                }
                if (b9 == -32 && b10 < -96) {
                    return false;
                }
                if (b9 == -19 && b10 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i10] > -65) {
                    return false;
                }
            } else {
                if (i9 >= i4 - 2) {
                    return false;
                }
                int i11 = i + 2;
                byte b11 = bArr[i9];
                if (b11 > -65) {
                    return false;
                }
                if ((((b11 + 112) + (b9 << 28)) >> 30) != 0) {
                    return false;
                }
                int i12 = i + 3;
                if (bArr[i11] > -65) {
                    return false;
                }
                i += 4;
                if (bArr[i12] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i9 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i4++;
            } else {
                try {
                    int length2 = str.length();
                    while (i4 < length2) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i4) < 65536) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 32 + String.valueOf(length2).length());
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i4);
                                    sb.append(" of ");
                                    sb.append(length2);
                                    throw new C3091dM(sb.toString());
                                }
                                i4++;
                            }
                        }
                        i4++;
                    }
                    i9 += i;
                } catch (C3091dM unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i9 >= length) {
            return i9;
        }
        long j9 = i9 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j9);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(byte[] bArr, int i, int i4, String str) {
        int i9;
        int i10;
        int length;
        int i11;
        char charAt;
        int length2 = str.length();
        int i12 = 0;
        while (true) {
            i9 = i + i4;
            if (i12 >= length2 || (i11 = i12 + i) >= i9 || (charAt = str.charAt(i12)) >= 128) {
                break;
            }
            bArr[i11] = (byte) charAt;
            i12++;
        }
        int i13 = i + i12;
        while (i12 < length2) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < 128 && i13 < i9) {
                bArr[i13] = (byte) charAt2;
                i13++;
            } else if (charAt2 < 2048 && i13 <= i9 - 2) {
                bArr[i13] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                i13 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i13 > i9 - 3) {
                    if (i13 <= i9 - 4) {
                        i12++;
                        if (i12 != str.length()) {
                            char charAt3 = str.charAt(i12);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int i14 = i13 + 3;
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i13 += 4;
                                bArr[i14] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i > i4) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i, length);
                    } else {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i10 = i12 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i10)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i > i4) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i, length);
                    }
                    return i + length;
                }
                bArr[i13] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i13 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i13 + 2] = (byte) ((charAt2 & '?') | 128);
                i13 += 3;
            }
            i12++;
        }
        return i13;
    }

    public static String d(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i) - i4) | i | i4) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i4)));
        }
        int i9 = i + i4;
        char[] cArr = new char[i4];
        int i10 = 0;
        while (i < i9) {
            byte b9 = bArr[i];
            if (b9 < 0) {
                break;
            }
            i++;
            cArr[i10] = (char) b9;
            i10++;
        }
        while (i < i9) {
            int i11 = i + 1;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                cArr[i10] = (char) b10;
                i10++;
                i = i11;
                while (i < i9) {
                    byte b11 = bArr[i];
                    if (b11 >= 0) {
                        i++;
                        cArr[i10] = (char) b11;
                        i10++;
                    }
                }
            } else {
                if (b10 >= -32) {
                    if (b10 < -16) {
                        if (i11 >= i9 - 1) {
                            throw new C3845rL("Protocol message had invalid UTF-8.");
                        }
                        int i12 = i10 + 1;
                        int i13 = i + 2;
                        byte b12 = bArr[i11];
                        i += 3;
                        byte b13 = bArr[i13];
                        if (!AbstractC3406jD.m(b12)) {
                            if (b10 == -32) {
                                if (b12 >= -96) {
                                    b10 = -32;
                                }
                            }
                            if (b10 == -19) {
                                if (b12 < -96) {
                                    b10 = -19;
                                }
                            }
                            if (!AbstractC3406jD.m(b13)) {
                                cArr[i10] = (char) (((b12 & com.anythink.core.common.s.a.c.f16476c) << 6) | ((b10 & 15) << 12) | (b13 & com.anythink.core.common.s.a.c.f16476c));
                                i10 = i12;
                            }
                        }
                        throw new C3845rL("Protocol message had invalid UTF-8.");
                    }
                    if (i11 >= i9 - 2) {
                        throw new C3845rL("Protocol message had invalid UTF-8.");
                    }
                    byte b14 = bArr[i11];
                    int i14 = i + 3;
                    byte b15 = bArr[i + 2];
                    i += 4;
                    byte b16 = bArr[i14];
                    if (!AbstractC3406jD.m(b14)) {
                        if ((((b14 + 112) + (b10 << 28)) >> 30) == 0 && !AbstractC3406jD.m(b15) && !AbstractC3406jD.m(b16)) {
                            int i15 = ((b14 & com.anythink.core.common.s.a.c.f16476c) << 12) | ((b10 & 7) << 18) | ((b15 & com.anythink.core.common.s.a.c.f16476c) << 6) | (b16 & com.anythink.core.common.s.a.c.f16476c);
                            cArr[i10] = (char) ((i15 >>> 10) + 55232);
                            cArr[i10 + 1] = (char) ((i15 & 1023) + 56320);
                            i10 += 2;
                        }
                    }
                    throw new C3845rL("Protocol message had invalid UTF-8.");
                }
                if (i11 >= i9) {
                    throw new C3845rL("Protocol message had invalid UTF-8.");
                }
                int i16 = i10 + 1;
                i += 2;
                byte b17 = bArr[i11];
                if (b10 < -62 || AbstractC3406jD.m(b17)) {
                    throw new C3845rL("Protocol message had invalid UTF-8.");
                }
                cArr[i10] = (char) ((b17 & com.anythink.core.common.s.a.c.f16476c) | ((b10 & 31) << 6));
                i10 = i16;
            }
        }
        return new String(cArr, 0, i10);
    }
}
