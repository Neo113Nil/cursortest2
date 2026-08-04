package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbaa extends zzaya implements zzbab {
    public zzbaa() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbab zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof zzbab ? (zzbab) queryLocalInterface : new zzazz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbai zzbagVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbx zze = zze();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzbaf) {
                    }
                }
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbagVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbagVar = queryLocalInterface2 instanceof zzbai ? (zzbai) queryLocalInterface2 : new zzbag(readStrongBinder2);
                }
                zzayb.zzh(parcel);
                zzf(asInterface, zzbagVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzea zzg = zzg();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzg);
                return true;
            case 6:
                boolean zza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzh(zza);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdt zzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 8:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 9:
                long zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                zzayb.zzh(parcel);
                zzl(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
