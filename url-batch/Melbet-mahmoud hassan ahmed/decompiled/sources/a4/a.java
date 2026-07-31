package a4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f208f;

    /* renamed from: g, reason: collision with root package name */
    private final String f209g;

    protected a(IBinder iBinder, String str) {
        this.f208f = iBinder;
        this.f209g = str;
    }

    protected final Parcel E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f209g);
        return obtain;
    }

    protected final void O0(int i7, Parcel parcel) {
        try {
            this.f208f.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f208f;
    }

    protected final void q0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f208f.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
