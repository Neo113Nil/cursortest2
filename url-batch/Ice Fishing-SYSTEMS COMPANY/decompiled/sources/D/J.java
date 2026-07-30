package D;

import android.app.Notification;
import android.os.Parcel;
import c.C0536a;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final String f496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f497b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f498c;

    public J(String str, int i, Notification notification) {
        this.f496a = str;
        this.f497b = i;
        this.f498c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f496a;
        int i = this.f497b;
        C0536a c0536a = (C0536a) cVar;
        c0536a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.f5633k0);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            Notification notification = this.f498c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0536a.f5631n.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f496a);
        sb.append(", id:");
        return AbstractC5051n.e(this.f497b, ", tag:null]", sb);
    }
}
