package t1;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: t1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912I implements InterfaceC0919f, IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f7922e;

    public C0912I(IBinder iBinder) {
        this.f7922e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7922e;
    }

    public final Account b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f7922e.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) E1.h.a(obtain, Account.CREATOR);
        } catch (RuntimeException e7) {
            throw e7;
        } finally {
            obtain.recycle();
        }
    }
}
