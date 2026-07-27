package p0;

import G.C0223t;
import l0.C0814l;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.p0;
import r0.q0;
import s0.C1166s;

/* renamed from: p0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940A implements InterfaceC0961W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0941B f8976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8977b;

    public C0940A(C0941B c0941b, Object obj) {
        this.f8976a = c0941b;
        this.f8977b = obj;
    }

    @Override // p0.InterfaceC0961W
    public final void a() {
        C0941B c0941b = this.f8976a;
        c0941b.e();
        r0.E e4 = (r0.E) c0941b.f8987p.remove(this.f8977b);
        if (e4 != null) {
            if (c0941b.f8992u <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            r0.E e5 = c0941b.f8978d;
            int j4 = ((I.a) e5.p()).f3324d.j(e4);
            int i2 = ((I.a) e5.p()).f3324d.f3332i;
            int i4 = c0941b.f8992u;
            if (j4 < i2 - i4) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            c0941b.f8991t++;
            c0941b.f8992u = i4 - 1;
            int i5 = (((I.a) e5.p()).f3324d.f3332i - c0941b.f8992u) - c0941b.f8991t;
            e5.f9604q = true;
            e5.H(j4, i5, 1);
            e5.f9604q = false;
            c0941b.d(i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l0.l] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [S.n] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p0.InterfaceC0961W
    public final void b(C0814l c0814l) {
        C0223t c0223t;
        S.n nVar;
        p0 p0Var;
        r0.E e4 = (r0.E) this.f8976a.f8987p.get(this.f8977b);
        if (e4 == null || (c0223t = e4.B) == null || (nVar = (S.n) c0223t.f2912f) == null) {
            return;
        }
        S.n nVar2 = nVar.f3978d;
        if (!nVar2.f3990s) {
            AbstractC0864b.D("visitSubtreeIf called on an unattached node");
            throw null;
        }
        I.d dVar = new I.d(new S.n[16]);
        S.n nVar3 = nVar2.f3983l;
        if (nVar3 == null) {
            AbstractC1065f.b(dVar, nVar2);
        } else {
            dVar.b(nVar3);
        }
        while (dVar.l()) {
            S.n nVar4 = (S.n) dVar.n(dVar.f3332i - 1);
            if ((nVar4.f3981j & 262144) != 0) {
                for (S.n nVar5 = nVar4; nVar5 != null; nVar5 = nVar5.f3983l) {
                    if ((nVar5.f3980i & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC1073n abstractC1073n = nVar5;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof q0) {
                                q0 q0Var = (q0) abstractC1073n;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(q0Var.u());
                                p0 p0Var2 = p0.f9829e;
                                if (equals) {
                                    c0814l.invoke(q0Var);
                                    p0Var = p0Var2;
                                } else {
                                    p0Var = p0.f9828d;
                                }
                                if (p0Var == p0.f9830i) {
                                    return;
                                }
                                if (p0Var == p0Var2) {
                                    break;
                                }
                            } else if ((abstractC1073n.f3980i & 262144) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                S.n nVar6 = abstractC1073n.f9826u;
                                int i2 = 0;
                                abstractC1073n = abstractC1073n;
                                r8 = r8;
                                while (nVar6 != null) {
                                    if ((nVar6.f3980i & 262144) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            abstractC1073n = nVar6;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new I.d(new S.n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r8.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r8.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1073n = AbstractC1065f.f(r8);
                        }
                    }
                }
            }
            AbstractC1065f.b(dVar, nVar4);
        }
    }

    @Override // p0.InterfaceC0961W
    public final void c(long j4, int i2) {
        C0941B c0941b = this.f8976a;
        r0.E e4 = (r0.E) c0941b.f8987p.get(this.f8977b);
        if (e4 == null || !e4.D()) {
            return;
        }
        int i4 = ((I.a) e4.n()).f3324d.f3332i;
        if (i2 < 0 || i2 >= i4) {
            throw new IndexOutOfBoundsException("Index (" + i2 + ") is out of bound of [0, " + i4 + ')');
        }
        if (e4.E()) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed");
        }
        r0.E e5 = c0941b.f8978d;
        e5.f9604q = true;
        ((C1166s) r0.H.a(e4)).s((r0.E) ((I.a) e4.n()).get(i2), j4);
        e5.f9604q = false;
    }

    @Override // p0.InterfaceC0961W
    public final int d() {
        r0.E e4 = (r0.E) this.f8976a.f8987p.get(this.f8977b);
        if (e4 != null) {
            return ((I.a) e4.n()).f3324d.f3332i;
        }
        return 0;
    }
}
