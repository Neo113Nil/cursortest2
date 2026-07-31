package j0;

import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final u2 f3688a = new u2(new c.e(13));

    public static final f1.i0 a(l0.q qVar, m0.s sVar) {
        g2 g2Var = (g2) sVar.j(f3688a);
        switch (qVar.ordinal()) {
            case 0:
                return g2Var.f3674h;
            case 1:
                return g2Var.f3671e;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return g2Var.f3673g;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return b(g2Var.f3671e);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return g2Var.f3667a;
            case 5:
                return b(g2Var.f3667a);
            case 6:
                return d0.e.f2052a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return g2Var.f3670d;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                d0.d dVar = g2Var.f3670d;
                d0.b bVar = f2.i;
                return d0.d.b(dVar, bVar, null, null, bVar, 6);
            case x.v0.f8304b /* 9 */:
                return g2Var.f3672f;
            case x.v0.f8306d /* 10 */:
                d0.d dVar2 = g2Var.f3670d;
                d0.b bVar2 = f2.i;
                return d0.d.b(dVar2, null, bVar2, bVar2, null, 9);
            case 11:
                return b(g2Var.f3670d);
            case 12:
                return g2Var.f3669c;
            case 13:
                return f1.p.f2693a;
            case 14:
                return g2Var.f3668b;
            default:
                throw new a5.c();
        }
    }

    public static d0.d b(d0.d dVar) {
        d0.b bVar = f2.i;
        return d0.d.b(dVar, null, null, bVar, bVar, 3);
    }
}
