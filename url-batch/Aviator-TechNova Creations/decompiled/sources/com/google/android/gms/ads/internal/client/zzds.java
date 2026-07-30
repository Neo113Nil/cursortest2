package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzds extends zzbct implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzt zztVar = (zzt) zzbcu.zzb(parcel, zzt.CREATOR);
            zzbcu.zzh(parcel);
            zze(zztVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = zzbcu.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
