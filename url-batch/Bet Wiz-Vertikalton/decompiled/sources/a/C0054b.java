package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1139a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1140b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1141c;
    public final int d;

    public C0054b(BackEvent backEvent) {
        e1.d.e(backEvent, "backEvent");
        C0053a c0053a = C0053a.f1138a;
        float d = c0053a.d(backEvent);
        float e2 = c0053a.e(backEvent);
        float b2 = c0053a.b(backEvent);
        int c2 = c0053a.c(backEvent);
        this.f1139a = d;
        this.f1140b = e2;
        this.f1141c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1139a + ", touchY=" + this.f1140b + ", progress=" + this.f1141c + ", swipeEdge=" + this.d + '}';
    }
}
