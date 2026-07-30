package R0;

import M0.AbstractC0043a;
import M0.AbstractC0063v;

/* loaded from: classes.dex */
public class u extends AbstractC0043a implements y0.c {

    /* renamed from: h, reason: collision with root package name */
    public final w0.d f936h;

    public u(w0.d dVar, w0.i iVar) {
        super(iVar, true);
        this.f936h = dVar;
    }

    @Override // M0.Z
    public final boolean H() {
        return true;
    }

    @Override // y0.c
    public final y0.c g() {
        w0.d dVar = this.f936h;
        if (dVar instanceof y0.c) {
            return (y0.c) dVar;
        }
        return null;
    }

    @Override // M0.Z
    public void o(Object obj) {
        AbstractC0068a.i(o.g.r(this.f936h), AbstractC0063v.h(obj), null);
    }

    @Override // M0.Z
    public void p(Object obj) {
        this.f936h.resumeWith(AbstractC0063v.h(obj));
    }
}
