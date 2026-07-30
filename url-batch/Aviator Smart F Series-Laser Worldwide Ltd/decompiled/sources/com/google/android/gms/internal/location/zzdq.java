package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes3.dex */
final class zzdq extends com.google.android.gms.location.zzv {
    private final zzdm zza;

    zzdq(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    final zzdq zzc(ListenerHolder listenerHolder) {
        this.zza.zzb(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzw
    public final void zzd(LocationResult locationResult) {
        this.zza.zza().notifyListener(new zzdn(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzw
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.zza().notifyListener(new zzdo(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzw
    public final void zzf() {
        this.zza.zza().notifyListener(new zzdp(this));
    }

    final void zzg() {
        this.zza.zza().clear();
    }

    final /* synthetic */ zzdm zzh() {
        return this.zza;
    }
}
