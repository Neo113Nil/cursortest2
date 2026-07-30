package l1;

import com.android.installreferrer.api.InstallReferrerClient;
import r1.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5821g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r6.r f5822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x xVar, v0.c cVar, r6.r rVar) {
        super(1);
        this.f5822h = rVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5821g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!((p) obj).f5824s) {
                    break;
                } else {
                    this.f5822h.f7964f = false;
                    break;
                }
            default:
                if (!((v0.c) obj).f8116r) {
                    break;
                } else {
                    r6.r rVar = this.f5822h;
                    rVar.f7964f = rVar.f7964f;
                    break;
                }
        }
        return p1.f7876f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r6.r rVar) {
        super(1);
        this.f5822h = rVar;
    }
}
