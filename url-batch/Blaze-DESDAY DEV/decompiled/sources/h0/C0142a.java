package h0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142a implements b {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f2553c;

    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.f2554a);
            obtain.writeStringArray(strArr);
            this.f2553c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2553c;
    }
}
