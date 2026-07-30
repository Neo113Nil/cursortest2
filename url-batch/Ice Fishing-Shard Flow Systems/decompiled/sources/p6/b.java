package p6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import n6.AbstractC0792z;
import n6.C0775h;
import n6.w0;

/* loaded from: classes.dex */
public final class b implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public Object f7219d = e.f7247p;

    /* renamed from: e, reason: collision with root package name */
    public C0775h f7220e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f7221i;

    public b(c cVar) {
        this.f7221i = cVar;
    }

    @Override // n6.w0
    public final void a(s6.r rVar, int i2) {
        C0775h c0775h = this.f7220e;
        if (c0775h != null) {
            c0775h.a(rVar, i2);
        }
    }

    public final Object b(q6.f frame) {
        k kVar;
        Boolean bool;
        k kVar2;
        Object obj = this.f7219d;
        boolean z7 = true;
        if (obj == e.f7247p || obj == e.f7243l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7227o;
            c cVar = this.f7221i;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (true) {
                if (cVar.s(c.f7222e.get(cVar), true)) {
                    this.f7219d = e.f7243l;
                    Throwable n7 = cVar.n();
                    if (n7 != null) {
                        int i2 = s6.s.f7855a;
                        throw n7;
                    }
                    z7 = false;
                } else {
                    long andIncrement = c.f7223i.getAndIncrement(cVar);
                    long j = e.f7234b;
                    long j7 = andIncrement / j;
                    int i5 = (int) (andIncrement % j);
                    if (kVar3.f7854c != j7) {
                        k m2 = cVar.m(j7, kVar3);
                        if (m2 == null) {
                            continue;
                        } else {
                            kVar = m2;
                        }
                    } else {
                        kVar = kVar3;
                    }
                    Object B7 = cVar.B(kVar, i5, andIncrement, null);
                    C0654a c0654a = e.f7244m;
                    if (B7 == c0654a) {
                        throw new IllegalStateException("unreachable");
                    }
                    C0654a c0654a2 = e.f7246o;
                    if (B7 == c0654a2) {
                        if (andIncrement < cVar.q()) {
                            kVar.a();
                        }
                        kVar3 = kVar;
                    } else {
                        if (B7 == e.f7245n) {
                            C0775h h7 = AbstractC0792z.h(W5.d.b(frame));
                            try {
                                this.f7220e = h7;
                                Object B8 = cVar.B(kVar, i5, andIncrement, this);
                                if (B8 == c0654a) {
                                    a(kVar, i5);
                                } else {
                                    if (B8 == c0654a2) {
                                        if (andIncrement < cVar.q()) {
                                            kVar.a();
                                        }
                                        k kVar4 = (k) c.f7227o.get(cVar);
                                        while (true) {
                                            if (cVar.s(c.f7222e.get(cVar), true)) {
                                                C0775h c0775h = this.f7220e;
                                                Intrinsics.b(c0775h);
                                                this.f7220e = null;
                                                this.f7219d = e.f7243l;
                                                Throwable n8 = cVar.n();
                                                if (n8 == null) {
                                                    R5.l lVar = R5.n.f2421d;
                                                    c0775h.resumeWith(Boolean.FALSE);
                                                } else {
                                                    R5.l lVar2 = R5.n.f2421d;
                                                    c0775h.resumeWith(V6.b.n(n8));
                                                }
                                            } else {
                                                long andIncrement2 = c.f7223i.getAndIncrement(cVar);
                                                long j8 = e.f7234b;
                                                long j9 = andIncrement2 / j8;
                                                int i7 = (int) (andIncrement2 % j8);
                                                if (kVar4.f7854c != j9) {
                                                    kVar2 = cVar.m(j9, kVar4);
                                                    if (kVar2 == null) {
                                                    }
                                                } else {
                                                    kVar2 = kVar4;
                                                }
                                                Object B9 = cVar.B(kVar2, i7, andIncrement2, this);
                                                if (B9 == e.f7244m) {
                                                    a(kVar2, i7);
                                                    break;
                                                }
                                                if (B9 == e.f7246o) {
                                                    if (andIncrement2 < cVar.q()) {
                                                        kVar2.a();
                                                    }
                                                    kVar4 = kVar2;
                                                } else {
                                                    if (B9 == e.f7245n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar2.a();
                                                    this.f7219d = B9;
                                                    this.f7220e = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.a();
                                        this.f7219d = B8;
                                        this.f7220e = null;
                                        bool = Boolean.TRUE;
                                    }
                                    h7.e(bool, null);
                                }
                                Object r7 = h7.r();
                                if (r7 == W5.a.f2787d) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                return r7;
                            } catch (Throwable th) {
                                h7.z();
                                throw th;
                            }
                        }
                        kVar.a();
                        this.f7219d = B7;
                    }
                }
            }
        }
        return Boolean.valueOf(z7);
    }
}
