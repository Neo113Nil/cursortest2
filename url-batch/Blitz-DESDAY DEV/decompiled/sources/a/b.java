package a;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1237a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1238b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1239c;
    public final int d;

    public b(BackEvent backEvent) {
        g1.d.e(backEvent, "backEvent");
        C0052a c0052a = C0052a.f1236a;
        float d = c0052a.d(backEvent);
        float e2 = c0052a.e(backEvent);
        float b2 = c0052a.b(backEvent);
        int c2 = c0052a.c(backEvent);
        this.f1237a = d;
        this.f1238b = e2;
        this.f1239c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1237a + ", touchY=" + this.f1238b + ", progress=" + this.f1239c + ", swipeEdge=" + this.d + '}';
    }
}
