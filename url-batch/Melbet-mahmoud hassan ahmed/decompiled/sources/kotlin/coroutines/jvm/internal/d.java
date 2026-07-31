package kotlin.coroutines.jvm.internal;

import y5.g;

/* loaded from: classes.dex */
public abstract class d extends a {
    private final y5.g _context;
    private transient y5.d<Object> intercepted;

    public d(y5.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(y5.d<Object> dVar, y5.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // y5.d
    public y5.g getContext() {
        y5.g gVar = this._context;
        kotlin.jvm.internal.i.b(gVar);
        return gVar;
    }

    public final y5.d<Object> intercepted() {
        y5.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            y5.e eVar = (y5.e) getContext().get(y5.e.f23478e);
            if (eVar == null || (dVar = eVar.C(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        y5.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(y5.e.f23478e);
            kotlin.jvm.internal.i.b(bVar);
            ((y5.e) bVar).y(dVar);
        }
        this.intercepted = c.f18292f;
    }
}
