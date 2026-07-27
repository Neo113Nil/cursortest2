package H1;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class A implements d, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3229a;

    public A(IBinder iBinder) {
        this.f3229a = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f3229a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) Q1.a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3229a;
    }
}
