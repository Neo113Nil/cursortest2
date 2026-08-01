package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbmo extends zzavh implements zzbmp {
    public zzbmo() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbms zzbmqVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzdq zzb = zzb();
            parcel2.writeNoException();
            zzavi.zzf(parcel2, zzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbmqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbmqVar = queryLocalInterface instanceof zzbms ? (zzbms) queryLocalInterface : new zzbmq(readStrongBinder);
            }
            zzavi.zzc(parcel);
            zzf(asInterface, zzbmqVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzavi.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbgf zzc = zzc();
        parcel2.writeNoException();
        zzavi.zzf(parcel2, zzc);
        return true;
    }
}
