package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzels implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzccf zza;
    final /* synthetic */ zzfeh zzb;
    final /* synthetic */ zzfdu zzc;
    final /* synthetic */ zzely zzd;
    final /* synthetic */ zzelt zze;

    zzels(zzelt zzeltVar, zzccf zzccfVar, zzfeh zzfehVar, zzfdu zzfduVar, zzely zzelyVar) {
        this.zze = zzeltVar;
        this.zza = zzccfVar;
        this.zzb = zzfehVar;
        this.zzc = zzfduVar;
        this.zzd = zzelyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzemc zzemcVar;
        zzely zzelyVar = this.zzd;
        zzemcVar = this.zze.zzd;
        this.zza.zzc(zzemcVar.zza(this.zzb, this.zzc, view, zzelyVar));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
