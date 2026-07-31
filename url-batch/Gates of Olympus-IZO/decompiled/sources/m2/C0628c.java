package m2;

import M1.B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.w0;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628c implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public Object f5936d = g.p;

    /* renamed from: e, reason: collision with root package name */
    public C0536h f5937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f5938f;

    public C0628c(e eVar) {
        this.f5938f = eVar;
    }

    @Override // k2.w0
    public final void a(p2.s sVar, int i3) {
        C0536h c0536h = this.f5937e;
        if (c0536h != null) {
            c0536h.a(sVar, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(R1.c cVar) {
        m mVar;
        Object obj;
        m mVar2;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.f5936d;
        if (obj2 == g.p || obj2 == g.f5962l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f5944k;
            e eVar = this.f5938f;
            m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                eVar.getClass();
                if (eVar.v(e.f5939f.get(eVar), true)) {
                    this.f5936d = g.f5962l;
                    Throwable q2 = eVar.q();
                    if (q2 != null) {
                        int i3 = p2.t.f6807a;
                        throw q2;
                    }
                } else {
                    long andIncrement = e.f5940g.getAndIncrement(eVar);
                    long j3 = g.f5952b;
                    long j4 = andIncrement / j3;
                    int i4 = (int) (andIncrement % j3);
                    if (mVar3.f6806c != j4) {
                        m p = eVar.p(j4, mVar3);
                        if (p == null) {
                            continue;
                        } else {
                            mVar = p;
                        }
                    } else {
                        mVar = mVar3;
                    }
                    Object D = eVar.D(mVar, i4, andIncrement, null);
                    j1.p pVar = g.f5963m;
                    if (D == pVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    j1.p pVar2 = g.f5965o;
                    if (D == pVar2) {
                        if (andIncrement < eVar.t()) {
                            mVar.a();
                        }
                        mVar3 = mVar;
                    } else {
                        if (D == g.f5964n) {
                            e eVar2 = this.f5938f;
                            C0536h k3 = AbstractC0552y.k(B.G(cVar));
                            try {
                                this.f5937e = k3;
                                m mVar4 = mVar;
                                Object D3 = eVar2.D(mVar, i4, andIncrement, this);
                                if (D3 == pVar) {
                                    a(mVar4, i4);
                                } else {
                                    Y1.f fVar = null;
                                    Y1.c cVar2 = eVar2.f5949e;
                                    if (D3 == pVar2) {
                                        if (andIncrement < eVar2.t()) {
                                            mVar4.a();
                                        }
                                        m mVar5 = (m) e.f5944k.get(eVar2);
                                        while (true) {
                                            if (eVar2.v(e.f5939f.get(eVar2), true)) {
                                                C0536h c0536h = this.f5937e;
                                                Z1.i.c(c0536h);
                                                this.f5937e = null;
                                                this.f5936d = g.f5962l;
                                                Throwable q3 = eVar.q();
                                                if (q3 == null) {
                                                    c0536h.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c0536h.resumeWith(I2.l.t(q3));
                                                }
                                            } else {
                                                long andIncrement2 = e.f5940g.getAndIncrement(eVar2);
                                                long j5 = g.f5952b;
                                                long j6 = andIncrement2 / j5;
                                                int i5 = (int) (andIncrement2 % j5);
                                                if (mVar5.f6806c != j6) {
                                                    m p3 = eVar2.p(j6, mVar5);
                                                    if (p3 != null) {
                                                        mVar2 = p3;
                                                    }
                                                } else {
                                                    mVar2 = mVar5;
                                                }
                                                Object D4 = eVar2.D(mVar2, i5, andIncrement2, this);
                                                if (D4 == g.f5963m) {
                                                    a(mVar2, i5);
                                                    break;
                                                }
                                                if (D4 == g.f5965o) {
                                                    if (andIncrement2 < eVar2.t()) {
                                                        mVar2.a();
                                                    }
                                                    mVar5 = mVar2;
                                                } else {
                                                    if (D4 == g.f5964n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    mVar2.a();
                                                    this.f5936d = D4;
                                                    this.f5937e = null;
                                                    obj = Boolean.TRUE;
                                                    if (cVar2 != null) {
                                                        fVar = new C0627b(cVar2, objArr2 == true ? 1 : 0, D4);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        mVar4.a();
                                        this.f5936d = D3;
                                        this.f5937e = null;
                                        obj = Boolean.TRUE;
                                        if (cVar2 != null) {
                                            fVar = new C0627b(cVar2, objArr == true ? 1 : 0, D3);
                                        }
                                    }
                                    k3.n(obj, fVar);
                                }
                                Object p4 = k3.p();
                                Q1.a aVar = Q1.a.f3113d;
                                return p4;
                            } catch (Throwable th) {
                                k3.z();
                                throw th;
                            }
                        }
                        mVar.a();
                        this.f5936d = D;
                    }
                }
            }
        }
        z3 = true;
        return Boolean.valueOf(z3);
    }

    public final Object c() {
        Object obj = this.f5936d;
        j1.p pVar = g.p;
        if (obj == pVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f5936d = pVar;
        if (obj != g.f5962l) {
            return obj;
        }
        Throwable r3 = this.f5938f.r();
        int i3 = p2.t.f6807a;
        throw r3;
    }
}
