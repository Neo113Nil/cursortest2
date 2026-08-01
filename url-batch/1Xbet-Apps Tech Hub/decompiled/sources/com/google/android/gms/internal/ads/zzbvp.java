package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbvp extends zzavh implements zzbvq {
    public zzbvp() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvt zzbvtVar = null;
        if (i == 1) {
            zzbve zzbveVar = (zzbve) zzavi.zza(parcel, zzbve.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbvtVar = queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvr(readStrongBinder);
            }
            zzavi.zzc(parcel);
            zzf(zzbveVar, zzbvtVar);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzbvt) {
                }
            }
            zzavi.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbvi zzbviVar = (zzbvi) zzavi.zza(parcel, zzbvi.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbvtVar = queryLocalInterface3 instanceof zzbvt ? (zzbvt) queryLocalInterface3 : new zzbvr(readStrongBinder3);
            }
            zzavi.zzc(parcel);
            zze(zzbviVar, zzbvtVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
