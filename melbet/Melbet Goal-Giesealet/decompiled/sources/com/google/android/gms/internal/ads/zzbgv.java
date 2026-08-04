package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbgv extends zzaxz implements zzbgx {
    zzbgv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze(zzbgn zzbgnVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbgnVar);
        zzdf(1, zza);
    }
}
