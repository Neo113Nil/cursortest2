package d2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8297a;

    public r(IBinder iBinder) {
        this.f8297a = iBinder;
    }

    public final void a(u uVar, C0386d c0386d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(uVar);
            obtain.writeInt(1);
            H.h.a(c0386d, obtain, 0);
            this.f8297a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8297a;
    }
}
