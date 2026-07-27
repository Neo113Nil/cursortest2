package t1;

import G.C0205j0;
import G.X0;
import W2.InterfaceC0302y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.m0;
import s1.C1193i;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class y extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f10722k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f10723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X0 f10724m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f10725n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m0 m0Var, Map map, X0 x02, i iVar, C2.a aVar) {
        super(2, aVar);
        this.f10722k = m0Var;
        this.f10723l = map;
        this.f10724m = x02;
        this.f10725n = iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((y) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new y(this.f10722k, this.f10723l, this.f10724m, this.f10725n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        m0 m0Var = this.f10722k;
        Object l4 = m0Var.f7800a.l();
        C0205j0 c0205j0 = m0Var.f7803d;
        if (Intrinsics.a(l4, c0205j0.getValue())) {
            Iterator it = ((List) this.f10724m.getValue()).iterator();
            while (it.hasNext()) {
                this.f10725n.b().b((C1193i) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f10723l;
            for (Map.Entry entry : map.entrySet()) {
                if (!Intrinsics.a(entry.getKey(), ((C1193i) c0205j0.getValue()).f10514l)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return Unit.f7487a;
    }
}
