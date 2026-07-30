package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbzm extends zzbcs implements IInterface {
    zzbzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzbzd zzbzdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, zzbzdVar);
        zzda(1, zza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbaVar);
        zzda(2, zza);
    }
}
