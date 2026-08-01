package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcmq implements com.google.android.gms.ads.nonagon.signalgeneration.zzg {
    private final zzckm zza;
    private zzcxr zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzae zzc;

    /* synthetic */ zzcmq(zzckm zzckmVar, zzcmp zzcmpVar) {
        this.zza = zzckmVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zza(zzcxr zzcxrVar) {
        this.zzb = zzcxrVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzae zzaeVar) {
        this.zzc = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzc() {
        zzhdx.zzc(this.zzb, zzcxr.class);
        zzhdx.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzae.class);
        return new zzcms(this.zza, this.zzc, new zzcvb(), new zzdud(), this.zzb, null, null, null);
    }
}
