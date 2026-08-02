package K;

import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o3.InterfaceC1339l;
import x3.AbstractC1562w;
import x3.C1546f;
import x3.C1559t;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class c0 extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public J f1335a;

    /* renamed from: b, reason: collision with root package name */
    public int f1336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G1.c f1337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(G1.c cVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1337c = cVar;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new c0(this.f1337c, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x016c, code lost:
    
        if (r3 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0147, code lost:
    
        if (r3 == z3.e.n) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0149, code lost:
    
        r4.a();
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        throw new java.lang.IllegalStateException(r18);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x018b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x017b -> B:6:0x017d). Please report as a decompilation issue!!! */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        G1.c cVar;
        Object obj2;
        J j4;
        char c4;
        G1.c cVar2;
        x3.T t4;
        z3.c cVar3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object A4;
        InterfaceC1339l interfaceC1339l;
        z3.k kVar;
        Object obj3 = EnumC0441a.f9038a;
        int i4 = this.f1336b;
        boolean z = true;
        G1.c cVar4 = this.f1337c;
        if (i4 == 0) {
            O3.l.w(obj);
            if (((AtomicInteger) ((t1.h) cVar4.f838e).f15398b).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            t4 = (x3.T) ((InterfaceC1560u) cVar4.f835b).g().n(C1559t.f16059b);
            if (t4 == null) {
            }
            j4 = (J) cVar4.f836c;
            cVar3 = (z3.c) cVar4.f837d;
            this.f1335a = j4;
            this.f1336b = z ? 1 : 0;
            cVar3.getClass();
            atomicLongFieldUpdater = z3.c.f16297b;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = z3.c.f16298c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z3.c.f16302g;
            z3.k kVar2 = (z3.k) atomicReferenceFieldUpdater.get(cVar3);
            while (!cVar3.r(atomicLongFieldUpdater.get(cVar3), z)) {
            }
            Throwable n = cVar3.n();
            int i5 = C3.u.f319a;
            throw n;
        }
        if (i4 == 1) {
            j4 = this.f1335a;
            O3.l.w(obj);
            obj2 = obj;
            cVar = cVar4;
            this.f1335a = null;
            c4 = 2;
            this.f1336b = 2;
            if (j4.invoke(obj2, this) != obj3) {
                cVar2 = cVar;
                if (((AtomicInteger) ((t1.h) cVar2.f838e).f15398b).decrementAndGet() != 0) {
                }
            }
            return obj3;
        }
        if (i4 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        O3.l.w(obj);
        c4 = 2;
        cVar2 = cVar4;
        if (((AtomicInteger) ((t1.h) cVar2.f838e).f15398b).decrementAndGet() != 0) {
            return C0297i.f5732a;
        }
        cVar4 = cVar2;
        z = true;
        t4 = (x3.T) ((InterfaceC1560u) cVar4.f835b).g().n(C1559t.f16059b);
        if (t4 == null && !t4.a()) {
            throw ((x3.d0) t4).w();
        }
        j4 = (J) cVar4.f836c;
        cVar3 = (z3.c) cVar4.f837d;
        this.f1335a = j4;
        this.f1336b = z ? 1 : 0;
        cVar3.getClass();
        atomicLongFieldUpdater = z3.c.f16297b;
        AtomicLongFieldUpdater atomicLongFieldUpdater22 = z3.c.f16298c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = z3.c.f16302g;
        z3.k kVar22 = (z3.k) atomicReferenceFieldUpdater2.get(cVar3);
        while (!cVar3.r(atomicLongFieldUpdater.get(cVar3), z)) {
            long andIncrement = atomicLongFieldUpdater22.getAndIncrement(cVar3);
            long j5 = z3.e.f16309b;
            cVar = cVar4;
            long j6 = andIncrement / j5;
            int i6 = (int) (andIncrement % j5);
            if (kVar22.f318c != j6) {
                z3.k l4 = cVar3.l(j6, kVar22);
                if (l4 == null) {
                    continue;
                    cVar4 = cVar;
                    z = true;
                } else {
                    kVar22 = l4;
                }
            }
            obj2 = cVar3.A(kVar22, i6, andIncrement, null);
            Object obj4 = z3.e.f16320m;
            String str = "unexpected";
            if (obj2 == obj4) {
                throw new IllegalStateException("unexpected");
            }
            Object obj5 = z3.e.o;
            if (obj2 == obj5) {
                if (andIncrement < cVar3.p()) {
                    kVar22.a();
                }
                cVar4 = cVar;
                z = true;
            } else if (obj2 == z3.e.n) {
                C1546f d4 = AbstractC1562w.d(AbstractC0347t0.m(this));
                try {
                    A4 = cVar3.A(kVar22, i6, andIncrement, d4);
                } catch (Throwable th) {
                    d4.x();
                    throw th;
                }
                if (A4 != obj4) {
                    if (A4 == obj5) {
                        if (andIncrement < cVar3.p()) {
                            kVar22.a();
                        }
                        z3.k kVar3 = (z3.k) atomicReferenceFieldUpdater2.get(cVar3);
                        while (true) {
                            if (!cVar3.r(atomicLongFieldUpdater.get(cVar3), true)) {
                                long andIncrement2 = atomicLongFieldUpdater22.getAndIncrement(cVar3);
                                long j7 = z3.e.f16309b;
                                String str2 = str;
                                long j8 = andIncrement2 / j7;
                                int i7 = (int) (andIncrement2 % j7);
                                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                if (kVar3.f318c == j8) {
                                    kVar = kVar3;
                                } else {
                                    z3.k l5 = cVar3.l(j8, kVar3);
                                    if (l5 == null) {
                                        str = str2;
                                        atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                    } else {
                                        kVar = l5;
                                    }
                                }
                                A4 = cVar3.A(kVar, i7, andIncrement2, d4);
                                z3.k kVar4 = kVar;
                                if (A4 == z3.e.f16320m) {
                                    d4.a(kVar4, i7);
                                    break;
                                }
                                if (A4 != z3.e.o) {
                                    break;
                                }
                                if (andIncrement2 < cVar3.p()) {
                                    kVar4.a();
                                }
                                str = str2;
                                kVar3 = kVar4;
                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                            } else {
                                d4.resumeWith(O3.l.h(cVar3.n()));
                                break;
                            }
                        }
                        d4.x();
                        throw th;
                    }
                    kVar22.a();
                    interfaceC1339l = null;
                    d4.y(A4, interfaceC1339l);
                } else {
                    d4.a(kVar22, i6);
                }
                obj2 = d4.q();
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
            } else {
                kVar22.a();
            }
        }
        Throwable n4 = cVar3.n();
        int i52 = C3.u.f319a;
        throw n4;
    }
}
