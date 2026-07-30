package S;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.s;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f2456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Set set, V5.b bVar) {
        super(2, bVar);
        this.f2456e = set;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        l lVar = new l(this.f2456e, bVar);
        lVar.f2455d = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        Set keySet = ((T.b) this.f2455d).a().keySet();
        ArrayList arrayList = new ArrayList(s.g(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((T.d) it.next()).f2555a);
        }
        LinkedHashSet linkedHashSet = m.f2457a;
        boolean z7 = true;
        Set set = this.f2456e;
        if (set != linkedHashSet) {
            if (set == null || !set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
            }
            z7 = false;
        }
        return Boolean.valueOf(z7);
    }
}
