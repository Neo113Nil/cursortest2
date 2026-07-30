package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yu1 implements t60, IInterface {
    public final IBinder b;

    public yu1(IBinder iBinder) {
        this.b = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.b.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) ut1.a(obtain, Account.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }
}
