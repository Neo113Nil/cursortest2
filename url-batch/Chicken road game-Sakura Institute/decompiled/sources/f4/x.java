package f4;

import a0.x0;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.g1;
import g0.m2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.p1;
import w.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3353g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3354h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3355i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3356j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3357k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, Object obj3, h6.d dVar, int i7) {
        super(2, dVar);
        this.f3353g = i7;
        this.f3355i = obj;
        this.f3356j = obj2;
        this.f3357k = obj3;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f3353g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x xVar = new x((c0) this.f3355i, (String) this.f3356j, (String) this.f3357k, dVar, 0);
                xVar.f3354h = obj;
                return xVar;
            case 1:
                return new x((p1) this.f3354h, (Map) this.f3355i, (m2) this.f3356j, (u3.i) this.f3357k, dVar);
            default:
                x xVar2 = new x((l1.d0) this.f3355i, (n0) this.f3356j, (x0) this.f3357k, dVar, 2);
                xVar2.f3354h = obj;
                return xVar2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f3353g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x xVar = (x) create((k3.b) obj, (h6.d) obj2);
                d6.z zVar = d6.z.f2639a;
                xVar.invokeSuspend(zVar);
                return zVar;
            case 1:
                x xVar2 = (x) create((c7.x) obj, (h6.d) obj2);
                d6.z zVar2 = d6.z.f2639a;
                xVar2.invokeSuspend(zVar2);
                return zVar2;
            default:
                x xVar3 = (x) create((c7.x) obj, (h6.d) obj2);
                d6.z zVar3 = d6.z.f2639a;
                xVar3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3353g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                k3.b bVar = (k3.b) this.f3354h;
                c0 c0Var = (c0) this.f3355i;
                k3.d dVar = c0Var.f3306b;
                String str = (String) this.f3356j;
                bVar.getClass();
                r6.k.f(dVar, "key");
                bVar.c(dVar, str);
                String str2 = (String) this.f3357k;
                if (str2 != null && str2.length() != 0) {
                    k3.d dVar2 = c0Var.f3307c;
                    r6.k.f(dVar2, "key");
                    bVar.c(dVar2, str2);
                }
                break;
            case 1:
                Map map = (Map) this.f3355i;
                d6.a.e(obj);
                p1 p1Var = (p1) this.f3354h;
                Object a3 = p1Var.f5610a.a();
                g1 g1Var = p1Var.f5613d;
                if (r6.k.a(a3, g1Var.getValue())) {
                    List list = (List) ((m2) this.f3356j).getValue();
                    u3.i iVar = (u3.i) this.f3357k;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        iVar.b().b((t3.h) it.next());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!r6.k.a(entry.getKey(), ((t3.h) g1Var.getValue()).f8796k)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        map.remove(((Map.Entry) it2.next()).getKey());
                    }
                }
                break;
            default:
                d6.a.e(obj);
                c7.x xVar = (c7.x) this.f3354h;
                l1.d0 d0Var = (l1.d0) this.f3355i;
                h6.d dVar3 = null;
                w.w wVar = new w.w(d0Var, (n0) this.f3356j, dVar3, 0);
                c7.y yVar = c7.y.f1759i;
                c7.a0.p(xVar, null, yVar, wVar, 1);
                c7.a0.p(xVar, null, yVar, new a0.e0(d0Var, (x0) this.f3357k, dVar3, 27), 1);
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p1 p1Var, Map map, m2 m2Var, u3.i iVar, h6.d dVar) {
        super(2, dVar);
        this.f3353g = 1;
        this.f3354h = p1Var;
        this.f3355i = map;
        this.f3356j = m2Var;
        this.f3357k = iVar;
    }
}
