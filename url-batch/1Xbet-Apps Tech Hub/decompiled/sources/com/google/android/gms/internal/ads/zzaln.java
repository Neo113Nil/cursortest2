package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaln {
    private final List zza;
    private final zzadk[] zzb;

    public zzaln(List list) {
        this.zza = list;
        this.zzb = new zzadk[list.size()];
    }

    public final void zza(long j, zzfj zzfjVar) {
        if (zzfjVar.zza() < 9) {
            return;
        }
        int zzf = zzfjVar.zzf();
        int zzf2 = zzfjVar.zzf();
        int zzl = zzfjVar.zzl();
        if (zzf == 434 && zzf2 == 1195456820 && zzl == 3) {
            zzabr.zzb(j, zzfjVar, this.zzb);
        }
    }

    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzalkVar.zzc();
            zzadk zzw = zzachVar.zzw(zzalkVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i);
            String str = zzamVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzef.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzak zzakVar = new zzak();
            zzakVar.zzJ(zzalkVar.zzb());
            zzakVar.zzU(str);
            zzakVar.zzW(zzamVar.zze);
            zzakVar.zzM(zzamVar.zzd);
            zzakVar.zzw(zzamVar.zzE);
            zzakVar.zzK(zzamVar.zzo);
            zzw.zzl(zzakVar.zzac());
            this.zzb[i] = zzw;
        }
    }
}
