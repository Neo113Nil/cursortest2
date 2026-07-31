package r3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class l0 implements l {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f21295f;

    l0(IBinder iBinder) {
        this.f21295f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21295f;
    }

    @Override // r3.l
    public final void w4(k kVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                y0.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f21295f.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
