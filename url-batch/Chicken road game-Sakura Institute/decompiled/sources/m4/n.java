package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f6385c;

    public n(IBinder iBinder) {
        this.f6385c = iBinder;
    }

    public final void a(q qVar, c cVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(qVar);
            obtain.writeInt(1);
            d4.a.a(cVar, obtain, 0);
            this.f6385c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6385c;
    }
}
