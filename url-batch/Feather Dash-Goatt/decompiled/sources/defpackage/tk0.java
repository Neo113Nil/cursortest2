package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tk0 extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ uk0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk0(uk0 uk0Var, int i) {
        super(0);
        this.d = i;
        this.e = uk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yw0 placementScope;
        int i = this.d;
        uk0 uk0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                nd0 nd0Var = uk0Var.j;
                nd0Var.i = 0;
                eo0 x = nd0Var.a.x();
                Object[] objArr = x.d;
                int i2 = x.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    uk0 uk0Var2 = ((jd0) objArr[i3]).K.p;
                    uk0Var2.l = uk0Var2.m;
                    uk0Var2.m = Integer.MAX_VALUE;
                    uk0Var2.w = false;
                    if (uk0Var2.p == hd0.e) {
                        uk0Var2.p = hd0.g;
                    }
                }
                jd0 jd0Var = nd0Var.a;
                jd0 jd0Var2 = nd0Var.a;
                eo0 x2 = jd0Var.x();
                Object[] objArr2 = x2.d;
                int i4 = x2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((jd0) objArr2[i5]).K.p.A.getClass();
                }
                if (uk0Var.y().o) {
                    bo0 bo0Var = (bo0) jd0Var2.m();
                    int i6 = bo0Var.d.g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((qp0) ((jd0) bo0Var.get(i7)).J.e).o = true;
                    }
                }
                uk0Var.y().r0().b();
                if (uk0Var.y().o) {
                    bo0 bo0Var2 = (bo0) jd0Var2.m();
                    int i8 = bo0Var2.d.g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((qp0) ((jd0) bo0Var2.get(i9)).J.e).o = false;
                    }
                }
                eo0 x3 = jd0Var2.x();
                Object[] objArr3 = x3.d;
                int i10 = x3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    jd0 jd0Var3 = (jd0) objArr3[i11];
                    nd0 nd0Var2 = jd0Var3.K;
                    if (nd0Var2.p.l != jd0Var3.u()) {
                        jd0Var2.M();
                        jd0Var2.A();
                        if (jd0Var3.u() == Integer.MAX_VALUE) {
                            if (nd0Var2.c || ca0.r(jd0Var3)) {
                                kj0 kj0Var = nd0Var2.q;
                                kj0Var.getClass();
                                kj0Var.e0(false);
                            }
                            nd0Var2.p.f0();
                        }
                    }
                }
                eo0 x4 = jd0Var2.x();
                Object[] objArr4 = x4.d;
                int i12 = x4.g;
                for (int i13 = 0; i13 < i12; i13++) {
                    kd0 kd0Var = ((jd0) objArr4[i13]).K.p.A;
                    kd0Var.getClass();
                    kd0Var.c = false;
                }
                break;
            case 1:
                uk0Var.j.a().c(uk0Var.E);
                break;
            default:
                nd0 nd0Var3 = uk0Var.j;
                qp0 qp0Var = nd0Var3.a().u;
                if (qp0Var == null || (placementScope = qp0Var.p) == null) {
                    placementScope = ((d4) md0.a(nd0Var3.a)).getPlacementScope();
                }
                Function1 function1 = uk0Var.J;
                if (function1 == null) {
                    qp0 a = nd0Var3.a();
                    long j = uk0Var.K;
                    float f = uk0Var.L;
                    placementScope.getClass();
                    yw0.a(placementScope, a);
                    a.Y(s90.c(j, a.i), f, null);
                } else {
                    qp0 a2 = nd0Var3.a();
                    long j2 = uk0Var.K;
                    float f2 = uk0Var.L;
                    placementScope.getClass();
                    yw0.a(placementScope, a2);
                    a2.Y(s90.c(j2, a2.i), f2, function1);
                }
                break;
        }
        return Unit.a;
    }
}
