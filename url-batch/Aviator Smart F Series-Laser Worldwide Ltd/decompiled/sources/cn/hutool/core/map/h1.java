package cn.hutool.core.map;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.Pair;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class h1 {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;

    static class a implements Map.Entry {
        final /* synthetic */ Map.Entry val$t;

        a(Map.Entry entry) {
            this.val$t = entry;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.val$t.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.val$t.getKey();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Unsupported setValue method !");
        }
    }

    public static <K, V> MapBuilder<K, V> builder() {
        return builder(new HashMap());
    }

    public static void clear(Map<?, ?>... mapArr) {
        for (Map<?, ?> map : mapArr) {
            if (isNotEmpty(map)) {
                map.clear();
            }
        }
    }

    public static <K, V> V computeIfAbsent(Map<K, V> map, K k8, Function<? super K, ? extends V> function) {
        Object computeIfAbsent;
        if (cn.hutool.core.util.c0.IS_JDK8) {
            return (V) computeIfAbsentForJdk8(map, k8, function);
        }
        computeIfAbsent = map.computeIfAbsent(k8, function);
        return (V) computeIfAbsent;
    }

    public static <K, V> V computeIfAbsentForJdk8(Map<K, V> map, K k8, Function<? super K, ? extends V> function) {
        Object apply;
        Object putIfAbsent;
        V v7 = map.get(k8);
        if (v7 == null) {
            apply = function.apply(k8);
            v7 = (V) apply;
            putIfAbsent = map.putIfAbsent(k8, v7);
            V v8 = (V) putIfAbsent;
            if (v8 != null) {
                return v8;
            }
        }
        return v7;
    }

    public static <K, V> Map<K, V> createMap(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(AbstractMap.class)) {
            return new HashMap();
        }
        try {
            return (Map) cn.hutool.core.util.y0.newInstance(cls, new Object[0]);
        } catch (UtilException unused) {
            return new HashMap();
        }
    }

    public static MapProxy createProxy(Map<?, ?> map) {
        return MapProxy.create(map);
    }

    public static <T extends Map<K, V>, K, V> T defaultIfEmpty(T t7, T t8) {
        return isEmpty(t7) ? t8 : t7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> edit(Map<K, V> map, cn.hutool.core.lang.z zVar) {
        if (map == null || zVar == null) {
            return map;
        }
        HashMap hashMap = (Map<K, V>) ((Map) cn.hutool.core.util.y0.newInstanceIfPossible(map.getClass()));
        if (hashMap == null) {
            hashMap = new HashMap(map.size(), 1.0f);
        }
        if (isEmpty(map)) {
            return (Map<K, V>) hashMap;
        }
        if (!hashMap.isEmpty()) {
            hashMap.clear();
        }
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) zVar.edit(it.next());
            if (entry != null) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (Map<K, V>) hashMap;
    }

    public static <K, V> Map<K, V> empty() {
        return Collections.emptyMap();
    }

    public static <K, V> Map<K, V> emptyIfNull(Map<K, V> map) {
        return map == null ? Collections.emptyMap() : map;
    }

    public static <K, V> Map.Entry<K, V> entry(K k8, V v7) {
        return entry(k8, v7, true);
    }

    public static <K, V> Map<K, V> filter(Map<K, V> map, final cn.hutool.core.lang.a0 a0Var) {
        return (map == null || a0Var == null) ? map : edit(map, new cn.hutool.core.lang.z() { // from class: cn.hutool.core.map.d1
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                Map.Entry lambda$filter$1;
                lambda$filter$1 = h1.lambda$filter$1(cn.hutool.core.lang.a0.this, (Map.Entry) obj);
                return lambda$filter$1;
            }
        });
    }

    public static <T> T get(Map<?, ?> map, Object obj, Class<T> cls) {
        return (T) get(map, obj, cls, (Object) null);
    }

    public static <K, V> Map<K, V> getAny(Map<K, V> map, final K... kArr) {
        return filter(map, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.map.b1
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$getAny$7;
                lambda$getAny$7 = h1.lambda$getAny$7(kArr, (Map.Entry) obj);
                return lambda$getAny$7;
            }
        });
    }

    public static Boolean getBool(Map<?, ?> map, Object obj) {
        return (Boolean) get(map, obj, Boolean.class);
    }

    public static Character getChar(Map<?, ?> map, Object obj) {
        return (Character) get(map, obj, Character.class);
    }

    public static Date getDate(Map<?, ?> map, Object obj) {
        return (Date) get(map, obj, Date.class);
    }

    public static Double getDouble(Map<?, ?> map, Object obj) {
        return (Double) get(map, obj, Double.class);
    }

    public static Float getFloat(Map<?, ?> map, Object obj) {
        return (Float) get(map, obj, Float.class);
    }

    public static Integer getInt(Map<?, ?> map, Object obj) {
        return (Integer) get(map, obj, Integer.class);
    }

    public static Long getLong(Map<?, ?> map, Object obj) {
        return (Long) get(map, obj, Long.class);
    }

    public static <T> T getQuietly(Map<?, ?> map, Object obj, Class<T> cls, T t7) {
        return map == null ? t7 : (T) cn.hutool.core.convert.d.convertQuietly(cls, map.get(obj), t7);
    }

    public static Short getShort(Map<?, ?> map, Object obj) {
        return (Short) get(map, obj, Short.class);
    }

    public static String getStr(Map<?, ?> map, Object obj) {
        return (String) get(map, obj, String.class);
    }

    public static <K, V> Map<K, List<V>> grouping(Iterable<Map.Entry<K, V>> iterable) {
        Object computeIfAbsent;
        HashMap hashMap = new HashMap();
        if (CollUtil.isEmpty(iterable)) {
            return hashMap;
        }
        for (Map.Entry<K, V> entry : iterable) {
            computeIfAbsent = hashMap.computeIfAbsent(entry.getKey(), new Function() { // from class: cn.hutool.core.map.a1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    List lambda$grouping$0;
                    lambda$grouping$0 = h1.lambda$grouping$0(obj);
                    return lambda$grouping$0;
                }
            });
            ((List) computeIfAbsent).add(entry.getValue());
        }
        return hashMap;
    }

    public static <K, V> Map<V, K> inverse(Map<K, V> map) {
        final Map<V, K> createMap = createMap(map.getClass());
        map.forEach(new BiConsumer() { // from class: cn.hutool.core.map.e1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                createMap.put(obj2, obj);
            }
        });
        return createMap;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return (map == null || map.isEmpty()) ? false : true;
    }

    public static <K, V> String join(Map<K, V> map, String str, String str2, String... strArr) {
        return join(map, str, str2, false, strArr);
    }

    public static <K, V> String joinIgnoreNull(Map<K, V> map, String str, String str2, String... strArr) {
        return join(map, str, str2, true, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map.Entry lambda$filter$1(cn.hutool.core.lang.a0 a0Var, Map.Entry entry) {
        if (a0Var.accept(entry)) {
            return entry;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAny$7(Object[] objArr, Map.Entry entry) {
        return cn.hutool.core.util.h.contains(objArr, entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$grouping$0(Object obj) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$map$2(BiFunction biFunction, Map.Entry entry) {
        Object apply;
        apply = biFunction.apply(entry.getKey(), entry.getValue());
        return apply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$map$3(Object obj, Object obj2) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map.Entry lambda$reverse$4(Map.Entry entry) {
        return new a(entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sortByValue$6(Map map, Map.Entry entry) {
    }

    public static <K, V, R> Map<K, R> map(Map<K, V> map, final BiFunction<K, V, R> biFunction) {
        Stream stream;
        Object collect;
        if (map == null || biFunction == null) {
            return newHashMap();
        }
        stream = map.entrySet().stream();
        collect = stream.collect(t.g0.toMap(new Function() { // from class: cn.hutool.core.map.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        }, new Function() { // from class: cn.hutool.core.map.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$map$2;
                lambda$map$2 = h1.lambda$map$2(biFunction, (Map.Entry) obj);
                return lambda$map$2;
            }
        }, new BinaryOperator() { // from class: cn.hutool.core.map.z0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$map$3;
                lambda$map$3 = h1.lambda$map$3(obj, obj2);
                return lambda$map$3;
            }
        }));
        return (Map) collect;
    }

    public static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap() {
        return new ConcurrentHashMap<>(16);
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> newIdentityMap(int i8) {
        return new IdentityHashMap(i8);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(Comparator<? super K> comparator) {
        return new TreeMap<>(comparator);
    }

    public static <K, V> HashMap<K, V> of(K k8, V v7) {
        return of(k8, v7, false);
    }

    @SafeVarargs
    public static <K, V> Map<K, V> ofEntries(Map.Entry<K, V>... entryArr) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<K, V> entry : entryArr) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public static <K, V> Map<K, V> removeAny(Map<K, V> map, K... kArr) {
        for (K k8 : kArr) {
            map.remove(k8);
        }
        return map;
    }

    public static <K, V> Map<K, V> removeNullValue(Map<K, V> map) {
        if (isEmpty(map)) {
            return map;
        }
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == null) {
                it.remove();
            }
        }
        return map;
    }

    public static <K, V> Map<K, V> renameKey(Map<K, V> map, K k8, K k9) {
        if (isNotEmpty(map) && map.containsKey(k8)) {
            if (map.containsKey(k9)) {
                throw new IllegalArgumentException(cn.hutool.core.text.l.format("The key '{}' exist !", k9));
            }
            map.put(k9, map.remove(k8));
        }
        return map;
    }

    public static <T> Map<T, T> reverse(Map<T, T> map) {
        return edit(map, new cn.hutool.core.lang.z() { // from class: cn.hutool.core.map.c1
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                Map.Entry lambda$reverse$4;
                lambda$reverse$4 = h1.lambda$reverse$4((Map.Entry) obj);
                return lambda$reverse$4;
            }
        });
    }

    public static <K, V> TreeMap<K, V> sort(Map<K, V> map) {
        return sort(map, null);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map, boolean z7) {
        Comparator comparingByValue;
        Stream stream;
        Stream sorted;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        comparingByValue = Map.Entry.comparingByValue();
        if (z7) {
            comparingByValue = comparingByValue.reversed();
        }
        stream = map.entrySet().stream();
        sorted = stream.sorted(comparingByValue);
        sorted.forEachOrdered(new Consumer() { // from class: cn.hutool.core.map.f1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                h1.lambda$sortByValue$6(linkedHashMap, (Map.Entry) obj);
            }
        });
        return linkedHashMap;
    }

    public static String sortJoin(Map<?, ?> map, String str, String str2, boolean z7, String... strArr) {
        return join(sort(map), str, str2, z7, strArr);
    }

    public static <K, V> Map<K, V> toCamelCaseMap(Map<K, V> map) {
        return map instanceof LinkedHashMap ? new CamelCaseLinkedMap(map) : new CamelCaseMap(map);
    }

    public static <K, V> Map<K, List<V>> toListMap(Iterable<? extends Map<K, V>> iterable) {
        HashMap hashMap = new HashMap();
        if (CollUtil.isEmpty(iterable)) {
            return hashMap;
        }
        Iterator<? extends Map<K, V>> it = iterable.iterator();
        while (it.hasNext()) {
            for (Map.Entry<K, V> entry : it.next().entrySet()) {
                K key = entry.getKey();
                List list = (List) hashMap.get(key);
                if (list == null) {
                    hashMap.put(key, CollUtil.newArrayList(entry.getValue()));
                } else {
                    list.add(entry.getValue());
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> List<Map<K, V>> toMapList(Map<K, ? extends Iterable<V>> map) {
        boolean z7;
        ArrayList arrayList = new ArrayList();
        if (isEmpty(map)) {
            return arrayList;
        }
        int i8 = 0;
        do {
            HashMap hashMap = new HashMap();
            z7 = true;
            for (Map.Entry<K, ? extends Iterable<V>> entry : map.entrySet()) {
                ArrayList newArrayList = CollUtil.newArrayList(entry.getValue());
                int size = newArrayList.size();
                if (i8 < size) {
                    hashMap.put(entry.getKey(), newArrayList.get(i8));
                    if (i8 != size - 1) {
                        z7 = false;
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                arrayList.add(hashMap);
            }
            i8++;
        } while (!z7);
        return arrayList;
    }

    public static Object[][] toObjectArray(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Object[][] objArr = (Object[][]) Array.newInstance((Class<?>) Object.class, map.size(), 2);
        if (map.isEmpty()) {
            return objArr;
        }
        int i8 = 0;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            objArr[i8][0] = entry.getKey();
            objArr[i8][1] = entry.getValue();
            i8++;
        }
        return objArr;
    }

    public static <K, V> Map<K, V> unmodifiable(Map<K, V> map) {
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> ArrayList<V> valuesOfKeys(Map<K, V> map, Iterator<K> it) {
        ArrayList<V> arrayList = new ArrayList<>();
        while (it.hasNext()) {
            arrayList.add(map.get(it.next()));
        }
        return arrayList;
    }

    public static <K, V> MapWrapper<K, V> wrap(Map<K, V> map) {
        return new MapWrapper<>(map);
    }

    public static <K, V> MapBuilder<K, V> builder(Map<K, V> map) {
        return new MapBuilder<>(map);
    }

    public static <K, V, T extends Map<K, V>> T empty(Class<?> cls) {
        SortedMap emptySortedMap;
        NavigableMap emptyNavigableMap;
        if (cls == null) {
            return (T) Collections.emptyMap();
        }
        if (NavigableMap.class == cls) {
            emptyNavigableMap = Collections.emptyNavigableMap();
            return emptyNavigableMap;
        }
        if (SortedMap.class == cls) {
            emptySortedMap = Collections.emptySortedMap();
            return emptySortedMap;
        }
        if (Map.class == cls) {
            return (T) Collections.emptyMap();
        }
        throw new IllegalArgumentException(cn.hutool.core.text.l.format("[{}] is not support to get empty!", cls));
    }

    public static <K, V> Map.Entry<K, V> entry(K k8, V v7, boolean z7) {
        return z7 ? new AbstractMap.SimpleImmutableEntry(k8, v7) : new AbstractMap.SimpleEntry(k8, v7);
    }

    public static <K, V> Map<K, V> filter(Map<K, V> map, K... kArr) {
        if (map == null || kArr == null) {
            return map;
        }
        Map<K, V> map2 = (Map) cn.hutool.core.util.y0.newInstanceIfPossible(map.getClass());
        if (map2 == null) {
            map2 = new HashMap<>(map.size(), 1.0f);
        }
        if (isEmpty(map)) {
            return map2;
        }
        if (!map2.isEmpty()) {
            map2.clear();
        }
        for (K k8 : kArr) {
            if (map.containsKey(k8)) {
                map2.put(k8, map.get(k8));
            }
        }
        return map2;
    }

    public static <T> T get(Map<?, ?> map, Object obj, Class<T> cls, T t7) {
        return map == null ? t7 : (T) cn.hutool.core.convert.d.convert((Class) cls, map.get(obj), (Object) t7);
    }

    public static Boolean getBool(Map<?, ?> map, Object obj, Boolean bool) {
        return (Boolean) get(map, obj, (Class<Boolean>) Boolean.class, bool);
    }

    public static Character getChar(Map<?, ?> map, Object obj, Character ch) {
        return (Character) get(map, obj, (Class<Character>) Character.class, ch);
    }

    public static Date getDate(Map<?, ?> map, Object obj, Date date) {
        return (Date) get(map, obj, (Class<Date>) Date.class, date);
    }

    public static Double getDouble(Map<?, ?> map, Object obj, Double d8) {
        return (Double) get(map, obj, (Class<Double>) Double.class, d8);
    }

    public static Float getFloat(Map<?, ?> map, Object obj, Float f8) {
        return (Float) get(map, obj, (Class<Float>) Float.class, f8);
    }

    public static Integer getInt(Map<?, ?> map, Object obj, Integer num) {
        return (Integer) get(map, obj, (Class<Integer>) Integer.class, num);
    }

    public static Long getLong(Map<?, ?> map, Object obj, Long l8) {
        return (Long) get(map, obj, (Class<Long>) Long.class, l8);
    }

    public static <T> T getQuietly(Map<?, ?> map, Object obj, cn.hutool.core.lang.y0 y0Var, T t7) {
        return map == null ? t7 : (T) cn.hutool.core.convert.d.convertQuietly(y0Var, map.get(obj), t7);
    }

    public static Short getShort(Map<?, ?> map, Object obj, Short sh) {
        return (Short) get(map, obj, (Class<Short>) Short.class, sh);
    }

    public static String getStr(Map<?, ?> map, Object obj, String str) {
        return (String) get(map, obj, (Class<String>) String.class, str);
    }

    public static <K, V> String join(Map<K, V> map, String str, String str2, boolean z7, String... strArr) {
        StringBuilder builder = cn.hutool.core.util.c1.builder();
        if (isNotEmpty(map)) {
            boolean z8 = true;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (!z7 || (entry.getKey() != null && entry.getValue() != null)) {
                    if (z8) {
                        z8 = false;
                    } else {
                        builder.append(str);
                    }
                    builder.append(cn.hutool.core.convert.d.toStr(entry.getKey()));
                    builder.append(str2);
                    builder.append(cn.hutool.core.convert.d.toStr(entry.getValue()));
                }
            }
        }
        if (cn.hutool.core.util.h.isNotEmpty((Object[]) strArr)) {
            for (String str3 : strArr) {
                builder.append(str3);
            }
        }
        return builder.toString();
    }

    public static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap(int i8) {
        if (i8 <= 0) {
            i8 = 16;
        }
        return new ConcurrentHashMap<>(i8);
    }

    public static <K, V> HashMap<K, V> newHashMap(int i8, boolean z7) {
        int i9 = ((int) (i8 / 0.75f)) + 1;
        return z7 ? new LinkedHashMap(i9) : new HashMap<>(i9);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(Map<K, V> map, Comparator<? super K> comparator) {
        TreeMap<K, V> treeMap = new TreeMap<>(comparator);
        if (!isEmpty(map)) {
            treeMap.putAll(map);
        }
        return treeMap;
    }

    public static <K, V> HashMap<K, V> of(K k8, V v7, boolean z7) {
        HashMap<K, V> newHashMap = newHashMap(z7);
        newHashMap.put(k8, v7);
        return newHashMap;
    }

    public static <K, V> TreeMap<K, V> sort(Map<K, V> map, Comparator<? super K> comparator) {
        if (map == null) {
            return null;
        }
        if (map instanceof TreeMap) {
            TreeMap<K, V> treeMap = (TreeMap) map;
            if (comparator == null || comparator.equals(treeMap.comparator())) {
                return treeMap;
            }
        }
        return newTreeMap(map, comparator);
    }

    public static <K, V> MapBuilder<K, V> builder(K k8, V v7) {
        return builder(new HashMap()).put(k8, v7);
    }

    public static <T> T get(Map<?, ?> map, Object obj, cn.hutool.core.lang.y0 y0Var) {
        return (T) get(map, obj, y0Var, (Object) null);
    }

    public static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap(Map<K, V> map) {
        if (isEmpty(map)) {
            return new ConcurrentHashMap<>(16);
        }
        return new ConcurrentHashMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(int i8) {
        return newHashMap(i8, false);
    }

    public static <T> T get(Map<?, ?> map, Object obj, cn.hutool.core.lang.y0 y0Var, T t7) {
        return map == null ? t7 : (T) cn.hutool.core.convert.d.convert(y0Var, map.get(obj), t7);
    }

    public static <K, V> HashMap<K, V> newHashMap(boolean z7) {
        return newHashMap(16, z7);
    }

    @SafeVarargs
    @Deprecated
    public static <K, V> Map<K, V> of(Pair<K, V>... pairArr) {
        HashMap hashMap = new HashMap();
        for (Pair<K, V> pair : pairArr) {
            hashMap.put(pair.getKey(), pair.getValue());
        }
        return hashMap;
    }

    public static HashMap<Object, Object> of(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap<Object, Object> hashMap = new HashMap<>((int) (objArr.length * 1.5d));
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                hashMap.put(entry.getKey(), entry.getValue());
            } else if (obj instanceof Object[]) {
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length > 1) {
                    hashMap.put(objArr2[0], objArr2[1]);
                }
            } else if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        hashMap.put(next, it.next());
                    }
                }
            } else if (obj instanceof Iterator) {
                Iterator it2 = (Iterator) obj;
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (it2.hasNext()) {
                        hashMap.put(next2, it2.next());
                    }
                }
            } else {
                throw new IllegalArgumentException(cn.hutool.core.text.l.format("Array element {}, '{}', is not type of Map.Entry or Array or Iterable or Iterator", Integer.valueOf(i8), obj));
            }
        }
        return hashMap;
    }
}
