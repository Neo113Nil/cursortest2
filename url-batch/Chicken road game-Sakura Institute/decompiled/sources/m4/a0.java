package m4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements d, IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f6332c;

    public a0(IBinder iBinder) {
        this.f6332c = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f6332c.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) v4.a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e9) {
            throw e9;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6332c;
    }
}
