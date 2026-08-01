package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089b {

    /* renamed from: a, reason: collision with root package name */
    public final float f2152a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2153b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2155d;

    public C0089b(BackEvent backEvent) {
        j1.h.e(backEvent, "backEvent");
        C0088a c0088a = C0088a.f2151a;
        float d2 = c0088a.d(backEvent);
        float e = c0088a.e(backEvent);
        float b2 = c0088a.b(backEvent);
        int c2 = c0088a.c(backEvent);
        this.f2152a = d2;
        this.f2153b = e;
        this.f2154c = b2;
        this.f2155d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f2152a + ", touchY=" + this.f2153b + ", progress=" + this.f2154c + ", swipeEdge=" + this.f2155d + '}';
    }
}
