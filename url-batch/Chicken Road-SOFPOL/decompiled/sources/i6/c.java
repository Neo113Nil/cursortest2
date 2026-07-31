package i6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final g6.h f3460e;

    /* renamed from: f, reason: collision with root package name */
    public transient g6.c f3461f;

    public c(g6.c cVar, g6.h hVar) {
        super(cVar);
        this.f3460e = hVar;
    }

    @Override // g6.c
    public g6.h f() {
        g6.h hVar = this.f3460e;
        q6.i.b(hVar);
        return hVar;
    }

    @Override // i6.a
    public void q() {
        g6.c cVar = this.f3461f;
        if (cVar != null && cVar != this) {
            g6.f l3 = f().l(g6.d.f3045d);
            q6.i.b(l3);
            f7.f fVar = (f7.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7.f.f2772k;
            while (atomicReferenceFieldUpdater.get(fVar) == f7.a.f2762c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            a7.h hVar = obj instanceof a7.h ? (a7.h) obj : null;
            if (hVar != null) {
                hVar.p();
            }
        }
        this.f3461f = b.f3459d;
    }

    public c(g6.c cVar) {
        this(cVar, cVar != null ? cVar.f() : null);
    }
}
