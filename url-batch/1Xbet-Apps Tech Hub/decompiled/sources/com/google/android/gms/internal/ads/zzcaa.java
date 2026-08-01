package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzcaa extends zzavh implements zzcab {
    public zzcaa() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzavi.zzc(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzavi.zzc(parcel);
            zzb(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
            zzavi.zzc(parcel);
            zzc(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
