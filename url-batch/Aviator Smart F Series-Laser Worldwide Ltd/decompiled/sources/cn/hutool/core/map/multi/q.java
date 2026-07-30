package cn.hutool.core.map.multi;

import cn.hutool.core.collection.n0;
import cn.hutool.core.lang.l0;
import cn.hutool.core.map.h1;
import cn.hutool.core.map.multi.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static Set a(r rVar) {
        return (Set) l0.ofNullable(rVar.columnMap()).map(new l()).get();
    }

    public static List b(r rVar) {
        Map<Object, Map<Object, Object>> columnMap = rVar.columnMap();
        if (h1.isEmpty(columnMap)) {
            return n0.empty();
        }
        ArrayList arrayList = new ArrayList(columnMap.size());
        Iterator<Map.Entry<Object, Map<Object, Object>>> it = columnMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public static boolean c(r rVar, Object obj, final Object obj2) {
        return ((Boolean) l0.ofNullable(rVar.getRow(obj)).map(new Function() { // from class: cn.hutool.core.map.multi.j
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Map) obj3).containsKey(obj2));
                return valueOf;
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    public static boolean d(r rVar, final Object obj) {
        return ((Boolean) l0.ofNullable(rVar.columnMap()).map(new Function() { // from class: cn.hutool.core.map.multi.k
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Map) obj2).containsKey(obj));
                return valueOf;
            }
        }).get()).booleanValue();
    }

    public static boolean e(r rVar, final Object obj) {
        return ((Boolean) l0.ofNullable(rVar.rowMap()).map(new Function() { // from class: cn.hutool.core.map.multi.p
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Map) obj2).containsKey(obj));
                return valueOf;
            }
        }).get()).booleanValue();
    }

    public static boolean f(r rVar, Object obj) {
        Collection collection = (Collection) l0.ofNullable(rVar.rowMap()).map(new cn.hutool.core.map.m()).get();
        if (collection == null) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void g(r rVar, m.a aVar) {
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            r.a aVar2 = (r.a) it.next();
            aVar.a(aVar2.getRowKey(), aVar2.getColumnKey(), aVar2.getValue());
        }
    }

    public static Object h(r rVar, Object obj, final Object obj2) {
        return l0.ofNullable(rVar.getRow(obj)).map(new Function() { // from class: cn.hutool.core.map.multi.m
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                Object obj4;
                obj4 = ((Map) obj3).get(obj2);
                return obj4;
            }
        }).get();
    }

    public static Map i(r rVar, final Object obj) {
        return (Map) l0.ofNullable(rVar.columnMap()).map(new Function() { // from class: cn.hutool.core.map.multi.o
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return q.r(obj, (Map) obj2);
            }
        }).get();
    }

    public static Map j(r rVar, final Object obj) {
        return (Map) l0.ofNullable(rVar.rowMap()).map(new Function() { // from class: cn.hutool.core.map.multi.n
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return q.s(obj, (Map) obj2);
            }
        }).get();
    }

    public static void k(r rVar, r rVar2) {
        if (rVar2 != null) {
            for (r.a aVar : rVar2.cellSet()) {
                rVar.put(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
            }
        }
    }

    public static Set l(r rVar) {
        return (Set) l0.ofNullable(rVar.rowMap()).map(new l()).get();
    }

    public static int m(r rVar) {
        Map<Object, Map<Object, Object>> rowMap = rVar.rowMap();
        int i8 = 0;
        if (h1.isEmpty(rowMap)) {
            return 0;
        }
        Iterator<Map<Object, Object>> it = rowMap.values().iterator();
        while (it.hasNext()) {
            i8 += it.next().size();
        }
        return i8;
    }

    public static /* synthetic */ Map r(Object obj, Map map) {
        return (Map) map.get(obj);
    }

    public static /* synthetic */ Map s(Object obj, Map map) {
        return (Map) map.get(obj);
    }
}
