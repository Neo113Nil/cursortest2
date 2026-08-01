package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzblf extends zzavg implements zzblh {
    zzblf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final zzble zze(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i, zzblb zzblbVar) throws RemoteException {
        zzble zzblcVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        zzavi.zzf(zza, zzblbVar);
        Parcel zzbh = zzbh(1, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzblcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzblcVar = queryLocalInterface instanceof zzble ? (zzble) queryLocalInterface : new zzblc(readStrongBinder);
        }
        zzbh.recycle();
        return zzblcVar;
    }
}
