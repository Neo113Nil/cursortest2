package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzblr extends zzbcs implements zzblt {
    zzblr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zze(zzblj zzbljVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbljVar);
        zzda(1, zza);
    }
}
