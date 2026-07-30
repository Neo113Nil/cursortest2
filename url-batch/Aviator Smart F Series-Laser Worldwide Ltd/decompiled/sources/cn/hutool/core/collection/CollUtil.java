package cn.hutool.core.collection;

import androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1;
import cn.hutool.core.comparator.PinyinComparator;
import cn.hutool.core.comparator.PropertyComparator;
import cn.hutool.core.convert.ConverterRegistry;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.func.Func1;
import com.google.android.gms.internal.measurement.zzmc;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class CollUtil {

    @FunctionalInterface
    public interface Consumer<T> extends Serializable {
        void c(Object obj, int i8);
    }

    @FunctionalInterface
    public interface KVConsumer<K, V> extends Serializable {
        void a(Object obj, Object obj2, int i8);
    }

    static class a implements n.b {
        private final List<Object> fieldNameList = new ArrayList();
        final /* synthetic */ String val$fieldName;

        a(String str) {
            this.val$fieldName = str;
        }

        @Override // n.b, n.c
        public /* bridge */ /* synthetic */ Number hash(Object obj) {
            return n.a.a(this, obj);
        }

        @Override // n.b
        public int hash32(T t7) {
            if (t7 == 0 || !cn.hutool.core.bean.q.isBean(t7.getClass())) {
                return 0;
            }
            Object fieldValue = cn.hutool.core.util.y0.getFieldValue(t7, this.val$fieldName);
            int indexOf = this.fieldNameList.indexOf(fieldValue);
            if (indexOf >= 0) {
                return indexOf;
            }
            this.fieldNameList.add(fieldValue);
            return this.fieldNameList.size() - 1;
        }
    }

    public static <T> Collection<T> addAll(Collection<T> collection, Object obj) {
        return addAll(collection, obj, cn.hutool.core.util.e1.getTypeArgument(collection.getClass()));
    }

    public static <T> List<T> addAllIfNotContains(List<T> list, List<T> list2) {
        for (T t7 : list2) {
            if (!list.contains(t7)) {
                list.add(t7);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, S extends T> boolean addIfAbsent(Collection<T> collection, S s7) {
        if (s7 == 0 || collection == null || collection.contains(s7)) {
            return false;
        }
        return collection.add(s7);
    }

    public static <T> boolean allMatch(Collection<T> collection, Predicate<T> predicate) {
        Stream stream;
        boolean allMatch;
        if (isEmpty((Collection<?>) collection)) {
            return false;
        }
        stream = collection.stream();
        allMatch = stream.allMatch(predicate);
        return allMatch;
    }

    public static <T> boolean anyMatch(Collection<T> collection, Predicate<T> predicate) {
        Stream stream;
        boolean anyMatch;
        if (isEmpty((Collection<?>) collection)) {
            return false;
        }
        stream = collection.stream();
        anyMatch = stream.anyMatch(predicate);
        return anyMatch;
    }

    public static <E> Enumeration<E> asEnumeration(Iterator<E> it) {
        return new IteratorEnumeration(it);
    }

    public static <E> Iterable<E> asIterable(Iterator<E> it) {
        return k0.asIterable(it);
    }

    public static <E> Iterator<E> asIterator(Enumeration<E> enumeration) {
        return k0.asIterator(enumeration);
    }

    public static void clear(Collection<?>... collectionArr) {
        for (Collection<?> collection : collectionArr) {
            if (isNotEmpty(collection)) {
                collection.clear();
            }
        }
    }

    public static boolean contains(Collection<?> collection, Object obj) {
        return isNotEmpty(collection) && collection.contains(obj);
    }

    public static boolean containsAll(Collection<?> collection, Collection<?> collection2) {
        if (isEmpty(collection)) {
            return isEmpty(collection2);
        }
        if (isEmpty(collection2)) {
            return true;
        }
        if (collection.size() < collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsAny(Collection<?> collection, Collection<?> collection2) {
        if (!isEmpty(collection) && !isEmpty(collection2)) {
            if (collection.size() < collection2.size()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    if (collection2.contains(it.next())) {
                        return true;
                    }
                }
            } else {
                Iterator<?> it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (collection.contains(it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <T> int count(Iterable<T> iterable, cn.hutool.core.lang.d0 d0Var) {
        int i8 = 0;
        if (iterable != null) {
            for (T t7 : iterable) {
                if (d0Var == null || d0Var.match(t7)) {
                    i8++;
                }
            }
        }
        return i8;
    }

    public static <T> Map<T, Integer> countMap(Iterable<T> iterable) {
        return k0.countMap(iterable == null ? null : iterable.iterator());
    }

    public static <T> Collection<T> create(Class<?> cls) {
        return create(cls, null);
    }

    public static <T extends Collection<E>, E> T defaultIfEmpty(T t7, T t8) {
        return isEmpty((Collection<?>) t7) ? t8 : t7;
    }

    public static <T> Collection<T> disjunction(Collection<T> collection, Collection<T> collection2) {
        if (isEmpty((Collection<?>) collection)) {
            return collection2;
        }
        if (isEmpty((Collection<?>) collection2)) {
            return collection;
        }
        ArrayList arrayList = new ArrayList();
        Map countMap = countMap(collection);
        Map countMap2 = countMap(collection2);
        HashSet newHashSet = newHashSet(collection2);
        newHashSet.addAll(collection);
        for (Object obj : newHashSet) {
            int abs = Math.abs(cn.hutool.core.convert.d.toInt(countMap.get(obj), 0).intValue() - cn.hutool.core.convert.d.toInt(countMap2.get(obj), 0).intValue());
            for (int i8 = 0; i8 < abs; i8++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> ArrayList<T> distinct(Collection<T> collection) {
        return isEmpty((Collection<?>) collection) ? new ArrayList<>() : collection instanceof Set ? new ArrayList<>(collection) : new ArrayList<>(new LinkedHashSet(collection));
    }

    public static <T> Collection<T> edit(Collection<T> collection, cn.hutool.core.lang.z zVar) {
        if (collection == null || zVar == null) {
            return collection;
        }
        MutableScatterMap$MutableMapWrapper$entries$1 mutableScatterMap$MutableMapWrapper$entries$1 = (Collection<T>) create(collection.getClass());
        if (isEmpty((Collection<?>) collection)) {
            return mutableScatterMap$MutableMapWrapper$entries$1;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Object edit = zVar.edit(it.next());
            if (edit != null) {
                mutableScatterMap$MutableMapWrapper$entries$1.add((MutableScatterMap$MutableMapWrapper$entries$1) edit);
            }
        }
        return mutableScatterMap$MutableMapWrapper$entries$1;
    }

    public static <E, T extends Collection<E>> T empty(Class<?> cls) {
        SortedSet emptySortedSet;
        NavigableSet emptyNavigableSet;
        if (cls == null) {
            return Collections.emptyList();
        }
        if (!Set.class.isAssignableFrom(cls)) {
            if (List.class.isAssignableFrom(cls)) {
                return Collections.emptyList();
            }
            throw new IllegalArgumentException(cn.hutool.core.text.l.format("[{}] is not support to get empty!", cls));
        }
        if (NavigableSet.class == cls) {
            emptyNavigableSet = Collections.emptyNavigableSet();
            return emptyNavigableSet;
        }
        if (SortedSet.class != cls) {
            return Collections.emptySet();
        }
        emptySortedSet = Collections.emptySortedSet();
        return emptySortedSet;
    }

    public static <T> Set<T> emptyIfNull(Set<T> set) {
        return set == null ? Collections.emptySet() : set;
    }

    public static List<Object> extract(Iterable<?> iterable, cn.hutool.core.lang.z zVar) {
        return extract(iterable, zVar, false);
    }

    public static <K, V> Map<K, V> fieldValueAsMap(Iterable<?> iterable, String str, String str2) {
        return k0.fieldValueAsMap(k0.getIter((Iterable) iterable), str, str2);
    }

    public static <K, V> Map<K, V> fieldValueMap(Iterable<V> iterable, String str) {
        return k0.fieldValueMap(k0.getIter((Iterable) iterable), str);
    }

    public static <T extends Collection<E>, E> T filter(T t7, cn.hutool.core.lang.a0 a0Var) {
        return (T) k0.filter(t7, a0Var);
    }

    public static <T> Collection<T> filterNew(Collection<T> collection, final cn.hutool.core.lang.a0 a0Var) {
        return (collection == null || a0Var == null) ? collection : edit(collection, new cn.hutool.core.lang.z() { // from class: cn.hutool.core.collection.m
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                Object lambda$filterNew$1;
                lambda$filterNew$1 = CollUtil.lambda$filterNew$1(cn.hutool.core.lang.a0.this, obj);
                return lambda$filterNew$1;
            }
        });
    }

    public static <T> T findOne(Iterable<T> iterable, cn.hutool.core.lang.a0 a0Var) {
        if (iterable == null) {
            return null;
        }
        for (T t7 : iterable) {
            if (a0Var.accept(t7)) {
                return t7;
            }
        }
        return null;
    }

    public static <T> T findOneByField(Iterable<T> iterable, final String str, final Object obj) {
        return (T) findOne(iterable, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.collection.v
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj2) {
                boolean lambda$findOneByField$3;
                lambda$findOneByField$3 = CollUtil.lambda$findOneByField$3(str, obj, obj2);
                return lambda$findOneByField$3;
            }
        });
    }

    public static <T> void forEach(Iterable<T> iterable, Consumer<T> consumer) {
        if (iterable == null) {
            return;
        }
        forEach(iterable.iterator(), consumer);
    }

    public static <T> T get(Collection<T> collection, int i8) {
        int size;
        if (collection == null || (size = collection.size()) == 0) {
            return null;
        }
        if (i8 < 0) {
            i8 += size;
        }
        if (i8 >= size || i8 < 0) {
            return null;
        }
        return collection instanceof List ? (T) ((List) collection).get(i8) : (T) k0.get(collection.iterator(), i8);
    }

    public static <T> List<T> getAny(Collection<T> collection, int... iArr) {
        int size = collection.size();
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        if (collection instanceof List) {
            List list = (List) collection;
            int length = iArr.length;
            while (i8 < length) {
                int i9 = iArr[i8];
                if (i9 < 0) {
                    i9 += size;
                }
                arrayList.add(list.get(i9));
                i8++;
            }
        } else {
            Object[] array = collection.toArray();
            int length2 = iArr.length;
            while (i8 < length2) {
                int i10 = iArr[i8];
                if (i10 < 0) {
                    i10 += size;
                }
                arrayList.add(array[i10]);
                i8++;
            }
        }
        return arrayList;
    }

    @Deprecated
    public static Class<?> getElementType(Iterable<?> iterable) {
        return k0.getElementType(iterable);
    }

    public static List<Object> getFieldValues(Iterable<?> iterable, String str) {
        return getFieldValues(iterable, str, false);
    }

    public static <T> T getFirst(Iterable<T> iterable) {
        return (T) k0.getFirst(iterable);
    }

    public static <T> T getLast(Collection<T> collection) {
        return (T) get(collection, -1);
    }

    public static <T> List<List<T>> group(Collection<T> collection, n.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (isEmpty((Collection<?>) collection)) {
            return arrayList;
        }
        if (bVar == null) {
            bVar = new n.b() { // from class: cn.hutool.core.collection.n
                @Override // n.b, n.c
                public /* synthetic */ Number hash(Object obj) {
                    return n.a.a(this, obj);
                }

                @Override // n.b
                public final int hash32(Object obj) {
                    int lambda$group$5;
                    lambda$group$5 = CollUtil.lambda$group$5(obj);
                    return lambda$group$5;
                }
            };
        }
        for (T t7 : collection) {
            int hash32 = bVar.hash32(t7);
            if (arrayList.size() - 1 < hash32) {
                while (arrayList.size() - 1 < hash32) {
                    arrayList.add(null);
                }
                arrayList.set(hash32, newArrayList(t7));
            } else {
                List list = (List) arrayList.get(hash32);
                if (list == null) {
                    arrayList.set(hash32, newArrayList(t7));
                } else {
                    list.add(t7);
                }
            }
        }
        return arrayList;
    }

    public static <T> List<List<T>> groupByField(Collection<T> collection, String str) {
        return group(collection, new a(str));
    }

    public static boolean hasNull(Iterable<?> iterable) {
        return k0.hasNull(iterable);
    }

    public static <T> int indexOf(Collection<T> collection, cn.hutool.core.lang.d0 d0Var) {
        if (!isNotEmpty((Collection<?>) collection)) {
            return -1;
        }
        int i8 = 0;
        for (T t7 : collection) {
            if (d0Var == null || d0Var.match(t7)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static <T> int[] indexOfAll(Collection<T> collection, cn.hutool.core.lang.d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            int i8 = 0;
            for (T t7 : collection) {
                if (d0Var == null || d0Var.match(t7)) {
                    arrayList.add(Integer.valueOf(i8));
                }
                i8++;
            }
        }
        return (int[]) cn.hutool.core.convert.d.convert(int[].class, (Object) arrayList);
    }

    public static <T> Collection<T> intersection(Collection<T> collection, Collection<T> collection2) {
        if (!isNotEmpty((Collection<?>) collection) || !isNotEmpty((Collection<?>) collection2)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(Math.min(collection.size(), collection2.size()));
        Map countMap = countMap(collection);
        Map countMap2 = countMap(collection2);
        for (Object obj : newHashSet(collection2)) {
            int min = Math.min(cn.hutool.core.convert.d.toInt(countMap.get(obj), 0).intValue(), cn.hutool.core.convert.d.toInt(countMap2.get(obj), 0).intValue());
            for (int i8 = 0; i8 < min; i8++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Set<T> intersectionDistinct(Collection<T> collection, Collection<T> collection2, Collection<T>... collectionArr) {
        if (isEmpty((Collection<?>) collection) || isEmpty((Collection<?>) collection2)) {
            return new LinkedHashSet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        if (cn.hutool.core.util.h.isNotEmpty((Object[]) collectionArr)) {
            for (Collection<T> collection3 : collectionArr) {
                if (!isNotEmpty((Collection<?>) collection3)) {
                    return new LinkedHashSet();
                }
                linkedHashSet.retainAll(collection3);
            }
        }
        linkedHashSet.retainAll(collection2);
        return linkedHashSet;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEqualList(Collection<?> collection, Collection<?> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        return k0.isEqualList(collection, collection2);
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static <T> String join(Iterable<T> iterable, CharSequence charSequence, Function<T, ? extends CharSequence> function) {
        if (iterable == null) {
            return null;
        }
        return k0.join(iterable.iterator(), charSequence, function);
    }

    public static <K> Set<K> keySet(Collection<Map<K, ?>> collection) {
        if (isEmpty((Collection<?>) collection)) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(collection.size() * 16);
        Iterator<Map<K, ?>> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().keySet());
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$create$0(Object obj, Object obj2) {
        return obj instanceof Comparable ? ((Comparable) obj).compareTo(obj2) : cn.hutool.core.comparator.d.compare(obj.toString(), obj2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$filterNew$1(cn.hutool.core.lang.a0 a0Var, Object obj) {
        if (a0Var.accept(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$findOneByField$3(String str, Object obj, Object obj2) {
        return obj2 instanceof Map ? cn.hutool.core.util.e0.equal(((Map) obj2).get(str), obj) : cn.hutool.core.util.e0.equal(cn.hutool.core.util.y0.getFieldValue(obj2, str), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getFieldValues$2(String str, Object obj) {
        return obj instanceof Map ? ((Map) obj).get(str) : cn.hutool.core.util.y0.getFieldValue(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$group$5(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setValueByMap$7(Map map, Function function, final BiConsumer biConsumer, final Object obj) {
        Object apply;
        Optional ofNullable;
        apply = function.apply(obj);
        ofNullable = Optional.ofNullable(map.get(apply));
        ofNullable.ifPresent(new java.util.function.Consumer() { // from class: cn.hutool.core.collection.q
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                cn.hutool.core.annotation.scanner.b.a(biConsumer, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortEntryToList$4(Map.Entry entry, Map.Entry entry2) {
        Object value = entry.getValue();
        Object value2 = entry2.getValue();
        return value instanceof Comparable ? ((Comparable) value).compareTo(value2) : value.toString().compareTo(value2.toString());
    }

    public static <T> int lastIndexOf(Collection<T> collection, cn.hutool.core.lang.d0 d0Var) {
        if (collection instanceof List) {
            return n0.lastIndexOf((List) collection, d0Var);
        }
        int i8 = -1;
        if (isNotEmpty((Collection<?>) collection)) {
            int i9 = 0;
            for (T t7 : collection) {
                if (d0Var == null || d0Var.match(t7)) {
                    i8 = i9;
                }
                i9++;
            }
        }
        return i8;
    }

    public static <T> List<T> list(boolean z7) {
        return n0.list(z7);
    }

    public static <T, R> List<R> map(Iterable<T> iterable, Function<? super T, ? extends R> function, boolean z7) {
        Object apply;
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return arrayList;
        }
        for (T t7 : iterable) {
            if (t7 != null || !z7) {
                apply = function.apply(t7);
                if (apply != null || !z7) {
                    arrayList.add(apply);
                }
            }
        }
        return arrayList;
    }

    public static <T extends Comparable<? super T>> T max(Collection<T> collection) {
        if (isEmpty((Collection<?>) collection)) {
            return null;
        }
        return (T) Collections.max(collection);
    }

    public static <T extends Comparable<? super T>> T min(Collection<T> collection) {
        if (isEmpty((Collection<?>) collection)) {
            return null;
        }
        return (T) Collections.min(collection);
    }

    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... tArr) {
        return n0.toList(tArr);
    }

    public static <T> BlockingQueue<T> newBlockingQueue(int i8, boolean z7) {
        return z7 ? new LinkedBlockingDeque(i8) : new ArrayBlockingQueue(i8);
    }

    public static <T> CopyOnWriteArrayList<T> newCopyOnWriteArrayList(Collection<T> collection) {
        return n0.toCopyOnWriteArrayList(collection);
    }

    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... tArr) {
        return set(false, tArr);
    }

    @SafeVarargs
    public static <T> LinkedHashSet<T> newLinkedHashSet(T... tArr) {
        return (LinkedHashSet) set(true, tArr);
    }

    @SafeVarargs
    public static <T> LinkedList<T> newLinkedList(T... tArr) {
        return n0.toLinkedList(tArr);
    }

    public static <T> void padLeft(List<T> list, int i8, T t7) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            padRight(list, i8, t7);
            return;
        }
        for (int size = list.size(); size < i8; size++) {
            list.add(0, t7);
        }
    }

    public static <T> void padRight(Collection<T> collection, int i8, T t7) {
        Objects.requireNonNull(collection);
        for (int size = collection.size(); size < i8; size++) {
            collection.add(t7);
        }
    }

    public static <T> List<T> page(int i8, int i9, List<T> list) {
        return n0.page(i8, i9, list);
    }

    public static <T> List<T> popPart(Stack<T> stack, int i8) {
        if (isEmpty((Collection<?>) stack)) {
            return n0.empty();
        }
        ArrayList arrayList = new ArrayList();
        int size = stack.size();
        int i9 = 0;
        if (size > i8) {
            while (i9 < i8) {
                arrayList.add(stack.pop());
                i9++;
            }
        } else {
            while (i9 < size) {
                arrayList.add(stack.pop());
                i9++;
            }
        }
        return arrayList;
    }

    public static <T extends Collection<E>, E> T removeAny(T t7, E... eArr) {
        t7.removeAll(newHashSet(eArr));
        return t7;
    }

    public static <T extends Collection<E>, E extends CharSequence> T removeBlank(T t7) {
        return (T) filter(t7, new t());
    }

    public static <T extends Collection<E>, E extends CharSequence> T removeEmpty(T t7) {
        return (T) filter(t7, new p());
    }

    public static <T extends Collection<E>, E> T removeNull(T t7) {
        return (T) filter(t7, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.collection.l
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                return cn.hutool.core.annotation.t0.a(obj);
            }
        });
    }

    public static <T extends Collection<E>, E> T removeWithAddIf(T t7, T t8, Predicate<? super E> predicate) {
        boolean test;
        Objects.requireNonNull(predicate);
        Iterator<E> it = t7.iterator();
        while (it.hasNext()) {
            E next = it.next();
            test = predicate.test(next);
            if (test) {
                t8.add(next);
                it.remove();
            }
        }
        return t8;
    }

    public static <T> List<T> reverse(List<T> list) {
        return n0.reverse(list);
    }

    public static <T> List<T> reverseNew(List<T> list) {
        return n0.reverseNew(list);
    }

    public static boolean safeContains(Collection<?> collection, Object obj) {
        try {
            return contains(collection, obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @SafeVarargs
    public static <T> HashSet<T> set(boolean z7, T... tArr) {
        if (tArr == null) {
            return z7 ? new LinkedHashSet() : new HashSet<>();
        }
        int max = Math.max(((int) (tArr.length / 0.75f)) + 1, 16);
        HashSet<T> linkedHashSet = z7 ? new LinkedHashSet<>(max) : new HashSet<>(max);
        Collections.addAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    public static <T> List<T> setOrAppend(List<T> list, int i8, T t7) {
        return n0.setOrAppend(list, i8, t7);
    }

    public static <E, K, V> void setValueByMap(Iterable<E> iterable, final Map<K, V> map, final Function<E, K> function, final BiConsumer<E, V> biConsumer) {
        iterable.forEach(new java.util.function.Consumer() { // from class: cn.hutool.core.collection.o
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CollUtil.lambda$setValueByMap$7(map, function, biConsumer, obj);
            }
        });
    }

    public static int size(Object obj) {
        int i8 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Iterable) {
            return k0.size((Iterable<?>) obj);
        }
        if (obj instanceof Iterator) {
            return k0.size((Iterator<?>) obj);
        }
        if (obj instanceof Enumeration) {
            Enumeration enumeration = (Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i8++;
                enumeration.nextElement();
            }
            return i8;
        }
        if (cn.hutool.core.util.h.isArray(obj)) {
            return cn.hutool.core.util.h.length(obj);
        }
        throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
    }

    public static <T> List<T> sort(Collection<T> collection, Comparator<? super T> comparator) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.sort(comparator);
        return arrayList;
    }

    public static <K, V> LinkedHashMap<K, V> sortByEntry(Map<K, V> map, Comparator<Map.Entry<K, V>> comparator) {
        return sortToMap(map.entrySet(), comparator);
    }

    public static List<String> sortByPinyin(Collection<String> collection) {
        return sort(collection, new PinyinComparator());
    }

    public static <T> List<T> sortByProperty(Collection<T> collection, String str) {
        return sort(collection, new PropertyComparator(str));
    }

    public static <K, V> List<Map.Entry<K, V>> sortEntryToList(Collection<Map.Entry<K, V>> collection) {
        LinkedList linkedList = new LinkedList(collection);
        linkedList.sort(new Comparator() { // from class: cn.hutool.core.collection.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortEntryToList$4;
                lambda$sortEntryToList$4 = CollUtil.lambda$sortEntryToList$4((Map.Entry) obj, (Map.Entry) obj2);
                return lambda$sortEntryToList$4;
            }
        });
        return linkedList;
    }

    @SafeVarargs
    public static <T> List<T> sortPageAll(int i8, int i9, Comparator<T> comparator, Collection<T>... collectionArr) {
        ArrayList arrayList = new ArrayList(i8 * i9);
        for (Collection<T> collection : collectionArr) {
            arrayList.addAll(collection);
        }
        if (comparator != null) {
            arrayList.sort(comparator);
        }
        return page(i8, i9, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> LinkedHashMap<K, V> sortToMap(Collection<Map.Entry<K, V>> collection, Comparator<Map.Entry<K, V>> comparator) {
        LinkedList<Map.Entry> linkedList = new LinkedList(collection);
        linkedList.sort(comparator);
        zzmc zzmcVar = (LinkedHashMap<K, V>) new LinkedHashMap();
        for (Map.Entry entry : linkedList) {
            zzmcVar.put(entry.getKey(), entry.getValue());
        }
        return zzmcVar;
    }

    public static <T> List<List<T>> split(Collection<T> collection, int i8) {
        ArrayList arrayList = new ArrayList();
        if (isEmpty((Collection<?>) collection)) {
            return arrayList;
        }
        int min = Math.min(collection.size(), i8);
        ArrayList arrayList2 = new ArrayList(min);
        for (T t7 : collection) {
            if (arrayList2.size() >= i8) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList(min);
            }
            arrayList2.add(t7);
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Deprecated
    public static <T> List<List<T>> splitList(List<T> list, int i8) {
        return n0.partition(list, i8);
    }

    public static <T> List<T> sub(List<T> list, int i8, int i9) {
        return n0.sub(list, i8, i9);
    }

    public static <T> Collection<T> subtract(Collection<T> collection, Collection<T> collection2) {
        Collection<T> collection3 = (Collection) cn.hutool.core.util.e0.clone(collection);
        if (collection3 == null) {
            try {
                collection3 = create(collection.getClass());
                collection3.addAll(collection);
            } catch (UnsupportedOperationException unused) {
                Collection<T> create = create(AbstractCollection.class);
                create.addAll(collection);
                create.removeAll(collection2);
                return create;
            }
        }
        collection3.removeAll(collection2);
        return collection3;
    }

    public static <T> List<T> subtractToList(Collection<T> collection, Collection<T> collection2) {
        if (isEmpty((Collection<?>) collection)) {
            return n0.empty();
        }
        if (isEmpty((Collection<?>) collection2)) {
            return n0.list(true, (Collection) collection);
        }
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet(collection2);
        for (T t7 : collection) {
            if (!hashSet.contains(t7)) {
                linkedList.add(t7);
            }
        }
        return linkedList;
    }

    public static <E> Collection<E> toCollection(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable.iterator());
    }

    @SafeVarargs
    public static <T> ArrayList<T> toList(T... tArr) {
        return n0.toList(tArr);
    }

    public static <K, V> Map<K, List<V>> toListMap(Iterable<? extends Map<K, V>> iterable) {
        return cn.hutool.core.map.h1.toListMap(iterable);
    }

    public static <K, V> HashMap<K, V> toMap(Iterable<Map.Entry<K, V>> iterable) {
        return k0.toMap(iterable);
    }

    public static <K, V> List<Map<K, V>> toMapList(Map<K, ? extends Iterable<V>> map) {
        return cn.hutool.core.map.h1.toMapList(map);
    }

    public static <T> TreeSet<T> toTreeSet(Collection<T> collection, Comparator<T> comparator) {
        TreeSet<T> treeSet = new TreeSet<>((Comparator<? super T>) comparator);
        treeSet.addAll(collection);
        return treeSet;
    }

    public static <F, T> Collection<T> trans(Collection<F> collection, Function<? super F, ? extends T> function) {
        return new z0(collection, function);
    }

    public static <T> Collection<T> union(Collection<T> collection, Collection<T> collection2) {
        if (isEmpty((Collection<?>) collection) && isEmpty((Collection<?>) collection2)) {
            return new ArrayList();
        }
        if (isEmpty((Collection<?>) collection)) {
            return new ArrayList(collection2);
        }
        if (isEmpty((Collection<?>) collection2)) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList(Math.max(collection.size(), collection2.size()));
        Map countMap = countMap(collection);
        Map countMap2 = countMap(collection2);
        HashSet newHashSet = newHashSet(collection2);
        newHashSet.addAll(collection);
        for (Object obj : newHashSet) {
            int max = Math.max(cn.hutool.core.convert.d.toInt(countMap.get(obj), 0).intValue(), cn.hutool.core.convert.d.toInt(countMap2.get(obj), 0).intValue());
            for (int i8 = 0; i8 < max; i8++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> List<T> unionAll(Collection<T> collection, Collection<T> collection2, Collection<T>... collectionArr) {
        if (isEmpty((Collection<?>) collection) && isEmpty((Collection<?>) collection2) && cn.hutool.core.util.h.isEmpty((Object[]) collectionArr)) {
            return new ArrayList(0);
        }
        int size = size(collection) + size(collection2);
        if (collectionArr != null) {
            for (Collection<T> collection3 : collectionArr) {
                size += size(collection3);
            }
        }
        ArrayList arrayList = new ArrayList(size);
        if (collection != null) {
            arrayList.addAll(collection);
        }
        if (collection2 != null) {
            arrayList.addAll(collection2);
        }
        if (collectionArr == null) {
            return arrayList;
        }
        for (Collection<T> collection4 : collectionArr) {
            if (collection4 != null) {
                arrayList.addAll(collection4);
            }
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Set<T> unionDistinct(Collection<T> collection, Collection<T> collection2, Collection<T>... collectionArr) {
        LinkedHashSet linkedHashSet = isEmpty((Collection<?>) collection) ? new LinkedHashSet() : new LinkedHashSet(collection);
        if (isNotEmpty((Collection<?>) collection2)) {
            linkedHashSet.addAll(collection2);
        }
        if (cn.hutool.core.util.h.isNotEmpty((Object[]) collectionArr)) {
            for (Collection<T> collection3 : collectionArr) {
                if (!isEmpty((Collection<?>) collection3)) {
                    linkedHashSet.addAll(collection3);
                }
            }
        }
        return linkedHashSet;
    }

    public static <T> Collection<T> unmodifiable(Collection<? extends T> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public static <V> List<V> values(Collection<Map<?, V>> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<?, V>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    public static <K, V> ArrayList<V> valuesOfKeys(Map<K, V> map, K... kArr) {
        return cn.hutool.core.map.h1.valuesOfKeys(map, new ArrayIter((Object[]) kArr));
    }

    public static Map<String, String> zip(String str, String str2, String str3, boolean z7) {
        return cn.hutool.core.util.h.zip(cn.hutool.core.text.l.splitToArray(str, str3), cn.hutool.core.text.l.splitToArray(str2, str3), z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Collection<T> addAll(Collection<T> collection, Object obj, Type type) {
        Iterator<String> it;
        Iterator<String> arrayIter;
        if (collection != 0 && obj != null) {
            if (cn.hutool.core.util.e1.isUnknown(type)) {
                type = Object.class;
            }
            if (obj instanceof Iterator) {
                it = (Iterator) obj;
            } else if (!(obj instanceof Iterable)) {
                if (obj instanceof Enumeration) {
                    arrayIter = new EnumerationIter<>((Enumeration) obj);
                } else if (cn.hutool.core.util.h.isArray(obj)) {
                    arrayIter = new ArrayIter<>(obj);
                } else {
                    it = obj instanceof CharSequence ? cn.hutool.core.text.l.splitTrim((CharSequence) cn.hutool.core.text.l.unWrap((CharSequence) obj, '[', ']'), ',').iterator() : newArrayList(obj).iterator();
                }
                it = arrayIter;
            } else if ((obj instanceof Map) && cn.hutool.core.bean.q.isBean(cn.hutool.core.util.e1.getClass(type))) {
                arrayIter = new ArrayIter<>((String[]) new Object[]{obj});
                it = arrayIter;
            } else {
                it = ((Iterable) obj).iterator();
            }
            ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
            while (it.hasNext()) {
                collection.add(converterRegistry.convert(type, it.next()));
            }
        }
        return collection;
    }

    public static <T> boolean contains(Collection<T> collection, Predicate<? super T> predicate) {
        boolean test;
        if (isEmpty((Collection<?>) collection)) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            test = predicate.test(it.next());
            if (test) {
                return true;
            }
        }
        return false;
    }

    public static <T> Collection<T> create(Class<?> cls, Class<T> cls2) {
        if (cls.isAssignableFrom(AbstractCollection.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet(new Comparator() { // from class: cn.hutool.core.collection.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$create$0;
                    lambda$create$0 = CollUtil.lambda$create$0(obj, obj2);
                    return lambda$create$0;
                }
            });
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) cn.hutool.core.lang.q.notNull(cls2));
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(LinkedList.class)) {
            return new LinkedList();
        }
        try {
            return (Collection) cn.hutool.core.util.y0.newInstance(cls, new Object[0]);
        } catch (Exception e8) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null || cls == superclass) {
                throw new UtilException(e8);
            }
            return create(superclass);
        }
    }

    public static <T extends Collection<E>, E> T defaultIfEmpty(T t7, Supplier<? extends T> supplier) {
        Object obj;
        if (!isEmpty((Collection<?>) t7)) {
            return t7;
        }
        obj = supplier.get();
        return (T) obj;
    }

    public static <T> List<T> emptyIfNull(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    public static List<Object> extract(Iterable<?> iterable, final cn.hutool.core.lang.z zVar, boolean z7) {
        zVar.getClass();
        return map(iterable, new Function() { // from class: cn.hutool.core.collection.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cn.hutool.core.lang.z.this.edit(obj);
            }
        }, z7);
    }

    public static <T> void forEach(Iterator<T> it, Consumer<T> consumer) {
        if (it == null) {
            return;
        }
        int i8 = 0;
        while (it.hasNext()) {
            consumer.c(it.next(), i8);
            i8++;
        }
    }

    @Deprecated
    public static Class<?> getElementType(Iterator<?> it) {
        return k0.getElementType(it);
    }

    public static List<Object> getFieldValues(Iterable<?> iterable, final String str, boolean z7) {
        return map(iterable, new Function() { // from class: cn.hutool.core.collection.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$getFieldValues$2;
                lambda$getFieldValues$2 = CollUtil.lambda$getFieldValues$2(str, obj);
                return lambda$getFieldValues$2;
            }
        }, z7);
    }

    public static <T> T getFirst(Iterator<T> it) {
        return (T) k0.getFirst(it);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return k0.isEmpty(iterable);
    }

    public static boolean isNotEmpty(Iterable<?> iterable) {
        return k0.isNotEmpty(iterable);
    }

    public static <T> String join(Iterable<T> iterable, CharSequence charSequence) {
        if (iterable == null) {
            return null;
        }
        return k0.join(iterable.iterator(), charSequence);
    }

    @SafeVarargs
    public static <T> List<T> list(boolean z7, T... tArr) {
        return n0.list(z7, tArr);
    }

    public static <T> ArrayList<T> newArrayList(Collection<T> collection) {
        return n0.toList((Collection) collection);
    }

    public static <T> HashSet<T> newHashSet(Collection<T> collection) {
        return newHashSet(false, (Collection) collection);
    }

    public static List<String> sortByPinyin(List<String> list) {
        return n0.sortByPinyin(list);
    }

    public static <T> List<T> sortByProperty(List<T> list, String str) {
        return n0.sortByProperty(list, str);
    }

    public static <T> List<T> sub(List<T> list, int i8, int i9, int i10) {
        return n0.sub(list, i8, i9, i10);
    }

    public static HashMap<Object, Object> toMap(Object[] objArr) {
        return cn.hutool.core.map.h1.of(objArr);
    }

    public static <K, V> ArrayList<V> valuesOfKeys(Map<K, V> map, Iterable<K> iterable) {
        return valuesOfKeys(map, iterable.iterator());
    }

    public static Map<String, String> zip(String str, String str2, String str3) {
        return zip(str, str2, str3, false);
    }

    public static <T> List<T> getFieldValues(Iterable<?> iterable, String str, Class<T> cls) {
        return cn.hutool.core.convert.d.toList(cls, getFieldValues(iterable, str));
    }

    public static boolean isEmpty(Iterator<?> it) {
        return k0.isEmpty(it);
    }

    public static boolean isNotEmpty(Iterator<?> it) {
        return k0.isNotEmpty(it);
    }

    public static <T> String join(Iterable<T> iterable, CharSequence charSequence, String str, String str2) {
        if (iterable == null) {
            return null;
        }
        return k0.join(iterable.iterator(), charSequence, str, str2);
    }

    public static <T> List<T> list(boolean z7, Collection<T> collection) {
        return n0.list(z7, (Collection) collection);
    }

    public static <T> ArrayList<T> newArrayList(Iterable<T> iterable) {
        return n0.toList(iterable);
    }

    public static <T> HashSet<T> newHashSet(boolean z7, Collection<T> collection) {
        return z7 ? new LinkedHashSet(collection) : new HashSet<>(collection);
    }

    public static <T> List<T> sort(List<T> list, Comparator<? super T> comparator) {
        return n0.sort(list, comparator);
    }

    public static <T> List<T> sub(Collection<T> collection, int i8, int i9) {
        return sub(collection, i8, i9, 1);
    }

    public static <K, V> Map<K, V> toMap(Iterable<V> iterable, Map<K, V> map, Func1<V, K> func1) {
        return k0.toMap(iterable == null ? null : iterable.iterator(), map, func1);
    }

    public static <K, V> ArrayList<V> valuesOfKeys(Map<K, V> map, Iterator<K> it) {
        return cn.hutool.core.map.h1.valuesOfKeys(map, it);
    }

    public static <K, V> Map<K, V> zip(Collection<K> collection, Collection<V> collection2) {
        if (!isEmpty((Collection<?>) collection) && !isEmpty((Collection<?>) collection2)) {
            int min = Math.min(collection.size(), collection2.size());
            HashMap newHashMap = cn.hutool.core.map.h1.newHashMap(min);
            Iterator<K> it = collection.iterator();
            Iterator<V> it2 = collection2.iterator();
            while (min > 0) {
                newHashMap.put(it.next(), it2.next());
                min--;
            }
            return newHashMap;
        }
        return cn.hutool.core.map.h1.empty();
    }

    public static <T> void forEach(Enumeration<T> enumeration, Consumer<T> consumer) {
        if (enumeration == null) {
            return;
        }
        int i8 = 0;
        while (enumeration.hasMoreElements()) {
            consumer.c(enumeration.nextElement(), i8);
            i8++;
        }
    }

    public static boolean isEmpty(Enumeration<?> enumeration) {
        return enumeration == null || !enumeration.hasMoreElements();
    }

    public static boolean isNotEmpty(Enumeration<?> enumeration) {
        return enumeration != null && enumeration.hasMoreElements();
    }

    @Deprecated
    public static <T> String join(Iterator<T> it, CharSequence charSequence) {
        return k0.join(it, charSequence);
    }

    public static <T> List<T> list(boolean z7, Iterable<T> iterable) {
        return n0.list(z7, iterable);
    }

    public static <T> ArrayList<T> newArrayList(Iterator<T> it) {
        return n0.toList(it);
    }

    public static <T> HashSet<T> newHashSet(boolean z7, Iterator<T> it) {
        if (it == null) {
            return set(z7, null);
        }
        HashSet<T> linkedHashSet = z7 ? new LinkedHashSet<>() : new HashSet<>();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <K, V> TreeMap<K, V> sort(Map<K, V> map, Comparator<? super K> comparator) {
        TreeMap<K, V> treeMap = new TreeMap<>(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static <T> List<T> sub(Collection<T> collection, int i8, int i9, int i10) {
        if (isEmpty((Collection<?>) collection)) {
            return n0.empty();
        }
        return sub(collection instanceof List ? (List) collection : n0.toList((Collection) collection), i8, i9, i10);
    }

    public static <K, V, E> Map<K, V> toMap(Iterable<E> iterable, Map<K, V> map, Func1<E, K> func1, Func1<E, V> func12) {
        return k0.toMap(iterable == null ? null : iterable.iterator(), map, func1, func12);
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return cn.hutool.core.map.h1.isEmpty(map);
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return cn.hutool.core.map.h1.isNotEmpty(map);
    }

    public static <T> List<T> list(boolean z7, Iterator<T> it) {
        return n0.list(z7, it);
    }

    public static <T> ArrayList<T> newArrayList(Enumeration<T> enumeration) {
        return n0.toList(enumeration);
    }

    public static <T, K> List<T> distinct(Collection<T> collection, Function<T, K> function, boolean z7) {
        if (isEmpty((Collection<?>) collection)) {
            return new ArrayList();
        }
        UniqueKeySet uniqueKeySet = new UniqueKeySet(true, (Function) function);
        if (z7) {
            uniqueKeySet.addAll(collection);
        } else {
            uniqueKeySet.addAllIfAbsent(collection);
        }
        return new ArrayList(uniqueKeySet);
    }

    public static <K, V> void forEach(Map<K, V> map, KVConsumer<K, V> kVConsumer) {
        if (map == null) {
            return;
        }
        int i8 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            kVConsumer.a(entry.getKey(), entry.getValue(), i8);
            i8++;
        }
    }

    public static <T> List<T> list(boolean z7, Enumeration<T> enumeration) {
        return n0.list(z7, enumeration);
    }

    public static <T> List<T> popPart(Deque<T> deque, int i8) {
        if (isEmpty((Collection<?>) deque)) {
            return n0.empty();
        }
        ArrayList arrayList = new ArrayList();
        int size = deque.size();
        int i9 = 0;
        if (size > i8) {
            while (i9 < i8) {
                arrayList.add(deque.pop());
                i9++;
            }
        } else {
            while (i9 < size) {
                arrayList.add(deque.pop());
                i9++;
            }
        }
        return arrayList;
    }

    public static <T> HashSet<T> newHashSet(boolean z7, Enumeration<T> enumeration) {
        if (enumeration == null) {
            return set(z7, null);
        }
        HashSet<T> linkedHashSet = z7 ? new LinkedHashSet<>() : new HashSet<>();
        while (enumeration.hasMoreElements()) {
            linkedHashSet.add(enumeration.nextElement());
        }
        return linkedHashSet;
    }

    public static <T extends Collection<E>, E> List<E> removeWithAddIf(T t7, Predicate<? super E> predicate) {
        ArrayList arrayList = new ArrayList();
        removeWithAddIf(t7, arrayList, predicate);
        return arrayList;
    }

    @SafeVarargs
    public static <T> Collection<T> intersection(Collection<T> collection, Collection<T> collection2, Collection<T>... collectionArr) {
        Collection<T> intersection = intersection(collection, collection2);
        if (isEmpty((Collection<?>) intersection)) {
            return intersection;
        }
        for (Collection<T> collection3 : collectionArr) {
            intersection = intersection(intersection, collection3);
            if (isEmpty((Collection<?>) intersection)) {
                return intersection;
            }
        }
        return intersection;
    }

    @SafeVarargs
    public static <T> Collection<T> union(Collection<T> collection, Collection<T> collection2, Collection<T>... collectionArr) {
        Collection<T> union = union(collection, collection2);
        for (Collection<T> collection3 : collectionArr) {
            if (!isEmpty((Collection<?>) collection3)) {
                union = union(union, collection3);
            }
        }
        return union;
    }

    public static <T> Collection<T> addAll(Collection<T> collection, Iterator<T> it) {
        if (collection != null && it != null) {
            while (it.hasNext()) {
                collection.add(it.next());
            }
        }
        return collection;
    }

    public static <T> Collection<T> addAll(Collection<T> collection, Iterable<T> iterable) {
        return iterable == null ? collection : addAll((Collection) collection, (Iterator) iterable.iterator());
    }

    public static <T> Collection<T> addAll(Collection<T> collection, Enumeration<T> enumeration) {
        if (collection != null && enumeration != null) {
            while (enumeration.hasMoreElements()) {
                collection.add(enumeration.nextElement());
            }
        }
        return collection;
    }

    public static <T> Collection<T> addAll(Collection<T> collection, T[] tArr) {
        if (collection != null && tArr != null) {
            Collections.addAll(collection, tArr);
        }
        return collection;
    }
}
