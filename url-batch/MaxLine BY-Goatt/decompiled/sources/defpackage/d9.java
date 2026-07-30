package defpackage;

import androidx.compose.ui.draw.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d9 extends o81 implements xt0 {
    public static final d9 n;
    public static final d9 o;
    public static final d9 p;
    public static final d9 q;
    public static final d9 r;
    public static final d9 s;
    public final /* synthetic */ int m;

    static {
        int i = 3;
        n = new d9(i, 0);
        o = new d9(i, 1);
        p = new d9(i, 2);
        q = new d9(i, 3);
        r = new d9(i, 4);
        s = new d9(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d9(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = 0;
        switch (this.m) {
            case 0:
                vl1 vl1Var = (vl1) obj;
                a00 a00Var = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var.X(-2126899193);
                long j = ((kw2) a00Var.j(lw2.a)).a;
                boolean e = a00Var.e(j);
                Object M = a00Var.M();
                if (e || M == sz.a) {
                    M = new c9(j, i);
                    a00Var.i0(M);
                }
                vl1 k = vl1Var.k(a.b(sl1.a, (Function1) M));
                a00Var.q(false);
                return k;
            case 1:
                ((Number) obj3).intValue();
                return Unit.a;
            case 2:
                ((Number) obj2).intValue();
                return Integer.valueOf(((jj1) obj).Y(((Number) obj3).intValue()));
            case 3:
                ((Number) obj2).intValue();
                return Integer.valueOf(((jj1) obj).a0(((Number) obj3).intValue()));
            case 4:
                ((Number) obj2).intValue();
                return Integer.valueOf(((jj1) obj).V(((Number) obj3).intValue()));
            default:
                cz2 cz2Var = (cz2) obj;
                a00 a00Var2 = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var2.X(-1154662212);
                y21 y21Var = y21.m;
                y21 y21Var2 = y21.n;
                Object P = cz2Var.a(y21Var, y21Var2) ? bd3.P(67, 2, cf0.b) : (cz2Var.a(y21Var2, y21Var) || cz2Var.a(y21.o, y21Var2)) ? new h03(83, 67, cf0.b) : bd3.G(7, null);
                a00Var2.q(false);
                return P;
        }
    }
}
