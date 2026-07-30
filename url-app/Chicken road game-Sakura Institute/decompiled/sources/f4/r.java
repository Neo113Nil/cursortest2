package f4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements q6.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f3345f;

    public r(c7.x xVar, InstallReferrerClient installReferrerClient) {
        this.f3345f = installReferrerClient;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        try {
            this.f3345f.endConnection();
        } catch (Throwable th) {
            d6.a.b(th);
        }
        return d6.z.f2639a;
    }
}
