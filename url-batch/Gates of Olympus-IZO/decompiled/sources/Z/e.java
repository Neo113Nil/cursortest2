package Z;

import j.AbstractC0479E;
import j.C0475A;
import k2.a0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f3417a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3418b;

    /* renamed from: c, reason: collision with root package name */
    public final C0475A f3419c;

    /* renamed from: d, reason: collision with root package name */
    public final C0475A f3420d;

    /* renamed from: e, reason: collision with root package name */
    public final C0475A f3421e;

    /* renamed from: f, reason: collision with root package name */
    public final C0475A f3422f;

    public e(a0 a0Var, d dVar) {
        this.f3417a = a0Var;
        this.f3418b = dVar;
        int i3 = AbstractC0479E.f5137a;
        this.f3419c = new C0475A();
        this.f3420d = new C0475A();
        this.f3421e = new C0475A();
        this.f3422f = new C0475A();
    }

    public final boolean a() {
        return this.f3419c.h() || this.f3421e.h() || this.f3420d.h();
    }

    public final void b(C0475A c0475a, Object obj) {
        if (c0475a.a(obj) && this.f3419c.f5132d + this.f3420d.f5132d + this.f3421e.f5132d == 1) {
            this.f3417a.j(new d(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
        }
    }
}
