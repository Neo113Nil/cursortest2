package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbvz extends zzaya implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwa zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbwa ? (zzbwa) queryLocalInterface : new zzbvy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbwh zzbwhVar = null;
        zzbwh zzbwhVar2 = null;
        zzbwi zzbwiVar = null;
        zzbwd zzbwdVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwhVar = queryLocalInterface instanceof zzbwh ? (zzbwh) queryLocalInterface : new zzbwf(readStrongBinder);
                }
                zzayb.zzh(parcel);
                zzc(zzmVar, zzbwhVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwdVar = queryLocalInterface2 instanceof zzbwd ? (zzbwd) queryLocalInterface2 : new zzbwb(readStrongBinder2);
                }
                zzayb.zzh(parcel);
                zze(zzbwdVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzi = zzi();
                parcel2.writeNoException();
                int i3 = zzayb.zza;
                parcel2.writeInt(zzi ? 1 : 0);
                return true;
            case 4:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzb(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwiVar = queryLocalInterface3 instanceof zzbwi ? (zzbwi) queryLocalInterface3 : new zzbwi(readStrongBinder3);
                }
                zzayb.zzh(parcel);
                zzs(zzbwiVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwo zzbwoVar = (zzbwo) zzayb.zzb(parcel, zzbwo.CREATOR);
                zzayb.zzh(parcel);
                zzh(zzbwoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzk(asInterface2, zza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvx zzl = zzl();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzea zzm = zzm();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdt zzb2 = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(zzb2);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwhVar2 = queryLocalInterface4 instanceof zzbwh ? (zzbwh) queryLocalInterface4 : new zzbwf(readStrongBinder4);
                }
                zzayb.zzh(parcel);
                zzd(zzmVar2, zzbwhVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zza2 = zzayb.zza(parcel);
                zzayb.zzh(parcel);
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
                zzayb.zzh(parcel);
                zzr(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
