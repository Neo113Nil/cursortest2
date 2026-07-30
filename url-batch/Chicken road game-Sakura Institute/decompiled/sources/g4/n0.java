package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.Meal;
import d0.d3;
import g0.m2;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 extends r6.l implements q6.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4347i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4348j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, g0.z0 z0Var, Object obj2, int i7) {
        super(4);
        this.f4345g = i7;
        this.f4346h = obj;
        this.f4347i = z0Var;
        this.f4348j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // q6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        t3.h hVar;
        switch (this.f4345g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r.b bVar = (r.b) obj;
                int intValue = ((Number) obj2).intValue();
                g0.p pVar = (g0.p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i7 = (pVar.f(bVar) ? 4 : 2) | intValue2;
                } else {
                    i7 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i7 |= pVar.d(intValue) ? 32 : 16;
                }
                if ((i7 & 147) == 146 && pVar.x()) {
                    pVar.L();
                } else {
                    Meal meal = (Meal) ((List) this.f4346h).get(intValue);
                    pVar.Q(-1728904272);
                    s0.o b9 = androidx.compose.foundation.layout.c.b(s0.l.f8103a, 1.0f);
                    pVar.Q(636965465);
                    boolean f9 = pVar.f(meal);
                    Object G = pVar.G();
                    if (f9 || G == g0.l.f3784a) {
                        G = new o(meal, 1, this.f4347i);
                        pVar.a0(G);
                    }
                    pVar.p(false);
                    d3.c(androidx.compose.foundation.a.d(b9, false, null, (q6.a) G, 7), null, null, null, o0.f.b(332683893, new d((q0) this.f4348j, 3, meal), pVar), pVar, 196608);
                    pVar.p(false);
                }
                break;
            case 1:
                r.b bVar2 = (r.b) obj;
                int intValue3 = ((Number) obj2).intValue();
                g0.p pVar2 = (g0.p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i8 = (pVar2.f(bVar2) ? 4 : 2) | intValue4;
                } else {
                    i8 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i8 |= pVar2.d(intValue3) ? 32 : 16;
                }
                if ((i8 & 147) == 146 && pVar2.x()) {
                    pVar2.L();
                } else {
                    String str = (String) ((List) this.f4346h).get(intValue3);
                    pVar2.Q(-1785635426);
                    d3.c(androidx.compose.foundation.layout.c.b(s0.l.f8103a, 1.0f), null, null, null, o0.f.b(-298487303, new a1(str, intValue3, (m2) this.f4348j, this.f4347i), pVar2), pVar2, 196614);
                    pVar2.p(false);
                }
                break;
            default:
                k.i iVar = (k.i) obj;
                t3.h hVar2 = (t3.h) obj2;
                g0.p pVar3 = (g0.p) obj3;
                ((Number) obj4).intValue();
                if (!((Boolean) this.f4347i.getValue()).booleanValue()) {
                    List list = (List) ((m2) this.f4348j).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            hVar = listIterator.previous();
                            if (r6.k.a(hVar2, (t3.h) hVar)) {
                            }
                        } else {
                            hVar = 0;
                        }
                    }
                    hVar2 = hVar;
                }
                if (hVar2 != null) {
                    u3.q.a(hVar2, (p0.c) this.f4346h, o0.f.b(-1263531443, new d0.b0(hVar2, 20, iVar), pVar3), pVar3, 384);
                }
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(List list, m2 m2Var, g0.z0 z0Var) {
        super(4);
        this.f4345g = 1;
        this.f4346h = list;
        this.f4348j = m2Var;
        this.f4347i = z0Var;
    }
}
