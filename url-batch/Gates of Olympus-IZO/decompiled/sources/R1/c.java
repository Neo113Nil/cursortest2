package R1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.AbstractC0546s;
import k2.C0536h;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final P1.i _context;
    private transient P1.d intercepted;

    public c(P1.d dVar, P1.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // P1.d
    public P1.i getContext() {
        P1.i iVar = this._context;
        Z1.i.c(iVar);
        return iVar;
    }

    public final P1.d intercepted() {
        P1.d dVar = this.intercepted;
        if (dVar == null) {
            P1.f fVar = (P1.f) getContext().k(P1.e.f3072d);
            dVar = fVar != null ? new p2.f((AbstractC0546s) fVar, this) : this;
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // R1.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P1.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            P1.g k3 = getContext().k(P1.e.f3072d);
            Z1.i.c(k3);
            p2.f fVar = (p2.f) dVar;
            do {
                atomicReferenceFieldUpdater = p2.f.f6773k;
            } while (atomicReferenceFieldUpdater.get(fVar) == p2.a.f6763c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0536h c0536h = obj instanceof C0536h ? (C0536h) obj : null;
            if (c0536h != null) {
                c0536h.l();
            }
        }
        this.intercepted = b.f3168d;
    }

    public c(P1.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
