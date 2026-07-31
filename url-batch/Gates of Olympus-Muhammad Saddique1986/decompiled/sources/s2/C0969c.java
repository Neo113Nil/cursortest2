package s2;

import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.w0;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969c implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public Object f8366d = i.f8403p;

    /* renamed from: e, reason: collision with root package name */
    public C0821h f8367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f8368f;

    public C0969c(g gVar) {
        this.f8368f = gVar;
    }

    @Override // q2.w0
    public final void a(v2.r rVar, int i3) {
        C0821h c0821h = this.f8367e;
        if (c0821h != null) {
            c0821h.a(rVar, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(X1.c cVar) {
        o oVar;
        Object obj;
        o oVar2;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.f8366d;
        if (obj2 == i.f8403p || obj2 == i.f8399l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f8381k;
            g gVar = this.f8368f;
            o oVar3 = (o) atomicReferenceFieldUpdater.get(gVar);
            while (!gVar.y()) {
                long andIncrement = g.f8377g.getAndIncrement(gVar);
                long j3 = i.f8389b;
                long j4 = andIncrement / j3;
                int i3 = (int) (andIncrement % j3);
                if (oVar3.f9826c != j4) {
                    o r3 = gVar.r(j4, oVar3);
                    if (r3 == null) {
                        continue;
                    } else {
                        oVar = r3;
                    }
                } else {
                    oVar = oVar3;
                }
                Object I3 = gVar.I(oVar, i3, andIncrement, null);
                m1.q qVar = i.f8400m;
                if (I3 == qVar) {
                    throw new IllegalStateException("unreachable");
                }
                m1.q qVar2 = i.f8402o;
                if (I3 == qVar2) {
                    if (andIncrement < gVar.v()) {
                        oVar.a();
                    }
                    oVar3 = oVar;
                } else {
                    if (I3 == i.f8401n) {
                        g gVar2 = this.f8368f;
                        C0821h l3 = AbstractC0837y.l(l0.c.B(cVar));
                        try {
                            this.f8367e = l3;
                            o oVar4 = oVar;
                            Object I4 = gVar2.I(oVar, i3, andIncrement, this);
                            if (I4 == qVar) {
                                a(oVar4, i3);
                            } else {
                                InterfaceC0427f interfaceC0427f = null;
                                InterfaceC0424c interfaceC0424c = gVar2.f8386e;
                                if (I4 == qVar2) {
                                    if (andIncrement < gVar2.v()) {
                                        oVar4.a();
                                    }
                                    o oVar5 = (o) g.f8381k.get(gVar2);
                                    while (true) {
                                        if (gVar2.y()) {
                                            C0821h c0821h = this.f8367e;
                                            f2.j.c(c0821h);
                                            this.f8367e = null;
                                            this.f8366d = i.f8399l;
                                            Throwable s3 = gVar.s();
                                            if (s3 == null) {
                                                c0821h.u(Boolean.FALSE);
                                            } else {
                                                c0821h.u(R1.a.b(s3));
                                            }
                                        } else {
                                            long andIncrement2 = g.f8377g.getAndIncrement(gVar2);
                                            long j5 = i.f8389b;
                                            long j6 = andIncrement2 / j5;
                                            int i4 = (int) (andIncrement2 % j5);
                                            if (oVar5.f9826c != j6) {
                                                o r4 = gVar2.r(j6, oVar5);
                                                if (r4 != null) {
                                                    oVar2 = r4;
                                                }
                                            } else {
                                                oVar2 = oVar5;
                                            }
                                            Object I5 = gVar2.I(oVar2, i4, andIncrement2, this);
                                            if (I5 == i.f8400m) {
                                                a(oVar2, i4);
                                                break;
                                            }
                                            if (I5 == i.f8402o) {
                                                if (andIncrement2 < gVar2.v()) {
                                                    oVar2.a();
                                                }
                                                oVar5 = oVar2;
                                            } else {
                                                if (I5 == i.f8401n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                oVar2.a();
                                                this.f8366d = I5;
                                                this.f8367e = null;
                                                obj = Boolean.TRUE;
                                                if (interfaceC0424c != null) {
                                                    interfaceC0427f = new C0968b(interfaceC0424c, objArr2 == true ? 1 : 0, I5);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    oVar4.a();
                                    this.f8366d = I4;
                                    this.f8367e = null;
                                    obj = Boolean.TRUE;
                                    if (interfaceC0424c != null) {
                                        interfaceC0427f = new C0968b(interfaceC0424c, objArr == true ? 1 : 0, I4);
                                    }
                                }
                                l3.m(obj, interfaceC0427f);
                            }
                            return l3.q();
                        } catch (Throwable th) {
                            l3.A();
                            throw th;
                        }
                    }
                    oVar.a();
                    this.f8366d = I3;
                }
            }
            this.f8366d = i.f8399l;
            Throwable s4 = gVar.s();
            if (s4 != null) {
                int i5 = v2.s.f9827a;
                throw s4;
            }
            return Boolean.valueOf(z3);
        }
        z3 = true;
        return Boolean.valueOf(z3);
    }

    public final Object c() {
        Object obj = this.f8366d;
        m1.q qVar = i.f8403p;
        if (obj == qVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f8366d = qVar;
        if (obj != i.f8399l) {
            return obj;
        }
        Throwable t3 = this.f8368f.t();
        int i3 = v2.s.f9827a;
        throw t3;
    }
}
