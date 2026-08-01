package z4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f10728d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10728d;
    }

    @Override // z4.d
    public final void k(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10731b);
            obtain.writeStringArray(strArr);
            this.f10728d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
