package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbpk extends zzaxz implements zzbpm {
    zzbpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzA() throws RemoteException {
        Parcel zzde = zzde(24, zza());
        float readFloat = zzde.readFloat();
        zzde.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzB() throws RemoteException {
        Parcel zzde = zzde(25, zza());
        float readFloat = zzde.readFloat();
        zzde.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzC() throws RemoteException {
        zzdf(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zze() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final List zzf() throws RemoteException {
        Parcel zzde = zzde(3, zza());
        ArrayList zzf = zzayb.zzf(zzde);
        zzde.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzg() throws RemoteException {
        Parcel zzde = zzde(4, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfw zzh() throws RemoteException {
        Parcel zzde = zzde(5, zza());
        zzbfw zzh = zzbfv.zzh(zzde.readStrongBinder());
        zzde.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzi() throws RemoteException {
        Parcel zzde = zzde(6, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzj() throws RemoteException {
        Parcel zzde = zzde(7, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final double zzk() throws RemoteException {
        Parcel zzde = zzde(8, zza());
        double readDouble = zzde.readDouble();
        zzde.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzl() throws RemoteException {
        Parcel zzde = zzde(9, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzm() throws RemoteException {
        Parcel zzde = zzde(10, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        Parcel zzde = zzde(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfp zzo() throws RemoteException {
        Parcel zzde = zzde(12, zza());
        zzbfp zzj = zzbfo.zzj(zzde.readStrongBinder());
        zzde.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzp() throws RemoteException {
        Parcel zzde = zzde(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzq() throws RemoteException {
        Parcel zzde = zzde(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzr() throws RemoteException {
        Parcel zzde = zzde(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final Bundle zzs() throws RemoteException {
        Parcel zzde = zzde(16, zza());
        Bundle bundle = (Bundle) zzayb.zzb(zzde, Bundle.CREATOR);
        zzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzt() throws RemoteException {
        Parcel zzde = zzde(17, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzu() throws RemoteException {
        Parcel zzde = zzde(18, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() throws RemoteException {
        zzdf(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, iObjectWrapper2);
        zzayb.zze(zza, iObjectWrapper3);
        zzdf(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzz() throws RemoteException {
        Parcel zzde = zzde(23, zza());
        float readFloat = zzde.readFloat();
        zzde.recycle();
        return readFloat;
    }
}
