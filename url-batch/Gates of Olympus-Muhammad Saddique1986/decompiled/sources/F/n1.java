package F;

import I.C0167p;
import m.AbstractC0625j;
import r.AbstractC0856c;
import w.C1171b;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.X0 f1696a = new I.X0(N.f1281n);

    public static final b0.Q a(int i3, C0167p c0167p) {
        m1 m1Var = (m1) c0167p.k(f1696a);
        switch (AbstractC0625j.b(i3)) {
            case 0:
                return m1Var.f1679e;
            case 1:
                return b(m1Var.f1679e);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return m1Var.f1675a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return b(m1Var.f1675a);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return w.e.f9839a;
            case 5:
                return m1Var.f1678d;
            case 6:
                w.d dVar = m1Var.f1678d;
                float f3 = (float) 0.0d;
                return w.d.a(dVar, new C1171b(f3), null, new C1171b(f3), 6);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return b(m1Var.f1678d);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                return m1Var.f1677c;
            case AbstractC0856c.f8037c /* 9 */:
                return b0.M.f5355a;
            case AbstractC0856c.f8039e /* 10 */:
                return m1Var.f1676b;
            default:
                throw new C1.c();
        }
    }

    public static final w.d b(w.d dVar) {
        float f3 = (float) 0.0d;
        return w.d.a(dVar, null, new C1171b(f3), new C1171b(f3), 3);
    }
}
