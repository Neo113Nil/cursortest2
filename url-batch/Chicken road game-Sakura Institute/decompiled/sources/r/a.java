package r;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import q.h0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7582g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0.o f7583h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f7584i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f7585j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o.k f7586k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f7587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0.e f7588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q.h f7589n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q6.c f7590o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7591p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7592q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s0.o oVar, s sVar, h0 h0Var, o.k kVar, boolean z8, s0.e eVar, q.h hVar, q6.c cVar, int i7, int i8) {
        super(2);
        this.f7583h = oVar;
        this.f7584i = sVar;
        this.f7585j = h0Var;
        this.f7586k = kVar;
        this.f7587l = z8;
        this.f7588m = eVar;
        this.f7589n = hVar;
        this.f7590o = cVar;
        this.f7591p = i7;
        this.f7592q = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f7582g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                r4.a.e(g0.d.T(this.f7591p | 1), this.f7592q, (g0.p) obj, this.f7586k, this.f7589n, this.f7585j, this.f7590o, this.f7584i, this.f7588m, this.f7583h, this.f7587l);
                break;
            default:
                ((Number) obj2).intValue();
                t6.a.f(g0.d.T(this.f7591p | 1), g0.d.T(this.f7592q), (g0.p) obj, this.f7586k, this.f7589n, this.f7585j, this.f7590o, this.f7584i, this.f7588m, this.f7583h, this.f7587l);
                break;
        }
        return z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s0.o oVar, s sVar, h0 h0Var, q.h hVar, s0.e eVar, o.k kVar, boolean z8, q6.c cVar, int i7, int i8) {
        super(2);
        this.f7583h = oVar;
        this.f7584i = sVar;
        this.f7585j = h0Var;
        this.f7589n = hVar;
        this.f7588m = eVar;
        this.f7586k = kVar;
        this.f7587l = z8;
        this.f7590o = cVar;
        this.f7591p = i7;
        this.f7592q = i8;
    }
}
