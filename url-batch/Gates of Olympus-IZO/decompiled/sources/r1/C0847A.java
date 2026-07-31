package r1;

import I.C0089d;
import I.C0113p;
import h.AbstractC0416e;
import q1.C0775D;

/* renamed from: r1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847A extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0775D f7196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q1.z f7197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U.l f7198h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U.d f7199i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7200j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7201k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7202l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7203m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7204n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7205o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0847A(C0775D c0775d, q1.z zVar, U.l lVar, U.d dVar, Y1.c cVar, Y1.c cVar2, Y1.c cVar3, Y1.c cVar4, Y1.c cVar5, int i3, int i4) {
        super(2);
        this.f7195e = i4;
        this.f7196f = c0775d;
        this.f7197g = zVar;
        this.f7198h = lVar;
        this.f7199i = dVar;
        this.f7200j = cVar;
        this.f7201k = cVar2;
        this.f7202l = cVar3;
        this.f7203m = cVar4;
        this.f7204n = cVar5;
        this.f7205o = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7195e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f7205o | 1);
                Y1.c cVar = this.f7201k;
                Y1.c cVar2 = this.f7202l;
                AbstractC0416e.h(this.f7196f, this.f7197g, this.f7198h, this.f7199i, this.f7200j, cVar, cVar2, this.f7203m, this.f7204n, (C0113p) obj, T2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int T3 = C0089d.T(this.f7205o | 1);
                Y1.c cVar3 = this.f7201k;
                Y1.c cVar4 = this.f7202l;
                AbstractC0416e.h(this.f7196f, this.f7197g, this.f7198h, this.f7199i, this.f7200j, cVar3, cVar4, this.f7203m, this.f7204n, (C0113p) obj, T3);
                break;
            default:
                ((Number) obj2).intValue();
                int T4 = C0089d.T(this.f7205o | 1);
                Y1.c cVar5 = this.f7201k;
                Y1.c cVar6 = this.f7202l;
                AbstractC0416e.h(this.f7196f, this.f7197g, this.f7198h, this.f7199i, this.f7200j, cVar5, cVar6, this.f7203m, this.f7204n, (C0113p) obj, T4);
                break;
        }
        return L1.z.f2729a;
    }
}
