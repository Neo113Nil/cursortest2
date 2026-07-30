package w;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9253g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9254h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(a0.x0 x0Var, int i7) {
        super(1);
        this.f9253g = i7;
        this.f9254h = x0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f9253g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new c.g(7, this.f9254h);
            default:
                long j8 = ((y0.c) obj).f9778a;
                this.f9254h.o();
                return d6.z.f2639a;
        }
    }
}
