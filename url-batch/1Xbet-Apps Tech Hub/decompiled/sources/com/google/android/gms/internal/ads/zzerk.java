package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzerk implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzerk(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwz zzm;
        zzera zza = zzerc.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdS)).booleanValue()) {
            zzm = zzfwz.zzn(new zzetg(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdT)).intValue(), scheduledExecutorService));
        } else {
            zzm = zzfwz.zzm();
        }
        zzhdx.zzb(zzm);
        return zzm;
    }
}
