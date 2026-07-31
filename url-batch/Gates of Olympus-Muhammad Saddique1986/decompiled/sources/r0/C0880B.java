package r0;

import I.C0174t;
import n.z0;
import n0.C0714l;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.q0;
import t0.r0;
import u0.C1123s;

/* renamed from: r0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880B implements InterfaceC0899V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0881C f8098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8099b;

    public C0880B(C0881C c0881c, Object obj) {
        this.f8098a = c0881c;
        this.f8099b = obj;
    }

    @Override // r0.InterfaceC0899V
    public final void a() {
        C0881C c0881c = this.f8098a;
        c0881c.e();
        t0.E e3 = (t0.E) c0881c.f8109m.remove(this.f8099b);
        if (e3 != null) {
            if (c0881c.f8114r <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            t0.E e4 = c0881c.f8100d;
            int k3 = ((K.a) e4.p()).f3208d.k(e3);
            int i3 = ((K.a) e4.p()).f3208d.f3216f;
            int i4 = c0881c.f8114r;
            if (k3 < i3 - i4) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            c0881c.f8113q++;
            c0881c.f8114r = i4 - 1;
            int i5 = (((K.a) e4.p()).f3208d.f3216f - c0881c.f8114r) - c0881c.f8113q;
            e4.f8550n = true;
            e4.H(k3, i5, 1);
            e4.f8550n = false;
            c0881c.d(i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [n0.l] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [U.p] */
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
    @Override // r0.InterfaceC0899V
    public final void b(C0714l c0714l) {
        C0174t c0174t;
        U.p pVar;
        q0 q0Var;
        t0.E e3 = (t0.E) this.f8098a.f8109m.get(this.f8099b);
        if (e3 == null || (c0174t = e3.f8561y) == null || (pVar = (U.p) c0174t.f2915f) == null) {
            return;
        }
        U.p pVar2 = pVar.f4489d;
        if (!pVar2.f4501p) {
            z0.o("visitSubtreeIf called on an unattached node");
            throw null;
        }
        K.d dVar = new K.d(new U.p[16]);
        U.p pVar3 = pVar2.f4494i;
        if (pVar3 == null) {
            AbstractC0993f.b(dVar, pVar2);
        } else {
            dVar.b(pVar3);
        }
        while (dVar.m()) {
            U.p pVar4 = (U.p) dVar.o(dVar.f3216f - 1);
            if ((pVar4.f4492g & 262144) != 0) {
                for (U.p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f4494i) {
                    if ((pVar5.f4491f & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC1000m abstractC1000m = pVar5;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof r0) {
                                r0 r0Var = (r0) abstractC1000m;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(r0Var.w());
                                q0 q0Var2 = q0.f8780e;
                                if (equals) {
                                    c0714l.n(r0Var);
                                    q0Var = q0Var2;
                                } else {
                                    q0Var = q0.f8779d;
                                }
                                if (q0Var == q0.f8781f) {
                                    return;
                                }
                                if (q0Var == q0Var2) {
                                    break;
                                }
                            } else if ((abstractC1000m.f4491f & 262144) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                U.p pVar6 = abstractC1000m.f8771r;
                                int i3 = 0;
                                abstractC1000m = abstractC1000m;
                                r8 = r8;
                                while (pVar6 != null) {
                                    if ((pVar6.f4491f & 262144) != 0) {
                                        i3++;
                                        r8 = r8;
                                        if (i3 == 1) {
                                            abstractC1000m = pVar6;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new K.d(new U.p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r8.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r8.b(pVar6);
                                        }
                                    }
                                    pVar6 = pVar6.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r8 = r8;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1000m = AbstractC0993f.f(r8);
                        }
                    }
                }
            }
            AbstractC0993f.b(dVar, pVar4);
        }
    }

    @Override // r0.InterfaceC0899V
    public final void c(long j3, int i3) {
        C0881C c0881c = this.f8098a;
        t0.E e3 = (t0.E) c0881c.f8109m.get(this.f8099b);
        if (e3 == null || !e3.D()) {
            return;
        }
        int i4 = ((K.a) e3.n()).f3208d.f3216f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("Index (" + i3 + ") is out of bound of [0, " + i4 + ')');
        }
        if (e3.E()) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed");
        }
        t0.E e4 = c0881c.f8100d;
        e4.f8550n = true;
        ((C1123s) t0.H.a(e3)).t((t0.E) ((K.a) e3.n()).get(i3), j3);
        e4.f8550n = false;
    }

    @Override // r0.InterfaceC0899V
    public final int d() {
        t0.E e3 = (t0.E) this.f8098a.f8109m.get(this.f8099b);
        if (e3 != null) {
            return ((K.a) e3.n()).f3208d.f3216f;
        }
        return 0;
    }
}
