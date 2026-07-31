package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzdt {
    static int zza(byte[] bArr, int i4, zzds zzdsVar) {
        int zzj = zzj(bArr, i4, zzdsVar);
        int i5 = zzdsVar.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        }
        if (i5 > bArr.length - zzj) {
            throw zzfa.zzf();
        }
        if (i5 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return zzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, zzj, i5);
        return zzj + i5;
    }

    static int zzb(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    static int zzc(zzgh zzghVar, byte[] bArr, int i4, int i5, int i6, zzds zzdsVar) {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object zzd = zzfzVar.zzd();
        int zzb = zzfzVar.zzb(zzd, bArr, i4, i5, i6, zzdsVar);
        zzfzVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return zzb;
    }

    static int zzd(zzgh zzghVar, byte[] bArr, int i4, int i5, zzds zzdsVar) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zzk(i7, bArr, i6, zzdsVar);
            i7 = zzdsVar.zza;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw zzfa.zzf();
        }
        Object zzd = zzghVar.zzd();
        int i9 = i8 + i7;
        zzghVar.zzg(zzd, bArr, i8, i9, zzdsVar);
        zzghVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return i9;
    }

    static int zze(zzgh zzghVar, int i4, byte[] bArr, int i5, int i6, zzey zzeyVar, zzds zzdsVar) {
        int zzd = zzd(zzghVar, bArr, i5, i6, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (zzd < i6) {
            int zzj = zzj(bArr, zzd, zzdsVar);
            if (i4 != zzdsVar.zza) {
                break;
            }
            zzd = zzd(zzghVar, bArr, zzj, i6, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i4, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i4, zzdsVar);
        int i5 = zzdsVar.zza + zzj;
        while (zzj < i5) {
            zzj = zzj(bArr, zzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (zzj == i5) {
            return zzj;
        }
        throw zzfa.zzf();
    }

    static int zzg(byte[] bArr, int i4, zzds zzdsVar) {
        int zzj = zzj(bArr, i4, zzdsVar);
        int i5 = zzdsVar.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        }
        if (i5 == 0) {
            zzdsVar.zzc = "";
            return zzj;
        }
        zzdsVar.zzc = new String(bArr, zzj, i5, zzez.zzb);
        return zzj + i5;
    }

    static int zzh(byte[] bArr, int i4, zzds zzdsVar) {
        int zzj = zzj(bArr, i4, zzdsVar);
        int i5 = zzdsVar.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        }
        if (i5 == 0) {
            zzdsVar.zzc = "";
            return zzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, zzj, i5);
        return zzj + i5;
    }

    static int zzi(int i4, byte[] bArr, int i5, int i6, zzgz zzgzVar, zzds zzdsVar) {
        if ((i4 >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int zzm = zzm(bArr, i5, zzdsVar);
            zzgzVar.zzf(i4, Long.valueOf(zzdsVar.zzb));
            return zzm;
        }
        if (i7 == 1) {
            zzgzVar.zzf(i4, Long.valueOf(zzn(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int zzj = zzj(bArr, i5, zzdsVar);
            int i8 = zzdsVar.zza;
            if (i8 < 0) {
                throw zzfa.zzc();
            }
            if (i8 > bArr.length - zzj) {
                throw zzfa.zzf();
            }
            if (i8 == 0) {
                zzgzVar.zzf(i4, zzee.zzb);
            } else {
                zzgzVar.zzf(i4, zzee.zzk(bArr, zzj, i8));
            }
            return zzj + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i4, Integer.valueOf(zzb(bArr, i5)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        zzgz zzc = zzgz.zzc();
        int i10 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int zzj2 = zzj(bArr, i5, zzdsVar);
            i10 = zzdsVar.zza;
            if (i10 == i9) {
                i5 = zzj2;
                break;
            }
            i5 = zzi(i10, bArr, zzj2, i6, zzc, zzdsVar);
        }
        if (i5 > i6 || i10 != i9) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i4, zzc);
        return i5;
    }

    static int zzj(byte[] bArr, int i4, zzds zzdsVar) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return zzk(b4, bArr, i5, zzdsVar);
        }
        zzdsVar.zza = b4;
        return i5;
    }

    static int zzk(int i4, byte[] bArr, int i5, zzds zzdsVar) {
        int i6 = i4 & 127;
        int i7 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zzdsVar.zza = i6 | (b4 << 7);
            return i7;
        }
        int i8 = i6 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            zzdsVar.zza = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            zzdsVar.zza = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzdsVar.zza = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzdsVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzl(int i4, byte[] bArr, int i5, int i6, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i5, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (zzj < i6) {
            int zzj2 = zzj(bArr, zzj, zzdsVar);
            if (i4 != zzdsVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i4, zzds zzdsVar) {
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        if (j4 >= 0) {
            zzdsVar.zzb = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        zzdsVar.zzb = j5;
        return i6;
    }

    static long zzn(byte[] bArr, int i4) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }
}
