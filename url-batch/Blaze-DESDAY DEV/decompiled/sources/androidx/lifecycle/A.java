package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1480a;

    /* renamed from: b, reason: collision with root package name */
    public int f1481b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1483e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1482c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1484f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final D0.p f1485g = new D0.p(10, this);
    public final C.g h = new C.g(19, this);

    public final void a() {
        int i2 = this.f1481b + 1;
        this.f1481b = i2;
        if (i2 == 1) {
            if (this.f1482c) {
                this.f1484f.d(EnumC0072l.ON_RESUME);
                this.f1482c = false;
            } else {
                Handler handler = this.f1483e;
                g1.d.b(handler);
                handler.removeCallbacks(this.f1485g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t e() {
        return this.f1484f;
    }
}
