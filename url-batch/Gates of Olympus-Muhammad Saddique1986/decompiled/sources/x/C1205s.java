package x;

import e2.InterfaceC0424c;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import u.C1076c;

/* renamed from: x.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205s extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f10251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10253g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ I0.A f10254h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I0.z f10255i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.m f10256j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.t f10257k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10258l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0835w f10259m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1076c f10260n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205s(Q q3, boolean z3, boolean z4, I0.A a3, I0.z zVar, I0.m mVar, I0.t tVar, B.a0 a0Var, InterfaceC0835w interfaceC0835w, C1076c c1076c) {
        super(1);
        this.f10251e = q3;
        this.f10252f = z3;
        this.f10253g = z4;
        this.f10254h = a3;
        this.f10255i = zVar;
        this.f10256j = mVar;
        this.f10257k = tVar;
        this.f10258l = a0Var;
        this.f10259m = interfaceC0835w;
        this.f10260n = c1076c;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        p0 d3;
        Z.s sVar = (Z.s) obj;
        Q q3 = this.f10251e;
        if (q3.b() != sVar.a()) {
            q3.f9980f.setValue(Boolean.valueOf(sVar.a()));
            boolean b3 = q3.b();
            I0.t tVar = this.f10257k;
            I0.z zVar = this.f10255i;
            if (b3 && this.f10252f && !this.f10253g) {
                N.j(this.f10254h, q3, zVar, this.f10256j, tVar);
            } else {
                N.g(q3);
            }
            if (sVar.a() && (d3 = q3.d()) != null) {
                AbstractC0837y.r(this.f10259m, null, null, new r(this.f10260n, zVar, q3, d3, tVar, null), 3);
            }
            if (!sVar.a()) {
                this.f10258l.e(null);
            }
        }
        return R1.y.f4171a;
    }
}
