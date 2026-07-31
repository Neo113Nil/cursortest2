package u1;

import I.C0156j0;
import I.W0;
import e2.InterfaceC0426e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m.l0;
import q2.InterfaceC0835w;
import t1.C1028h;

/* loaded from: classes.dex */
public final class z extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0 f9664h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Map f9665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W0 f9666j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f9667k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l0 l0Var, Map map, W0 w02, i iVar, V1.d dVar) {
        super(2, dVar);
        this.f9664h = l0Var;
        this.f9665i = map;
        this.f9666j = w02;
        this.f9667k = iVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        z zVar = (z) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        zVar.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new z(this.f9664h, this.f9665i, this.f9666j, this.f9667k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        l0 l0Var = this.f9664h;
        Object a3 = l0Var.f6836a.a();
        C0156j0 c0156j0 = l0Var.f6839d;
        if (f2.j.a(a3, c0156j0.getValue())) {
            Iterator it = ((List) this.f9666j.getValue()).iterator();
            while (it.hasNext()) {
                this.f9667k.b().b((C1028h) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f9665i;
            for (Map.Entry entry : map.entrySet()) {
                if (!f2.j.a(entry.getKey(), ((C1028h) c0156j0.getValue()).f8878i)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return R1.y.f4171a;
    }
}
