package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejz implements zzhdp {
    private final zzejy zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;

    public zzejz(zzejy zzejyVar, zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4) {
        this.zza = zzejyVar;
        this.zzb = zzhecVar;
        this.zzc = zzhecVar2;
        this.zzd = zzhecVar3;
        this.zze = zzhecVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzejs) this.zzc).zzb(), (zzega) this.zzd.zzb(), (zzfla) this.zze.zzb());
    }
}
