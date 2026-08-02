package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzezt implements zzena {
    protected final zzcgj zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfaj zzd;
    private final zzfcc zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfki zzh;
    private final zzffe zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzezt(Context context, Executor executor, zzcgj zzcgjVar, zzfcc zzfccVar, zzfaj zzfajVar, zzffe zzffeVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgjVar;
        this.zze = zzfccVar;
        this.zzd = zzfajVar;
        this.zzi = zzffeVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgjVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcvw zzm(zzfca zzfcaVar) {
        zzezs zzezsVar = (zzezs) zzfcaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhq)).booleanValue()) {
            zzcph zzcphVar = new zzcph(this.zzg);
            zzcvy zzcvyVar = new zzcvy();
            zzcvyVar.zze(this.zzb);
            zzcvyVar.zzi(zzezsVar.zza);
            zzcwa zzj = zzcvyVar.zzj();
            zzdci zzdciVar = new zzdci();
            zzdciVar.zzc(this.zzd, this.zzc);
            zzdciVar.zzl(this.zzd, this.zzc);
            return zze(zzcphVar, zzj, zzdciVar.zzn());
        }
        zzfaj zzi = zzfaj.zzi(this.zzd);
        zzdci zzdciVar2 = new zzdci();
        zzdciVar2.zzb(zzi, this.zzc);
        zzdciVar2.zzg(zzi, this.zzc);
        zzdciVar2.zzh(zzi, this.zzc);
        zzdciVar2.zzi(zzi, this.zzc);
        zzdciVar2.zzc(zzi, this.zzc);
        zzdciVar2.zzl(zzi, this.zzc);
        zzdciVar2.zzm(zzi);
        zzcph zzcphVar2 = new zzcph(this.zzg);
        zzcvy zzcvyVar2 = new zzcvy();
        zzcvyVar2.zze(this.zzb);
        zzcvyVar2.zzi(zzezsVar.zza);
        return zze(zzcphVar2, zzcvyVar2.zzj(), zzdciVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) throws RemoteException {
        zzfkf zzfkfVar;
        boolean z = ((Boolean) zzbdq.zzd.zze()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkl)).booleanValue();
        if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkm)).intValue() || !z) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezn
                @Override // java.lang.Runnable
                public final void run() {
                    zzezt.this.zzk();
                }
            });
            return false;
        }
        if (this.zzj != null) {
            return false;
        }
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            zzfcc zzfccVar = this.zze;
            if (zzfccVar.zzd() != null) {
                zzfkf zzh = ((zzcou) zzfccVar.zzd()).zzh();
                zzh.zzi(7);
                zzh.zzb(zzlVar.zzp);
                zzh.zzf(zzlVar.zzm);
                zzfkfVar = zzh;
                zzfgd.zza(this.zzb, zzlVar.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzia)).booleanValue() && zzlVar.zzf) {
                    this.zza.zzl().zzo(true);
                }
                Bundle zza = zzdrv.zza(new Pair(zzdrt.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdrt.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
                zzffe zzffeVar = this.zzi;
                zzffeVar.zzt(str);
                zzffeVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzb());
                zzffeVar.zzH(zzlVar);
                zzffeVar.zzA(zza);
                Context context = this.zzb;
                zzffg zzJ = zzffeVar.zzJ();
                zzfju zzb = zzfjt.zzb(context, zzfke.zzf(zzJ), 7, zzlVar);
                zzezs zzezsVar = new zzezs(null);
                zzezsVar.zza = zzJ;
                ListenableFuture zzc = this.zze.zzc(new zzfcd(zzezsVar, null), new zzfcb() { // from class: com.google.android.gms.internal.ads.zzezo
                    @Override // com.google.android.gms.internal.ads.zzfcb
                    public final zzcvw zza(zzfca zzfcaVar) {
                        zzcvw zzm;
                        zzm = zzezt.this.zzm(zzfcaVar);
                        return zzm;
                    }
                }, null);
                this.zzj = zzc;
                zzgcj.zzr(zzc, new zzezq(this, zzemzVar, zzfkfVar, zzb, zzezsVar), this.zzc);
                return true;
            }
        }
        zzfkfVar = null;
        zzfgd.zza(this.zzb, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzia)).booleanValue()) {
            this.zza.zzl().zzo(true);
        }
        Bundle zza2 = zzdrv.zza(new Pair(zzdrt.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdrt.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzffe zzffeVar2 = this.zzi;
        zzffeVar2.zzt(str);
        zzffeVar2.zzs(com.google.android.gms.ads.internal.client.zzq.zzb());
        zzffeVar2.zzH(zzlVar);
        zzffeVar2.zzA(zza2);
        Context context2 = this.zzb;
        zzffg zzJ2 = zzffeVar2.zzJ();
        zzfju zzb2 = zzfjt.zzb(context2, zzfke.zzf(zzJ2), 7, zzlVar);
        zzezs zzezsVar2 = new zzezs(null);
        zzezsVar2.zza = zzJ2;
        ListenableFuture zzc2 = this.zze.zzc(new zzfcd(zzezsVar2, null), new zzfcb() { // from class: com.google.android.gms.internal.ads.zzezo
            @Override // com.google.android.gms.internal.ads.zzfcb
            public final zzcvw zza(zzfca zzfcaVar) {
                zzcvw zzm;
                zzm = zzezt.this.zzm(zzfcaVar);
                return zzm;
            }
        }, null);
        this.zzj = zzc2;
        zzgcj.zzr(zzc2, new zzezq(this, zzemzVar, zzfkfVar, zzb2, zzezsVar2), this.zzc);
        return true;
    }

    protected abstract zzcvw zze(zzcph zzcphVar, zzcwa zzcwaVar, zzdck zzdckVar);

    final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfgi.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzu(zzwVar);
    }
}
