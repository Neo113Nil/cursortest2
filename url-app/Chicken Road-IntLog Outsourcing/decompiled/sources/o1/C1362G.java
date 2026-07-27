package o1;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362G implements InterfaceC1369g, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f11524a;

    public C1362G(IBinder iBinder) {
        this.f11524a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11524a;
    }

    public final Account b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f11524a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) A1.b.a(obtain, Account.CREATOR);
        } catch (RuntimeException e3) {
            throw e3;
        } finally {
            obtain.recycle();
        }
    }
}
