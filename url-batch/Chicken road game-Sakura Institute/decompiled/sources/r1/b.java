package r1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f7711h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i7) {
        super(0);
        this.f7710g = i7;
        this.f7711h = cVar;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f7710g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f7711h.C0();
                break;
            default:
                c cVar = this.f7711h;
                s0.m mVar = cVar.f7714s;
                r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((q1.c) mVar).g(cVar);
                break;
        }
        return d6.z.f2639a;
    }
}
