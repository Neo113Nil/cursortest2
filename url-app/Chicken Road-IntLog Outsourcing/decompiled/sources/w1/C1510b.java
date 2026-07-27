package w1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1510b implements InterfaceC1512d, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f12117a;

    public C1510b(IBinder iBinder) {
        this.f12117a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12117a;
    }

    public final Parcel b(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f12117a.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }
}
