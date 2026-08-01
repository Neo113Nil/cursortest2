package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1152a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1153b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1154c;
    public final int d;

    public C0058b(BackEvent backEvent) {
        d1.d.e(backEvent, "backEvent");
        C0057a c0057a = C0057a.f1151a;
        float d = c0057a.d(backEvent);
        float e2 = c0057a.e(backEvent);
        float b2 = c0057a.b(backEvent);
        int c2 = c0057a.c(backEvent);
        this.f1152a = d;
        this.f1153b = e2;
        this.f1154c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1152a + ", touchY=" + this.f1153b + ", progress=" + this.f1154c + ", swipeEdge=" + this.d + '}';
    }
}
