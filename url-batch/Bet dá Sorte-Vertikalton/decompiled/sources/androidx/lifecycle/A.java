package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1407a;

    /* renamed from: b, reason: collision with root package name */
    public int f1408b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1410e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1409c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1411f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final G0.o f1412g = new G0.o(8, this);
    public final C.h h = new C.h(19, this);

    public final void a() {
        int i2 = this.f1408b + 1;
        this.f1408b = i2;
        if (i2 == 1) {
            if (this.f1409c) {
                this.f1411f.d(EnumC0071l.ON_RESUME);
                this.f1409c = false;
            } else {
                Handler handler = this.f1410e;
                b1.d.b(handler);
                handler.removeCallbacks(this.f1412g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1411f;
    }
}
