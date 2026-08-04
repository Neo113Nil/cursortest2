package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzejv implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdfb zza;

    zzejv(zzejw zzejwVar, zzdfb zzdfbVar) {
        this.zza = zzdfbVar;
        Objects.requireNonNull(zzejwVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdfb zzdfbVar = this.zza;
        zzdfbVar.zzd().zza();
        zzdfbVar.zze().zza();
    }
}
