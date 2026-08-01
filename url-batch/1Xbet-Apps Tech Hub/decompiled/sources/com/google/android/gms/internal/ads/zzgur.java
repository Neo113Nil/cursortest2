package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgur {
    static int zza(byte[] bArr, int i, zzguq zzguqVar) throws zzgwy {
        int zzh = zzh(bArr, i, zzguqVar);
        int i2 = zzguqVar.zza;
        if (i2 < 0) {
            throw zzgwy.zzf();
        }
        if (i2 > bArr.length - zzh) {
            throw zzgwy.zzj();
        }
        if (i2 == 0) {
            zzguqVar.zzc = zzgve.zzb;
            return zzh;
        }
        zzguqVar.zzc = zzgve.zzv(bArr, zzh, i2);
        return zzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzgyp zzgypVar, byte[] bArr, int i, int i2, int i3, zzguq zzguqVar) throws IOException {
        Object zze = zzgypVar.zze();
        int zzl = zzl(zze, zzgypVar, bArr, i, i2, i3, zzguqVar);
        zzgypVar.zzf(zze);
        zzguqVar.zzc = zze;
        return zzl;
    }

    static int zzd(zzgyp zzgypVar, byte[] bArr, int i, int i2, zzguq zzguqVar) throws IOException {
        Object zze = zzgypVar.zze();
        int zzm = zzm(zze, zzgypVar, bArr, i, i2, zzguqVar);
        zzgypVar.zzf(zze);
        zzguqVar.zzc = zze;
        return zzm;
    }

    static int zze(zzgyp zzgypVar, int i, byte[] bArr, int i2, int i3, zzgwv zzgwvVar, zzguq zzguqVar) throws IOException {
        int zzd = zzd(zzgypVar, bArr, i2, i3, zzguqVar);
        zzgwvVar.add(zzguqVar.zzc);
        while (zzd < i3) {
            int zzh = zzh(bArr, zzd, zzguqVar);
            if (i != zzguqVar.zza) {
                break;
            }
            zzd = zzd(zzgypVar, bArr, zzh, i3, zzguqVar);
            zzgwvVar.add(zzguqVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzgwv zzgwvVar, zzguq zzguqVar) throws IOException {
        zzgwn zzgwnVar = (zzgwn) zzgwvVar;
        int zzh = zzh(bArr, i, zzguqVar);
        int i2 = zzguqVar.zza + zzh;
        while (zzh < i2) {
            zzh = zzh(bArr, zzh, zzguqVar);
            zzgwnVar.zzh(zzguqVar.zza);
        }
        if (zzh == i2) {
            return zzh;
        }
        throw zzgwy.zzj();
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, zzgzh zzgzhVar, zzguq zzguqVar) throws zzgwy {
        if ((i >>> 3) == 0) {
            throw zzgwy.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzk = zzk(bArr, i2, zzguqVar);
            zzgzhVar.zzj(i, Long.valueOf(zzguqVar.zzb));
            return zzk;
        }
        if (i4 == 1) {
            zzgzhVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzh = zzh(bArr, i2, zzguqVar);
            int i5 = zzguqVar.zza;
            if (i5 < 0) {
                throw zzgwy.zzf();
            }
            if (i5 > bArr.length - zzh) {
                throw zzgwy.zzj();
            }
            if (i5 == 0) {
                zzgzhVar.zzj(i, zzgve.zzb);
            } else {
                zzgzhVar.zzj(i, zzgve.zzv(bArr, zzh, i5));
            }
            return zzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzgwy.zzc();
            }
            zzgzhVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzgzh zzf = zzgzh.zzf();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzh2 = zzh(bArr, i2, zzguqVar);
            int i8 = zzguqVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = zzh2;
                break;
            }
            int zzg = zzg(i7, bArr, zzh2, i3, zzf, zzguqVar);
            i7 = i8;
            i2 = zzg;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzgwy.zzg();
        }
        zzgzhVar.zzj(i, zzf);
        return i2;
    }

    static int zzh(byte[] bArr, int i, zzguq zzguqVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzguqVar);
        }
        zzguqVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, zzguq zzguqVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzguqVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzguqVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzguqVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzguqVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzguqVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, zzgwv zzgwvVar, zzguq zzguqVar) {
        zzgwn zzgwnVar = (zzgwn) zzgwvVar;
        int zzh = zzh(bArr, i2, zzguqVar);
        zzgwnVar.zzh(zzguqVar.zza);
        while (zzh < i3) {
            int zzh2 = zzh(bArr, zzh, zzguqVar);
            if (i != zzguqVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzguqVar);
            zzgwnVar.zzh(zzguqVar.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i, zzguq zzguqVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzguqVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            i3 = i5;
            b = b2;
        }
        zzguqVar.zzb = j2;
        return i3;
    }

    static int zzl(Object obj, zzgyp zzgypVar, byte[] bArr, int i, int i2, int i3, zzguq zzguqVar) throws IOException {
        int zzc = ((zzgxz) zzgypVar).zzc(obj, bArr, i, i2, i3, zzguqVar);
        zzguqVar.zzc = obj;
        return zzc;
    }

    static int zzm(Object obj, zzgyp zzgypVar, byte[] bArr, int i, int i2, zzguq zzguqVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzi(i4, bArr, i3, zzguqVar);
            i4 = zzguqVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzgwy.zzj();
        }
        int i6 = i4 + i5;
        zzgypVar.zzi(obj, bArr, i5, i6, zzguqVar);
        zzguqVar.zzc = obj;
        return i6;
    }

    static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
