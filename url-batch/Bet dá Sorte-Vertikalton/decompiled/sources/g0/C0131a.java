package g0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131a implements InterfaceC0132b {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f2473c;

    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0132b.f2474a);
            obtain.writeStringArray(strArr);
            this.f2473c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2473c;
    }
}
