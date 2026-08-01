package t1;

import V.q;
import c1.AbstractC0106c;
import i1.InterfaceC0192l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r1.AbstractC0369t;
import r1.C0355e;
import r1.h0;
import w1.u;

/* loaded from: classes.dex */
public final class a implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f4170a = d.f4193p;

    /* renamed from: b, reason: collision with root package name */
    public C0355e f4171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f4172c;

    public a(b bVar) {
        this.f4172c = bVar;
    }

    @Override // r1.h0
    public final void a(j jVar, int i) {
        C0355e c0355e = this.f4171b;
        if (c0355e != null) {
            c0355e.a(jVar, i);
        }
    }

    public final Object b(AbstractC0106c abstractC0106c) {
        C0355e c0355e;
        w1.o oVar;
        Boolean bool;
        int i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.i;
        b bVar = this.f4172c;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.p(b.f4173d.get(bVar), true)) {
                this.f4170a = d.f4189l;
                Throwable l2 = bVar.l();
                if (l2 == null) {
                    return Boolean.FALSE;
                }
                int i2 = u.f4501a;
                throw l2;
            }
            long andIncrement = b.e.getAndIncrement(bVar);
            long j = d.f4182b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (jVar.f4500c != j2) {
                j k2 = bVar.k(j2, jVar);
                if (k2 == null) {
                    continue;
                } else {
                    jVar = k2;
                }
            }
            Object x2 = bVar.x(jVar, i3, andIncrement, null);
            q qVar = d.f4190m;
            if (x2 == qVar) {
                throw new IllegalStateException("unreachable");
            }
            q qVar2 = d.f4192o;
            if (x2 != qVar2) {
                if (x2 != d.f4191n) {
                    jVar.a();
                    this.f4170a = x2;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f4172c;
                C0355e d2 = AbstractC0369t.d(H1.l.C(abstractC0106c));
                try {
                    this.f4171b = d2;
                    c0355e = d2;
                } catch (Throwable th) {
                    th = th;
                    c0355e = d2;
                }
                try {
                    Object x3 = bVar2.x(jVar, i3, andIncrement, this);
                    if (x3 == qVar) {
                        a(jVar, i3);
                    } else {
                        a1.i iVar = c0355e.e;
                        InterfaceC0192l interfaceC0192l = bVar2.f4180c;
                        if (x3 == qVar2) {
                            if (andIncrement < bVar2.n()) {
                                jVar.a();
                            }
                            j jVar2 = (j) b.i.get(bVar2);
                            while (true) {
                                if (bVar2.p(b.f4173d.get(bVar2), true)) {
                                    C0355e c0355e2 = this.f4171b;
                                    j1.h.b(c0355e2);
                                    this.f4171b = null;
                                    this.f4170a = d.f4189l;
                                    Throwable l3 = bVar.l();
                                    if (l3 == null) {
                                        c0355e2.resumeWith(Boolean.FALSE);
                                    } else {
                                        c0355e2.resumeWith(H1.d.r(l3));
                                    }
                                } else {
                                    long andIncrement2 = b.e.getAndIncrement(bVar2);
                                    long j3 = d.f4182b;
                                    long j4 = andIncrement2 / j3;
                                    int i4 = (int) (andIncrement2 % j3);
                                    if (jVar2.f4500c != j4) {
                                        j k3 = bVar2.k(j4, jVar2);
                                        if (k3 != null) {
                                            jVar2 = k3;
                                        }
                                    }
                                    InterfaceC0192l interfaceC0192l2 = interfaceC0192l;
                                    Object x4 = bVar2.x(jVar2, i4, andIncrement2, this);
                                    if (x4 == d.f4190m) {
                                        a(jVar2, i4);
                                        break;
                                    }
                                    if (x4 == d.f4192o) {
                                        if (andIncrement2 < bVar2.n()) {
                                            jVar2.a();
                                        }
                                        interfaceC0192l = interfaceC0192l2;
                                    } else {
                                        if (x4 == d.f4191n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        this.f4170a = x4;
                                        this.f4171b = null;
                                        oVar = interfaceC0192l2 != null ? new w1.o(interfaceC0192l2, x4, iVar) : null;
                                        bool = Boolean.TRUE;
                                        i = c0355e.f4099c;
                                    }
                                }
                            }
                        } else {
                            jVar.a();
                            this.f4170a = x3;
                            this.f4171b = null;
                            oVar = interfaceC0192l != null ? new w1.o(interfaceC0192l, x3, iVar) : null;
                            bool = Boolean.TRUE;
                            i = c0355e.f4099c;
                        }
                        c0355e.u(bool, i, oVar);
                    }
                    return c0355e.n();
                } catch (Throwable th2) {
                    th = th2;
                    c0355e.t();
                    throw th;
                }
            }
            if (andIncrement < bVar.n()) {
                jVar.a();
            }
        }
    }

    public final Object c() {
        Object obj = this.f4170a;
        q qVar = d.f4193p;
        if (obj == qVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f4170a = qVar;
        if (obj != d.f4189l) {
            return obj;
        }
        Throwable l2 = this.f4172c.l();
        if (l2 == null) {
            l2 = new k("Channel was closed");
        }
        int i = u.f4501a;
        throw l2;
    }
}
