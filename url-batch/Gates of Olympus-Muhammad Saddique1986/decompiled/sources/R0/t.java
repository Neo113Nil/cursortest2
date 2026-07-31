package R0;

import B.C0011l;
import B.a0;
import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import r.AbstractC0868o;
import s.C0939h;
import t.C0980h;
import u0.C1099f0;
import x.N;

/* loaded from: classes.dex */
public final class t extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i3, int i4, Object obj) {
        super(2);
        this.f4115e = i4;
        this.f4117g = obj;
        this.f4116f = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f4115e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f4116f | 1);
                ((u) this.f4117g).a(U3, (C0167p) obj);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f4116f | 1);
                ((A) this.f4117g).a(U4, (C0167p) obj);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f4116f | 1);
                AbstractC0868o.a((U.q) this.f4117g, (C0167p) obj, U5);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    C0939h c0939h = (C0939h) this.f4117g;
                    C0011l c0011l = c0939h.f8235b.f8229a;
                    int i3 = this.f4116f;
                    C0980h e3 = c0011l.e(i3);
                    int i4 = i3 - e3.f8478a;
                    ((Q.a) e3.f8480c.f2118d).f(c0939h.f8236c, Integer.valueOf(i4), c0167p, 0);
                }
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                int U6 = C0143d.U(this.f4116f | 1);
                ((C1099f0) this.f4117g).a(U6, (C0167p) obj);
                break;
            case 5:
                ((Number) obj2).intValue();
                int U7 = C0143d.U(this.f4116f | 1);
                n.r.b((u1.p) this.f4117g, (C0167p) obj, U7);
                break;
            default:
                ((Number) obj2).intValue();
                int U8 = C0143d.U(this.f4116f | 1);
                N.e((a0) this.f4117g, (C0167p) obj, U8);
                break;
        }
        return R1.y.f4171a;
    }
}
