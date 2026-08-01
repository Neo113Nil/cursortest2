package h0;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f2964c;

    @Override // h0.h
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(h.f2965a);
            obtain.writeStringArray(strArr);
            this.f2964c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2964c;
    }
}
