package y3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f23467f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23468g;

    protected a(IBinder iBinder, String str) {
        this.f23467f = iBinder;
        this.f23468g = str;
    }

    protected final Parcel E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23468g);
        return obtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f23467f;
    }

    protected final Parcel q0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f23467f.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }
}
