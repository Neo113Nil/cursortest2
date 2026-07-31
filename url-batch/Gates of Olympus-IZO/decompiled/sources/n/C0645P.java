package n;

import I.C0089d;
import I.C0113p;
import b0.C0281n;
import e2.AbstractC0381e;
import g0.AbstractC0393b;

/* renamed from: n.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645P extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0393b f6023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.l f6024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.d f6025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0.D f6026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f6027i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0281n f6028j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6029k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6030l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0645P(AbstractC0393b abstractC0393b, U.l lVar, U.d dVar, r0.D d3, float f3, C0281n c0281n, int i3, int i4) {
        super(2);
        this.f6023e = abstractC0393b;
        this.f6024f = lVar;
        this.f6025g = dVar;
        this.f6026h = d3;
        this.f6027i = f3;
        this.f6028j = c0281n;
        this.f6029k = i3;
        this.f6030l = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f6029k | 1);
        r0.D d3 = this.f6026h;
        AbstractC0381e.b(this.f6023e, this.f6024f, this.f6025g, d3, this.f6027i, this.f6028j, (C0113p) obj, T2, this.f6030l);
        return L1.z.f2729a;
    }
}
