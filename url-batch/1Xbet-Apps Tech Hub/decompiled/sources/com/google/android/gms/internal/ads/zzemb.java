package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzemb implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzdgy zza;

    zzemb(zzemc zzemcVar, zzdgy zzdgyVar) {
        this.zza = zzdgyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
