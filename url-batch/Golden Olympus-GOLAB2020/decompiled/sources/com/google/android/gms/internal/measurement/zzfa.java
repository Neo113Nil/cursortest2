package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zzfa extends zzeu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzfe zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfa(zzfe zzfeVar, Activity activity) {
        super(zzfeVar.zza, true);
        this.zza = activity;
        this.zzb = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzb.zza.zzj;
        ((zzcv) Preconditions.checkNotNull(zzcvVar)).onActivityPausedByScionActivityInfo(zzdj.zza(this.zza), this.zzi);
    }
}
