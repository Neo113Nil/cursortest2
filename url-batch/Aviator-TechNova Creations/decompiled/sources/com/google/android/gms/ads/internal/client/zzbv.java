package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzcam;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbv extends zzbcs implements zzbx {
    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzA() throws RemoteException {
        Parcel zzcZ = zzcZ(46, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzcam zzcamVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzed zzF() throws RemoteException {
        zzed zzebVar;
        Parcel zzcZ = zzcZ(26, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzebVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzebVar = queryLocalInterface instanceof zzed ? (zzed) queryLocalInterface : new zzeb(readStrongBinder);
        }
        zzcZ.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(zzga zzgaVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzgaVar);
        zzda(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzeh zzehVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbfa zzbfaVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbfaVar);
        zzda(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdtVar);
        zzda(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzm zzmVar, zzbn zzbnVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, zzbnVar);
        zzda(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzda(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzcv zzcvVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcvVar);
        zzda(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(48, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final long zzU() throws RemoteException {
        Parcel zzcZ = zzcZ(47, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzY(zzcs zzcsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzc() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdR(zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbkVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zze(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzf() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzg() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(zzco zzcoVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcoVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(zzcb zzcbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzm() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzr zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzr zzrVar = (zzr) zzbcu.zzb(zzcZ, zzr.CREATOR);
        zzcZ.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzo(zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbyb zzbybVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbye zzbyeVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzea zzt() throws RemoteException {
        zzea zzdyVar;
        Parcel zzcZ = zzcZ(41, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdyVar = queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(31, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzco zzv() throws RemoteException {
        zzco zzcmVar;
        Parcel zzcZ = zzcZ(32, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk zzw() throws RemoteException {
        zzbk zzbiVar;
        Parcel zzcZ = zzcZ(33, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbiVar = queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx(zzbhz zzbhzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbhVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(22, zza);
    }
}
