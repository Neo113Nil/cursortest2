package z3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f23689f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23690g = "com.google.android.gms.appset.internal.IAppSetService";

    protected a(IBinder iBinder, String str) {
        this.f23689f = iBinder;
    }

    protected final Parcel E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23690g);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23689f;
    }

    protected final void q0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23689f.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
