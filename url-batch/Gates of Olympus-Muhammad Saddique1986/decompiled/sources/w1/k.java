package w1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f9879c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9879c;
    }

    @Override // w1.l
    public final void b(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(l.f9880a);
            obtain.writeStringArray(strArr);
            this.f9879c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
