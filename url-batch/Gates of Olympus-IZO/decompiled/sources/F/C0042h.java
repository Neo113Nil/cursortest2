package F;

import I.C0089d;
import I.C0113p;
import r.InterfaceC0808e;
import r.InterfaceC0809f;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042h extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.l f1241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0030b f1242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f1246j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B0.C f1247k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0809f f1248l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0808e f1249m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y1.e f1250n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q.a f1251o;
    public final /* synthetic */ int p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1252q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0042h(U.l lVar, C0030b c0030b, long j3, long j4, long j5, Q.a aVar, B0.C c3, InterfaceC0809f interfaceC0809f, InterfaceC0808e interfaceC0808e, Y1.e eVar, Q.a aVar2, int i3, int i4) {
        super(2);
        this.f1241e = lVar;
        this.f1242f = c0030b;
        this.f1243g = j3;
        this.f1244h = j4;
        this.f1245i = j5;
        this.f1246j = aVar;
        this.f1247k = c3;
        this.f1248l = interfaceC0809f;
        this.f1249m = interfaceC0808e;
        this.f1250n = eVar;
        this.f1251o = aVar2;
        this.p = i3;
        this.f1252q = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.p | 1);
        int T3 = C0089d.T(this.f1252q);
        Q.a aVar = this.f1251o;
        Q.a aVar2 = this.f1246j;
        InterfaceC0809f interfaceC0809f = this.f1248l;
        InterfaceC0808e interfaceC0808e = this.f1249m;
        AbstractC0044i.c(this.f1241e, this.f1242f, this.f1243g, this.f1244h, this.f1245i, aVar2, this.f1247k, interfaceC0809f, interfaceC0808e, this.f1250n, aVar, (C0113p) obj, T2, T3);
        return L1.z.f2729a;
    }
}
