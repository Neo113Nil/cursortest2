package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzfdy implements zzena {
    private final Context zza;
    private final Executor zzb;
    private final zzcgj zzc;
    private final zzfdo zzd;
    private final zzfcc zze;
    private final zzfey zzf;
    private final zzfki zzg;
    private final zzffe zzh;
    private ListenableFuture zzi;

    public zzfdy(Context context, Executor executor, zzcgj zzcgjVar, zzfcc zzfccVar, zzfdo zzfdoVar, zzffe zzffeVar, zzfey zzfeyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgjVar;
        this.zze = zzfccVar;
        this.zzd = zzfdoVar;
        this.zzh = zzffeVar;
        this.zzf = zzfeyVar;
        this.zzg = zzcgjVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdot zzk(zzfca zzfcaVar) {
        zzdot zzi = this.zzc.zzi();
        zzcvy zzcvyVar = new zzcvy();
        zzcvyVar.zze(this.zza);
        zzcvyVar.zzi(((zzfdx) zzfcaVar).zza);
        zzcvyVar.zzh(this.zzf);
        zzi.zzd(zzcvyVar.zzj());
        zzi.zzc(new zzdci().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) throws RemoteException {
        zzfkf zzfkfVar;
        zzbvu zzbvuVar = new zzbvu(zzlVar, str);
        if (zzbvuVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdy.this.zzi();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            zzfcc zzfccVar = this.zze;
            if (zzfccVar.zzd() != null) {
                zzfkf zzh = ((zzdou) zzfccVar.zzd()).zzh();
                zzh.zzi(5);
                zzh.zzb(zzbvuVar.zza.zzp);
                zzh.zzf(zzbvuVar.zza.zzm);
                zzfkfVar = zzh;
                zzfgd.zza(this.zza, zzbvuVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzia)).booleanValue() && zzbvuVar.zza.zzf) {
                    this.zzc.zzl().zzo(true);
                }
                Bundle zza = zzdrv.zza(new Pair(zzdrt.PUBLIC_API_CALL.zza(), Long.valueOf(zzbvuVar.zza.zzz)), new Pair(zzdrt.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
                zzffe zzffeVar = this.zzh;
                zzffeVar.zzt(zzbvuVar.zzb);
                zzffeVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzffeVar.zzH(zzbvuVar.zza);
                zzffeVar.zzA(zza);
                Context context = this.zza;
                zzffg zzJ = zzffeVar.zzJ();
                zzfju zzb = zzfjt.zzb(context, zzfke.zzf(zzJ), 5, zzbvuVar.zza);
                zzfdx zzfdxVar = new zzfdx(null);
                zzfdxVar.zza = zzJ;
                ListenableFuture zzc = this.zze.zzc(new zzfcd(zzfdxVar, null), new zzfcb() { // from class: com.google.android.gms.internal.ads.zzfds
                    @Override // com.google.android.gms.internal.ads.zzfcb
                    public final zzcvw zza(zzfca zzfcaVar) {
                        zzdot zzk;
                        zzk = zzfdy.this.zzk(zzfcaVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzgcj.zzr(zzc, new zzfdv(this, zzemzVar, zzfkfVar, zzb, zzfdxVar), this.zzb);
                return true;
            }
        }
        zzfkfVar = null;
        zzfgd.zza(this.zza, zzbvuVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzia)).booleanValue()) {
            this.zzc.zzl().zzo(true);
        }
        Bundle zza2 = zzdrv.zza(new Pair(zzdrt.PUBLIC_API_CALL.zza(), Long.valueOf(zzbvuVar.zza.zzz)), new Pair(zzdrt.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzffe zzffeVar2 = this.zzh;
        zzffeVar2.zzt(zzbvuVar.zzb);
        zzffeVar2.zzs(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzffeVar2.zzH(zzbvuVar.zza);
        zzffeVar2.zzA(zza2);
        Context context2 = this.zza;
        zzffg zzJ2 = zzffeVar2.zzJ();
        zzfju zzb2 = zzfjt.zzb(context2, zzfke.zzf(zzJ2), 5, zzbvuVar.zza);
        zzfdx zzfdxVar2 = new zzfdx(null);
        zzfdxVar2.zza = zzJ2;
        ListenableFuture zzc2 = this.zze.zzc(new zzfcd(zzfdxVar2, null), new zzfcb() { // from class: com.google.android.gms.internal.ads.zzfds
            @Override // com.google.android.gms.internal.ads.zzfcb
            public final zzcvw zza(zzfca zzfcaVar) {
                zzdot zzk;
                zzk = zzfdy.this.zzk(zzfcaVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzgcj.zzr(zzc2, new zzfdv(this, zzemzVar, zzfkfVar, zzb2, zzfdxVar2), this.zzb);
        return true;
    }

    final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfgi.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
