package P7;

import B2.RunnableC0272f;
import E7.l;
import O7.AbstractC0399y;
import O7.B;
import O7.C0388m;
import O7.C0391p;
import O7.V;
import O7.y0;
import Q7.h;
import Q7.j;
import Q7.k;
import S0.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.i;
import q7.v;

/* loaded from: classes2.dex */
public final class d extends i implements l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2688n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2689u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2690v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Object obj2) {
        super(1);
        this.f2688n = i;
        this.f2689u = obj;
        this.f2690v = obj2;
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        Object hVar;
        v vVar;
        v vVar2;
        switch (this.f2688n) {
            case 0:
                ((e) this.f2689u).f2691v.removeCallbacks((RunnableC0272f) this.f2690v);
                return v.f40183a;
            case 1:
                Throwable th = (Throwable) obj;
                ((J0.l) this.f2689u).invoke(th);
                n nVar = (n) this.f2690v;
                ((Q7.c) nVar.f2916v).i(th, false);
                do {
                    Q7.c cVar = (Q7.c) nVar.f2916v;
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = Q7.c.f2742v;
                    long j9 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = Q7.c.f2741u;
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    boolean z8 = true;
                    if (cVar.t(j10, true)) {
                        hVar = new h(cVar.o());
                    } else {
                        long j11 = j10 & 1152921504606846975L;
                        Q7.i iVar = j.f2771a;
                        if (j9 >= j11) {
                            hVar = iVar;
                        } else {
                            Object obj2 = Q7.e.f2758k;
                            k kVar = (k) Q7.c.f2746z.get(cVar);
                            while (true) {
                                if (cVar.t(atomicLongFieldUpdater2.get(cVar), z8)) {
                                    hVar = new h(cVar.o());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j12 = Q7.e.f2750b;
                                    Q7.i iVar2 = iVar;
                                    long j13 = andIncrement / j12;
                                    int i = (int) (andIncrement % j12);
                                    if (kVar.f3166v != j13) {
                                        k n9 = cVar.n(j13, kVar);
                                        if (n9 == null) {
                                            continue;
                                            iVar = iVar2;
                                            z8 = true;
                                        } else {
                                            kVar = n9;
                                        }
                                    }
                                    Object B8 = cVar.B(kVar, i, andIncrement, obj2);
                                    if (B8 == Q7.e.f2760m) {
                                        y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                                        if (y0Var != null) {
                                            y0Var.a(kVar, i);
                                        }
                                        cVar.D(andIncrement);
                                        kVar.h();
                                        hVar = iVar2;
                                    } else if (B8 == Q7.e.f2762o) {
                                        if (andIncrement < cVar.r()) {
                                            kVar.a();
                                        }
                                        iVar = iVar2;
                                        z8 = true;
                                    } else {
                                        if (B8 == Q7.e.f2761n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        hVar = B8;
                                    }
                                }
                            }
                        }
                    }
                    vVar = null;
                    if (hVar instanceof Q7.i) {
                        hVar = null;
                    }
                    vVar2 = v.f40183a;
                    if (hVar != null) {
                        X.l lVar = (X.l) hVar;
                        if (lVar instanceof X.k) {
                            X.k kVar2 = (X.k) lVar;
                            Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                            C0388m c0388m = kVar2.f3568b;
                            c0388m.getClass();
                            c0388m.J(new C0391p(cancellationException, false));
                        }
                        vVar = vVar2;
                    }
                } while (vVar != null);
                return vVar2;
            default:
                Throwable th2 = (Throwable) obj;
                t.h hVar2 = (t.h) this.f2689u;
                if (th2 == null) {
                    Object C7 = ((B) this.f2690v).C();
                    if (C7 instanceof V) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (C7 instanceof C0391p) {
                        throw ((C0391p) C7).f2619a;
                    }
                    hVar2.a(AbstractC0399y.w(C7));
                } else if (th2 instanceof CancellationException) {
                    hVar2.f40554d = true;
                    t.k kVar3 = hVar2.f40552b;
                    if (kVar3 != null && kVar3.f40557u.cancel(true)) {
                        hVar2.f40551a = null;
                        hVar2.f40552b = null;
                        hVar2.f40553c = null;
                    }
                } else {
                    hVar2.b(th2);
                }
                return v.f40183a;
        }
    }
}
