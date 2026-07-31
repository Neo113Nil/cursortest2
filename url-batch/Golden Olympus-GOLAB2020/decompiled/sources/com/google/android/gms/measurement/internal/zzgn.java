package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzgn extends com.google.android.gms.internal.measurement.zzbn implements zzgo {
    public zzgn() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzov.CREATOR);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
        zze(createTypedArrayList);
        return true;
    }
}
