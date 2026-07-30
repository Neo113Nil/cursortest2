package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.f8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3186f8 extends Binder implements IInterface {
    public AbstractBinderC3186f8(String str) {
        attachInterface(this, str);
    }

    public abstract boolean F3(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i4)) {
            return true;
        }
        return F3(i, parcel, parcel2);
    }
}
