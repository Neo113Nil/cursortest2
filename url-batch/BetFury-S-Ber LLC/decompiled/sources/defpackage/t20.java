package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class t20 extends Binder implements ru {
    public final /* synthetic */ w20 c;

    public t20(w20 w20Var) {
        this.c = w20Var;
        attachInterface(this, ru.a);
    }

    @Override // defpackage.ru
    public final void a(String[] strArr) {
        strArr.getClass();
        w20 w20Var = this.c;
        gk0.y(w20Var.d, null, new he(strArr, w20Var, (dg) null, 1), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = ru.a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a(parcel.createStringArray());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
