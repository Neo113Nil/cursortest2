package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzezc implements zzeoc {
    protected final zzciq zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzezs zzd;
    private final zzfbl zze;
    private final zzcbt zzf;
    private final ViewGroup zzg;
    private final zzfkk zzh;
    private final zzfeo zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzezc(Context context, Executor executor, zzciq zzciqVar, zzfbl zzfblVar, zzezs zzezsVar, zzfeo zzfeoVar, zzcbt zzcbtVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzciqVar;
        this.zze = zzfblVar;
        this.zzd = zzezsVar;
        this.zzi = zzfeoVar;
        this.zzf = zzcbtVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzciqVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcxn zzm(zzfbj zzfbjVar) {
        zzezb zzezbVar = (zzezb) zzfbjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhZ)).booleanValue()) {
            zzcrm zzcrmVar = new zzcrm(this.zzg);
            zzcxp zzcxpVar = new zzcxp();
            zzcxpVar.zze(this.zzb);
            zzcxpVar.zzi(zzezbVar.zza);
            zzcxr zzj = zzcxpVar.zzj();
            zzddw zzddwVar = new zzddw();
            zzddwVar.zzc(this.zzd, this.zzc);
            zzddwVar.zzl(this.zzd, this.zzc);
            return zze(zzcrmVar, zzj, zzddwVar.zzn());
        }
        zzezs zzi = zzezs.zzi(this.zzd);
        zzddw zzddwVar2 = new zzddw();
        zzddwVar2.zzb(zzi, this.zzc);
        zzddwVar2.zzg(zzi, this.zzc);
        zzddwVar2.zzh(zzi, this.zzc);
        zzddwVar2.zzi(zzi, this.zzc);
        zzddwVar2.zzc(zzi, this.zzc);
        zzddwVar2.zzl(zzi, this.zzc);
        zzddwVar2.zzm(zzi);
        zzcrm zzcrmVar2 = new zzcrm(this.zzg);
        zzcxp zzcxpVar2 = new zzcxp();
        zzcxpVar2.zze(this.zzb);
        zzcxpVar2.zzi(zzezbVar.zza);
        return zze(zzcrmVar2, zzcxpVar2.zzj(), zzddwVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeoc
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzeoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoa zzeoaVar, zzeob zzeobVar) throws RemoteException {
        boolean z;
        zzfkh zzfkhVar;
        if (((Boolean) zzbet.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkt)).booleanValue()) {
                z = true;
                if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzku)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                if (str != null) {
                    zzcbn.zzg("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzezc.this.zzk();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
                    zzfbl zzfblVar = this.zze;
                    if (zzfblVar.zzd() != null) {
                        zzfkh zzh = ((zzcqz) zzfblVar.zzd()).zzh();
                        zzh.zzh(7);
                        zzh.zzb(zzlVar.zzp);
                        zzfkhVar = zzh;
                        zzffl.zza(this.zzb, zzlVar.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue() && zzlVar.zzf) {
                            this.zza.zzk().zzn(true);
                        }
                        zzfeo zzfeoVar = this.zzi;
                        zzfeoVar.zzs(str);
                        zzfeoVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                        zzfeoVar.zzE(zzlVar);
                        Context context = this.zzb;
                        zzfeq zzG = zzfeoVar.zzG();
                        zzfjw zzb = zzfjv.zzb(context, zzfkg.zzf(zzG), 7, zzlVar);
                        zzezb zzezbVar = new zzezb(null);
                        zzezbVar.zza = zzG;
                        ListenableFuture zzc = this.zze.zzc(new zzfbm(zzezbVar, null), new zzfbk() { // from class: com.google.android.gms.internal.ads.zzeyx
                            @Override // com.google.android.gms.internal.ads.zzfbk
                            public final zzcxn zza(zzfbj zzfbjVar) {
                                zzcxn zzm;
                                zzm = zzezc.this.zzm(zzfbjVar);
                                return zzm;
                            }
                        }, null);
                        this.zzj = zzc;
                        zzgbb.zzr(zzc, new zzeyz(this, zzeobVar, zzfkhVar, zzb, zzezbVar), this.zzc);
                        return true;
                    }
                }
                zzfkhVar = null;
                zzffl.zza(this.zzb, zzlVar.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue()) {
                    this.zza.zzk().zzn(true);
                }
                zzfeo zzfeoVar2 = this.zzi;
                zzfeoVar2.zzs(str);
                zzfeoVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                zzfeoVar2.zzE(zzlVar);
                Context context2 = this.zzb;
                zzfeq zzG2 = zzfeoVar2.zzG();
                zzfjw zzb2 = zzfjv.zzb(context2, zzfkg.zzf(zzG2), 7, zzlVar);
                zzezb zzezbVar2 = new zzezb(null);
                zzezbVar2.zza = zzG2;
                ListenableFuture zzc2 = this.zze.zzc(new zzfbm(zzezbVar2, null), new zzfbk() { // from class: com.google.android.gms.internal.ads.zzeyx
                    @Override // com.google.android.gms.internal.ads.zzfbk
                    public final zzcxn zza(zzfbj zzfbjVar) {
                        zzcxn zzm;
                        zzm = zzezc.this.zzm(zzfbjVar);
                        return zzm;
                    }
                }, null);
                this.zzj = zzc2;
                zzgbb.zzr(zzc2, new zzeyz(this, zzeobVar, zzfkhVar, zzb2, zzezbVar2), this.zzc);
                return true;
            }
        }
        z = false;
        if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzku)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str != null) {
        }
    }

    protected abstract zzcxn zze(zzcrm zzcrmVar, zzcxr zzcxrVar, zzddy zzddyVar);

    final /* synthetic */ void zzk() {
        this.zzd.zzbG(zzffr.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
