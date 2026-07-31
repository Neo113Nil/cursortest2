package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zzfc extends zzeu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzcs zzb;
    final /* synthetic */ zzfe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfc(zzfe zzfeVar, Activity activity, zzcs zzcsVar) {
        super(zzfeVar.zza, true);
        this.zza = activity;
        this.zzb = zzcsVar;
        this.zzc = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzc.zza.zzj;
        ((zzcv) Preconditions.checkNotNull(zzcvVar)).onActivitySaveInstanceStateByScionActivityInfo(zzdj.zza(this.zza), this.zzb, this.zzi);
    }
}
