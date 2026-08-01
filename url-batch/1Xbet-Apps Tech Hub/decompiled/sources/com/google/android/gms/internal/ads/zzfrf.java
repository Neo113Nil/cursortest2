package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrf extends zzfrr {
    private String zza;
    private String zzb;

    zzfrf() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final zzfrr zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final zzfrr zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final zzfrs zzc() {
        return new zzfrh(this.zza, this.zzb, null);
    }
}
