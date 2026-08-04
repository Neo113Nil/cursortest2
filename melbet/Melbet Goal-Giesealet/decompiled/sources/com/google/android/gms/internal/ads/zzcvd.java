package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcvd implements zzhpx {
    private final zzcvb zza;
    private final zzhqg zzb;

    private zzcvd(zzcvb zzcvbVar, zzhqg zzhqgVar) {
        this.zza = zzcvbVar;
        this.zzb = zzhqgVar;
    }

    public static zzcvd zza(zzcvb zzcvbVar, zzhqg zzhqgVar) {
        return new zzcvd(zzcvbVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zzf = this.zza.zzf(((zzchd) this.zzb).zza());
        zzhqf.zzb(zzf);
        return zzf;
    }
}
