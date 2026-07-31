package F;

import B.C0022x;
import I.C0143d;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import o.C0740b;

/* renamed from: F.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114p0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1717e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ R1.e f1718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1721i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1722j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1723k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1724l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114p0(Q.a aVar, Q.a aVar2, Q.a aVar3, Q.a aVar4, boolean z3, InterfaceC0422a interfaceC0422a, int i3) {
        super(2);
        this.f1718f = aVar;
        this.f1722j = aVar2;
        this.f1723k = aVar3;
        this.f1724l = aVar4;
        this.f1719g = z3;
        this.f1720h = interfaceC0422a;
        this.f1721i = i3;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [e2.a, f2.k] */
    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1717e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f1721i | 1);
                Q.a aVar = (Q.a) this.f1718f;
                boolean z3 = this.f1719g;
                C0112o0 c0112o0 = (C0112o0) this.f1723k;
                d1.d((InterfaceC0422a) this.f1720h, (U.q) this.f1722j, z3, c0112o0, (q.k) this.f1724l, aVar, (C0167p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                O0.c((Q.a) this.f1718f, (Q.a) this.f1722j, (Q.a) this.f1723k, (Q.a) this.f1724l, this.f1719g, (InterfaceC0422a) this.f1720h, (C0167p) obj, C0143d.U(this.f1721i | 1));
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f1721i | 1);
                Q.a aVar2 = (Q.a) this.f1718f;
                l.G g3 = (l.G) this.f1720h;
                l.H h3 = (l.H) this.f1723k;
                androidx.compose.animation.a.b(this.f1719g, (U.q) this.f1722j, g3, h3, (String) this.f1724l, aVar2, (C0167p) obj, U4);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f1721i | 1);
                Q.a aVar3 = (Q.a) this.f1718f;
                C0022x c0022x = (C0022x) this.f1724l;
                U.q qVar = (U.q) this.f1722j;
                n.z0.b((o.n) this.f1723k, (InterfaceC0422a) this.f1720h, c0022x, qVar, this.f1719g, aVar3, (C0167p) obj, U5);
                break;
            default:
                ((Number) obj2).intValue();
                int U6 = C0143d.U(this.f1721i | 1);
                ?? r6 = (f2.k) this.f1718f;
                C0740b c0740b = (C0740b) this.f1723k;
                U.q qVar2 = (U.q) this.f1722j;
                o.p.b((String) this.f1720h, this.f1719g, c0740b, qVar2, (InterfaceC0427f) this.f1724l, r6, (C0167p) obj, U6);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114p0(InterfaceC0422a interfaceC0422a, U.q qVar, boolean z3, C0112o0 c0112o0, q.k kVar, Q.a aVar, int i3) {
        super(2);
        this.f1720h = interfaceC0422a;
        this.f1722j = qVar;
        this.f1719g = z3;
        this.f1723k = c0112o0;
        this.f1724l = kVar;
        this.f1718f = aVar;
        this.f1721i = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0114p0(String str, boolean z3, C0740b c0740b, U.q qVar, InterfaceC0427f interfaceC0427f, InterfaceC0422a interfaceC0422a, int i3) {
        super(2);
        this.f1720h = str;
        this.f1719g = z3;
        this.f1723k = c0740b;
        this.f1722j = qVar;
        this.f1724l = interfaceC0427f;
        this.f1718f = (f2.k) interfaceC0422a;
        this.f1721i = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114p0(o.n nVar, InterfaceC0422a interfaceC0422a, C0022x c0022x, U.q qVar, boolean z3, Q.a aVar, int i3) {
        super(2);
        this.f1723k = nVar;
        this.f1720h = interfaceC0422a;
        this.f1724l = c0022x;
        this.f1722j = qVar;
        this.f1719g = z3;
        this.f1718f = aVar;
        this.f1721i = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114p0(boolean z3, U.q qVar, l.G g3, l.H h3, String str, Q.a aVar, int i3) {
        super(2);
        this.f1719g = z3;
        this.f1722j = qVar;
        this.f1720h = g3;
        this.f1723k = h3;
        this.f1724l = str;
        this.f1718f = aVar;
        this.f1721i = i3;
    }
}
