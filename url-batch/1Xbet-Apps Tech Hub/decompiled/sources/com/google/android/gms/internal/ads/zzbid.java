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
public final class zzbid extends zzavg implements zzbif {
    zzbid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzA() throws RemoteException {
        zzbi(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, bundle);
        zzbi(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzC() throws RemoteException {
        zzbi(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzcsVar);
        zzbi(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzdgVar);
        zzbi(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzF(zzbic zzbicVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbicVar);
        zzbi(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzG() throws RemoteException {
        Parcel zzbh = zzbh(30, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzH() throws RemoteException {
        Parcel zzbh = zzbh(24, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, bundle);
        Parcel zzbh = zzbh(16, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final double zze() throws RemoteException {
        Parcel zzbh = zzbh(8, zza());
        double readDouble = zzbh.readDouble();
        zzbh.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final Bundle zzf() throws RemoteException {
        Parcel zzbh = zzbh(20, zza());
        Bundle bundle = (Bundle) zzavi.zza(zzbh, Bundle.CREATOR);
        zzbh.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel zzbh = zzbh(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbh = zzbh(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final zzbga zzi() throws RemoteException {
        zzbga zzbfyVar;
        Parcel zzbh = zzbh(14, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfyVar = queryLocalInterface instanceof zzbga ? (zzbga) queryLocalInterface : new zzbfy(readStrongBinder);
        }
        zzbh.recycle();
        return zzbfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final zzbgf zzj() throws RemoteException {
        zzbgf zzbgdVar;
        Parcel zzbh = zzbh(29, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbgdVar = queryLocalInterface instanceof zzbgf ? (zzbgf) queryLocalInterface : new zzbgd(readStrongBinder);
        }
        zzbh.recycle();
        return zzbgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final zzbgi zzk() throws RemoteException {
        zzbgi zzbggVar;
        Parcel zzbh = zzbh(5, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbggVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbggVar = queryLocalInterface instanceof zzbgi ? (zzbgi) queryLocalInterface : new zzbgg(readStrongBinder);
        }
        zzbh.recycle();
        return zzbggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzbh = zzbh(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzbh = zzbh(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzn() throws RemoteException {
        Parcel zzbh = zzbh(7, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzo() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzp() throws RemoteException {
        Parcel zzbh = zzbh(6, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzq() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzr() throws RemoteException {
        Parcel zzbh = zzbh(12, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzs() throws RemoteException {
        Parcel zzbh = zzbh(10, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzt() throws RemoteException {
        Parcel zzbh = zzbh(9, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final List zzu() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        ArrayList zzb = zzavi.zzb(zzbh);
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final List zzv() throws RemoteException {
        Parcel zzbh = zzbh(23, zza());
        ArrayList zzb = zzavi.zzb(zzbh);
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzw() throws RemoteException {
        zzbi(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzx() throws RemoteException {
        zzbi(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzcwVar);
        zzbi(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, bundle);
        zzbi(15, zza);
    }
}
