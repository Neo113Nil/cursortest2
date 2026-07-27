package B1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209a;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f210e;

    /* renamed from: f, reason: collision with root package name */
    public final String f211f;

    public /* synthetic */ a(IBinder iBinder, String str, int i2) {
        this.f209a = i2;
        this.f210e = iBinder;
        this.f211f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f209a) {
        }
        return this.f210e;
    }

    public void b(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f210e.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f211f);
        return obtain;
    }

    public Parcel d(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f210e.transact(i2, parcel, obtain, 0);
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

    public Parcel e(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f210e.transact(i2, parcel, obtain, 0);
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

    public void f(Parcel parcel, int i2) {
        switch (this.f209a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                try {
                    this.f210e.transact(i2, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    obtain.recycle();
                }
            default:
                try {
                    this.f210e.transact(i2, parcel, null, 1);
                    return;
                } finally {
                    parcel.recycle();
                }
        }
    }
}
