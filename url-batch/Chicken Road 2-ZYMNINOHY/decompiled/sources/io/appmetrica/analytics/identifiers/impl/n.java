package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class n extends Binder implements o {
    public n() {
        attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    public static o a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new m(iBinder) : (o) queryLocalInterface;
    }

    public abstract /* synthetic */ String a() throws RemoteException;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract /* synthetic */ boolean b() throws RemoteException;

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            String a3 = a();
            parcel2.writeNoException();
            parcel2.writeString(a3);
            return true;
        }
        if (i4 != 2) {
            if (i4 != 1598968902) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return true;
        }
        parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        boolean b4 = b();
        parcel2.writeNoException();
        parcel2.writeInt(b4 ? 1 : 0);
        return true;
    }
}
