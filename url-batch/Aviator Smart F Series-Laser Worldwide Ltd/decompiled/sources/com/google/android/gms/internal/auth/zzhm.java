package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i8 = zzdr.zza;
        }
        zza = new zzhl();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i8, int i9) {
        byte b8 = bArr[i8 - 1];
        int i10 = i9 - i8;
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

    static String zzb(byte[] bArr, int i8, int i9) {
        int length = bArr.length;
        if ((i8 | i9 | ((length - i8) - i9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i10 = i8 + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            if (!zzhj.zzd(b8)) {
                break;
            }
            i8++;
            cArr[i11] = (char) b8;
            i11++;
        }
        while (i8 < i10) {
            int i12 = i8 + 1;
            byte b9 = bArr[i8];
            if (zzhj.zzd(b9)) {
                cArr[i11] = (char) b9;
                i11++;
                i8 = i12;
                while (i8 < i10) {
                    byte b10 = bArr[i8];
                    if (!zzhj.zzd(b10)) {
                        break;
                    }
                    i8++;
                    cArr[i11] = (char) b10;
                    i11++;
                }
            } else if (b9 < -32) {
                if (i12 >= i10) {
                    throw zzfa.zzb();
                }
                i8 += 2;
                zzhj.zzc(b9, bArr[i12], cArr, i11);
                i11++;
            } else if (b9 < -16) {
                if (i12 >= i10 - 1) {
                    throw zzfa.zzb();
                }
                int i13 = i8 + 2;
                i8 += 3;
                zzhj.zzb(b9, bArr[i12], bArr[i13], cArr, i11);
                i11++;
            } else {
                if (i12 >= i10 - 2) {
                    throw zzfa.zzb();
                }
                int i14 = i8 + 2;
                int i15 = i8 + 3;
                i8 += 4;
                zzhj.zza(b9, bArr[i12], bArr[i14], bArr[i15], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zzd(byte[] bArr, int i8, int i9) {
        return zza.zzb(bArr, i8, i9);
    }
}
