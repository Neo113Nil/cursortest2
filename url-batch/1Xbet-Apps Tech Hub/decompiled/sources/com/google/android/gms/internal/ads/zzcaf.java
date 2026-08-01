package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcaf extends zzavg implements zzcah {
    zzcaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    public final zzcae zze(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) throws RemoteException {
        zzcae zzcacVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(2, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzcacVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcacVar = queryLocalInterface instanceof zzcae ? (zzcae) queryLocalInterface : new zzcac(readStrongBinder);
        }
        zzbh.recycle();
        return zzcacVar;
    }
}
