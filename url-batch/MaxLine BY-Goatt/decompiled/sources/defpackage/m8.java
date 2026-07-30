package defpackage;

import androidx.compose.foundation.layout.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m8 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.m = i;
        this.p = obj;
        this.n = obj2;
        this.o = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.p;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                int intValue = ((Number) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    p00.a((t7) obj5, (ac) obj4, (Function2) obj3, a00Var, 0);
                } else {
                    a00Var.S();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                p00.a((rx1) obj5, (ac) obj4, (Function2) obj3, (a00) obj, s03.R(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                s93.i((vl1) obj5, (gv2) obj4, (my) obj3, (a00) obj, s03.R(385));
                break;
            case 3:
                ca0 ca0Var = (ca0) obj;
                long j = ((u10) obj2).a;
                zx1 zx1Var = (zx1) obj5;
                if (u10.h(j) == Integer.MAX_VALUE) {
                    lh.e("LazyVerticalGrid's width should be bound by parent.");
                    break;
                } else {
                    u81 u81Var = u81.m;
                    int h = u10.h(j) - ca0Var.R(a.e(zx1Var, u81Var) + a.f(zx1Var, u81Var));
                    xh xhVar = (xh) obj3;
                    int R = ca0Var.R(xhVar.a());
                    int i2 = ((lw0) obj4).a;
                    int i3 = h - ((i2 - 1) * R);
                    int i4 = i3 / i2;
                    int i5 = i3 % i2;
                    ArrayList arrayList = new ArrayList(i2);
                    int i6 = 0;
                    while (i6 < i2) {
                        arrayList.add(Integer.valueOf((i6 < i5 ? 1 : 0) + i4));
                        i6++;
                    }
                    int[] L = zv.L(arrayList);
                    int[] iArr = new int[L.length];
                    xhVar.f(ca0Var, h, L, u81.m, iArr);
                    break;
                }
            case 4:
                ((Number) obj2).intValue();
                tk3.o((cp1) obj5, (jd2) obj4, (my) obj3, (a00) obj, s03.R(385));
                break;
            case 5:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                z71.H((a50) obj5, null, new wp1(floatValue, (tg2) obj4, (cp1) obj3, (o30) null), 3);
                break;
            case 6:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                z72 z72Var = (z72) obj5;
                cg2 cg2Var = (cg2) obj4;
                long g = cg2Var.g(cg2Var.c(floatValue2 - z72Var.m));
                cg2 cg2Var2 = ((ag2) obj3).a;
                z72Var.m += cg2Var.c(cg2Var.f(cg2.a(cg2Var2, cg2Var2.h, g, 1)));
                break;
            default:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    vl1 c = androidx.compose.ui.layout.a.c(sl1.a, "Container");
                    int i7 = kx1.b;
                    vl1 c2 = androidx.compose.ui.draw.a.c(c, new p8(26, new ku2((zn1) obj5, zn1.class, "value", "getValue()Ljava/lang/Object;", 0), (yx1) obj4));
                    Function2 function2 = (Function2) obj3;
                    oj1 e = fp.e(qb2.p, true);
                    int D = iv1.D(a00Var2);
                    v02 l = a00Var2.l();
                    vl1 E = bd3.E(a00Var2, c2);
                    pz.b.getClass();
                    o00 o00Var = oz.b;
                    a00Var2.b0();
                    if (a00Var2.S) {
                        a00Var2.k(o00Var);
                    } else {
                        a00Var2.l0();
                    }
                    uj2.e(a00Var2, e, oz.f);
                    uj2.e(a00Var2, l, oz.e);
                    sc scVar = oz.g;
                    if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                        q40.r(D, a00Var2, D, scVar);
                    }
                    uj2.e(a00Var2, E, oz.d);
                    function2.invoke(a00Var2, 0);
                    a00Var2.q(true);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8(Object obj, Object obj2, Function2 function2, int i, int i2) {
        super(2);
        this.m = i2;
        this.p = obj;
        this.n = obj2;
        this.o = function2;
    }
}
