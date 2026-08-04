package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcss implements com.google.android.gms.ads.internal.client.zza {
    private final zzcsw zza;
    private final zzfdc zzb;

    zzcss(zzcsw zzcswVar, zzfdc zzfdcVar) {
        this.zza = zzcswVar;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
