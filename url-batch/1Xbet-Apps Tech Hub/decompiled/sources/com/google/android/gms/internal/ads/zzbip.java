package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbip extends zzbhs {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbip(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbuVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
        try {
            if (zzbuVar.zzj() instanceof zzawe) {
                zzawe zzaweVar = (zzawe) zzbuVar.zzj();
                adManagerAdView.setAppEventListener(zzaweVar != null ? zzaweVar.zzb() : null);
            }
        } catch (RemoteException e2) {
            zzcbn.zzh("", e2);
        }
        zzcbg.zza.post(new zzbio(this, adManagerAdView, zzbuVar));
    }
}
