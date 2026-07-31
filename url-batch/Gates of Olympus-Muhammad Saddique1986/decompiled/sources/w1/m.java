package w1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f9881c;

    @Override // w1.n
    public final void a(int i3, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(n.f9882b);
            obtain.writeInt(i3);
            obtain.writeStringArray(strArr);
            this.f9881c.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9881c;
    }

    @Override // w1.n
    public final int c(l lVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(n.f9882b);
            obtain.writeStrongInterface(lVar);
            obtain.writeString("salon_ledger.db");
            this.f9881c.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
