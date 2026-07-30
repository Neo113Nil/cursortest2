package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ju2 extends o81 implements Function1 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ float n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju2(float f, zn1 zn1Var) {
        super(1);
        this.n = f;
        this.o = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        float f = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                long j = ((ql2) obj).a;
                float d = ql2.d(j) * f;
                float b = ql2.b(j) * f;
                zn1 zn1Var = (zn1) obj2;
                if (ql2.d(((ql2) zn1Var.getValue()).a) != d || ql2.b(((ql2) zn1Var.getValue()).a) != b) {
                    zn1Var.setValue(new ql2(ph2.a(d, b)));
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                fz2 fz2Var = (fz2) obj2;
                boolean g = fz2Var.g();
                jz1 jz1Var = fz2Var.g;
                if (!g) {
                    if (jz1Var.h() == Long.MIN_VALUE) {
                        jz1Var.i(longValue);
                        ((lz1) fz2Var.a.m).setValue(Boolean.TRUE);
                    }
                    long h = longValue - jz1Var.h();
                    if (f != 0.0f) {
                        h = si1.c(h / f);
                    }
                    fz2Var.o(h);
                    fz2Var.h(f == 0.0f, h);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju2(fz2 fz2Var, float f) {
        super(1);
        this.o = fz2Var;
        this.n = f;
    }
}
