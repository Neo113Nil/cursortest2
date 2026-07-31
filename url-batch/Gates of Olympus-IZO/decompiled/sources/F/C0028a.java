package F;

import I.C0089d;
import I.C0113p;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028a extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q.a f1175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.l f1176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.e f1177g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.f f1178h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1179i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.U f1180j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y0 f1181k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1182l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028a(Q.a aVar, U.l lVar, Y1.e eVar, Y1.f fVar, float f3, r.U u3, Y0 y02, int i3) {
        super(2);
        this.f1175e = aVar;
        this.f1176f = lVar;
        this.f1177g = eVar;
        this.f1178h = fVar;
        this.f1179i = f3;
        this.f1180j = u3;
        this.f1181k = y02;
        this.f1182l = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f1182l | 1);
        Q.a aVar = this.f1175e;
        float f3 = this.f1179i;
        r.U u3 = this.f1180j;
        AbstractC0044i.a(aVar, this.f1176f, this.f1177g, this.f1178h, f3, u3, this.f1181k, (C0113p) obj, T2);
        return L1.z.f2729a;
    }
}
