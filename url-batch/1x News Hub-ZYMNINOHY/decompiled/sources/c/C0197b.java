package c;

import android.window.BackEvent;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197b {

    /* renamed from: a, reason: collision with root package name */
    public final float f2557a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2558b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2560d;

    public C0197b(BackEvent backEvent) {
        C0196a c0196a = C0196a.f2556a;
        float d3 = c0196a.d(backEvent);
        float e3 = c0196a.e(backEvent);
        float b3 = c0196a.b(backEvent);
        int c3 = c0196a.c(backEvent);
        this.f2557a = d3;
        this.f2558b = e3;
        this.f2559c = b3;
        this.f2560d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f2557a + ", touchY=" + this.f2558b + ", progress=" + this.f2559c + ", swipeEdge=" + this.f2560d + '}';
    }
}
