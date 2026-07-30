package B1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f172e;

    public b(IBinder iBinder) {
        this.f172e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f172e;
    }

    public final Parcel b(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f172e.transact(i2, parcel, obtain, 0);
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
