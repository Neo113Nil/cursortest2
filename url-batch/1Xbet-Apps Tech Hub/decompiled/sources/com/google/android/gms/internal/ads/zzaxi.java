package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzaxi extends zzavh implements zzaxj {
    public zzaxi() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaxq zzaxoVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbu zze = zze();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzaxn) {
                    }
                }
                zzavi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzaxoVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzaxoVar = queryLocalInterface2 instanceof zzaxq ? (zzaxq) queryLocalInterface2 : new zzaxo(readStrongBinder2);
                }
                zzavi.zzc(parcel);
                zzi(asInterface, zzaxoVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdn zzf = zzf();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzf);
                return true;
            case 6:
                boolean zzg = zzavi.zzg(parcel);
                zzavi.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdg zzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
