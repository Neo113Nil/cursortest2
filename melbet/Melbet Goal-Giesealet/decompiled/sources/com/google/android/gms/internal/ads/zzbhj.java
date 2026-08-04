package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbhj extends zzaya implements zzbhk {
    public zzbhj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbhk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof zzbhk ? (zzbhk) queryLocalInterface : new zzbhi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbhq zzbhoVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbhoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzbhoVar = queryLocalInterface instanceof zzbhq ? (zzbhq) queryLocalInterface : new zzbho(readStrongBinder);
        }
        zzayb.zzh(parcel);
        zze(zzbhoVar);
        parcel2.writeNoException();
        return true;
    }
}
