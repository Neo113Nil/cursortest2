package U0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class s implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f2579d;

    public s(IBinder iBinder) {
        this.f2579d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2579d;
    }

    public final void b(v vVar, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(vVar);
            obtain.writeInt(1);
            I.j.a(eVar, obtain, 0);
            this.f2579d.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
