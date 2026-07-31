package u1;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends w1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f7298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p6.e f7299b;

    public x(a0 a0Var, p6.e eVar) {
        this.f7298a = a0Var;
        this.f7299b = eVar;
    }

    @Override // u1.e0
    public final f0 e(w1.n0 n0Var, List list, long j7) {
        a0 a0Var = this.f7298a;
        v vVar = a0Var.f7175k;
        vVar.f7282d = n0Var.getLayoutDirection();
        vVar.f7283e = n0Var.b();
        vVar.f7284f = n0Var.i();
        boolean p7 = n0Var.p();
        p6.e eVar = this.f7299b;
        if (p7 || a0Var.f7169d.f7644j == null) {
            a0Var.f7172g = 0;
            f0 f0Var = (f0) eVar.g(vVar, new r2.a(j7));
            return new w(f0Var, a0Var, a0Var.f7172g, f0Var, 1);
        }
        a0Var.f7173h = 0;
        f0 f0Var2 = (f0) eVar.g(a0Var.f7176l, new r2.a(j7));
        return new w(f0Var2, a0Var, a0Var.f7173h, f0Var2, 0);
    }
}
