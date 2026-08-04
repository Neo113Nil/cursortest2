package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcrw {
    private final zzdyo zza;
    private final zzfdc zzb;
    private final zzfhh zzc;
    private final zzckw zzd;
    private final zzehr zze;
    private final zzdbh zzf;
    private zzfcu zzg;
    private final zzdzw zzh;
    private final zzcuw zzi;
    private final Executor zzj;
    private final zzdzh zzk;
    private final zzeee zzl;

    zzcrw(zzdyo zzdyoVar, zzfdc zzfdcVar, zzfhh zzfhhVar, zzckw zzckwVar, zzehr zzehrVar, zzdbh zzdbhVar, zzfcu zzfcuVar, zzdzw zzdzwVar, zzcuw zzcuwVar, Executor executor, zzdzh zzdzhVar, zzeee zzeeeVar) {
        this.zza = zzdyoVar;
        this.zzb = zzfdcVar;
        this.zzc = zzfhhVar;
        this.zzd = zzckwVar;
        this.zze = zzehrVar;
        this.zzf = zzdbhVar;
        this.zzg = zzfcuVar;
        this.zzh = zzdzwVar;
        this.zzi = zzcuwVar;
        this.zzj = executor;
        this.zzk = zzdzhVar;
        this.zzl = zzeeeVar;
    }

    public final ListenableFuture zza(ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            zzfhh zzfhhVar = this.zzc;
            zzfhb zzfhbVar = zzfhb.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfhhVar);
            return zzfgs.zza(zzgot.zza(this.zzg), zzfhbVar, zzfhhVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfgy zza = this.zzc.zza(zzfhb.SERVER_TRANSACTION, listenableFuture);
        final zzdzh zzdzhVar = this.zzk;
        Objects.requireNonNull(zzdzhVar);
        return zza.zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrv
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdzh.this.zza((zzbuv) obj);
            }
        }).zzi();
    }

    public final ListenableFuture zzb() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zza(this.zzi.zzb());
        }
        zzfhh zzfhhVar = this.zzc;
        zzfhb zzfhbVar = zzfhb.PRELOADED_LOADER;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zza(this.zza.zza(), zzfhbVar, zzfhhVar).zzi();
    }

    public final ListenableFuture zzc(ListenableFuture listenableFuture) {
        zzfgy zzc = this.zzc.zza(zzfhb.RENDERER, listenableFuture).zzb(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                zzfcu zzfcuVar = (zzfcu) obj;
                zzcrw.this.zzi(zzfcuVar);
                return zzfcuVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgb)).booleanValue()) {
            zzc = zzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
        }
        return zzc.zzi();
    }

    public final zzdbh zzd() {
        return this.zzf;
    }

    public final ListenableFuture zze(final zzfey zzfeyVar) {
        zzfgo zzi = this.zzc.zza(zzfhb.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzcrw.this.zzj(zzfeyVar, (zzbuv) obj);
            }
        }).zzi();
        zzgot.zzq(zzi, new zzcrr(this), this.zzj);
        return zzi;
    }

    public final ListenableFuture zzf(zzbuv zzbuvVar) {
        zzfgo zzi = this.zzc.zza(zzfhb.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbuvVar)).zzi();
        zzgot.zzq(zzi, new zzcrs(this), this.zzj);
        return zzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th) {
        return zzfee.zzb(th, this.zzl);
    }

    public final void zzh(zzfcu zzfcuVar) {
        this.zzg = zzfcuVar;
    }

    final /* synthetic */ zzfcu zzi(zzfcu zzfcuVar) {
        this.zzd.zza(zzfcuVar);
        return zzfcuVar;
    }

    final /* synthetic */ ListenableFuture zzj(zzfey zzfeyVar, zzbuv zzbuvVar) {
        zzbuvVar.zzi = zzfeyVar;
        return this.zzh.zza(zzbuvVar);
    }

    final /* synthetic */ zzdbh zzk() {
        return this.zzf;
    }
}
