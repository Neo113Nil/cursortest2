package F;

import B.C0022x;
import I.C0143d;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import l2.InterfaceC0602c;
import n.AbstractC0695v;
import t.C0971A;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105l extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ R1.e f1645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1647h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1648i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1649j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105l(Q.a aVar, J1.a aVar2, String str, String str2, int i3) {
        super(2);
        this.f1644e = 2;
        this.f1645f = aVar;
        this.f1647h = aVar2;
        this.f1648i = str;
        this.f1649j = str2;
        this.f1646g = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1644e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f1646g | 1);
                Q.a aVar = (Q.a) this.f1645f;
                AbstractC0107m.d((InterfaceC0422a) this.f1647h, (U.q) this.f1648i, (R0.v) this.f1649j, aVar, (C0167p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f1646g | 1);
                Q.a aVar2 = (Q.a) this.f1645f;
                AbstractC0123u0.a((M) this.f1647h, (m1) this.f1648i, (A1) this.f1649j, aVar2, (C0167p) obj, U4);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                ((Q.a) this.f1645f).a((J1.a) this.f1647h, (String) this.f1648i, (String) this.f1649j, (C0167p) obj, C0143d.U(this.f1646g) | 1);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f1646g | 1);
                C0022x c0022x = (C0022x) this.f1645f;
                o.p.c((o.g) this.f1649j, (InterfaceC0422a) this.f1647h, (U.q) this.f1648i, c0022x, (C0167p) obj, U5);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC0695v.b((InterfaceC0602c) this.f1647h, (U.q) this.f1648i, (C0971A) this.f1649j, (InterfaceC0426e) this.f1645f, (C0167p) obj, C0143d.U(this.f1646g | 1));
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0105l(Object obj, Object obj2, Object obj3, InterfaceC0426e interfaceC0426e, int i3, int i4) {
        super(2);
        this.f1644e = i4;
        this.f1647h = obj;
        this.f1648i = obj2;
        this.f1649j = obj3;
        this.f1645f = interfaceC0426e;
        this.f1646g = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105l(o.g gVar, InterfaceC0422a interfaceC0422a, U.q qVar, C0022x c0022x, int i3) {
        super(2);
        this.f1644e = 3;
        this.f1649j = gVar;
        this.f1647h = interfaceC0422a;
        this.f1648i = qVar;
        this.f1645f = c0022x;
        this.f1646g = i3;
    }
}
