package d2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n2.AbstractC1320a;

/* renamed from: d2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382D implements InterfaceC0387e, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8232a;

    public C0382D(IBinder iBinder) {
        this.f8232a = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f8232a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) AbstractC1320a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8232a;
    }
}
