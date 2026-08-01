package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbth extends zzavh implements zzbti {
    public zzbth() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbti zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbti ? (zzbti) queryLocalInterface : new zzbtg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Intent intent = (Intent) zzavi.zza(parcel, Intent.CREATOR);
            zzavi.zzc(parcel);
            zze(intent);
        } else if (i == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzavi.zzc(parcel);
            zzi(asInterface, readString, readString2);
        } else if (i == 3) {
            zzh();
        } else if (i == 4) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzavi.zzc(parcel);
            zzg(asInterface2);
        } else {
            if (i != 5) {
                return false;
            }
            String[] createStringArray = parcel.createStringArray();
            int[] createIntArray = parcel.createIntArray();
            IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzavi.zzc(parcel);
            zzf(createStringArray, createIntArray, asInterface3);
        }
        parcel2.writeNoException();
        return true;
    }
}
