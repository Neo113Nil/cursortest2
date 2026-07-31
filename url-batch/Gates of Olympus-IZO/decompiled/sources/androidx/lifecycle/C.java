package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements InterfaceC0236v {

    /* renamed from: l, reason: collision with root package name */
    public static final C f3937l = new C();

    /* renamed from: d, reason: collision with root package name */
    public int f3938d;

    /* renamed from: e, reason: collision with root package name */
    public int f3939e;

    /* renamed from: h, reason: collision with root package name */
    public Handler f3942h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3940f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3941g = true;

    /* renamed from: i, reason: collision with root package name */
    public final C0238x f3943i = new C0238x(this);

    /* renamed from: j, reason: collision with root package name */
    public final E.u f3944j = new E.u(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final A2.g f3945k = new A2.g(16, this);

    public final void a() {
        int i3 = this.f3939e + 1;
        this.f3939e = i3;
        if (i3 == 1) {
            if (this.f3940f) {
                this.f3943i.d(EnumC0229n.ON_RESUME);
                this.f3940f = false;
            } else {
                Handler handler = this.f3942h;
                Z1.i.c(handler);
                handler.removeCallbacks(this.f3944j);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0236v
    public final C0238x e() {
        return this.f3943i;
    }
}
