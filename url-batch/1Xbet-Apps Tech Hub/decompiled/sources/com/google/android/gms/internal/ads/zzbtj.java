package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbtj extends zzavg implements zzbtl {
    zzbtj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final zzbti zze(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) throws RemoteException {
        zzbti zzbtgVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(1, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbtgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbtgVar = queryLocalInterface instanceof zzbti ? (zzbti) queryLocalInterface : new zzbtg(readStrongBinder);
        }
        zzbh.recycle();
        return zzbtgVar;
    }
}
