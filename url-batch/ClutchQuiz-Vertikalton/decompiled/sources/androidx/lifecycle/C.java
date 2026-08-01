package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements t {
    public static final C i = new C();

    /* renamed from: a, reason: collision with root package name */
    public int f1472a;

    /* renamed from: b, reason: collision with root package name */
    public int f1473b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1475e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1474c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final v f1476f = new v(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.b f1477g = new B0.b(9, this);
    public final A0.h h = new A0.h(17, this);

    public final void a() {
        int i2 = this.f1473b + 1;
        this.f1473b = i2;
        if (i2 == 1) {
            if (this.f1474c) {
                this.f1476f.d(EnumC0071l.ON_RESUME);
                this.f1474c = false;
            } else {
                Handler handler = this.f1475e;
                g1.f.b(handler);
                handler.removeCallbacks(this.f1477g);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final v d() {
        return this.f1476f;
    }
}
