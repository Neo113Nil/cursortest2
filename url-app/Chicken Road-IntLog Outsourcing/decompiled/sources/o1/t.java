package o1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f11600a;

    public t(IBinder iBinder) {
        this.f11600a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11600a;
    }

    public final void b(w wVar, C1368f c1368f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(wVar);
            obtain.writeInt(1);
            C1357B.a(c1368f, obtain, 0);
            this.f11600a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
