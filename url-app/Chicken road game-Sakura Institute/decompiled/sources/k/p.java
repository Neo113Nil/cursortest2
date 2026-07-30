package k;

import com.android.installreferrer.api.InstallReferrerClient;
import l.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1 f5255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(p1 p1Var, int i7) {
        super(0);
        this.f5254g = i7;
        this.f5255h = p1Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f5254g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1 p1Var = this.f5255h;
                Object a3 = p1Var.f5610a.a();
                w wVar = w.f5280h;
                return Boolean.valueOf(a3 == wVar && p1Var.f5613d.getValue() == wVar);
            default:
                return Long.valueOf(this.f5255h.b());
        }
    }
}
