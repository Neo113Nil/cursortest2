package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0309d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5943a = 0;

    static {
        if (AbstractC0303b1.f5937e && AbstractC0303b1.f5936d) {
            int i4 = AbstractC0326j0.f5958a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i4, int i5) {
        int i6 = i5 - i4;
        byte b4 = bArr[i4 - 1];
        if (i6 == 0) {
            if (b4 <= -12) {
                return b4;
            }
            return -1;
        }
        if (i6 == 1) {
            byte b5 = bArr[i4];
            if (b4 > -12 || b5 > -65) {
                return -1;
            }
            return (b5 << 8) ^ b4;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b6 = bArr[i4];
        byte b7 = bArr[i4 + 1];
        if (b4 > -12 || b6 > -65 || b7 > -65) {
            return -1;
        }
        return (b7 << 16) ^ ((b6 << 8) ^ b4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        char charAt;
        int length = str.length();
        int i9 = 0;
        while (true) {
            i6 = i4 + i5;
            if (i9 >= length || (i8 = i9 + i4) >= i6 || (charAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) charAt;
            i9++;
        }
        int i10 = i4 + i9;
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
                            throw new C0306c1(i9, length);
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
                    throw new C0306c1(i9 - 1, length);
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
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) < 65536) {
                                throw new C0306c1(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i4;
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
    public static boolean d(byte[] bArr, int i4, int i5) {
        while (i4 < i5 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i5) {
            return true;
        }
        while (i4 < i5) {
            int i6 = i4 + 1;
            int i7 = bArr[i4];
            if (i7 >= 0) {
                i4 = i6;
            } else if (i7 < -32) {
                if (i6 >= i5) {
                    return i7 == 0;
                }
                if (i7 < -62) {
                    return false;
                }
                i4 += 2;
                if (bArr[i6] > 65471) {
                    return false;
                }
            } else if (i7 < -16) {
                if (i6 >= i5 - 1) {
                    i7 = a(bArr, i6, i5);
                    if (i7 == 0) {
                    }
                } else {
                    int i8 = i4 + 2;
                    char c4 = bArr[i6];
                    if (c4 > 65471) {
                        return false;
                    }
                    if (i7 == -32 && c4 < 65440) {
                        return false;
                    }
                    if (i7 == -19 && c4 >= 65440) {
                        return false;
                    }
                    i4 += 3;
                    if (bArr[i8] > 65471) {
                        return false;
                    }
                }
            } else if (i6 >= i5 - 2) {
                i7 = a(bArr, i6, i5);
                if (i7 == 0) {
                }
            } else {
                int i9 = i4 + 2;
                int i10 = bArr[i6];
                if (i10 > -65) {
                    return false;
                }
                if ((((i10 + 112) + (i7 << 28)) >> 30) != 0) {
                    return false;
                }
                int i11 = i4 + 3;
                if (bArr[i9] > 65471) {
                    return false;
                }
                i4 += 4;
                if (bArr[i11] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
