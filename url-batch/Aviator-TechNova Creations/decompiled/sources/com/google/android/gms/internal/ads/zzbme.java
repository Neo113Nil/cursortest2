package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbme extends zzbcs implements zzbmg {
    zzbme(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zze(zzbmm zzbmmVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmmVar);
        zzda(1, zza);
    }
}
