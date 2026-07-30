package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbtu extends zzbcs implements zzbtw {
    zzbtu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzA(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final com.google.android.gms.ads.internal.client.zzed zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbui zzC() throws RemoteException {
        zzbui zzbugVar;
        Parcel zzcZ = zzcZ(27, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbugVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbugVar = queryLocalInterface instanceof zzbui ? (zzbui) queryLocalInterface : new zzbug(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzda(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzF(IObjectWrapper iObjectWrapper, zzbqk zzbqkVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbqkVar);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbwh zzH() throws RemoteException {
        Parcel zzcZ = zzcZ(33, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbwh zzI() throws RemoteException {
        Parcel zzcZ = zzcZ(34, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzrVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbuc zzK() throws RemoteException {
        zzbuc zzbuaVar;
        Parcel zzcZ = zzcZ(36, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbuaVar = queryLocalInterface instanceof zzbuc ? (zzbuc) queryLocalInterface : new zzbua(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzda(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzda(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbue zzO() throws RemoteException {
        zzbue zzbueVar;
        Parcel zzcZ = zzcZ(15, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbueVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbueVar = queryLocalInterface instanceof zzbue ? (zzbue) queryLocalInterface : new zzbue(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbuf zzP() throws RemoteException {
        zzbuf zzbufVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbufVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbufVar = queryLocalInterface instanceof zzbuf ? (zzbuf) queryLocalInterface : new zzbuf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzrVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzm() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzcar zzcarVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(null);
        zzbcu.zze(zza, zzcarVar);
        zza.writeString(str2);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzp() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar, zzbkh zzbkhVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzbkhVar);
        zza.writeStringList(list);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzx() throws RemoteException {
        Parcel zzcZ = zzcZ(22, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzy(IObjectWrapper iObjectWrapper, zzcar zzcarVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzcarVar);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzblm zzz() throws RemoteException {
        throw null;
    }
}
