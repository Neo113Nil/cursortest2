package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzdt {
    static int zza(byte[] bArr, int i8, zzds zzdsVar) {
        int zzj = zzj(bArr, i8, zzdsVar);
        int i9 = zzdsVar.zza;
        if (i9 < 0) {
            throw zzfa.zzc();
        }
        if (i9 > bArr.length - zzj) {
            throw zzfa.zzf();
        }
        if (i9 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return zzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, zzj, i9);
        return zzj + i9;
    }

    static int zzb(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    static int zzc(zzgh zzghVar, byte[] bArr, int i8, int i9, int i10, zzds zzdsVar) {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object zzd = zzfzVar.zzd();
        int zzb = zzfzVar.zzb(zzd, bArr, i8, i9, i10, zzdsVar);
        zzfzVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return zzb;
    }

    static int zzd(zzgh zzghVar, byte[] bArr, int i8, int i9, zzds zzdsVar) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = zzk(i11, bArr, i10, zzdsVar);
            i11 = zzdsVar.zza;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw zzfa.zzf();
        }
        Object zzd = zzghVar.zzd();
        int i13 = i11 + i12;
        zzghVar.zzg(zzd, bArr, i12, i13, zzdsVar);
        zzghVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return i13;
    }

    static int zze(zzgh zzghVar, int i8, byte[] bArr, int i9, int i10, zzey zzeyVar, zzds zzdsVar) {
        int zzd = zzd(zzghVar, bArr, i9, i10, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (zzd < i10) {
            int zzj = zzj(bArr, zzd, zzdsVar);
            if (i8 != zzdsVar.zza) {
                break;
            }
            zzd = zzd(zzghVar, bArr, zzj, i10, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i8, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i8, zzdsVar);
        int i9 = zzdsVar.zza + zzj;
        while (zzj < i9) {
            zzj = zzj(bArr, zzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (zzj == i9) {
            return zzj;
        }
        throw zzfa.zzf();
    }

    static int zzg(byte[] bArr, int i8, zzds zzdsVar) {
        int zzj = zzj(bArr, i8, zzdsVar);
        int i9 = zzdsVar.zza;
        if (i9 < 0) {
            throw zzfa.zzc();
        }
        if (i9 == 0) {
            zzdsVar.zzc = "";
            return zzj;
        }
        zzdsVar.zzc = new String(bArr, zzj, i9, zzez.zzb);
        return zzj + i9;
    }

    static int zzh(byte[] bArr, int i8, zzds zzdsVar) {
        int zzj = zzj(bArr, i8, zzdsVar);
        int i9 = zzdsVar.zza;
        if (i9 < 0) {
            throw zzfa.zzc();
        }
        if (i9 == 0) {
            zzdsVar.zzc = "";
            return zzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, zzj, i9);
        return zzj + i9;
    }

    static int zzi(int i8, byte[] bArr, int i9, int i10, zzgz zzgzVar, zzds zzdsVar) {
        if ((i8 >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int zzm = zzm(bArr, i9, zzdsVar);
            zzgzVar.zzf(i8, Long.valueOf(zzdsVar.zzb));
            return zzm;
        }
        if (i11 == 1) {
            zzgzVar.zzf(i8, Long.valueOf(zzn(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int zzj = zzj(bArr, i9, zzdsVar);
            int i12 = zzdsVar.zza;
            if (i12 < 0) {
                throw zzfa.zzc();
            }
            if (i12 > bArr.length - zzj) {
                throw zzfa.zzf();
            }
            if (i12 == 0) {
                zzgzVar.zzf(i8, zzee.zzb);
            } else {
                zzgzVar.zzf(i8, zzee.zzk(bArr, zzj, i12));
            }
            return zzj + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i8, Integer.valueOf(zzb(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        zzgz zzc = zzgz.zzc();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int zzj2 = zzj(bArr, i9, zzdsVar);
            int i15 = zzdsVar.zza;
            if (i15 == i13) {
                i14 = i15;
                i9 = zzj2;
                break;
            }
            i14 = i15;
            i9 = zzi(i15, bArr, zzj2, i10, zzc, zzdsVar);
        }
        if (i9 > i10 || i14 != i13) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i8, zzc);
        return i9;
    }

    static int zzj(byte[] bArr, int i8, zzds zzdsVar) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return zzk(b8, bArr, i9, zzdsVar);
        }
        zzdsVar.zza = b8;
        return i9;
    }

    static int zzk(int i8, byte[] bArr, int i9, zzds zzdsVar) {
        int i10 = i8 & 127;
        int i11 = i9 + 1;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzdsVar.zza = i10 | (b8 << 7);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            zzdsVar.zza = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            zzdsVar.zza = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            zzdsVar.zza = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                zzdsVar.zza = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int zzl(int i8, byte[] bArr, int i9, int i10, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i9, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (zzj < i10) {
            int zzj2 = zzj(bArr, zzj, zzdsVar);
            if (i8 != zzdsVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i8, zzds zzdsVar) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 >= 0) {
            zzdsVar.zzb = j8;
            return i9;
        }
        int i10 = i8 + 2;
        byte b8 = bArr[i9];
        long j9 = (j8 & 127) | ((b8 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b8 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j9 |= (r10 & Byte.MAX_VALUE) << i11;
            b8 = bArr[i10];
            i10 = i12;
        }
        zzdsVar.zzb = j9;
        return i10;
    }

    static long zzn(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }
}
