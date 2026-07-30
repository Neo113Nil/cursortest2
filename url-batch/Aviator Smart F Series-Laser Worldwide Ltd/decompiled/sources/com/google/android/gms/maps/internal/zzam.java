package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes3.dex */
public abstract class zzam extends com.google.android.gms.internal.maps.zzb implements zzan {
    public zzam() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, LatLng.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(latLng);
        parcel2.writeNoException();
        return true;
    }
}
