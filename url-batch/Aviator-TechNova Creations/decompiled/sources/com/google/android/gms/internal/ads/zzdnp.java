package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdnp extends zzbko {
    private final zzdoh zza;
    private IObjectWrapper zzb;

    public zzdnp(zzdoh zzdohVar) {
        this.zza = zzdohVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zze() throws RemoteException {
        zzclv zzN;
        int i;
        int i2;
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzab() != 0.0f) {
            return zzdohVar.zzab();
        }
        if (zzdohVar.zzy() != null) {
            try {
                return zzdohVar.zzy().zzm();
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznO)).booleanValue() && zzdohVar.zzU() != null && (zzN = zzdohVar.zzU().zzN()) != null && (i = zzN.zzb) >= 0 && (i2 = zzN.zza) > 0) {
            return i / i2;
        }
        zzbks zzD = zzdohVar.zzD();
        if (zzD == null) {
            return 0.0f;
        }
        float zze = (zzD.zze() == -1 || zzD.zzf() == -1) ? 0.0f : zzD.zze() / zzD.zzf();
        return zze == 0.0f ? zzb(zzD.zzb()) : zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbks zzD = this.zza.zzD();
        if (zzD == null) {
            return null;
        }
        return zzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzh() throws RemoteException {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzi() throws RemoteException {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzm(zzbma zzbmaVar) {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() instanceof zzckr) {
            ((zzckr) zzdohVar.zzy()).zzv(zzbmaVar);
        }
    }
}
