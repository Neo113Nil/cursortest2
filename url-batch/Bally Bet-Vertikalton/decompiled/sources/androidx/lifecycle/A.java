package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1332a;

    /* renamed from: b, reason: collision with root package name */
    public int f1333b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1335e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1334c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1336f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.q f1337g = new B0.q(9, this);
    public final B0.d h = new B0.d(19, this);

    public final void a() {
        int i2 = this.f1333b + 1;
        this.f1333b = i2;
        if (i2 == 1) {
            if (this.f1334c) {
                this.f1336f.d(EnumC0069l.ON_RESUME);
                this.f1334c = false;
            } else {
                Handler handler = this.f1335e;
                X0.d.b(handler);
                handler.removeCallbacks(this.f1337g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1336f;
    }
}
