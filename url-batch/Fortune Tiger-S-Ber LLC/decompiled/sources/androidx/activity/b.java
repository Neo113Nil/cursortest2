package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f83a;

    /* renamed from: b, reason: collision with root package name */
    public final float f84b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85d;

    public b(BackEvent backEvent) {
        float k4 = a.k(backEvent);
        float l4 = a.l(backEvent);
        float h = a.h(backEvent);
        int j4 = a.j(backEvent);
        this.f83a = k4;
        this.f84b = l4;
        this.c = h;
        this.f85d = j4;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f83a + ", touchY=" + this.f84b + ", progress=" + this.c + ", swipeEdge=" + this.f85d + '}';
    }
}
