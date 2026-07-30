package C1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f288e;

    /* renamed from: f, reason: collision with root package name */
    public final String f289f;

    public a(IBinder iBinder, String str) {
        this.f288e = iBinder;
        this.f289f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f288e;
    }

    public final void b(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f288e.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
