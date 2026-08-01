package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbhy extends zzavh implements zzbhz {
    public zzbhy() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static zzbhz zzc(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof zzbhz ? (zzbhz) queryLocalInterface : new zzbhx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        zzavi.zzc(parcel);
        boolean zzb = zzb(asInterface);
        parcel2.writeNoException();
        parcel2.writeInt(zzb ? 1 : 0);
        return true;
    }
}
