package r1;

import I.C0102j0;
import I.X0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k2.InterfaceC0550w;
import m.s0;
import q1.C0784h;

/* loaded from: classes.dex */
public final class z extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f7291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f7292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X0 f7293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0857i f7294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s0 s0Var, Map map, X0 x02, C0857i c0857i, P1.d dVar) {
        super(2, dVar);
        this.f7291e = s0Var;
        this.f7292f = map;
        this.f7293g = x02;
        this.f7294h = c0857i;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new z(this.f7291e, this.f7292f, this.f7293g, this.f7294h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        z zVar = (z) create((InterfaceC0550w) obj, (P1.d) obj2);
        L1.z zVar2 = L1.z.f2729a;
        zVar.invokeSuspend(zVar2);
        return zVar2;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        s0 s0Var = this.f7291e;
        Object a3 = s0Var.f5841a.a();
        C0102j0 c0102j0 = s0Var.f5844d;
        if (Z1.i.a(a3, c0102j0.getValue())) {
            Iterator it = ((List) this.f7293g.getValue()).iterator();
            while (it.hasNext()) {
                this.f7294h.b().b((C0784h) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f7292f;
            for (Map.Entry entry : map.entrySet()) {
                if (!Z1.i.a(entry.getKey(), ((C0784h) c0102j0.getValue()).f6899i)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return L1.z.f2729a;
    }
}
