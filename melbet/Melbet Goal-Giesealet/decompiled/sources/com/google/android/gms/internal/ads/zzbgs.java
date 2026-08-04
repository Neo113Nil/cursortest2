package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbgs extends zzaxz implements zzbgu {
    zzbgs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final void zze(zzbgl zzbglVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbglVar);
        zzdf(1, zza);
    }
}
