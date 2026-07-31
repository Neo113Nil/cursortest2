package w5;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z extends y {
    public static final <K, V> Map<K, V> d() {
        return t.f23036f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        kotlin.jvm.internal.i.d(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : y.c(map) : d();
    }

    public static final <K, V> void f(Map<? super K, ? super V> map, Iterable<? extends v5.j<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.i.d(map, "<this>");
        kotlin.jvm.internal.i.d(iterable, "pairs");
        for (v5.j<? extends K, ? extends V> jVar : iterable) {
            map.put(jVar.a(), jVar.b());
        }
    }

    public static <K, V> Map<K, V> g(Iterable<? extends v5.j<? extends K, ? extends V>> iterable) {
        int a7;
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size == 1) {
            return y.b(iterable instanceof List ? (v5.j<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
        }
        a7 = y.a(collection.size());
        return h(iterable, new LinkedHashMap(a7));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h(Iterable<? extends v5.j<? extends K, ? extends V>> iterable, M m7) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(m7, "destination");
        f(m7, iterable);
        return m7;
    }
}
