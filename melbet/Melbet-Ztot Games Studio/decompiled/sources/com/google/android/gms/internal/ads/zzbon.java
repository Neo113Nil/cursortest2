package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbon extends zzaxm implements zzbop {
    zzbon(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzaxo.zza;
        zza.writeInt(z ? 1 : 0);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final boolean zzM() throws RemoteException {
        Parcel zzdb = zzdb(22, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final boolean zzN() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbox zzO() throws RemoteException {
        zzbox zzboxVar;
        Parcel zzdb = zzdb(15, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzboxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzboxVar = queryLocalInterface instanceof zzbox ? (zzbox) queryLocalInterface : new zzbox(readStrongBinder);
        }
        zzdb.recycle();
        return zzboxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzboy zzP() throws RemoteException {
        zzboy zzboyVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzboyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzboyVar = queryLocalInterface instanceof zzboy ? (zzboy) queryLocalInterface : new zzboy(readStrongBinder);
        }
        zzdb.recycle();
        return zzboyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzdb = zzdb(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbfx zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbov zzj() throws RemoteException {
        zzbov zzbotVar;
        Parcel zzdb = zzdb(36, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbotVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbotVar = queryLocalInterface instanceof zzbov ? (zzbov) queryLocalInterface : new zzbot(readStrongBinder);
        }
        zzdb.recycle();
        return zzbotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbpb zzk() throws RemoteException {
        zzbpb zzbozVar;
        Parcel zzdb = zzdb(27, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbozVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbozVar = queryLocalInterface instanceof zzbpb ? (zzbpb) queryLocalInterface : new zzboz(readStrongBinder);
        }
        zzdb.recycle();
        return zzbozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbra zzl() throws RemoteException {
        Parcel zzdb = zzdb(33, zza());
        zzbra zzbraVar = (zzbra) zzaxo.zza(zzdb, zzbra.CREATOR);
        zzdb.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbra zzm() throws RemoteException {
        Parcel zzdb = zzdb(34, zza());
        zzbra zzbraVar = (zzbra) zzaxo.zza(zzdb, zzbra.CREATOR);
        zzdb.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvy zzbvyVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(null);
        zzaxo.zzf(zza, zzbvyVar);
        zza.writeString(str2);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzq(IObjectWrapper iObjectWrapper, zzbkz zzbkzVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbkzVar);
        zza.writeTypedList(list);
        zzdc(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvy zzbvyVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbvyVar);
        zza.writeStringList(list);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzqVar);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzqVar);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar, zzbes zzbesVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzf(zza, zzbosVar);
        zzaxo.zzd(zza, zzbesVar);
        zza.writeStringList(list);
        zzdc(14, zza);
    }
}
