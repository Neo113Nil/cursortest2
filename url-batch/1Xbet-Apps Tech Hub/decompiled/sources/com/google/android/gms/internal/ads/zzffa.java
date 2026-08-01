package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzffa {
    private final zzfdu zza;
    private final zzfdy zzb;
    private final zzeep zzc;
    private final zzfla zzd;
    private final zzfkh zze;
    private final zzcpo zzf;

    public zzffa(zzeep zzeepVar, zzfla zzflaVar, zzfdu zzfduVar, zzfdy zzfdyVar, zzcpo zzcpoVar, zzfkh zzfkhVar) {
        this.zza = zzfduVar;
        this.zzb = zzfdyVar;
        this.zzc = zzeepVar;
        this.zzd = zzflaVar;
        this.zzf = zzcpoVar;
        this.zze = zzfkhVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzeer(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
        }
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgbb.zzr(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjB)).booleanValue() ? this.zzf.zzc(str, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgbb.zzh(str), new zzfez(this, i), zzcca.zza);
        }
    }
}
