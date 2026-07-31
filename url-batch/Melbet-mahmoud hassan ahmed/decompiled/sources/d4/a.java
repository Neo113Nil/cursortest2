package d4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f15640f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15641g;

    protected a(IBinder iBinder, String str) {
        this.f15640f = iBinder;
        this.f15641g = str;
    }

    protected final Parcel E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15641g);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15640f;
    }

    protected final void q0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15640f.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
