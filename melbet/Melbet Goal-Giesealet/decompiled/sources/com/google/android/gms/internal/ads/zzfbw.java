package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfbw implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzfbn zzd;
    private final zzfab zze;
    private final zzfcv zzf;
    private final zzfie zzg;
    private final zzfdb zzh;
    private ListenableFuture zzi;

    public zzfbw(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzfbn zzfbnVar, zzfdb zzfdbVar, zzfcv zzfcvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zze = zzfabVar;
        this.zzd = zzfbnVar;
        this.zzh = zzfdbVar;
        this.zzf = zzfcvVar;
        this.zzg = zzcgvVar.zzv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdoq zze(zzezz zzezzVar) {
        zzdoq zzn = this.zzc.zzn();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(this.zza);
        zzcvaVar.zzb(((zzfbv) zzezzVar).zza);
        zzcvaVar.zzf(this.zzf);
        zzn.zzd(zzcvaVar.zze());
        zzn.zze(new zzdbr().zzn());
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelw zzelwVar, zzelx zzelxVar) throws RemoteException {
        zzfib zzfibVar;
        zzbvo zzbvoVar = new zzbvo(zzmVar, str);
        String str2 = zzbvoVar.zzb;
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfbw.this.zzc();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfab zzfabVar = this.zze;
            if (zzfabVar.zzd() != null) {
                zzfib zzd = ((zzdor) zzfabVar.zzd()).zzd();
                zzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzbvoVar.zza;
                zzd.zzc(zzmVar2.zzp);
                zzd.zzd(zzmVar2.zzm);
                zzfibVar = zzd;
                Context context = this.zza;
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzbvoVar.zza;
                boolean z = zzmVar3.zzf;
                zzfdz.zzb(context, z);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && z) {
                    this.zzc.zzu().zzc(true);
                }
                Bundle zza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzfdb zzfdbVar = this.zzh;
                zzfdbVar.zzg(str2);
                zzfdbVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
                zzfdbVar.zza(zzmVar3);
                zzfdbVar.zzv(zza);
                zzfdc zzz = zzfdbVar.zzz();
                zzfhr zzo = zzfhr.zzo(context, zzfia.zzg(zzz), 5, zzmVar3);
                zzfbv zzfbvVar = new zzfbv(null);
                zzfbvVar.zza = zzz;
                ListenableFuture zzc = this.zze.zzc(new zzfac(zzfbvVar, null), new zzfaa() { // from class: com.google.android.gms.internal.ads.zzfbt
                    @Override // com.google.android.gms.internal.ads.zzfaa
                    public final /* synthetic */ zzcuy zza(zzezz zzezzVar) {
                        return zzfbw.this.zzd(zzezzVar);
                    }
                }, null);
                this.zzi = zzc;
                zzgot.zzq(zzc, new zzfbs(this, zzelxVar, zzfibVar, zzo, zzfbvVar), this.zzb);
                return true;
            }
        }
        zzfibVar = null;
        Context context2 = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar32 = zzbvoVar.zza;
        boolean z2 = zzmVar32.zzf;
        zzfdz.zzb(context2, z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue()) {
            this.zzc.zzu().zzc(true);
        }
        Bundle zza2 = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar32.zzz)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfdb zzfdbVar2 = this.zzh;
        zzfdbVar2.zzg(str2);
        zzfdbVar2.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzfdbVar2.zza(zzmVar32);
        zzfdbVar2.zzv(zza2);
        zzfdc zzz2 = zzfdbVar2.zzz();
        zzfhr zzo2 = zzfhr.zzo(context2, zzfia.zzg(zzz2), 5, zzmVar32);
        zzfbv zzfbvVar2 = new zzfbv(null);
        zzfbvVar2.zza = zzz2;
        ListenableFuture zzc2 = this.zze.zzc(new zzfac(zzfbvVar2, null), new zzfaa() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzfaa
            public final /* synthetic */ zzcuy zza(zzezz zzezzVar) {
                return zzfbw.this.zzd(zzezzVar);
            }
        }, null);
        this.zzi = zzc2;
        zzgot.zzq(zzc2, new zzfbs(this, zzelxVar, zzfibVar, zzo2, zzfbvVar2), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzfbn zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzfab zzh() {
        return this.zze;
    }

    final /* synthetic */ zzfie zzi() {
        return this.zzg;
    }

    final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
