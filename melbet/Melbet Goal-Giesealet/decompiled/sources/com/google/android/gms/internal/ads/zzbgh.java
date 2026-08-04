package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbgh extends zzaxz implements zzbgj {
    zzbgh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final IBinder zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, iObjectWrapper2);
        zzayb.zze(zza, iObjectWrapper3);
        Parcel zzde = zzde(1, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        zzde.recycle();
        return readStrongBinder;
    }
}
