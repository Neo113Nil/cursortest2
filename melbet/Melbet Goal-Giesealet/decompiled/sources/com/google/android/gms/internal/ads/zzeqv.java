package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeqv implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzeqv(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
    }

    public static zzeqv zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzeqv(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzetb zzetbVar;
        zzesi zzc = zzesk.zzc();
        zzepd zzepdVar = (zzepd) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            zzetbVar = new zzetb(zzepdVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmX)).intValue(), scheduledExecutorService);
        } else {
            zzetbVar = new zzetb(zzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmX)).intValue(), scheduledExecutorService);
        }
        return zzetbVar;
    }
}
