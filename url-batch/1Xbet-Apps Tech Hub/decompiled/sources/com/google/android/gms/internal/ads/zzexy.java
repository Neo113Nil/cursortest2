package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzexy implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzexy(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexw(new zzbtt(), (ScheduledExecutorService) this.zzb.zzb(), ((zzciw) this.zzc).zza());
    }
}
