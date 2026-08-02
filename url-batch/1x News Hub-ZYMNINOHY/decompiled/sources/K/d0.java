package K;

import b0.C0178i;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t2.C1209t;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class d0 extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public K f752e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B0.p f753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(B0.p pVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f753g = pVar;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new d0(this.f753g, interfaceC0300c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r3 != v2.e.f10600n) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        r13 = t2.AbstractC1212w.d(C2.b.x(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        r3 = r8.A(r9, r10, r11, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        if (r3 != r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r13.a(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015e, code lost:
    
        r3 = r13.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016a, code lost:
    
        if (r3 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if (r3 != r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        if (r11 >= r8.p()) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        r3 = (v2.k) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        if (r8.r(r14.get(r8), true) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        r11 = r15.getAndIncrement(r8);
        r6 = v2.e.f10589b;
        r9 = r11 / r6;
        r6 = (int) (r11 % r6);
        r18 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (r3.f10866c == r9) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        r4 = r8.l(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        if (r4 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        r3 = r8.A(r9, r6, r11, r13);
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012c, code lost:
    
        if (r3 != v2.e.f10599m) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        if (r3 != v2.e.o) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
    
        if (r11 >= r8.p()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0141, code lost:
    
        r5 = r18;
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0147, code lost:
    
        if (r3 == v2.e.f10600n) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0149, code lost:
    
        r4.a();
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014d, code lost:
    
        r13.A(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        throw new java.lang.IllegalStateException(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012e, code lost:
    
        r13.a(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x011d, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0123, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f6, code lost:
    
        r13.f(android.support.v4.media.session.a.k(r8.n()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0159, code lost:
    
        r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015c, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0163, code lost:
    
        r13.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0166, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0167, code lost:
    
        r9.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0189  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0179 -> B:6:0x017b). Please report as a decompilation issue!!! */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        B0.p pVar;
        Object obj2;
        K k3;
        B0.p pVar2;
        t2.U u3;
        v2.c cVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object obj3 = EnumC0317a.f4969a;
        int i3 = this.f;
        boolean z = true;
        B0.p pVar3 = this.f753g;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            if (((AtomicInteger) ((C0178i) pVar3.f165d).f2532b).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            u3 = (t2.U) ((InterfaceC1210u) pVar3.f162a).e().h(C1209t.f10441b);
            if (u3 == null) {
            }
            k3 = (K) pVar3.f163b;
            cVar = (v2.c) pVar3.f164c;
            this.f752e = k3;
            this.f = z ? 1 : 0;
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v2.c.f10582g;
            v2.k kVar = (v2.k) atomicReferenceFieldUpdater.get(cVar);
            while (true) {
                atomicLongFieldUpdater = v2.c.f10578b;
                if (!cVar.r(atomicLongFieldUpdater.get(cVar), z)) {
                }
                pVar3 = pVar;
                z = true;
            }
        } else {
            if (i3 == 1) {
                k3 = this.f752e;
                android.support.v4.media.session.a.T(obj);
                obj2 = obj;
                pVar = pVar3;
                this.f752e = null;
                this.f = 2;
                if (k3.invoke(obj2, this) != obj3) {
                    pVar2 = pVar;
                    if (((AtomicInteger) ((C0178i) pVar2.f165d).f2532b).decrementAndGet() != 0) {
                    }
                }
                return obj3;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            pVar2 = pVar3;
            if (((AtomicInteger) ((C0178i) pVar2.f165d).f2532b).decrementAndGet() != 0) {
                return C0195i.f2555a;
            }
            pVar3 = pVar2;
            z = true;
            u3 = (t2.U) ((InterfaceC1210u) pVar3.f162a).e().h(C1209t.f10441b);
            if (u3 == null && !u3.a()) {
                throw ((t2.e0) u3).z();
            }
            k3 = (K) pVar3.f163b;
            cVar = (v2.c) pVar3.f164c;
            this.f752e = k3;
            this.f = z ? 1 : 0;
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v2.c.f10582g;
            v2.k kVar2 = (v2.k) atomicReferenceFieldUpdater2.get(cVar);
            while (true) {
                atomicLongFieldUpdater = v2.c.f10578b;
                if (!cVar.r(atomicLongFieldUpdater.get(cVar), z)) {
                    Throwable n3 = cVar.n();
                    int i4 = y2.u.f10867a;
                    throw n3;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = v2.c.f10579c;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
                pVar = pVar3;
                long j3 = v2.e.f10589b;
                long j4 = andIncrement / j3;
                int i5 = (int) (andIncrement % j3);
                if (kVar2.f10866c != j4) {
                    v2.k l3 = cVar.l(j4, kVar2);
                    if (l3 == null) {
                        continue;
                        pVar3 = pVar;
                        z = true;
                    } else {
                        kVar2 = l3;
                    }
                }
                obj2 = cVar.A(kVar2, i5, andIncrement, null);
                Object obj4 = v2.e.f10599m;
                String str = "unexpected";
                if (obj2 == obj4) {
                    throw new IllegalStateException("unexpected");
                }
                Object obj5 = v2.e.o;
                if (obj2 != obj5) {
                    break;
                }
                if (andIncrement < cVar.p()) {
                    kVar2.a();
                }
                pVar3 = pVar;
                z = true;
            }
        }
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
