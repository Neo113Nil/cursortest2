package u0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5093d implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public IBinder f41014n;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f41014n;
    }

    public final void i0(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f41014n.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
