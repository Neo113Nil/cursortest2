package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class Q0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S0 f1321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q.j f1324h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U.q f1325i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s1 f1326j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0.Q f1327k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f1328l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1329m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1330n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1331o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(S0 s02, boolean z3, boolean z4, q.j jVar, U.q qVar, s1 s1Var, b0.Q q3, float f3, float f4, int i3, int i4) {
        super(2);
        this.f1321e = s02;
        this.f1322f = z3;
        this.f1323g = z4;
        this.f1324h = jVar;
        this.f1325i = qVar;
        this.f1326j = s1Var;
        this.f1327k = q3;
        this.f1328l = f3;
        this.f1329m = f4;
        this.f1330n = i3;
        this.f1331o = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f1330n | 1);
        b0.Q q3 = this.f1327k;
        this.f1321e.a(this.f1322f, this.f1323g, this.f1324h, this.f1325i, this.f1326j, q3, this.f1328l, this.f1329m, (C0167p) obj, U3, this.f1331o);
        return R1.y.f4171a;
    }
}
