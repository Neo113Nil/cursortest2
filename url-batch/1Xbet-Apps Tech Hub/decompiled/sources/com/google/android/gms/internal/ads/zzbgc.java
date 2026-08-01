package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbgc implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzbhc zza;

    public zzbgc(zzbhc zzbhcVar) {
        this.zza = zzbhcVar;
        try {
            zzbhcVar.zzm();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
            return false;
        }
    }
}
