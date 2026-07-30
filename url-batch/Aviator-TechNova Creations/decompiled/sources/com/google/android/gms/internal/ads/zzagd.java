package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzagd extends zzafi {
    private final long zza;

    public zzagd(zzaev zzaevVar, long j) {
        super(zzaevVar);
        zzgrc.zza(zzaevVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
