package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbpi extends zzaxz implements IInterface {
    zzbpi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    public final List zzf() throws RemoteException {
        Parcel zzde = zzde(3, zza());
        ArrayList zzf = zzayb.zzf(zzde);
        zzde.recycle();
        return zzf;
    }

    public final String zzg() throws RemoteException {
        Parcel zzde = zzde(4, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    public final zzbfw zzh() throws RemoteException {
        Parcel zzde = zzde(5, zza());
        zzbfw zzh = zzbfv.zzh(zzde.readStrongBinder());
        zzde.recycle();
        return zzh;
    }

    public final String zzi() throws RemoteException {
        Parcel zzde = zzde(6, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    public final double zzj() throws RemoteException {
        Parcel zzde = zzde(7, zza());
        double readDouble = zzde.readDouble();
        zzde.recycle();
        return readDouble;
    }

    public final String zzk() throws RemoteException {
        Parcel zzde = zzde(8, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    public final String zzl() throws RemoteException {
        Parcel zzde = zzde(9, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    public final void zzm() throws RemoteException {
        zzdf(10, zza());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(11, zza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(12, zza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzde = zzde(13, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzde = zzde(14, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel zzde = zzde(15, zza());
        Bundle bundle = (Bundle) zzayb.zzb(zzde, Bundle.CREATOR);
        zzde.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(16, zza);
    }

    public final com.google.android.gms.ads.internal.client.zzed zzt() throws RemoteException {
        Parcel zzde = zzde(17, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzde = zzde(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    public final zzbfp zzv() throws RemoteException {
        Parcel zzde = zzde(19, zza());
        zzbfp zzj = zzbfo.zzj(zzde.readStrongBinder());
        zzde.recycle();
        return zzj;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        Parcel zzde = zzde(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzx() throws RemoteException {
        Parcel zzde = zzde(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, iObjectWrapper2);
        zzayb.zze(zza, iObjectWrapper3);
        zzdf(22, zza);
    }
}
