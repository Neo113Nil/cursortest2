package F;

import W0.AbstractC0081v;
import W0.C0066f;
import W0.C0079t;
import W0.InterfaceC0080u;
import a.AbstractC0086a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class g0 extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public M f360i;

    /* renamed from: j, reason: collision with root package name */
    public int f361j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0032n f362k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C0032n c0032n, G0.d dVar) {
        super(2, dVar);
        this.f362k = c0032n;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new g0(this.f362k, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((g0) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x016c, code lost:
    
        if (r2 == r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        if (r2 == Y0.d.f1032n) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014b, code lost:
    
        r3.a();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
    
        throw new java.lang.IllegalStateException(r18);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x018b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x017b -> B:6:0x017d). Please report as a decompilation issue!!! */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        C0032n c0032n;
        Object obj2;
        M m2;
        char c2;
        C0032n c0032n2;
        W0.P p2;
        Y0.b bVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object A2;
        O0.l lVar;
        Y0.j jVar;
        int i2 = this.f361j;
        boolean z2 = true;
        C0032n c0032n3 = this.f362k;
        Object obj3 = H0.a.f511e;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            if (((AtomicInteger) ((B0.E) c0032n3.f412d).f20f).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            p2 = (W0.P) ((InterfaceC0080u) c0032n3.f409a).c().m(C0079t.f974f);
            if (p2 == null) {
            }
            m2 = (M) c0032n3.f410b;
            bVar = (Y0.b) c0032n3.f411c;
            this.f360i = m2;
            this.f361j = z2 ? 1 : 0;
            bVar.getClass();
            atomicLongFieldUpdater = Y0.b.f1008f;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = Y0.b.f1009g;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y0.b.f1013k;
            Y0.j jVar2 = (Y0.j) atomicReferenceFieldUpdater.get(bVar);
            while (!bVar.r(atomicLongFieldUpdater.get(bVar), z2)) {
            }
            Throwable n2 = bVar.n();
            int i3 = b1.w.f1778a;
            throw n2;
        }
        if (i2 == 1) {
            m2 = this.f360i;
            AbstractC0086a.I(obj);
            obj2 = obj;
            c0032n = c0032n3;
            this.f360i = null;
            c2 = 2;
            this.f361j = 2;
            if (m2.i(obj2, this) != obj3) {
                c0032n2 = c0032n;
                if (((AtomicInteger) ((B0.E) c0032n2.f412d).f20f).decrementAndGet() != 0) {
                }
            }
            return obj3;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0086a.I(obj);
        c2 = 2;
        c0032n2 = c0032n3;
        if (((AtomicInteger) ((B0.E) c0032n2.f412d).f20f).decrementAndGet() != 0) {
            return D0.h.f206a;
        }
        c0032n3 = c0032n2;
        z2 = true;
        p2 = (W0.P) ((InterfaceC0080u) c0032n3.f409a).c().m(C0079t.f974f);
        if (p2 == null && !p2.a()) {
            throw ((W0.Z) p2).z();
        }
        m2 = (M) c0032n3.f410b;
        bVar = (Y0.b) c0032n3.f411c;
        this.f360i = m2;
        this.f361j = z2 ? 1 : 0;
        bVar.getClass();
        atomicLongFieldUpdater = Y0.b.f1008f;
        AtomicLongFieldUpdater atomicLongFieldUpdater22 = Y0.b.f1009g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Y0.b.f1013k;
        Y0.j jVar22 = (Y0.j) atomicReferenceFieldUpdater2.get(bVar);
        while (!bVar.r(atomicLongFieldUpdater.get(bVar), z2)) {
            long andIncrement = atomicLongFieldUpdater22.getAndIncrement(bVar);
            long j2 = Y0.d.f1020b;
            c0032n = c0032n3;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (jVar22.f1777g != j3) {
                Y0.j j4 = bVar.j(j3, jVar22);
                if (j4 == null) {
                    continue;
                    c0032n3 = c0032n;
                    z2 = true;
                } else {
                    jVar22 = j4;
                }
            }
            obj2 = bVar.A(jVar22, i4, andIncrement, null);
            Object obj4 = Y0.d.f1031m;
            String str = "unexpected";
            if (obj2 == obj4) {
                throw new IllegalStateException("unexpected");
            }
            Object obj5 = Y0.d.f1033o;
            if (obj2 == obj5) {
                if (andIncrement < bVar.p()) {
                    jVar22.a();
                }
                c0032n3 = c0032n;
                z2 = true;
            } else if (obj2 == Y0.d.f1032n) {
                C0066f c3 = AbstractC0081v.c(AbstractC0086a.v(this));
                try {
                    A2 = bVar.A(jVar22, i4, andIncrement, c3);
                } catch (Throwable th) {
                    c3.A();
                    throw th;
                }
                if (A2 != obj4) {
                    if (A2 == obj5) {
                        if (andIncrement < bVar.p()) {
                            jVar22.a();
                        }
                        Y0.j jVar3 = (Y0.j) atomicReferenceFieldUpdater2.get(bVar);
                        while (true) {
                            if (!bVar.r(atomicLongFieldUpdater.get(bVar), true)) {
                                long andIncrement2 = atomicLongFieldUpdater22.getAndIncrement(bVar);
                                long j5 = Y0.d.f1020b;
                                String str2 = str;
                                long j6 = andIncrement2 / j5;
                                int i5 = (int) (andIncrement2 % j5);
                                if (jVar3.f1777g == j6) {
                                    jVar = jVar3;
                                } else {
                                    Y0.j j7 = bVar.j(j6, jVar3);
                                    if (j7 == null) {
                                        str = str2;
                                    } else {
                                        jVar = j7;
                                    }
                                }
                                A2 = bVar.A(jVar, i5, andIncrement2, c3);
                                Y0.j jVar4 = jVar;
                                if (A2 == Y0.d.f1031m) {
                                    c3.a(jVar4, i5);
                                    break;
                                }
                                if (A2 != Y0.d.f1033o) {
                                    break;
                                }
                                if (andIncrement2 < bVar.p()) {
                                    jVar4.a();
                                }
                                str = str2;
                                jVar3 = jVar4;
                            } else {
                                c3.g(AbstractC0086a.l(bVar.n()));
                                break;
                            }
                        }
                        c3.A();
                        throw th;
                    }
                    jVar22.a();
                    lVar = null;
                    c3.B(A2, lVar);
                } else {
                    c3.a(jVar22, i4);
                }
                obj2 = c3.t();
            } else {
                jVar22.a();
            }
        }
        Throwable n22 = bVar.n();
        int i32 = b1.w.f1778a;
        throw n22;
    }
}
