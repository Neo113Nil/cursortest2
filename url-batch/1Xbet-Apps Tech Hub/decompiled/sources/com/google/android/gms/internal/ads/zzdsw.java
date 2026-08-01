package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdsw implements zzfiv {
    private final Map zza;
    private final zzayp zzb;

    zzdsw(zzayp zzaypVar, Map map) {
        this.zza = map;
        this.zzb = zzaypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbH(zzfio zzfioVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbI(zzfio zzfioVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfioVar)) {
            this.zzb.zzc(((zzdsv) this.zza.get(zzfioVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbJ(zzfio zzfioVar, String str) {
        if (this.zza.containsKey(zzfioVar)) {
            this.zzb.zzc(((zzdsv) this.zza.get(zzfioVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzd(zzfio zzfioVar, String str) {
        if (this.zza.containsKey(zzfioVar)) {
            this.zzb.zzc(((zzdsv) this.zza.get(zzfioVar)).zzb);
        }
    }
}
