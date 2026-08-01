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
public final class zzbqd extends zzavg implements IInterface {
    zzbqd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzbh = zzbh(13, zza());
        Bundle bundle = (Bundle) zzavi.zza(zzbh, Bundle.CREATOR);
        zzbh.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzf() throws RemoteException {
        Parcel zzbh = zzbh(16, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    public final zzbga zzg() throws RemoteException {
        Parcel zzbh = zzbh(19, zza());
        zzbga zzj = zzbfz.zzj(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzj;
    }

    public final zzbgi zzh() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        zzbgi zzg = zzbgh.zzg(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzg;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzbh = zzbh(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel zzbh = zzbh(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zzbh = zzbh(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    public final String zzl() throws RemoteException {
        Parcel zzbh = zzbh(7, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
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

    public final List zzp() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        ArrayList zzb = zzavi.zzb(zzbh);
        zzbh.recycle();
        return zzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(9, zza);
    }

    public final void zzr() throws RemoteException {
        zzbi(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(10, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, iObjectWrapper2);
        zzavi.zzf(zza, iObjectWrapper3);
        zzbi(22, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzbh = zzbh(12, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    public final boolean zzw() throws RemoteException {
        Parcel zzbh = zzbh(11, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }
}
