package c1;

import a1.i;
import j1.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r1.AbstractC0366p;
import r1.C0355e;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0106c extends AbstractC0104a {
    private final i _context;
    private transient a1.d intercepted;

    public AbstractC0106c(a1.d dVar, i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // a1.d
    public i getContext() {
        i iVar = this._context;
        h.b(iVar);
        return iVar;
    }

    public final a1.d intercepted() {
        a1.d dVar = this.intercepted;
        if (dVar == null) {
            a1.f fVar = (a1.f) getContext().d(a1.e.f1672a);
            dVar = fVar != null ? new w1.g((AbstractC0366p) fVar, this) : this;
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // c1.AbstractC0104a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            a1.g d2 = getContext().d(a1.e.f1672a);
            h.b(d2);
            w1.g gVar = (w1.g) dVar;
            do {
                atomicReferenceFieldUpdater = w1.g.f4473h;
            } while (atomicReferenceFieldUpdater.get(gVar) == w1.a.f4465d);
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            C0355e c0355e = obj instanceof C0355e ? (C0355e) obj : null;
            if (c0355e != null) {
                c0355e.l();
            }
        }
        this.intercepted = C0105b.f2229a;
    }

    public AbstractC0106c(a1.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
