package t;

import I.C0143d;
import I.C0150g0;
import I.C0156j0;
import I.W;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8517a;

    /* renamed from: b, reason: collision with root package name */
    public final x f8518b;

    /* renamed from: c, reason: collision with root package name */
    public final C0150g0 f8519c = C0143d.J(-1);

    /* renamed from: d, reason: collision with root package name */
    public final C0150g0 f8520d = C0143d.J(0);

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f8521e;

    /* renamed from: f, reason: collision with root package name */
    public final C0156j0 f8522f;

    public w(Object obj, x xVar) {
        this.f8517a = obj;
        this.f8518b = xVar;
        W w2 = W.f2783i;
        this.f8521e = C0143d.K(null, w2);
        this.f8522f = C0143d.K(null, w2);
    }

    public final w a() {
        C0150g0 c0150g0 = this.f8520d;
        if (c0150g0.g() == 0) {
            this.f8518b.f8523d.add(this);
            w wVar = (w) this.f8522f.getValue();
            if (wVar != null) {
                wVar.a();
            } else {
                wVar = null;
            }
            this.f8521e.setValue(wVar);
        }
        c0150g0.h(c0150g0.g() + 1);
        return this;
    }

    public final void b() {
        C0150g0 c0150g0 = this.f8520d;
        if (c0150g0.g() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c0150g0.h(c0150g0.g() - 1);
        if (c0150g0.g() == 0) {
            this.f8518b.f8523d.remove(this);
            C0156j0 c0156j0 = this.f8521e;
            w wVar = (w) c0156j0.getValue();
            if (wVar != null) {
                wVar.b();
            }
            c0156j0.setValue(null);
        }
    }
}
