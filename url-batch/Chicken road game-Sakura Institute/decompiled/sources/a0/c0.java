package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f28g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.n0 f29h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(w.n0 n0Var, int i7) {
        super(1);
        this.f28g = i7;
        this.f29h = n0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f28g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l1.v vVar = (l1.v) obj;
                this.f29h.e(l1.t.f(vVar, false));
                vVar.a();
                break;
            default:
                this.f29h.c(((y0.c) obj).f9778a);
                break;
        }
        return d6.z.f2639a;
    }
}
