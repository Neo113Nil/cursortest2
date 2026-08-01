package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1109a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1110b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1111c;
    public final int d;

    public C0054b(BackEvent backEvent) {
        b1.d.e(backEvent, "backEvent");
        C0053a c0053a = C0053a.f1108a;
        float d = c0053a.d(backEvent);
        float e2 = c0053a.e(backEvent);
        float b2 = c0053a.b(backEvent);
        int c2 = c0053a.c(backEvent);
        this.f1109a = d;
        this.f1110b = e2;
        this.f1111c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1109a + ", touchY=" + this.f1110b + ", progress=" + this.f1111c + ", swipeEdge=" + this.d + '}';
    }
}
