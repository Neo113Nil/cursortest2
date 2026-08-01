package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbgg extends zzavg implements zzbgi {
    zzbgg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final double zzb() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        double readDouble = zzbh.readDouble();
        zzbh.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final int zzc() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        int readInt = zzbh.readInt();
        zzbh.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final int zzd() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        int readInt = zzbh.readInt();
        zzbh.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final Uri zze() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        Uri uri = (Uri) zzavi.zza(zzbh, Uri.CREATOR);
        zzbh.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzbh = zzbh(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }
}
