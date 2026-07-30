package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z30 implements oj1 {
    public final /* synthetic */ sc1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ cu1 d;
    public final /* synthetic */ ca0 e;
    public final /* synthetic */ int f;

    public z30(sc1 sc1Var, Function1 function1, nv2 nv2Var, cu1 cu1Var, ca0 ca0Var, int i) {
        this.a = sc1Var;
        this.b = function1;
        this.c = nv2Var;
        this.d = cu1Var;
        this.e = ca0Var;
        this.f = i;
    }

    @Override // defpackage.oj1
    public final int b(h41 h41Var, List list, int i) {
        sc1 sc1Var = this.a;
        sc1Var.a.a(h41Var.getLayoutDirection());
        fy fyVar = sc1Var.a.j;
        if (fyVar != null) {
            return ti2.c(fyVar.c());
        }
        lh.g("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e5  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [t81] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // defpackage.oj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pj1 f(qj1 qj1Var, List list, long j) {
        long j2;
        bw2 bw2Var;
        u81 u81Var;
        pj1 pj1Var;
        bw2 bw2Var2;
        int i;
        z30 z30Var;
        sc1 sc1Var = this.a;
        nm2 d = ci2.d();
        Function1 e = d != null ? d.e() : null;
        nm2 f = ci2.f(d);
        try {
            cw2 d2 = sc1Var.d();
            bw2 bw2Var3 = d2 != null ? d2.a : null;
            zt2 zt2Var = sc1Var.a;
            u81 layoutDirection = qj1Var.getLayoutDirection();
            int i2 = zt2Var.f;
            boolean z = zt2Var.e;
            int i3 = zt2Var.c;
            if (bw2Var3 != null) {
                sm1 sm1Var = bw2Var3.b;
                aw2 aw2Var = bw2Var3.a;
                yd ydVar = zt2Var.a;
                pw2 pw2Var = zt2Var.b;
                List list2 = zt2Var.i;
                pj1Var = null;
                ca0 ca0Var = zt2Var.g;
                hp0 hp0Var = zt2Var.h;
                bw2 bw2Var4 = bw2Var3;
                if (sm1Var.a.b()) {
                    j2 = j;
                    u81Var = layoutDirection;
                } else {
                    yd ydVar2 = aw2Var.a;
                    long j3 = aw2Var.j;
                    if (Intrinsics.b(ydVar2, ydVar) && aw2Var.b.c(pw2Var) && Intrinsics.b(aw2Var.c, list2) && aw2Var.d == i3 && aw2Var.e == z && aw2Var.f == i2 && Intrinsics.b(aw2Var.g, ca0Var)) {
                        u81Var = layoutDirection;
                        if (aw2Var.h == u81Var && Intrinsics.b(aw2Var.i, hp0Var) && u10.j(j) == u10.j(j3) && ((!z && i2 != 2) || (u10.h(j) == u10.h(j3) && u10.g(j) == u10.g(j3)))) {
                            bw2Var = bw2Var4;
                            bw2Var2 = new bw2(new aw2(aw2Var.a, zt2Var.b, aw2Var.c, aw2Var.d, aw2Var.e, aw2Var.f, aw2Var.g, aw2Var.h, aw2Var.i, j), sm1Var, v10.d(j, zm3.d(ti2.c(sm1Var.d), ti2.c(sm1Var.e))));
                            long j4 = bw2Var2.c;
                            Integer valueOf = Integer.valueOf((int) (j4 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (Intrinsics.b(bw2Var, bw2Var2)) {
                                sc1Var.i.setValue(new cw2(bw2Var2, d2 != null ? d2.c : pj1Var));
                                i = 0;
                                sc1Var.p = false;
                                z30Var = this;
                                z30Var.b.invoke(bw2Var2);
                                s93.J(sc1Var, z30Var.c, z30Var.d);
                            } else {
                                i = 0;
                                z30Var = this;
                            }
                            sc1Var.g.setValue(new pc0(z30Var.e.p0(z30Var.f != 1 ? ti2.c(bw2Var2.b.b(i)) : i)));
                            return qj1Var.G(intValue, intValue2, mi1.f(new Pair(i6.a, Integer.valueOf(Math.round(bw2Var2.d))), new Pair(i6.b, Integer.valueOf(Math.round(bw2Var2.e)))), o3.I);
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                        bw2Var = bw2Var4;
                        u81Var = layoutDirection;
                    }
                }
                bw2Var = bw2Var4;
            } else {
                j2 = j;
                bw2Var = bw2Var3;
                u81Var = layoutDirection;
                pj1Var = null;
            }
            zt2Var.a(u81Var);
            int j5 = u10.j(j2);
            int h = ((z || i2 == 2) && u10.d(j2)) ? u10.h(j2) : Integer.MAX_VALUE;
            int i4 = (z || i2 != 2) ? i3 : 1;
            if (j5 != h) {
                fy fyVar = zt2Var.j;
                if (fyVar == null) {
                    lh.g("layoutIntrinsics must be called first");
                    return pj1Var;
                }
                h = d.c(ti2.c(fyVar.c()), j5, h);
            }
            fy fyVar2 = zt2Var.j;
            if (fyVar2 == null) {
                lh.g("layoutIntrinsics must be called first");
                return pj1Var;
            }
            sm1 sm1Var2 = new sm1(fyVar2, zm3.w(0, h, 0, u10.g(j2)), i4, i2 == 2);
            bw2Var2 = new bw2(new aw2(zt2Var.a, zt2Var.b, zt2Var.i, zt2Var.c, zt2Var.e, zt2Var.f, zt2Var.g, u81Var, zt2Var.h, j2), sm1Var2, v10.d(j2, zm3.d(ti2.c(sm1Var2.d), ti2.c(sm1Var2.e))));
            long j42 = bw2Var2.c;
            Integer valueOf3 = Integer.valueOf((int) (j42 >> 32));
            Integer valueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
            int intValue3 = valueOf3.intValue();
            int intValue22 = valueOf22.intValue();
            if (Intrinsics.b(bw2Var, bw2Var2)) {
            }
            sc1Var.g.setValue(new pc0(z30Var.e.p0(z30Var.f != 1 ? ti2.c(bw2Var2.b.b(i)) : i)));
            return qj1Var.G(intValue3, intValue22, mi1.f(new Pair(i6.a, Integer.valueOf(Math.round(bw2Var2.d))), new Pair(i6.b, Integer.valueOf(Math.round(bw2Var2.e)))), o3.I);
        } finally {
            ci2.j(d, f, e);
        }
    }
}
