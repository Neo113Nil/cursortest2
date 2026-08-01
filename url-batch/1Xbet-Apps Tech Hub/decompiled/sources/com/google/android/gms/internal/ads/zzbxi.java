package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbxi extends zzavh implements zzbxj {
    public zzbxi() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbxj zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbxj ? (zzbxj) queryLocalInterface : new zzbxh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxq zzbxqVar = null;
        zzbxq zzbxqVar2 = null;
        zzbxr zzbxrVar = null;
        zzbxm zzbxmVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbxqVar = queryLocalInterface instanceof zzbxq ? (zzbxq) queryLocalInterface : new zzbxo(readStrongBinder);
                }
                zzavi.zzc(parcel);
                zzf(zzlVar, zzbxqVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbxmVar = queryLocalInterface2 instanceof zzbxm ? (zzbxm) queryLocalInterface2 : new zzbxk(readStrongBinder2);
                }
                zzavi.zzc(parcel);
                zzk(zzbxmVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = zzavi.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbxrVar = queryLocalInterface3 instanceof zzbxr ? (zzbxr) queryLocalInterface3 : new zzbxr(readStrongBinder3);
                }
                zzavi.zzc(parcel);
                zzp(zzbxrVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxx zzbxxVar = (zzbxx) zzavi.zza(parcel, zzbxx.CREATOR);
                zzavi.zzc(parcel);
                zzl(zzbxxVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzavi.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzavi.zzg(parcel);
                zzavi.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbxg zzd = zzd();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbxqVar2 = queryLocalInterface4 instanceof zzbxq ? (zzbxq) queryLocalInterface4 : new zzbxo(readStrongBinder4);
                }
                zzavi.zzc(parcel);
                zzg(zzlVar2, zzbxqVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzavi.zzg(parcel);
                zzavi.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
