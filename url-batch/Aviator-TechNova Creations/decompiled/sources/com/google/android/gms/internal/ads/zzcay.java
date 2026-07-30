package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzcay extends zzbct implements zzcaz {
    public zzcay() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcaz zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzcaz ? (zzcaz) queryLocalInterface : new zzcax(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcbg zzcbgVar = null;
        zzcbg zzcbgVar2 = null;
        zzcbh zzcbhVar = null;
        zzcbc zzcbcVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbgVar = queryLocalInterface instanceof zzcbg ? (zzcbg) queryLocalInterface : new zzcbe(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzc(zzmVar, zzcbgVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcbcVar = queryLocalInterface2 instanceof zzcbc ? (zzcbc) queryLocalInterface2 : new zzcba(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                zze(zzcbcVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzi = zzi();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zzi ? 1 : 0);
                return true;
            case 4:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzb(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcbhVar = queryLocalInterface3 instanceof zzcbh ? (zzcbh) queryLocalInterface3 : new zzcbh(readStrongBinder3);
                }
                zzbcu.zzh(parcel);
                zzs(zzcbhVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcbn zzcbnVar = (zzcbn) zzbcu.zzb(parcel, zzcbn.CREATOR);
                zzbcu.zzh(parcel);
                zzh(zzcbnVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzk(asInterface2, zza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcaw zzl = zzl();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzea zzm = zzm();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdt zzb2 = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzo(zzb2);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbgVar2 = queryLocalInterface4 instanceof zzcbg ? (zzcbg) queryLocalInterface4 : new zzcbe(readStrongBinder4);
                }
                zzbcu.zzh(parcel);
                zzd(zzmVar2, zzcbgVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zza2 = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzp(zza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 17:
                long zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(zzq);
                return true;
            case 18:
                long readLong = parcel.readLong();
                zzbcu.zzh(parcel);
                zzr(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
