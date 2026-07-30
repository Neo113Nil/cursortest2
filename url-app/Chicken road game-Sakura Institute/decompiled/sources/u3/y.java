package u3;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.z0;
import k.h0;
import k.i0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f9047h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.c f9048i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q6.c f9049j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z0 f9050k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(i iVar, q6.c cVar, q6.c cVar2, z0 z0Var, int i7) {
        super(1);
        this.f9046g = i7;
        this.f9047h = iVar;
        this.f9048i = cVar;
        this.f9049j = cVar2;
        this.f9050k = z0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f9046g;
        q6.c cVar = this.f9048i;
        q6.c cVar2 = this.f9049j;
        z0 z0Var = this.f9050k;
        i iVar = this.f9047h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.m mVar = (k.m) obj;
                t3.v vVar = ((t3.h) mVar.c()).f8792g;
                r6.k.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                h hVar = (h) vVar;
                if (((Boolean) iVar.f8994c.getValue()).booleanValue() || z.c(z0Var)) {
                    int i8 = t3.v.f8856n;
                    for (t3.v vVar2 : r4.a.E(hVar)) {
                    }
                    return (h0) cVar.f(mVar);
                }
                int i9 = t3.v.f8856n;
                for (t3.v vVar3 : r4.a.E(hVar)) {
                }
                return (h0) cVar2.f(mVar);
            default:
                k.m mVar2 = (k.m) obj;
                t3.v vVar4 = ((t3.h) mVar2.b()).f8792g;
                r6.k.d(vVar4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                h hVar2 = (h) vVar4;
                if (((Boolean) iVar.f8994c.getValue()).booleanValue() || z.c(z0Var)) {
                    int i10 = t3.v.f8856n;
                    for (t3.v vVar5 : r4.a.E(hVar2)) {
                    }
                    return (i0) cVar.f(mVar2);
                }
                int i11 = t3.v.f8856n;
                for (t3.v vVar6 : r4.a.E(hVar2)) {
                }
                return (i0) cVar2.f(mVar2);
        }
    }
}
