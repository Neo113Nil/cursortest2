package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1327a;

    /* renamed from: b, reason: collision with root package name */
    public int f1328b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1330e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1329c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1331f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.q f1332g = new B0.q(9, this);
    public final B0.d h = new B0.d(20, this);

    public final void a() {
        int i2 = this.f1328b + 1;
        this.f1328b = i2;
        if (i2 == 1) {
            if (this.f1329c) {
                this.f1331f.d(EnumC0068l.ON_RESUME);
                this.f1329c = false;
            } else {
                Handler handler = this.f1330e;
                X0.e.b(handler);
                handler.removeCallbacks(this.f1332g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1331f;
    }
}
