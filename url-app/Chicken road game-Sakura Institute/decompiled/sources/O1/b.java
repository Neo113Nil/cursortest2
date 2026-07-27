package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3632a;

    public b(IBinder iBinder) {
        this.f3632a = iBinder;
    }

    public final Parcel a(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f3632a.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3632a;
    }
}
