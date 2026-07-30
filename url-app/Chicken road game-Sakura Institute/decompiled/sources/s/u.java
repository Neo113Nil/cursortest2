package s;

import g0.d1;
import g0.g1;
import g0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8061a;

    /* renamed from: b, reason: collision with root package name */
    public final v f8062b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f8063c = g0.d.I(-1);

    /* renamed from: d, reason: collision with root package name */
    public final d1 f8064d = g0.d.I(0);

    /* renamed from: e, reason: collision with root package name */
    public final g1 f8065e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f8066f;

    public u(Object obj, v vVar) {
        this.f8061a = obj;
        this.f8062b = vVar;
        t0 t0Var = t0.f3903k;
        this.f8065e = g0.d.J(null, t0Var);
        this.f8066f = g0.d.J(null, t0Var);
    }

    public final u a() {
        d1 d1Var = this.f8064d;
        if (d1Var.e() == 0) {
            this.f8062b.f8067f.add(this);
            u uVar = (u) this.f8066f.getValue();
            if (uVar != null) {
                uVar.a();
            } else {
                uVar = null;
            }
            this.f8065e.setValue(uVar);
        }
        d1Var.f(d1Var.e() + 1);
        return this;
    }

    public final void b() {
        d1 d1Var = this.f8064d;
        if (d1Var.e() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        d1Var.f(d1Var.e() - 1);
        if (d1Var.e() == 0) {
            this.f8062b.f8067f.remove(this);
            g1 g1Var = this.f8065e;
            u uVar = (u) g1Var.getValue();
            if (uVar != null) {
                uVar.b();
            }
            g1Var.setValue(null);
        }
    }
}
