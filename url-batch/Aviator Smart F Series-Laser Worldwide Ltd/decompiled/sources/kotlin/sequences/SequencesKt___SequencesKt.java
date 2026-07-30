package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.b0;
import kotlin.collections.c0;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.comparisons.g;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {

    public static final class a implements Iterable, g6.a {
        final /* synthetic */ m $this_asIterable$inlined;

        public a(m mVar) {
            this.$this_asIterable$inlined = mVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.$this_asIterable$inlined.iterator();
        }
    }

    public static final class b implements b0 {
        final /* synthetic */ f6.l $keySelector;
        final /* synthetic */ m $this_groupingBy;

        public b(m mVar, f6.l lVar) {
            this.$this_groupingBy = mVar;
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

    public static final class c implements m {
        final /* synthetic */ m $this_sorted;

        c(m mVar) {
            this.$this_sorted = mVar;
        }

        @Override // kotlin.sequences.m
        public Iterator<T> iterator() {
            List mutableList = SequencesKt___SequencesKt.toMutableList(this.$this_sorted);
            kotlin.collections.u.sort(mutableList);
            return mutableList.iterator();
        }
    }

    public static final class d implements m {
        final /* synthetic */ Comparator<? super T> $comparator;
        final /* synthetic */ m $this_sortedWith;

        d(m mVar, Comparator<? super T> comparator) {
            this.$this_sortedWith = mVar;
            this.$comparator = comparator;
        }

        @Override // kotlin.sequences.m
        public Iterator<T> iterator() {
            List mutableList = SequencesKt___SequencesKt.toMutableList(this.$this_sortedWith);
            kotlin.collections.u.sortWith(mutableList, this.$comparator);
            return mutableList.iterator();
        }
    }

    public static final <T> boolean all(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    public static <T> Iterable<T> asIterable(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return new a(mVar);
    }

    private static final <T> m asSequence(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(m mVar, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) transform.invoke(it.next());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(m mVar, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            linkedHashMap.put(keySelector.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(m mVar, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (Object obj : mVar) {
            destination.put(keySelector.invoke(obj), obj);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(m mVar, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) transform.invoke(it.next());
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(m mVar, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            linkedHashMap.put(obj, valueSelector.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(m mVar, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (Object obj : mVar) {
            destination.put(obj, valueSelector.invoke(obj));
        }
        return destination;
    }

    public static final double averageOfByte(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += ((Number) it.next()).byteValue();
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

    public static final double averageOfDouble(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += ((Number) it.next()).doubleValue();
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

    public static final double averageOfFloat(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += ((Number) it.next()).floatValue();
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

    public static final double averageOfInt(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += ((Number) it.next()).intValue();
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

    public static final double averageOfLong(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += ((Number) it.next()).longValue();
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

    public static final double averageOfShort(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            d8 += ((Number) it.next()).shortValue();
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

    public static final <T> m chunked(m mVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return windowed(mVar, i8, i8, true);
    }

    public static <T> boolean contains(m mVar, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return indexOf(mVar, t7) >= 0;
    }

    public static <T> int count(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
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

    public static final <T> m distinct(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return distinctBy(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$distinct$1
            @Override // f6.l
            public final T invoke(T t7) {
                return t7;
            }
        });
    }

    public static final <T, K> m distinctBy(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return new kotlin.sequences.c(mVar, selector);
    }

    public static <T> m drop(m mVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        if (i8 >= 0) {
            return i8 == 0 ? mVar : mVar instanceof e ? ((e) mVar).drop(i8) : new kotlin.sequences.d(mVar, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> m dropWhile(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return new f(mVar, predicate);
    }

    public static final <T> T elementAt(m mVar, final int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return (T) elementAtOrElse(mVar, i8, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T invoke(int i9) {
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i8 + '.');
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        });
    }

    public static final <T> T elementAtOrElse(m mVar, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        if (i8 < 0) {
            return (T) defaultValue.invoke(Integer.valueOf(i8));
        }
        Iterator<Object> it = mVar.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            T t7 = (T) it.next();
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t7;
            }
            i9 = i10;
        }
        return (T) defaultValue.invoke(Integer.valueOf(i8));
    }

    public static final <T> T elementAtOrNull(m mVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        if (i8 < 0) {
            return null;
        }
        Iterator<Object> it = mVar.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            T t7 = (T) it.next();
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t7;
            }
            i9 = i10;
        }
        return null;
    }

    public static final <T> m filter(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return new h(mVar, true, predicate);
    }

    public static final <T> m filterIndexed(m mVar, final f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return new w(new h(new k(mVar), true, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$1
            {
                super(1);
            }

            @Override // f6.l
            public final Boolean invoke(c0 it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return (Boolean) f6.p.this.invoke(Integer.valueOf(it.getIndex()), it.getValue());
            }
        }), new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$2
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // f6.l
            public final T invoke(c0 it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return it.getValue();
            }
        });
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(m mVar, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i8), obj)).booleanValue()) {
                destination.add(obj);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final /* synthetic */ <R> m filterIsInstance(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.needClassReification();
        m filter = filter(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIsInstance$1
            @Override // f6.l
            public final Boolean invoke(Object obj) {
                kotlin.jvm.internal.s.reifiedOperationMarker(3, "R");
                return Boolean.valueOf(obj instanceof Object);
            }
        });
        kotlin.jvm.internal.s.checkNotNull(filter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return filter;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(m mVar, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (Object obj : mVar) {
            kotlin.jvm.internal.s.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> m filterNot(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return new h(mVar, false, predicate);
    }

    public static final <T> m filterNotNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        m filterNot = filterNot(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            @Override // f6.l
            public final Boolean invoke(T t7) {
                return Boolean.valueOf(t7 == 0);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((SequencesKt___SequencesKt$filterNotNull$1) obj);
            }
        });
        kotlin.jvm.internal.s.checkNotNull(filterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return filterNot;
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(m mVar, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (Object obj : mVar) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(m mVar, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (Object obj : mVar) {
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(m mVar, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                destination.add(obj);
            }
        }
        return destination;
    }

    private static final <T> T find(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        return null;
    }

    private static final <T> T findLast(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                t7 = (T) obj;
            }
        }
        return t7;
    }

    public static final <T> T first(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    private static final <T, R> R firstNotNullOf(m mVar, f6.l transform) {
        R r8;
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
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
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    private static final <T, R> R firstNotNullOfOrNull(m mVar, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            R r8 = (R) transform.invoke(it.next());
            if (r8 != null) {
                return r8;
            }
        }
        return null;
    }

    public static <T> T firstOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }

    public static final <T, R> m flatMap(m mVar, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return new i(mVar, transform, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    public static final <T, R> m flatMapIndexedIterable(m mVar, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(mVar, transform, SequencesKt___SequencesKt$flatMapIndexed$1.INSTANCE);
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(m mVar, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i8), obj));
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R> m flatMapIndexedSequence(m mVar, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(mVar, transform, SequencesKt___SequencesKt$flatMapIndexed$2.INSTANCE);
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(m mVar, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            kotlin.collections.v.addAll(destination, (m) transform.invoke(Integer.valueOf(i8), obj));
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R> m flatMapIterable(m mVar, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return new i(mVar, transform, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(m mVar, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(m mVar, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            kotlin.collections.v.addAll(destination, (m) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(m mVar, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
        }
        return r8;
    }

    public static final <T, R> R foldIndexed(m mVar, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, obj);
            i8 = i9;
        }
        return r8;
    }

    public static final <T> void forEach(m mVar, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(m mVar, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i8), obj);
            i8 = i9;
        }
    }

    public static final <T, K> Map<K, List<T>> groupBy(m mVar, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            Object invoke = keySelector.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(m mVar, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (Object obj : mVar) {
            Object invoke = keySelector.invoke(obj);
            Object obj2 = destination.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                destination.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return destination;
    }

    public static final <T, K> b0 groupingBy(m mVar, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        return new b(mVar, keySelector);
    }

    public static final <T> int indexOf(m mVar, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        int i8 = 0;
        for (Object obj : mVar) {
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.s.areEqual(t7, obj)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (Object obj : mVar) {
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = -1;
        int i9 = 0;
        for (Object obj : mVar) {
            if (i9 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T, A extends Appendable> A joinTo(m mVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : mVar) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            kotlin.text.m.appendElement(buffer, obj, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(m mVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(mVar, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(mVar, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static <T> T last(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            t7 = (T) it.next();
        }
        return t7;
    }

    public static final <T> int lastIndexOf(m mVar, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        int i8 = -1;
        int i9 = 0;
        for (Object obj : mVar) {
            if (i9 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.s.areEqual(t7, obj)) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T> T lastOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            t7 = (T) it.next();
        }
        return t7;
    }

    public static <T, R> m map(m mVar, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return new w(mVar, transform);
    }

    public static final <T, R> m mapIndexed(m mVar, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return new v(mVar, transform);
    }

    public static final <T, R> m mapIndexedNotNull(m mVar, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return filterNotNull(new v(mVar, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(m mVar, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object invoke = transform.invoke(Integer.valueOf(i8), obj);
            if (invoke != null) {
                destination.add(invoke);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(m mVar, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i8), obj));
            i8 = i9;
        }
        return destination;
    }

    public static <T, R> m mapNotNull(m mVar, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return filterNotNull(new w(mVar, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(m mVar, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            Object invoke = transform.invoke(it.next());
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(m mVar, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        if (!it.hasNext()) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) < 0) {
                t7 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t7;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t7 = (T) it.next();
        if (!it.hasNext()) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) < 0) {
                t7 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t7;
    }

    private static final <T> double maxOf(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    private static final <T> Double m1205maxOfOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <T, R> R maxOfWith(m mVar, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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

    private static final <T, R> R maxOfWithOrNull(m mVar, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    public static final Double m1207maxOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final double maxOrThrow(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return doubleValue;
    }

    public static final <T> T maxWithOrNull(m mVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t7, next) < 0) {
                t7 = (T) next;
            }
        }
        return t7;
    }

    public static final <T> T maxWithOrThrow(m mVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t7, next) < 0) {
                t7 = (T) next;
            }
        }
        return t7;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        if (!it.hasNext()) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) > 0) {
                t7 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t7;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t7 = (T) it.next();
        if (!it.hasNext()) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) > 0) {
                t7 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t7;
    }

    private static final <T> double minOf(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    private static final <T> Double m1213minOfOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <T, R> R minOfWith(m mVar, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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

    private static final <T, R> R minOfWithOrNull(m mVar, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    public static final Double m1215minOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final double minOrThrow(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
        }
        return doubleValue;
    }

    public static final <T> T minWithOrNull(m mVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t7, next) > 0) {
                t7 = (T) next;
            }
        }
        return t7;
    }

    public static final <T> T minWithOrThrow(m mVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t7, next) > 0) {
                t7 = (T) next;
            }
        }
        return t7;
    }

    public static final <T> m minus(final m mVar, final T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return new m() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1
            @Override // kotlin.sequences.m
            public Iterator<T> iterator() {
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                m mVar2 = m.this;
                final T t8 = t7;
                return SequencesKt___SequencesKt.filter(mVar2, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Boolean invoke(T t9) {
                        boolean z7 = true;
                        if (!Ref$BooleanRef.this.element && kotlin.jvm.internal.s.areEqual(t9, t8)) {
                            Ref$BooleanRef.this.element = true;
                            z7 = false;
                        }
                        return Boolean.valueOf(z7);
                    }

                    @Override // f6.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$1$iterator$1) obj);
                    }
                }).iterator();
            }
        };
    }

    private static final <T> m minusElement(m mVar, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return minus(mVar, t7);
    }

    public static final <T> boolean none(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    public static final <T> m onEach(m mVar, final f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        return map(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$onEach$1
            {
                super(1);
            }

            @Override // f6.l
            public final T invoke(T t7) {
                f6.l.this.invoke(t7);
                return t7;
            }
        });
    }

    public static final <T> m onEachIndexed(m mVar, final f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        return mapIndexed(mVar, new f6.p() { // from class: kotlin.sequences.SequencesKt___SequencesKt$onEachIndexed$1
            {
                super(2);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (int) obj2);
            }

            public final T invoke(int i8, T t7) {
                f6.p.this.invoke(Integer.valueOf(i8), t7);
                return t7;
            }
        });
    }

    public static final <T> Pair<List<T>, List<T>> partition(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> m plus(m mVar, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(mVar, SequencesKt__SequencesKt.sequenceOf(t7)));
    }

    private static final <T> m plusElement(m mVar, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return plus(mVar, t7);
    }

    public static final <S, T extends S> S reduce(m mVar, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S s7 = (S) it.next();
        while (it.hasNext()) {
            s7 = (S) operation.invoke(s7, it.next());
        }
        return s7;
    }

    public static final <S, T extends S> S reduceIndexed(m mVar, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S s7 = (S) it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            s7 = (S) operation.invoke(Integer.valueOf(i8), s7, it.next());
            i8 = i9;
        }
        return s7;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(m mVar, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S s7 = (S) it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            s7 = (S) operation.invoke(Integer.valueOf(i8), s7, it.next());
            i8 = i9;
        }
        return s7;
    }

    public static final <S, T extends S> S reduceOrNull(m mVar, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S s7 = (S) it.next();
        while (it.hasNext()) {
            s7 = (S) operation.invoke(s7, it.next());
        }
        return s7;
    }

    public static final <T> m requireNoNulls(final m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return map(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$requireNoNulls$1
            {
                super(1);
            }

            @Override // f6.l
            public final T invoke(T t7) {
                if (t7 != 0) {
                    return t7;
                }
                throw new IllegalArgumentException("null element found in " + m.this + '.');
            }
        });
    }

    public static final <T, R> m runningFold(m mVar, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        return q.sequence(new SequencesKt___SequencesKt$runningFold$1(r8, mVar, operation, null));
    }

    public static final <T, R> m runningFoldIndexed(m mVar, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        return q.sequence(new SequencesKt___SequencesKt$runningFoldIndexed$1(r8, mVar, operation, null));
    }

    public static final <S, T extends S> m runningReduce(m mVar, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        return q.sequence(new SequencesKt___SequencesKt$runningReduce$1(mVar, operation, null));
    }

    public static final <S, T extends S> m runningReduceIndexed(m mVar, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        return q.sequence(new SequencesKt___SequencesKt$runningReduceIndexed$1(mVar, operation, null));
    }

    public static final <T, R> m scan(m mVar, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        return runningFold(mVar, r8, operation);
    }

    public static final <T, R> m scanIndexed(m mVar, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        return runningFoldIndexed(mVar, r8, operation);
    }

    public static final <T> T single(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T t7 = (T) it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return t7;
    }

    public static final <T> T singleOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        if (it.hasNext()) {
            return null;
        }
        return t7;
    }

    public static final <T extends Comparable<? super T>> m sorted(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return new c(mVar);
    }

    public static final <T, R extends Comparable<? super R>> m sortedBy(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(mVar, new g.a(selector));
    }

    public static final <T, R extends Comparable<? super R>> m sortedByDescending(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(mVar, new g.c(selector));
    }

    public static final <T extends Comparable<? super T>> m sortedDescending(m mVar) {
        Comparator reverseOrder;
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        reverseOrder = kotlin.comparisons.g.reverseOrder();
        return sortedWith(mVar, reverseOrder);
    }

    public static final <T> m sortedWith(m mVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return new d(mVar, comparator);
    }

    public static final <T> int sumBy(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Number) selector.invoke(it.next())).intValue();
        }
        return i8;
    }

    public static final <T> double sumByDouble(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d8 += ((Number) selector.invoke(it.next())).doubleValue();
        }
        return d8;
    }

    public static final int sumOfByte(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Number) it.next()).byteValue();
        }
        return i8;
    }

    private static final <T> double sumOfDouble(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d8 += ((Number) selector.invoke(it.next())).doubleValue();
        }
        return d8;
    }

    public static final float sumOfFloat(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        float f8 = 0.0f;
        while (it.hasNext()) {
            f8 += ((Number) it.next()).floatValue();
        }
        return f8;
    }

    private static final <T> int sumOfInt(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Number) selector.invoke(it.next())).intValue();
        }
        return i8;
    }

    private static final <T> long sumOfLong(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += ((Number) selector.invoke(it.next())).longValue();
        }
        return j8;
    }

    public static final int sumOfShort(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Number) it.next()).shortValue();
        }
        return i8;
    }

    private static final <T> int sumOfUInt(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(it.next())).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final <T> long sumOfULong(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(it.next())).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final <T> m take(m mVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        if (i8 >= 0) {
            return i8 == 0 ? SequencesKt__SequencesKt.emptySequence() : mVar instanceof e ? ((e) mVar).take(i8) : new t(mVar, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> m takeWhile(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return new u(mVar, predicate);
    }

    public static final <T, C extends Collection<? super T>> C toCollection(m mVar, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final <T> HashSet<T> toHashSet(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return (HashSet) toCollection(mVar, new HashSet());
    }

    public static <T> List<T> toList(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.q.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final <T> List<T> toMutableList(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return (List) toCollection(mVar, new ArrayList());
    }

    public static final <T> Set<T> toMutableSet(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> toSet(m mVar) {
        Set<T> of;
        Set<T> emptySet;
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            of = w0.setOf(next);
            return of;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> m windowed(m mVar, int i8, int i9, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SlidingWindowKt.windowedSequence(mVar, i8, i9, z7, false);
    }

    public static /* synthetic */ m windowed$default(m mVar, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowed(mVar, i8, i9, z7);
    }

    public static final <T> m withIndex(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return new k(mVar);
    }

    public static final <T, R> m zip(m mVar, m other) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return new l(mVar, other, new f6.p() { // from class: kotlin.sequences.SequencesKt___SequencesKt$zip$1
            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SequencesKt___SequencesKt$zip$1) obj, obj2);
            }

            @Override // f6.p
            public final Pair<T, R> invoke(T t7, R r8) {
                return y5.h.to(t7, r8);
            }
        });
    }

    public static final <T> m zipWithNext(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return zipWithNext(mVar, new f6.p() { // from class: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$1
            @Override // f6.p
            public final Pair<T, T> invoke(T t7, T t8) {
                return y5.h.to(t7, t8);
            }
        });
    }

    public static final <T> boolean any(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, R> m chunked(m mVar, int i8, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return windowed(mVar, i8, i8, true, transform);
    }

    public static final <T> int count(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue() && (i8 = i8 + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i8;
    }

    public static final <T> m minus(final m mVar, final T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? mVar : new m() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$2
            @Override // kotlin.sequences.m
            public Iterator<T> iterator() {
                m mVar2 = m.this;
                final T[] tArr = elements;
                return SequencesKt___SequencesKt.filterNot(mVar2, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$2$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Boolean invoke(T t7) {
                        return Boolean.valueOf(ArraysKt___ArraysKt.contains(tArr, t7));
                    }

                    @Override // f6.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$2$iterator$1) obj);
                    }
                }).iterator();
            }
        };
    }

    public static final <T> boolean none(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> m plus(m mVar, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return plus(mVar, (Iterable) kotlin.collections.k.asList(elements));
    }

    public static final <T, R> m windowed(m mVar, int i8, int i9, boolean z7, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return map(SlidingWindowKt.windowedSequence(mVar, i8, i9, z7, true), transform);
    }

    public static /* synthetic */ m windowed$default(m mVar, int i8, int i9, boolean z7, f6.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowed(mVar, i8, i9, z7, lVar);
    }

    public static final <T, R, V> m zip(m mVar, m other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return new l(mVar, other, transform);
    }

    public static final <T, R> m zipWithNext(m mVar, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return q.sequence(new SequencesKt___SequencesKt$zipWithNext$2(mVar, transform, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(m mVar, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object obj : mVar) {
            destination.put(keySelector.invoke(obj), valueTransform.invoke(obj));
        }
        return destination;
    }

    public static final <T> m plus(m mVar, Iterable<? extends T> elements) {
        m asSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        asSequence = CollectionsKt___CollectionsKt.asSequence(elements);
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(mVar, asSequence));
    }

    public static final double sumOfDouble(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d8 += ((Number) it.next()).doubleValue();
        }
        return d8;
    }

    public static final int sumOfInt(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Number) it.next()).intValue();
        }
        return i8;
    }

    public static final long sumOfLong(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += ((Number) it.next()).longValue();
        }
        return j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(m mVar, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            linkedHashMap.put(keySelector.invoke(obj), valueTransform.invoke(obj));
        }
        return linkedHashMap;
    }

    public static final <T> T firstOrNull(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        return null;
    }

    public static final <T> m minus(final m mVar, final Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return new m() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3
            @Override // kotlin.sequences.m
            public Iterator<T> iterator() {
                final Collection convertToListIfNotCollection = kotlin.collections.v.convertToListIfNotCollection(elements);
                return convertToListIfNotCollection.isEmpty() ? mVar.iterator() : SequencesKt___SequencesKt.filterNot(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Boolean invoke(T t7) {
                        return Boolean.valueOf(convertToListIfNotCollection.contains(t7));
                    }

                    @Override // f6.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$3$iterator$1) obj);
                    }
                }).iterator();
            }
        };
    }

    public static final <T> m plus(m mVar, m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(mVar, elements));
    }

    public static final <T> T first(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> m minus(final m mVar, final m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return new m() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$4
            @Override // kotlin.sequences.m
            public Iterator<T> iterator() {
                final List list = SequencesKt___SequencesKt.toList(m.this);
                return list.isEmpty() ? mVar.iterator() : SequencesKt___SequencesKt.filterNot(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$4$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Boolean invoke(T t7) {
                        return Boolean.valueOf(list.contains(t7));
                    }

                    @Override // f6.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$4$iterator$1) obj);
                    }
                }).iterator();
            }
        };
    }

    public static final <T> T singleOrNull(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        boolean z7 = false;
        T t7 = null;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (z7) {
                    return null;
                }
                z7 = true;
                t7 = (T) obj;
            }
        }
        if (z7) {
            return t7;
        }
        return null;
    }

    public static final <T> T lastOrNull(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                t7 = (T) obj;
            }
        }
        return t7;
    }

    public static final <T> T last(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        boolean z7 = false;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                z7 = true;
                t7 = (T) obj;
            }
        }
        if (z7) {
            return t7;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T single(m mVar, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        boolean z7 = false;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (z7) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z7 = true;
                t7 = (T) obj;
            }
        }
        if (z7) {
            return t7;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(m mVar, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object obj : mVar) {
            Object invoke = keySelector.invoke(obj);
            Object obj2 = destination.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                destination.put(invoke, obj2);
            }
            ((List) obj2).add(valueTransform.invoke(obj));
        }
        return destination;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m1203maxOf(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    private static final <T> Float m1206maxOfOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    public static final Float m1208maxOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m1209maxOrThrow(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m1211minOf(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    private static final <T> Float m1214minOfOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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
    public static final Float m1216minOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m1217minOrThrow(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, List<V>> groupBy(m mVar, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            Object invoke = keySelector.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(invoke, obj2);
            }
            ((List) obj2).add(valueTransform.invoke(obj));
        }
        return linkedHashMap;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1204maxOf(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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

    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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

    public static final <T extends Comparable<? super T>> T maxOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            if (t7.compareTo(comparable) < 0) {
                t7 = (T) comparable;
            }
        }
        return t7;
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1210maxOrThrow(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            T t7 = (T) it.next();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) it.next();
                if (t7.compareTo(comparable) < 0) {
                    t7 = (T) comparable;
                }
            }
            return t7;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1212minOf(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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

    private static final <T, R extends Comparable<? super R>> R minOfOrNull(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
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

    public static final <T extends Comparable<? super T>> T minOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t7 = (T) it.next();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            if (t7.compareTo(comparable) > 0) {
                t7 = (T) comparable;
            }
        }
        return t7;
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1218minOrThrow(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            T t7 = (T) it.next();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) it.next();
                if (t7.compareTo(comparable) > 0) {
                    t7 = (T) comparable;
                }
            }
            return t7;
        }
        throw new NoSuchElementException();
    }
}
