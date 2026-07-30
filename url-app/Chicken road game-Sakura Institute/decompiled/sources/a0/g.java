package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f65g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f66h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f67i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f69k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s0.o oVar, q6.a aVar, boolean z8, int i7) {
        super(2);
        this.f68j = oVar;
        this.f69k = aVar;
        this.f66h = z8;
        this.f67i = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f65g;
        g0.p pVar = (g0.p) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a.a.f((s0.o) this.f68j, (q6.a) this.f69k, this.f66h, pVar, g0.d.T(this.f67i | 1));
                break;
            default:
                a8.d.k(this.f66h, (l2.h) this.f68j, (x0) this.f69k, pVar, g0.d.T(this.f67i | 1));
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z8, l2.h hVar, x0 x0Var, int i7) {
        super(2);
        this.f66h = z8;
        this.f68j = hVar;
        this.f69k = x0Var;
        this.f67i = i7;
    }
}
