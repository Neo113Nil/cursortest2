package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f2109c;

    @Override // androidx.room.n
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(n.f2110a);
            obtain.writeStringArray(strArr);
            this.f2109c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2109c;
    }
}
