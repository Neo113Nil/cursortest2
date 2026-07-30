package u3;

import c7.a0;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.z0;
import java.util.List;
import java.util.Set;
import l1.d0;
import w.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9002g = 0;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9003h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9004i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9005j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z0 z0Var, p pVar, q0.q qVar, h6.d dVar) {
        super(2, dVar);
        this.f9003h = z0Var;
        this.f9004i = pVar;
        this.f9005j = qVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f9002g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new l((z0) this.f9003h, (p) this.f9004i, (q0.q) this.f9005j, dVar);
            default:
                l lVar = new l((d0) this.f9004i, (n0) this.f9005j, dVar);
                lVar.f9003h = obj;
                return lVar;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f9002g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l lVar = (l) create(xVar, dVar);
                d6.z zVar = d6.z.f2639a;
                lVar.invokeSuspend(zVar);
                return zVar;
            default:
                return ((l) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9002g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                Set<t3.h> set = (Set) ((z0) this.f9003h).getValue();
                p pVar = (p) this.f9004i;
                q0.q qVar = (q0.q) this.f9005j;
                for (t3.h hVar : set) {
                    if (!((List) pVar.b().f8815e.f3566f.getValue()).contains(hVar) && !qVar.contains(hVar)) {
                        pVar.b().b(hVar);
                    }
                }
                return d6.z.f2639a;
            default:
                d6.a.e(obj);
                c7.x xVar = (c7.x) this.f9003h;
                d0 d0Var = (d0) this.f9004i;
                n0 n0Var = (n0) this.f9005j;
                h6.d dVar = null;
                w.w wVar = new w.w(d0Var, n0Var, dVar, 1);
                c7.y yVar = c7.y.f1759i;
                a0.p(xVar, null, yVar, wVar, 1);
                return a0.p(xVar, null, yVar, new w.w(d0Var, n0Var, dVar, 2), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d0 d0Var, n0 n0Var, h6.d dVar) {
        super(2, dVar);
        this.f9004i = d0Var;
        this.f9005j = n0Var;
    }
}
