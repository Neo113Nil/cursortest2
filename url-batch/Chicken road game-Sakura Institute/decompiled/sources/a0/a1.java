package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n.j f12h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f13i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(n.j jVar, x0 x0Var, int i7) {
        super(0);
        this.f11g = i7;
        this.f12h = jVar;
        this.f13i = x0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f11g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f13i.d();
                this.f12h.f6493a.setValue(n.g.f6491a);
                break;
            case 1:
                this.f13i.b(false);
                this.f12h.f6493a.setValue(n.g.f6491a);
                break;
            case 2:
                this.f13i.l();
                this.f12h.f6493a.setValue(n.g.f6491a);
                break;
            default:
                this.f13i.m();
                this.f12h.f6493a.setValue(n.g.f6491a);
                break;
        }
        return d6.z.f2639a;
    }
}
