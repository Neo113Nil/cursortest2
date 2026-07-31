package F;

import I.C0089d;
import I.C0113p;

/* renamed from: F.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074x0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y1.a f1418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.l f1419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1420g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1421h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1422i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1423j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y1.c f1424k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1425l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074x0(Y1.a aVar, U.l lVar, long j3, long j4, int i3, float f3, Y1.c cVar, int i4) {
        super(2);
        this.f1418e = aVar;
        this.f1419f = lVar;
        this.f1420g = j3;
        this.f1421h = j4;
        this.f1422i = i3;
        this.f1423j = f3;
        this.f1424k = cVar;
        this.f1425l = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f1425l | 1);
        long j3 = this.f1421h;
        int i3 = this.f1422i;
        AbstractC0076y0.a(this.f1418e, this.f1419f, this.f1420g, j3, i3, this.f1423j, this.f1424k, (C0113p) obj, T2);
        return L1.z.f2729a;
    }
}
