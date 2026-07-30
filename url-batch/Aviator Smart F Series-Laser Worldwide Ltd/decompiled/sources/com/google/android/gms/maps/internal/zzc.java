package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzc extends com.google.android.gms.internal.maps.zzb implements zzd {
    public zzc() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzc();
        } else {
            if (i8 != 2) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
