package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.fitness.data.BleDevice;

/* loaded from: classes3.dex */
public abstract class zzaa extends com.google.android.gms.internal.fitness.zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.fitness.request.IBleScanCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            BleDevice bleDevice = (BleDevice) com.google.android.gms.internal.fitness.zzc.zza(parcel, BleDevice.CREATOR);
            com.google.android.gms.internal.fitness.zzc.zzb(parcel);
            zzb(bleDevice);
        } else {
            if (i8 != 2) {
                return false;
            }
            zzc();
        }
        return true;
    }
}
