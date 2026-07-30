package l;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1 f5656h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(p1 p1Var, int i7) {
        super(1);
        this.f5655g = i7;
        this.f5656h = p1Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5655g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new r1(this.f5656h, 0);
            default:
                return new r1(this.f5656h, 1);
        }
    }
}
