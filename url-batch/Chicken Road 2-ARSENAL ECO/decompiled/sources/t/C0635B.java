package t;

import android.app.Notification;
import android.os.Parcel;
import c.C0267a;

/* renamed from: t.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635B {

    /* renamed from: a, reason: collision with root package name */
    public final String f5882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5883b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f5884c;

    public C0635B(String str, int i7, Notification notification) {
        this.f5882a = str;
        this.f5883b = i7;
        this.f5884c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f5882a;
        int i7 = this.f5883b;
        C0267a c0267a = (C0267a) cVar;
        c0267a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.f3749c);
            obtain.writeString(str);
            obtain.writeInt(i7);
            obtain.writeString(null);
            Notification notification = this.f5884c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0267a.f3747d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f5882a + ", id:" + this.f5883b + ", tag:null]";
    }
}
