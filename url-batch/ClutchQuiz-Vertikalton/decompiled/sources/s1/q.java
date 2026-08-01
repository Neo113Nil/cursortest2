package s1;

import o1.AbstractC0282a;
import o1.AbstractC0299s;

/* loaded from: classes.dex */
public class q extends AbstractC0282a implements Z0.b {
    public final X0.d d;

    public q(X0.i iVar, X0.d dVar) {
        super(iVar, true);
        this.d = dVar;
    }

    @Override // o1.U
    public final boolean A() {
        return true;
    }

    @Override // Z0.b
    public final Z0.b e() {
        X0.d dVar = this.d;
        if (dVar instanceof Z0.b) {
            return (Z0.b) dVar;
        }
        return null;
    }

    @Override // o1.U
    public void f(Object obj) {
        a.c(T.d.y(this.d), AbstractC0299s.i(obj), null);
    }

    @Override // o1.U
    public void g(Object obj) {
        this.d.b(AbstractC0299s.i(obj));
    }
}
