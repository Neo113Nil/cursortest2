package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdts implements zzfiv {
    private final zzdtk zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdts(zzdtk zzdtkVar, Set set, Clock clock) {
        zzfio zzfioVar;
        this.zzb = zzdtkVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdtr zzdtrVar = (zzdtr) it.next();
            Map map = this.zzd;
            zzfioVar = zzdtrVar.zzc;
            map.put(zzfioVar, zzdtrVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfio zzfioVar, boolean z) {
        zzfio zzfioVar2;
        String str;
        zzfioVar2 = ((zzdtr) this.zzd.get(zzfioVar)).zzb;
        if (this.zza.containsKey(zzfioVar2)) {
            String str2 = true != z ? "f." : "s.";
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfioVar2)).longValue();
            zzdtk zzdtkVar = this.zzb;
            Map map = this.zzd;
            Map zza = zzdtkVar.zza();
            str = ((zzdtr) map.get(zzfioVar)).zza;
            zza.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbH(zzfio zzfioVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbI(zzfio zzfioVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfioVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfioVar)).longValue();
            zzdtk zzdtkVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdtkVar.zza().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfioVar)) {
            zze(zzfioVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbJ(zzfio zzfioVar, String str) {
        this.zza.put(zzfioVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzd(zzfio zzfioVar, String str) {
        if (this.zza.containsKey(zzfioVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfioVar)).longValue();
            zzdtk zzdtkVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdtkVar.zza().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfioVar)) {
            zze(zzfioVar, true);
        }
    }
}
