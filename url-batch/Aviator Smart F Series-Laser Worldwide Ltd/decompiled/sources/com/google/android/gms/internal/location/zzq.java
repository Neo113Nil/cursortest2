package com.google.android.gms.internal.location;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzq extends zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzl zzlVar = (zzl) zzc.zza(parcel, zzl.CREATOR);
            zzc.zzd(parcel);
            zzd(zzlVar);
        } else {
            if (i8 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
