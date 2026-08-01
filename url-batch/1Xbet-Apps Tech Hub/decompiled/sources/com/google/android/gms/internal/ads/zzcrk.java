package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcrk extends zzaxi {
    private final zzcrj zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzezs zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaF)).booleanValue();
    private final zzdtp zze;

    public zzcrk(zzcrj zzcrjVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzezs zzezsVar, zzdtp zzdtpVar) {
        this.zza = zzcrjVar;
        this.zzb = zzbuVar;
        this.zzc = zzezsVar;
        this.zze = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgM)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                zzcbn.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzi(IObjectWrapper iObjectWrapper, zzaxq zzaxqVar) {
        try {
            this.zzc.zzq(zzaxqVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzaxqVar, this.zzd);
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }
}
