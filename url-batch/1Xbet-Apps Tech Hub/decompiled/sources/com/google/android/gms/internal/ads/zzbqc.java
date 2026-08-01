package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbqc extends zzavg implements IInterface {
    zzbqc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws RemoteException {
        Parcel zzbh = zzbh(7, zza());
        double readDouble = zzbh.readDouble();
        zzbh.recycle();
        return readDouble;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel zzbh = zzbh(15, zza());
        Bundle bundle = (Bundle) zzavi.zza(zzbh, Bundle.CREATOR);
        zzbh.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzg() throws RemoteException {
        Parcel zzbh = zzbh(17, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    public final zzbga zzh() throws RemoteException {
        Parcel zzbh = zzbh(19, zza());
        zzbga zzj = zzbfz.zzj(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzj;
    }

    public final zzbgi zzi() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        zzbgi zzg = zzbgh.zzg(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzg;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel zzbh = zzbh(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zzbh = zzbh(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzbh = zzbh(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    public final String zzm() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel zzbh = zzbh(6, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel zzbh = zzbh(9, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzbh = zzbh(8, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    public final List zzr() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        ArrayList zzb = zzavi.zzb(zzbh);
        zzbh.recycle();
        return zzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(11, zza);
    }

    public final void zzt() throws RemoteException {
        zzbi(10, zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(12, zza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, iObjectWrapper2);
        zzavi.zzf(zza, iObjectWrapper3);
        zzbi(22, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(16, zza);
    }

    public final boolean zzx() throws RemoteException {
        Parcel zzbh = zzbh(14, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    public final boolean zzy() throws RemoteException {
        Parcel zzbh = zzbh(13, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }
}
