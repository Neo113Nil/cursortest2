package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1039c;
    public final int d;

    public C0056b(BackEvent backEvent) {
        X0.d.e(backEvent, "backEvent");
        C0055a c0055a = C0055a.f1036a;
        float d = c0055a.d(backEvent);
        float e2 = c0055a.e(backEvent);
        float b2 = c0055a.b(backEvent);
        int c2 = c0055a.c(backEvent);
        this.f1037a = d;
        this.f1038b = e2;
        this.f1039c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1037a + ", touchY=" + this.f1038b + ", progress=" + this.f1039c + ", swipeEdge=" + this.d + '}';
    }
}
