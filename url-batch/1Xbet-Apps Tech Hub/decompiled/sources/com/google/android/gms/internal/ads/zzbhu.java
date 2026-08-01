package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbhu extends zzavg implements zzbhw {
    zzbhu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zze(zzbif zzbifVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbifVar);
        zzbi(1, zza);
    }
}
