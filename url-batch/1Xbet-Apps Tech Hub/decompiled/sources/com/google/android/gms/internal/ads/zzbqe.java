package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbqe extends zzavg implements zzbqg {
    zzbqe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final boolean zzA() throws RemoteException {
        Parcel zzbh = zzbh(18, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final boolean zzB() throws RemoteException {
        Parcel zzbh = zzbh(17, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final double zze() throws RemoteException {
        Parcel zzbh = zzbh(8, zza());
        double readDouble = zzbh.readDouble();
        zzbh.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final float zzf() throws RemoteException {
        Parcel zzbh = zzbh(23, zza());
        float readFloat = zzbh.readFloat();
        zzbh.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final float zzg() throws RemoteException {
        Parcel zzbh = zzbh(25, zza());
        float readFloat = zzbh.readFloat();
        zzbh.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final float zzh() throws RemoteException {
        Parcel zzbh = zzbh(24, zza());
        float readFloat = zzbh.readFloat();
        zzbh.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final Bundle zzi() throws RemoteException {
        Parcel zzbh = zzbh(16, zza());
        Bundle bundle = (Bundle) zzavi.zza(zzbh, Bundle.CREATOR);
        zzbh.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final com.google.android.gms.ads.internal.client.zzdq zzj() throws RemoteException {
        Parcel zzbh = zzbh(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final zzbga zzk() throws RemoteException {
        Parcel zzbh = zzbh(12, zza());
        zzbga zzj = zzbfz.zzj(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final zzbgi zzl() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        zzbgi zzg = zzbgh.zzg(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzbh = zzbh(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbh = zzbh(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final IObjectWrapper zzo() throws RemoteException {
        Parcel zzbh = zzbh(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final String zzp() throws RemoteException {
        Parcel zzbh = zzbh(7, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final String zzq() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final String zzr() throws RemoteException {
        Parcel zzbh = zzbh(6, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final String zzs() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final String zzt() throws RemoteException {
        Parcel zzbh = zzbh(10, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final String zzu() throws RemoteException {
        Parcel zzbh = zzbh(9, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final List zzv() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        ArrayList zzb = zzavi.zzb(zzbh);
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzx() throws RemoteException {
        zzbi(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, iObjectWrapper2);
        zzavi.zzf(zza, iObjectWrapper3);
        zzbi(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(22, zza);
    }
}
