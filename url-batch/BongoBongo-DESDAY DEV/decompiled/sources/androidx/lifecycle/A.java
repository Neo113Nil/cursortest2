package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1540a;

    /* renamed from: b, reason: collision with root package name */
    public int f1541b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1543e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1542c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1544f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final A.a f1545g = new A.a(11, this);

    /* renamed from: h, reason: collision with root package name */
    public final D.g f1546h = new D.g(20, this);

    public final void a() {
        int i2 = this.f1541b + 1;
        this.f1541b = i2;
        if (i2 == 1) {
            if (this.f1542c) {
                this.f1544f.d(EnumC0078l.ON_RESUME);
                this.f1542c = false;
            } else {
                Handler handler = this.f1543e;
                h1.d.b(handler);
                handler.removeCallbacks(this.f1545g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1544f;
    }
}
