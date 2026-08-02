package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241b {

    /* renamed from: a, reason: collision with root package name */
    public final float f5213a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5214b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5216d;

    public C0241b(BackEvent backEvent) {
        C0240a c0240a = C0240a.f5212a;
        float d4 = c0240a.d(backEvent);
        float e4 = c0240a.e(backEvent);
        float b4 = c0240a.b(backEvent);
        int c4 = c0240a.c(backEvent);
        this.f5213a = d4;
        this.f5214b = e4;
        this.f5215c = b4;
        this.f5216d = c4;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f5213a + ", touchY=" + this.f5214b + ", progress=" + this.f5215c + ", swipeEdge=" + this.f5216d + '}';
    }
}
