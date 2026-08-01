package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1390a;

    /* renamed from: b, reason: collision with root package name */
    public int f1391b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1393e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1392c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1394f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final C0.p f1395g = new C0.p(9, this);
    public final C.g h = new C.g(20, this);

    public final void a() {
        int i2 = this.f1391b + 1;
        this.f1391b = i2;
        if (i2 == 1) {
            if (this.f1392c) {
                this.f1394f.d(EnumC0072l.ON_RESUME);
                this.f1392c = false;
            } else {
                Handler handler = this.f1393e;
                b1.d.b(handler);
                handler.removeCallbacks(this.f1395g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1394f;
    }
}
