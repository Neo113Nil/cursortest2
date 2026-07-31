package r3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h1 extends b4.a implements i {
    h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // r3.i
    public final Account a() {
        Parcel E = E(2, q0());
        Account account = (Account) b4.c.b(E, Account.CREATOR);
        E.recycle();
        return account;
    }
}
