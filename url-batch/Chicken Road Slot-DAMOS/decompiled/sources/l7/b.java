package l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f5890d;

    public b(IBinder iBinder) {
        this.f5890d = iBinder;
    }

    public final Parcel C(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5890d.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5890d;
    }
}
