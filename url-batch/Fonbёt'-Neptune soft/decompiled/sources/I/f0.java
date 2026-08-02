package I;

import Y0.C0125t;
import Y0.InterfaceC0126u;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f0 extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public M f638i;

    /* renamed from: j, reason: collision with root package name */
    public int f639j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0079n f640k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(C0079n c0079n, H0.d dVar) {
        super(2, dVar);
        this.f640k = c0079n;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new f0(this.f640k, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((f0) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018c, code lost:
    
        r6.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0190, code lost:
    
        r20 = r2;
        r5.a();
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r6 != a1.d.f1316n) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r6 = Y0.AbstractC0127v.c(i1.a.t(r21));
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        r8 = r7.A(r5, r10, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r8 != r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        r6.a(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0187, code lost:
    
        r2 = r6.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0196, code lost:
    
        if (r2 != r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0198, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0199, code lost:
    
        r3 = r20;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        r2 = r7.f1301f;
        r13 = r6.f1205i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        if (r8 != r12) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
    
        if (r16 >= r7.p()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fa, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
    
        r4 = (a1.j) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        if (r7.r(r15.get(r7), true) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        r16 = r13.getAndIncrement(r7);
        r8 = a1.d.f1304b;
        r10 = r16 / r8;
        r5 = (int) (r16 % r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        if (r4.f2107g == r10) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r8 = r7.k(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
    
        if (r8 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        r14 = r13;
        r8 = r7.A(r4, r5, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r8 != a1.d.f1315m) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        if (r8 != a1.d.f1317o) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
    
        if (r16 >= r7.p()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015f, code lost:
    
        if (r8 == a1.d.f1316n) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0161, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0164, code lost:
    
        if (r2 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        r3 = new d1.q(r2, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016d, code lost:
    
        r6.o(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0148, code lost:
    
        r6.a(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0112, code lost:
    
        r6.j(i1.a.b(r7.n()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0179, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017d, code lost:
    
        if (r2 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017f, code lost:
    
        r3 = new d1.q(r2, r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0185, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01b8  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01a8 -> B:6:0x01aa). Please report as a decompilation issue!!! */
    @Override // J0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0079n c0079n;
        C0079n c0079n2;
        Y0.P p2;
        a1.b bVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        a1.j jVar;
        I0.a aVar = I0.a.f733e;
        int i2 = this.f639j;
        ?? r4 = 1;
        C0079n c0079n3 = this.f640k;
        if (i2 == 0) {
            i1.a.G(obj);
            if (((AtomicInteger) ((B.m) c0079n3.f692h).f78f).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            p2 = (Y0.P) ((InterfaceC0126u) c0079n3.f689e).h().k(C0125t.f1230f);
            if (p2 == null) {
            }
            M m2 = (M) c0079n3.f690f;
            this.f638i = m2;
            this.f639j = r4;
            bVar = (a1.b) c0079n3.f691g;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1.b.f1296l;
            a1.j jVar2 = (a1.j) atomicReferenceFieldUpdater.get(bVar);
            while (true) {
                atomicLongFieldUpdater = a1.b.f1291g;
                if (!bVar.r(atomicLongFieldUpdater.get(bVar), r4)) {
                }
                c0079n3 = c0079n;
            }
        } else if (i2 == 1) {
            M m3 = this.f638i;
            i1.a.G(obj);
            M m4 = m3;
            c0079n = c0079n3;
            M m5 = null;
            Object obj2 = obj;
            this.f638i = m5;
            this.f639j = 2;
            if (m4.h(obj2, this) == aVar) {
                return aVar;
            }
            c0079n2 = c0079n;
            if (((AtomicInteger) ((B.m) c0079n2.f692h).f78f).decrementAndGet() != 0) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
            c0079n2 = c0079n3;
            if (((AtomicInteger) ((B.m) c0079n2.f692h).f78f).decrementAndGet() != 0) {
                return F0.h.f469a;
            }
            c0079n3 = c0079n2;
            r4 = 1;
            p2 = (Y0.P) ((InterfaceC0126u) c0079n3.f689e).h().k(C0125t.f1230f);
            if (p2 == null && !p2.b()) {
                throw ((Y0.Z) p2).A();
            }
            M m22 = (M) c0079n3.f690f;
            this.f638i = m22;
            this.f639j = r4;
            bVar = (a1.b) c0079n3.f691g;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a1.b.f1296l;
            a1.j jVar22 = (a1.j) atomicReferenceFieldUpdater2.get(bVar);
            while (true) {
                atomicLongFieldUpdater = a1.b.f1291g;
                if (!bVar.r(atomicLongFieldUpdater.get(bVar), r4)) {
                    Throwable n2 = bVar.n();
                    int i3 = d1.w.f2108a;
                    throw n2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = a1.b.f1292h;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar);
                long j2 = a1.d.f1304b;
                long j3 = andIncrement / j2;
                int i4 = (int) (andIncrement % j2);
                c0079n = c0079n3;
                if (jVar22.f2107g == j3) {
                    jVar = jVar22;
                } else {
                    jVar = bVar.k(j3, jVar22);
                    if (jVar == null) {
                        continue;
                        c0079n3 = c0079n;
                    }
                }
                Object A2 = bVar.A(jVar, i4, andIncrement, null);
                B.m mVar = a1.d.f1315m;
                if (A2 == mVar) {
                    throw new IllegalStateException("unexpected");
                }
                B.m mVar2 = a1.d.f1317o;
                if (A2 != mVar2) {
                    break;
                }
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
                jVar22 = jVar;
                c0079n3 = c0079n;
            }
        }
    }
}
