package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2118g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2119h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d6.e f2120i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(q6.a aVar, boolean z8) {
        super(0);
        this.f2119h = z8;
        this.f2120i = (r6.l) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [q6.a, r6.l] */
    @Override // q6.a
    public final Object a() {
        switch (this.f2118g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((q6.c) this.f2120i).f(Boolean.valueOf(!this.f2119h));
                break;
            default:
                if (this.f2119h) {
                    ((r6.l) this.f2120i).a();
                }
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q6.c cVar, boolean z8) {
        super(0);
        this.f2120i = cVar;
        this.f2119h = z8;
    }
}
