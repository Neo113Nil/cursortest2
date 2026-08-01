package t5;

import android.app.Notification;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9306b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f9307c;

    public g(int i3, Notification notification, int i10) {
        this.f9305a = i3;
        this.f9307c = notification;
        this.f9306b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9305a == gVar.f9305a && this.f9306b == gVar.f9306b) {
            return this.f9307c.equals(gVar.f9307c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9307c.hashCode() + (((this.f9305a * 31) + this.f9306b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f9305a + ", mForegroundServiceType=" + this.f9306b + ", mNotification=" + this.f9307c + '}';
    }
}
