package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzenl extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzepw zzc;
    private final zzdhf zzd;
    private final zzenr zze;
    private final zzekl zzf;

    public zzenl(zzcma zzcmaVar, zzdan zzdanVar, zzepw zzepwVar, zzdhf zzdhfVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzepwVar;
        this.zzd = zzdhfVar;
        this.zze = zzenrVar;
        this.zzf = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    protected final ListenableFuture zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzf);
        }
        zzdlt zzm = this.zza.zzm();
        zzm.zze(zzdanVar.zze());
        zzm.zzf(this.zzd);
        zzm.zzd(this.zzc);
        zzcxj zzb = zzm.zzh().zzb();
        return zzb.zzc(zzb.zzb());
    }
}
