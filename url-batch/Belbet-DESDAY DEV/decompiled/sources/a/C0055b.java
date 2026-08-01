package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1035a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1036b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1037c;
    public final int d;

    public C0055b(BackEvent backEvent) {
        X0.d.e(backEvent, "backEvent");
        C0054a c0054a = C0054a.f1034a;
        float d = c0054a.d(backEvent);
        float e2 = c0054a.e(backEvent);
        float b2 = c0054a.b(backEvent);
        int c2 = c0054a.c(backEvent);
        this.f1035a = d;
        this.f1036b = e2;
        this.f1037c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1035a + ", touchY=" + this.f1036b + ", progress=" + this.f1037c + ", swipeEdge=" + this.d + '}';
    }
}
