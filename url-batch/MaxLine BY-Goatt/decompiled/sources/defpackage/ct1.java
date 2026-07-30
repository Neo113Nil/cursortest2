package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ct1 {
    public final String a;
    public final int b;
    public final Notification c;

    public ct1(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(a01 a01Var) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        yz0 yz0Var = (yz0) a01Var;
        yz0Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a01.e);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            yz0Var.g.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:null]";
    }
}
