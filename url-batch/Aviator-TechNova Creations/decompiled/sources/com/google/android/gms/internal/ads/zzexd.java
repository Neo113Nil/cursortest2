package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzexd implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzexd(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
    }

    public static zzexd zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzexd(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzezj zzezjVar;
        zzeyq zzc = zzeys.zzc();
        zzevl zzevlVar = (zzevl) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            zzezjVar = new zzezj(zzevlVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznF)).intValue(), scheduledExecutorService);
        } else {
            zzezjVar = new zzezj(zzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznF)).intValue(), scheduledExecutorService);
        }
        return zzezjVar;
    }
}
