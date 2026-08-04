package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdqw implements zzhpx {
    private final zzhqg zza;

    private zzdqw(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzdqw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdqw(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgpd zzc = zzfgc.zzc();
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfD)).booleanValue() ? Collections.singleton(new zzddr(((zzdrp) this.zza).zzb(), zzc)) : Collections.emptySet();
        zzhqf.zzb(singleton);
        return singleton;
    }
}
