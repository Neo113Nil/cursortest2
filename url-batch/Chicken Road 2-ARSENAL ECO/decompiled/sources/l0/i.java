package l0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f5274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5275b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f5276c;

    public i(int i7, Notification notification, int i8) {
        this.f5274a = i7;
        this.f5276c = notification;
        this.f5275b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f5274a == iVar.f5274a && this.f5275b == iVar.f5275b) {
            return this.f5276c.equals(iVar.f5276c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5276c.hashCode() + (((this.f5274a * 31) + this.f5275b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f5274a + ", mForegroundServiceType=" + this.f5275b + ", mNotification=" + this.f5276c + '}';
    }
}
