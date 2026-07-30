package cn.hutool.core.collection;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.text.StrJoiner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public class k0 {
    public static <E> Iterable<E> asIterable(final Iterator<E> it) {
        return new Iterable() { // from class: cn.hutool.core.collection.j0
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator lambda$asIterable$3;
                lambda$asIterable$3 = k0.lambda$asIterable$3(it);
                return lambda$asIterable$3;
            }
        };
    }

    public static <E> Iterator<E> asIterator(Enumeration<E> enumeration) {
        return new EnumerationIter(enumeration);
    }

    public static void clear(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
    }

    public static <T> Map<T, Integer> countMap(Iterator<T> it) {
        Object orDefault;
        HashMap hashMap = new HashMap();
        if (it != null) {
            while (it.hasNext()) {
                T next = it.next();
                orDefault = hashMap.getOrDefault(next, 0);
                hashMap.put(next, Integer.valueOf(((Integer) orDefault).intValue() + 1));
            }
        }
        return hashMap;
    }

    public static <T> List<T> edit(Iterable<T> iterable, cn.hutool.core.lang.z zVar) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return arrayList;
        }
        for (Object obj : iterable) {
            if (zVar != null) {
                obj = zVar.edit(obj);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> Iterator<T> empty() {
        return Collections.emptyIterator();
    }

    public static <K, V> Map<K, V> fieldValueAsMap(Iterator<?> it, String str, String str2) {
        return toMap(it, new HashMap(), new a0(str), new b0(str2));
    }

    public static <V> List<Object> fieldValueList(Iterable<V> iterable, String str) {
        return fieldValueList(getIter((Iterable) iterable), str);
    }

    public static <K, V> Map<K, V> fieldValueMap(Iterator<V> it, String str) {
        return toMap(it, new HashMap(), new f0(str));
    }

    public static <T extends Iterable<E>, E> T filter(T t7, cn.hutool.core.lang.a0 a0Var) {
        if (t7 == null) {
            return null;
        }
        filter(t7.iterator(), a0Var);
        return t7;
    }

    public static <E> List<E> filterToList(Iterator<E> it, cn.hutool.core.lang.a0 a0Var) {
        return toList(filtered(it, a0Var));
    }

    public static <E> x filtered(Iterator<? extends E> it, cn.hutool.core.lang.a0 a0Var) {
        return new x(it, a0Var);
    }

    public static <T> T firstMatch(Iterator<T> it, cn.hutool.core.lang.d0 d0Var) {
        cn.hutool.core.lang.q.notNull(d0Var, "Matcher must be not null !", new Object[0]);
        if (it == null) {
            return null;
        }
        while (it.hasNext()) {
            T next = it.next();
            if (d0Var.match(next)) {
                return next;
            }
        }
        return null;
    }

    public static <E> void forEach(Iterator<E> it, Consumer<? super E> consumer) {
        if (it != null) {
            while (it.hasNext()) {
                E next = it.next();
                if (consumer != null) {
                    consumer.accept(next);
                }
            }
        }
    }

    public static <E> E get(Iterator<E> it, int i8) {
        if (it == null) {
            return null;
        }
        cn.hutool.core.lang.q.isTrue(i8 >= 0, "[index] must be >= 0", new Object[0]);
        while (it.hasNext()) {
            i8--;
            if (-1 == i8) {
                return it.next();
            }
            it.next();
        }
        return null;
    }

    public static Class<?> getElementType(Iterable<?> iterable) {
        return getElementType((Iterator<?>) getIter((Iterable) iterable));
    }

    public static <T> T getFirst(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) getFirst(getIter((Iterable) iterable));
        }
        List list = (List) iterable;
        if (CollUtil.isEmpty((Collection<?>) list)) {
            return null;
        }
        return (T) list.get(0);
    }

    public static <T> T getFirstNoneNull(Iterable<T> iterable) {
        if (iterable == null) {
            return null;
        }
        return (T) getFirstNoneNull(iterable.iterator());
    }

    public static <T> Iterator<T> getIter(Iterable<T> iterable) {
        if (iterable == null) {
            return null;
        }
        return iterable.iterator();
    }

    public static boolean hasNull(Iterable<?> iterable) {
        return hasNull(iterable == null ? null : iterable.iterator());
    }

    public static boolean isAllNull(Iterable<?> iterable) {
        return isAllNull(iterable == null ? null : iterable.iterator());
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable == null || isEmpty(iterable.iterator());
    }

    public static boolean isEqualList(Iterable<?> iterable, Iterable<?> iterable2) {
        if (iterable == iterable2) {
            return true;
        }
        Iterator<?> it = iterable.iterator();
        Iterator<?> it2 = iterable2.iterator();
        do {
            if (!it.hasNext() || !it2.hasNext()) {
                return !(it.hasNext() || it2.hasNext());
            }
        } while (Objects.equals(it.next(), it2.next()));
        return false;
    }

    public static boolean isNotEmpty(Iterable<?> iterable) {
        return iterable != null && isNotEmpty(iterable.iterator());
    }

    public static <T> String join(Iterator<T> it, CharSequence charSequence) {
        return StrJoiner.of(charSequence).append((Iterator) it).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$asIterable$3(Iterator it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$fieldValueAsMap$ceda202c$1(String str, Object obj) {
        return cn.hutool.core.util.y0.getFieldValue(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$fieldValueAsMap$f61513e$1(String str, Object obj) {
        return cn.hutool.core.util.y0.getFieldValue(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$fieldValueMap$a3f4a90f$1(String str, Object obj) {
        return cn.hutool.core.util.y0.getFieldValue(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$toListMap$0(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$toListMap$1(Object obj) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$toMap$2(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$toMap$ed1d981b$1(Object obj) {
        return obj;
    }

    public static int size(Iterable<?> iterable) {
        if (iterable == null) {
            return 0;
        }
        return iterable instanceof Collection ? ((Collection) iterable).size() : size(iterable.iterator());
    }

    public static <E> List<E> toList(Iterable<E> iterable) {
        if (iterable == null) {
            return null;
        }
        return toList(iterable.iterator());
    }

    public static <K, V> Map<K, List<V>> toListMap(Iterable<V> iterable, Function<V, K> function) {
        return toListMap(iterable, function, new Function() { // from class: cn.hutool.core.collection.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$toListMap$0;
                lambda$toListMap$0 = k0.lambda$toListMap$0(obj);
                return lambda$toListMap$0;
            }
        });
    }

    public static <K, V> HashMap<K, V> toMap(Iterable<Map.Entry<K, V>> iterable) {
        HashMap<K, V> hashMap = new HashMap<>();
        if (isNotEmpty(iterable)) {
            for (Map.Entry<K, V> entry : iterable) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static <E> String toStr(Iterator<E> it) {
        return toStr(it, new Function() { // from class: cn.hutool.core.collection.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cn.hutool.core.util.e0.toString(obj);
            }
        });
    }

    public static <F, T> Iterator<T> trans(Iterator<F> it, Function<? super F, ? extends T> function) {
        return new a1(it, function);
    }

    public static <V> List<Object> fieldValueList(Iterator<V> it, String str) {
        ArrayList arrayList = new ArrayList();
        if (it != null) {
            while (it.hasNext()) {
                arrayList.add(cn.hutool.core.util.y0.getFieldValue(it.next(), str));
            }
        }
        return arrayList;
    }

    public static <E> Iterator<E> filter(Iterator<E> it, cn.hutool.core.lang.a0 a0Var) {
        if (it != null && a0Var != null) {
            while (it.hasNext()) {
                if (!a0Var.accept(it.next())) {
                    it.remove();
                }
            }
        }
        return it;
    }

    public static Class<?> getElementType(Iterator<?> it) {
        Object firstNoneNull;
        if (it == null || (firstNoneNull = getFirstNoneNull(it)) == null) {
            return null;
        }
        return firstNoneNull.getClass();
    }

    public static <T> T getFirstNoneNull(Iterator<T> it) {
        return (T) firstMatch(it, new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.collection.e0
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return cn.hutool.core.annotation.t0.a(obj);
            }
        });
    }

    public static Iterator<?> getIter(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj instanceof Iterable) {
            return ((Iterable) obj).iterator();
        }
        if (cn.hutool.core.util.h.isArray(obj)) {
            return new ArrayIter(obj);
        }
        if (obj instanceof Enumeration) {
            return new EnumerationIter((Enumeration) obj);
        }
        if (obj instanceof Map) {
            return ((Map) obj).entrySet().iterator();
        }
        if (obj instanceof NodeList) {
            return new o0((NodeList) obj);
        }
        if (obj instanceof Node) {
            return new o0(((Node) obj).getChildNodes());
        }
        if (obj instanceof Dictionary) {
            return new EnumerationIter(((Dictionary) obj).elements());
        }
        try {
            Object invoke = cn.hutool.core.util.y0.invoke(obj, "iterator", new Object[0]);
            if (invoke instanceof Iterator) {
                return (Iterator) invoke;
            }
        } catch (RuntimeException unused) {
        }
        return new ArrayIter(new Object[]{obj});
    }

    public static boolean hasNull(Iterator<?> it) {
        if (it == null) {
            return true;
        }
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAllNull(Iterator<?> it) {
        return getFirstNoneNull(it) == null;
    }

    public static boolean isEmpty(Iterator<?> it) {
        return it == null || !it.hasNext();
    }

    public static boolean isNotEmpty(Iterator<?> it) {
        return it != null && it.hasNext();
    }

    public static <T> String join(Iterator<T> it, CharSequence charSequence, String str, String str2) {
        return StrJoiner.of(charSequence, str, str2).setWrapElement(true).append((Iterator) it).toString();
    }

    public static <E> List<E> toList(Iterator<E> it) {
        return n0.toList(it);
    }

    public static <T, K, V> Map<K, List<V>> toListMap(Iterable<T> iterable, Function<T, K> function, Function<T, V> function2) {
        return toListMap(cn.hutool.core.map.h1.newHashMap(), iterable, function, function2);
    }

    public static <E> String toStr(Iterator<E> it, Function<? super E, String> function) {
        return toStr(it, function, ", ", "[", "]");
    }

    public static <T, K, V> Map<K, List<V>> toListMap(Map<K, List<V>> map, Iterable<T> iterable, Function<T, K> function, Function<T, V> function2) {
        Object apply;
        Object computeIfAbsent;
        Object apply2;
        if (map == null) {
            map = cn.hutool.core.map.h1.newHashMap();
        }
        if (cn.hutool.core.util.e0.isNull(iterable)) {
            return map;
        }
        for (T t7 : iterable) {
            apply = function.apply(t7);
            computeIfAbsent = map.computeIfAbsent(apply, new Function() { // from class: cn.hutool.core.collection.d0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    List lambda$toListMap$1;
                    lambda$toListMap$1 = k0.lambda$toListMap$1(obj);
                    return lambda$toListMap$1;
                }
            });
            apply2 = function2.apply(t7);
            ((List) computeIfAbsent).add(apply2);
        }
        return map;
    }

    public static <E> String toStr(Iterator<E> it, Function<? super E, String> function, String str, String str2, String str3) {
        StrJoiner of = StrJoiner.of(str, str2, str3);
        of.append(it, function);
        return of.toString();
    }

    public static int size(Iterator<?> it) {
        int i8 = 0;
        if (it != null) {
            while (it.hasNext()) {
                it.next();
                i8++;
            }
        }
        return i8;
    }

    public static <T> T getFirst(Iterator<T> it) {
        return (T) get(it, 0);
    }

    public static <K, V> Map<K, V> toMap(Iterable<K> iterable, Iterable<V> iterable2) {
        return toMap((Iterable) iterable, (Iterable) iterable2, false);
    }

    public static <T> String join(Iterator<T> it, CharSequence charSequence, Function<T, ? extends CharSequence> function) {
        if (it == null) {
            return null;
        }
        return StrJoiner.of(charSequence).append(it, function).toString();
    }

    public static <K, V> Map<K, V> toMap(Iterable<K> iterable, Iterable<V> iterable2, boolean z7) {
        return toMap(iterable == null ? null : iterable.iterator(), iterable2 != null ? iterable2.iterator() : null, z7);
    }

    public static <K, V> Map<K, V> toMap(Iterator<K> it, Iterator<V> it2) {
        return toMap((Iterator) it, (Iterator) it2, false);
    }

    public static <K, V> Map<K, V> toMap(Iterator<K> it, Iterator<V> it2, boolean z7) {
        HashMap newHashMap = cn.hutool.core.map.h1.newHashMap(z7);
        if (isNotEmpty((Iterator<?>) it)) {
            while (it.hasNext()) {
                newHashMap.put(it.next(), (it2 == null || !it2.hasNext()) ? null : it2.next());
            }
        }
        return newHashMap;
    }

    public static <K, V> Map<K, V> toMap(Iterable<V> iterable, Function<V, K> function) {
        return toMap(iterable, function, new Function() { // from class: cn.hutool.core.collection.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$toMap$2;
                lambda$toMap$2 = k0.lambda$toMap$2(obj);
                return lambda$toMap$2;
            }
        });
    }

    public static <T, K, V> Map<K, V> toMap(Iterable<T> iterable, Function<T, K> function, Function<T, V> function2) {
        return toMap(cn.hutool.core.map.h1.newHashMap(), iterable, function, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, K, V> Map<K, V> toMap(Map<K, V> map, Iterable<T> iterable, Function<T, K> function, Function<T, V> function2) {
        Object apply;
        Object apply2;
        Object obj = map;
        if (map == null) {
            obj = cn.hutool.core.map.h1.newHashMap();
        }
        if (cn.hutool.core.util.e0.isNull(iterable)) {
            return (Map<K, V>) obj;
        }
        for (T t7 : iterable) {
            apply = function.apply(t7);
            apply2 = function2.apply(t7);
            ((Map) obj).put(apply, apply2);
        }
        return (Map<K, V>) obj;
    }

    public static <K, V> Map<K, V> toMap(Iterator<V> it, Map<K, V> map, Func1<V, K> func1) {
        return toMap(it, map, func1, new h0());
    }

    public static <K, V, E> Map<K, V> toMap(Iterator<E> it, Map<K, V> map, Func1<E, K> func1, Func1<E, V> func12) {
        if (it == null) {
            return map;
        }
        if (map == null) {
            map = cn.hutool.core.map.h1.newHashMap(true);
        }
        while (it.hasNext()) {
            E next = it.next();
            try {
                map.put(func1.call(next), func12.call(next));
            } catch (Exception e8) {
                throw new UtilException(e8);
            }
        }
        return map;
    }
}
