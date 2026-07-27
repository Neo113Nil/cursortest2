package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s0.C1152k0;
import y0.C1317a;

/* renamed from: w.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282w extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G0.F f11356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G0.y f11357e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11358i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11359j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G0.m f11360k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f11361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G0.s f11362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X.p f11364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1282w(G0.F f4, G0.y yVar, boolean z4, boolean z5, G0.m mVar, P p4, G0.s sVar, A.a0 a0Var, X.p pVar) {
        super(1);
        this.f11356d = f4;
        this.f11357e = yVar;
        this.f11358i = z4;
        this.f11359j = z5;
        this.f11360k = mVar;
        this.f11361l = p4;
        this.f11362m = sVar;
        this.f11363n = a0Var;
        this.f11364o = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y0.i iVar = (y0.i) obj;
        G0.F f4 = this.f11356d;
        S2.e[] eVarArr = y0.s.f11639a;
        y0.t tVar = y0.q.f11635x;
        S2.e[] eVarArr2 = y0.s.f11639a;
        S2.e eVar = eVarArr2[16];
        tVar.a(iVar, f4.f3027a);
        G0.y yVar = this.f11357e;
        y0.t tVar2 = y0.q.f11636y;
        S2.e eVar2 = eVarArr2[17];
        long j4 = yVar.f3094b;
        tVar2.a(iVar, new A0.K(j4));
        boolean z4 = this.f11358i;
        if (!z4) {
            iVar.s(y0.q.f11620i, Unit.f7487a);
        }
        boolean z5 = this.f11359j;
        boolean z6 = z4 && !z5;
        y0.t tVar3 = y0.q.f11610F;
        S2.e eVar3 = eVarArr2[23];
        tVar3.a(iVar, Boolean.valueOf(z6));
        P p4 = this.f11361l;
        y0.s.c(iVar, new C1277q(p4, 2));
        if (z6) {
            iVar.s(y0.h.f11558i, new C1317a(null, new C1277q(p4, iVar)));
            iVar.s(y0.h.f11562m, new C1317a(null, new C1281v(this.f11359j, this.f11358i, p4, iVar, yVar)));
        }
        G0.s sVar = this.f11362m;
        A.a0 a0Var = this.f11363n;
        iVar.s(y0.h.f11557h, new C1317a(null, new n.i(sVar, this.f11358i, yVar, a0Var, p4)));
        G0.m mVar = this.f11360k;
        int i2 = mVar.f3072e;
        A.f0 f0Var = new A.f0(p4, 16, mVar);
        iVar.s(y0.q.f11637z, new G0.l(i2));
        iVar.s(y0.h.f11563n, new C1317a(null, f0Var));
        iVar.s(y0.h.f11551b, new C1317a(null, new C1152k0(p4, this.f11364o, z5)));
        iVar.s(y0.h.f11552c, new C1317a(null, new A.Z(a0Var, 5)));
        if (!A0.K.b(j4)) {
            iVar.s(y0.h.f11564o, new C1317a(null, new A.Z(a0Var, 6)));
            if (z4 && !z5) {
                iVar.s(y0.h.f11565p, new C1317a(null, new A.Z(a0Var, 7)));
            }
        }
        if (z4 && !z5) {
            iVar.s(y0.h.f11566q, new C1317a(null, new A.Z(a0Var, 4)));
        }
        return Unit.f7487a;
    }
}
