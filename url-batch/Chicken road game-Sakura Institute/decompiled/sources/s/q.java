package s;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8049g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8050h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8051i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8052j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8053k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f8054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj, int i7, v vVar, o0.a aVar, int i8) {
        super(2);
        this.f8050h = obj;
        this.f8051i = i7;
        this.f8053k = vVar;
        this.f8054l = aVar;
        this.f8052j = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f8049g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                r.h hVar = (r.h) this.f8053k;
                a8.m.f(hVar, this.f8050h, this.f8051i, this.f8054l, (g0.p) obj, g0.d.T(this.f8052j | 1));
                break;
            default:
                ((Number) obj2).intValue();
                v vVar = (v) this.f8053k;
                o0.a aVar = (o0.a) this.f8054l;
                t6.a.e(this.f8050h, this.f8051i, vVar, aVar, (g0.p) obj, g0.d.T(this.f8052j | 1));
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r.h hVar, Object obj, int i7, Object obj2, int i8) {
        super(2);
        this.f8053k = hVar;
        this.f8050h = obj;
        this.f8051i = i7;
        this.f8054l = obj2;
        this.f8052j = i8;
    }
}
