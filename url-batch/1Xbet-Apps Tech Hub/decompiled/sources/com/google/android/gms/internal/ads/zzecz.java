package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzecz implements zzfiv {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfjd zzc;

    public zzecz(Set set, zzfjd zzfjdVar) {
        zzfio zzfioVar;
        String str;
        zzfio zzfioVar2;
        String str2;
        this.zzc = zzfjdVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzecy zzecyVar = (zzecy) it.next();
            Map map = this.zza;
            zzfioVar = zzecyVar.zzb;
            str = zzecyVar.zza;
            map.put(zzfioVar, str);
            Map map2 = this.zzb;
            zzfioVar2 = zzecyVar.zzc;
            str2 = zzecyVar.zza;
            map2.put(zzfioVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbH(zzfio zzfioVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbI(zzfio zzfioVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfioVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfioVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbJ(zzfio zzfioVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfioVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfioVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzd(zzfio zzfioVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfioVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfioVar))), "s.");
        }
    }
}
