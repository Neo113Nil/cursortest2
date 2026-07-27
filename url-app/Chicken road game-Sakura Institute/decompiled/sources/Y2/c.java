package Y2;

import W2.B;
import W2.C0;
import W2.C0286h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class c implements C0 {

    /* renamed from: d, reason: collision with root package name */
    public Object f4405d = g.f4435p;

    /* renamed from: e, reason: collision with root package name */
    public C0286h f4406e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f4407i;

    public c(e eVar) {
        this.f4407i = eVar;
    }

    @Override // W2.C0
    public final void a(b3.r rVar, int i2) {
        C0286h c0286h = this.f4406e;
        if (c0286h != null) {
            c0286h.a(rVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(E2.c frame) {
        m mVar;
        Object obj;
        m mVar2;
        boolean z4 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.f4405d;
        if (obj2 == g.f4435p || obj2 == g.f4431l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f4413n;
            e eVar = this.f4407i;
            m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                eVar.getClass();
                if (eVar.v(e.f4408i.get(eVar), true)) {
                    this.f4405d = g.f4431l;
                    Throwable p4 = eVar.p();
                    if (p4 != null) {
                        int i2 = b3.s.f5687a;
                        throw p4;
                    }
                } else {
                    long andIncrement = e.f4409j.getAndIncrement(eVar);
                    long j4 = g.f4421b;
                    long j5 = andIncrement / j4;
                    int i4 = (int) (andIncrement % j4);
                    if (mVar3.f5686c != j5) {
                        m n2 = eVar.n(j5, mVar3);
                        if (n2 == null) {
                            continue;
                        } else {
                            mVar = n2;
                        }
                    } else {
                        mVar = mVar3;
                    }
                    Object D3 = eVar.D(mVar, i4, andIncrement, null);
                    b3.t tVar = g.f4432m;
                    if (D3 == tVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    b3.t tVar2 = g.f4434o;
                    if (D3 == tVar2) {
                        if (andIncrement < eVar.s()) {
                            mVar.a();
                        }
                        mVar3 = mVar;
                    } else {
                        if (D3 == g.f4433n) {
                            e eVar2 = this.f4407i;
                            C0286h h4 = B.h(D2.f.b(frame));
                            try {
                                this.f4406e = h4;
                                m mVar4 = mVar;
                                Object D4 = eVar2.D(mVar, i4, andIncrement, this);
                                if (D4 == tVar) {
                                    a(mVar4, i4);
                                } else {
                                    L2.c cVar = null;
                                    Function1 function1 = eVar2.f4418e;
                                    if (D4 == tVar2) {
                                        if (andIncrement < eVar2.s()) {
                                            mVar4.a();
                                        }
                                        m mVar5 = (m) e.f4413n.get(eVar2);
                                        while (true) {
                                            if (eVar2.v(e.f4408i.get(eVar2), true)) {
                                                C0286h c0286h = this.f4406e;
                                                Intrinsics.c(c0286h);
                                                this.f4406e = null;
                                                this.f4405d = g.f4431l;
                                                Throwable p5 = eVar.p();
                                                if (p5 == null) {
                                                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                                                    c0286h.u(Boolean.FALSE);
                                                } else {
                                                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                                                    c0286h.u(AbstractC1343r.a(p5));
                                                }
                                            } else {
                                                long andIncrement2 = e.f4409j.getAndIncrement(eVar2);
                                                long j6 = g.f4421b;
                                                long j7 = andIncrement2 / j6;
                                                int i5 = (int) (andIncrement2 % j6);
                                                if (mVar5.f5686c != j7) {
                                                    m n4 = eVar2.n(j7, mVar5);
                                                    if (n4 != null) {
                                                        mVar2 = n4;
                                                    }
                                                } else {
                                                    mVar2 = mVar5;
                                                }
                                                Object D5 = eVar2.D(mVar2, i5, andIncrement2, this);
                                                if (D5 == g.f4432m) {
                                                    a(mVar2, i5);
                                                    break;
                                                }
                                                if (D5 == g.f4434o) {
                                                    if (andIncrement2 < eVar2.s()) {
                                                        mVar2.a();
                                                    }
                                                    mVar5 = mVar2;
                                                } else {
                                                    if (D5 == g.f4433n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    mVar2.a();
                                                    this.f4405d = D5;
                                                    this.f4406e = null;
                                                    obj = Boolean.TRUE;
                                                    if (function1 != null) {
                                                        cVar = new b(function1, objArr2 == true ? 1 : 0, D5);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        mVar4.a();
                                        this.f4405d = D4;
                                        this.f4406e = null;
                                        obj = Boolean.TRUE;
                                        if (function1 != null) {
                                            cVar = new b(function1, objArr == true ? 1 : 0, D4);
                                        }
                                    }
                                    h4.n(obj, cVar);
                                }
                                Object r2 = h4.r();
                                if (r2 == D2.a.f2163d) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                return r2;
                            } catch (Throwable th) {
                                h4.C();
                                throw th;
                            }
                        }
                        mVar.a();
                        this.f4405d = D3;
                    }
                }
            }
        }
        z4 = true;
        return Boolean.valueOf(z4);
    }

    public final Object c() {
        Object obj = this.f4405d;
        b3.t tVar = g.f4435p;
        if (obj == tVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f4405d = tVar;
        if (obj != g.f4431l) {
            return obj;
        }
        Throwable q2 = this.f4407i.q();
        int i2 = b3.s.f5687a;
        throw q2;
    }
}
