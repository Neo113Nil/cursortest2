package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzekv implements zzekm {
    private final Context zza;
    private final zzctl zzb;
    private final Executor zzc;

    zzekv(Context context, zzctl zzctlVar, Executor executor) {
        this.zza = context;
        this.zzb = zzctlVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String jSONObject = zzfirVar.zzv.toString();
        zzfkiVar.zzy(this.zza, zzfjkVar.zzd, jSONObject, (zzbtz) zzekjVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzcti zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(new zzeku(this, zzekjVar, zzfirVar), null), new zzctj(zzfirVar.zzaa));
        zzf.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzc);
        ((zzelv) zzekjVar.zzc).zzc(zzf.zzf());
        return zzf.zzh();
    }
}
