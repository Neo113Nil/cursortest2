package e4;

import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.RootActivity;
import d0.x3;
import d6.z;
import f4.t;
import f4.u;
import f4.v;
import f4.w;
import g0.d;
import g0.g1;
import g0.l;
import g0.p;
import g4.h1;
import java.util.List;
import o0.f;
import q6.e;
import r6.k;
import s0.o;
import u3.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2751h;

    public /* synthetic */ c(Object obj, int i7, Object obj2) {
        this.f2749f = i7;
        this.f2750g = obj;
        this.f2751h = obj2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f2749f;
        Object obj3 = l.f3784a;
        z zVar = z.f2639a;
        int i8 = 0;
        Object obj4 = this.f2750g;
        Object obj5 = this.f2751h;
        int i9 = 2;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = (p) obj;
                RootActivity rootActivity = (RootActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    int i10 = RootActivity.f1765z;
                    w wVar = (w) ((g1) obj5).getValue();
                    if (wVar instanceof v) {
                        pVar.Q(-194081706);
                        a.a.a(0, pVar);
                        pVar.p(false);
                    } else if (wVar instanceof u) {
                        pVar.Q(-194079749);
                        pVar.Q(-194079098);
                        boolean f9 = pVar.f(rootActivity) | pVar.h(wVar);
                        Object G = pVar.G();
                        if (f9 || G == obj3) {
                            G = new androidx.lifecycle.p(rootActivity, (u) wVar, null, i9);
                            pVar.a0(G);
                        }
                        pVar.p(false);
                        d.e(pVar, zVar, (e) G);
                        pVar.p(false);
                    } else {
                        if (!k.a(wVar, t.f3349a)) {
                            pVar.Q(-194083526);
                            pVar.p(false);
                            throw new b4.c();
                        }
                        pVar.Q(-194072942);
                        t6.a.a(0, pVar);
                        pVar.p(false);
                    }
                }
                return zVar;
            case 1:
                p pVar2 = (p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    h1.a(f.b(1855963944, new c((RootActivity) obj4, i8, (g1) obj5), pVar2), pVar2, 6);
                }
                return zVar;
            default:
                p pVar3 = (p) obj;
                Object obj6 = (q6.c) obj5;
                List list = (List) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                } else if (list.isEmpty()) {
                    pVar3.Q(-1610528813);
                    x3.b(q.j(R.string.meals_empty, pVar3), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar3, 0, 0, 131070);
                    pVar3.p(false);
                } else {
                    pVar3.Q(-1610429582);
                    int i11 = 1;
                    o e9 = androidx.compose.foundation.layout.c.e(s0.l.f8103a, 0.0f, 360, 1);
                    pVar3.Q(1472073220);
                    boolean h3 = pVar3.h(list) | pVar3.f(obj6);
                    Object G2 = pVar3.G();
                    if (h3 || G2 == obj3) {
                        G2 = new d7.d(list, i11, obj6);
                        pVar3.a0(G2);
                    }
                    pVar3.p(false);
                    r4.a.e(6, 254, pVar3, null, null, null, (q6.c) G2, null, null, e9, false);
                    pVar3.p(false);
                }
                return zVar;
        }
    }
}
