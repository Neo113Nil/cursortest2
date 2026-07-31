package d0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f15475a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15476b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f15477c;

    public e(int i7, Notification notification, int i8) {
        this.f15475a = i7;
        this.f15477c = notification;
        this.f15476b = i8;
    }

    public int a() {
        return this.f15476b;
    }

    public Notification b() {
        return this.f15477c;
    }

    public int c() {
        return this.f15475a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f15475a == eVar.f15475a && this.f15476b == eVar.f15476b) {
            return this.f15477c.equals(eVar.f15477c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f15475a * 31) + this.f15476b) * 31) + this.f15477c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f15475a + ", mForegroundServiceType=" + this.f15476b + ", mNotification=" + this.f15477c + '}';
    }
}
