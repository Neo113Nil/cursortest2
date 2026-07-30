package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzjo {
    static int zza(byte[] bArr, int i8, zzjn zzjnVar) {
        int zzj = zzj(bArr, i8, zzjnVar);
        int i9 = zzjnVar.zza;
        if (i9 < 0) {
            throw zzll.zzd();
        }
        if (i9 > bArr.length - zzj) {
            throw zzll.zzf();
        }
        if (i9 == 0) {
            zzjnVar.zzc = zzka.zzb;
            return zzj;
        }
        zzjnVar.zzc = zzka.zzl(bArr, zzj, i9);
        return zzj + i9;
    }

    static int zzb(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    static int zzc(zzmt zzmtVar, byte[] bArr, int i8, int i9, int i10, zzjn zzjnVar) {
        Object zze = zzmtVar.zze();
        int zzn = zzn(zze, zzmtVar, bArr, i8, i9, i10, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzn;
    }

    static int zzd(zzmt zzmtVar, byte[] bArr, int i8, int i9, zzjn zzjnVar) {
        Object zze = zzmtVar.zze();
        int zzo = zzo(zze, zzmtVar, bArr, i8, i9, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzo;
    }

    static int zze(zzmt zzmtVar, int i8, byte[] bArr, int i9, int i10, zzli zzliVar, zzjn zzjnVar) {
        int zzd = zzd(zzmtVar, bArr, i9, i10, zzjnVar);
        zzliVar.add(zzjnVar.zzc);
        while (zzd < i10) {
            int zzj = zzj(bArr, zzd, zzjnVar);
            if (i8 != zzjnVar.zza) {
                break;
            }
            zzd = zzd(zzmtVar, bArr, zzj, i10, zzjnVar);
            zzliVar.add(zzjnVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i8, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i8, zzjnVar);
        int i9 = zzjnVar.zza + zzj;
        while (zzj < i9) {
            zzj = zzj(bArr, zzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (zzj == i9) {
            return zzj;
        }
        throw zzll.zzf();
    }

    static int zzg(byte[] bArr, int i8, zzjn zzjnVar) {
        int zzj = zzj(bArr, i8, zzjnVar);
        int i9 = zzjnVar.zza;
        if (i9 < 0) {
            throw zzll.zzd();
        }
        if (i9 == 0) {
            zzjnVar.zzc = "";
            return zzj;
        }
        zzjnVar.zzc = new String(bArr, zzj, i9, zzlj.zzb);
        return zzj + i9;
    }

    static int zzh(byte[] bArr, int i8, zzjn zzjnVar) {
        int zzj = zzj(bArr, i8, zzjnVar);
        int i9 = zzjnVar.zza;
        if (i9 < 0) {
            throw zzll.zzd();
        }
        if (i9 == 0) {
            zzjnVar.zzc = "";
            return zzj;
        }
        int i10 = zznz.zza;
        int length = bArr.length;
        if ((((length - zzj) - i9) | zzj | i9) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i9)));
        }
        int i11 = zzj + i9;
        char[] cArr = new char[i9];
        int i12 = 0;
        while (zzj < i11) {
            byte b8 = bArr[zzj];
            if (!zznv.zzd(b8)) {
                break;
            }
            zzj++;
            cArr[i12] = (char) b8;
            i12++;
        }
        while (zzj < i11) {
            int i13 = zzj + 1;
            byte b9 = bArr[zzj];
            if (zznv.zzd(b9)) {
                cArr[i12] = (char) b9;
                i12++;
                zzj = i13;
                while (zzj < i11) {
                    byte b10 = bArr[zzj];
                    if (zznv.zzd(b10)) {
                        zzj++;
                        cArr[i12] = (char) b10;
                        i12++;
                    }
                }
            } else if (b9 < -32) {
                if (i13 >= i11) {
                    throw zzll.zzc();
                }
                zzj += 2;
                zznv.zzc(b9, bArr[i13], cArr, i12);
                i12++;
            } else if (b9 < -16) {
                if (i13 >= i11 - 1) {
                    throw zzll.zzc();
                }
                int i14 = zzj + 2;
                zzj += 3;
                zznv.zzb(b9, bArr[i13], bArr[i14], cArr, i12);
                i12++;
            } else {
                if (i13 >= i11 - 2) {
                    throw zzll.zzc();
                }
                byte b11 = bArr[i13];
                int i15 = zzj + 3;
                byte b12 = bArr[zzj + 2];
                zzj += 4;
                zznv.zza(b9, b11, b12, bArr[i15], cArr, i12);
                i12 += 2;
            }
        }
        zzjnVar.zzc = new String(cArr, 0, i12);
        return i11;
    }

    static int zzi(int i8, byte[] bArr, int i9, int i10, zznl zznlVar, zzjn zzjnVar) {
        if ((i8 >>> 3) == 0) {
            throw zzll.zzb();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int zzm = zzm(bArr, i9, zzjnVar);
            zznlVar.zzj(i8, Long.valueOf(zzjnVar.zzb));
            return zzm;
        }
        if (i11 == 1) {
            zznlVar.zzj(i8, Long.valueOf(zzp(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int zzj = zzj(bArr, i9, zzjnVar);
            int i12 = zzjnVar.zza;
            if (i12 < 0) {
                throw zzll.zzd();
            }
            if (i12 > bArr.length - zzj) {
                throw zzll.zzf();
            }
            if (i12 == 0) {
                zznlVar.zzj(i8, zzka.zzb);
            } else {
                zznlVar.zzj(i8, zzka.zzl(bArr, zzj, i12));
            }
            return zzj + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw zzll.zzb();
            }
            zznlVar.zzj(i8, Integer.valueOf(zzb(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        zznl zzf = zznl.zzf();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int zzj2 = zzj(bArr, i9, zzjnVar);
            int i15 = zzjnVar.zza;
            i14 = i15;
            if (i15 == i13) {
                i9 = zzj2;
                break;
            }
            int zzi = zzi(i14, bArr, zzj2, i10, zzf, zzjnVar);
            i14 = i15;
            i9 = zzi;
        }
        if (i9 > i10 || i14 != i13) {
            throw zzll.zze();
        }
        zznlVar.zzj(i8, zzf);
        return i9;
    }

    static int zzj(byte[] bArr, int i8, zzjn zzjnVar) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return zzk(b8, bArr, i9, zzjnVar);
        }
        zzjnVar.zza = b8;
        return i9;
    }

    static int zzk(int i8, byte[] bArr, int i9, zzjn zzjnVar) {
        byte b8 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i8 & 127;
        if (b8 >= 0) {
            zzjnVar.zza = i11 | (b8 << 7);
            return i10;
        }
        int i12 = i11 | ((b8 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            zzjnVar.zza = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            zzjnVar.zza = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            zzjnVar.zza = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                zzjnVar.zza = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int zzl(int i8, byte[] bArr, int i9, int i10, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i9, zzjnVar);
        zzlcVar.zzh(zzjnVar.zza);
        while (zzj < i10) {
            int zzj2 = zzj(bArr, zzj, zzjnVar);
            if (i8 != zzjnVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i8, zzjn zzjnVar) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            zzjnVar.zzb = j8;
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
        zzjnVar.zzb = j9;
        return i10;
    }

    static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i8, int i9, int i10, zzjn zzjnVar) {
        int zzc = ((zzml) zzmtVar).zzc(obj, bArr, i8, i9, i10, zzjnVar);
        zzjnVar.zzc = obj;
        return zzc;
    }

    static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i8, int i9, zzjn zzjnVar) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = zzk(i11, bArr, i10, zzjnVar);
            i11 = zzjnVar.zza;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw zzll.zzf();
        }
        int i13 = i11 + i12;
        zzmtVar.zzh(obj, bArr, i12, i13, zzjnVar);
        zzjnVar.zzc = obj;
        return i13;
    }

    static long zzp(byte[] bArr, int i8) {
        return (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48) | ((bArr[i8 + 7] & 255) << 56);
    }
}
