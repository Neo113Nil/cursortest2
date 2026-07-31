package Z;

import j.AbstractC0523E;
import j.C0519A;
import q2.a0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4670b;

    /* renamed from: c, reason: collision with root package name */
    public final C0519A f4671c;

    /* renamed from: d, reason: collision with root package name */
    public final C0519A f4672d;

    /* renamed from: e, reason: collision with root package name */
    public final C0519A f4673e;

    /* renamed from: f, reason: collision with root package name */
    public final C0519A f4674f;

    public f(a0 a0Var, e eVar) {
        this.f4669a = a0Var;
        this.f4670b = eVar;
        int i3 = AbstractC0523E.f6255a;
        this.f4671c = new C0519A();
        this.f4672d = new C0519A();
        this.f4673e = new C0519A();
        this.f4674f = new C0519A();
    }

    public final boolean a() {
        return this.f4671c.h() || this.f4673e.h() || this.f4672d.h();
    }

    public final void b(C0519A c0519a, Object obj) {
        if (c0519a.a(obj) && this.f4671c.f6250d + this.f4672d.f6250d + this.f4673e.f6250d == 1) {
            this.f4669a.n(new e(0, this, f.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
        }
    }
}
