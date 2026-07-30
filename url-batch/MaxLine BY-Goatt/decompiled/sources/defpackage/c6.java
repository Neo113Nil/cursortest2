package defpackage;

import androidx.compose.foundation.layout.b;
import com.majelw.libystne.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c6 extends o81 implements Function2 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ my o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(vl1 vl1Var, my myVar) {
        super(2);
        this.n = vl1Var;
        this.o = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        my myVar = this.o;
        vl1 vl1Var = this.n;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    String i2 = ak2.i(R.string.m3c_dialog, a00Var);
                    zx1 zx1Var = e6.a;
                    vl1 j = b.j(vl1Var, 280.0f, Float.NaN, 560.0f, Float.NaN);
                    boolean f = a00Var.f(i2);
                    Object M = a00Var.M();
                    if (f || M == sz.a) {
                        M = new b6(i2, 0);
                        a00Var.i0(M);
                    }
                    vl1 k = j.k(wh2.a(sl1.a, (Function1) M));
                    oj1 e = fp.e(qb2.p, true);
                    int D = iv1.D(a00Var);
                    v02 l = a00Var.l();
                    vl1 E = bd3.E(a00Var, k);
                    pz.b.getClass();
                    o00 o00Var = oz.b;
                    a00Var.b0();
                    if (a00Var.S) {
                        a00Var.k(o00Var);
                    } else {
                        a00Var.l0();
                    }
                    uj2.e(a00Var, e, oz.f);
                    uj2.e(a00Var, l, oz.e);
                    sc scVar = oz.g;
                    if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                        q40.r(D, a00Var, D, scVar);
                    }
                    uj2.e(a00Var, E, oz.d);
                    myVar.invoke(a00Var, 0);
                    a00Var.q(true);
                }
                break;
            default:
                ((Number) obj2).intValue();
                hl2.a(vl1Var, myVar, (a00) obj, s03.R(49));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(vl1 vl1Var, my myVar, int i) {
        super(2);
        this.n = vl1Var;
        this.o = myVar;
    }
}
