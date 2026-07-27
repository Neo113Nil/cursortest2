package w;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import t.C1199c;

/* renamed from: w.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278s extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f11330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11331e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11332i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G0.z f11333j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G0.y f11334k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G0.m f11335l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G0.s f11336m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11337n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0302y f11338o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1199c f11339p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1278s(P p4, boolean z4, boolean z5, G0.z zVar, G0.y yVar, G0.m mVar, G0.s sVar, A.a0 a0Var, InterfaceC0302y interfaceC0302y, C1199c c1199c) {
        super(1);
        this.f11330d = p4;
        this.f11331e = z4;
        this.f11332i = z5;
        this.f11333j = zVar;
        this.f11334k = yVar;
        this.f11335l = mVar;
        this.f11336m = sVar;
        this.f11337n = a0Var;
        this.f11338o = interfaceC0302y;
        this.f11339p = c1199c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o0 d4;
        X.s sVar = (X.s) obj;
        P p4 = this.f11330d;
        if (p4.b() != sVar.a()) {
            p4.f11059f.setValue(Boolean.valueOf(sVar.a()));
            boolean b4 = p4.b();
            G0.s sVar2 = this.f11336m;
            G0.y yVar = this.f11334k;
            if (b4 && this.f11331e && !this.f11332i) {
                M.j(this.f11333j, p4, yVar, this.f11335l, sVar2);
            } else {
                M.g(p4);
            }
            if (sVar.a() && (d4 = p4.d()) != null) {
                W2.B.m(this.f11338o, null, null, new r(this.f11339p, yVar, p4, d4, sVar2, null), 3);
            }
            if (!sVar.a()) {
                this.f11337n.e(null);
            }
        }
        return Unit.f7487a;
    }
}
