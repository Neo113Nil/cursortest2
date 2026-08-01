package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdqe implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzdqe(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        int i = ((zzcxy) this.zzc).zza().zzo.zza;
        if (i != 0) {
            return i + (-1) != 0 ? ((zzeli) this.zzb).zzb() : ((zzeli) this.zza).zzb();
        }
        throw null;
    }
}
