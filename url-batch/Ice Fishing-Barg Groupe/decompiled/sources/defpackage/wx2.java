package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wx2 implements pm0, IInterface {
    public final IBinder TSizfFm2Yiuu;

    public wx2(IBinder iBinder) {
        this.TSizfFm2Yiuu = iBinder;
    }

    public final Account PxuCJdSBwIXG() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.TSizfFm2Yiuu.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) bx2.PxuCJdSBwIXG(obtain, Account.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.TSizfFm2Yiuu;
    }
}
