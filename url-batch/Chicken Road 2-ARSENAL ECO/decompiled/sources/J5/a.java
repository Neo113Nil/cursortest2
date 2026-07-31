package J5;

import H5.AbstractC0165z;
import H5.C0147g;
import H5.x0;
import M5.u;
import M5.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p5.EnumC0580a;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements x0 {

    /* renamed from: f, reason: collision with root package name */
    public Object f1291f = d.f1320p;

    /* renamed from: g, reason: collision with root package name */
    public C0147g f1292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f1293h;

    public a(b bVar) {
        this.f1293h = bVar;
    }

    @Override // H5.x0
    public final void a(M5.t tVar, int i7) {
        C0147g c0147g = this.f1292g;
        if (c0147g != null) {
            c0147g.a(tVar, i7);
        }
    }

    public final Object b(K5.e eVar) {
        j jVar;
        Boolean bool;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f1299l;
        b bVar = this.f1293h;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar);
        while (!bVar.s(b.f1294g.get(bVar), true)) {
            long andIncrement = b.f1295h.getAndIncrement(bVar);
            long j4 = d.f1306b;
            long j7 = andIncrement / j4;
            int i7 = (int) (andIncrement % j4);
            if (jVar3.f1622h != j7) {
                jVar = bVar.m(j7, jVar3);
                if (jVar == null) {
                    continue;
                }
            } else {
                jVar = jVar3;
            }
            Object B3 = bVar.B(jVar, i7, andIncrement, null);
            v vVar = d.f1317m;
            if (B3 == vVar) {
                throw new IllegalStateException("unreachable");
            }
            v vVar2 = d.f1319o;
            if (B3 == vVar2) {
                if (andIncrement < bVar.q()) {
                    jVar.a();
                }
                jVar3 = jVar;
            } else {
                if (B3 != d.f1318n) {
                    jVar.a();
                    this.f1291f = B3;
                    return Boolean.TRUE;
                }
                C0147g h7 = AbstractC0165z.h(AbstractC0676f.m(eVar));
                try {
                    this.f1292g = h7;
                    try {
                        Object B4 = bVar.B(jVar, i7, andIncrement, this);
                        if (B4 == vVar) {
                            a(jVar, i7);
                        } else {
                            if (B4 == vVar2) {
                                if (andIncrement < bVar.q()) {
                                    jVar.a();
                                }
                                j jVar4 = (j) b.f1299l.get(bVar);
                                while (true) {
                                    if (bVar.s(b.f1294g.get(bVar), true)) {
                                        C0147g c0147g = this.f1292g;
                                        kotlin.jvm.internal.i.b(c0147g);
                                        this.f1292g = null;
                                        this.f1291f = d.f1316l;
                                        Throwable n7 = bVar.n();
                                        if (n7 == null) {
                                            c0147g.resumeWith(Boolean.FALSE);
                                        } else {
                                            c0147g.resumeWith(AbstractC0676f.f(n7));
                                        }
                                    } else {
                                        long andIncrement2 = b.f1295h.getAndIncrement(bVar);
                                        long j8 = d.f1306b;
                                        long j9 = andIncrement2 / j8;
                                        int i8 = (int) (andIncrement2 % j8);
                                        if (jVar4.f1622h != j9) {
                                            jVar2 = bVar.m(j9, jVar4);
                                            if (jVar2 == null) {
                                            }
                                        } else {
                                            jVar2 = jVar4;
                                        }
                                        Object B6 = bVar.B(jVar2, i8, andIncrement2, this);
                                        if (B6 == d.f1317m) {
                                            a(jVar2, i8);
                                            break;
                                        }
                                        if (B6 == d.f1319o) {
                                            if (andIncrement2 < bVar.q()) {
                                                jVar2.a();
                                            }
                                            jVar4 = jVar2;
                                        } else {
                                            if (B6 == d.f1318n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar2.a();
                                            this.f1291f = B6;
                                            this.f1292g = null;
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f1291f = B4;
                                this.f1292g = null;
                                bool = Boolean.TRUE;
                            }
                            h7.z(bool, null);
                        }
                        Object q6 = h7.q();
                        EnumC0580a enumC0580a = EnumC0580a.f5697f;
                        return q6;
                    } catch (Throwable th) {
                        th = th;
                        h7.y();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        this.f1291f = d.f1316l;
        Throwable n8 = bVar.n();
        if (n8 == null) {
            return Boolean.FALSE;
        }
        int i9 = u.f1623a;
        throw n8;
    }
}
