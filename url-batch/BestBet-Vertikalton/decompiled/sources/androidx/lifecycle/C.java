package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements t {
    public static final C i = new C();

    /* renamed from: a, reason: collision with root package name */
    public int f1853a;

    /* renamed from: b, reason: collision with root package name */
    public int f1854b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1856e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1855c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final v f1857f = new v(this);

    /* renamed from: g, reason: collision with root package name */
    public final E0.b f1858g = new E0.b(9, this);
    public final A0.c h = new A0.c(22, this);

    public final void a() {
        int i2 = this.f1854b + 1;
        this.f1854b = i2;
        if (i2 == 1) {
            if (this.f1855c) {
                this.f1857f.d(EnumC0071l.ON_RESUME);
                this.f1855c = false;
            } else {
                Handler handler = this.f1856e;
                k1.e.b(handler);
                handler.removeCallbacks(this.f1858g);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final v e() {
        return this.f1857f;
    }
}
