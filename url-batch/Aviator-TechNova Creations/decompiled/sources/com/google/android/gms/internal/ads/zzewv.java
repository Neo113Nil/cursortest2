package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzewv implements zzikg {
    private final zzikp zza;

    private zzewv(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzewv zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewv(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgup zzh;
        zzevn zzc = zzevp.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeX)).booleanValue()) {
            zzh = zzgup.zzi(new zzezj(zzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeY)).intValue(), scheduledExecutorService));
        } else {
            zzh = zzgup.zzh();
        }
        zziko.zzb(zzh);
        return zzh;
    }
}
