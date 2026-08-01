package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfdh implements zzeoc {
    private final Context zza;
    private final Executor zzb;
    private final zzciq zzc;
    private final zzfcx zzd;
    private final zzfbl zze;
    private final zzfei zzf;
    private final zzfkk zzg;
    private final zzfeo zzh;
    private ListenableFuture zzi;

    public zzfdh(Context context, Executor executor, zzciq zzciqVar, zzfbl zzfblVar, zzfcx zzfcxVar, zzfeo zzfeoVar, zzfei zzfeiVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzciqVar;
        this.zze = zzfblVar;
        this.zzd = zzfcxVar;
        this.zzh = zzfeoVar;
        this.zzf = zzfeiVar;
        this.zzg = zzciqVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdqc zzk(zzfbj zzfbjVar) {
        zzdqc zzi = this.zzc.zzi();
        zzcxp zzcxpVar = new zzcxp();
        zzcxpVar.zze(this.zza);
        zzcxpVar.zzi(((zzfdg) zzfbjVar).zza);
        zzcxpVar.zzh(this.zzf);
        zzi.zzd(zzcxpVar.zzj());
        zzi.zzc(new zzddw().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeoc
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeoc
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoa zzeoaVar, zzeob zzeobVar) throws RemoteException {
        zzfkh zzfkhVar;
        zzbwx zzbwxVar = new zzbwx(zzlVar, str);
        if (zzbwxVar.zzb == null) {
            zzcbn.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfda
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdh.this.zzi();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            zzfbl zzfblVar = this.zze;
            if (zzfblVar.zzd() != null) {
                zzfkh zzh = ((zzdqd) zzfblVar.zzd()).zzh();
                zzh.zzh(5);
                zzh.zzb(zzbwxVar.zza.zzp);
                zzfkhVar = zzh;
                zzffl.zza(this.zza, zzbwxVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue() && zzbwxVar.zza.zzf) {
                    this.zzc.zzk().zzn(true);
                }
                zzfeo zzfeoVar = this.zzh;
                zzfeoVar.zzs(zzbwxVar.zzb);
                zzfeoVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfeoVar.zzE(zzbwxVar.zza);
                Context context = this.zza;
                zzfeq zzG = zzfeoVar.zzG();
                zzfjw zzb = zzfjv.zzb(context, zzfkg.zzf(zzG), 5, zzbwxVar.zza);
                zzfdg zzfdgVar = new zzfdg(null);
                zzfdgVar.zza = zzG;
                ListenableFuture zzc = this.zze.zzc(new zzfbm(zzfdgVar, null), new zzfbk() { // from class: com.google.android.gms.internal.ads.zzfdb
                    @Override // com.google.android.gms.internal.ads.zzfbk
                    public final zzcxn zza(zzfbj zzfbjVar) {
                        zzdqc zzk;
                        zzk = zzfdh.this.zzk(zzfbjVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzgbb.zzr(zzc, new zzfde(this, zzeobVar, zzfkhVar, zzb, zzfdgVar), this.zzb);
                return true;
            }
        }
        zzfkhVar = null;
        zzffl.zza(this.zza, zzbwxVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue()) {
            this.zzc.zzk().zzn(true);
        }
        zzfeo zzfeoVar2 = this.zzh;
        zzfeoVar2.zzs(zzbwxVar.zzb);
        zzfeoVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzfeoVar2.zzE(zzbwxVar.zza);
        Context context2 = this.zza;
        zzfeq zzG2 = zzfeoVar2.zzG();
        zzfjw zzb2 = zzfjv.zzb(context2, zzfkg.zzf(zzG2), 5, zzbwxVar.zza);
        zzfdg zzfdgVar2 = new zzfdg(null);
        zzfdgVar2.zza = zzG2;
        ListenableFuture zzc2 = this.zze.zzc(new zzfbm(zzfdgVar2, null), new zzfbk() { // from class: com.google.android.gms.internal.ads.zzfdb
            @Override // com.google.android.gms.internal.ads.zzfbk
            public final zzcxn zza(zzfbj zzfbjVar) {
                zzdqc zzk;
                zzk = zzfdh.this.zzk(zzfbjVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzgbb.zzr(zzc2, new zzfde(this, zzeobVar, zzfkhVar, zzb2, zzfdgVar2), this.zzb);
        return true;
    }

    final /* synthetic */ void zzi() {
        this.zzd.zzbG(zzffr.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
