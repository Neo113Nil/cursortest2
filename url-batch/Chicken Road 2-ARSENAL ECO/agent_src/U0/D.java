package U0;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class D implements f, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f2506d;

    public D(IBinder iBinder) {
        this.f2506d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2506d;
    }

    public final Account b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f2506d.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) e1.b.a(obtain, Account.CREATOR);
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            obtain.recycle();
        }
    }
}
