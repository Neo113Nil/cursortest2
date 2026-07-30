package f4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements f7.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f7.f f3294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f3295h;

    public /* synthetic */ a0(f7.f fVar, c0 c0Var, int i7) {
        this.f3293f = i7;
        this.f3294g = fVar;
        this.f3295h = c0Var;
    }

    @Override // f7.f
    public final Object b(f7.g gVar, h6.d dVar) {
        switch (this.f3293f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object b9 = this.f3294g.b(new z(gVar, this.f3295h, 0), dVar);
                if (b9 != i6.a.f4956f) {
                    break;
                }
                break;
            default:
                Object b10 = this.f3294g.b(new z(gVar, this.f3295h, 1), dVar);
                if (b10 != i6.a.f4956f) {
                    break;
                }
                break;
        }
        return d6.z.f2639a;
    }
}
