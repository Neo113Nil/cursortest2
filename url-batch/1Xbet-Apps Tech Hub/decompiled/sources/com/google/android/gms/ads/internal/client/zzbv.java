package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzbpr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbv extends zzavg implements IInterface {
    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbpr zzbprVar, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzqVar);
        zza.writeString(str);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        zza.writeInt(i2);
        Parcel zzbh = zzbh(2, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        zzbh.recycle();
        return readStrongBinder;
    }
}
