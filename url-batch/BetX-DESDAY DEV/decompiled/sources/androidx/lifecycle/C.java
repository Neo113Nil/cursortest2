package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements InterfaceC0086t {
    public static final C i = new C();

    /* renamed from: a, reason: collision with root package name */
    public int f1436a;

    /* renamed from: b, reason: collision with root package name */
    public int f1437b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1440e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1438c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1439d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0088v f1441f = new C0088v(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.q f1442g = new B0.q(8, this);
    public final B0.d h = new B0.d(17, this);

    public final void a() {
        int i2 = this.f1437b + 1;
        this.f1437b = i2;
        if (i2 == 1) {
            if (this.f1438c) {
                this.f1441f.e(EnumC0080m.ON_RESUME);
                this.f1438c = false;
            } else {
                Handler handler = this.f1440e;
                X0.f.b(handler);
                handler.removeCallbacks(this.f1442g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0086t
    public final AbstractC0082o getLifecycle() {
        return this.f1441f;
    }
}
