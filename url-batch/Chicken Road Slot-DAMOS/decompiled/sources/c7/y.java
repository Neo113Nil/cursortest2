package c7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f2005d;

    public y(IBinder iBinder) {
        this.f2005d = iBinder;
    }

    public final void C(g0 g0Var, h hVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(g0Var);
            obtain.writeInt(1);
            p.a(hVar, obtain, 0);
            this.f2005d.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2005d;
    }
}
