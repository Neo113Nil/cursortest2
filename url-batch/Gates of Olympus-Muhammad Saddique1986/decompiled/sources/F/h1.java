package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class h1 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.q f1560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1562g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1563h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1564i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1565j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1566k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.X f1568m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q.a f1569n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1570o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, int i3, long j3, long j4, r.X x3, Q.a aVar, int i4) {
        super(2);
        this.f1560e = qVar;
        this.f1561f = interfaceC0426e;
        this.f1562g = interfaceC0426e2;
        this.f1563h = interfaceC0426e3;
        this.f1564i = interfaceC0426e4;
        this.f1565j = i3;
        this.f1566k = j3;
        this.f1567l = j4;
        this.f1568m = x3;
        this.f1569n = aVar;
        this.f1570o = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f1570o | 1);
        Q.a aVar = this.f1569n;
        long j3 = this.f1566k;
        long j4 = this.f1567l;
        j1.a(this.f1560e, this.f1561f, this.f1562g, this.f1563h, this.f1564i, this.f1565j, j3, j4, this.f1568m, aVar, (C0167p) obj, U3);
        return R1.y.f4171a;
    }
}
