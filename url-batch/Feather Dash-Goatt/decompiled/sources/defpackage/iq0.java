package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iq0 {
    public final String a;
    public final int b;
    public final Notification c;

    public iq0(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(z60 z60Var) {
        String str = this.a;
        int i = this.b;
        x60 x60Var = (x60) z60Var;
        x60Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(z60.a);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            Notification notification = this.c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            x60Var.b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:null]";
    }
}
