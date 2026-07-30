package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6126g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f6127h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(d1 d1Var, int i7) {
        super(0);
        this.f6126g = i7;
        this.f6127h = d1Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f6126g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Float.valueOf(this.f6127h.f6132s.f6159a.e());
            default:
                return Float.valueOf(this.f6127h.f6132s.f6162d.e());
        }
    }
}
