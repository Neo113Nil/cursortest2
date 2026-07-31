package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzaz extends zzat implements zzba {
    public zzaz() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzat
    protected final boolean dispatchTransaction(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        enforceNoDataAvail(parcel);
        zza(readInt);
        return true;
    }
}
