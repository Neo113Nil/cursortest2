package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcmm implements zzdqc {
    private final zzckm zza;
    private zzfbp zzb;
    private zzfas zzc;
    private zzddy zzd;
    private zzcxr zze;

    /* synthetic */ zzcmm(zzckm zzckmVar, zzcml zzcmlVar) {
        this.zza = zzckmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final /* synthetic */ zzcxn zza(zzfas zzfasVar) {
        this.zzc = zzfasVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final /* synthetic */ zzcxn zzb(zzfbp zzfbpVar) {
        this.zzb = zzfbpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqc
    public final /* synthetic */ zzdqc zzc(zzddy zzddyVar) {
        this.zzd = zzddyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqc
    public final /* synthetic */ zzdqc zzd(zzcxr zzcxrVar) {
        this.zze = zzcxrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdqd zzh() {
        zzhdx.zzc(this.zzd, zzddy.class);
        zzhdx.zzc(this.zze, zzcxr.class);
        return new zzcmo(this.zza, new zzcvb(), new zzffv(), new zzcwx(), new zzdud(), this.zzd, this.zze, zzeka.zza(), null, this.zzb, this.zzc, null);
    }
}
