package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ha1 extends sf1 implements s30 {
    public /* synthetic */ ka1 i;
    public /* synthetic */ qn0 j;

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        ha1 ha1Var = new ha1(3, (dn) obj3);
        ha1Var.i = (ka1) obj;
        ha1Var.j = (qn0) obj2;
        return ha1Var.k(Unit.a);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        ca0.v(obj);
        ka1 ka1Var = this.i;
        qn0 qn0Var = this.j;
        Set keySet = qn0Var.a().keySet();
        ArrayList arrayList = new ArrayList(ai.h(keySet));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((hy0) it.next()).a);
        }
        Map<String, ?> all = ka1Var.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = ka1Var.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(hk0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.A((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        qn0 qn0Var2 = new qn0(new LinkedHashMap(qn0Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                qn0Var2.e(new hy0(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                qn0Var2.e(new hy0(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                qn0Var2.e(new hy0(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                qn0Var2.e(new hy0(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                qn0Var2.e(new hy0(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                qn0Var2.e(new hy0(str), (Set) value2);
            }
        }
        return new qn0(new LinkedHashMap(qn0Var2.a()), true);
    }
}
