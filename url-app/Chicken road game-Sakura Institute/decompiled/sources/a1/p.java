package a1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f264h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i7) {
        super(1);
        this.f263g = i7;
        this.f264h = qVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f263g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f264h.f276n.d(v1.g.c(doubleValue, r10.f267e, r10.f268f)));
            default:
                return Double.valueOf(v1.g.c(this.f264h.f273k.d(((Number) obj).doubleValue()), r10.f267e, r10.f268f));
        }
    }
}
