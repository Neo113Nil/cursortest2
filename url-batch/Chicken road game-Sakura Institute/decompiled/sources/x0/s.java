package x0;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f9636h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(r rVar, int i7) {
        super(0);
        this.f9635g = i7;
        this.f9636h = rVar;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f9635g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f9636h.A0();
                break;
            default:
                r rVar = this.f9636h;
                if (rVar.f8104f.f8116r) {
                    d.A(rVar);
                }
                break;
        }
        return z.f2639a;
    }
}
