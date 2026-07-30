package t3;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f8855h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(s sVar, int i7) {
        super(1);
        this.f8854g = i7;
        this.f8855h = sVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f8854g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.k.f((String) obj, "key");
                return Boolean.valueOf(!this.f8855h.c().contains(r2));
            default:
                r6.k.f((String) obj, "key");
                return Boolean.valueOf(!this.f8855h.c().contains(r2));
        }
    }
}
