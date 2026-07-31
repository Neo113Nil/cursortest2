package com.google.android.gms.measurement.internal;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzgq extends com.google.android.gms.internal.measurement.zzbn implements zzgr {
    public zzgq() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 2) {
            return false;
        }
        zzpe zzpeVar = (zzpe) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzpe.CREATOR);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
        zze(zzpeVar);
        return true;
    }
}
