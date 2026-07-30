package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbhx extends zzbcs implements zzbhz {
    zzbhx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zze(zzbhw zzbhwVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbhwVar);
        zzda(1, zza);
    }
}
