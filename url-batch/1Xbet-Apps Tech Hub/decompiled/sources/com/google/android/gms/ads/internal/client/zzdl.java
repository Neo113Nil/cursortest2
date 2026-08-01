package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdl extends zzavg implements zzdn {
    zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        Bundle bundle = (Bundle) zzavi.zza(zzbh, Bundle.CREATOR);
        zzbh.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        zzu zzuVar = (zzu) zzavi.zza(zzbh, zzu.CREATOR);
        zzbh.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() throws RemoteException {
        Parcel zzbh = zzbh(1, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() throws RemoteException {
        Parcel zzbh = zzbh(6, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        ArrayList createTypedArrayList = zzbh.createTypedArrayList(zzu.CREATOR);
        zzbh.recycle();
        return createTypedArrayList;
    }
}
