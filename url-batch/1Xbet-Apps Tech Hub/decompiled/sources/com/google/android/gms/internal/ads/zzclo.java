package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzclo implements zzduq {
    private final zzckm zza;
    private final zzclu zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzclo(zzckm zzckmVar, zzclu zzcluVar, zzcln zzclnVar) {
        this.zza = zzckmVar;
        this.zzb = zzcluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzduq
    public final /* synthetic */ zzduq zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzduq
    public final /* bridge */ /* synthetic */ zzduq zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzduq
    public final zzdur zzc() {
        zzhdx.zzc(this.zzc, Long.class);
        zzhdx.zzc(this.zzd, String.class);
        return new zzclq(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
