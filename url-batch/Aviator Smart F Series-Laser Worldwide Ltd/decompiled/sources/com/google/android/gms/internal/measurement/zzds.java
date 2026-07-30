package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzds extends zzdu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzef zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzds(zzef zzefVar, Long l8, String str, String str2, Bundle bundle, boolean z7, boolean z8) {
        super(zzefVar, true);
        this.zzg = zzefVar;
        this.zza = l8;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z7;
        this.zzf = z8;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    final void zza() {
        zzcc zzccVar;
        Long l8 = this.zza;
        long longValue = l8 == null ? this.zzh : l8.longValue();
        zzccVar = this.zzg.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, longValue);
    }
}
