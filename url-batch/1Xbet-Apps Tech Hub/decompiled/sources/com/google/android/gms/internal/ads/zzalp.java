package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.math.RoundingMode;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzalp implements zzalq {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, Opcodes.D2L, 157, Opcodes.LRETURN, Opcodes.ARRAYLENGTH, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzach zzc;
    private final zzadk zzd;
    private final zzalt zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfj zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzalp(zzach zzachVar, zzadk zzadkVar, zzalt zzaltVar) throws zzcf {
        this.zzc = zzachVar;
        this.zzd = zzadkVar;
        this.zze = zzaltVar;
        int max = Math.max(1, zzaltVar.zzc / 10);
        this.zzi = max;
        zzfj zzfjVar = new zzfj(zzaltVar.zzf);
        zzfjVar.zzj();
        int zzj = zzfjVar.zzj();
        this.zzf = zzj;
        int i = zzaltVar.zzb;
        int i2 = (((zzaltVar.zzd - (i * 4)) * 8) / (zzaltVar.zze * i)) + 1;
        if (zzj != i2) {
            throw zzcf.zza("Expected frames per block: " + i2 + "; got: " + zzj, null);
        }
        int i3 = zzfs.zza;
        int i4 = ((max + zzj) - 1) / zzj;
        this.zzg = new byte[zzaltVar.zzd * i4];
        this.zzh = new zzfj(i4 * (zzj + zzj) * i);
        int i5 = ((zzaltVar.zzc * zzaltVar.zzd) * 8) / zzj;
        zzak zzakVar = new zzak();
        zzakVar.zzU("audio/raw");
        zzakVar.zzx(i5);
        zzakVar.zzQ(i5);
        zzakVar.zzN((max + max) * i);
        zzakVar.zzy(zzaltVar.zzb);
        zzakVar.zzV(zzaltVar.zzc);
        zzakVar.zzP(2);
        this.zzj = zzakVar.zzac();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzs = this.zzl + zzfs.zzs(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i);
        this.zzd.zzt(zzs, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(int i, long j) {
        this.zzc.zzO(new zzalw(this.zze, this.zzf, i, j));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzalq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzacf zzacfVar, long j) throws IOException {
        boolean z;
        int i;
        int zzd;
        int zzd2 = this.zzi - zzd(this.zzm);
        int i2 = zzfs.zza;
        int i3 = (((zzd2 + r3) - 1) / this.zzf) * this.zze.zzd;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= i3) {
                    break;
                }
                int zza2 = zzacfVar.zza(this.zzg, this.zzk, (int) Math.min(i3 - r8, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / this.zze.zzd;
            if (i > 0) {
                byte[] bArr = this.zzg;
                zzfj zzfjVar = this.zzh;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = 0;
                    while (true) {
                        zzalt zzaltVar = this.zze;
                        int i6 = zzaltVar.zzb;
                        if (i5 < i6) {
                            byte[] zzI = zzfjVar.zzI();
                            int i7 = zzaltVar.zzd;
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
                            zzI[i16] = (byte) (i15 & 255);
                            zzI[i16 + 1] = (byte) (i15 >> 8);
                            int i17 = 0;
                            while (i17 < i9 + i9) {
                                int i18 = bArr[(i6 * 4) + i10 + ((i17 / 8) * i6 * 4) + ((i17 / 2) % 4)] & 255;
                                int i19 = i17 % 2 == 0 ? i18 & 15 : i18 >> 4;
                                int i20 = i19 & 7;
                                byte[] bArr2 = bArr;
                                int i21 = (((i20 + i20) + 1) * i13) >> 3;
                                if ((i19 & 8) != 0) {
                                    i21 = -i21;
                                }
                                i15 = Math.max(-32768, Math.min(i15 + i21, 32767));
                                int i22 = i16 + i6 + i6;
                                zzI[i22] = (byte) (i15 & 255);
                                zzI[i22 + 1] = (byte) (i15 >> 8);
                                min = Math.max(0, Math.min(min + zza[i19], 88));
                                i13 = zzb[min];
                                i17++;
                                i16 = i22;
                                bArr = bArr2;
                            }
                            i5++;
                        }
                    }
                }
                int zze = zze(this.zzf * i);
                zzfjVar.zzG(0);
                zzfjVar.zzF(zze);
                this.zzk -= i * this.zze.zzd;
                zzfj zzfjVar2 = this.zzh;
                zzadk zzadkVar = this.zzd;
                int zzd3 = zzfjVar2.zzd();
                zzadi.zzb(zzadkVar, zzfjVar2, zzd3);
                int i23 = this.zzm + zzd3;
                this.zzm = i23;
                int zzd4 = zzd(i23);
                int i24 = this.zzi;
                if (zzd4 >= i24) {
                    zzf(i24);
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
