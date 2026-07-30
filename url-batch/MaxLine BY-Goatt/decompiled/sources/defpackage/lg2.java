package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lg2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ tg2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg2(tg2 tg2Var, int i) {
        super(1);
        this.m = i;
        this.n = tg2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        tg2 tg2Var = this.n;
        switch (i) {
            case 0:
                long longValue = ((Number) obj).longValue();
                long j = longValue - tg2Var.x;
                tg2Var.x = longValue;
                long c = si1.c(j / tg2Var.B);
                jn1 jn1Var = tg2Var.y;
                if (jn1Var.h()) {
                    Object[] objArr = jn1Var.a;
                    int i2 = jn1Var.b;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        kg2 kg2Var = (kg2) objArr[i4];
                        tg2.y(tg2Var, kg2Var, c);
                        kg2Var.c = true;
                    }
                    fz2 fz2Var = tg2Var.q;
                    if (fz2Var != null) {
                        fz2Var.p();
                    }
                    int i5 = jn1Var.b;
                    Object[] objArr2 = jn1Var.a;
                    IntRange f = d.f(0, i5);
                    int i6 = f.m;
                    int i7 = f.n;
                    if (i6 <= i7) {
                        while (true) {
                            objArr2[i6 - i3] = objArr2[i6];
                            if (((kg2) objArr2[i6]).c) {
                                i3++;
                            }
                            if (i6 != i7) {
                                i6++;
                            }
                        }
                    }
                    ni.k(i5 - i3, i5, null, objArr2);
                    jn1Var.b -= i3;
                }
                kg2 kg2Var2 = tg2Var.z;
                if (kg2Var2 != null) {
                    kg2Var2.g = tg2Var.r;
                    tg2.y(tg2Var, kg2Var2, c);
                    tg2Var.G(kg2Var2.d);
                    if (kg2Var2.d == 1.0f) {
                        tg2Var.z = null;
                    }
                    tg2Var.F();
                }
                break;
            default:
                tg2Var.x = ((Number) obj).longValue();
                break;
        }
        return Unit.a;
    }
}
