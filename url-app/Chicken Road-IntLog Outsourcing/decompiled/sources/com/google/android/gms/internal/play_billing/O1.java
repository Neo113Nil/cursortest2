package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public abstract class O1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5087a = 0;

    static {
        if (M1.f5083e && M1.f5082d) {
            int i2 = U0.f5108a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i2, int i3) {
        int i6 = i3 - i2;
        byte b6 = bArr[i2 - 1];
        if (i6 == 0) {
            if (b6 <= -12) {
                return b6;
            }
            return -1;
        }
        if (i6 == 1) {
            byte b7 = bArr[i2];
            if (b6 > -12 || b7 > -65) {
                return -1;
            }
            return (b7 << 8) ^ b6;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b8 = bArr[i2];
        byte b9 = bArr[i2 + 1];
        if (b6 > -12 || b8 > -65 || b9 > -65) {
            return -1;
        }
        return (b9 << 16) ^ ((b8 << 8) ^ b6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i2, int i3) {
        int i6;
        int i7;
        int i8;
        char charAt;
        int length = str.length();
        int i9 = 0;
        while (true) {
            i6 = i2 + i3;
            if (i9 >= length || (i8 = i9 + i2) >= i6 || (charAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) charAt;
            i9++;
        }
        int i10 = i2 + i9;
        while (i9 < length) {
            char charAt2 = str.charAt(i9);
            if (charAt2 < 128 && i10 < i6) {
                bArr[i10] = (byte) charAt2;
                i10++;
            } else if (charAt2 < 2048 && i10 <= i6 - 2) {
                bArr[i10] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i10 + 1] = (byte) ((charAt2 & '?') | 128);
                i10 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i10 > i6 - 3) {
                    if (i10 > i6 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i7 = i9 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i7)))) {
                            throw new N1(i9, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i10);
                    }
                    int i11 = i9 + 1;
                    if (i11 != str.length()) {
                        char charAt3 = str.charAt(i11);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i12 = i10 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i9 = i11;
                        } else {
                            i9 = i11;
                        }
                    }
                    throw new N1(i9 - 1, length);
                }
                bArr[i10] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                i10 += 3;
            }
            i9++;
        }
        return i10;
    }

    public static int c(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i6 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = str.charAt(i3);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new N1(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i6 += i2;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i6 = i2 + 1;
            int i7 = bArr[i2];
            if (i7 >= 0) {
                i2 = i6;
            } else if (i7 < -32) {
                if (i6 >= i3) {
                    return i7 == 0;
                }
                if (i7 < -62) {
                    return false;
                }
                i2 += 2;
                if (bArr[i6] > 65471) {
                    return false;
                }
            } else if (i7 < -16) {
                if (i6 >= i3 - 1) {
                    i7 = a(bArr, i6, i3);
                    if (i7 == 0) {
                    }
                } else {
                    int i8 = i2 + 2;
                    char c2 = bArr[i6];
                    if (c2 > 65471) {
                        return false;
                    }
                    if (i7 == -32 && c2 < 65440) {
                        return false;
                    }
                    if (i7 == -19 && c2 >= 65440) {
                        return false;
                    }
                    i2 += 3;
                    if (bArr[i8] > 65471) {
                        return false;
                    }
                }
            } else if (i6 >= i3 - 2) {
                i7 = a(bArr, i6, i3);
                if (i7 == 0) {
                }
            } else {
                int i9 = i2 + 2;
                int i10 = bArr[i6];
                if (i10 > -65) {
                    return false;
                }
                if ((((i10 + 112) + (i7 << 28)) >> 30) != 0) {
                    return false;
                }
                int i11 = i2 + 3;
                if (bArr[i9] > 65471) {
                    return false;
                }
                i2 += 4;
                if (bArr[i11] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
