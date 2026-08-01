package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbpr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcj extends zzavg implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbpr getAdapterCreator() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        zzbpr zzf = zzbpq.zzf(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel zzbh = zzbh(1, zza());
        zzen zzenVar = (zzen) zzavi.zza(zzbh, zzen.CREATOR);
        zzbh.recycle();
        return zzenVar;
    }
}
