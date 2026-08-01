package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzalr implements zzalq {
    private final zzach zza;
    private final zzadk zzb;
    private final zzalt zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzalr(zzach zzachVar, zzadk zzadkVar, zzalt zzaltVar, String str, int i) throws zzcf {
        this.zza = zzachVar;
        this.zzb = zzadkVar;
        this.zzc = zzaltVar;
        int i2 = zzaltVar.zzb * zzaltVar.zze;
        int i3 = zzaltVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzcf.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzaltVar.zzc * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.zze = max;
        zzak zzakVar = new zzak();
        zzakVar.zzU(str);
        zzakVar.zzx(i6);
        zzakVar.zzQ(i6);
        zzakVar.zzN(max);
        zzakVar.zzy(zzaltVar.zzb);
        zzakVar.zzV(zzaltVar.zzc);
        zzakVar.zzP(i);
        this.zzd = zzakVar.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(int i, long j) {
        this.zza.zzO(new zzalw(this.zzc, 1, i, j));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final boolean zzc(zzacf zzacfVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int zza = zzadi.zza(this.zzb, zzacfVar, (int) Math.min(i2 - i, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        zzalt zzaltVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzaltVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long zzs = this.zzf + zzfs.zzs(this.zzh, 1000000L, zzaltVar.zzc, RoundingMode.FLOOR);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzt(zzs, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
