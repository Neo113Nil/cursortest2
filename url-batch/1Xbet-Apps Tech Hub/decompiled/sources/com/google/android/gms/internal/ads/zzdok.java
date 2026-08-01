package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdok extends zzbmo implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbft {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdkf zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdok(zzdkf zzdkfVar, zzdkk zzdkkVar) {
        this.zza = zzdkkVar.zzf();
        this.zzb = zzdkkVar.zzj();
        this.zzc = zzdkfVar;
        if (zzdkkVar.zzs() != null) {
            zzdkkVar.zzs().zzam(this);
        }
    }

    private final void zzg() {
        View view;
        zzdkf zzdkfVar = this.zzc;
        if (zzdkfVar == null || (view = this.zza) == null) {
            return;
        }
        zzdkfVar.zzA(view, Collections.emptyMap(), Collections.emptyMap(), zzdkf.zzW(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbms zzbmsVar, int i) {
        try {
            zzbmsVar.zze(i);
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zzcbn.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final zzbgf zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcbn.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdkf zzdkfVar = this.zzc;
        if (zzdkfVar == null || zzdkfVar.zzc() == null) {
            return null;
        }
        return zzdkfVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdkf zzdkfVar = this.zzc;
        if (zzdkfVar != null) {
            zzdkfVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdoj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzf(IObjectWrapper iObjectWrapper, zzbms zzbmsVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcbn.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbmsVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zzcbn.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbmsVar, 0);
            return;
        }
        if (this.zze) {
            zzcbn.zzg("Instream ad should not be used again.");
            zzi(zzbmsVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzx();
        zzccn.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzccn.zzb(this.zza, this);
        zzg();
        try {
            zzbmsVar.zzf();
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }
}
