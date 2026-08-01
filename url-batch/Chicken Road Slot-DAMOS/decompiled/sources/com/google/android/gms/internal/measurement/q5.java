package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q5 extends Binder implements IInterface {
    public q5(String str) {
        attachInterface(this, str);
    }

    public abstract boolean C(int i3, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i10)) {
            return true;
        }
        return C(i3, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
