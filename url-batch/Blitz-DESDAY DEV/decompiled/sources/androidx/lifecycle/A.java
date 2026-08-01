package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1537a;

    /* renamed from: b, reason: collision with root package name */
    public int f1538b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1540e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1539c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1541f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final B.a f1542g = new B.a(10, this);
    public final E.g h = new E.g(20, this);

    public final void a() {
        int i2 = this.f1538b + 1;
        this.f1538b = i2;
        if (i2 == 1) {
            if (this.f1539c) {
                this.f1541f.d(EnumC0069l.ON_RESUME);
                this.f1539c = false;
            } else {
                Handler handler = this.f1540e;
                g1.d.b(handler);
                handler.removeCallbacks(this.f1542g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t f() {
        return this.f1541f;
    }
}
