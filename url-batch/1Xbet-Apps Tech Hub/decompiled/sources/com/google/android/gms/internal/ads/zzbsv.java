package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbsv implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzbhc zza;

    public zzbsv(zzbhc zzbhcVar) {
        this.zza = zzbhcVar;
        try {
            zzbhcVar.zzm();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
            return false;
        }
    }
}
