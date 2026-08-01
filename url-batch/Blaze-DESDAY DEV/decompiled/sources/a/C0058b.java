package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1182a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1183b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1184c;
    public final int d;

    public C0058b(BackEvent backEvent) {
        g1.d.e(backEvent, "backEvent");
        C0057a c0057a = C0057a.f1181a;
        float d = c0057a.d(backEvent);
        float e2 = c0057a.e(backEvent);
        float b2 = c0057a.b(backEvent);
        int c2 = c0057a.c(backEvent);
        this.f1182a = d;
        this.f1183b = e2;
        this.f1184c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1182a + ", touchY=" + this.f1183b + ", progress=" + this.f1184c + ", swipeEdge=" + this.d + '}';
    }
}
