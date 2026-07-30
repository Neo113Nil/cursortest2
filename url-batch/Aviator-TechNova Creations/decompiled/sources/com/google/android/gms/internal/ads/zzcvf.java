package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcvf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcvf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
    }

    public static zzcvf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcvf(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = Boolean.valueOf(zzcvd.zza()).booleanValue();
        zzekg zzb = ((zzenk) this.zza).zzb();
        zzekg zzb2 = ((zzepj) this.zzb).zzb();
        if (true != booleanValue) {
            zzb = zzb2;
        }
        return zzb;
    }
}
