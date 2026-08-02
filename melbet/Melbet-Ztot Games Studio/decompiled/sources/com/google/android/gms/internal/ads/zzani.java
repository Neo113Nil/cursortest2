package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzani {
    private final List zza;
    private final zzadp[] zzb;

    public zzani(List list) {
        this.zza = list;
        this.zzb = new zzadp[list.size()];
    }

    public final void zza(long j, zzek zzekVar) {
        zzabv.zza(j, zzekVar, this.zzb);
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
            String str2 = zzafVar.zza;
            if (str2 == null) {
                str2 = zzansVar.zzb();
            }
            zzad zzadVar = new zzad();
            zzadVar.zzK(str2);
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
