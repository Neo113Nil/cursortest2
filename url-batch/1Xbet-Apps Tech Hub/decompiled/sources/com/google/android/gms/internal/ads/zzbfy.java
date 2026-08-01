package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbfy extends zzavg implements zzbga {
    zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final String zzg() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final List zzh() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        ArrayList zzb = zzavi.zzb(zzbh);
        zzbh.recycle();
        return zzb;
    }
}
