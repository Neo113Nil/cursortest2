package F;

import I.C0167p;
import e2.InterfaceC0426e;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101j extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.Q f1598h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1599i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1600j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1601k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1602l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1603m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1604n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q.a f1605o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0101j(InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, b0.Q q3, long j3, float f3, long j4, long j5, long j6, InterfaceC0426e interfaceC0426e4, Q.a aVar) {
        super(2);
        this.f1595e = interfaceC0426e;
        this.f1596f = interfaceC0426e2;
        this.f1597g = interfaceC0426e3;
        this.f1598h = q3;
        this.f1599i = j3;
        this.f1600j = f3;
        this.f1601k = j4;
        this.f1602l = j5;
        this.f1603m = j6;
        this.f1604n = interfaceC0426e4;
        this.f1605o = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            Q.a b3 = Q.f.b(1163543932, new C0099i(this.f1604n, this.f1605o, 1), c0167p);
            int i3 = H.c.f2382a;
            AbstractC0107m.a(b3, null, this.f1595e, this.f1596f, this.f1597g, this.f1598h, this.f1599i, this.f1600j, O.d(26, c0167p), this.f1601k, this.f1602l, this.f1603m, c0167p, 6, 0);
        }
        return R1.y.f4171a;
    }
}
