package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdyc implements zzfnv {
    private final zzdxt zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdyc(zzdxt zzdxtVar, Set set, Clock clock) {
        this.zzb = zzdxtVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdyb zzdybVar = (zzdyb) it.next();
            this.zzd.put(zzdybVar.zzc(), zzdybVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfno zzfnoVar, boolean z) {
        zzdyb zzdybVar = (zzdyb) this.zzd.get(zzfnoVar);
        if (zzdybVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        Map map = this.zza;
        zzfno zzb = zzdybVar.zzb();
        if (map.containsKey(zzb)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzb)).longValue();
            zzdxt zzdxtVar = this.zzb;
            String zza = zzdybVar.zza();
            Map zzc = zzdxtVar.zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            zzc.put("label.".concat(zza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        this.zza.put(zzfnoVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfnoVar)).longValue();
            Map zzc = this.zzb.zzc();
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            String l = Long.toString(elapsedRealtime);
            String.valueOf(l);
            zzc.put("task.".concat(valueOf), "f.".concat(String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfnoVar)).longValue();
            Map zzc = this.zzb.zzc();
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            String l = Long.toString(elapsedRealtime);
            String.valueOf(l);
            zzc.put("task.".concat(valueOf), "s.".concat(String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, true);
        }
    }
}
