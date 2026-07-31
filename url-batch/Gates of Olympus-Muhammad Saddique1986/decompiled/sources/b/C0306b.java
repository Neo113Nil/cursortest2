package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306b {

    /* renamed from: a, reason: collision with root package name */
    public final float f5281a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5282b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5283c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5284d;

    public C0306b(BackEvent backEvent) {
        f2.j.f(backEvent, "backEvent");
        C0305a c0305a = C0305a.f5280a;
        float d3 = c0305a.d(backEvent);
        float e3 = c0305a.e(backEvent);
        float b3 = c0305a.b(backEvent);
        int c2 = c0305a.c(backEvent);
        this.f5281a = d3;
        this.f5282b = e3;
        this.f5283c = b3;
        this.f5284d = c2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f5281a);
        sb.append(", touchY=");
        sb.append(this.f5282b);
        sb.append(", progress=");
        sb.append(this.f5283c);
        sb.append(", swipeEdge=");
        return A.k.j(sb, this.f5284d, '}');
    }
}
