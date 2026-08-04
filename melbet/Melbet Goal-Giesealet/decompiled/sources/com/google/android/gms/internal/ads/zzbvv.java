package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbvv extends zzaxz implements zzbvx {
    zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final String zze() throws RemoteException {
        Parcel zzde = zzde(1, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final int zzf() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        int readInt = zzde.readInt();
        zzde.recycle();
        return readInt;
    }
}
