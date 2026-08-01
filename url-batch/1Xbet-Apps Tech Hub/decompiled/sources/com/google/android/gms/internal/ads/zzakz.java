package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakz {
    private final List zza;
    private final zzadk[] zzb;

    public zzakz(List list) {
        this.zza = list;
        this.zzb = new zzadk[list.size()];
    }

    public final void zza(long j, zzfj zzfjVar) {
        zzabr.zza(j, zzfjVar, this.zzb);
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
            String str2 = zzamVar.zzb;
            if (str2 == null) {
                str2 = zzalkVar.zzb();
            }
            zzak zzakVar = new zzak();
            zzakVar.zzJ(str2);
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
