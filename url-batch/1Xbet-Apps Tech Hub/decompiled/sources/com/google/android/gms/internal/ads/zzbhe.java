package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbhe extends zzavg implements zzbhg {
    zzbhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zze(zzbgx zzbgxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbgxVar);
        zzbi(1, zza);
    }
}
