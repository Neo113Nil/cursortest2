package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzemg implements zzekm {
    private final Context zza;
    private final zzdlu zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzemg(Context context, VersionInfoParcel versionInfoParcel, zzdlu zzdluVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdluVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String jSONObject = zzfirVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfirVar.zzs);
        zzfkiVar.zzh(this.zza, zzfjkVar.zzd, jSONObject, zzm, (zzbtz) zzekjVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdko zzd = this.zzb.zzd(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(new zzemf(this, zzekjVar, zzfirVar), null));
        zzd.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzd);
        ((zzelv) zzekjVar.zzc).zzc(zzd.zzf());
        return zzd.zzh();
    }

    final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}
