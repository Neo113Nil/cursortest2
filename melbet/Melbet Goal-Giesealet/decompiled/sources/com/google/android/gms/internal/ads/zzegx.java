package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzegx extends zzegz {
    private final zzcgv zza;
    private final zzdgy zzb;
    private final zzcva zzc;
    private final zzdbs zzd;
    private final zzehk zze;
    private final zzeee zzf;

    public zzegx(zzcgv zzcgvVar, zzdgy zzdgyVar, zzcva zzcvaVar, zzdbs zzdbsVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzdgyVar;
        this.zzc = zzcvaVar;
        this.zzd = zzdbsVar;
        this.zze = zzehkVar;
        this.zzf = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    protected final ListenableFuture zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzcva zzcvaVar = this.zzc;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zzf);
        }
        zzdhc zzm = this.zza.zzm();
        zzm.zzf(zzcvaVar.zze());
        zzm.zzg(this.zzd);
        zzm.zze(this.zzb);
        zzm.zzd(new zzcoh(null));
        zzcrw zza = zzm.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
