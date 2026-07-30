package h0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458d implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f5074e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5074e;
    }

    public final void b(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f5074e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
