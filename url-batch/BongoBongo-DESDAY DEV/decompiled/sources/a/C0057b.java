package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1227a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1228b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1229c;
    public final int d;

    public C0057b(BackEvent backEvent) {
        h1.d.e(backEvent, "backEvent");
        C0056a c0056a = C0056a.f1226a;
        float d = c0056a.d(backEvent);
        float e2 = c0056a.e(backEvent);
        float b2 = c0056a.b(backEvent);
        int c2 = c0056a.c(backEvent);
        this.f1227a = d;
        this.f1228b = e2;
        this.f1229c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1227a + ", touchY=" + this.f1228b + ", progress=" + this.f1229c + ", swipeEdge=" + this.d + '}';
    }
}
