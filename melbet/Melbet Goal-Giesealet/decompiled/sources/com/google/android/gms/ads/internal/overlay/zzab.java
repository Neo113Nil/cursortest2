package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzddz;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzab extends zzbsv implements zzazc {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private final boolean zzf;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;
    private boolean zzg = false;
    private boolean zzh = false;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzfo)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzab(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzfj)).booleanValue()) {
            if (!((Boolean) zzbd.zzc().zzd(zzbci.zzfk)).booleanValue()) {
            }
        }
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj) {
            if (Build.MANUFACTURER.matches((String) zzbd.zzc().zzd(zzbci.zzfm))) {
                if (Build.MODEL.matches((String) zzbd.zzc().zzd(zzbci.zzfn))) {
                    z = true;
                }
            }
        }
        this.zzf = z;
    }

    private final synchronized void zzc() {
        if (!this.zzd) {
            zzq zzqVar = this.zza.zzc;
            if (zzqVar != null) {
                zzqVar.zzdY(4);
            }
            this.zzd = true;
            if (this.zzf) {
                if (((Boolean) zzbd.zzc().zzd(zzbci.zzfo)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzc(this);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z) {
        if (!z) {
            this.zzh = true;
        } else if (this.zzh) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Foregrounded: finishing activity from LauncherOverlay");
            this.zzb.finish();
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zzg) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() throws RemoteException {
        zzq zzqVar = this.zza.zzc;
        if (zzqVar != null) {
            zzqVar.zzdA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() throws RemoteException {
        return ((Boolean) zzbd.zzc().zzd(zzbci.zzfk)).booleanValue() && this.zzf && this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(Bundle bundle) {
        zzq zzqVar;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzjG)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzddz zzddzVar = adOverlayInfoParcel.zzu;
            if (zzddzVar != null) {
                zzddzVar.zzdz();
            }
            Activity activity = this.zzb;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzqVar = adOverlayInfoParcel.zzc) != null) {
                zzqVar.zzh();
            }
        }
        if (this.zzf) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzfo)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            }
        }
        Activity activity2 = this.zzb;
        zzc zzcVar = adOverlayInfoParcel.zza;
        zzac zzacVar = adOverlayInfoParcel.zzi;
        com.google.android.gms.ads.internal.zzt.zza();
        if (zza.zzb(activity2, zzcVar, zzacVar, zzcVar.zzi, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() throws RemoteException {
        if (this.zzc) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        this.zzg = true;
        zzq zzqVar = this.zza.zzc;
        if (zzqVar != null) {
            zzqVar.zzdC();
        }
        if (this.zzf) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzfj)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzaa
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzab.this.zzb();
                    }
                }, ((Integer) zzbd.zzc().zzd(zzbci.zzfl)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() throws RemoteException {
        this.zzg = false;
        zzq zzqVar = this.zza.zzc;
        if (zzqVar != null) {
            zzqVar.zzdB();
        }
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() throws RemoteException {
        this.zze = true;
    }
}
