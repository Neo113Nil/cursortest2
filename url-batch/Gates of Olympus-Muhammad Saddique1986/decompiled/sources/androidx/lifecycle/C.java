package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements InterfaceC0292v {

    /* renamed from: l, reason: collision with root package name */
    public static final C f5138l = new C();

    /* renamed from: d, reason: collision with root package name */
    public int f5139d;

    /* renamed from: e, reason: collision with root package name */
    public int f5140e;

    /* renamed from: h, reason: collision with root package name */
    public Handler f5143h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5141f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5142g = true;

    /* renamed from: i, reason: collision with root package name */
    public final C0294x f5144i = new C0294x(this);

    /* renamed from: j, reason: collision with root package name */
    public final E.t f5145j = new E.t(3, this);

    /* renamed from: k, reason: collision with root package name */
    public final B.Y f5146k = new B.Y(this);

    public final void a() {
        int i3 = this.f5140e + 1;
        this.f5140e = i3;
        if (i3 == 1) {
            if (this.f5141f) {
                this.f5144i.d(EnumC0285n.ON_RESUME);
                this.f5141f = false;
            } else {
                Handler handler = this.f5143h;
                f2.j.c(handler);
                handler.removeCallbacks(this.f5145j);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0292v
    public final C0294x e() {
        return this.f5144i;
    }
}
