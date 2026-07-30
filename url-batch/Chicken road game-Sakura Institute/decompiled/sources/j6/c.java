package j6;

import c7.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final h6.i _context;
    private transient h6.d intercepted;

    public c(h6.d dVar, h6.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // h6.d
    public h6.i getContext() {
        h6.i iVar = this._context;
        k.c(iVar);
        return iVar;
    }

    public final h6.d intercepted() {
        h6.d dVar = this.intercepted;
        if (dVar != null) {
            return dVar;
        }
        h6.f fVar = (h6.f) getContext().u(h6.e.f4660f);
        h6.d fVar2 = fVar != null ? new h7.f((t) fVar, this) : this;
        this.intercepted = fVar2;
        return fVar2;
    }

    @Override // j6.a
    public void releaseIntercepted() {
        h6.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            h6.g u8 = getContext().u(h6.e.f4660f);
            k.c(u8);
            h7.f fVar = (h7.f) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h7.f.f4676m;
            while (atomicReferenceFieldUpdater.get(fVar) == h7.a.f4666c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            c7.h hVar = obj instanceof c7.h ? (c7.h) obj : null;
            if (hVar != null) {
                hVar.m();
            }
        }
        this.intercepted = b.f5120f;
    }

    public c(h6.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
