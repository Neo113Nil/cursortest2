package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzda extends zzdu {
    final /* synthetic */ zzbz zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzda(zzef zzefVar, zzbz zzbzVar) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getGmpAppId(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    protected final void zzb() {
        this.zza.zze(null);
    }
}
