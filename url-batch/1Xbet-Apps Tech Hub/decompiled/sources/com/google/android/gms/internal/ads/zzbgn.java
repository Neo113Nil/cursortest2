package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbgn extends zzavg implements zzbgp {
    zzbgn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbgp
    public final IBinder zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, iObjectWrapper2);
        zzavi.zzf(zza, iObjectWrapper3);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(1, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        zzbh.recycle();
        return readStrongBinder;
    }
}
