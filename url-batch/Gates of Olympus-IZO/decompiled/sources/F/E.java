package F;

import I.C0089d;
import I.C0113p;
import r.C0797I;

/* loaded from: classes.dex */
public final class E extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q.a f889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B0.C f890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.e f892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y1.e f893i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f894j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f895k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0797I f897m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f898n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Q.a aVar, B0.C c3, long j3, Y1.e eVar, Y1.e eVar2, long j4, long j5, float f3, C0797I c0797i, int i3) {
        super(2);
        this.f889e = aVar;
        this.f890f = c3;
        this.f891g = j3;
        this.f892h = eVar;
        this.f893i = eVar2;
        this.f894j = j4;
        this.f895k = j5;
        this.f896l = f3;
        this.f897m = c0797i;
        this.f898n = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f898n | 1);
        Q.a aVar = this.f889e;
        long j3 = this.f894j;
        long j4 = this.f895k;
        I.c(aVar, this.f890f, this.f891g, this.f892h, this.f893i, j3, j4, this.f896l, this.f897m, (C0113p) obj, T2);
        return L1.z.f2729a;
    }
}
