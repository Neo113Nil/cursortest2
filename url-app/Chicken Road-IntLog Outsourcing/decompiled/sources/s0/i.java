package s0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f11781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11782b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f11783c;

    public i(int i2, Notification notification, int i3) {
        this.f11781a = i2;
        this.f11783c = notification;
        this.f11782b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11781a == iVar.f11781a && this.f11782b == iVar.f11782b) {
            return this.f11783c.equals(iVar.f11783c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11783c.hashCode() + (((this.f11781a * 31) + this.f11782b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f11781a + ", mForegroundServiceType=" + this.f11782b + ", mNotification=" + this.f11783c + '}';
    }
}
