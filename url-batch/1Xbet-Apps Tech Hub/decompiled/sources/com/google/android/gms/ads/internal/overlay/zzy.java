package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzdge;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzy extends zzbto {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbz(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final boolean zzH() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzl(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzba.zzc().zza(zzbdc.zziH)).booleanValue() && !this.zze) {
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
            zzdge zzdgeVar = this.zza.zzu;
            if (zzdgeVar != null) {
                zzdgeVar.zzbL();
            }
            if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                zzoVar.zzbw();
            }
        }
        Activity activity = this.zzb;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
        com.google.android.gms.ads.internal.zzt.zzh();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            return;
        }
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzm() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzo() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbp();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzp(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzr() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzu() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzv() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzx() throws RemoteException {
        this.zze = true;
    }
}
