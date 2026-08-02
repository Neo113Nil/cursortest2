package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public abstract class O1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2773a = 0;

    static {
        if (M1.f2768e && M1.f2767d) {
            int i3 = U0.f2792a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i3, int i4) {
        int i5 = i4 - i3;
        byte b3 = bArr[i3 - 1];
        if (i5 == 0) {
            if (b3 <= -12) {
                return b3;
            }
            return -1;
        }
        if (i5 == 1) {
            byte b4 = bArr[i3];
            if (b3 > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b3;
        }
        if (i5 != 2) {
            throw new AssertionError();
        }
        byte b5 = bArr[i3];
        byte b6 = bArr[i3 + 1];
        if (b3 > -12 || b5 > -65 || b6 > -65) {
            return -1;
        }
        return (b6 << 16) ^ ((b5 << 8) ^ b3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        char charAt;
        int length = str.length();
        int i8 = 0;
        while (true) {
            i5 = i3 + i4;
            if (i8 >= length || (i7 = i8 + i3) >= i5 || (charAt = str.charAt(i8)) >= 128) {
                break;
            }
            bArr[i7] = (byte) charAt;
            i8++;
        }
        int i9 = i3 + i8;
        while (i8 < length) {
            char charAt2 = str.charAt(i8);
            if (charAt2 < 128 && i9 < i5) {
                bArr[i9] = (byte) charAt2;
                i9++;
            } else if (charAt2 < 2048 && i9 <= i5 - 2) {
                bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                i9 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i9 > i5 - 3) {
                    if (i9 > i5 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i6 = i8 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i6)))) {
                            throw new N1(i8, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                    }
                    int i10 = i8 + 1;
                    if (i10 != str.length()) {
                        char charAt3 = str.charAt(i10);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i11 = i9 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i9 += 4;
                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                            i8 = i10;
                        } else {
                            i8 = i10;
                        }
                    }
                    throw new N1(i8 - 1, length);
                }
                bArr[i9] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i9 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                i9 += 3;
            }
            i8++;
        }
        return i9;
    }

    public static int c(String str) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                int length2 = str.length();
                while (i4 < length2) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) < 65536) {
                                throw new N1(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i5 += i3;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + 4294967296L));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return true;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            int i6 = bArr[i3];
            if (i6 >= 0) {
                i3 = i5;
            } else if (i6 < -32) {
                if (i5 >= i4) {
                    return i6 == 0;
                }
                if (i6 < -62) {
                    return false;
                }
                i3 += 2;
                if (bArr[i5] > 65471) {
                    return false;
                }
            } else if (i6 < -16) {
                if (i5 >= i4 - 1) {
                    i6 = a(bArr, i5, i4);
                    if (i6 == 0) {
                    }
                } else {
                    int i7 = i3 + 2;
                    char c3 = bArr[i5];
                    if (c3 > 65471) {
                        return false;
                    }
                    if (i6 == -32 && c3 < 65440) {
                        return false;
                    }
                    if (i6 == -19 && c3 >= 65440) {
                        return false;
                    }
                    i3 += 3;
                    if (bArr[i7] > 65471) {
                        return false;
                    }
                }
            } else if (i5 >= i4 - 2) {
                i6 = a(bArr, i5, i4);
                if (i6 == 0) {
                }
            } else {
                int i8 = i3 + 2;
                int i9 = bArr[i5];
                if (i9 > -65) {
                    return false;
                }
                if ((((i9 + 112) + (i6 << 28)) >> 30) != 0) {
                    return false;
                }
                int i10 = i3 + 3;
                if (bArr[i8] > 65471) {
                    return false;
                }
                i3 += 4;
                if (bArr[i10] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
