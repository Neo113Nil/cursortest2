package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
final class zzais {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i4) {
        return Double.longBitsToDouble(zzd(bArr, i4));
    }

    static float zzb(byte[] bArr, int i4) {
        return Float.intBitsToFloat(zzc(bArr, i4));
    }

    static int zzc(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    static int zzd(byte[] bArr, int i4, zzaiv zzaivVar) {
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        if (j4 >= 0) {
            zzaivVar.zzb = j4;
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
        zzaivVar.zzb = j5;
        return i6;
    }

    static int zza(byte[] bArr, int i4, zzaiv zzaivVar) {
        int zzc = zzc(bArr, i4, zzaivVar);
        int i5 = zzaivVar.zza;
        if (i5 < 0) {
            throw zzakm.zzf();
        }
        if (i5 > bArr.length - zzc) {
            throw zzakm.zzj();
        }
        if (i5 == 0) {
            zzaivVar.zzc = zzaiw.zza;
            return zzc;
        }
        zzaivVar.zzc = zzaiw.zza(bArr, zzc, i5);
        return zzc + i5;
    }

    static int zzb(zzamc<?> zzamcVar, int i4, byte[] bArr, int i5, int i6, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        int zza2 = zza(zzamcVar, bArr, i5, i6, zzaivVar);
        zzaknVar.add(zzaivVar.zzc);
        while (zza2 < i6) {
            int zzc = zzc(bArr, zza2, zzaivVar);
            if (i4 != zzaivVar.zza) {
                break;
            }
            zza2 = zza(zzamcVar, bArr, zzc, i6, zzaivVar);
            zzaknVar.add(zzaivVar.zzc);
        }
        return zza2;
    }

    static int zzc(byte[] bArr, int i4, zzaiv zzaivVar) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return zza(b4, bArr, i5, zzaivVar);
        }
        zzaivVar.zza = b4;
        return i5;
    }

    static long zzd(byte[] bArr, int i4) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    static int zzb(byte[] bArr, int i4, zzaiv zzaivVar) {
        int zzc = zzc(bArr, i4, zzaivVar);
        int i5 = zzaivVar.zza;
        if (i5 < 0) {
            throw zzakm.zzf();
        }
        if (i5 == 0) {
            zzaivVar.zzc = "";
            return zzc;
        }
        zzaivVar.zzc = zzanb.zzb(bArr, zzc, i5);
        return zzc + i5;
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, Object obj, zzaln zzalnVar, zzamv<zzamy, zzamy> zzamvVar, zzaiv zzaivVar) {
        if (zzaivVar.zzd.zza(zzalnVar, i4 >>> 3) == null) {
            return zza(i4, bArr, i5, i6, zzalr.zzc(obj), zzaivVar);
        }
        zzakg.zzd zzdVar = (zzakg.zzd) obj;
        zzdVar.zza();
        zzajy<zzakg.zzc> zzajyVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzamc<T> zzamcVar, byte[] bArr, int i4, int i5, int i6, zzaiv zzaivVar) {
        T zza2 = zzamcVar.zza();
        int zza3 = zza(zza2, zzamcVar, bArr, i4, i5, i6, zzaivVar);
        zzamcVar.zzd(zza2);
        zzaivVar.zzc = zza2;
        return zza3;
    }

    static int zza(zzamc<?> zzamcVar, int i4, byte[] bArr, int i5, int i6, zzakn<Object> zzaknVar, zzaiv zzaivVar) {
        int i7 = (i4 & (-8)) | 4;
        int zza2 = zza(zzamcVar, bArr, i5, i6, i7, zzaivVar);
        zzaknVar.add(zzaivVar.zzc);
        while (zza2 < i6) {
            int zzc = zzc(bArr, zza2, zzaivVar);
            if (i4 != zzaivVar.zza) {
                break;
            }
            zza2 = zza(zzamcVar, bArr, zzc, i6, i7, zzaivVar);
            zzaknVar.add(zzaivVar.zzc);
        }
        return zza2;
    }

    static <T> int zza(zzamc<T> zzamcVar, byte[] bArr, int i4, int i5, zzaiv zzaivVar) {
        T zza2 = zzamcVar.zza();
        int zza3 = zza(zza2, zzamcVar, bArr, i4, i5, zzaivVar);
        zzamcVar.zzd(zza2);
        zzaivVar.zzc = zza2;
        return zza3;
    }

    static int zza(byte[] bArr, int i4, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        zzakj zzakjVar = (zzakj) zzaknVar;
        int zzc = zzc(bArr, i4, zzaivVar);
        int i5 = zzaivVar.zza + zzc;
        while (zzc < i5) {
            zzc = zzc(bArr, zzc, zzaivVar);
            zzakjVar.zzc(zzaivVar.zza);
        }
        if (zzc == i5) {
            return zzc;
        }
        throw zzakm.zzj();
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, zzamy zzamyVar, zzaiv zzaivVar) {
        if ((i4 >>> 3) == 0) {
            throw zzakm.zzc();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int zzd = zzd(bArr, i5, zzaivVar);
            zzamyVar.zza(i4, Long.valueOf(zzaivVar.zzb));
            return zzd;
        }
        if (i7 == 1) {
            zzamyVar.zza(i4, Long.valueOf(zzd(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int zzc = zzc(bArr, i5, zzaivVar);
            int i8 = zzaivVar.zza;
            if (i8 >= 0) {
                if (i8 > bArr.length - zzc) {
                    throw zzakm.zzj();
                }
                if (i8 == 0) {
                    zzamyVar.zza(i4, zzaiw.zza);
                } else {
                    zzamyVar.zza(i4, zzaiw.zza(bArr, zzc, i8));
                }
                return zzc + i8;
            }
            throw zzakm.zzf();
        }
        if (i7 != 3) {
            if (i7 == 5) {
                zzamyVar.zza(i4, Integer.valueOf(zzc(bArr, i5)));
                return i5 + 4;
            }
            throw zzakm.zzc();
        }
        zzamy zzd2 = zzamy.zzd();
        int i9 = (i4 & (-8)) | 4;
        int i10 = zzaivVar.zze + 1;
        zzaivVar.zze = i10;
        zza(i10);
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int zzc2 = zzc(bArr, i5, zzaivVar);
            i11 = zzaivVar.zza;
            if (i11 == i9) {
                i5 = zzc2;
                break;
            }
            i5 = zza(i11, bArr, zzc2, i6, zzd2, zzaivVar);
        }
        zzaivVar.zze--;
        if (i5 <= i6 && i11 == i9) {
            zzamyVar.zza(i4, zzd2);
            return i5;
        }
        throw zzakm.zzg();
    }

    static int zza(int i4, byte[] bArr, int i5, zzaiv zzaivVar) {
        int i6 = i4 & 127;
        int i7 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zzaivVar.zza = i6 | (b4 << 7);
            return i7;
        }
        int i8 = i6 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            zzaivVar.zza = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            zzaivVar.zza = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzaivVar.zza = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzaivVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        zzakj zzakjVar = (zzakj) zzaknVar;
        int zzc = zzc(bArr, i5, zzaivVar);
        zzakjVar.zzc(zzaivVar.zza);
        while (zzc < i6) {
            int zzc2 = zzc(bArr, zzc, zzaivVar);
            if (i4 != zzaivVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzaivVar);
            zzakjVar.zzc(zzaivVar.zza);
        }
        return zzc;
    }

    static <T> int zza(Object obj, zzamc<T> zzamcVar, byte[] bArr, int i4, int i5, int i6, zzaiv zzaivVar) {
        int i7 = zzaivVar.zze + 1;
        zzaivVar.zze = i7;
        zza(i7);
        int zza2 = ((zzalr) zzamcVar).zza((zzalr) obj, bArr, i4, i5, i6, zzaivVar);
        zzaivVar.zze--;
        zzaivVar.zzc = obj;
        return zza2;
    }

    static <T> int zza(Object obj, zzamc<T> zzamcVar, byte[] bArr, int i4, int i5, zzaiv zzaivVar) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zza(i7, bArr, i6, zzaivVar);
            i7 = zzaivVar.zza;
        }
        int i8 = i6;
        if (i7 >= 0 && i7 <= i5 - i8) {
            int i9 = zzaivVar.zze + 1;
            zzaivVar.zze = i9;
            zza(i9);
            int i10 = i8 + i7;
            zzamcVar.zza(obj, bArr, i8, i10, zzaivVar);
            zzaivVar.zze--;
            zzaivVar.zzc = obj;
            return i10;
        }
        throw zzakm.zzj();
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, zzaiv zzaivVar) {
        if ((i4 >>> 3) == 0) {
            throw zzakm.zzc();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            return zzd(bArr, i5, zzaivVar);
        }
        if (i7 == 1) {
            return i5 + 8;
        }
        if (i7 == 2) {
            return zzc(bArr, i5, zzaivVar) + zzaivVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i5 + 4;
            }
            throw zzakm.zzc();
        }
        int i8 = (i4 & (-8)) | 4;
        int i9 = 0;
        while (i5 < i6) {
            i5 = zzc(bArr, i5, zzaivVar);
            i9 = zzaivVar.zza;
            if (i9 == i8) {
                break;
            }
            i5 = zza(i9, bArr, i5, i6, zzaivVar);
        }
        if (i5 > i6 || i9 != i8) {
            throw zzakm.zzg();
        }
        return i5;
    }

    private static void zza(int i4) {
        if (i4 >= zza) {
            throw zzakm.zzh();
        }
    }
}
