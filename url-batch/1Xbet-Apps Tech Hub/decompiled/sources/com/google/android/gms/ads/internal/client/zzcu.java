package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzavg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcu extends zzavg implements zzcw {
    zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zze() throws RemoteException {
        Parcel zzbh = zzbh(1, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zzf() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }
}
