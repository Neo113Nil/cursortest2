package X;

import W2.f0;
import i.AbstractC0665F;
import i.C0661B;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f4315a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4316b;

    /* renamed from: c, reason: collision with root package name */
    public final C0661B f4317c;

    /* renamed from: d, reason: collision with root package name */
    public final C0661B f4318d;

    /* renamed from: e, reason: collision with root package name */
    public final C0661B f4319e;

    /* renamed from: f, reason: collision with root package name */
    public final C0661B f4320f;

    public f(f0 f0Var, e eVar) {
        this.f4315a = f0Var;
        this.f4316b = eVar;
        int i2 = AbstractC0665F.f6892a;
        this.f4317c = new C0661B();
        this.f4318d = new C0661B();
        this.f4319e = new C0661B();
        this.f4320f = new C0661B();
    }

    public final boolean a() {
        return this.f4317c.h() || this.f4319e.h() || this.f4318d.h();
    }

    public final void b(C0661B c0661b, Object obj) {
        if (c0661b.a(obj) && this.f4317c.f6887d + this.f4318d.f6887d + this.f4319e.f6887d == 1) {
            this.f4315a.invoke(new e(0, this, f.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
        }
    }
}
