package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes3.dex */
final class zzhw {
    static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    static int zza(byte[] bArr, int i, zzhv zzhvVar) throws zzjs {
        int zzc = zzc(bArr, i, zzhvVar);
        int i2 = zzhvVar.zza;
        if (i2 < 0) {
            throw zzjs.zzf();
        }
        if (i2 > bArr.length - zzc) {
            throw zzjs.zzh();
        }
        if (i2 == 0) {
            zzhvVar.zzc = zzia.zza;
            return zzc;
        }
        zzhvVar.zzc = zzia.zza(bArr, zzc, i2);
        return zzc + i2;
    }

    static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int zza(zzll zzllVar, byte[] bArr, int i, int i2, int i3, zzhv zzhvVar) throws IOException {
        Object zza = zzllVar.zza();
        int zza2 = zza(zza, zzllVar, bArr, i, i2, i3, zzhvVar);
        zzllVar.zzc(zza);
        zzhvVar.zzc = zza;
        return zza2;
    }

    static int zza(zzll zzllVar, byte[] bArr, int i, int i2, zzhv zzhvVar) throws IOException {
        Object zza = zzllVar.zza();
        int zza2 = zza(zza, zzllVar, bArr, i, i2, zzhvVar);
        zzllVar.zzc(zza);
        zzhvVar.zzc = zza;
        return zza2;
    }

    static int zza(zzll<?> zzllVar, int i, byte[] bArr, int i2, int i3, zzjt<?> zzjtVar, zzhv zzhvVar) throws IOException {
        int zza = zza(zzllVar, bArr, i2, i3, zzhvVar);
        zzjtVar.add(zzhvVar.zzc);
        while (zza < i3) {
            int zzc = zzc(bArr, zza, zzhvVar);
            if (i != zzhvVar.zza) {
                break;
            }
            zza = zza(zzllVar, bArr, zzc, i3, zzhvVar);
            zzjtVar.add(zzhvVar.zzc);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzjt<?> zzjtVar, zzhv zzhvVar) throws IOException {
        zzjn zzjnVar = (zzjn) zzjtVar;
        int zzc = zzc(bArr, i, zzhvVar);
        int i2 = zzhvVar.zza + zzc;
        while (zzc < i2) {
            zzc = zzc(bArr, zzc, zzhvVar);
            zzjnVar.zzd(zzhvVar.zza);
        }
        if (zzc == i2) {
            return zzc;
        }
        throw zzjs.zzh();
    }

    static int zzb(byte[] bArr, int i, zzhv zzhvVar) throws zzjs {
        int zzc = zzc(bArr, i, zzhvVar);
        int i2 = zzhvVar.zza;
        if (i2 < 0) {
            throw zzjs.zzf();
        }
        if (i2 == 0) {
            zzhvVar.zzc = "";
            return zzc;
        }
        zzhvVar.zzc = zzmk.zzb(bArr, zzc, i2);
        return zzc + i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzme zzmeVar, zzhv zzhvVar) throws zzjs {
        if ((i >>> 3) == 0) {
            throw zzjs.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzd = zzd(bArr, i2, zzhvVar);
            zzmeVar.zza(i, Long.valueOf(zzhvVar.zzb));
            return zzd;
        }
        if (i4 == 1) {
            zzmeVar.zza(i, Long.valueOf(zzd(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzc = zzc(bArr, i2, zzhvVar);
            int i5 = zzhvVar.zza;
            if (i5 < 0) {
                throw zzjs.zzf();
            }
            if (i5 > bArr.length - zzc) {
                throw zzjs.zzh();
            }
            if (i5 == 0) {
                zzmeVar.zza(i, zzia.zza);
            } else {
                zzmeVar.zza(i, zzia.zza(bArr, zzc, i5));
            }
            return zzc + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzmeVar.zza(i, Integer.valueOf(zzc(bArr, i2)));
                return i2 + 4;
            }
            throw zzjs.zzc();
        }
        zzme zzd2 = zzme.zzd();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzc2 = zzc(bArr, i2, zzhvVar);
            i7 = zzhvVar.zza;
            if (i7 == i6) {
                i2 = zzc2;
                break;
            }
            i2 = zza(i7, bArr, zzc2, i3, zzd2, zzhvVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzjs.zzg();
        }
        zzmeVar.zza(i, zzd2);
        return i2;
    }

    static int zzc(byte[] bArr, int i, zzhv zzhvVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzhvVar.zza = b;
            return i2;
        }
        return zza(b, bArr, i2, zzhvVar);
    }

    static int zza(int i, byte[] bArr, int i2, zzhv zzhvVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzhvVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzhvVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzhvVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzhvVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzhvVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzjt<?> zzjtVar, zzhv zzhvVar) {
        zzjn zzjnVar = (zzjn) zzjtVar;
        int zzc = zzc(bArr, i2, zzhvVar);
        zzjnVar.zzd(zzhvVar.zza);
        while (zzc < i3) {
            int zzc2 = zzc(bArr, zzc, zzhvVar);
            if (i != zzhvVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzhvVar);
            zzjnVar.zzd(zzhvVar.zza);
        }
        return zzc;
    }

    static int zzd(byte[] bArr, int i, zzhv zzhvVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzhvVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzhvVar.zzb = j2;
        return i3;
    }

    static int zza(Object obj, zzll zzllVar, byte[] bArr, int i, int i2, int i3, zzhv zzhvVar) throws IOException {
        int zza = ((zzkx) zzllVar).zza((zzkx) obj, bArr, i, i2, i3, zzhvVar);
        zzhvVar.zzc = obj;
        return zza;
    }

    static int zza(Object obj, zzll zzllVar, byte[] bArr, int i, int i2, zzhv zzhvVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzhvVar);
            i4 = zzhvVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzjs.zzh();
        }
        int i6 = i5 + i4;
        zzllVar.zza(obj, bArr, i5, i6, zzhvVar);
        zzhvVar.zzc = obj;
        return i6;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzhv zzhvVar) throws zzjs {
        if ((i >>> 3) == 0) {
            throw zzjs.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzd(bArr, i2, zzhvVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzc(bArr, i2, zzhvVar) + zzhvVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzjs.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzc(bArr, i2, zzhvVar);
            i6 = zzhvVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzhvVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzjs.zzg();
        }
        return i2;
    }

    static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
