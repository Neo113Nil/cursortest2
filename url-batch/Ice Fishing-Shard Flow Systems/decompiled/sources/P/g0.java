package P;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n6.C0781n;
import n6.C0784q;
import n6.w0;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G0.l f2087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.z f2088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(G0.l lVar, com.google.firebase.messaging.z zVar) {
        super(1);
        this.f2087d = lVar;
        this.f2088e = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object hVar;
        Unit unit;
        Throwable th = (Throwable) obj;
        this.f2087d.invoke(th);
        p6.c cVar = (p6.c) this.f2088e.f4537i;
        cVar.h(th, false);
        do {
            cVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = p6.c.f7223i;
            long j = atomicLongFieldUpdater.get(cVar);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = p6.c.f7222e;
            long j7 = atomicLongFieldUpdater2.get(cVar);
            boolean z7 = true;
            if (cVar.s(j7, true)) {
                hVar = new p6.h(cVar.n());
            } else {
                long j8 = j7 & 1152921504606846975L;
                p6.i iVar = p6.j.f7255a;
                if (j < j8) {
                    Object obj2 = p6.e.f7242k;
                    p6.k kVar = (p6.k) p6.c.f7227o.get(cVar);
                    while (true) {
                        if (cVar.s(atomicLongFieldUpdater2.get(cVar), z7)) {
                            hVar = new p6.h(cVar.n());
                            break;
                        }
                        long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                        long j9 = p6.e.f7234b;
                        long j10 = andIncrement / j9;
                        int i2 = (int) (andIncrement % j9);
                        if (kVar.f7854c != j10) {
                            p6.k m2 = cVar.m(j10, kVar);
                            if (m2 == null) {
                                continue;
                                z7 = true;
                            } else {
                                kVar = m2;
                            }
                        }
                        Object B7 = cVar.B(kVar, i2, andIncrement, obj2);
                        if (B7 == p6.e.f7244m) {
                            w0 w0Var = obj2 instanceof w0 ? (w0) obj2 : null;
                            if (w0Var != null) {
                                w0Var.a(kVar, i2);
                            }
                            cVar.D(andIncrement);
                            kVar.h();
                        } else if (B7 == p6.e.f7246o) {
                            if (andIncrement < cVar.q()) {
                                kVar.a();
                            }
                            z7 = true;
                        } else {
                            if (B7 == p6.e.f7245n) {
                                throw new IllegalStateException("unexpected");
                            }
                            kVar.a();
                            hVar = B7;
                        }
                    }
                }
                hVar = iVar;
            }
            if (hVar instanceof p6.i) {
                hVar = null;
            }
            if (hVar != null) {
                d0 msg = (d0) hVar;
                Intrinsics.checkNotNullParameter(msg, "msg");
                C0781n c0781n = msg.f2069b;
                Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                c0781n.getClass();
                c0781n.J(new C0784q(cancellationException, false));
                Unit unit2 = Unit.f6114a;
                unit = Unit.f6114a;
            } else {
                unit = null;
            }
        } while (unit != null);
        return Unit.f6114a;
    }
}
