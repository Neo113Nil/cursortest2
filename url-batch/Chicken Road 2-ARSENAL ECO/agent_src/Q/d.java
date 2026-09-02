package Q;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f1914d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1914d;
    }

    public final void b(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f1914d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
