package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbdy extends zzavg implements zzbea {
    zzbdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbea
    public final void zze(zzbdx zzbdxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbdxVar);
        zzbi(1, zza);
    }
}
