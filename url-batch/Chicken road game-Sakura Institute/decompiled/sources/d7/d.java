package d7;

import a0.y;
import b3.z;
import c7.r;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.m2;
import g0.z0;
import g4.i1;
import g4.j0;
import g4.n0;
import g4.p;
import g4.q;
import java.util.List;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements q6.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2644h;

    public /* synthetic */ d(Object obj, int i7, Object obj2) {
        this.f2642f = i7;
        this.f2643g = obj;
        this.f2644h = obj2;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f2642f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e eVar = (e) this.f2643g;
                eVar.f2645h.removeCallbacks((z) this.f2644h);
                break;
            case 1:
                List list = (List) this.f2643g;
                q6.c cVar = (q6.c) this.f2644h;
                r.e eVar2 = (r.e) obj;
                k.f(eVar2, "$this$LazyColumn");
                eVar2.a(list.size(), new y(new r(3), 12, list), new p(0, list), new o0.a(-632812321, new q(list, cVar, 0), true));
                break;
            case 2:
                m2 m2Var = (m2) this.f2643g;
                j0 j0Var = (j0) this.f2644h;
                r.e eVar3 = (r.e) obj;
                k.f(eVar3, "$this$LazyColumn");
                List list2 = (List) m2Var.getValue();
                eVar3.a(list2.size(), new y(new r(4), 13, list2), new p(1, list2), new o0.a(-632812321, new q(list2, j0Var, 1), true));
                break;
            default:
                m2 m2Var2 = (m2) this.f2643g;
                z0 z0Var = (z0) this.f2644h;
                r.e eVar4 = (r.e) obj;
                k.f(eVar4, "$this$LazyColumn");
                List list3 = i1.f4316b;
                eVar4.a(list3.size(), null, new p(3, list3), new o0.a(-1091073711, new n0(list3, m2Var2, z0Var), true));
                break;
        }
        return d6.z.f2639a;
    }
}
