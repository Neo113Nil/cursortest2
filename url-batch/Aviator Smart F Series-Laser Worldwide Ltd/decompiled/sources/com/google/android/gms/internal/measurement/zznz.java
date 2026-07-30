package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zznw zzb;

    static {
        if (zznu.zzx() && zznu.zzy()) {
            int i8 = zzjm.zza;
        }
        zzb = new zznx();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte b8 = bArr[i8 - 1];
        if (i10 != 0) {
            if (i10 == 1) {
                byte b9 = bArr[i8];
                if (b8 <= -12 && b9 <= -65) {
                    return b8 ^ (b9 << 8);
                }
            } else {
                if (i10 != 2) {
                    throw new AssertionError();
                }
                byte b10 = bArr[i8];
                byte b11 = bArr[i8 + 1];
                if (b8 <= -12 && b10 <= -65 && b11 <= -65) {
                    return ((b10 << 8) ^ b8) ^ (b11 << 16);
                }
            }
        } else if (b8 <= -12) {
            return b8;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ff, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzb(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        char charAt;
        int length = charSequence.length();
        int i13 = 0;
        while (true) {
            i10 = i8 + i9;
            if (i13 >= length || (i12 = i13 + i8) >= i10 || (charAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            bArr[i12] = (byte) charAt;
            i13++;
        }
        int i14 = i8 + i13;
        while (i13 < length) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 < 128 && i14 < i10) {
                bArr[i14] = (byte) charAt2;
                i14++;
            } else if (charAt2 < 2048 && i14 <= i10 - 2) {
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                i14 += 2;
                bArr[i15] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i14 > i10 - 3) {
                    if (i14 > i10 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i11 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                            throw new zzny(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i14);
                    }
                    int i16 = i13 + 1;
                    if (i16 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i16);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i17 = i14 + 3;
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i13 = i16;
                        } else {
                            i13 = i16;
                        }
                    }
                    throw new zzny(i13 - 1, length);
                }
                bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                int i18 = i14 + 2;
                bArr[i14 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i14 += 3;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            }
            i13++;
        }
        return i14;
    }

    static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i9++;
            } else {
                int length2 = charSequence.length();
                while (i9 < length2) {
                    char charAt2 = charSequence.charAt(i9);
                    if (charAt2 < 2048) {
                        i8 += (127 - charAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) < 65536) {
                                throw new zzny(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i8;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    static boolean zzd(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    static boolean zze(byte[] bArr, int i8, int i9) {
        return zzb.zzb(bArr, i8, i9);
    }
}
