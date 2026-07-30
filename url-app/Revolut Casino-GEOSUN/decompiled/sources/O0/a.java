package O0;

import M0.AbstractC0063v;
import M0.C0048f;
import M0.l0;
import R0.v;
import R0.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: e, reason: collision with root package name */
    public Object f705e = d.f735p;

    /* renamed from: f, reason: collision with root package name */
    public C0048f f706f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f707g;

    public a(b bVar) {
        this.f707g = bVar;
    }

    @Override // M0.l0
    public final void a(v vVar, int i2) {
        C0048f c0048f = this.f706f;
        if (c0048f != null) {
            c0048f.a(vVar, i2);
        }
    }

    public final Object b(P0.f fVar) {
        C0048f c0048f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f713l;
        b bVar = this.f707g;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f708g.get(bVar), true)) {
                this.f705e = d.f731l;
                Throwable m2 = bVar.m();
                if (m2 == null) {
                    return Boolean.FALSE;
                }
                int i2 = w.f939a;
                throw m2;
            }
            long andIncrement = b.f709h.getAndIncrement(bVar);
            long j2 = d.f721b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar.f938g != j3) {
                j k2 = bVar.k(j3, jVar);
                if (k2 == null) {
                    continue;
                } else {
                    jVar = k2;
                }
            }
            Object A2 = bVar.A(jVar, i3, andIncrement, null);
            A.j jVar2 = d.f732m;
            if (A2 == jVar2) {
                throw new IllegalStateException("unreachable");
            }
            A.j jVar3 = d.f734o;
            if (A2 == jVar3) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
            } else {
                if (A2 != d.f733n) {
                    jVar.a();
                    this.f705e = A2;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f707g;
                C0048f c2 = AbstractC0063v.c(o.g.r(fVar));
                try {
                    this.f706f = c2;
                    c0048f = c2;
                    try {
                        Object A3 = bVar2.A(jVar, i3, andIncrement, this);
                        if (A3 == jVar2) {
                            a(jVar, i3);
                        } else {
                            R0.q qVar = null;
                            w0.i iVar = c0048f.f662i;
                            E0.l lVar = bVar2.f718f;
                            if (A3 == jVar3) {
                                if (andIncrement < bVar2.p()) {
                                    jVar.a();
                                }
                                j jVar4 = (j) b.f713l.get(bVar2);
                                while (true) {
                                    if (bVar2.r(b.f708g.get(bVar2), true)) {
                                        C0048f c0048f2 = this.f706f;
                                        F0.i.b(c0048f2);
                                        this.f706f = null;
                                        this.f705e = d.f731l;
                                        Throwable m3 = bVar.m();
                                        if (m3 == null) {
                                            c0048f2.resumeWith(Boolean.FALSE);
                                        } else {
                                            c0048f2.resumeWith(o.g.f(m3));
                                        }
                                    } else {
                                        long andIncrement2 = b.f709h.getAndIncrement(bVar2);
                                        long j4 = d.f721b;
                                        long j5 = andIncrement2 / j4;
                                        int i4 = (int) (andIncrement2 % j4);
                                        if (jVar4.f938g != j5) {
                                            j k3 = bVar2.k(j5, jVar4);
                                            if (k3 != null) {
                                                jVar4 = k3;
                                            }
                                        }
                                        E0.l lVar2 = lVar;
                                        Object A4 = bVar2.A(jVar4, i4, andIncrement2, this);
                                        if (A4 == d.f732m) {
                                            a(jVar4, i4);
                                            break;
                                        }
                                        if (A4 == d.f734o) {
                                            if (andIncrement2 < bVar2.p()) {
                                                jVar4.a();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (A4 == d.f733n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar4.a();
                                            this.f705e = A4;
                                            this.f706f = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                qVar = new R0.q(lVar2, A4, iVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f705e = A3;
                                this.f706f = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    qVar = new R0.q(lVar, A3, iVar);
                                }
                            }
                            c0048f.c(bool, qVar);
                        }
                        return c0048f.s();
                    } catch (Throwable th) {
                        th = th;
                        c0048f.z();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0048f = c2;
                }
            }
        }
    }
}
