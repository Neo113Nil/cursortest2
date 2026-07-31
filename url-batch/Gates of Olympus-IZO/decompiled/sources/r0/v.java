package r0;

import I.C0120t;
import e2.AbstractC0381e;
import q1.C0773B;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.p0;
import t0.q0;
import u0.C0997t;

/* loaded from: classes.dex */
public final class v implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f7176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7177b;

    public v(w wVar, Object obj) {
        this.f7176a = wVar;
        this.f7177b = obj;
    }

    @Override // r0.N
    public final void a() {
        w wVar = this.f7176a;
        wVar.e();
        t0.D d3 = (t0.D) wVar.f7187m.remove(this.f7177b);
        if (d3 != null) {
            if (wVar.f7191r <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            t0.D d4 = wVar.f7178d;
            int k3 = ((K.a) d4.o()).f2634d.k(d3);
            int i3 = ((K.a) d4.o()).f2634d.f2642f;
            int i4 = wVar.f7191r;
            if (k3 < i3 - i4) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            wVar.f7190q++;
            wVar.f7191r = i4 - 1;
            int i5 = (((K.a) d4.o()).f2634d.f2642f - wVar.f7191r) - wVar.f7190q;
            d4.f7726n = true;
            d4.F(k3, i5, 1);
            d4.f7726n = false;
            wVar.d(i5);
        }
    }

    @Override // r0.N
    public final int b() {
        t0.D d3 = (t0.D) this.f7176a.f7187m.get(this.f7177b);
        if (d3 != null) {
            return ((K.a) d3.m()).f2634d.f2642f;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [q1.B] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [U.k] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // r0.N
    public final void c(C0773B c0773b) {
        C0120t c0120t;
        U.k kVar;
        p0 p0Var;
        t0.D d3 = (t0.D) this.f7176a.f7187m.get(this.f7177b);
        if (d3 == null || (c0120t = d3.f7735x) == null || (kVar = (U.k) c0120t.f2356f) == null) {
            return;
        }
        U.k kVar2 = kVar.f3303d;
        if (!kVar2.p) {
            AbstractC0381e.N("visitSubtreeIf called on an unattached node");
            throw null;
        }
        K.d dVar = new K.d(new U.k[16]);
        U.k kVar3 = kVar2.f3308i;
        if (kVar3 == null) {
            AbstractC0898f.b(dVar, kVar2);
        } else {
            dVar.b(kVar3);
        }
        while (dVar.m()) {
            U.k kVar4 = (U.k) dVar.o(dVar.f2642f - 1);
            if ((kVar4.f3306g & 262144) != 0) {
                for (U.k kVar5 = kVar4; kVar5 != null; kVar5 = kVar5.f3308i) {
                    if ((kVar5.f3305f & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC0905m abstractC0905m = kVar5;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof q0) {
                                q0 q0Var = (q0) abstractC0905m;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(q0Var.v());
                                p0 p0Var2 = p0.f7943e;
                                if (equals) {
                                    c0773b.j(q0Var);
                                    p0Var = p0Var2;
                                } else {
                                    p0Var = p0.f7942d;
                                }
                                if (p0Var == p0.f7944f) {
                                    return;
                                }
                                if (p0Var == p0Var2) {
                                    break;
                                }
                            } else if ((abstractC0905m.f3305f & 262144) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                U.k kVar6 = abstractC0905m.f7937r;
                                int i3 = 0;
                                abstractC0905m = abstractC0905m;
                                r8 = r8;
                                while (kVar6 != null) {
                                    if ((kVar6.f3305f & 262144) != 0) {
                                        i3++;
                                        r8 = r8;
                                        if (i3 == 1) {
                                            abstractC0905m = kVar6;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new K.d(new U.k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r8.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r8.b(kVar6);
                                        }
                                    }
                                    kVar6 = kVar6.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r8 = r8;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0905m = AbstractC0898f.f(r8);
                        }
                    }
                }
            }
            AbstractC0898f.b(dVar, kVar4);
        }
    }

    @Override // r0.N
    public final void d(long j3, int i3) {
        w wVar = this.f7176a;
        t0.D d3 = (t0.D) wVar.f7187m.get(this.f7177b);
        if (d3 == null || !d3.B()) {
            return;
        }
        int i4 = ((K.a) d3.m()).f2634d.f2642f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("Index (" + i3 + ") is out of bound of [0, " + i4 + ')');
        }
        if (d3.C()) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed");
        }
        t0.D d4 = wVar.f7178d;
        d4.f7726n = true;
        ((C0997t) t0.G.a(d3)).t((t0.D) ((K.a) d3.m()).get(i3), j3);
        d4.f7726n = false;
    }
}
