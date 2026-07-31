package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f91a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f92b;

    /* renamed from: d, reason: collision with root package name */
    public int f94d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f95e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96f;

    /* renamed from: c, reason: collision with root package name */
    public int f93c = -1;

    /* renamed from: g, reason: collision with root package name */
    public final m0.h1 f97g = m0.b.q(null);

    public i0(Object obj, k0 k0Var) {
        this.f91a = obj;
        this.f92b = k0Var;
    }

    public final i0 a() {
        if (this.f96f) {
            w.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f94d == 0) {
            this.f92b.f109d.add(this);
            i0 i0Var = (i0) this.f97g.getValue();
            if (i0Var != null) {
                i0Var.a();
            } else {
                i0Var = null;
            }
            this.f95e = i0Var;
        }
        this.f94d++;
        return this;
    }

    public final void b() {
        if (this.f96f) {
            return;
        }
        if (this.f94d <= 0) {
            w.a.c("Release should only be called once");
        }
        int i = this.f94d - 1;
        this.f94d = i;
        if (i == 0) {
            this.f92b.f109d.remove(this);
            i0 i0Var = this.f95e;
            if (i0Var != null) {
                i0Var.b();
            }
            this.f95e = null;
        }
    }
}
