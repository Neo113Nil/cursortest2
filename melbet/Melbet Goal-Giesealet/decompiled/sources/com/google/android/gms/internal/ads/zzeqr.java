package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeqr implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqr(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqr zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqr(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgke zzh;
        zzerp zzb = ((zzerr) this.zza).zzb();
        Context zza = ((zzchd) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmh)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzF(zza)) {
                zzh = zzgke.zzi(zzb);
                zzhqf.zzb(zzh);
                return zzh;
            }
        }
        zzh = zzgke.zzh();
        zzhqf.zzb(zzh);
        return zzh;
    }
}
