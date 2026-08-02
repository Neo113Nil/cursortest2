package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbgy extends zzaxm implements zzbha {
    zzbgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzA() throws RemoteException {
        zzdc(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        zzdc(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzC() throws RemoteException {
        zzdc(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzcsVar);
        zzdc(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzdgVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzF(zzbgx zzbgxVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbgxVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzG() throws RemoteException {
        Parcel zzdb = zzdb(30, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzH() throws RemoteException {
        Parcel zzdb = zzdb(24, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        Parcel zzdb = zzdb(16, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final double zze() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final Bundle zzf() throws RemoteException {
        Parcel zzdb = zzdb(20, zza());
        Bundle bundle = (Bundle) zzaxo.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel zzdb = zzdb(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbew zzi() throws RemoteException {
        zzbew zzbeuVar;
        Parcel zzdb = zzdb(14, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbeuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbeuVar = queryLocalInterface instanceof zzbew ? (zzbew) queryLocalInterface : new zzbeu(readStrongBinder);
        }
        zzdb.recycle();
        return zzbeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbfa zzj() throws RemoteException {
        zzbfa zzbeyVar;
        Parcel zzdb = zzdb(29, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbeyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbeyVar = queryLocalInterface instanceof zzbfa ? (zzbfa) queryLocalInterface : new zzbey(readStrongBinder);
        }
        zzdb.recycle();
        return zzbeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbfd zzk() throws RemoteException {
        zzbfd zzbfbVar;
        Parcel zzdb = zzdb(5, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfbVar = queryLocalInterface instanceof zzbfd ? (zzbfd) queryLocalInterface : new zzbfb(readStrongBinder);
        }
        zzdb.recycle();
        return zzbfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzdb = zzdb(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzdb = zzdb(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzn() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzo() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzp() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzq() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzs() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzt() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List zzu() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzaxo.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List zzv() throws RemoteException {
        Parcel zzdb = zzdb(23, zza());
        ArrayList zzb = zzaxo.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzw() throws RemoteException {
        zzdc(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzx() throws RemoteException {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzcwVar);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        zzdc(15, zza);
    }
}
