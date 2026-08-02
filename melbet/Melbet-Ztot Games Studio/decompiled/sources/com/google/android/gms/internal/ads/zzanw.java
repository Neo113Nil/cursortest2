package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzanw implements zzanx {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacn zzc;
    private final zzadp zzd;
    private final zzaoa zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzek zzh;
    private final int zzi;
    private final zzaf zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzanw(zzacn zzacnVar, zzadp zzadpVar, zzaoa zzaoaVar) throws zzbo {
        this.zzc = zzacnVar;
        this.zzd = zzadpVar;
        this.zze = zzaoaVar;
        int max = Math.max(1, zzaoaVar.zzc / 10);
        this.zzi = max;
        zzek zzekVar = new zzek(zzaoaVar.zzf);
        zzekVar.zzk();
        int zzk = zzekVar.zzk();
        this.zzf = zzk;
        int i = zzaoaVar.zzb;
        int i2 = (((zzaoaVar.zzd - (i * 4)) * 8) / (zzaoaVar.zze * i)) + 1;
        if (zzk != i2) {
            throw zzbo.zza("Expected frames per block: " + i2 + "; got: " + zzk, null);
        }
        int i3 = zzet.zza;
        int i4 = ((max + zzk) - 1) / zzk;
        this.zzg = new byte[zzaoaVar.zzd * i4];
        this.zzh = new zzek(i4 * (zzk + zzk) * i);
        int i5 = ((zzaoaVar.zzc * zzaoaVar.zzd) * 8) / zzk;
        zzad zzadVar = new zzad();
        zzadVar.zzX("audio/raw");
        zzadVar.zzx(i5);
        zzadVar.zzS(i5);
        zzadVar.zzP((max + max) * i);
        zzadVar.zzy(zzaoaVar.zzb);
        zzadVar.zzY(zzaoaVar.zzc);
        zzadVar.zzR(2);
        this.zzj = zzadVar.zzad();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzt = this.zzl + zzet.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i);
        this.zzd.zzs(zzt, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zza(int i, long j) {
        this.zzc.zzO(new zzaod(this.zze, this.zzf, i, j));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzanx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzacl zzaclVar, long j) throws IOException {
        boolean z;
        int i;
        int zzd;
        int zzd2 = this.zzi - zzd(this.zzm);
        int i2 = zzet.zza;
        int i3 = (((zzd2 + r3) - 1) / this.zzf) * this.zze.zzd;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= i3) {
                    break;
                }
                int zza2 = zzaclVar.zza(this.zzg, this.zzk, (int) Math.min(i3 - r7, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / this.zze.zzd;
            if (i > 0) {
                byte[] bArr = this.zzg;
                zzek zzekVar = this.zzh;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = 0;
                    while (true) {
                        zzaoa zzaoaVar = this.zze;
                        int i6 = zzaoaVar.zzb;
                        if (i5 < i6) {
                            byte[] zzM = zzekVar.zzM();
                            int i7 = zzaoaVar.zzd;
                            int i8 = i4 * i7;
                            int i9 = (i7 / i6) - 4;
                            int i10 = i8 + (i5 * 4);
                            int i11 = bArr[i10 + 1] & 255;
                            int i12 = bArr[i10] & 255;
                            int min = Math.min(bArr[i10 + 2] & 255, 88);
                            int i13 = zzb[min];
                            int i14 = (this.zzf * i4 * i6) + i5;
                            int i15 = (short) ((i11 << 8) | i12);
                            int i16 = i14 + i14;
                            zzM[i16] = (byte) (i15 & 255);
                            zzM[i16 + 1] = (byte) (i15 >> 8);
                            int i17 = 0;
                            while (i17 < i9 + i9) {
                                byte b = bArr[(i6 * 4) + i10 + ((i17 / 8) * i6 * 4) + ((i17 / 2) % 4)];
                                byte[] bArr2 = bArr;
                                int i18 = i17 % 2 == 0 ? b & Ascii.SI : (b & 255) >> 4;
                                int i19 = i18 & 7;
                                int i20 = (((i19 + i19) + 1) * i13) >> 3;
                                if ((i18 & 8) != 0) {
                                    i20 = -i20;
                                }
                                i15 = Math.max(-32768, Math.min(i15 + i20, 32767));
                                int i21 = i16 + i6 + i6;
                                zzM[i21] = (byte) (i15 & 255);
                                zzM[i21 + 1] = (byte) (i15 >> 8);
                                min = Math.max(0, Math.min(min + zza[i18], 88));
                                i13 = zzb[min];
                                i17++;
                                i16 = i21;
                                bArr = bArr2;
                            }
                            i5++;
                        }
                    }
                }
                int zze = zze(this.zzf * i);
                zzekVar.zzK(0);
                zzekVar.zzJ(zze);
                this.zzk -= i * this.zze.zzd;
                zzek zzekVar2 = this.zzh;
                zzadp zzadpVar = this.zzd;
                int zze2 = zzekVar2.zze();
                zzadpVar.zzq(zzekVar2, zze2);
                int i22 = this.zzm + zze2;
                this.zzm = i22;
                int zzd3 = zzd(i22);
                int i23 = this.zzi;
                if (zzd3 >= i23) {
                    zzf(i23);
                }
            }
            if (z && (zzd = zzd(this.zzm)) > 0) {
                zzf(zzd);
            }
            return z;
        }
        z = true;
        while (!z) {
        }
        i = this.zzk / this.zze.zzd;
        if (i > 0) {
        }
        if (z) {
            zzf(zzd);
        }
        return z;
    }
}
