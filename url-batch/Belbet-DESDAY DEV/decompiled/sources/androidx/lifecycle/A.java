package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1330a;

    /* renamed from: b, reason: collision with root package name */
    public int f1331b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1333e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1332c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1334f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.q f1335g = new B0.q(9, this);
    public final B0.d h = new B0.d(20, this);

    public final void a() {
        int i2 = this.f1331b + 1;
        this.f1331b = i2;
        if (i2 == 1) {
            if (this.f1332c) {
                this.f1334f.d(EnumC0068l.ON_RESUME);
                this.f1332c = false;
            } else {
                Handler handler = this.f1333e;
                X0.d.b(handler);
                handler.removeCallbacks(this.f1335g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1334f;
    }
}
