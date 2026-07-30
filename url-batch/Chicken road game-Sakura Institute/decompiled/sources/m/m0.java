package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0 f6208h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(n0 n0Var, int i7) {
        super(0);
        this.f6207g = i7;
        this.f6208h = n0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f6207g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.p pVar = (p1.p) this.f6208h.f6217y.getValue();
                return new y0.c(pVar != null ? pVar.W(0L) : 9205357640488583168L);
            case 1:
                return new y0.c(this.f6208h.A);
            default:
                this.f6208h.C0();
                return d6.z.f2639a;
        }
    }
}
