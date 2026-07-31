package r;

import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e1 implements t2 {

    /* renamed from: d, reason: collision with root package name */
    public final i1 f6285d;

    /* renamed from: e, reason: collision with root package name */
    public p6.c f6286e;

    /* renamed from: f, reason: collision with root package name */
    public q6.j f6287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f6288g;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(f1 f1Var, i1 i1Var, p6.c cVar, p6.c cVar2) {
        this.f6288g = f1Var;
        this.f6285d = i1Var;
        this.f6286e = cVar;
        this.f6287f = (q6.j) cVar2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [p6.c, q6.j] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p6.c, q6.j] */
    public final void a(g1 g1Var) {
        i1 i1Var = this.f6285d;
        m0.h1 h1Var = i1Var.f6316j;
        m0.h1 h1Var2 = i1Var.f6312e;
        m0.d1 d1Var = i1Var.f6317k;
        Object i = this.f6287f.i(g1Var.c());
        if (this.f6288g.f6294c.g()) {
            i1Var.f(this.f6287f.i(g1Var.b()), i, (v) this.f6286e.i(g1Var));
            return;
        }
        v vVar = (v) this.f6286e.i(g1Var);
        if (i1Var.f6318l) {
            c1 c1Var = i1Var.i;
            if (q6.i.a(i, c1Var != null ? c1Var.f6248c : null)) {
                return;
            }
        }
        if (q6.i.a(h1Var2.getValue(), i) && d1Var.g() == -1.0f) {
            return;
        }
        h1Var2.setValue(i);
        i1Var.f6313f.setValue(vVar);
        i1Var.e(d1Var.g() == -3.0f ? i : i1Var.f6319m.getValue(), !((Boolean) h1Var.getValue()).booleanValue());
        h1Var.setValue(Boolean.valueOf(d1Var.g() == -3.0f));
        if (d1Var.g() >= 0.0f) {
            i1Var.c(i1Var.a().b((long) (d1Var.g() * i1Var.a().c())));
        } else if (d1Var.g() == -3.0f) {
            i1Var.c(i);
        }
        i1Var.f6318l = false;
        d1Var.h(-1.0f);
    }

    @Override // m0.t2
    public final Object getValue() {
        a(this.f6288g.f6294c.f());
        return this.f6285d.f6319m.getValue();
    }
}
