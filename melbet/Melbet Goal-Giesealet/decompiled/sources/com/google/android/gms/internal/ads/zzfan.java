package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfan implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzeli zzd;
    private final zzfbn zze;
    private zzbdd zzf;
    private final zzfie zzg;
    private final zzfdb zzh;
    private ListenableFuture zzi;

    public zzfan(Context context, Executor executor, zzcgv zzcgvVar, zzeli zzeliVar, zzfbn zzfbnVar, zzfdb zzfdbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zzd = zzeliVar;
        this.zzh = zzfdbVar;
        this.zze = zzfbnVar;
        this.zzg = zzcgvVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelw zzelwVar, zzelx zzelxVar) {
        zzdgh zzh;
        zzfib zzfibVar;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfan.this.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzu().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfag) zzelwVar).zza;
        Bundle zza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfdb zzfdbVar = this.zzh;
        zzfdbVar.zzg(str);
        zzfdbVar.zzc(zzrVar);
        zzfdbVar.zza(zzmVar);
        zzfdbVar.zzv(zza);
        Context context = this.zza;
        zzfdc zzz = zzfdbVar.zzz();
        zzfhr zzo = zzfhr.zzo(context, zzfia.zzg(zzz), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziV)).booleanValue()) {
            zzdgg zzk = this.zzc.zzk();
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.zza(context);
            zzcvaVar.zzb(zzz);
            zzk.zze(zzcvaVar.zze());
            zzdbr zzdbrVar = new zzdbr();
            zzeli zzeliVar = this.zzd;
            Executor executor = this.zzb;
            zzdbrVar.zzm(zzeliVar, executor);
            zzdbrVar.zze(zzeliVar, executor);
            zzk.zzf(zzdbrVar.zzn());
            zzk.zzd(new zzejp(this.zzf));
            zzh = zzk.zzh();
        } else {
            zzdbr zzdbrVar2 = new zzdbr();
            zzfbn zzfbnVar = this.zze;
            if (zzfbnVar != null) {
                Executor executor2 = this.zzb;
                zzdbrVar2.zza(zzfbnVar, executor2);
                zzdbrVar2.zzb(zzfbnVar, executor2);
                zzdbrVar2.zzc(zzfbnVar, executor2);
            }
            zzdgg zzk2 = this.zzc.zzk();
            zzcva zzcvaVar2 = new zzcva();
            zzcvaVar2.zza(context);
            zzcvaVar2.zzb(zzz);
            zzk2.zze(zzcvaVar2.zze());
            zzeli zzeliVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdbrVar2.zzm(zzeliVar2, executor3);
            zzdbrVar2.zza(zzeliVar2, executor3);
            zzdbrVar2.zzb(zzeliVar2, executor3);
            zzdbrVar2.zzc(zzeliVar2, executor3);
            zzdbrVar2.zzf(zzeliVar2, executor3);
            zzdbrVar2.zzg(zzeliVar2, executor3);
            zzdbrVar2.zze(zzeliVar2, executor3);
            zzdbrVar2.zzk(zzeliVar2, executor3);
            zzdbrVar2.zzd(zzeliVar2, executor3);
            zzk2.zzf(zzdbrVar2.zzn());
            zzk2.zzd(new zzejp(this.zzf));
            zzh = zzk2.zzh();
        }
        zzdgh zzdghVar = zzh;
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfibVar = zzdghVar.zzc();
            zzfibVar.zzi(4);
            zzfibVar.zzc(zzmVar.zzp);
            zzfibVar.zzd(zzmVar.zzm);
        } else {
            zzfibVar = null;
        }
        zzcrw zzb = zzdghVar.zzb();
        ListenableFuture zzc = zzb.zzc(zzb.zzb());
        this.zzi = zzc;
        zzgot.zzq(zzc, new zzfal(this, zzelxVar, zzfibVar, zzo, zzdghVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public final void zzc(zzbdd zzbddVar) {
        this.zzf = zzbddVar;
    }

    final /* synthetic */ void zzd() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ zzeli zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfbn zzg() {
        return this.zze;
    }

    final /* synthetic */ zzfie zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(ListenableFuture listenableFuture) {
        this.zzi = null;
    }
}
