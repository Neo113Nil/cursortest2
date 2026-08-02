package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzanv {
    private final List zza;
    private final zzadp[] zzb;

    public zzanv(List list) {
        this.zza = list;
        this.zzb = new zzadp[list.size()];
    }

    public final void zza(long j, zzek zzekVar) {
        if (zzekVar.zzb() < 9) {
            return;
        }
        int zzg = zzekVar.zzg();
        int zzg2 = zzekVar.zzg();
        int zzm = zzekVar.zzm();
        if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
            zzabv.zzb(j, zzekVar, this.zzb);
        }
    }

    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzansVar.zzc();
            zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 3);
            zzaf zzafVar = (zzaf) this.zza.get(i);
            String str = zzafVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdi.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzad zzadVar = new zzad();
            zzadVar.zzK(zzansVar.zzb());
            zzadVar.zzX(str);
            zzadVar.zzZ(zzafVar.zze);
            zzadVar.zzO(zzafVar.zzd);
            zzadVar.zzw(zzafVar.zzE);
            zzadVar.zzL(zzafVar.zzo);
            zzw.zzl(zzadVar.zzad());
            this.zzb[i] = zzw;
        }
    }
}
