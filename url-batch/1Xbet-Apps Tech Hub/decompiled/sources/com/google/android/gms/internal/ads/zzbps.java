package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbps extends zzavg implements zzbpu {
    zzbps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzE() throws RemoteException {
        zzbi(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzF() throws RemoteException {
        zzbi(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzI() throws RemoteException {
        zzbi(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzL() throws RemoteException {
        zzbi(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final boolean zzM() throws RemoteException {
        Parcel zzbh = zzbh(22, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final boolean zzN() throws RemoteException {
        Parcel zzbh = zzbh(13, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqc zzO() throws RemoteException {
        zzbqc zzbqcVar;
        Parcel zzbh = zzbh(15, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbqcVar = queryLocalInterface instanceof zzbqc ? (zzbqc) queryLocalInterface : new zzbqc(readStrongBinder);
        }
        zzbh.recycle();
        return zzbqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqd zzP() throws RemoteException {
        zzbqd zzbqdVar;
        Parcel zzbh = zzbh(16, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbqdVar = queryLocalInterface instanceof zzbqd ? (zzbqd) queryLocalInterface : new zzbqd(readStrongBinder);
        }
        zzbh.recycle();
        return zzbqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbh = zzbh(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbhc zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqa zzj() throws RemoteException {
        zzbqa zzbpyVar;
        Parcel zzbh = zzbh(36, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpyVar = queryLocalInterface instanceof zzbqa ? (zzbqa) queryLocalInterface : new zzbpy(readStrongBinder);
        }
        zzbh.recycle();
        return zzbpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqg zzk() throws RemoteException {
        zzbqg zzbqeVar;
        Parcel zzbh = zzbh(27, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbqeVar = queryLocalInterface instanceof zzbqg ? (zzbqg) queryLocalInterface : new zzbqe(readStrongBinder);
        }
        zzbh.recycle();
        return zzbqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbsd zzl() throws RemoteException {
        Parcel zzbh = zzbh(33, zza());
        zzbsd zzbsdVar = (zzbsd) zzavi.zza(zzbh, zzbsd.CREATOR);
        zzbh.recycle();
        return zzbsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbsd zzm() throws RemoteException {
        Parcel zzbh = zzbh(34, zza());
        zzbsd zzbsdVar = (zzbsd) zzavi.zza(zzbh, zzbsd.CREATOR);
        zzbh.recycle();
        return zzbsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzo() throws RemoteException {
        zzbi(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbxb zzbxbVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(null);
        zzavi.zzf(zza, zzbxbVar);
        zza.writeString(str2);
        zzbi(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(IObjectWrapper iObjectWrapper, zzbme zzbmeVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbmeVar);
        zza.writeTypedList(list);
        zzbi(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbxbVar);
        zza.writeStringList(list);
        zzbi(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbi(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzqVar);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzqVar);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar, zzbfw zzbfwVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzf(zza, zzbpxVar);
        zzavi.zzd(zza, zzbfwVar);
        zza.writeStringList(list);
        zzbi(14, zza);
    }
}
