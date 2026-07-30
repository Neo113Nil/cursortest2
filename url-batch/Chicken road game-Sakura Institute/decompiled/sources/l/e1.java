package l;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f5470h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(l lVar, int i7) {
        super(0);
        this.f5469g = i7;
        this.f5470h = lVar;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f5469g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f5470h.f5567k = false;
                break;
            default:
                this.f5470h.f5567k = false;
                break;
        }
        return d6.z.f2639a;
    }
}
