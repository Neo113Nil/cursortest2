package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzbww;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbs extends zzavg implements zzbu {
    zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() throws RemoteException {
        zzbi(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() throws RemoteException {
        zzbi(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbeVar);
        zzbi(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbhVar);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzqVar);
        zzbi(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzcbVar);
        zzbi(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzaxm zzaxmVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzaxmVar);
        zzbi(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzwVar);
        zzbi(39, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzciVar);
        zzbi(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbty zzbtyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(22, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbea zzbeaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzdgVar);
        zzbi(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbub zzbubVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbww zzbwwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzflVar);
        zzbi(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() throws RemoteException {
        Parcel zzbh = zzbh(23, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzlVar);
        Parcel zzbh = zzbh(4, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() throws RemoteException {
        Parcel zzbh = zzbh(12, zza());
        zzq zzqVar = (zzq) zzavi.zza(zzbh, zzq.CREATOR);
        zzbh.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() throws RemoteException {
        zzbh zzbfVar;
        Parcel zzbh = zzbh(33, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
        }
        zzbh.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() throws RemoteException {
        zzcb zzbzVar;
        Parcel zzbh = zzbh(32, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzbzVar = queryLocalInterface instanceof zzcb ? (zzcb) queryLocalInterface : new zzbz(readStrongBinder);
        }
        zzbh.recycle();
        return zzbzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() throws RemoteException {
        zzdn zzdlVar;
        Parcel zzbh = zzbh(41, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzdlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdlVar = queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(readStrongBinder);
        }
        zzbh.recycle();
        return zzdlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() throws RemoteException {
        zzdq zzdoVar;
        Parcel zzbh = zzbh(26, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzdoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdoVar = queryLocalInterface instanceof zzdq ? (zzdq) queryLocalInterface : new zzdo(readStrongBinder);
        }
        zzbh.recycle();
        return zzdoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbh = zzbh(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() throws RemoteException {
        Parcel zzbh = zzbh(31, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() throws RemoteException {
        zzbi(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, zzbkVar);
        zzbi(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() throws RemoteException {
        zzbi(5, zza());
    }
}
