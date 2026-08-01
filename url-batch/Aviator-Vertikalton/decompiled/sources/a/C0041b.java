package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041b {

    /* renamed from: a, reason: collision with root package name */
    public final float f900a;

    /* renamed from: b, reason: collision with root package name */
    public final float f901b;

    /* renamed from: c, reason: collision with root package name */
    public final float f902c;

    /* renamed from: d, reason: collision with root package name */
    public final int f903d;

    public C0041b(BackEvent backEvent) {
        X0.f.e(backEvent, "backEvent");
        C0040a c0040a = C0040a.f899a;
        float d2 = c0040a.d(backEvent);
        float e2 = c0040a.e(backEvent);
        float b2 = c0040a.b(backEvent);
        int c2 = c0040a.c(backEvent);
        this.f900a = d2;
        this.f901b = e2;
        this.f902c = b2;
        this.f903d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f900a + ", touchY=" + this.f901b + ", progress=" + this.f902c + ", swipeEdge=" + this.f903d + '}';
    }
}
