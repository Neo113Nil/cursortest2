package c1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0276a implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f3773d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3774e;

    public AbstractC0276a(IBinder iBinder, String str) {
        this.f3773d = iBinder;
        this.f3774e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3773d;
    }

    public final void b(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3773d.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
