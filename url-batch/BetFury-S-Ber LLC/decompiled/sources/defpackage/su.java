package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class su implements tu {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.tu
    public final int b(ru ruVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(tu.b);
            obtain.writeStrongInterface(ruVar);
            obtain.writeString(str);
            this.c.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.tu
    public final void c(ru ruVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(tu.b);
            obtain.writeStrongInterface(ruVar);
            obtain.writeInt(i);
            this.c.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.tu
    public final void d(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(tu.b);
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.c.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
