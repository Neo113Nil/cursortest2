package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f4081c;

    @Override // androidx.room.l
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(l.f4082a);
            obtain.writeStringArray(strArr);
            this.f4081c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4081c;
    }
}
