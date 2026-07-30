package y;

import android.app.Notification;
import android.os.Parcel;
import c.C0282a;
import c.InterfaceC0284c;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f8501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8502b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f8503c;

    public p(String str, int i2, Notification notification) {
        this.f8501a = str;
        this.f8502b = i2;
        this.f8503c = notification;
    }

    public final void a(InterfaceC0284c interfaceC0284c) {
        String str = this.f8501a;
        int i2 = this.f8502b;
        Notification notification = this.f8503c;
        C0282a c0282a = (C0282a) interfaceC0284c;
        c0282a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0284c.f4165d);
            obtain.writeString(str);
            obtain.writeInt(i2);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            c0282a.f4163e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f8501a + ", id:" + this.f8502b + ", tag:null]";
    }
}
