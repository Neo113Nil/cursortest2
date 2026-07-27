package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class n implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3283a;

    public n(IBinder iBinder) {
        this.f3283a = iBinder;
    }

    public final void a(q qVar, c cVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(qVar);
            obtain.writeInt(1);
            E1.l.a(cVar, obtain, 0);
            this.f3283a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3283a;
    }
}
