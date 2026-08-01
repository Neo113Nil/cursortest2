package i0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139a implements InterfaceC0140b {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f2612c;

    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0140b.f2613a);
            obtain.writeStringArray(strArr);
            this.f2612c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2612c;
    }
}
