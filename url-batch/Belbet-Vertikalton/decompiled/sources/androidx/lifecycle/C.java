package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements t {
    public static final C i = new C();

    /* renamed from: a, reason: collision with root package name */
    public int f1900a;

    /* renamed from: b, reason: collision with root package name */
    public int f1901b;
    public Handler e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1902c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1903d = true;

    /* renamed from: f, reason: collision with root package name */
    public final v f1904f = new v(this);

    /* renamed from: g, reason: collision with root package name */
    public final A0.b f1905g = new A0.b(9, this);

    /* renamed from: h, reason: collision with root package name */
    public final C1.d f1906h = new C1.d(20, this);

    public final void a() {
        int i2 = this.f1901b + 1;
        this.f1901b = i2;
        if (i2 == 1) {
            if (this.f1902c) {
                this.f1904f.d(EnumC0077l.ON_RESUME);
                this.f1902c = false;
            } else {
                Handler handler = this.e;
                j1.h.b(handler);
                handler.removeCallbacks(this.f1905g);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final v e() {
        return this.f1904f;
    }
}
