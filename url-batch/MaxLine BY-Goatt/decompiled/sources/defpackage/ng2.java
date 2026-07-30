package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ng2 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng2(int i, Object obj) {
        super(0);
        this.m = i;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                tg2 tg2Var = (tg2) obj;
                fz2 fz2Var = tg2Var.q;
                tg2Var.r = fz2Var != null ? ((Number) fz2Var.l.getValue()).longValue() : 0L;
                break;
            case 1:
                v91 a = ((gq2) obj).a();
                i91 i91Var = a.m;
                if (a.z != ((bo1) i91Var.o()).m.o) {
                    tn1 tn1Var = a.r;
                    Object[] objArr = tn1Var.c;
                    long[] jArr = tn1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((o91) objArr[(i2 << 3) + i4]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (i91Var.s != null) {
                        if (!i91Var.Q.e) {
                            i91.U(i91Var, false, 7);
                        }
                    } else if (!i91Var.q()) {
                        i91.W(i91Var, false, 7);
                    }
                }
                break;
            case 2:
                break;
            case 3:
                ow2 ow2Var = (ow2) obj;
                ow2Var.K = null;
                yh2.l(ow2Var);
                zm3.C(ow2Var);
                z71.F(ow2Var);
                break;
            case 4:
                ((yx2) obj).V.invoke(Boolean.valueOf(!r0.U));
                break;
            default:
                a43 a43Var = (a43) obj;
                int i5 = a43Var.x;
                iz1 iz1Var = a43Var.u;
                if (i5 == iz1Var.h()) {
                    iz1Var.i(iz1Var.h() + 1);
                }
                break;
        }
        return Unit.a;
    }
}
