package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfro extends zzfsh {
    private String zza;
    private String zzb;

    zzfro() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfsh zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfsh zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfsi zzc() {
        return new zzfrq(this.zza, this.zzb, null);
    }
}
