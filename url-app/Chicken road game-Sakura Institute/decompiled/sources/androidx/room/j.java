package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f1090c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1090c;
    }

    @Override // androidx.room.k
    public final void c(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(k.f1091a);
            obtain.writeStringArray(strArr);
            this.f1090c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
