package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcpb implements zzhpx {
    private final zzcor zza;
    private final zzhqg zzb;

    private zzcpb(zzcor zzcorVar, zzhqg zzhqgVar) {
        this.zza = zzcorVar;
        this.zzb = zzhqgVar;
    }

    public static zzcpb zza(zzcor zzcorVar, zzhqg zzhqgVar) {
        return new zzcpb(zzcorVar, zzhqgVar);
    }

    public static Set zzc(zzcor zzcorVar, zzcqh zzcqhVar) {
        Set singleton = Collections.singleton(new zzddr(zzcqhVar, zzbzh.zzg));
        zzhqf.zzb(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcqh) this.zzb.zzb());
    }
}
