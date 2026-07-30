package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzenh extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzdhf zzc;
    private final zzenr zzd;
    private final zzekl zze;

    zzenh(zzcma zzcmaVar, zzdan zzdanVar, zzdhf zzdhfVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzdhfVar;
        this.zzd = zzenrVar;
        this.zze = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    protected final ListenableFuture zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zze);
        }
        zzctk zzk = this.zza.zzk();
        zzk.zzd(zzdanVar.zze());
        zzk.zze(this.zzc);
        zzcxj zza = zzk.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
