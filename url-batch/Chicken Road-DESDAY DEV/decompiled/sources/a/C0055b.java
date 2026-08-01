package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1096b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1097c;
    public final int d;

    public C0055b(BackEvent backEvent) {
        b1.d.e(backEvent, "backEvent");
        C0054a c0054a = C0054a.f1094a;
        float d = c0054a.d(backEvent);
        float e2 = c0054a.e(backEvent);
        float b2 = c0054a.b(backEvent);
        int c2 = c0054a.c(backEvent);
        this.f1095a = d;
        this.f1096b = e2;
        this.f1097c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1095a + ", touchY=" + this.f1096b + ", progress=" + this.f1097c + ", swipeEdge=" + this.d + '}';
    }
}
