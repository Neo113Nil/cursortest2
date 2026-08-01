package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1449a;

    /* renamed from: b, reason: collision with root package name */
    public int f1450b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1452e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1451c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1453f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final D0.p f1454g = new D0.p(9, this);
    public final C.g h = new C.g(20, this);

    public final void a() {
        int i2 = this.f1450b + 1;
        this.f1450b = i2;
        if (i2 == 1) {
            if (this.f1451c) {
                this.f1453f.d(EnumC0071l.ON_RESUME);
                this.f1451c = false;
            } else {
                Handler handler = this.f1452e;
                d1.d.b(handler);
                handler.removeCallbacks(this.f1454g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1453f;
    }
}
