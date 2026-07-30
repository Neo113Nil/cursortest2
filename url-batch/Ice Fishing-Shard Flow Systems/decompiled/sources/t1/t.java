package t1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f8000e;

    public t(IBinder iBinder) {
        this.f8000e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8000e;
    }

    public final void b(y yVar, C0918e c0918e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(yVar);
            obtain.writeInt(1);
            C0907D.a(c0918e, obtain, 0);
            this.f8000e.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
