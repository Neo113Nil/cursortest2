package a4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.collections.z;
import vd.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends nd.i implements n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ z3.d f283d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ b4.a f284e;

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        k kVar = new k(3, (ld.a) obj3);
        kVar.f283d = (z3.d) obj;
        kVar.f284e = (b4.a) obj2;
        return kVar.invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        cf.c.M(obj);
        z3.d dVar = this.f283d;
        b4.a aVar2 = this.f284e;
        Set keySet = aVar2.a().keySet();
        ArrayList arrayList = new ArrayList(z.j(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((b4.c) it.next()).f1098a);
        }
        Map<String, ?> all = dVar.f10701a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = dVar.f10702b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(o0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.T((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        b4.a aVar3 = new b4.a(new LinkedHashMap(aVar2.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                aVar3.d(new b4.c(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                aVar3.d(new b4.c(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                aVar3.d(new b4.c(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                aVar3.d(new b4.c(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                aVar3.d(new b4.c(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                aVar3.d(new b4.c(str), (Set) value2);
            }
        }
        return new b4.a(new LinkedHashMap(aVar3.a()), true);
    }
}
