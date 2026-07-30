package S;

import a.AbstractC0169a;
import e6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.H;
import kotlin.collections.I;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends X5.j implements n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ R.e f2453d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ T.b f2454e;

    @Override // e6.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k kVar = new k(3, (V5.b) obj3);
        kVar.f2453d = (R.e) obj;
        kVar.f2454e = (T.b) obj2;
        return kVar.invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        R.e eVar = this.f2453d;
        T.b bVar = this.f2454e;
        Set keySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(s.g(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((T.d) it.next()).f2555a);
        }
        Map<String, ?> all = eVar.f2368a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = eVar.f2369b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(H.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.C((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        T.b bVar2 = new T.b(I.j(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                T.d key3 = AbstractC0169a.a(name);
                Intrinsics.checkNotNullParameter(key3, "key");
                bVar2.f(key3, value2);
            } else if (value2 instanceof Float) {
                Intrinsics.checkNotNullParameter(name, "name");
                T.d key4 = new T.d(name);
                Intrinsics.checkNotNullParameter(key4, "key");
                bVar2.f(key4, value2);
            } else if (value2 instanceof Integer) {
                Intrinsics.checkNotNullParameter(name, "name");
                T.d key5 = new T.d(name);
                Intrinsics.checkNotNullParameter(key5, "key");
                bVar2.f(key5, value2);
            } else if (value2 instanceof Long) {
                T.d key6 = AbstractC0169a.q(name);
                Intrinsics.checkNotNullParameter(key6, "key");
                bVar2.f(key6, value2);
            } else if (value2 instanceof String) {
                T.d key7 = AbstractC0169a.E(name);
                Intrinsics.checkNotNullParameter(key7, "key");
                bVar2.f(key7, value2);
            } else if (value2 instanceof Set) {
                T.d key8 = AbstractC0169a.F(name);
                Intrinsics.c(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                Intrinsics.checkNotNullParameter(key8, "key");
                bVar2.f(key8, (Set) value2);
            }
        }
        return new T.b(I.j(bVar2.a()), true);
    }
}
