package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfjf implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzfjf(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhdj zza = zzhdo.zza(this.zza);
        zzhdj zza2 = zzhdo.zza(this.zzb);
        Object zzfjhVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziw)).booleanValue() ? new zzfjh((zzfje) zza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzfje) zza2.zzb();
        zzhdx.zzb(zzfjhVar);
        return zzfjhVar;
    }
}
