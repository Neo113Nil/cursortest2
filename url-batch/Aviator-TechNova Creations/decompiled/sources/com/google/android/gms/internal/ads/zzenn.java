package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzenn extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzdhf zzc;
    private final zzenr zzd;

    @Nullable
    private final zzfjd zze;
    private final zzekl zzf;

    public zzenn(zzcma zzcmaVar, zzdan zzdanVar, zzdhf zzdhfVar, @Nullable zzfjd zzfjdVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzdhfVar;
        this.zze = zzfjdVar;
        this.zzd = zzenrVar;
        this.zzf = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    protected final ListenableFuture zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzfjd zzfjdVar;
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeu)).booleanValue() && (zzfjdVar = this.zze) != null) {
            zzdanVar.zzf(zzfjdVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzf);
        }
        zzdud zzp = this.zza.zzp();
        zzp.zzd(zzdanVar.zze());
        zzp.zze(this.zzc);
        zzcxj zza = zzp.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
