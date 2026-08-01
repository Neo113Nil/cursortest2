package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcvu implements com.google.android.gms.ads.internal.client.zza {
    private final zzcvy zza;
    private final zzfeq zzb;

    zzcvu(zzcvy zzcvyVar, zzfeq zzfeqVar) {
        this.zza = zzcvyVar;
        this.zzb = zzfeqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
