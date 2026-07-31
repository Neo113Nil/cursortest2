package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i4 = zzdr.zza;
        }
        zza = new zzhl();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i4, int i5) {
        byte b4 = bArr[i4 - 1];
        int i6 = i5 - i4;
        if (i6 == 0) {
            if (b4 > -12) {
                return -1;
            }
            return b4;
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

    static String zzb(byte[] bArr, int i4, int i5) {
        int length = bArr.length;
        if ((i4 | i5 | ((length - i4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i6 = i4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i4 < i6) {
            byte b4 = bArr[i4];
            if (!zzhj.zzd(b4)) {
                break;
            }
            i4++;
            cArr[i7] = (char) b4;
            i7++;
        }
        int i8 = i7;
        while (i4 < i6) {
            int i9 = i4 + 1;
            byte b5 = bArr[i4];
            if (zzhj.zzd(b5)) {
                cArr[i8] = (char) b5;
                i8++;
                i4 = i9;
                while (i4 < i6) {
                    byte b6 = bArr[i4];
                    if (!zzhj.zzd(b6)) {
                        break;
                    }
                    i4++;
                    cArr[i8] = (char) b6;
                    i8++;
                }
            } else if (b5 < -32) {
                if (i9 >= i6) {
                    throw zzfa.zzb();
                }
                i4 += 2;
                zzhj.zzc(b5, bArr[i9], cArr, i8);
                i8++;
            } else if (b5 < -16) {
                if (i9 >= i6 - 1) {
                    throw zzfa.zzb();
                }
                int i10 = i4 + 2;
                i4 += 3;
                zzhj.zzb(b5, bArr[i9], bArr[i10], cArr, i8);
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw zzfa.zzb();
                }
                int i11 = i4 + 2;
                int i12 = i4 + 3;
                i4 += 4;
                zzhj.zza(b5, bArr[i9], bArr[i11], bArr[i12], cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zzd(byte[] bArr, int i4, int i5) {
        return zza.zzb(bArr, i4, i5);
    }
}
