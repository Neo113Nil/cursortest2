package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.comparisons.g;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class CollectionsKt___CollectionsKt extends x {

    public static final class a implements kotlin.sequences.m {
        final /* synthetic */ Iterable $this_asSequence$inlined;

        public a(Iterable iterable) {
            this.$this_asSequence$inlined = iterable;
        }

        @Override // kotlin.sequences.m
        public Iterator<T> iterator() {
            return this.$this_asSequence$inlined.iterator();
        }
    }

    public static final class b implements b0 {
        final /* synthetic */ f6.l $keySelector;
        final /* synthetic */ Iterable<T> $this_groupingBy;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Iterable<? extends T> iterable, f6.l lVar) {
            this.$this_groupingBy = iterable;
            this.$keySelector = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [K, java.lang.Object] */
        @Override // kotlin.collections.b0
        public K keyOf(T t7) {
            return this.$keySelector.invoke(t7);
        }

        @Override // kotlin.collections.b0
        public Iterator<T> sourceIterator() {
            return this.$this_groupingBy.iterator();
        }
    }

    public static final <T> boolean all(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Iterable<T> asIterable(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable;
    }

    public static <T> kotlin.sequences.m asSequence(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return new a(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(Iterable<? extends T> iterable, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(r.collectionSizeOrDefault(iterable, 10));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) transform.invoke(it.next());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(Iterable<? extends T> iterable, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(r.collectionSizeOrDefault(iterable, 10));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t7 : iterable) {
            linkedHashMap.put(keySelector.invoke(t7), t7);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(Iterable<? extends T> iterable, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (T t7 : iterable) {
            destination.put(keySelector.invoke(t7), t7);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(Iterable<? extends T> iterable, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) transform.invoke(it.next());
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(Iterable<? extends K> iterable, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(r.collectionSizeOrDefault(iterable, 10));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (K k8 : iterable) {
            linkedHashMap.put(k8, valueSelector.invoke(k8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(Iterable<? extends K> iterable, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k8 : iterable) {
            destination.put(k8, valueSelector.invoke(k8));
        }
        return destination;
    }

    public static final double averageOfByte(Iterable<Byte> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += it.next().byteValue();
            i8++;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfDouble(Iterable<Double> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += it.next().doubleValue();
            i8++;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfFloat(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += it.next().floatValue();
            i8++;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfInt(Iterable<Integer> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += it.next().intValue();
            i8++;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfLong(Iterable<Long> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += it.next().longValue();
            i8++;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfShort(Iterable<Short> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += it.next().shortValue();
            i8++;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final <T> List<List<T>> chunked(Iterable<? extends T> iterable, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return windowed(iterable, i8, i8, true);
    }

    private static final <T> T component1(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.get(0);
    }

    private static final <T> T component2(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.get(1);
    }

    private static final <T> T component3(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.get(2);
    }

    private static final <T> T component4(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.get(3);
    }

    private static final <T> T component5(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.get(4);
    }

    public static <T> boolean contains(Iterable<? extends T> iterable, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t7) : indexOf(iterable, t7) >= 0;
    }

    public static final <T> int count(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i8;
    }

    public static final <T> List<T> distinct(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return toList(toMutableSet(iterable));
    }

    public static final <T, K> List<T> distinctBy(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (hashSet.add(selector.invoke(t7))) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static <T> List<T> drop(Iterable<? extends T> iterable, int i8) {
        ArrayList arrayList;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return toList(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i8;
            if (size <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (size == 1) {
                return q.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i8 < size2) {
                        arrayList.add(((List) iterable).get(i8));
                        i8++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i8);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i9 = 0;
        for (T t7 : iterable) {
            if (i9 >= i8) {
                arrayList.add(t7);
            } else {
                i9++;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> dropLast(List<? extends T> list, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (i8 >= 0) {
            List<? extends T> list2 = list;
            coerceAtLeast = j6.v.coerceAtLeast(list.size() - i8, 0);
            return take(list2, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> List<T> dropLastWhile(List<? extends T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                    return take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final <T> List<T> dropWhile(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (T t7 : iterable) {
            if (z7) {
                arrayList.add(t7);
            } else if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
                z7 = true;
            }
        }
        return arrayList;
    }

    public static final <T> T elementAt(Iterable<? extends T> iterable, final int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i8) : (T) elementAtOrElse(iterable, i8, new f6.l() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T invoke(int i9) {
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i8 + '.');
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        });
    }

    public static final <T> T elementAtOrElse(Iterable<? extends T> iterable, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i8 < 0 || i8 > CollectionsKt__CollectionsKt.getLastIndex(list)) ? (T) defaultValue.invoke(Integer.valueOf(i8)) : (T) list.get(i8);
        }
        if (i8 < 0) {
            return (T) defaultValue.invoke(Integer.valueOf(i8));
        }
        int i9 = 0;
        for (T t7 : iterable) {
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t7;
            }
            i9 = i10;
        }
        return (T) defaultValue.invoke(Integer.valueOf(i8));
    }

    public static final <T> T elementAtOrNull(Iterable<? extends T> iterable, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) getOrNull((List) iterable, i8);
        }
        if (i8 < 0) {
            return null;
        }
        int i9 = 0;
        for (T t7 : iterable) {
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t7;
            }
            i9 = i10;
        }
        return null;
    }

    public static final <T> List<T> filter(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(Iterable<? extends T> iterable, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i8), t7)).booleanValue()) {
                arrayList.add(t7);
            }
            i8 = i9;
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(Iterable<? extends T> iterable, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i8), t7)).booleanValue()) {
                destination.add(t7);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            kotlin.jvm.internal.s.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> iterable, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            kotlin.jvm.internal.s.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> List<T> filterNot(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterNotNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (T t7 : iterable) {
            if (t7 != null) {
                destination.add(t7);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(Iterable<? extends T> iterable, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : iterable) {
            if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                destination.add(t7);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(Iterable<? extends T> iterable, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : iterable) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                destination.add(t7);
            }
        }
        return destination;
    }

    private static final <T> T find(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : iterable) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        return null;
    }

    private static final <T> T findLast(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T> T first(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    private static final <T, R> R firstNotNullOf(Iterable<? extends T> iterable, f6.l transform) {
        R r8;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                r8 = null;
                break;
            }
            r8 = (R) transform.invoke(it.next());
            if (r8 != null) {
                break;
            }
        }
        if (r8 != null) {
            return r8;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    private static final <T, R> R firstNotNullOfOrNull(Iterable<? extends T> iterable, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R r8 = (R) transform.invoke(it.next());
            if (r8 != null) {
                return r8;
            }
        }
        return null;
    }

    public static <T> T firstOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T, R> List<R> flatMap(Iterable<? extends T> iterable, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v.addAll(arrayList, (Iterable) transform.invoke(it.next()));
        }
        return arrayList;
    }

    private static final <T, R> List<R> flatMapIndexedIterable(Iterable<? extends T> iterable, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i8), t7));
            i8 = i9;
        }
        return arrayList;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Iterable<? extends T> iterable, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i8), t7));
            i8 = i9;
        }
        return destination;
    }

    private static final <T, R> List<R> flatMapIndexedSequence(Iterable<? extends T> iterable, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            v.addAll(arrayList, (kotlin.sequences.m) transform.invoke(Integer.valueOf(i8), t7));
            i8 = i9;
        }
        return arrayList;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Iterable<? extends T> iterable, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            v.addAll(destination, (kotlin.sequences.m) transform.invoke(Integer.valueOf(i8), t7));
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R> List<R> flatMapSequence(Iterable<? extends T> iterable, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v.addAll(arrayList, (kotlin.sequences.m) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(Iterable<? extends T> iterable, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v.addAll(destination, (kotlin.sequences.m) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(Iterable<? extends T> iterable, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(Iterable<? extends T> iterable, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
        }
        return r8;
    }

    public static final <T, R> R foldIndexed(Iterable<? extends T> iterable, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, t7);
            i8 = i9;
        }
        return r8;
    }

    public static final <T, R> R foldRight(List<? extends T> list, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r8 = (R) operation.invoke(listIterator.previous(), r8);
            }
        }
        return r8;
    }

    public static final <T, R> R foldRightIndexed(List<? extends T> list, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r8 = (R) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r8);
            }
        }
        return r8;
    }

    public static final <T> void forEach(Iterable<? extends T> iterable, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(Iterable<? extends T> iterable, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i8), t7);
            i8 = i9;
        }
    }

    private static final <T> T getOrElse(List<? extends T> list, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > CollectionsKt__CollectionsKt.getLastIndex(list)) ? (T) defaultValue.invoke(Integer.valueOf(i8)) : list.get(i8);
    }

    public static <T> T getOrNull(List<? extends T> list, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (i8 < 0 || i8 > CollectionsKt__CollectionsKt.getLastIndex(list)) {
            return null;
        }
        return list.get(i8);
    }

    public static final <T, K> Map<K, List<T>> groupBy(Iterable<? extends T> iterable, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t7 : iterable) {
            Object invoke = keySelector.invoke(t7);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(t7);
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(Iterable<? extends T> iterable, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (T t7 : iterable) {
            Object invoke = keySelector.invoke(t7);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(t7);
        }
        return destination;
    }

    public static final <T, K> b0 groupingBy(Iterable<? extends T> iterable, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        return new b(iterable, keySelector);
    }

    public static final <T> int indexOf(Iterable<? extends T> iterable, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t7);
        }
        int i8 = 0;
        for (T t8 : iterable) {
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.s.areEqual(t7, t8)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (T t7 : iterable) {
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = -1;
        int i9 = 0;
        for (T t7 : iterable) {
            if (i9 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T> Set<T> intersect(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T, A extends Appendable> A joinTo(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (T t7 : iterable) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            kotlin.text.m.appendElement(buffer, t7, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(iterable, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        int i10 = (i9 & 8) != 0 ? -1 : i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(iterable, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final <T> T last(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> int lastIndexOf(Iterable<? extends T> iterable, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t7);
        }
        int i8 = -1;
        int i9 = 0;
        for (T t8 : iterable) {
            if (i9 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.s.areEqual(t7, t8)) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T, R> List<R> map(Iterable<? extends T> iterable, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(Iterable<? extends T> iterable, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i8), t7));
            i8 = i9;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(Iterable<? extends T> iterable, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object invoke = transform.invoke(Integer.valueOf(i8), t7);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i8 = i9;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(Iterable<? extends T> iterable, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object invoke = transform.invoke(Integer.valueOf(i8), t7);
            if (invoke != null) {
                destination.add(invoke);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(Iterable<? extends T> iterable, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (T t7 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i8), t7));
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(Iterable<? extends T> iterable, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object invoke = transform.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(Iterable<? extends T> iterable, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object invoke = transform.invoke(it.next());
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(Iterable<? extends T> iterable, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    private static final <T> double maxOf(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m432maxOfOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <T, R> R maxOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke = selector.invoke(it.next());
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <T, R> R maxOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke = selector.invoke(it.next());
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m434maxOrNull(Iterable<Double> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final double maxOrThrow(Iterable<Double> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T maxWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T maxWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    private static final <T> double minOf(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m440minOfOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <T, R> R minOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke = selector.invoke(it.next());
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <T, R> R minOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke = selector.invoke(it.next());
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m442minOrNull(Iterable<Double> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final double minOrThrow(Iterable<Double> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T minWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T minWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        boolean z7 = false;
        for (T t8 : iterable) {
            boolean z8 = true;
            if (!z7 && kotlin.jvm.internal.s.areEqual(t8, t7)) {
                z7 = true;
                z8 = false;
            }
            if (z8) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    private static final <T> List<T> minusElement(Iterable<? extends T> iterable, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return minus(iterable, t7);
    }

    public static final <T> boolean none(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static final <T, C extends Iterable<? extends T>> C onEach(C c8, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(c8, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        Iterator<T> it = c8.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return c8;
    }

    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(C c8, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(c8, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int i8 = 0;
        for (T t7 : c8) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i8), t7);
            i8 = i9;
        }
        return c8;
    }

    public static final <T> Pair<List<T>, List<T>> partition(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t7 : iterable) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
            } else {
                arrayList2.add(t7);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object) t7);
        }
        ArrayList arrayList = new ArrayList();
        v.addAll(arrayList, iterable);
        arrayList.add(t7);
        return arrayList;
    }

    private static final <T> List<T> plusElement(Iterable<? extends T> iterable, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return plus(iterable, t7);
    }

    private static final <T> T random(Collection<? extends T> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return (T) random(collection, Random.Default);
    }

    private static final <T> T randomOrNull(Collection<? extends T> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return (T) randomOrNull(collection, Random.Default);
    }

    public static final <S, T extends S> S reduce(Iterable<? extends T> iterable, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = (S) operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(Iterable<? extends T> iterable, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = (S) operation.invoke(Integer.valueOf(i8), next, it.next());
            i8 = i9;
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(Iterable<? extends T> iterable, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = (S) operation.invoke(Integer.valueOf(i8), next, it.next());
            i8 = i9;
        }
        return next;
    }

    public static final <S, T extends S> S reduceOrNull(Iterable<? extends T> iterable, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = (S) operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceRight(List<? extends T> list, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        T previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = (S) operation.invoke(listIterator.previous(), previous);
        }
        return previous;
    }

    public static final <S, T extends S> S reduceRightIndexed(List<? extends T> list, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        T previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = (S) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
        }
        return previous;
    }

    public static final <S, T extends S> S reduceRightIndexedOrNull(List<? extends T> list, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        T previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = (S) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
        }
        return previous;
    }

    public static final <S, T extends S> S reduceRightOrNull(List<? extends T> list, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        T previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = (S) operation.invoke(listIterator.previous(), previous);
        }
        return previous;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Iterable<T> requireNoNulls(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    public static final <T> List<T> reversed(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        x.reverse(mutableList);
        return mutableList;
    }

    public static final <T, R> List<R> runningFold(Iterable<? extends T> iterable, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> runningFoldIndexed(Iterable<? extends T> iterable, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, it.next());
            arrayList.add(r8);
            i8++;
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduce(Iterable<? extends T> iterable, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduceIndexed(Iterable<? extends T> iterable, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i8 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i8), next, it.next());
            arrayList.add(next);
            i8++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> scan(Iterable<? extends T> iterable, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> scanIndexed(Iterable<? extends T> iterable, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, it.next());
            arrayList.add(r8);
            i8++;
        }
        return arrayList;
    }

    public static final <T> void shuffle(List<T> list, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            list.set(nextInt, list.set(lastIndex, list.get(nextInt)));
        }
    }

    public static <T> T single(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> List<T> slice(List<? extends T> list, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : toList(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(List<T> list, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            u.sortWith(list, new g.a(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(List<T> list, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            u.sortWith(list, new g.c(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(List<T> list) {
        Comparator reverseOrder;
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        reverseOrder = kotlin.comparisons.g.reverseOrder();
        u.sortWith(list, reverseOrder);
    }

    public static final <T extends Comparable<? super T>> List<T> sorted(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            u.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        k.sort(array);
        return k.asList(array);
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(iterable, new g.a(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(iterable, new g.c(selector));
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(Iterable<? extends T> iterable) {
        Comparator reverseOrder;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        reverseOrder = kotlin.comparisons.g.reverseOrder();
        return sortedWith(iterable, reverseOrder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> sortedWith(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            u.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        k.sortWith(array, comparator);
        return k.asList(array);
    }

    public static final <T> Set<T> subtract(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> int sumBy(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Number) selector.invoke(it.next())).intValue();
        }
        return i8;
    }

    public static final <T> double sumByDouble(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d8 += ((Number) selector.invoke(it.next())).doubleValue();
        }
        return d8;
    }

    public static final int sumOfByte(Iterable<Byte> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += it.next().byteValue();
        }
        return i8;
    }

    private static final <T> double sumOfDouble(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d8 += ((Number) selector.invoke(it.next())).doubleValue();
        }
        return d8;
    }

    public static final float sumOfFloat(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float f8 = 0.0f;
        while (it.hasNext()) {
            f8 += it.next().floatValue();
        }
        return f8;
    }

    private static final <T> int sumOfInt(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Number) selector.invoke(it.next())).intValue();
        }
        return i8;
    }

    private static final <T> long sumOfLong(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += ((Number) selector.invoke(it.next())).longValue();
        }
        return j8;
    }

    public static final int sumOfShort(Iterable<Short> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += it.next().shortValue();
        }
        return i8;
    }

    private static final <T> int sumOfUInt(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(it.next())).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final <T> long sumOfULong(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(it.next())).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final <T> List<T> take(Iterable<? extends T> iterable, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i8 >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i8 == 1) {
                return q.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i8);
        Iterator<? extends T> it = iterable.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static final <T> List<T> takeLast(List<? extends T> list, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int size = list.size();
        if (i8 >= size) {
            return toList(list);
        }
        if (i8 == 1) {
            return q.listOf(last((List) list));
        }
        ArrayList arrayList = new ArrayList(i8);
        if (list instanceof RandomAccess) {
            for (int i9 = size - i8; i9 < size; i9++) {
                arrayList.add(list.get(i9));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i8);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(List<? extends T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return toList(list);
    }

    public static final <T> List<T> takeWhile(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                break;
            }
            arrayList.add(t7);
        }
        return arrayList;
    }

    public static final boolean[] toBooleanArray(Collection<Boolean> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr[i8] = it.next().booleanValue();
            i8++;
        }
        return zArr;
    }

    public static final byte[] toByteArray(Collection<Byte> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            bArr[i8] = it.next().byteValue();
            i8++;
        }
        return bArr;
    }

    public static final char[] toCharArray(Collection<Character> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            cArr[i8] = it.next().charValue();
            i8++;
        }
        return cArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final double[] toDoubleArray(Collection<Double> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            dArr[i8] = it.next().doubleValue();
            i8++;
        }
        return dArr;
    }

    public static final float[] toFloatArray(Collection<Float> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            fArr[i8] = it.next().floatValue();
            i8++;
        }
        return fArr;
    }

    public static final <T> HashSet<T> toHashSet(Iterable<? extends T> iterable) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        mapCapacity = l0.mapCapacity(r.collectionSizeOrDefault(iterable, 12));
        return (HashSet) toCollection(iterable, new HashSet(mapCapacity));
    }

    public static final int[] toIntArray(Collection<Integer> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = it.next().intValue();
            i8++;
        }
        return iArr;
    }

    public static <T> List<T> toList(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.optimizeReadOnlyList(toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (size != 1) {
            return toMutableList(collection);
        }
        return q.listOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] toLongArray(Collection<Long> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = it.next().longValue();
            i8++;
        }
        return jArr;
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? toMutableList((Collection) iterable) : (List) toCollection(iterable, new ArrayList());
    }

    public static final <T> Set<T> toMutableSet(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> toSet(Iterable<? extends T> iterable) {
        Set<T> emptySet;
        Set<T> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return x0.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (size != 1) {
            mapCapacity = l0.mapCapacity(collection.size());
            return (Set) toCollection(iterable, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        return of;
    }

    public static final short[] toShortArray(Collection<Short> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            sArr[i8] = it.next().shortValue();
            i8++;
        }
        return sArr;
    }

    public static final <T> Set<T> union(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> List<List<T>> windowed(Iterable<? extends T> iterable, int i8, int i9, boolean z7) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        SlidingWindowKt.checkWindowSizeStep(i8, i9);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator windowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i8, i9, z7, false);
            while (windowedIterator.hasNext()) {
                arrayList.add((List) windowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i9) + (size % i9 == 0 ? 0 : 1));
        int i10 = 0;
        while (i10 >= 0 && i10 < size) {
            coerceAtMost = j6.v.coerceAtMost(i8, size - i10);
            if (coerceAtMost < i8 && !z7) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(coerceAtMost);
            for (int i11 = 0; i11 < coerceAtMost; i11++) {
                arrayList3.add(list.get(i11 + i10));
            }
            arrayList2.add(arrayList3);
            i10 += i9;
        }
        return arrayList2;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowed(iterable, i8, i9, z7);
    }

    public static final <T> Iterable<c0> withIndex(final Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<T> invoke() {
                return iterable.iterator();
            }
        });
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), length));
        int i8 = 0;
        for (T t7 : iterable) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t7, other[i8]));
            i8++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> zipWithNext(Iterable<? extends T> iterable, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T, R> List<R> chunked(Iterable<? extends T> iterable, int i8, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return windowed(iterable, i8, i8, true, transform);
    }

    private static final <T> List<T> plusElement(Collection<? extends T> collection, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return plus((Collection) collection, (Object) t7);
    }

    public static final <T> T random(Collection<? extends T> collection, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <T> T randomOrNull(Collection<? extends T> collection, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i8, int i9, boolean z7, f6.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowed(iterable, i8, i9, z7, lVar);
    }

    public static final <T> boolean any(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(Iterable<? extends T> iterable, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t7 : iterable) {
            destination.put(keySelector.invoke(t7), valueTransform.invoke(t7));
        }
        return destination;
    }

    private static final <T> int count(Collection<? extends T> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    private static final <T> T findLast(List<? extends T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (((Boolean) predicate.invoke(previous)).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    public static final <T> boolean none(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> requireNoNulls(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    public static final <T> List<T> slice(List<? extends T> list, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    public static final double sumOfDouble(Iterable<Double> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d8 += it.next().doubleValue();
        }
        return d8;
    }

    public static final int sumOfInt(Iterable<Integer> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += it.next().intValue();
        }
        return i8;
    }

    public static final long sumOfLong(Iterable<Long> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += it.next().longValue();
        }
        return j8;
    }

    public static final <T> int count(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue() && (i8 = i8 + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i8;
    }

    private static final <T> T elementAt(List<? extends T> list, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.get(i8);
    }

    public static final <T> int indexOfFirst(List<? extends T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(List<? extends T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static <T> List<T> toMutableList(Collection<? extends T> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(Iterable<? extends T> iterable, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(r.collectionSizeOrDefault(iterable, 10));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t7 : iterable) {
            linkedHashMap.put(keySelector.invoke(t7), valueTransform.invoke(t7));
        }
        return linkedHashMap;
    }

    public static final <T> int indexOf(List<? extends T> list, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.indexOf(t7);
    }

    public static final <T> int lastIndexOf(List<? extends T> list, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t7);
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (!ArraysKt___ArraysKt.contains(elements, t7)) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t7);
        return arrayList;
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), r.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    private static final <T> T elementAtOrNull(List<? extends T> list, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return (T) getOrNull(list, i8);
    }

    public static <T> T first(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T singleOrNull(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T lastOrNull(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        boolean z7 = false;
        T t7 = null;
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                if (z7) {
                    return null;
                }
                z7 = true;
                t7 = t8;
            }
        }
        if (z7) {
            return t7;
        }
        return null;
    }

    private static final <T> T elementAtOrElse(List<? extends T> list, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > CollectionsKt__CollectionsKt.getLastIndex(list)) ? (T) defaultValue.invoke(Integer.valueOf(i8)) : list.get(i8);
    }

    public static final <T> T firstOrNull(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : iterable) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(Iterable<? extends T> iterable, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t7 : iterable) {
            Object invoke = keySelector.invoke(t7);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(t7));
        }
        return destination;
    }

    public static <T> T last(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(CollectionsKt__CollectionsKt.getLastIndex(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                t7 = t8;
            }
        }
        return t7;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m430maxOf(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) selector.invoke(it.next())).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(it.next())).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m433maxOfOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(it.next())).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(it.next())).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m435maxOrNull(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m436maxOrThrow(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m438minOf(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) selector.invoke(it.next())).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(it.next())).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m441minOfOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(it.next())).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(it.next())).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m443minOrNull(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m444minOrThrow(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object[]) elements);
        }
        ArrayList arrayList = new ArrayList();
        v.addAll(arrayList, iterable);
        v.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> T single(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> List<Pair<T, T>> zipWithNext(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(y5.h.to(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> T first(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : iterable) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, List<V>> groupBy(Iterable<? extends T> iterable, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t7 : iterable) {
            Object invoke = keySelector.invoke(t7);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(t7));
        }
        return linkedHashMap;
    }

    public static final <T> T lastOrNull(List<? extends T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (((Boolean) predicate.invoke(previous)).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Collection convertToListIfNotCollection = v.convertToListIfNotCollection(elements);
        if (convertToListIfNotCollection.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (!convertToListIfNotCollection.contains(t7)) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), length));
        int i8 = 0;
        for (T t7 : iterable) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(t7, other[i8]));
            i8++;
        }
        return arrayList;
    }

    public static final <T> T last(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        boolean z7 = false;
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                z7 = true;
                t7 = t8;
            }
        }
        if (z7) {
            return t7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        v.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> T single(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        boolean z7 = false;
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                if (z7) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z7 = true;
                t7 = t8;
            }
        }
        if (z7) {
            return t7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T, R> List<R> windowed(Iterable<? extends T> iterable, int i8, int i9, boolean z7, f6.l transform) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i8, i9);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i10 = 0;
            ArrayList arrayList = new ArrayList((size / i9) + (size % i9 == 0 ? 0 : 1));
            p0 p0Var = new p0(list);
            while (i10 >= 0 && i10 < size) {
                coerceAtMost = j6.v.coerceAtMost(i8, size - i10);
                if (!z7 && coerceAtMost < i8) {
                    break;
                }
                p0Var.move(i10, coerceAtMost + i10);
                arrayList.add(transform.invoke(p0Var));
                i10 += i9;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator windowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i8, i9, z7, true);
        while (windowedIterator.hasNext()) {
            arrayList2.add(transform.invoke((List) windowedIterator.next()));
        }
        return arrayList2;
    }

    public static final <T> T last(List<? extends T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (((Boolean) predicate.invoke(previous)).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m431maxOf(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R r8 = (R) selector.invoke(it.next());
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(it.next());
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(it.next());
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    public static final <T extends Comparable<? super T>> T maxOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m437maxOrThrow(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m439minOf(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R r8 = (R) selector.invoke(it.next());
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(it.next());
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <T, R extends Comparable<? super R>> R minOfOrNull(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(it.next());
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    public static <T extends Comparable<? super T>> T minOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m445minOrThrow(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Iterable) elements);
        }
        ArrayList arrayList = new ArrayList();
        v.addAll(arrayList, iterable);
        v.addAll(arrayList, elements);
        return arrayList;
    }

    public static <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), r.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(y5.h.to(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        List list = SequencesKt___SequencesKt.toList(elements);
        if (list.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (!list.contains(t7)) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        v.addAll(arrayList2, elements);
        return arrayList2;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList();
        v.addAll(arrayList, iterable);
        v.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        v.addAll(arrayList, elements);
        return arrayList;
    }
}
