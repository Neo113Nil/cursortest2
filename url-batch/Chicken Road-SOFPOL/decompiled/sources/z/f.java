package z;

import a0.b1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f9015a;

    public f(p6.c cVar) {
        b1 b1Var = new b1();
        b1Var.f23b = new o0.e(new a0.j[16]);
        this.f9015a = b1Var;
        cVar.i(this);
    }

    public final void a(int i, p6.c cVar, u0.c cVar2) {
        x4.e eVar = new x4.e(cVar, cVar2);
        b1 b1Var = this.f9015a;
        b1Var.getClass();
        if (i < 0) {
            w.a.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        a0.j jVar = new a0.j(b1Var.f22a, i, eVar);
        b1Var.f22a += i;
        ((o0.e) b1Var.f23b).b(jVar);
    }
}
