package k;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.c f5174h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(q6.c cVar, int i7) {
        super(1);
        this.f5173g = i7;
        this.f5174h = cVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7;
        switch (this.f5173g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j8 = ((m2.j) obj).f6321a;
                return new m2.j(j1.c.G(((Number) this.f5174h.f(Integer.valueOf((int) (j8 >> 32)))).intValue(), (int) (j8 & 4294967295L)));
            case 1:
                long j9 = ((m2.j) obj).f6321a;
                return new m2.j(j1.c.G(((Number) this.f5174h.f(Integer.valueOf((int) (j9 >> 32)))).intValue(), (int) (j9 & 4294967295L)));
            default:
                q0.l lVar = (q0.l) obj;
                synchronized (q0.n.f7427b) {
                    i7 = q0.n.f7429d;
                    q0.n.f7429d = i7 + 1;
                }
                return new q0.f(i7, lVar, this.f5174h);
        }
    }
}
