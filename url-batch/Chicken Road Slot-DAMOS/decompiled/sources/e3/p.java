package e3;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f3832a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3833b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f3834c;

    public p(String str, int i3, Notification notification) {
        this.f3832a = str;
        this.f3833b = i3;
        this.f3834c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f3832a;
        int i3 = this.f3833b;
        Notification notification = this.f3834c;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.f1475a);
            obtain.writeString(str);
            obtain.writeInt(i3);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            aVar.f1473d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f3832a + ", id:" + this.f3833b + ", tag:null]";
    }
}
