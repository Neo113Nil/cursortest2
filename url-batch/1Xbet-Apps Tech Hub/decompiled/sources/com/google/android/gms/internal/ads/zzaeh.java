package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaeh implements zzabp {
    private final zzacr zza;
    private final int zzb;
    private final zzacm zzc = new zzacm();

    /* synthetic */ zzaeh(zzacr zzacrVar, int i, zzaeg zzaegVar) {
        this.zza = zzacrVar;
        this.zzb = i;
    }

    private final long zzc(zzacf zzacfVar) throws IOException {
        while (zzacfVar.zze() < zzacfVar.zzd() - 6) {
            zzacr zzacrVar = this.zza;
            int i = this.zzb;
            zzacm zzacmVar = this.zzc;
            long zze = zzacfVar.zze();
            byte[] bArr = new byte[2];
            zzabu zzabuVar = (zzabu) zzacfVar;
            zzabuVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzacfVar.zzj();
                zzabuVar.zzl((int) (zze - zzacfVar.zzf()), false);
            } else {
                zzfj zzfjVar = new zzfj(16);
                System.arraycopy(bArr, 0, zzfjVar.zzI(), 0, 2);
                zzfjVar.zzF(zzaci.zza(zzacfVar, zzfjVar.zzI(), 2, 14));
                zzacfVar.zzj();
                zzabuVar.zzl((int) (zze - zzacfVar.zzf()), false);
                if (zzacn.zzc(zzfjVar, zzacrVar, i, zzacmVar)) {
                    break;
                }
            }
            zzabuVar.zzl(1, false);
        }
        if (zzacfVar.zze() < zzacfVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzabu) zzacfVar).zzl((int) (zzacfVar.zzd() - zzacfVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final zzabo zza(zzacf zzacfVar, long j) throws IOException {
        int i = this.zza.zzc;
        long zzf = zzacfVar.zzf();
        long zzc = zzc(zzacfVar);
        long zze = zzacfVar.zze();
        ((zzabu) zzacfVar).zzl(Math.max(6, i), false);
        long zzc2 = zzc(zzacfVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzabo.zzf(zzc2, zzacfVar.zze()) : zzabo.zzd(zzc, zzf) : zzabo.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final /* synthetic */ void zzb() {
    }
}
