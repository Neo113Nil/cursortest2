package b6;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1281g;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.f1278d = i;
        this.f1280f = obj;
        this.f1281g = obj2;
        this.f1279e = obj3;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1278d) {
            case 0:
                ((Integer) obj2).getClass();
                k.b((String) this.f1280f, (ArrayList) this.f1281g, (y0.m) this.f1279e, (m0.s) obj, m0.b.w(391));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k.C((h0) this.f1280f, (p6.c) this.f1281g, (y0.m) this.f1279e, (m0.s) obj, m0.b.w(1));
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                h0.a.d((o4.d) this.f1280f, (v0.c) this.f1281g, (u0.c) this.f1279e, (m0.s) obj, m0.b.w(385));
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                a7.u uVar = (a7.u) this.f1280f;
                r.s0 s0Var = (r.s0) this.f1281g;
                o4.d dVar = (o4.d) this.f1279e;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                a7.x.n(uVar, null, new i0.g(floatValue, s0Var, dVar, (g6.c) null), 3);
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                u.x0 x0Var = (u.x0) this.f1280f;
                q6.r rVar = (q6.r) this.f1281g;
                r1.d dVar2 = (r1.d) this.f1279e;
                q1.k kVar = (q1.k) obj;
                e1.b bVar = (e1.b) obj2;
                long d8 = w1.f.t(x0Var).d(0L);
                if (!e1.b.b(d8, rVar.f6204d)) {
                    x0Var.A = e1.b.e(x0Var.A, e1.b.d(d8, rVar.f6204d));
                }
                rVar.f6204d = d8;
                m.a.h(dVar2, kVar, x0Var.A);
                c7.c cVar = x0Var.f7124x;
                if (cVar != null) {
                    cVar.t(new u.l(bVar.f2455a));
                }
                return c6.m.f1757a;
            default:
                q6.p pVar = (q6.p) this.f1280f;
                u.e1 e1Var = (u.e1) this.f1281g;
                u.c1 c1Var = (u.c1) this.f1279e;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h8 = e1Var.h(e1Var.d(floatValue2 - pVar.f6202d));
                u.e1 e1Var2 = c1Var.f6948a;
                pVar.f6202d += e1Var.d(e1Var.g(e1Var2.c(e1Var2.f6971k, h8, 1)));
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i, int i8) {
        this.f1278d = i8;
        this.f1280f = obj;
        this.f1281g = obj2;
        this.f1279e = obj3;
    }
}
