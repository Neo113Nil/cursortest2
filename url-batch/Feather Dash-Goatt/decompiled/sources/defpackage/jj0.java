package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jj0 extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ kj0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj0(kj0 kj0Var, int i) {
        super(0);
        this.d = i;
        this.e = kj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gj0 H0;
        int i = this.d;
        kj0 kj0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                nd0 nd0Var = kj0Var.j;
                nd0Var.h = 0;
                eo0 x = nd0Var.a.x();
                Object[] objArr = x.d;
                int i2 = x.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    kj0 kj0Var2 = ((jd0) objArr[i3]).K.q;
                    kj0Var2.getClass();
                    kj0Var2.l = kj0Var2.m;
                    kj0Var2.m = Integer.MAX_VALUE;
                    if (kj0Var2.n == hd0.e) {
                        kj0Var2.n = hd0.g;
                    }
                }
                jd0 jd0Var = nd0Var.a;
                jd0 jd0Var2 = nd0Var.a;
                eo0 x2 = jd0Var.x();
                Object[] objArr2 = x2.d;
                int i4 = x2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    kj0 kj0Var3 = ((jd0) objArr2[i5]).K.q;
                    kj0Var3.getClass();
                    kj0Var3.u.getClass();
                }
                u80 u80Var = kj0Var.y().V;
                if (u80Var != null) {
                    boolean z = u80Var.o;
                    bo0 bo0Var = (bo0) jd0Var2.m();
                    int i6 = bo0Var.d.g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        gj0 H02 = ((qp0) ((jd0) bo0Var.get(i7)).J.e).H0();
                        if (H02 != null) {
                            H02.o = z;
                        }
                    }
                }
                u80 u80Var2 = kj0Var.y().V;
                u80Var2.getClass();
                u80Var2.r0().b();
                if (kj0Var.y().V != null) {
                    bo0 bo0Var2 = (bo0) jd0Var2.m();
                    int i8 = bo0Var2.d.g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        gj0 H03 = ((qp0) ((jd0) bo0Var2.get(i9)).J.e).H0();
                        if (H03 != null) {
                            H03.o = false;
                        }
                    }
                }
                eo0 x3 = jd0Var2.x();
                Object[] objArr3 = x3.d;
                int i10 = x3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    kj0 kj0Var4 = ((jd0) objArr3[i11]).K.q;
                    kj0Var4.getClass();
                    int i12 = kj0Var4.l;
                    int i13 = kj0Var4.m;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        kj0Var4.e0(true);
                    }
                }
                eo0 x4 = jd0Var2.x();
                Object[] objArr4 = x4.d;
                int i14 = x4.g;
                for (int i15 = 0; i15 < i14; i15++) {
                    kj0 kj0Var5 = ((jd0) objArr4[i15]).K.q;
                    kj0Var5.getClass();
                    kd0 kd0Var = kj0Var5.u;
                    kd0Var.getClass();
                    kd0Var.c = false;
                }
                break;
            case 1:
                nd0 nd0Var2 = kj0Var.j;
                yw0 yw0Var = null;
                if (ca0.r(nd0Var2.a) || nd0Var2.c) {
                    qp0 qp0Var = nd0Var2.a().u;
                    if (qp0Var != null) {
                        yw0Var = qp0Var.p;
                    }
                } else {
                    qp0 qp0Var2 = nd0Var2.a().u;
                    if (qp0Var2 != null && (H0 = qp0Var2.H0()) != null) {
                        yw0Var = H0.p;
                    }
                }
                if (yw0Var == null) {
                    yw0Var = ((d4) md0.a(nd0Var2.a)).getPlacementScope();
                }
                gj0 H04 = nd0Var2.a().H0();
                H04.getClass();
                yw0.l(yw0Var, H04, kj0Var.r);
                break;
            default:
                gj0 H05 = kj0Var.j.a().H0();
                H05.getClass();
                H05.c(kj0Var.B);
                break;
        }
        return Unit.a;
    }
}
