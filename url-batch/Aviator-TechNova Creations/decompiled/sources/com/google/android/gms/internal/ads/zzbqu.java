package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzbqu extends zzbct implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbqy zzbqwVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzed zzb = zzb();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzb);
            return true;
        }
        if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbqwVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbqwVar = queryLocalInterface instanceof zzbqy ? (zzbqy) queryLocalInterface : new zzbqw(readStrongBinder);
            }
            zzbcu.zzh(parcel);
            zzd(asInterface, zzbqwVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbkp zzf = zzf();
        parcel2.writeNoException();
        zzbcu.zze(parcel2, zzf);
        return true;
    }
}
