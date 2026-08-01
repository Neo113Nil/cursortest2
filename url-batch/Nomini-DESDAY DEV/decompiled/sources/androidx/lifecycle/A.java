package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1326a;

    /* renamed from: b, reason: collision with root package name */
    public int f1327b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1329e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1328c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1330f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.q f1331g = new B0.q(9, this);
    public final B0.d h = new B0.d(20, this);

    public final void a() {
        int i2 = this.f1327b + 1;
        this.f1327b = i2;
        if (i2 == 1) {
            if (this.f1328c) {
                this.f1330f.d(EnumC0068l.ON_RESUME);
                this.f1328c = false;
            } else {
                Handler handler = this.f1329e;
                X0.e.b(handler);
                handler.removeCallbacks(this.f1331g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1330f;
    }
}
