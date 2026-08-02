package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: i, reason: collision with root package name */
    public static final t f2400i = new t();

    /* renamed from: a, reason: collision with root package name */
    public int f2401a;

    /* renamed from: b, reason: collision with root package name */
    public int f2402b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f2405e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2403c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2404d = true;
    public final o f = new o(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.n f2406g = new B0.n(4, this);

    /* renamed from: h, reason: collision with root package name */
    public final C0.e f2407h = new C0.e(28, this);

    public final void c() {
        int i3 = this.f2402b + 1;
        this.f2402b = i3;
        if (i3 == 1) {
            if (this.f2403c) {
                this.f.e(EnumC0165g.ON_RESUME);
                this.f2403c = false;
            } else {
                Handler handler = this.f2405e;
                kotlin.jvm.internal.j.b(handler);
                handler.removeCallbacks(this.f2406g);
            }
        }
    }

    @Override // androidx.lifecycle.m
    public final o e() {
        return this.f;
    }
}
