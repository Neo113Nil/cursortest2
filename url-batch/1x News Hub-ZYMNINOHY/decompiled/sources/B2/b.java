package B2;

import B0.p;
import K.a0;
import b2.C0195i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l2.l;
import t2.C1202l;
import t2.C1204n;
import t2.p0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f168e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i3, Object obj2) {
        super(1);
        this.f168e = i3;
        this.f = obj;
        this.f169g = obj2;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        Object hVar;
        C0195i c0195i;
        C0195i c0195i2;
        switch (this.f168e) {
            case 0:
                ((c) this.f169g).getClass();
                ((d) this.f).e(null);
                return C0195i.f2555a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f172g;
                ((c) this.f169g).getClass();
                d dVar = (d) this.f;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return C0195i.f2555a;
            default:
                Throwable th = (Throwable) obj;
                ((g) this.f).invoke(th);
                p pVar = (p) this.f169g;
                ((v2.c) pVar.f164c).f(th, false);
                do {
                    v2.c cVar = (v2.c) pVar.f164c;
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = v2.c.f10579c;
                    long j3 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = v2.c.f10578b;
                    long j4 = atomicLongFieldUpdater2.get(cVar);
                    boolean z = true;
                    if (cVar.r(j4, true)) {
                        hVar = new v2.h(cVar.m());
                    } else {
                        long j5 = j4 & 1152921504606846975L;
                        v2.i iVar = v2.j.f10609a;
                        if (j3 >= j5) {
                            hVar = iVar;
                        } else {
                            Object obj2 = v2.e.f10597k;
                            v2.k kVar = (v2.k) v2.c.f10582g.get(cVar);
                            while (true) {
                                if (cVar.r(atomicLongFieldUpdater2.get(cVar), z)) {
                                    hVar = new v2.h(cVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j6 = v2.e.f10589b;
                                    v2.i iVar2 = iVar;
                                    long j7 = andIncrement / j6;
                                    int i3 = (int) (andIncrement % j6);
                                    if (kVar.f10866c != j7) {
                                        v2.k l3 = cVar.l(j7, kVar);
                                        if (l3 == null) {
                                            continue;
                                            iVar = iVar2;
                                            z = true;
                                        } else {
                                            kVar = l3;
                                        }
                                    }
                                    Object A3 = cVar.A(kVar, i3, andIncrement, obj2);
                                    if (A3 == v2.e.f10599m) {
                                        p0 p0Var = obj2 instanceof p0 ? (p0) obj2 : null;
                                        if (p0Var != null) {
                                            p0Var.a(kVar, i3);
                                        }
                                        cVar.C(andIncrement);
                                        kVar.h();
                                        hVar = iVar2;
                                    } else if (A3 == v2.e.o) {
                                        if (andIncrement < cVar.p()) {
                                            kVar.a();
                                        }
                                        iVar = iVar2;
                                        z = true;
                                    } else {
                                        if (A3 == v2.e.f10600n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        hVar = A3;
                                    }
                                }
                            }
                        }
                    }
                    c0195i = null;
                    if (hVar instanceof v2.i) {
                        hVar = null;
                    }
                    c0195i2 = C0195i.f2555a;
                    if (hVar != null) {
                        a0 a0Var = (a0) hVar;
                        Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                        C1202l c1202l = a0Var.f740b;
                        c1202l.getClass();
                        c1202l.J(new C1204n(cancellationException, false));
                        c0195i = c0195i2;
                    }
                } while (c0195i != null);
                return c0195i2;
        }
    }
}
