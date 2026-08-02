package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzfwy extends zzfwl {
    final /* synthetic */ zzfxa zza;
    private final Object zzb;
    private int zzc;

    zzfwy(zzfxa zzfxaVar, int i) {
        this.zza = zzfxaVar;
        this.zzb = zzfxa.zzg(zzfxaVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int zzw;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfur.zza(this.zzb, zzfxa.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwl, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfxa.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfwl, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfxa zzfxaVar = this.zza;
        Object zzj = zzfxa.zzj(zzfxaVar, i);
        zzfxa.zzn(zzfxaVar, this.zzc, obj);
        return zzj;
    }
}
