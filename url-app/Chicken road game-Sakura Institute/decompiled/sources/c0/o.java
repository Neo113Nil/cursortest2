package c0;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0 f1493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(z0 z0Var, int i7) {
        super(0);
        this.f1492g = i7;
        this.f1493h = z0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f1492g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (f) this.f1493h.getValue();
            case 1:
                return new r.e((q6.c) this.f1493h.getValue());
            case 2:
                return (r.h) ((q6.a) this.f1493h.getValue()).a();
            default:
                Boolean bool = (Boolean) this.f1493h.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
