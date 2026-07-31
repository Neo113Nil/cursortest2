package p2;

import M1.B;
import k2.AbstractC0529a;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public class r extends AbstractC0529a implements R1.d {

    /* renamed from: g, reason: collision with root package name */
    public final P1.d f6804g;

    public r(P1.d dVar, P1.i iVar) {
        super(iVar, true);
        this.f6804g = dVar;
    }

    @Override // k2.f0
    public final boolean Q() {
        return true;
    }

    @Override // R1.d
    public final R1.d getCallerFrame() {
        P1.d dVar = this.f6804g;
        if (dVar instanceof R1.d) {
            return (R1.d) dVar;
        }
        return null;
    }

    @Override // k2.f0
    public void l(Object obj) {
        a.j(B.G(this.f6804g), AbstractC0552y.r(obj));
    }

    @Override // k2.f0
    public void q(Object obj) {
        this.f6804g.resumeWith(AbstractC0552y.r(obj));
    }
}
