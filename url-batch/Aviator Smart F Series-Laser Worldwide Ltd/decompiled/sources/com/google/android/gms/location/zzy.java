package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzy extends com.google.android.gms.internal.location.zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzz zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzx(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Location location = (Location) com.google.android.gms.internal.location.zzc.zza(parcel, Location.CREATOR);
            com.google.android.gms.internal.location.zzc.zzd(parcel);
            zzd(location);
        } else {
            if (i8 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
