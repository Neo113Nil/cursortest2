package u;

import android.app.Notification;
import android.os.Parcel;
import c.C0296a;
import c.InterfaceC0298c;

/* renamed from: u.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454B {

    /* renamed from: a, reason: collision with root package name */
    public final String f11969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11970b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f11971c;

    public C1454B(String str, int i2, Notification notification) {
        this.f11969a = str;
        this.f11970b = i2;
        this.f11971c = notification;
    }

    public final void a(InterfaceC0298c interfaceC0298c) {
        String str = this.f11969a;
        int i2 = this.f11970b;
        C0296a c0296a = (C0296a) interfaceC0298c;
        c0296a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0298c.f4864d);
            obtain.writeString(str);
            obtain.writeInt(i2);
            obtain.writeString(null);
            Notification notification = this.f11971c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0296a.f4862a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f11969a + ", id:" + this.f11970b + ", tag:null]";
    }
}
