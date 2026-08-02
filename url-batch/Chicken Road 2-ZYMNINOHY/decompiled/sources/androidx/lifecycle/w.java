package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class w implements InterfaceC0235n {

    /* renamed from: i, reason: collision with root package name */
    public static final w f5074i = new w();

    /* renamed from: a, reason: collision with root package name */
    public int f5075a;

    /* renamed from: b, reason: collision with root package name */
    public int f5076b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f5079e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5077c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5078d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0237p f5080f = new C0237p(this);

    /* renamed from: g, reason: collision with root package name */
    public final R1.n f5081g = new R1.n(7, this);

    /* renamed from: h, reason: collision with root package name */
    public final t1.h f5082h = new t1.h(24, this);

    public final void a() {
        int i4 = this.f5076b + 1;
        this.f5076b = i4;
        if (i4 == 1) {
            if (this.f5077c) {
                this.f5080f.e(EnumC0229h.ON_RESUME);
                this.f5077c = false;
            } else {
                Handler handler = this.f5079e;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(this.f5081g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0235n
    public final AbstractC0231j getLifecycle() {
        return this.f5080f;
    }
}
