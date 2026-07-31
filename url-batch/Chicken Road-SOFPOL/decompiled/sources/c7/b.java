package c7;

import a7.s1;
import a7.x;
import d4.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements s1 {

    /* renamed from: d, reason: collision with root package name */
    public Object f1764d = e.f1791p;

    /* renamed from: e, reason: collision with root package name */
    public a7.h f1765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f1766f;

    public b(c cVar) {
        this.f1766f = cVar;
    }

    @Override // a7.s1
    public final void a(f7.r rVar, int i) {
        a7.h hVar = this.f1765e;
        if (hVar != null) {
            hVar.a(rVar, i);
        }
    }

    public final Object b(i6.c cVar) {
        k kVar;
        Object obj = this.f1764d;
        boolean z3 = true;
        if (obj == e.f1791p || obj == e.f1787l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1771j;
            c cVar2 = this.f1766f;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
            while (true) {
                cVar2.getClass();
                if (cVar2.r(c.f1767e.get(cVar2), true)) {
                    this.f1764d = e.f1787l;
                    Throwable m7 = cVar2.m();
                    if (m7 != null) {
                        int i = f7.s.f2800a;
                        throw m7;
                    }
                    z3 = false;
                } else {
                    long andIncrement = c.f1768f.getAndIncrement(cVar2);
                    long j7 = e.f1778b;
                    long j8 = andIncrement / j7;
                    int i8 = (int) (andIncrement % j7);
                    if (kVar2.f2799c != j8) {
                        kVar = cVar2.l(j8, kVar2);
                        if (kVar == null) {
                            continue;
                        }
                    } else {
                        kVar = kVar2;
                    }
                    Object C = cVar2.C(kVar, i8, andIncrement, null);
                    t tVar = e.f1788m;
                    if (C == tVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    t tVar2 = e.f1790o;
                    if (C == tVar2) {
                        if (andIncrement < cVar2.p()) {
                            kVar.a();
                        }
                        kVar2 = kVar;
                    } else {
                        if (C == e.f1789n) {
                            c cVar3 = this.f1766f;
                            a7.h i9 = x.i(m.a.G(cVar));
                            try {
                                this.f1765e = i9;
                                Object C2 = cVar3.C(kVar, i8, andIncrement, this);
                                if (C2 == tVar) {
                                    a(kVar, i8);
                                } else {
                                    if (C2 == tVar2) {
                                        if (andIncrement < cVar3.p()) {
                                            kVar.a();
                                        }
                                        k kVar3 = (k) c.f1771j.get(cVar3);
                                        while (true) {
                                            if (cVar3.r(c.f1767e.get(cVar3), true)) {
                                                a7.h hVar = this.f1765e;
                                                q6.i.b(hVar);
                                                this.f1765e = null;
                                                this.f1764d = e.f1787l;
                                                Throwable m8 = cVar2.m();
                                                if (m8 == null) {
                                                    hVar.k(Boolean.FALSE);
                                                } else {
                                                    hVar.k(s6.a.l(m8));
                                                }
                                            } else {
                                                long andIncrement2 = c.f1768f.getAndIncrement(cVar3);
                                                long j9 = e.f1778b;
                                                long j10 = andIncrement2 / j9;
                                                int i10 = (int) (andIncrement2 % j9);
                                                if (kVar3.f2799c != j10) {
                                                    k l3 = cVar3.l(j10, kVar3);
                                                    if (l3 != null) {
                                                        kVar3 = l3;
                                                    }
                                                }
                                                Object C3 = cVar3.C(kVar3, i10, andIncrement2, this);
                                                if (C3 == e.f1788m) {
                                                    a(kVar3, i10);
                                                    break;
                                                }
                                                if (C3 == e.f1790o) {
                                                    if (andIncrement2 < cVar3.p()) {
                                                        kVar3.a();
                                                    }
                                                } else {
                                                    if (C3 == e.f1789n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar3.a();
                                                    this.f1764d = C3;
                                                    this.f1765e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.a();
                                        this.f1764d = C2;
                                        this.f1765e = null;
                                    }
                                    i9.C(Boolean.TRUE, null);
                                }
                                return i9.s();
                            } catch (Throwable th) {
                                i9.B();
                                throw th;
                            }
                        }
                        kVar.a();
                        this.f1764d = C;
                    }
                }
            }
        }
        return Boolean.valueOf(z3);
    }

    public final Object c() {
        Object obj = this.f1764d;
        t tVar = e.f1791p;
        if (obj == tVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f1764d = tVar;
        if (obj != e.f1787l) {
            return obj;
        }
        Throwable n6 = this.f1766f.n();
        int i = f7.s.f2800a;
        throw n6;
    }
}
