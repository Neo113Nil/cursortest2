package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118s extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q.a f1766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.q f1767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0427f f1769h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1770i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.X f1771j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y1 f1772k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1773l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0118s(Q.a aVar, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0427f interfaceC0427f, float f3, r.X x3, y1 y1Var, int i3) {
        super(2);
        this.f1766e = aVar;
        this.f1767f = qVar;
        this.f1768g = interfaceC0426e;
        this.f1769h = interfaceC0427f;
        this.f1770i = f3;
        this.f1771j = x3;
        this.f1772k = y1Var;
        this.f1773l = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f1773l | 1);
        Q.a aVar = this.f1766e;
        float f3 = this.f1770i;
        r.X x3 = this.f1771j;
        AbstractC0132z.a(aVar, this.f1767f, this.f1768g, this.f1769h, f3, x3, this.f1772k, (C0167p) obj, U3);
        return R1.y.f4171a;
    }
}
