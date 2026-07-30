package e7;

import c7.a0;
import c7.w1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements w1 {

    /* renamed from: f, reason: collision with root package name */
    public Object f2837f = g.f2872p;

    /* renamed from: g, reason: collision with root package name */
    public c7.h f2838g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f2839h;

    public b(e eVar) {
        this.f2839h = eVar;
    }

    @Override // c7.w1
    public final void a(h7.q qVar, int i7) {
        c7.h hVar = this.f2838g;
        if (hVar != null) {
            hVar.a(qVar, i7);
        }
    }

    public final Object b(j6.c cVar) {
        m mVar;
        Object obj = this.f2837f;
        boolean z8 = true;
        if (obj == g.f2872p || obj == g.f2868l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f2851l;
            e eVar = this.f2839h;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                if (eVar.w()) {
                    this.f2837f = g.f2868l;
                    Throwable q8 = eVar.q();
                    if (q8 != null) {
                        int i7 = h7.r.f4705a;
                        throw q8;
                    }
                    z8 = false;
                } else {
                    long andIncrement = e.f2847h.getAndIncrement(eVar);
                    long j8 = g.f2858b;
                    long j9 = andIncrement / j8;
                    int i8 = (int) (andIncrement % j8);
                    if (mVar2.f4704c != j9) {
                        mVar = eVar.p(j9, mVar2);
                        if (mVar == null) {
                            continue;
                        }
                    } else {
                        mVar = mVar2;
                    }
                    Object G = eVar.G(mVar, i8, andIncrement, null);
                    h7.s sVar = g.f2869m;
                    if (G == sVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    h7.s sVar2 = g.f2871o;
                    if (G == sVar2) {
                        if (andIncrement < eVar.t()) {
                            mVar.a();
                        }
                        mVar2 = mVar;
                    } else {
                        if (G == g.f2870n) {
                            e eVar2 = this.f2839h;
                            c7.h k8 = a0.k(a8.m.A(cVar));
                            try {
                                this.f2838g = k8;
                                Object G2 = eVar2.G(mVar, i8, andIncrement, this);
                                if (G2 == sVar) {
                                    a(mVar, i8);
                                } else {
                                    if (G2 == sVar2) {
                                        if (andIncrement < eVar2.t()) {
                                            mVar.a();
                                        }
                                        m mVar3 = (m) e.f2851l.get(eVar2);
                                        while (true) {
                                            if (eVar2.w()) {
                                                c7.h hVar = this.f2838g;
                                                r6.k.c(hVar);
                                                this.f2838g = null;
                                                this.f2837f = g.f2868l;
                                                Throwable q9 = eVar.q();
                                                if (q9 == null) {
                                                    hVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    hVar.resumeWith(d6.a.b(q9));
                                                }
                                            } else {
                                                long andIncrement2 = e.f2847h.getAndIncrement(eVar2);
                                                long j10 = g.f2858b;
                                                long j11 = andIncrement2 / j10;
                                                int i9 = (int) (andIncrement2 % j10);
                                                if (mVar3.f4704c != j11) {
                                                    m p6 = eVar2.p(j11, mVar3);
                                                    if (p6 != null) {
                                                        mVar3 = p6;
                                                    }
                                                }
                                                Object G3 = eVar2.G(mVar3, i9, andIncrement2, this);
                                                if (G3 == g.f2869m) {
                                                    a(mVar3, i9);
                                                    break;
                                                }
                                                if (G3 == g.f2871o) {
                                                    if (andIncrement2 < eVar2.t()) {
                                                        mVar3.a();
                                                    }
                                                } else {
                                                    if (G3 == g.f2870n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    mVar3.a();
                                                    this.f2837f = G3;
                                                    this.f2838g = null;
                                                }
                                            }
                                        }
                                    } else {
                                        mVar.a();
                                        this.f2837f = G2;
                                        this.f2838g = null;
                                    }
                                    k8.A(Boolean.TRUE, null);
                                }
                                return k8.q();
                            } catch (Throwable th) {
                                k8.z();
                                throw th;
                            }
                        }
                        mVar.a();
                        this.f2837f = G;
                    }
                }
            }
        }
        return Boolean.valueOf(z8);
    }

    public final Object c() {
        Object obj = this.f2837f;
        h7.s sVar = g.f2872p;
        if (obj == sVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f2837f = sVar;
        if (obj != g.f2868l) {
            return obj;
        }
        Throwable r8 = this.f2839h.r();
        int i7 = h7.r.f4705a;
        throw r8;
    }
}
