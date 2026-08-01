package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzehs extends zzbxa implements zzczr {
    private zzbxb zza;
    private zzczq zzb;
    private zzdgp zzc;

    @Override // com.google.android.gms.internal.ads.zzczr
    public final synchronized void zza(zzczq zzczqVar) {
        this.zzb = zzczqVar;
    }

    public final synchronized void zzc(zzbxb zzbxbVar) {
        this.zza = zzbxbVar;
    }

    public final synchronized void zzd(zzdgp zzdgpVar) {
        this.zzc = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            ((zzekx) zzbxbVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            zzbxbVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzczq zzczqVar = this.zzb;
        if (zzczqVar != null) {
            zzczqVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            ((zzekx) zzbxbVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzczq zzczqVar = this.zzb;
        if (zzczqVar != null) {
            zzczqVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            ((zzekx) zzbxbVar).zza.zzbw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdgp zzdgpVar = this.zzc;
        if (zzdgpVar != null) {
            zzcbn.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzekw) zzdgpVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Executor executor;
        zzdgp zzdgpVar = this.zzc;
        if (zzdgpVar != null) {
            executor = ((zzekw) zzdgpVar).zzd.zzb;
            final zzefy zzefyVar = ((zzekw) zzdgpVar).zzc;
            final zzfdu zzfduVar = ((zzekw) zzdgpVar).zzb;
            final zzfeh zzfehVar = ((zzekw) zzdgpVar).zza;
            final zzekw zzekwVar = (zzekw) zzdgpVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekv
                @Override // java.lang.Runnable
                public final void run() {
                    zzeky zzekyVar = zzekw.this.zzd;
                    zzeky.zze(zzfehVar, zzfduVar, zzefyVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbxc zzbxcVar) throws RemoteException {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            ((zzekx) zzbxbVar).zzd.zza(zzbxcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            ((zzekx) zzbxbVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            ((zzekx) zzbxbVar).zzd.zzc();
        }
    }
}
