package X1;

import f2.j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.C0821h;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final V1.i f4642e;

    /* renamed from: f, reason: collision with root package name */
    public transient V1.d f4643f;

    public c(V1.d dVar, V1.i iVar) {
        super(dVar);
        this.f4642e = iVar;
    }

    @Override // X1.a
    public void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V1.d dVar = this.f4643f;
        if (dVar != null && dVar != this) {
            V1.g v3 = t().v(V1.e.f4557d);
            j.c(v3);
            v2.f fVar = (v2.f) dVar;
            do {
                atomicReferenceFieldUpdater = v2.f.f9794k;
            } while (atomicReferenceFieldUpdater.get(fVar) == v2.a.f9784c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0821h c0821h = obj instanceof C0821h ? (C0821h) obj : null;
            if (c0821h != null) {
                c0821h.n();
            }
        }
        this.f4643f = b.f4641d;
    }

    @Override // V1.d
    public V1.i t() {
        V1.i iVar = this.f4642e;
        j.c(iVar);
        return iVar;
    }

    public c(V1.d dVar) {
        this(dVar, dVar != null ? dVar.t() : null);
    }
}
