package X2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class b implements d, IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final IBinder f3828n;

    public b(IBinder iBinder) {
        this.f3828n = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3828n;
    }

    public final Parcel i0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f3828n.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e6) {
                obtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }
}
