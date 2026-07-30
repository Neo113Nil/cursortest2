package G0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f814b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f815c;

    public j(int i2, Notification notification, int i5) {
        this.f813a = i2;
        this.f815c = notification;
        this.f814b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f813a == jVar.f813a && this.f814b == jVar.f814b) {
            return this.f815c.equals(jVar.f815c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f815c.hashCode() + (((this.f813a * 31) + this.f814b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f813a + ", mForegroundServiceType=" + this.f814b + ", mNotification=" + this.f815c + '}';
    }
}
