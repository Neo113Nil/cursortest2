package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdpg implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzchh zzb;
    private final Context zzc;
    private final zzdtp zzd;
    private final zzfje zze;
    private final zzeep zzf;
    private final Executor zzg;
    private final zzasi zzh;
    private final zzcbt zzi;
    private final zzfla zzj;
    private final zzefa zzk;

    public zzdpg(Context context, Executor executor, zzasi zzasiVar, zzcbt zzcbtVar, com.google.android.gms.ads.internal.zza zzaVar, zzchh zzchhVar, zzeep zzeepVar, zzfla zzflaVar, zzdtp zzdtpVar, zzfje zzfjeVar, zzefa zzefaVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzasiVar;
        this.zzi = zzcbtVar;
        this.zza = zzaVar;
        this.zzb = zzchhVar;
        this.zzf = zzeepVar;
        this.zzj = zzflaVar;
        this.zzd = zzdtpVar;
        this.zze = zzfjeVar;
        this.zzk = zzefaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdpj zzdpjVar = new zzdpj(this);
        zzdpjVar.zzh();
        return zzdpjVar;
    }
}
