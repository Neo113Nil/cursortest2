package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import n.C0694u;
import r.InterfaceC0849K;

/* renamed from: F.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115q extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q.a f1733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f1734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U.q f1735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1736i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1737j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1738k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1739l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0849K f1740m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q.k f1741n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1742o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0115q(Q.a aVar, InterfaceC0422a interfaceC0422a, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, boolean z3, C0127w0 c0127w0, InterfaceC0849K interfaceC0849K, q.k kVar, int i3, int i4) {
        super(2);
        this.f1732e = i4;
        this.f1733f = aVar;
        this.f1734g = interfaceC0422a;
        this.f1735h = qVar;
        this.f1736i = interfaceC0426e;
        this.f1737j = interfaceC0426e2;
        this.f1738k = z3;
        this.f1739l = c0127w0;
        this.f1740m = interfaceC0849K;
        this.f1741n = kVar;
        this.f1742o = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1732e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f1742o | 1);
                Q.a aVar = this.f1733f;
                boolean z3 = this.f1738k;
                C0127w0 c0127w0 = (C0127w0) this.f1739l;
                r.b(aVar, this.f1734g, this.f1735h, (InterfaceC0426e) this.f1736i, (InterfaceC0426e) this.f1737j, z3, c0127w0, this.f1740m, this.f1741n, (C0167p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f1742o | 1);
                Q.a aVar2 = this.f1733f;
                boolean z4 = this.f1738k;
                C0127w0 c0127w02 = (C0127w0) this.f1739l;
                B0.b(aVar2, this.f1734g, this.f1735h, (InterfaceC0426e) this.f1736i, (InterfaceC0426e) this.f1737j, z4, c0127w02, this.f1740m, this.f1741n, (C0167p) obj, U4);
                break;
            default:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f1742o | 1);
                Q.a aVar3 = this.f1733f;
                C0694u c0694u = (C0694u) this.f1739l;
                InterfaceC0849K interfaceC0849K = this.f1740m;
                d1.b(this.f1734g, this.f1735h, this.f1738k, (b0.Q) this.f1736i, (A) this.f1737j, null, c0694u, interfaceC0849K, this.f1741n, aVar3, (C0167p) obj, U5);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115q(InterfaceC0422a interfaceC0422a, U.q qVar, boolean z3, b0.Q q3, A a3, d1 d1Var, C0694u c0694u, InterfaceC0849K interfaceC0849K, q.k kVar, Q.a aVar, int i3) {
        super(2);
        this.f1732e = 2;
        this.f1734g = interfaceC0422a;
        this.f1735h = qVar;
        this.f1738k = z3;
        this.f1736i = q3;
        this.f1737j = a3;
        this.f1739l = c0694u;
        this.f1740m = interfaceC0849K;
        this.f1741n = kVar;
        this.f1733f = aVar;
        this.f1742o = i3;
    }
}
