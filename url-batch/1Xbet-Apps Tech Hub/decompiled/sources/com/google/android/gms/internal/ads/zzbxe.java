package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbxe extends zzavg implements zzbxg {
    zzbxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final int zze() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        int readInt = zzbh.readInt();
        zzbh.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final String zzf() throws RemoteException {
        Parcel zzbh = zzbh(1, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }
}
