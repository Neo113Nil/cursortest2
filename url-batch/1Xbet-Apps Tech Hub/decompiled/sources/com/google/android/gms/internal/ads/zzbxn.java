package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbxn extends zzavg implements IInterface {
    zzbxn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbpr zzbprVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(1, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        zzbh.recycle();
        return readStrongBinder;
    }
}
