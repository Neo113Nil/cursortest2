package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements InterfaceC0086t {
    public static final C i = new C();

    /* renamed from: a, reason: collision with root package name */
    public int f1435a;

    /* renamed from: b, reason: collision with root package name */
    public int f1436b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1439e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1437c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1438d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0088v f1440f = new C0088v(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.q f1441g = new B0.q(8, this);
    public final B0.d h = new B0.d(18, this);

    public final void a() {
        int i2 = this.f1436b + 1;
        this.f1436b = i2;
        if (i2 == 1) {
            if (this.f1437c) {
                this.f1440f.e(EnumC0080m.ON_RESUME);
                this.f1437c = false;
            } else {
                Handler handler = this.f1439e;
                X0.f.b(handler);
                handler.removeCallbacks(this.f1441g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0086t
    public final AbstractC0082o getLifecycle() {
        return this.f1440f;
    }
}
