package s;

import G.C0192d;
import G.C0199g0;
import G.C0205j0;
import G.W;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9969a;

    /* renamed from: b, reason: collision with root package name */
    public final w f9970b;

    /* renamed from: c, reason: collision with root package name */
    public final C0199g0 f9971c = C0192d.J(-1);

    /* renamed from: d, reason: collision with root package name */
    public final C0199g0 f9972d = C0192d.J(0);

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f9973e;

    /* renamed from: f, reason: collision with root package name */
    public final C0205j0 f9974f;

    public v(Object obj, w wVar) {
        this.f9969a = obj;
        this.f9970b = wVar;
        W w4 = W.f2779l;
        this.f9973e = C0192d.K(null, w4);
        this.f9974f = C0192d.K(null, w4);
    }

    public final v a() {
        C0199g0 c0199g0 = this.f9972d;
        if (c0199g0.d() == 0) {
            this.f9970b.f9975d.add(this);
            v vVar = (v) this.f9974f.getValue();
            if (vVar != null) {
                vVar.a();
            } else {
                vVar = null;
            }
            this.f9973e.setValue(vVar);
        }
        c0199g0.f(c0199g0.d() + 1);
        return this;
    }

    public final void b() {
        C0199g0 c0199g0 = this.f9972d;
        if (c0199g0.d() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c0199g0.f(c0199g0.d() - 1);
        if (c0199g0.d() == 0) {
            this.f9970b.f9975d.remove(this);
            C0205j0 c0205j0 = this.f9973e;
            v vVar = (v) c0205j0.getValue();
            if (vVar != null) {
                vVar.b();
            }
            c0205j0.setValue(null);
        }
    }
}
