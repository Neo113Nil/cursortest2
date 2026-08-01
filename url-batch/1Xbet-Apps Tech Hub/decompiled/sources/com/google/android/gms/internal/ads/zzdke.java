package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdke implements zzgax {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdkf zzb;

    zzdke(zzdkf zzdkfVar, View view) {
        this.zzb = zzdkfVar;
        this.zza = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfa)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzac(this.zza, (zzflf) obj);
    }
}
