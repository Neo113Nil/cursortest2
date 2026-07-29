package com.google.android.gms.internal.ads;

import com.umeng.commonsdk.proguard.ao;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzbad {
    static int zza(int i, byte[] bArr, int i2, int i3, zzbae zzbaeVar) throws zzbbu {
        if ((i >>> 3) == 0) {
            throw zzbbu.zzado();
        }
        int i4 = i & 7;
        if (i4 == 5) {
            return i2 + 4;
        }
        switch (i4) {
            case 0:
                return zzb(bArr, i2, zzbaeVar);
            case 1:
                return i2 + 8;
            case 2:
                return zza(bArr, i2, zzbaeVar) + zzbaeVar.zzdpl;
            case 3:
                int i5 = (i & (-8)) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzbaeVar);
                    i6 = zzbaeVar.zzdpl;
                    if (i6 == i5) {
                        if (i2 <= i3 || i6 != i5) {
                            throw zzbbu.zzadr();
                        }
                        return i2;
                    }
                    i2 = zza(i6, bArr, i2, i3, zzbaeVar);
                }
                if (i2 <= i3) {
                }
                throw zzbbu.zzadr();
            default:
                throw zzbbu.zzado();
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzbbt<?> zzbbtVar, zzbae zzbaeVar) {
        zzbbp zzbbpVar = (zzbbp) zzbbtVar;
        int zza = zza(bArr, i2, zzbaeVar);
        while (true) {
            zzbbpVar.zzco(zzbaeVar.zzdpl);
            if (zza >= i3) {
                break;
            }
            int zza2 = zza(bArr, zza, zzbaeVar);
            if (i != zzbaeVar.zzdpl) {
                break;
            }
            zza = zza(bArr, zza2, zzbaeVar);
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzbef zzbefVar, zzbae zzbaeVar) throws IOException {
        if ((i >>> 3) == 0) {
            throw zzbbu.zzado();
        }
        int i4 = i & 7;
        if (i4 == 5) {
            zzbefVar.zzb(i, Integer.valueOf(zze(bArr, i2)));
            return i2 + 4;
        }
        switch (i4) {
            case 0:
                int zzb = zzb(bArr, i2, zzbaeVar);
                zzbefVar.zzb(i, Long.valueOf(zzbaeVar.zzdpm));
                return zzb;
            case 1:
                zzbefVar.zzb(i, Long.valueOf(zzf(bArr, i2)));
                return i2 + 8;
            case 2:
                int zza = zza(bArr, i2, zzbaeVar);
                int i5 = zzbaeVar.zzdpl;
                zzbefVar.zzb(i, i5 == 0 ? zzbah.zzdpq : zzbah.zzc(bArr, zza, i5));
                return zza + i5;
            case 3:
                zzbef zzagd = zzbef.zzagd();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 < i3) {
                        int zza2 = zza(bArr, i2, zzbaeVar);
                        int i8 = zzbaeVar.zzdpl;
                        if (i8 != i6) {
                            i7 = i8;
                            i2 = zza(i8, bArr, zza2, i3, zzagd, zzbaeVar);
                        } else {
                            i7 = i8;
                            i2 = zza2;
                        }
                    }
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzbbu.zzadr();
                }
                zzbefVar.zzb(i, zzagd);
                return i2;
            default:
                throw zzbbu.zzado();
        }
    }

    static int zza(int i, byte[] bArr, int i2, zzbae zzbaeVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                i3 = b3 << ao.l;
            } else {
                i5 = i7 | ((b3 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b4 = bArr[i8];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i7 = i5 | ((b4 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b5 = bArr[i6];
                    if (b5 >= 0) {
                        i3 = b5 << 28;
                    } else {
                        int i9 = i7 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                zzbaeVar.zzdpl = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            zzbaeVar.zzdpl = i7 | i3;
            return i8;
        }
        i4 = b2 << 7;
        zzbaeVar.zzdpl = i5 | i4;
        return i6;
    }

    static int zza(byte[] bArr, int i, zzbae zzbaeVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return zza(b2, bArr, i2, zzbaeVar);
        }
        zzbaeVar.zzdpl = b2;
        return i2;
    }

    static int zza(byte[] bArr, int i, zzbbt<?> zzbbtVar, zzbae zzbaeVar) throws IOException {
        zzbbp zzbbpVar = (zzbbp) zzbbtVar;
        int zza = zza(bArr, i, zzbaeVar);
        int i2 = zzbaeVar.zzdpl + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzbaeVar);
            zzbbpVar.zzco(zzbaeVar.zzdpl);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzbbu.zzadl();
    }

    static int zzb(byte[] bArr, int i, zzbae zzbaeVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzbaeVar.zzdpm = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzbaeVar.zzdpm = j2;
        return i3;
    }

    static int zzc(byte[] bArr, int i, zzbae zzbaeVar) {
        int zza = zza(bArr, i, zzbaeVar);
        int i2 = zzbaeVar.zzdpl;
        if (i2 == 0) {
            zzbaeVar.zzdpn = "";
            return zza;
        }
        zzbaeVar.zzdpn = new String(bArr, zza, i2, zzbbq.UTF_8);
        return zza + i2;
    }

    static int zzd(byte[] bArr, int i, zzbae zzbaeVar) throws IOException {
        int zza = zza(bArr, i, zzbaeVar);
        int i2 = zzbaeVar.zzdpl;
        if (i2 == 0) {
            zzbaeVar.zzdpn = "";
            return zza;
        }
        int i3 = zza + i2;
        if (!zzbem.zzf(bArr, zza, i3)) {
            throw zzbbu.zzads();
        }
        zzbaeVar.zzdpn = new String(bArr, zza, i2, zzbbq.UTF_8);
        return i3;
    }

    static int zze(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int zze(byte[] bArr, int i, zzbae zzbaeVar) {
        int zza = zza(bArr, i, zzbaeVar);
        int i2 = zzbaeVar.zzdpl;
        if (i2 == 0) {
            zzbaeVar.zzdpn = zzbah.zzdpq;
            return zza;
        }
        zzbaeVar.zzdpn = zzbah.zzc(bArr, zza, i2);
        return zza + i2;
    }

    static long zzf(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    static double zzg(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzf(bArr, i));
    }

    static float zzh(byte[] bArr, int i) {
        return Float.intBitsToFloat(zze(bArr, i));
    }
}
