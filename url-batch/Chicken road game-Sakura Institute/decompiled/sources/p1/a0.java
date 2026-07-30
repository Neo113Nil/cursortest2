package p1;

import r1.p1;
import r1.q1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7016b;

    public a0(b0 b0Var, Object obj) {
        this.f7015a = b0Var;
        this.f7016b = obj;
    }

    @Override // p1.t0
    public final void a() {
        b0 b0Var = this.f7015a;
        r1.d0 d0Var = b0Var.f7018f;
        b0Var.e();
        r1.d0 d0Var2 = (r1.d0) b0Var.f7027o.remove(this.f7016b);
        if (d0Var2 != null) {
            if (b0Var.f7032t <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            int k8 = ((i0.a) d0Var.p()).f4834f.k(d0Var2);
            int i7 = ((i0.a) d0Var.p()).f4834f.f4842h;
            int i8 = b0Var.f7032t;
            if (k8 < i7 - i8) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            b0Var.f7031s++;
            b0Var.f7032t = i8 - 1;
            int i9 = (((i0.a) d0Var.p()).f4834f.f4842h - b0Var.f7032t) - b0Var.f7031s;
            d0Var.f7729p = true;
            d0Var.I(k8, i9, 1);
            d0Var.f7729p = false;
            b0Var.d(i9);
        }
    }

    @Override // p1.t0
    public final int b() {
        r1.d0 d0Var = (r1.d0) this.f7015a.f7027o.get(this.f7016b);
        if (d0Var != null) {
            return ((i0.a) d0Var.n()).f4834f.f4842h;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l1.m] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p1.t0
    public final void c(l1.m mVar) {
        g0.t tVar;
        s0.n nVar;
        p1 p1Var;
        r1.d0 d0Var = (r1.d0) this.f7015a.f7027o.get(this.f7016b);
        if (d0Var == null || (tVar = d0Var.A) == null || (nVar = (s0.n) tVar.f3895f) == null) {
            return;
        }
        s0.n nVar2 = nVar.f8104f;
        if (!nVar2.f8116r) {
            a.a.M("visitSubtreeIf called on an unattached node");
            throw null;
        }
        i0.d dVar = new i0.d(new s0.n[16]);
        s0.n nVar3 = nVar2.f8109k;
        if (nVar3 == null) {
            r1.f.b(dVar, nVar2);
        } else {
            dVar.b(nVar3);
        }
        while (dVar.m()) {
            s0.n nVar4 = (s0.n) dVar.o(dVar.f4842h - 1);
            if ((nVar4.f8107i & 262144) != 0) {
                for (s0.n nVar5 = nVar4; nVar5 != null; nVar5 = nVar5.f8109k) {
                    if ((nVar5.f8106h & 262144) != 0) {
                        ?? r8 = 0;
                        r1.m mVar2 = nVar5;
                        while (mVar2 != 0) {
                            if (mVar2 instanceof q1) {
                                q1 q1Var = (q1) mVar2;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(q1Var.o());
                                p1 p1Var2 = p1.f7877g;
                                if (equals) {
                                    mVar.f(q1Var);
                                    p1Var = p1Var2;
                                } else {
                                    p1Var = p1.f7876f;
                                }
                                if (p1Var == p1.f7878h) {
                                    return;
                                }
                                if (p1Var == p1Var2) {
                                    break;
                                }
                            } else if ((mVar2.f8106h & 262144) != 0 && (mVar2 instanceof r1.m)) {
                                s0.n nVar6 = mVar2.f7853t;
                                int i7 = 0;
                                mVar2 = mVar2;
                                r8 = r8;
                                while (nVar6 != null) {
                                    if ((nVar6.f8106h & 262144) != 0) {
                                        i7++;
                                        r8 = r8;
                                        if (i7 == 1) {
                                            mVar2 = nVar6;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new i0.d(new s0.n[16]);
                                            }
                                            if (mVar2 != 0) {
                                                r8.b(mVar2);
                                                mVar2 = 0;
                                            }
                                            r8.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f8109k;
                                    mVar2 = mVar2;
                                    r8 = r8;
                                }
                                if (i7 == 1) {
                                }
                            }
                            mVar2 = r1.f.f(r8);
                        }
                    }
                }
            }
            r1.f.b(dVar, nVar4);
        }
    }

    @Override // p1.t0
    public final void d(long j8, int i7) {
        b0 b0Var = this.f7015a;
        r1.d0 d0Var = (r1.d0) b0Var.f7027o.get(this.f7016b);
        if (d0Var == null || !d0Var.E()) {
            return;
        }
        int i8 = ((i0.a) d0Var.n()).f4834f.f4842h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException("Index (" + i7 + ") is out of bound of [0, " + i8 + ')');
        }
        if (d0Var.F()) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed");
        }
        r1.d0 d0Var2 = b0Var.f7018f;
        d0Var2.f7729p = true;
        ((s1.r) r1.g0.a(d0Var)).r((r1.d0) ((i0.a) d0Var.n()).get(i7), j8);
        d0Var2.f7729p = false;
    }
}
