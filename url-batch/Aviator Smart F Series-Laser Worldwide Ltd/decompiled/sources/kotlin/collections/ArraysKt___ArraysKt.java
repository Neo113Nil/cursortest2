package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.comparisons.g;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ArraysKt___ArraysKt extends kotlin.collections.k {

    public static final class a implements Iterable, g6.a {
        final /* synthetic */ Object[] $this_asIterable$inlined;

        public a(Object[] objArr) {
            this.$this_asIterable$inlined = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.h.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class b implements Iterable, g6.a {
        final /* synthetic */ byte[] $this_asIterable$inlined;

        public b(byte[] bArr) {
            this.$this_asIterable$inlined = bArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Byte> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class c implements Iterable, g6.a {
        final /* synthetic */ short[] $this_asIterable$inlined;

        public c(short[] sArr) {
            this.$this_asIterable$inlined = sArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Short> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class d implements Iterable, g6.a {
        final /* synthetic */ int[] $this_asIterable$inlined;

        public d(int[] iArr) {
            this.$this_asIterable$inlined = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Integer> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class e implements Iterable, g6.a {
        final /* synthetic */ long[] $this_asIterable$inlined;

        public e(long[] jArr) {
            this.$this_asIterable$inlined = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Long> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class f implements Iterable, g6.a {
        final /* synthetic */ float[] $this_asIterable$inlined;

        public f(float[] fArr) {
            this.$this_asIterable$inlined = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Float> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class g implements Iterable, g6.a {
        final /* synthetic */ double[] $this_asIterable$inlined;

        public g(double[] dArr) {
            this.$this_asIterable$inlined = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Double> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class h implements Iterable, g6.a {
        final /* synthetic */ boolean[] $this_asIterable$inlined;

        public h(boolean[] zArr) {
            this.$this_asIterable$inlined = zArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Boolean> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class i implements Iterable, g6.a {
        final /* synthetic */ char[] $this_asIterable$inlined;

        public i(char[] cArr) {
            this.$this_asIterable$inlined = cArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class j implements kotlin.sequences.m {
        final /* synthetic */ Object[] $this_asSequence$inlined;

        public j(Object[] objArr) {
            this.$this_asSequence$inlined = objArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.h.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class k implements kotlin.sequences.m {
        final /* synthetic */ byte[] $this_asSequence$inlined;

        public k(byte[] bArr) {
            this.$this_asSequence$inlined = bArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Byte> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class l implements kotlin.sequences.m {
        final /* synthetic */ short[] $this_asSequence$inlined;

        public l(short[] sArr) {
            this.$this_asSequence$inlined = sArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Short> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class m implements kotlin.sequences.m {
        final /* synthetic */ int[] $this_asSequence$inlined;

        public m(int[] iArr) {
            this.$this_asSequence$inlined = iArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Integer> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class n implements kotlin.sequences.m {
        final /* synthetic */ long[] $this_asSequence$inlined;

        public n(long[] jArr) {
            this.$this_asSequence$inlined = jArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Long> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class o implements kotlin.sequences.m {
        final /* synthetic */ float[] $this_asSequence$inlined;

        public o(float[] fArr) {
            this.$this_asSequence$inlined = fArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Float> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class p implements kotlin.sequences.m {
        final /* synthetic */ double[] $this_asSequence$inlined;

        public p(double[] dArr) {
            this.$this_asSequence$inlined = dArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Double> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class q implements kotlin.sequences.m {
        final /* synthetic */ boolean[] $this_asSequence$inlined;

        public q(boolean[] zArr) {
            this.$this_asSequence$inlined = zArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Boolean> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class r implements kotlin.sequences.m {
        final /* synthetic */ char[] $this_asSequence$inlined;

        public r(char[] cArr) {
            this.$this_asSequence$inlined = cArr;
        }

        @Override // kotlin.sequences.m
        public Iterator<Character> iterator() {
            return kotlin.jvm.internal.i.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class s implements b0 {
        final /* synthetic */ f6.l $keySelector;
        final /* synthetic */ T[] $this_groupingBy;

        public s(T[] tArr, f6.l lVar) {
            this.$this_groupingBy = tArr;
            this.$keySelector = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [K, java.lang.Object] */
        @Override // kotlin.collections.b0
        public K keyOf(T t7) {
            return this.$keySelector.invoke(t7);
        }

        @Override // kotlin.collections.b0
        public Iterator<T> sourceIterator() {
            return kotlin.jvm.internal.h.iterator(this.$this_groupingBy);
        }
    }

    public static final <T> boolean all(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static <T> Iterable<T> asIterable(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new a(tArr);
    }

    public static <T> kotlin.sequences.m asSequence(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new j(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(T[] tArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(tArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t7 : tArr) {
            Pair pair = (Pair) transform.invoke(t7);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(T[] tArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(tArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t7 : tArr) {
            linkedHashMap.put(keySelector.invoke(t7), t7);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(T[] tArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (T t7 : tArr) {
            destination.put(keySelector.invoke(t7), t7);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(T[] tArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (T t7 : tArr) {
            Pair pair = (Pair) transform.invoke(t7);
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(K[] kArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(kArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(kArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (K k8 : kArr) {
            linkedHashMap.put(k8, valueSelector.invoke(k8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(K[] kArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(kArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k8 : kArr) {
            destination.put(k8, valueSelector.invoke(k8));
        }
        return destination;
    }

    public static final double average(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (byte b8 : bArr) {
            d8 += b8;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfByte(Byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (Byte b8 : bArr) {
            d8 += b8.byteValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfDouble(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (Double d9 : dArr) {
            d8 += d9.doubleValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfFloat(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (Float f8 : fArr) {
            d8 += f8.floatValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfInt(Integer[] numArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(numArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (Integer num : numArr) {
            d8 += num.intValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfLong(Long[] lArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(lArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (Long l8 : lArr) {
            d8 += l8.longValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    public static final double averageOfShort(Short[] shArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(shArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (Short sh : shArr) {
            d8 += sh.shortValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    private static final <T> T component1(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr[0];
    }

    private static final <T> T component2(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr[1];
    }

    private static final <T> T component3(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr[2];
    }

    private static final <T> T component4(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr[3];
    }

    private static final <T> T component5(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr[4];
    }

    public static <T> boolean contains(T[] tArr, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return indexOf(tArr, t7) >= 0;
    }

    private static final <T> int count(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr.length;
    }

    public static final <T> List<T> distinct(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(tArr));
    }

    public static final <T, K> List<T> distinctBy(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            if (hashSet.add(selector.invoke(t7))) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> drop(T[] tArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(tArr.length - i8, 0);
            return takeLast(tArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> List<T> dropLast(T[] tArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(tArr.length - i8, 0);
            return take(tArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> List<T> dropLastWhile(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(tArr[lastIndex])).booleanValue()) {
                return take(tArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final <T> List<T> dropWhile(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (T t7 : tArr) {
            if (z7) {
                arrayList.add(t7);
            } else if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
                z7 = true;
            }
        }
        return arrayList;
    }

    private static final <T> T elementAtOrElse(T[] tArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(tArr)) ? (T) defaultValue.invoke(Integer.valueOf(i8)) : tArr[i8];
    }

    private static final <T> T elementAtOrNull(T[] tArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return (T) getOrNull(tArr, i8);
    }

    public static final <T> List<T> filter(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(T[] tArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            T t7 = tArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), t7)).booleanValue()) {
                arrayList.add(t7);
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(T[] tArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            T t7 = tArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), t7)).booleanValue()) {
                destination.add(t7);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            kotlin.jvm.internal.s.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            kotlin.jvm.internal.s.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> List<T> filterNot(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public static <T> List<T> filterNotNull(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(T[] tArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (T t7 : tArr) {
            if (t7 != null) {
                destination.add(t7);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(T[] tArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                destination.add(t7);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(T[] tArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                destination.add(t7);
            }
        }
        return destination;
    }

    private static final <T> T find(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        return null;
    }

    private static final <T> T findLast(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                T t7 = tArr[length];
                if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                    return t7;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static <T> T first(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    private static final <T, R> R firstNotNullOf(T[] tArr, f6.l transform) {
        R r8;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                r8 = (R) transform.invoke(tArr[i8]);
                if (r8 != null) {
                    break;
                }
                i8++;
            } else {
                r8 = null;
                break;
            }
        }
        if (r8 != null) {
            return r8;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    private static final <T, R> R firstNotNullOfOrNull(T[] tArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (T t7 : tArr) {
            R r8 = (R) transform.invoke(t7);
            if (r8 != null) {
                return r8;
            }
        }
        return null;
    }

    public static final <T> T firstOrNull(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <T, R> List<R> flatMap(T[] tArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(t7));
        }
        return arrayList;
    }

    private static final <T, R> List<R> flatMapIndexedIterable(T[] tArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return arrayList;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(T[] tArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return destination;
    }

    private static final <T, R> List<R> flatMapIndexedSequence(T[] tArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (kotlin.sequences.m) transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return arrayList;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(T[] tArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (kotlin.sequences.m) transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <T, R> List<R> flatMapSequence(T[] tArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            v.addAll(arrayList, (kotlin.sequences.m) transform.invoke(t7));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(T[] tArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (T t7 : tArr) {
            v.addAll(destination, (kotlin.sequences.m) transform.invoke(t7));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(T[] tArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (T t7 : tArr) {
            v.addAll(destination, (Iterable) transform.invoke(t7));
        }
        return destination;
    }

    public static final <T, R> R fold(T[] tArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (T t7 : tArr) {
            r8 = (R) operation.invoke(r8, t7);
        }
        return r8;
    }

    public static final <T, R> R foldIndexed(T[] tArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, tArr[i8]);
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <T, R> R foldRight(T[] tArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(tArr[lastIndex], r8);
        }
        return r8;
    }

    public static final <T, R> R foldRightIndexed(T[] tArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r8);
        }
        return r8;
    }

    public static final <T> void forEach(T[] tArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (T t7 : tArr) {
            action.invoke(t7);
        }
    }

    public static final <T> void forEachIndexed(T[] tArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), tArr[i8]);
            i8++;
            i9++;
        }
    }

    public static final <T> j6.m getIndices(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return new j6.m(0, getLastIndex(tArr));
    }

    public static <T> int getLastIndex(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    private static final <T> T getOrElse(T[] tArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(tArr)) ? (T) defaultValue.invoke(Integer.valueOf(i8)) : tArr[i8];
    }

    public static <T> T getOrNull(T[] tArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(tArr)) {
            return null;
        }
        return tArr[i8];
    }

    public static final <T, K> Map<K, List<T>> groupBy(T[] tArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t7 : tArr) {
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

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(T[] tArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (T t7 : tArr) {
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

    public static final <T, K> b0 groupingBy(T[] tArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        return new s(tArr, keySelector);
    }

    public static <T> int indexOf(T[] tArr, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        int i8 = 0;
        if (t7 == null) {
            int length = tArr.length;
            while (i8 < length) {
                if (tArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i8 < length2) {
            if (kotlin.jvm.internal.s.areEqual(t7, tArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(tArr[i8])).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final <T> int indexOfLast(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(tArr[length])).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <T> Set<T> intersect(T[] tArr, Iterable<? extends T> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    private static final <T> boolean isEmpty(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    private static final <T> boolean isNotEmpty(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final <T, A extends Appendable> A joinTo(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (T t7 : tArr) {
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

    public static final <T> String joinToString(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(tArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(objArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final <T> T last(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[getLastIndex(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> int lastIndexOf(T[] tArr, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (t7 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i9 = length2 - 1;
                    if (kotlin.jvm.internal.s.areEqual(t7, tArr[length2])) {
                        return length2;
                    }
                    if (i9 < 0) {
                        break;
                    }
                    length2 = i9;
                }
            }
        }
        return -1;
    }

    public static final <T> T lastOrNull(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final <T, R> List<R> map(T[] tArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t7 : tArr) {
            arrayList.add(transform.invoke(t7));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(T[] tArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(T[] tArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i9 + 1;
            Object invoke = transform.invoke(Integer.valueOf(i9), tArr[i8]);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(T[] tArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i9 + 1;
            Object invoke = transform.invoke(Integer.valueOf(i9), tArr[i8]);
            if (invoke != null) {
                destination.add(invoke);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(T[] tArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(T[] tArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            Object invoke = transform.invoke(t7);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(T[] tArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (T t7 : tArr) {
            Object invoke = transform.invoke(t7);
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(T[] tArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (T t7 : tArr) {
            destination.add(transform.invoke(t7));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t8);
            if (comparable.compareTo(comparable2) < 0) {
                t7 = t8;
                comparable = comparable2;
            }
        }
        return t7;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t7 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t8);
            if (comparable.compareTo(comparable2) < 0) {
                t7 = t8;
                comparable = comparable2;
            }
        }
        return t7;
    }

    private static final <T> double maxOf(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(tArr[0])).doubleValue();
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(tArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m382maxOfOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(tArr[0])).doubleValue();
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(tArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <T, R> R maxOfWith(T[] tArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(tArr[0]);
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <T, R> R maxOfWithOrNull(T[] tArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(tArr[0]);
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Double maxOrNull(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final double maxOrThrow(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return doubleValue;
    }

    public static final <T> T maxWithOrNull(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            if (comparator.compare(t7, t8) < 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T> T maxWithOrThrow(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t7 = tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            if (comparator.compare(t7, t8) < 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t8);
            if (comparable.compareTo(comparable2) > 0) {
                t7 = t8;
                comparable = comparable2;
            }
        }
        return t7;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t7 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t7;
        }
        Comparable comparable = (Comparable) selector.invoke(t7);
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t8);
            if (comparable.compareTo(comparable2) > 0) {
                t7 = t8;
                comparable = comparable2;
            }
        }
        return t7;
    }

    private static final <T> double minOf(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(tArr[0])).doubleValue();
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(tArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m418minOfOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(tArr[0])).doubleValue();
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(tArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <T, R> R minOfWith(T[] tArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(tArr[0]);
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <T, R> R minOfWithOrNull(T[] tArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(tArr[0]);
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Double minOrNull(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final double minOrThrow(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return doubleValue;
    }

    public static final <T> T minWithOrNull(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            if (comparator.compare(t7, t8) > 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T> T minWithOrThrow(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t7 = tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            if (comparator.compare(t7, t8) > 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T> boolean none(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    private static final <T> T[] onEach(T[] tArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (T t7 : tArr) {
            action.invoke(t7);
        }
        return tArr;
    }

    private static final <T> T[] onEachIndexed(T[] tArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), tArr[i8]);
            i8++;
            i9++;
        }
        return tArr;
    }

    public static final <T> Pair<List<T>, List<T>> partition(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                arrayList.add(t7);
            } else {
                arrayList2.add(t7);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    private static final <T> T random(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return (T) random(tArr, Random.Default);
    }

    private static final <T> T randomOrNull(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return (T) randomOrNull(tArr, Random.Default);
    }

    public static final <S, T extends S> S reduce(T[] tArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s7 = (S) tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            s7 = (S) operation.invoke(s7, tArr[it.nextInt()]);
        }
        return s7;
    }

    public static final <S, T extends S> S reduceIndexed(T[] tArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s7 = (S) tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s7 = (S) operation.invoke(Integer.valueOf(nextInt), s7, tArr[nextInt]);
        }
        return s7;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(T[] tArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s7 = (S) tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s7 = (S) operation.invoke(Integer.valueOf(nextInt), s7, tArr[nextInt]);
        }
        return s7;
    }

    public static final <S, T extends S> S reduceOrNull(T[] tArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s7 = (S) tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            s7 = (S) operation.invoke(s7, tArr[it.nextInt()]);
        }
        return s7;
    }

    public static final <S, T extends S> S reduceRight(T[] tArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s7 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s7 = (S) operation.invoke(tArr[i8], s7);
        }
        return s7;
    }

    public static final <S, T extends S> S reduceRightIndexed(T[] tArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s7 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s7 = (S) operation.invoke(Integer.valueOf(i8), tArr[i8], s7);
        }
        return s7;
    }

    public static final <S, T extends S> S reduceRightIndexedOrNull(T[] tArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S s7 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s7 = (S) operation.invoke(Integer.valueOf(i8), tArr[i8], s7);
        }
        return s7;
    }

    public static final <S, T extends S> S reduceRightOrNull(T[] tArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S s7 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s7 = (S) operation.invoke(tArr[i8], s7);
        }
        return s7;
    }

    public static final <T> T[] requireNoNulls(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        for (T t7 : tArr) {
            if (t7 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    public static final <T> void reverse(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t7 = tArr[nextInt];
            tArr[nextInt] = tArr[lastIndex];
            tArr[lastIndex] = t7;
            lastIndex--;
        }
    }

    public static final <T> List<T> reversed(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        x.reverse(mutableList);
        return mutableList;
    }

    public static final <T> T[] reversedArray(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) kotlin.collections.i.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            tArr2[lastIndex - nextInt] = tArr[nextInt];
        }
        return tArr2;
    }

    public static final <T, R> List<R> runningFold(T[] tArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        for (T t7 : tArr) {
            r8 = (R) operation.invoke(r8, t7);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> runningFoldIndexed(T[] tArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, tArr[i8]);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduce(T[] tArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        T t7 = tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(t7);
        int length = tArr.length;
        int i8 = 1;
        Object obj = t7;
        while (i8 < length) {
            Object invoke = operation.invoke(obj, tArr[i8]);
            arrayList.add(invoke);
            i8++;
            obj = invoke;
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduceIndexed(T[] tArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        T t7 = tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(t7);
        int length = tArr.length;
        int i8 = 1;
        Object obj = t7;
        while (i8 < length) {
            Object invoke = operation.invoke(Integer.valueOf(i8), obj, tArr[i8]);
            arrayList.add(invoke);
            i8++;
            obj = invoke;
        }
        return arrayList;
    }

    private static final <R> List<R> scan(byte[] bArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r8);
        for (byte b8 : bArr) {
            r8 = (R) operation.invoke(r8, Byte.valueOf(b8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(byte[] bArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r8);
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Byte.valueOf(bArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T> void shuffle(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        shuffle(tArr, Random.Default);
    }

    public static final <T> T single(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T singleOrNull(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> slice(T[] tArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final <T> T[] sliceArray(T[] tArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        T[] tArr2 = (T[]) kotlin.collections.i.arrayOfNulls(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            tArr2[i8] = tArr[it.next().intValue()];
            i8++;
        }
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            kotlin.collections.k.sortWith(tArr, new g.a(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            kotlin.collections.k.sortWith(tArr, new g.c(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(T[] tArr) {
        Comparator reverseOrder;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        reverseOrder = kotlin.comparisons.g.reverseOrder();
        kotlin.collections.k.sortWith(tArr, reverseOrder);
    }

    public static final <T extends Comparable<? super T>> List<T> sorted(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return kotlin.collections.k.asList(sortedArray(tArr));
    }

    public static final <T extends Comparable<? super T>> T[] sortedArray(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        kotlin.collections.k.sort((Object[]) tArr2);
        return tArr2;
    }

    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(T[] tArr) {
        Comparator reverseOrder;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        reverseOrder = kotlin.comparisons.g.reverseOrder();
        kotlin.collections.k.sortWith(tArr2, reverseOrder);
        return tArr2;
    }

    public static final <T> T[] sortedArrayWith(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(tArr2, "copyOf(this, size)");
        kotlin.collections.k.sortWith(tArr2, comparator);
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new g.a(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new g.c(selector));
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(T[] tArr) {
        Comparator reverseOrder;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        reverseOrder = kotlin.comparisons.g.reverseOrder();
        return sortedWith(tArr, reverseOrder);
    }

    public static <T> List<T> sortedWith(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.k.asList(sortedArrayWith(tArr, comparator));
    }

    public static final <T> Set<T> subtract(T[] tArr, Iterable<? extends T> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sum(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int i8 = 0;
        for (byte b8 : bArr) {
            i8 += b8;
        }
        return i8;
    }

    public static final <T> int sumBy(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (T t7 : tArr) {
            i8 += ((Number) selector.invoke(t7)).intValue();
        }
        return i8;
    }

    public static final <T> double sumByDouble(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (T t7 : tArr) {
            d8 += ((Number) selector.invoke(t7)).doubleValue();
        }
        return d8;
    }

    public static final int sumOfByte(Byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int i8 = 0;
        for (Byte b8 : bArr) {
            i8 += b8.byteValue();
        }
        return i8;
    }

    private static final <T> double sumOfDouble(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (T t7 : tArr) {
            d8 += ((Number) selector.invoke(t7)).doubleValue();
        }
        return d8;
    }

    public static final float sumOfFloat(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        float f8 = 0.0f;
        for (Float f9 : fArr) {
            f8 += f9.floatValue();
        }
        return f8;
    }

    private static final <T> int sumOfInt(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (T t7 : tArr) {
            i8 += ((Number) selector.invoke(t7)).intValue();
        }
        return i8;
    }

    private static final <T> long sumOfLong(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (T t7 : tArr) {
            j8 += ((Number) selector.invoke(t7)).longValue();
        }
        return j8;
    }

    public static final int sumOfShort(Short[] shArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(shArr, "<this>");
        int i8 = 0;
        for (Short sh : shArr) {
            i8 += sh.shortValue();
        }
        return i8;
    }

    private static final <T> int sumOfUInt(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (T t7 : tArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(t7)).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final <T> long sumOfULong(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (T t7 : tArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(t7)).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final <T> List<T> take(T[] tArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= tArr.length) {
            return toList(tArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (T t7 : tArr) {
            arrayList.add(t7);
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLast(T[] tArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = tArr.length;
        if (i8 >= length) {
            return toList(tArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(tArr[i9]);
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(tArr[lastIndex])).booleanValue()) {
                return drop(tArr, lastIndex + 1);
            }
        }
        return toList(tArr);
    }

    public static final <T> List<T> takeWhile(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                break;
            }
            arrayList.add(t7);
        }
        return arrayList;
    }

    public static final boolean[] toBooleanArray(Boolean[] boolArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zArr[i8] = boolArr[i8].booleanValue();
        }
        return zArr;
    }

    public static final byte[] toByteArray(Byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = bArr[i8].byteValue();
        }
        return bArr2;
    }

    public static final char[] toCharArray(Character[] chArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = chArr[i8].charValue();
        }
        return cArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(T[] tArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (T t7 : tArr) {
            destination.add(t7);
        }
        return destination;
    }

    public static final double[] toDoubleArray(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i8 = 0; i8 < length; i8++) {
            dArr2[i8] = dArr[i8].doubleValue();
        }
        return dArr2;
    }

    public static final float[] toFloatArray(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i8 = 0; i8 < length; i8++) {
            fArr2[i8] = fArr[i8].floatValue();
        }
        return fArr2;
    }

    public static final <T> HashSet<T> toHashSet(T[] tArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        mapCapacity = l0.mapCapacity(tArr.length);
        return (HashSet) toCollection(tArr, new HashSet(mapCapacity));
    }

    public static final int[] toIntArray(Integer[] numArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = numArr[i8].intValue();
        }
        return iArr;
    }

    public static <T> List<T> toList(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? toMutableList(tArr) : kotlin.collections.q.listOf(tArr[0]) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final long[] toLongArray(Long[] lArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = lArr[i8].longValue();
        }
        return jArr;
    }

    public static <T> List<T> toMutableList(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(tArr));
    }

    public static final <T> Set<T> toMutableSet(T[] tArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        mapCapacity = l0.mapCapacity(tArr.length);
        return (Set) toCollection(tArr, new LinkedHashSet(mapCapacity));
    }

    public static final <T> Set<T> toSet(T[] tArr) {
        Set<T> emptySet;
        Set<T> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(tArr.length);
            return (Set) toCollection(tArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(tArr[0]);
        return of;
    }

    public static final short[] toShortArray(Short[] shArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 < length; i8++) {
            sArr[i8] = shArr[i8].shortValue();
        }
        return sArr;
    }

    public static final <T> Set<T> union(T[] tArr, Iterable<? extends T> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> Iterable<c0> withIndex(final T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<T> invoke() {
                return kotlin.jvm.internal.h.iterator(tArr);
            }
        });
    }

    public static final <T, R, V> List<V> zip(T[] tArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(tArr[i8], other[i8]));
        }
        return arrayList;
    }

    public static final boolean all(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final double average(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (short s7 : sArr) {
            d8 += s7;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    private static final byte component1(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr[0];
    }

    private static final byte component2(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr[1];
    }

    private static final byte component3(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr[2];
    }

    private static final byte component4(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr[3];
    }

    private static final byte component5(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr[4];
    }

    public static boolean contains(byte[] bArr, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return indexOf(bArr, b8) >= 0;
    }

    private static final int count(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    public static final List<Byte> distinct(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(bArr));
    }

    private static final byte elementAtOrElse(byte[] bArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(bArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).byteValue() : bArr[i8];
    }

    private static final Byte elementAtOrNull(byte[] bArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return getOrNull(bArr, i8);
    }

    public static final <C extends Collection<? super Byte>> C filterNotTo(byte[] bArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                destination.add(Byte.valueOf(b8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Byte>> C filterTo(byte[] bArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                destination.add(Byte.valueOf(b8));
            }
        }
        return destination;
    }

    private static final Byte find(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                return Byte.valueOf(b8);
            }
        }
        return null;
    }

    public static final Byte firstOrNull(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    private static final <R> List<R> flatMapIndexedIterable(byte[] bArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> R fold(byte[] bArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (byte b8 : bArr) {
            r8 = (R) operation.invoke(r8, Byte.valueOf(b8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(byte[] bArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Byte.valueOf(bArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(byte[] bArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (byte b8 : bArr) {
            action.invoke(Byte.valueOf(b8));
        }
    }

    public static final void forEachIndexed(byte[] bArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j6.m getIndices(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return new j6.m(0, getLastIndex(bArr));
    }

    public static int getLastIndex(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    private static final byte getOrElse(byte[] bArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(bArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).byteValue() : bArr[i8];
    }

    public static final Byte getOrNull(byte[] bArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i8]);
    }

    private static final boolean isEmpty(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    private static final boolean isNotEmpty(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final String joinToString(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(bArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(bArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Byte lastOrNull(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final boolean none(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    private static final byte[] onEach(byte[] bArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (byte b8 : bArr) {
            action.invoke(Byte.valueOf(b8));
        }
        return bArr;
    }

    private static final byte[] onEachIndexed(byte[] bArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8]));
            i8++;
            i9++;
        }
        return bArr;
    }

    private static final byte random(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return random(bArr, (Random) Random.Default);
    }

    private static final Byte randomOrNull(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return randomOrNull(bArr, (Random) Random.Default);
    }

    private static final <R> List<R> scan(short[] sArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r8);
        for (short s7 : sArr) {
            r8 = (R) operation.invoke(r8, Short.valueOf(s7));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(short[] sArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r8);
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Short.valueOf(sArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        shuffle(bArr, (Random) Random.Default);
    }

    public static final Byte singleOrNull(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final void sortDescending(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            kotlin.collections.k.sort(bArr);
            reverse(bArr);
        }
    }

    public static final List<Byte> sorted(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        Byte[] typedArray = kotlin.collections.k.toTypedArray(bArr);
        kotlin.collections.k.sort((Object[]) typedArray);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new g.c(selector));
    }

    public static final List<Byte> sortedDescending(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Byte> sortedWith(byte[] bArr, Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Byte[] typedArray = kotlin.collections.k.toTypedArray(bArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final int sum(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int i8 = 0;
        for (short s7 : sArr) {
            i8 += s7;
        }
        return i8;
    }

    public static final HashSet<Byte> toHashSet(byte[] bArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        mapCapacity = l0.mapCapacity(bArr.length);
        return (HashSet) toCollection(bArr, new HashSet(mapCapacity));
    }

    public static final List<Byte> toMutableList(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b8 : bArr) {
            arrayList.add(Byte.valueOf(b8));
        }
        return arrayList;
    }

    public static final Set<Byte> toMutableSet(byte[] bArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        mapCapacity = l0.mapCapacity(bArr.length);
        return (Set) toCollection(bArr, new LinkedHashSet(mapCapacity));
    }

    public static final Iterable<c0> withIndex(final byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Byte> invoke() {
                return kotlin.jvm.internal.i.iterator(bArr);
            }
        });
    }

    public static final boolean all(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final Iterable<Byte> asIterable(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new b(bArr);
    }

    public static final kotlin.sequences.m asSequence(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new k(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(byte[] bArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (byte b8 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b8)), Byte.valueOf(b8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(byte[] bArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (byte b8 : bArr) {
            Pair pair = (Pair) transform.invoke(Byte.valueOf(b8));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Byte, ? super V>> M associateWithTo(byte[] bArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (byte b8 : bArr) {
            destination.put(Byte.valueOf(b8), valueSelector.invoke(Byte.valueOf(b8)));
        }
        return destination;
    }

    public static final double average(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (int i9 : iArr) {
            d8 += i9;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    private static final short component1(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr[0];
    }

    private static final short component2(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr[1];
    }

    private static final short component3(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr[2];
    }

    private static final short component4(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr[3];
    }

    private static final short component5(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr[4];
    }

    public static boolean contains(short[] sArr, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return indexOf(sArr, s7) >= 0;
    }

    private static final int count(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    public static final List<Short> distinct(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(sArr));
    }

    public static final List<Byte> drop(byte[] bArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(bArr.length - i8, 0);
            return takeLast(bArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Byte> dropLast(byte[] bArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(bArr.length - i8, 0);
            return take(bArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    private static final short elementAtOrElse(short[] sArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(sArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).shortValue() : sArr[i8];
    }

    private static final Short elementAtOrNull(short[] sArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return getOrNull(sArr, i8);
    }

    public static final List<Byte> filter(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                arrayList.add(Byte.valueOf(b8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Byte>> C filterIndexedTo(byte[] bArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b8 = bArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Byte.valueOf(b8))).booleanValue()) {
                destination.add(Byte.valueOf(b8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Byte> filterNot(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b8 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                arrayList.add(Byte.valueOf(b8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Short>> C filterNotTo(short[] sArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                destination.add(Short.valueOf(s7));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Short>> C filterTo(short[] sArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                destination.add(Short.valueOf(s7));
            }
        }
        return destination;
    }

    private static final Short find(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                return Short.valueOf(s7);
            }
        }
        return null;
    }

    public static final Short firstOrNull(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    private static final <R> List<R> flatMapIndexedIterable(short[] sArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> R fold(short[] sArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (short s7 : sArr) {
            r8 = (R) operation.invoke(r8, Short.valueOf(s7));
        }
        return r8;
    }

    public static final <R> R foldIndexed(short[] sArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Short.valueOf(sArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(byte[] bArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Byte.valueOf(bArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(byte[] bArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(short[] sArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (short s7 : sArr) {
            action.invoke(Short.valueOf(s7));
        }
    }

    public static final void forEachIndexed(short[] sArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j6.m getIndices(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return new j6.m(0, getLastIndex(sArr));
    }

    public static int getLastIndex(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr.length - 1;
    }

    private static final short getOrElse(short[] sArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(sArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).shortValue() : sArr[i8];
    }

    public static final Short getOrNull(short[] sArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i8]);
    }

    public static final int indexOfFirst(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Byte.valueOf(bArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Byte.valueOf(bArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Byte> intersect(byte[] bArr, Iterable<Byte> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    private static final boolean isEmpty(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    private static final boolean isNotEmpty(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final String joinToString(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(sArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(sArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Short lastOrNull(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(byte[] bArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(byte[] bArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (byte b8 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b8)));
        }
        return destination;
    }

    public static final boolean none(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    private static final short[] onEach(short[] sArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (short s7 : sArr) {
            action.invoke(Short.valueOf(s7));
        }
        return sArr;
    }

    private static final short[] onEachIndexed(short[] sArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8]));
            i8++;
            i9++;
        }
        return sArr;
    }

    private static final short random(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return random(sArr, (Random) Random.Default);
    }

    private static final Short randomOrNull(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return randomOrNull(sArr, (Random) Random.Default);
    }

    private static final <R> List<R> scan(int[] iArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r8);
        for (int i8 : iArr) {
            r8 = (R) operation.invoke(r8, Integer.valueOf(i8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(int[] iArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r8);
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Integer.valueOf(iArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        shuffle(sArr, (Random) Random.Default);
    }

    public static final Short singleOrNull(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final List<Byte> slice(byte[] bArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final List<Short> sorted(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        Short[] typedArray = kotlin.collections.k.toTypedArray(sArr);
        kotlin.collections.k.sort((Object[]) typedArray);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final byte[] sortedArray(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return copyOf;
    }

    public static final byte[] sortedArrayDescending(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final <R extends Comparable<? super R>> List<Short> sortedBy(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new g.c(selector));
    }

    public static final List<Short> sortedDescending(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Short> sortedWith(short[] sArr, Comparator<? super Short> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Short[] typedArray = kotlin.collections.k.toTypedArray(sArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final Set<Byte> subtract(byte[] bArr, Iterable<Byte> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static int sum(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        return i8;
    }

    public static final int sumBy(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (byte b8 : bArr) {
            i8 += ((Number) selector.invoke(Byte.valueOf(b8))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (byte b8 : bArr) {
            d8 += ((Number) selector.invoke(Byte.valueOf(b8))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (byte b8 : bArr) {
            d8 += ((Number) selector.invoke(Byte.valueOf(b8))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (byte b8 : bArr) {
            i8 += ((Number) selector.invoke(Byte.valueOf(b8))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (byte b8 : bArr) {
            j8 += ((Number) selector.invoke(Byte.valueOf(b8))).longValue();
        }
        return j8;
    }

    public static final <C extends Collection<? super Byte>> C toCollection(byte[] bArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (byte b8 : bArr) {
            destination.add(Byte.valueOf(b8));
        }
        return destination;
    }

    public static final HashSet<Short> toHashSet(short[] sArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        mapCapacity = l0.mapCapacity(sArr.length);
        return (HashSet) toCollection(sArr, new HashSet(mapCapacity));
    }

    public static final Set<Short> toMutableSet(short[] sArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        mapCapacity = l0.mapCapacity(sArr.length);
        return (Set) toCollection(sArr, new LinkedHashSet(mapCapacity));
    }

    public static final Set<Byte> union(byte[] bArr, Iterable<Byte> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<c0> withIndex(final short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Short> invoke() {
                return kotlin.jvm.internal.i.iterator(sArr);
            }
        });
    }

    public static final boolean all(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Byte, V> associateWith(byte[] bArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(bArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b8 : bArr) {
            linkedHashMap.put(Byte.valueOf(b8), valueSelector.invoke(Byte.valueOf(b8)));
        }
        return linkedHashMap;
    }

    public static final double average(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (long j8 : jArr) {
            d8 += j8;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    private static final int component1(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr[0];
    }

    private static final int component2(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr[1];
    }

    private static final int component3(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr[2];
    }

    private static final int component4(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr[3];
    }

    private static final int component5(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr[4];
    }

    public static boolean contains(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return indexOf(iArr, i8) >= 0;
    }

    private static final int count(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    public static final List<Integer> distinct(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(iArr));
    }

    private static final int elementAtOrElse(int[] iArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(iArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).intValue() : iArr[i8];
    }

    private static final Integer elementAtOrNull(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return getOrNull(iArr, i8);
    }

    public static final List<Byte> filterIndexed(byte[] bArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b8 = bArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Byte.valueOf(b8))).booleanValue()) {
                arrayList.add(Byte.valueOf(b8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Integer>> C filterNotTo(int[] iArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                destination.add(Integer.valueOf(i8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Integer>> C filterTo(int[] iArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                destination.add(Integer.valueOf(i8));
            }
        }
        return destination;
    }

    private static final Integer find(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return Integer.valueOf(i8);
            }
        }
        return null;
    }

    private static final Byte findLast(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                byte b8 = bArr[length];
                if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                    return Byte.valueOf(b8);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static byte first(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer firstOrNull(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    private static final <R> List<R> flatMapIndexedIterable(int[] iArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(byte[] bArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(byte[] bArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (byte b8 : bArr) {
            v.addAll(destination, (Iterable) transform.invoke(Byte.valueOf(b8)));
        }
        return destination;
    }

    public static final <R> R fold(int[] iArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int i8 : iArr) {
            r8 = (R) operation.invoke(r8, Integer.valueOf(i8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(int[] iArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Integer.valueOf(iArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(int[] iArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (int i8 : iArr) {
            action.invoke(Integer.valueOf(i8));
        }
    }

    public static final void forEachIndexed(int[] iArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j6.m getIndices(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return new j6.m(0, getLastIndex(iArr));
    }

    public static int getLastIndex(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    private static final int getOrElse(int[] iArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(iArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).intValue() : iArr[i8];
    }

    public static final Integer getOrNull(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i8]);
    }

    private static final boolean isEmpty(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    private static final boolean isNotEmpty(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final String joinToString(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(iArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(iArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static byte last(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[getLastIndex(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer lastOrNull(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static final <R> List<R> map(byte[] bArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b8 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(byte[] bArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final boolean none(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    private static final int[] onEach(int[] iArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (int i8 : iArr) {
            action.invoke(Integer.valueOf(i8));
        }
        return iArr;
    }

    private static final int[] onEachIndexed(int[] iArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8]));
            i8++;
            i9++;
        }
        return iArr;
    }

    private static final int random(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return random(iArr, (Random) Random.Default);
    }

    private static final Integer randomOrNull(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return randomOrNull(iArr, (Random) Random.Default);
    }

    public static final Byte reduceRightIndexedOrNull(byte[] bArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte b8 = bArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            b8 = ((Number) operation.invoke(Integer.valueOf(i8), Byte.valueOf(bArr[i8]), Byte.valueOf(b8))).byteValue();
        }
        return Byte.valueOf(b8);
    }

    public static final Byte reduceRightOrNull(byte[] bArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte b8 = bArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            b8 = ((Number) operation.invoke(Byte.valueOf(bArr[i8]), Byte.valueOf(b8))).byteValue();
        }
        return Byte.valueOf(b8);
    }

    public static final List<Byte> reversed(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Byte> mutableList = toMutableList(bArr);
        x.reverse(mutableList);
        return mutableList;
    }

    private static final <R> List<R> scan(long[] jArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r8);
        for (long j8 : jArr) {
            r8 = (R) operation.invoke(r8, Long.valueOf(j8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(long[] jArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r8);
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Long.valueOf(jArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        shuffle(iArr, (Random) Random.Default);
    }

    public static final Integer singleOrNull(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static byte[] sliceArray(byte[] bArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            bArr2[i8] = bArr[it.next().intValue()];
            i8++;
        }
        return bArr2;
    }

    public static final List<Integer> sorted(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        Integer[] typedArray = kotlin.collections.k.toTypedArray(iArr);
        kotlin.collections.k.sort((Object[]) typedArray);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new g.c(selector));
    }

    public static final List<Integer> sortedDescending(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Integer> sortedWith(int[] iArr, Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Integer[] typedArray = kotlin.collections.k.toTypedArray(iArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static long sum(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        long j8 = 0;
        for (long j9 : jArr) {
            j8 += j9;
        }
        return j8;
    }

    private static final int sumOfUInt(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (byte b8 : bArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Byte.valueOf(b8))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (byte b8 : bArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Byte.valueOf(b8))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final HashSet<Integer> toHashSet(int[] iArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        mapCapacity = l0.mapCapacity(iArr.length);
        return (HashSet) toCollection(iArr, new HashSet(mapCapacity));
    }

    public static final List<Short> toMutableList(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s7 : sArr) {
            arrayList.add(Short.valueOf(s7));
        }
        return arrayList;
    }

    public static final Set<Integer> toMutableSet(int[] iArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        mapCapacity = l0.mapCapacity(iArr.length);
        return (Set) toCollection(iArr, new LinkedHashSet(mapCapacity));
    }

    public static final Iterable<c0> withIndex(final int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Integer> invoke() {
                return kotlin.jvm.internal.i.iterator(iArr);
            }
        });
    }

    public static final <R, V> List<V> zip(byte[] bArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean all(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final Iterable<Short> asIterable(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new c(sArr);
    }

    public static final kotlin.sequences.m asSequence(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new l(sArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(byte[] bArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(bArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b8 : bArr) {
            Pair pair = (Pair) transform.invoke(Byte.valueOf(b8));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Byte> associateBy(byte[] bArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(bArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b8 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b8)), Byte.valueOf(b8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(short[] sArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (short s7 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s7)), Short.valueOf(s7));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(short[] sArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (short s7 : sArr) {
            Pair pair = (Pair) transform.invoke(Short.valueOf(s7));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Short, ? super V>> M associateWithTo(short[] sArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (short s7 : sArr) {
            destination.put(Short.valueOf(s7), valueSelector.invoke(Short.valueOf(s7)));
        }
        return destination;
    }

    public static final double average(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (float f8 : fArr) {
            d8 += f8;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    private static final long component1(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr[0];
    }

    private static final long component2(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr[1];
    }

    private static final long component3(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr[2];
    }

    private static final long component4(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr[3];
    }

    private static final long component5(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr[4];
    }

    public static boolean contains(long[] jArr, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return indexOf(jArr, j8) >= 0;
    }

    private static final int count(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    public static final List<Long> distinct(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(jArr));
    }

    public static final List<Short> drop(short[] sArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(sArr.length - i8, 0);
            return takeLast(sArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Short> dropLast(short[] sArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(sArr.length - i8, 0);
            return take(sArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Byte> dropLastWhile(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(bArr[lastIndex]))).booleanValue()) {
                return take(bArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private static final long elementAtOrElse(long[] jArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(jArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).longValue() : jArr[i8];
    }

    private static final Long elementAtOrNull(long[] jArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return getOrNull(jArr, i8);
    }

    public static final List<Short> filter(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                arrayList.add(Short.valueOf(s7));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Short>> C filterIndexedTo(short[] sArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            short s7 = sArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Short.valueOf(s7))).booleanValue()) {
                destination.add(Short.valueOf(s7));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Short> filterNot(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s7 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                arrayList.add(Short.valueOf(s7));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Long>> C filterNotTo(long[] jArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                destination.add(Long.valueOf(j8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Long>> C filterTo(long[] jArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                destination.add(Long.valueOf(j8));
            }
        }
        return destination;
    }

    private static final Long find(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return Long.valueOf(j8);
            }
        }
        return null;
    }

    public static final Long firstOrNull(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    public static final <R> List<R> flatMap(byte[] bArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b8 : bArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Byte.valueOf(b8)));
        }
        return arrayList;
    }

    private static final <R> List<R> flatMapIndexedIterable(long[] jArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> R fold(long[] jArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (long j8 : jArr) {
            r8 = (R) operation.invoke(r8, Long.valueOf(j8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(long[] jArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Long.valueOf(jArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(short[] sArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Short.valueOf(sArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(short[] sArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(long[] jArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (long j8 : jArr) {
            action.invoke(Long.valueOf(j8));
        }
    }

    public static final void forEachIndexed(long[] jArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j6.m getIndices(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return new j6.m(0, getLastIndex(jArr));
    }

    public static int getLastIndex(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    private static final long getOrElse(long[] jArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(jArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).longValue() : jArr[i8];
    }

    public static final Long getOrNull(long[] jArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i8]);
    }

    public static int indexOf(byte[] bArr, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (b8 == bArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Short.valueOf(sArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Short.valueOf(sArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Short> intersect(short[] sArr, Iterable<Short> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    private static final boolean isEmpty(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    private static final boolean isNotEmpty(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final String joinToString(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(jArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(jArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static int lastIndexOf(byte[] bArr, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (b8 == bArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Long lastOrNull(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(short[] sArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(short[] sArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (short s7 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s7)));
        }
        return destination;
    }

    public static final boolean none(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    private static final long[] onEach(long[] jArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (long j8 : jArr) {
            action.invoke(Long.valueOf(j8));
        }
        return jArr;
    }

    private static final long[] onEachIndexed(long[] jArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8]));
            i8++;
            i9++;
        }
        return jArr;
    }

    private static final long random(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return random(jArr, (Random) Random.Default);
    }

    private static final Long randomOrNull(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return randomOrNull(jArr, (Random) Random.Default);
    }

    public static final Byte reduceIndexedOrNull(byte[] bArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            b8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Byte.valueOf(b8), Byte.valueOf(bArr[nextInt]))).byteValue();
        }
        return Byte.valueOf(b8);
    }

    public static final Byte reduceOrNull(byte[] bArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            b8 = ((Number) operation.invoke(Byte.valueOf(b8), Byte.valueOf(bArr[it.nextInt()]))).byteValue();
        }
        return Byte.valueOf(b8);
    }

    public static final byte reduceRight(byte[] bArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte b8 = bArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                b8 = ((Number) operation.invoke(Byte.valueOf(bArr[i8]), Byte.valueOf(b8))).byteValue();
            }
            return b8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceRightIndexed(byte[] bArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte b8 = bArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                b8 = ((Number) operation.invoke(Integer.valueOf(i8), Byte.valueOf(bArr[i8]), Byte.valueOf(b8))).byteValue();
            }
            return b8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    private static final <R> List<R> scan(float[] fArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r8);
        for (float f8 : fArr) {
            r8 = (R) operation.invoke(r8, Float.valueOf(f8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(float[] fArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r8);
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Float.valueOf(fArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        shuffle(jArr, (Random) Random.Default);
    }

    public static byte single(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Long singleOrNull(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final List<Short> slice(short[] sArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            kotlin.collections.k.sort(sArr);
            reverse(sArr);
        }
    }

    public static final List<Long> sorted(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        Long[] typedArray = kotlin.collections.k.toTypedArray(jArr);
        kotlin.collections.k.sort((Object[]) typedArray);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final short[] sortedArray(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return copyOf;
    }

    public static final short[] sortedArrayDescending(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final <R extends Comparable<? super R>> List<Long> sortedBy(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new g.c(selector));
    }

    public static final List<Long> sortedDescending(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Long> sortedWith(long[] jArr, Comparator<? super Long> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Long[] typedArray = kotlin.collections.k.toTypedArray(jArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final Set<Short> subtract(short[] sArr, Iterable<Short> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final float sum(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        float f8 = 0.0f;
        for (float f9 : fArr) {
            f8 += f9;
        }
        return f8;
    }

    public static final int sumBy(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (short s7 : sArr) {
            i8 += ((Number) selector.invoke(Short.valueOf(s7))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (short s7 : sArr) {
            d8 += ((Number) selector.invoke(Short.valueOf(s7))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (short s7 : sArr) {
            d8 += ((Number) selector.invoke(Short.valueOf(s7))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (short s7 : sArr) {
            i8 += ((Number) selector.invoke(Short.valueOf(s7))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (short s7 : sArr) {
            j8 += ((Number) selector.invoke(Short.valueOf(s7))).longValue();
        }
        return j8;
    }

    public static final List<Byte> takeLastWhile(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(bArr[lastIndex]))).booleanValue()) {
                return drop(bArr, lastIndex + 1);
            }
        }
        return toList(bArr);
    }

    public static final List<Byte> takeWhile(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b8 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b8));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Short>> C toCollection(short[] sArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (short s7 : sArr) {
            destination.add(Short.valueOf(s7));
        }
        return destination;
    }

    public static final HashSet<Long> toHashSet(long[] jArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        mapCapacity = l0.mapCapacity(jArr.length);
        return (HashSet) toCollection(jArr, new HashSet(mapCapacity));
    }

    public static final List<Byte> toList(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Byte.valueOf(bArr[0]));
        }
        return toMutableList(bArr);
    }

    public static final Set<Long> toMutableSet(long[] jArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        mapCapacity = l0.mapCapacity(jArr.length);
        return (Set) toCollection(jArr, new LinkedHashSet(mapCapacity));
    }

    public static final Set<Byte> toSet(byte[] bArr) {
        Set<Byte> emptySet;
        Set<Byte> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(bArr.length);
            return (Set) toCollection(bArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Byte.valueOf(bArr[0]));
        return of;
    }

    public static final Set<Short> union(short[] sArr, Iterable<Short> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<c0> withIndex(final long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Long> invoke() {
                return kotlin.jvm.internal.i.iterator(jArr);
            }
        });
    }

    public static final boolean all(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Short, V> associateWith(short[] sArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(sArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s7 : sArr) {
            linkedHashMap.put(Short.valueOf(s7), valueSelector.invoke(Short.valueOf(s7)));
        }
        return linkedHashMap;
    }

    public static final double average(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        for (double d9 : dArr) {
            d8 += d9;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d8 / i8;
    }

    private static final float component1(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr[0];
    }

    private static final float component2(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr[1];
    }

    private static final float component3(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr[2];
    }

    private static final float component4(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr[3];
    }

    private static final float component5(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr[4];
    }

    public static final boolean contains(boolean[] zArr, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z7) >= 0;
    }

    private static final int count(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    public static final List<Float> distinct(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(fArr));
    }

    public static final List<Byte> dropWhile(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (byte b8 : bArr) {
            if (z7) {
                arrayList.add(Byte.valueOf(b8));
            } else if (!((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                arrayList.add(Byte.valueOf(b8));
                z7 = true;
            }
        }
        return arrayList;
    }

    private static final float elementAtOrElse(float[] fArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(fArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).floatValue() : fArr[i8];
    }

    private static final Float elementAtOrNull(float[] fArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return getOrNull(fArr, i8);
    }

    public static final <C extends Collection<? super Float>> C filterNotTo(float[] fArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                destination.add(Float.valueOf(f8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Float>> C filterTo(float[] fArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                destination.add(Float.valueOf(f8));
            }
        }
        return destination;
    }

    private static final Float find(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return Float.valueOf(f8);
            }
        }
        return null;
    }

    public static final Float firstOrNull(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    private static final <R> List<R> flatMapIndexedIterable(float[] fArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> R fold(float[] fArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (float f8 : fArr) {
            r8 = (R) operation.invoke(r8, Float.valueOf(f8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(float[] fArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Float.valueOf(fArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(float[] fArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (float f8 : fArr) {
            action.invoke(Float.valueOf(f8));
        }
    }

    public static final void forEachIndexed(float[] fArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j6.m getIndices(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return new j6.m(0, getLastIndex(fArr));
    }

    public static final int getLastIndex(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    private static final float getOrElse(float[] fArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(fArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).floatValue() : fArr[i8];
    }

    public static final Float getOrNull(float[] fArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i8]);
    }

    private static final boolean isEmpty(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    private static final boolean isNotEmpty(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final String joinToString(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(fArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(fArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Float lastOrNull(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    private static final <R> R maxOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Byte maxWithOrNull(byte[] bArr, Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b8), Byte.valueOf(b9)) < 0) {
                b8 = b9;
            }
        }
        return Byte.valueOf(b8);
    }

    private static final <R> R minOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Byte minWithOrNull(byte[] bArr, Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b8), Byte.valueOf(b9)) > 0) {
                b8 = b9;
            }
        }
        return Byte.valueOf(b8);
    }

    public static final boolean none(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    private static final float[] onEach(float[] fArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (float f8 : fArr) {
            action.invoke(Float.valueOf(f8));
        }
        return fArr;
    }

    private static final float[] onEachIndexed(float[] fArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8]));
            i8++;
            i9++;
        }
        return fArr;
    }

    private static final float random(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return random(fArr, (Random) Random.Default);
    }

    private static final Float randomOrNull(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return randomOrNull(fArr, (Random) Random.Default);
    }

    public static final byte reduce(byte[] bArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                b8 = ((Number) operation.invoke(Byte.valueOf(b8), Byte.valueOf(bArr[it.nextInt()]))).byteValue();
            }
            return b8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceIndexed(byte[] bArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                b8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Byte.valueOf(b8), Byte.valueOf(bArr[nextInt]))).byteValue();
            }
            return b8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static byte[] reversedArray(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int lastIndex = getLastIndex(bArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            bArr2[lastIndex - nextInt] = bArr[nextInt];
        }
        return bArr2;
    }

    private static final <R> List<R> runningFold(byte[] bArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r8);
        for (byte b8 : bArr) {
            r8 = (R) operation.invoke(r8, Byte.valueOf(b8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(byte[] bArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r8);
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Byte.valueOf(bArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scan(double[] dArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r8);
        for (double d8 : dArr) {
            r8 = (R) operation.invoke(r8, Double.valueOf(d8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(double[] dArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r8);
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Double.valueOf(dArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        shuffle(fArr, (Random) Random.Default);
    }

    public static final Float singleOrNull(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final List<Float> sorted(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        Float[] typedArray = kotlin.collections.k.toTypedArray(fArr);
        kotlin.collections.k.sort((Object[]) typedArray);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Float> sortedBy(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new g.c(selector));
    }

    public static final List<Float> sortedDescending(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Float> sortedWith(float[] fArr, Comparator<? super Float> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Float[] typedArray = kotlin.collections.k.toTypedArray(fArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final double sum(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (double d9 : dArr) {
            d8 += d9;
        }
        return d8;
    }

    public static final HashSet<Float> toHashSet(float[] fArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        mapCapacity = l0.mapCapacity(fArr.length);
        return (HashSet) toCollection(fArr, new HashSet(mapCapacity));
    }

    public static final List<Integer> toMutableList(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static final Set<Float> toMutableSet(float[] fArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        mapCapacity = l0.mapCapacity(fArr.length);
        return (Set) toCollection(fArr, new LinkedHashSet(mapCapacity));
    }

    public static final Iterable<c0> withIndex(final float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Float> invoke() {
                return kotlin.jvm.internal.i.iterator(fArr);
            }
        });
    }

    public static final boolean all(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final Iterable<Integer> asIterable(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new d(iArr);
    }

    public static final kotlin.sequences.m asSequence(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new m(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(int[] iArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i8)), Integer.valueOf(i8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(int[] iArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 : iArr) {
            Pair pair = (Pair) transform.invoke(Integer.valueOf(i8));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Integer, ? super V>> M associateWithTo(int[] iArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i8 : iArr) {
            destination.put(Integer.valueOf(i8), valueSelector.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    private static final double component1(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr[0];
    }

    private static final double component2(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr[1];
    }

    private static final double component3(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr[2];
    }

    private static final double component4(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr[3];
    }

    private static final double component5(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr[4];
    }

    public static boolean contains(char[] cArr, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c8) >= 0;
    }

    private static final int count(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    public static final List<Double> distinct(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(dArr));
    }

    public static final <K> List<Byte> distinctBy(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b8 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b8)))) {
                arrayList.add(Byte.valueOf(b8));
            }
        }
        return arrayList;
    }

    public static final List<Integer> drop(int[] iArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(iArr.length - i8, 0);
            return takeLast(iArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Integer> dropLast(int[] iArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(iArr.length - i8, 0);
            return take(iArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    private static final double elementAtOrElse(double[] dArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(dArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).doubleValue() : dArr[i8];
    }

    private static final Double elementAtOrNull(double[] dArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return getOrNull(dArr, i8);
    }

    public static final List<Integer> filter(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        return arrayList;
    }

    public static final List<Short> filterIndexed(short[] sArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            short s7 = sArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Short.valueOf(s7))).booleanValue()) {
                arrayList.add(Short.valueOf(s7));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Integer>> C filterIndexedTo(int[] iArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
            i8++;
            i9 = i11;
        }
        return destination;
    }

    public static final List<Integer> filterNot(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Double>> C filterNotTo(double[] dArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                destination.add(Double.valueOf(d8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Double>> C filterTo(double[] dArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                destination.add(Double.valueOf(d8));
            }
        }
        return destination;
    }

    private static final Double find(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                return Double.valueOf(d8);
            }
        }
        return null;
    }

    private static final Short findLast(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                short s7 = sArr[length];
                if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                    return Short.valueOf(s7);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static short first(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Double firstOrNull(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    private static final <R> List<R> flatMapIndexedIterable(double[] dArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(short[] sArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(short[] sArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (short s7 : sArr) {
            v.addAll(destination, (Iterable) transform.invoke(Short.valueOf(s7)));
        }
        return destination;
    }

    public static final <R> R fold(double[] dArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (double d8 : dArr) {
            r8 = (R) operation.invoke(r8, Double.valueOf(d8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(double[] dArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Double.valueOf(dArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(int[] iArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(iArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(int[] iArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(double[] dArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (double d8 : dArr) {
            action.invoke(Double.valueOf(d8));
        }
    }

    public static final void forEachIndexed(double[] dArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j6.m getIndices(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return new j6.m(0, getLastIndex(dArr));
    }

    public static final int getLastIndex(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr.length - 1;
    }

    private static final double getOrElse(double[] dArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(dArr)) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).doubleValue() : dArr[i8];
    }

    public static final Double getOrNull(double[] dArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i8]);
    }

    public static int indexOf(short[] sArr, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (s7 == sArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Integer.valueOf(iArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Integer> intersect(int[] iArr, Iterable<Integer> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    private static final boolean isEmpty(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    private static final boolean isNotEmpty(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final <A extends Appendable> A joinTo(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (byte b8 : bArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Byte.valueOf(b8)));
            } else {
                buffer.append(String.valueOf((int) b8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String joinToString(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(dArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(dArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static short last(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[getLastIndex(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int lastIndexOf(short[] sArr, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (s7 == sArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Double lastOrNull(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    public static final <R> List<R> map(short[] sArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s7 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s7)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(short[] sArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(int[] iArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(int[] iArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    private static final double maxOf(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m376maxOfOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(byte[] bArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final Float maxOrNull(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final float maxOrThrow(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float floatValue = fArr[0].floatValue();
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, fArr[it.nextInt()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final byte maxWithOrThrow(byte[] bArr, Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b9 = bArr[it.nextInt()];
                if (comparator.compare(Byte.valueOf(b8), Byte.valueOf(b9)) < 0) {
                    b8 = b9;
                }
            }
            return b8;
        }
        throw new NoSuchElementException();
    }

    private static final double minOf(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m412minOfOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(byte[] bArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final Float minOrNull(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final float minOrThrow(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float floatValue = fArr[0].floatValue();
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, fArr[it.nextInt()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final byte minWithOrThrow(byte[] bArr, Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b9 = bArr[it.nextInt()];
                if (comparator.compare(Byte.valueOf(b8), Byte.valueOf(b9)) > 0) {
                    b8 = b9;
                }
            }
            return b8;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    private static final double[] onEach(double[] dArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (double d8 : dArr) {
            action.invoke(Double.valueOf(d8));
        }
        return dArr;
    }

    private static final double[] onEachIndexed(double[] dArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8]));
            i8++;
            i9++;
        }
        return dArr;
    }

    private static final double random(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return random(dArr, Random.Default);
    }

    private static final Double randomOrNull(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return randomOrNull(dArr, Random.Default);
    }

    public static void reverse(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(bArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            byte b8 = bArr[nextInt];
            bArr[nextInt] = bArr[lastIndex];
            bArr[lastIndex] = b8;
            lastIndex--;
        }
    }

    public static final List<Short> reversed(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Short> mutableList = toMutableList(sArr);
        x.reverse(mutableList);
        return mutableList;
    }

    private static final List<Byte> runningReduce(byte[] bArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte b8 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b8));
        int length = bArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            b8 = ((Number) operation.invoke(Byte.valueOf(b8), Byte.valueOf(bArr[i8]))).byteValue();
            arrayList.add(Byte.valueOf(b8));
        }
        return arrayList;
    }

    private static final List<Byte> runningReduceIndexed(byte[] bArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte b8 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b8));
        int length = bArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            b8 = ((Number) operation.invoke(Integer.valueOf(i8), Byte.valueOf(b8), Byte.valueOf(bArr[i8]))).byteValue();
            arrayList.add(Byte.valueOf(b8));
        }
        return arrayList;
    }

    private static final <R> List<R> scan(boolean[] zArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r8);
        for (boolean z7 : zArr) {
            r8 = (R) operation.invoke(r8, Boolean.valueOf(z7));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(boolean[] zArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r8);
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Boolean.valueOf(zArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        shuffle(dArr, Random.Default);
    }

    public static final Double singleOrNull(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final List<Integer> slice(int[] iArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static short[] sliceArray(short[] sArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            sArr2[i8] = sArr[it.next().intValue()];
            i8++;
        }
        return sArr2;
    }

    public static final List<Double> sorted(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        Double[] typedArray = kotlin.collections.k.toTypedArray(dArr);
        kotlin.collections.k.sort((Object[]) typedArray);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final int[] sortedArray(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return copyOf;
    }

    public static final int[] sortedArrayDescending(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final <R extends Comparable<? super R>> List<Double> sortedBy(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new g.c(selector));
    }

    public static final List<Double> sortedDescending(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Double> sortedWith(double[] dArr, Comparator<? super Double> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Double[] typedArray = kotlin.collections.k.toTypedArray(dArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final Set<Integer> subtract(int[] iArr, Iterable<Integer> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += ((Number) selector.invoke(Integer.valueOf(i9))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (int i8 : iArr) {
            d8 += ((Number) selector.invoke(Integer.valueOf(i8))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (int i8 : iArr) {
            d8 += ((Number) selector.invoke(Integer.valueOf(i8))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += ((Number) selector.invoke(Integer.valueOf(i9))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (int i8 : iArr) {
            j8 += ((Number) selector.invoke(Integer.valueOf(i8))).longValue();
        }
        return j8;
    }

    private static final int sumOfUInt(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (short s7 : sArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Short.valueOf(s7))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (short s7 : sArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Short.valueOf(s7))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final <C extends Collection<? super Integer>> C toCollection(int[] iArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (int i8 : iArr) {
            destination.add(Integer.valueOf(i8));
        }
        return destination;
    }

    public static final HashSet<Double> toHashSet(double[] dArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        mapCapacity = l0.mapCapacity(dArr.length);
        return (HashSet) toCollection(dArr, new HashSet(mapCapacity));
    }

    public static final Set<Double> toMutableSet(double[] dArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        mapCapacity = l0.mapCapacity(dArr.length);
        return (Set) toCollection(dArr, new LinkedHashSet(mapCapacity));
    }

    public static final Set<Integer> union(int[] iArr, Iterable<Integer> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<c0> withIndex(final double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Double> invoke() {
                return kotlin.jvm.internal.i.iterator(dArr);
            }
        });
    }

    public static final <R, V> List<V> zip(short[] sArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean all(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Integer, V> associateWith(int[] iArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(iArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 : iArr) {
            linkedHashMap.put(Integer.valueOf(i8), valueSelector.invoke(Integer.valueOf(i8)));
        }
        return linkedHashMap;
    }

    private static final boolean component1(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr[0];
    }

    private static final boolean component2(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr[1];
    }

    private static final boolean component3(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr[2];
    }

    private static final boolean component4(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr[3];
    }

    private static final boolean component5(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr[4];
    }

    public static final /* synthetic */ boolean contains(float[] fArr, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        for (float f9 : fArr) {
            if (f9 == f8) {
                return true;
            }
        }
        return false;
    }

    private static final int count(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    public static final List<Boolean> distinct(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(zArr));
    }

    private static final boolean elementAtOrElse(boolean[] zArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(zArr)) ? ((Boolean) defaultValue.invoke(Integer.valueOf(i8))).booleanValue() : zArr[i8];
    }

    private static final Boolean elementAtOrNull(boolean[] zArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return getOrNull(zArr, i8);
    }

    public static final <C extends Collection<? super Boolean>> C filterNotTo(boolean[] zArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                destination.add(Boolean.valueOf(z7));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Boolean>> C filterTo(boolean[] zArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                destination.add(Boolean.valueOf(z7));
            }
        }
        return destination;
    }

    private static final Boolean find(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                return Boolean.valueOf(z7);
            }
        }
        return null;
    }

    public static final Boolean firstOrNull(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    private static final <R> List<R> flatMapIndexedIterable(boolean[] zArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> R fold(boolean[] zArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (boolean z7 : zArr) {
            r8 = (R) operation.invoke(r8, Boolean.valueOf(z7));
        }
        return r8;
    }

    public static final <R> R foldIndexed(boolean[] zArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Boolean.valueOf(zArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(boolean[] zArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (boolean z7 : zArr) {
            action.invoke(Boolean.valueOf(z7));
        }
    }

    public static final void forEachIndexed(boolean[] zArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j6.m getIndices(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return new j6.m(0, getLastIndex(zArr));
    }

    public static final int getLastIndex(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr.length - 1;
    }

    private static final boolean getOrElse(boolean[] zArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(zArr)) ? ((Boolean) defaultValue.invoke(Integer.valueOf(i8))).booleanValue() : zArr[i8];
    }

    public static final Boolean getOrNull(boolean[] zArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i8]);
    }

    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(byte[] bArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (byte b8 : bArr) {
            Object invoke = keySelector.invoke(Byte.valueOf(b8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b8));
        }
        return destination;
    }

    private static final boolean isEmpty(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    private static final boolean isNotEmpty(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final String joinToString(boolean[] zArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(zArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(zArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Boolean lastOrNull(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    public static final boolean none(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    private static final boolean[] onEach(boolean[] zArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (boolean z7 : zArr) {
            action.invoke(Boolean.valueOf(z7));
        }
        return zArr;
    }

    private static final boolean[] onEachIndexed(boolean[] zArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8]));
            i8++;
            i9++;
        }
        return zArr;
    }

    public static final Pair<List<Byte>, List<Byte>> partition(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                arrayList.add(Byte.valueOf(b8));
            } else {
                arrayList2.add(Byte.valueOf(b8));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    private static final boolean random(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return random(zArr, Random.Default);
    }

    private static final Boolean randomOrNull(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return randomOrNull(zArr, Random.Default);
    }

    public static final Short reduceRightIndexedOrNull(short[] sArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short s7 = sArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s7 = ((Number) operation.invoke(Integer.valueOf(i8), Short.valueOf(sArr[i8]), Short.valueOf(s7))).shortValue();
        }
        return Short.valueOf(s7);
    }

    public static final Short reduceRightOrNull(short[] sArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short s7 = sArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s7 = ((Number) operation.invoke(Short.valueOf(sArr[i8]), Short.valueOf(s7))).shortValue();
        }
        return Short.valueOf(s7);
    }

    private static final <R> List<R> scan(char[] cArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r8);
        for (char c8 : cArr) {
            r8 = (R) operation.invoke(r8, Character.valueOf(c8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> scanIndexed(char[] cArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r8);
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Character.valueOf(cArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        shuffle(zArr, Random.Default);
    }

    public static final Boolean singleOrNull(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final void sortDescending(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            kotlin.collections.k.sort(iArr);
            reverse(iArr);
        }
    }

    public static final List<Character> sorted(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        Character[] typedArray = kotlin.collections.k.toTypedArray(cArr);
        kotlin.collections.k.sort((Object[]) typedArray);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new g.c(selector));
    }

    public static final List<Character> sortedDescending(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Boolean> sortedWith(boolean[] zArr, Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Boolean[] typedArray = kotlin.collections.k.toTypedArray(zArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final List<Byte> take(byte[] bArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= bArr.length) {
            return toList(bArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (byte b8 : bArr) {
            arrayList.add(Byte.valueOf(b8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Byte> takeLast(byte[] bArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = bArr.length;
        if (i8 >= length) {
            return toList(bArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Byte.valueOf(bArr[i9]));
        }
        return arrayList;
    }

    public static final HashSet<Boolean> toHashSet(boolean[] zArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        mapCapacity = l0.mapCapacity(zArr.length);
        return (HashSet) toCollection(zArr, new HashSet(mapCapacity));
    }

    public static final List<Long> toMutableList(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static final Set<Boolean> toMutableSet(boolean[] zArr) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        mapCapacity = l0.mapCapacity(zArr.length);
        return (Set) toCollection(zArr, new LinkedHashSet(mapCapacity));
    }

    public static final Iterable<c0> withIndex(final boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Boolean> invoke() {
                return kotlin.jvm.internal.i.iterator(zArr);
            }
        });
    }

    public static final boolean all(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final Iterable<Long> asIterable(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new e(jArr);
    }

    public static final kotlin.sequences.m asSequence(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new n(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(short[] sArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(sArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s7 : sArr) {
            Pair pair = (Pair) transform.invoke(Short.valueOf(s7));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Short> associateBy(short[] sArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(sArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s7 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s7)), Short.valueOf(s7));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(long[] jArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (long j8 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j8)), Long.valueOf(j8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(long[] jArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (long j8 : jArr) {
            Pair pair = (Pair) transform.invoke(Long.valueOf(j8));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Long, ? super V>> M associateWithTo(long[] jArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (long j8 : jArr) {
            destination.put(Long.valueOf(j8), valueSelector.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    private static final char component1(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr[0];
    }

    private static final char component2(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr[1];
    }

    private static final char component3(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr[2];
    }

    private static final char component4(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr[3];
    }

    private static final char component5(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr[4];
    }

    public static final /* synthetic */ boolean contains(double[] dArr, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        for (double d9 : dArr) {
            if (d9 == d8) {
                return true;
            }
        }
        return false;
    }

    private static final int count(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    public static final List<Character> distinct(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(cArr));
    }

    public static final List<Long> drop(long[] jArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(jArr.length - i8, 0);
            return takeLast(jArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Long> dropLast(long[] jArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(jArr.length - i8, 0);
            return take(jArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Short> dropLastWhile(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Short.valueOf(sArr[lastIndex]))).booleanValue()) {
                return take(sArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private static final char elementAtOrElse(char[] cArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(cArr)) ? ((Character) defaultValue.invoke(Integer.valueOf(i8))).charValue() : cArr[i8];
    }

    private static final Character elementAtOrNull(char[] cArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return getOrNull(cArr, i8);
    }

    public static final List<Long> filter(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Long>> C filterIndexedTo(long[] jArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            long j8 = jArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Long.valueOf(j8))).booleanValue()) {
                destination.add(Long.valueOf(j8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Long> filterNot(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Character>> C filterNotTo(char[] cArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                destination.add(Character.valueOf(c8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Character>> C filterTo(char[] cArr, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                destination.add(Character.valueOf(c8));
            }
        }
        return destination;
    }

    private static final Character find(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                return Character.valueOf(c8);
            }
        }
        return null;
    }

    public static final Character firstOrNull(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    public static final <R> List<R> flatMap(short[] sArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s7 : sArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Short.valueOf(s7)));
        }
        return arrayList;
    }

    private static final <R> List<R> flatMapIndexedIterable(char[] cArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> R fold(char[] cArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (char c8 : cArr) {
            r8 = (R) operation.invoke(r8, Character.valueOf(c8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(char[] cArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Character.valueOf(cArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(long[] jArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Long.valueOf(jArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(long[] jArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(char[] cArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (char c8 : cArr) {
            action.invoke(Character.valueOf(c8));
        }
    }

    public static final void forEachIndexed(char[] cArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j6.m getIndices(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return new j6.m(0, getLastIndex(cArr));
    }

    public static final int getLastIndex(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr.length - 1;
    }

    private static final char getOrElse(char[] cArr, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > getLastIndex(cArr)) ? ((Character) defaultValue.invoke(Integer.valueOf(i8))).charValue() : cArr[i8];
    }

    public static final Character getOrNull(char[] cArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i8]);
    }

    public static final <K> Map<K, List<Byte>> groupBy(byte[] bArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b8 : bArr) {
            Object invoke = keySelector.invoke(Byte.valueOf(b8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b8));
        }
        return linkedHashMap;
    }

    public static int indexOf(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (i8 == iArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Long.valueOf(jArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Long> intersect(long[] jArr, Iterable<Long> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    private static final boolean isEmpty(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    private static final boolean isNotEmpty(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final String joinToString(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(cArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f6.l lVar, int i9, Object obj) {
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
        return joinToString(cArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static int lastIndexOf(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i9 = length - 1;
                if (i8 == iArr[length]) {
                    return length;
                }
                if (i9 < 0) {
                    break;
                }
                length = i9;
            }
        }
        return -1;
    }

    public static final Character lastOrNull(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(long[] jArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(long[] jArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (long j8 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Byte maxByOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b8);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b9));
            if (comparable.compareTo(comparable2) < 0) {
                b8 = b9;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b8);
    }

    public static final <R extends Comparable<? super R>> Byte minByOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b8);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b9));
            if (comparable.compareTo(comparable2) > 0) {
                b8 = b9;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b8);
    }

    public static final boolean none(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    private static final char[] onEach(char[] cArr, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (char c8 : cArr) {
            action.invoke(Character.valueOf(c8));
        }
        return cArr;
    }

    private static final char[] onEachIndexed(char[] cArr, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8]));
            i8++;
            i9++;
        }
        return cArr;
    }

    private static final char random(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return random(cArr, (Random) Random.Default);
    }

    private static final Character randomOrNull(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return randomOrNull(cArr, (Random) Random.Default);
    }

    public static final short reduceRight(short[] sArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short s7 = sArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                s7 = ((Number) operation.invoke(Short.valueOf(sArr[i8]), Short.valueOf(s7))).shortValue();
            }
            return s7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceRightIndexed(short[] sArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short s7 = sArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                s7 = ((Number) operation.invoke(Integer.valueOf(i8), Short.valueOf(sArr[i8]), Short.valueOf(s7))).shortValue();
            }
            return s7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final <T, R> List<R> scan(T[] tArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        for (T t7 : tArr) {
            r8 = (R) operation.invoke(r8, t7);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> scanIndexed(T[] tArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, tArr[i8]);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void shuffle(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        shuffle(cArr, (Random) Random.Default);
    }

    public static short single(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Character singleOrNull(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final List<Long> slice(long[] jArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final long[] sortedArray(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return copyOf;
    }

    public static final long[] sortedArrayDescending(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final <R extends Comparable<? super R>> List<Character> sortedBy(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new g.a(selector));
    }

    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new g.c(selector));
    }

    public static final List<Character> sortedWith(char[] cArr, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Character[] typedArray = kotlin.collections.k.toTypedArray(cArr);
        kotlin.collections.k.sortWith(typedArray, comparator);
        return kotlin.collections.k.asList(typedArray);
    }

    public static final Set<Long> subtract(long[] jArr, Iterable<Long> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (long j8 : jArr) {
            i8 += ((Number) selector.invoke(Long.valueOf(j8))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (long j8 : jArr) {
            d8 += ((Number) selector.invoke(Long.valueOf(j8))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (long j8 : jArr) {
            d8 += ((Number) selector.invoke(Long.valueOf(j8))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (long j8 : jArr) {
            i8 += ((Number) selector.invoke(Long.valueOf(j8))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (long j9 : jArr) {
            j8 += ((Number) selector.invoke(Long.valueOf(j9))).longValue();
        }
        return j8;
    }

    public static final List<Short> takeLastWhile(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Short.valueOf(sArr[lastIndex]))).booleanValue()) {
                return drop(sArr, lastIndex + 1);
            }
        }
        return toList(sArr);
    }

    public static final List<Short> takeWhile(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s7 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s7));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Long>> C toCollection(long[] jArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (long j8 : jArr) {
            destination.add(Long.valueOf(j8));
        }
        return destination;
    }

    public static final HashSet<Character> toHashSet(char[] cArr) {
        int coerceAtMost;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        coerceAtMost = j6.v.coerceAtMost(cArr.length, 128);
        mapCapacity = l0.mapCapacity(coerceAtMost);
        return (HashSet) toCollection(cArr, new HashSet(mapCapacity));
    }

    public static final List<Short> toList(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Short.valueOf(sArr[0]));
        }
        return toMutableList(sArr);
    }

    public static final Set<Character> toMutableSet(char[] cArr) {
        int coerceAtMost;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        coerceAtMost = j6.v.coerceAtMost(cArr.length, 128);
        mapCapacity = l0.mapCapacity(coerceAtMost);
        return (Set) toCollection(cArr, new LinkedHashSet(mapCapacity));
    }

    public static final Set<Short> toSet(short[] sArr) {
        Set<Short> emptySet;
        Set<Short> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(sArr.length);
            return (Set) toCollection(sArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Short.valueOf(sArr[0]));
        return of;
    }

    public static final Set<Long> union(long[] jArr, Iterable<Long> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<c0> withIndex(final char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return new d0(new f6.a() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Character> invoke() {
                return kotlin.jvm.internal.i.iterator(cArr);
            }
        });
    }

    public static final <T> boolean any(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Long, V> associateWith(long[] jArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(jArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j8 : jArr) {
            linkedHashMap.put(Long.valueOf(j8), valueSelector.invoke(Long.valueOf(j8)));
        }
        return linkedHashMap;
    }

    public static final <T> int count(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Integer> filterIndexed(int[] iArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
            i8++;
            i9 = i11;
        }
        return arrayList;
    }

    private static final Integer findLast(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                int i9 = iArr[length];
                if (((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                    return Integer.valueOf(i9);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static int first(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T firstOrNull(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        return null;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(int[] iArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(int[] iArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 : iArr) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    public static int last(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[getLastIndex(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T lastOrNull(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            T t7 = tArr[length];
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(int[] iArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i8 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(int[] iArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> byte maxByOrThrow(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b8;
            }
            Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte b9 = bArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b9));
                if (comparable.compareTo(comparable2) < 0) {
                    b8 = b9;
                    comparable = comparable2;
                }
            }
            return b8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> byte minByOrThrow(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b8;
            }
            Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte b9 = bArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b9));
                if (comparable.compareTo(comparable2) > 0) {
                    b8 = b9;
                    comparable = comparable2;
                }
            }
            return b8;
        }
        throw new NoSuchElementException();
    }

    public static final <T> boolean none(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T random(T[] tArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (tArr.length != 0) {
            return tArr[random.nextInt(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T randomOrNull(T[] tArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    public static final Short reduceIndexedOrNull(short[] sArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s7 = ((Number) operation.invoke(Integer.valueOf(nextInt), Short.valueOf(s7), Short.valueOf(sArr[nextInt]))).shortValue();
        }
        return Short.valueOf(s7);
    }

    public static final Short reduceOrNull(short[] sArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            s7 = ((Number) operation.invoke(Short.valueOf(s7), Short.valueOf(sArr[it.nextInt()]))).shortValue();
        }
        return Short.valueOf(s7);
    }

    public static final List<Integer> reversed(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Integer> mutableList = toMutableList(iArr);
        x.reverse(mutableList);
        return mutableList;
    }

    public static final <T> void shuffle(T[] tArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(tArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            T t7 = tArr[lastIndex];
            tArr[lastIndex] = tArr[nextInt];
            tArr[nextInt] = t7;
        }
    }

    public static final <T> T singleOrNull(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        boolean z7 = false;
        for (T t8 : tArr) {
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

    public static int[] sliceArray(int[] iArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr2[i8] = iArr[it.next().intValue()];
            i8++;
        }
        return iArr2;
    }

    private static final int sumOfUInt(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (int i8 : iArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Integer.valueOf(i8))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (int i8 : iArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Integer.valueOf(i8))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final List<Float> toMutableList(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(int[] iArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean any(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Float> asIterable(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new f(fArr);
    }

    public static final kotlin.sequences.m asSequence(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new o(fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(float[] fArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (float f8 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f8)), Float.valueOf(f8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(float[] fArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (float f8 : fArr) {
            Pair pair = (Pair) transform.invoke(Float.valueOf(f8));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Float, ? super V>> M associateWithTo(float[] fArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (float f8 : fArr) {
            destination.put(Float.valueOf(f8), valueSelector.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    public static final int count(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Float> drop(float[] fArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(fArr.length - i8, 0);
            return takeLast(fArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Float> dropLast(float[] fArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(fArr.length - i8, 0);
            return take(fArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Short> dropWhile(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (short s7 : sArr) {
            if (z7) {
                arrayList.add(Short.valueOf(s7));
            } else if (!((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                arrayList.add(Short.valueOf(s7));
                z7 = true;
            }
        }
        return arrayList;
    }

    public static final List<Float> filter(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Float>> C filterIndexedTo(float[] fArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            float f8 = fArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Float.valueOf(f8))).booleanValue()) {
                destination.add(Float.valueOf(f8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Float> filterNot(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            }
        }
        return arrayList;
    }

    public static final Byte firstOrNull(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                return Byte.valueOf(b8);
            }
        }
        return null;
    }

    public static final <R> R foldRight(float[] fArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Float.valueOf(fArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(float[] fArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r8);
        }
        return r8;
    }

    public static int indexOf(long[] jArr, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (j8 == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Float.valueOf(fArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Float> intersect(float[] fArr, Iterable<Float> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (j8 == jArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(float[] fArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(float[] fArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (float f8 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    private static final <R> R maxOfWithOrNull(short[] sArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <R> R minOfWithOrNull(short[] sArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final boolean none(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final short reduce(short[] sArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                s7 = ((Number) operation.invoke(Short.valueOf(s7), Short.valueOf(sArr[it.nextInt()]))).shortValue();
            }
            return s7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceIndexed(short[] sArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                s7 = ((Number) operation.invoke(Integer.valueOf(nextInt), Short.valueOf(s7), Short.valueOf(sArr[nextInt]))).shortValue();
            }
            return s7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static short[] reversedArray(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int lastIndex = getLastIndex(sArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            sArr2[lastIndex - nextInt] = sArr[nextInt];
        }
        return sArr2;
    }

    private static final <R> List<R> runningFold(short[] sArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r8);
        for (short s7 : sArr) {
            r8 = (R) operation.invoke(r8, Short.valueOf(s7));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(short[] sArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r8);
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Short.valueOf(sArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final List<Float> slice(float[] fArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            kotlin.collections.k.sort(jArr);
            reverse(jArr);
        }
    }

    public static final float[] sortedArray(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return copyOf;
    }

    public static final float[] sortedArrayDescending(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final Set<Float> subtract(float[] fArr, Iterable<Float> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (float f8 : fArr) {
            i8 += ((Number) selector.invoke(Float.valueOf(f8))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (float f8 : fArr) {
            d8 += ((Number) selector.invoke(Float.valueOf(f8))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (float f8 : fArr) {
            d8 += ((Number) selector.invoke(Float.valueOf(f8))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (float f8 : fArr) {
            i8 += ((Number) selector.invoke(Float.valueOf(f8))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (float f8 : fArr) {
            j8 += ((Number) selector.invoke(Float.valueOf(f8))).longValue();
        }
        return j8;
    }

    public static final <C extends Collection<? super Float>> C toCollection(float[] fArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (float f8 : fArr) {
            destination.add(Float.valueOf(f8));
        }
        return destination;
    }

    public static final Set<Float> union(float[] fArr, Iterable<Float> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Float, V> associateWith(float[] fArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(fArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f8 : fArr) {
            linkedHashMap.put(Float.valueOf(f8), valueSelector.invoke(Float.valueOf(f8)));
        }
        return linkedHashMap;
    }

    public static final int count(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final Short firstOrNull(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                return Short.valueOf(s7);
            }
        }
        return null;
    }

    public static final Short maxWithOrNull(short[] sArr, Comparator<? super Short> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s7), Short.valueOf(s8)) < 0) {
                s7 = s8;
            }
        }
        return Short.valueOf(s7);
    }

    public static final Short minWithOrNull(short[] sArr, Comparator<? super Short> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s7), Short.valueOf(s8)) > 0) {
                s7 = s8;
            }
        }
        return Short.valueOf(s7);
    }

    public static final boolean none(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Byte randomOrNull(byte[] bArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    public static final Integer reduceRightIndexedOrNull(int[] iArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int i8 = iArr[lastIndex];
        for (int i9 = lastIndex - 1; i9 >= 0; i9--) {
            i8 = ((Number) operation.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i9]), Integer.valueOf(i8))).intValue();
        }
        return Integer.valueOf(i8);
    }

    public static final Integer reduceRightOrNull(int[] iArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int i8 = iArr[lastIndex];
        for (int i9 = lastIndex - 1; i9 >= 0; i9--) {
            i8 = ((Number) operation.invoke(Integer.valueOf(iArr[i9]), Integer.valueOf(i8))).intValue();
        }
        return Integer.valueOf(i8);
    }

    public static final Byte singleOrNull(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Byte b8 = null;
        boolean z7 = false;
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                if (z7) {
                    return null;
                }
                b8 = Byte.valueOf(b9);
                z7 = true;
            }
        }
        if (z7) {
            return b8;
        }
        return null;
    }

    public static final List<Double> toMutableList(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d8 : dArr) {
            arrayList.add(Double.valueOf(d8));
        }
        return arrayList;
    }

    public static final boolean any(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Double> asIterable(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new g(dArr);
    }

    public static final kotlin.sequences.m asSequence(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new p(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(int[] iArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(iArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 : iArr) {
            Pair pair = (Pair) transform.invoke(Integer.valueOf(i8));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Integer> associateBy(int[] iArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(iArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i8)), Integer.valueOf(i8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(double[] dArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (double d8 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d8)), Double.valueOf(d8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(double[] dArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (double d8 : dArr) {
            Pair pair = (Pair) transform.invoke(Double.valueOf(d8));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Double, ? super V>> M associateWithTo(double[] dArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (double d8 : dArr) {
            destination.put(Double.valueOf(d8), valueSelector.invoke(Double.valueOf(d8)));
        }
        return destination;
    }

    public static final int count(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (int i9 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final <K> List<Short> distinctBy(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s7 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s7)))) {
                arrayList.add(Short.valueOf(s7));
            }
        }
        return arrayList;
    }

    public static final List<Double> drop(double[] dArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(dArr.length - i8, 0);
            return takeLast(dArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Double> dropLast(double[] dArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(dArr.length - i8, 0);
            return take(dArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Integer> dropLastWhile(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(iArr[lastIndex]))).booleanValue()) {
                return take(iArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Double> filter(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                arrayList.add(Double.valueOf(d8));
            }
        }
        return arrayList;
    }

    public static final List<Long> filterIndexed(long[] jArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            long j8 = jArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Double>> C filterIndexedTo(double[] dArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            double d8 = dArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Double.valueOf(d8))).booleanValue()) {
                destination.add(Double.valueOf(d8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Double> filterNot(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d8 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                arrayList.add(Double.valueOf(d8));
            }
        }
        return arrayList;
    }

    private static final Long findLast(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                long j8 = jArr[length];
                if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                    return Long.valueOf(j8);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static long first(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer firstOrNull(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return Integer.valueOf(i8);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(int[] iArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i8)));
        }
        return arrayList;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(long[] jArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(long[] jArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (long j8 : jArr) {
            v.addAll(destination, (Iterable) transform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final <R> R foldRight(double[] dArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Double.valueOf(dArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(double[] dArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final /* synthetic */ int indexOf(float[] fArr, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (f8 == fArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Double.valueOf(dArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Double> intersect(double[] dArr, Iterable<Double> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static long last(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[getLastIndex(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final /* synthetic */ int lastIndexOf(float[] fArr, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (f8 == fArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Byte lastOrNull(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            byte b8 = bArr[length];
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                return Byte.valueOf(b8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(long[] jArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(long[] jArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(double[] dArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(double[] dArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (double d8 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d8)));
        }
        return destination;
    }

    private static final double maxOf(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m383maxOfOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(short[] sArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T maxOrNull(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            if (t7.compareTo(t8) < 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T extends Comparable<? super T>> T maxOrThrow(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t7 = tArr[0];
            f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                T t8 = tArr[it.nextInt()];
                if (t7.compareTo(t8) < 0) {
                    t7 = t8;
                }
            }
            return t7;
        }
        throw new NoSuchElementException();
    }

    public static final short maxWithOrThrow(short[] sArr, Comparator<? super Short> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s8 = sArr[it.nextInt()];
                if (comparator.compare(Short.valueOf(s7), Short.valueOf(s8)) < 0) {
                    s7 = s8;
                }
            }
            return s7;
        }
        throw new NoSuchElementException();
    }

    private static final double minOf(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m419minOfOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(short[] sArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T minOrNull(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t8 = tArr[it.nextInt()];
            if (t7.compareTo(t8) > 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T extends Comparable<? super T>> T minOrThrow(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t7 = tArr[0];
            f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                T t8 = tArr[it.nextInt()];
                if (t7.compareTo(t8) > 0) {
                    t7 = t8;
                }
            }
            return t7;
        }
        throw new NoSuchElementException();
    }

    public static final short minWithOrThrow(short[] sArr, Comparator<? super Short> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s8 = sArr[it.nextInt()];
                if (comparator.compare(Short.valueOf(s7), Short.valueOf(s8)) > 0) {
                    s7 = s8;
                }
            }
            return s7;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final byte random(byte[] bArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (bArr.length != 0) {
            return bArr[random.nextInt(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int reduceRight(int[] iArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int i8 = iArr[lastIndex];
            for (int i9 = lastIndex - 1; i9 >= 0; i9--) {
                i8 = ((Number) operation.invoke(Integer.valueOf(iArr[i9]), Integer.valueOf(i8))).intValue();
            }
            return i8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceRightIndexed(int[] iArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int i8 = iArr[lastIndex];
            for (int i9 = lastIndex - 1; i9 >= 0; i9--) {
                i8 = ((Number) operation.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i9]), Integer.valueOf(i8))).intValue();
            }
            return i8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(sArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            short s7 = sArr[nextInt];
            sArr[nextInt] = sArr[lastIndex];
            sArr[lastIndex] = s7;
            lastIndex--;
        }
    }

    public static final List<Long> reversed(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Long> mutableList = toMutableList(jArr);
        x.reverse(mutableList);
        return mutableList;
    }

    private static final List<Short> runningReduce(short[] sArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short s7 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s7));
        int length = sArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            s7 = ((Number) operation.invoke(Short.valueOf(s7), Short.valueOf(sArr[i8]))).shortValue();
            arrayList.add(Short.valueOf(s7));
        }
        return arrayList;
    }

    private static final List<Short> runningReduceIndexed(short[] sArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short s7 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s7));
        int length = sArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            s7 = ((Number) operation.invoke(Integer.valueOf(i8), Short.valueOf(s7), Short.valueOf(sArr[i8]))).shortValue();
            arrayList.add(Short.valueOf(s7));
        }
        return arrayList;
    }

    public static int single(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final List<Double> slice(double[] dArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static long[] sliceArray(long[] jArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr2[i8] = jArr[it.next().intValue()];
            i8++;
        }
        return jArr2;
    }

    public static final double[] sortedArray(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return copyOf;
    }

    public static final double[] sortedArrayDescending(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final Set<Double> subtract(double[] dArr, Iterable<Double> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (double d8 : dArr) {
            i8 += ((Number) selector.invoke(Double.valueOf(d8))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (double d9 : dArr) {
            d8 += ((Number) selector.invoke(Double.valueOf(d9))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (double d9 : dArr) {
            d8 += ((Number) selector.invoke(Double.valueOf(d9))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (double d8 : dArr) {
            i8 += ((Number) selector.invoke(Double.valueOf(d8))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (double d8 : dArr) {
            j8 += ((Number) selector.invoke(Double.valueOf(d8))).longValue();
        }
        return j8;
    }

    private static final int sumOfUInt(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (long j8 : jArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Long.valueOf(j8))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (long j8 : jArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Long.valueOf(j8))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final List<Integer> takeLastWhile(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(iArr[lastIndex]))).booleanValue()) {
                return drop(iArr, lastIndex + 1);
            }
        }
        return toList(iArr);
    }

    public static final List<Integer> takeWhile(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Double>> C toCollection(double[] dArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (double d8 : dArr) {
            destination.add(Double.valueOf(d8));
        }
        return destination;
    }

    public static final List<Integer> toList(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Integer.valueOf(iArr[0]));
        }
        return toMutableList(iArr);
    }

    public static final Set<Integer> toSet(int[] iArr) {
        Set<Integer> emptySet;
        Set<Integer> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(iArr.length);
            return (Set) toCollection(iArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Integer.valueOf(iArr[0]));
        return of;
    }

    public static final Set<Double> union(double[] dArr, Iterable<Double> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <R, V> List<V> zip(long[] jArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean any(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Double, V> associateWith(double[] dArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(dArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d8 : dArr) {
            linkedHashMap.put(Double.valueOf(d8), valueSelector.invoke(Double.valueOf(d8)));
        }
        return linkedHashMap;
    }

    public static final int count(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final Long firstOrNull(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return Long.valueOf(j8);
            }
        }
        return null;
    }

    public static final <A extends Appendable> A joinTo(short[] sArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (short s7 : sArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Short.valueOf(s7)));
            } else {
                buffer.append(String.valueOf((int) s7));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean none(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Short randomOrNull(short[] sArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    public static final void sortDescending(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            kotlin.collections.k.sort(fArr);
            reverse(fArr);
        }
    }

    public static final List<Boolean> toMutableList(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z7 : zArr) {
            arrayList.add(Boolean.valueOf(z7));
        }
        return arrayList;
    }

    public static final boolean any(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Boolean> asIterable(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new h(zArr);
    }

    public static final kotlin.sequences.m asSequence(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new q(zArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(boolean[] zArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z7 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z7)), Boolean.valueOf(z7));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(boolean[] zArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (boolean z7 : zArr) {
            Pair pair = (Pair) transform.invoke(Boolean.valueOf(z7));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Boolean, ? super V>> M associateWithTo(boolean[] zArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (boolean z7 : zArr) {
            destination.put(Boolean.valueOf(z7), valueSelector.invoke(Boolean.valueOf(z7)));
        }
        return destination;
    }

    public static final int count(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Boolean> drop(boolean[] zArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(zArr.length - i8, 0);
            return takeLast(zArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Boolean> dropLast(boolean[] zArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(zArr.length - i8, 0);
            return take(zArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Boolean> filter(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z7));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(boolean[] zArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            boolean z7 = zArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Boolean.valueOf(z7))).booleanValue()) {
                destination.add(Boolean.valueOf(z7));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Boolean> filterNot(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z7 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z7));
            }
        }
        return arrayList;
    }

    public static final Float firstOrNull(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return Float.valueOf(f8);
            }
        }
        return null;
    }

    public static final <R> R foldRight(boolean[] zArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Boolean.valueOf(zArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(boolean[] zArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(short[] sArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (short s7 : sArr) {
            Object invoke = keySelector.invoke(Short.valueOf(s7));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s7));
        }
        return destination;
    }

    public static final /* synthetic */ int indexOf(double[] dArr, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (d8 == dArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(zArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Boolean.valueOf(zArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Boolean> intersect(boolean[] zArr, Iterable<Boolean> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final /* synthetic */ int lastIndexOf(double[] dArr, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (d8 == dArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(boolean[] zArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(boolean[] zArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (boolean z7 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z7)));
        }
        return destination;
    }

    public static final boolean none(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Pair<List<Short>, List<Short>> partition(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                arrayList.add(Short.valueOf(s7));
            } else {
                arrayList2.add(Short.valueOf(s7));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Integer reduceIndexedOrNull(int[] iArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            i8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Integer.valueOf(i8), Integer.valueOf(iArr[nextInt]))).intValue();
        }
        return Integer.valueOf(i8);
    }

    public static final Integer reduceOrNull(int[] iArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            i8 = ((Number) operation.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[it.nextInt()]))).intValue();
        }
        return Integer.valueOf(i8);
    }

    public static final void shuffle(byte[] bArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            byte b8 = bArr[lastIndex];
            bArr[lastIndex] = bArr[nextInt];
            bArr[nextInt] = b8;
        }
    }

    public static final Short singleOrNull(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Short sh = null;
        boolean z7 = false;
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                if (z7) {
                    return null;
                }
                sh = Short.valueOf(s7);
                z7 = true;
            }
        }
        if (z7) {
            return sh;
        }
        return null;
    }

    public static final List<Boolean> slice(boolean[] zArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final char[] sortedArray(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        kotlin.collections.k.sort(copyOf);
        return copyOf;
    }

    public static final char[] sortedArrayDescending(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final Set<Boolean> subtract(boolean[] zArr, Iterable<Boolean> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (boolean z7 : zArr) {
            i8 += ((Number) selector.invoke(Boolean.valueOf(z7))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (boolean z7 : zArr) {
            d8 += ((Number) selector.invoke(Boolean.valueOf(z7))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (boolean z7 : zArr) {
            d8 += ((Number) selector.invoke(Boolean.valueOf(z7))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (boolean z7 : zArr) {
            i8 += ((Number) selector.invoke(Boolean.valueOf(z7))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (boolean z7 : zArr) {
            j8 += ((Number) selector.invoke(Boolean.valueOf(z7))).longValue();
        }
        return j8;
    }

    public static final List<Short> take(short[] sArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= sArr.length) {
            return toList(sArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (short s7 : sArr) {
            arrayList.add(Short.valueOf(s7));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Short> takeLast(short[] sArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = sArr.length;
        if (i8 >= length) {
            return toList(sArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Short.valueOf(sArr[i9]));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Boolean>> C toCollection(boolean[] zArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (boolean z7 : zArr) {
            destination.add(Boolean.valueOf(z7));
        }
        return destination;
    }

    public static final Set<Boolean> union(boolean[] zArr, Iterable<Boolean> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Boolean, V> associateWith(boolean[] zArr, f6.l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(zArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z7 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z7), valueSelector.invoke(Boolean.valueOf(z7)));
        }
        return linkedHashMap;
    }

    public static final int count(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Integer> dropWhile(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (int i8 : iArr) {
            if (z7) {
                arrayList.add(Integer.valueOf(i8));
            } else if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
                z7 = true;
            }
        }
        return arrayList;
    }

    public static final List<Float> filterIndexed(float[] fArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            float f8 = fArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    private static final Float findLast(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                float f8 = fArr[length];
                if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                    return Float.valueOf(f8);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static final float first(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Double firstOrNull(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                return Double.valueOf(d8);
            }
        }
        return null;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(float[] fArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(float[] fArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (float f8 : fArr) {
            v.addAll(destination, (Iterable) transform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    public static final float last(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[getLastIndex(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Short lastOrNull(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            short s7 = sArr[length];
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                return Short.valueOf(s7);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(float[] fArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f8 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(float[] fArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    private static final <R> R maxOfWithOrNull(int[] iArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <R> R minOfWithOrNull(int[] iArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final boolean none(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final short random(short[] sArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (sArr.length != 0) {
            return sArr[random.nextInt(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer randomOrNull(int[] iArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    public static final int reduce(int[] iArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                i8 = ((Number) operation.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[it.nextInt()]))).intValue();
            }
            return i8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceIndexed(int[] iArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                i8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Integer.valueOf(i8), Integer.valueOf(iArr[nextInt]))).intValue();
            }
            return i8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final Long reduceRightIndexedOrNull(long[] jArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long j8 = jArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            j8 = ((Number) operation.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]), Long.valueOf(j8))).longValue();
        }
        return Long.valueOf(j8);
    }

    public static final Long reduceRightOrNull(long[] jArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long j8 = jArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            j8 = ((Number) operation.invoke(Long.valueOf(jArr[i8]), Long.valueOf(j8))).longValue();
        }
        return Long.valueOf(j8);
    }

    public static final List<Float> reversed(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Float> mutableList = toMutableList(fArr);
        x.reverse(mutableList);
        return mutableList;
    }

    public static int[] reversedArray(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int lastIndex = getLastIndex(iArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            iArr2[lastIndex - nextInt] = iArr[nextInt];
        }
        return iArr2;
    }

    private static final <R> List<R> runningFold(int[] iArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r8);
        for (int i8 : iArr) {
            r8 = (R) operation.invoke(r8, Integer.valueOf(i8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(int[] iArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r8);
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Integer.valueOf(iArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final float[] sliceArray(float[] fArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            fArr2[i8] = fArr[it.next().intValue()];
            i8++;
        }
        return fArr2;
    }

    private static final int sumOfUInt(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (float f8 : fArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Float.valueOf(f8))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (float f8 : fArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Float.valueOf(f8))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final List<Character> toMutableList(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c8 : cArr) {
            arrayList.add(Character.valueOf(c8));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(float[] fArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean any(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Character> asIterable(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new i(cArr);
    }

    public static final kotlin.sequences.m asSequence(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new r(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(long[] jArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(jArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j8 : jArr) {
            Pair pair = (Pair) transform.invoke(Long.valueOf(j8));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Long> associateBy(long[] jArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(jArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j8 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j8)), Long.valueOf(j8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(char[] cArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (char c8 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c8)), Character.valueOf(c8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(char[] cArr, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (char c8 : cArr) {
            Pair pair = (Pair) transform.invoke(Character.valueOf(c8));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(char[] cArr, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (char c8 : cArr) {
            destination.put(Character.valueOf(c8), valueSelector.invoke(Character.valueOf(c8)));
        }
        return destination;
    }

    public static final int count(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Character> drop(char[] cArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(cArr.length - i8, 0);
            return takeLast(cArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Character> dropLast(char[] cArr, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(cArr.length - i8, 0);
            return take(cArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Long> dropLastWhile(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Long.valueOf(jArr[lastIndex]))).booleanValue()) {
                return take(jArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Character> filter(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                arrayList.add(Character.valueOf(c8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Character>> C filterIndexedTo(char[] cArr, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            char c8 = cArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(c8))).booleanValue()) {
                destination.add(Character.valueOf(c8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Character> filterNot(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c8 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                arrayList.add(Character.valueOf(c8));
            }
        }
        return arrayList;
    }

    public static final Boolean firstOrNull(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                return Boolean.valueOf(z7);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(long[] jArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Long.valueOf(j8)));
        }
        return arrayList;
    }

    public static final <R> R foldRight(char[] cArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Character.valueOf(cArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(char[] cArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <K> Map<K, List<Short>> groupBy(short[] sArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s7 : sArr) {
            Object invoke = keySelector.invoke(Short.valueOf(s7));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s7));
        }
        return linkedHashMap;
    }

    public static final int indexOf(boolean[] zArr, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (z7 == zArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(cArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Character.valueOf(cArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Character> intersect(char[] cArr, Iterable<Character> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        v.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final int lastIndexOf(boolean[] zArr, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (z7 == zArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(char[] cArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(char[] cArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (char c8 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c8)));
        }
        return destination;
    }

    public static final boolean none(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final long reduceRight(long[] jArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long j8 = jArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                j8 = ((Number) operation.invoke(Long.valueOf(jArr[i8]), Long.valueOf(j8))).longValue();
            }
            return j8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceRightIndexed(long[] jArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long j8 = jArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                j8 = ((Number) operation.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]), Long.valueOf(j8))).longValue();
            }
            return j8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static long single(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final List<Character> slice(char[] cArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return kotlin.collections.k.asList(kotlin.collections.k.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            kotlin.collections.k.sort(dArr);
            reverse(dArr);
        }
    }

    public static final Set<Character> subtract(char[] cArr, Iterable<Character> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        v.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (char c8 : cArr) {
            i8 += ((Number) selector.invoke(Character.valueOf(c8))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (char c8 : cArr) {
            d8 += ((Number) selector.invoke(Character.valueOf(c8))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (char c8 : cArr) {
            d8 += ((Number) selector.invoke(Character.valueOf(c8))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (char c8 : cArr) {
            i8 += ((Number) selector.invoke(Character.valueOf(c8))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (char c8 : cArr) {
            j8 += ((Number) selector.invoke(Character.valueOf(c8))).longValue();
        }
        return j8;
    }

    public static final List<Long> takeLastWhile(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Long.valueOf(jArr[lastIndex]))).booleanValue()) {
                return drop(jArr, lastIndex + 1);
            }
        }
        return toList(jArr);
    }

    public static final List<Long> takeWhile(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Character>> C toCollection(char[] cArr, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (char c8 : cArr) {
            destination.add(Character.valueOf(c8));
        }
        return destination;
    }

    public static final List<Long> toList(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Long.valueOf(jArr[0]));
        }
        return toMutableList(jArr);
    }

    public static final Set<Long> toSet(long[] jArr) {
        Set<Long> emptySet;
        Set<Long> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(jArr.length);
            return (Set) toCollection(jArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Long.valueOf(jArr[0]));
        return of;
    }

    public static final Set<Character> union(char[] cArr, Iterable<Character> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        v.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <V> Map<Character, V> associateWith(char[] cArr, f6.l valueSelector) {
        int coerceAtMost;
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        coerceAtMost = j6.v.coerceAtMost(cArr.length, 128);
        mapCapacity = l0.mapCapacity(coerceAtMost);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c8 : cArr) {
            linkedHashMap.put(Character.valueOf(c8), valueSelector.invoke(Character.valueOf(c8)));
        }
        return linkedHashMap;
    }

    public static final int count(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final Character firstOrNull(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                return Character.valueOf(c8);
            }
        }
        return null;
    }

    public static final Byte maxOrNull(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            if (b8 < b9) {
                b8 = b9;
            }
        }
        return Byte.valueOf(b8);
    }

    public static final Integer maxWithOrNull(int[] iArr, Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) < 0) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final Byte minOrNull(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            if (b8 > b9) {
                b8 = b9;
            }
        }
        return Byte.valueOf(b8);
    }

    public static final Integer minWithOrNull(int[] iArr, Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) > 0) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final boolean none(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Long randomOrNull(long[] jArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    public static final Integer singleOrNull(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Integer num = null;
        boolean z7 = false;
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                if (z7) {
                    return null;
                }
                num = Integer.valueOf(i8);
                z7 = true;
            }
        }
        if (z7) {
            return num;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(T[] tArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t7 : tArr) {
            destination.put(keySelector.invoke(t7), valueTransform.invoke(t7));
        }
        return destination;
    }

    public static final <K> List<Integer> distinctBy(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i8)))) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        return arrayList;
    }

    public static final List<Double> filterIndexed(double[] dArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            double d8 = dArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Double.valueOf(d8))).booleanValue()) {
                arrayList.add(Double.valueOf(d8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    private static final Double findLast(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                double d8 = dArr[length];
                if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                    return Double.valueOf(d8);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static final double first(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(double[] dArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(double[] dArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (double d8 : dArr) {
            v.addAll(destination, (Iterable) transform.invoke(Double.valueOf(d8)));
        }
        return destination;
    }

    public static final int indexOf(char[] cArr, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (c8 == cArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final double last(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[getLastIndex(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int lastIndexOf(char[] cArr, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (c8 == cArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Integer lastOrNull(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            int i9 = iArr[length];
            if (((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                return Integer.valueOf(i9);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(double[] dArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d8 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(double[] dArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> Short maxByOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s7);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s8));
            if (comparable.compareTo(comparable2) < 0) {
                s7 = s8;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s7);
    }

    public static final <R extends Comparable<? super R>> short maxByOrThrow(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s7;
            }
            Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s7));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                short s8 = sArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s8));
                if (comparable.compareTo(comparable2) < 0) {
                    s7 = s8;
                    comparable = comparable2;
                }
            }
            return s7;
        }
        throw new NoSuchElementException();
    }

    private static final double maxOf(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m380maxOfOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(int[] iArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final byte maxOrThrow(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b9 = bArr[it.nextInt()];
                if (b8 < b9) {
                    b8 = b9;
                }
            }
            return b8;
        }
        throw new NoSuchElementException();
    }

    public static final int maxWithOrThrow(int[] iArr, Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) < 0) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Short minByOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s7);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s8));
            if (comparable.compareTo(comparable2) > 0) {
                s7 = s8;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s7);
    }

    public static final <R extends Comparable<? super R>> short minByOrThrow(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s7;
            }
            Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s7));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                short s8 = sArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s8));
                if (comparable.compareTo(comparable2) > 0) {
                    s7 = s8;
                    comparable = comparable2;
                }
            }
            return s7;
        }
        throw new NoSuchElementException();
    }

    private static final double minOf(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m416minOfOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(int[] iArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final byte minOrThrow(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b8 = bArr[0];
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b9 = bArr[it.nextInt()];
                if (b8 > b9) {
                    b8 = b9;
                }
            }
            return b8;
        }
        throw new NoSuchElementException();
    }

    public static final int minWithOrThrow(int[] iArr, Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) > 0) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final int random(int[] iArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (iArr.length != 0) {
            return iArr[random.nextInt(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static void reverse(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(iArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int i8 = iArr[nextInt];
            iArr[nextInt] = iArr[lastIndex];
            iArr[lastIndex] = i8;
            lastIndex--;
        }
    }

    public static final List<Double> reversed(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Double> mutableList = toMutableList(dArr);
        x.reverse(mutableList);
        return mutableList;
    }

    private static final List<Integer> runningReduce(int[] iArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i8 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i8));
        int length = iArr.length;
        for (int i9 = 1; i9 < length; i9++) {
            i8 = ((Number) operation.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[i9]))).intValue();
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    private static final List<Integer> runningReduceIndexed(int[] iArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i8 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i8));
        int length = iArr.length;
        for (int i9 = 1; i9 < length; i9++) {
            i8 = ((Number) operation.invoke(Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(iArr[i9]))).intValue();
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static final <T> List<T> slice(T[] tArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    public static final double[] sliceArray(double[] dArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            dArr2[i8] = dArr[it.next().intValue()];
            i8++;
        }
        return dArr2;
    }

    public static final double sumOfDouble(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (Double d9 : dArr) {
            d8 += d9.doubleValue();
        }
        return d8;
    }

    public static final int sumOfInt(Integer[] numArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(numArr, "<this>");
        int i8 = 0;
        for (Integer num : numArr) {
            i8 += num.intValue();
        }
        return i8;
    }

    public static final long sumOfLong(Long[] lArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(lArr, "<this>");
        long j8 = 0;
        for (Long l8 : lArr) {
            j8 += l8.longValue();
        }
        return j8;
    }

    private static final int sumOfUInt(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (double d8 : dArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Double.valueOf(d8))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (double d8 : dArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Double.valueOf(d8))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final <R, V> List<V> zip(double[] dArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final Float randomOrNull(float[] fArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    public static final Long reduceIndexedOrNull(long[] jArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            j8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Long.valueOf(j8), Long.valueOf(jArr[nextInt]))).longValue();
        }
        return Long.valueOf(j8);
    }

    public static final Long reduceOrNull(long[] jArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            j8 = ((Number) operation.invoke(Long.valueOf(j8), Long.valueOf(jArr[it.nextInt()]))).longValue();
        }
        return Long.valueOf(j8);
    }

    public static final Float reduceRightIndexedOrNull(float[] fArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float f8 = fArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            f8 = ((Number) operation.invoke(Integer.valueOf(i8), Float.valueOf(fArr[i8]), Float.valueOf(f8))).floatValue();
        }
        return Float.valueOf(f8);
    }

    public static final Float reduceRightOrNull(float[] fArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float f8 = fArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            f8 = ((Number) operation.invoke(Float.valueOf(fArr[i8]), Float.valueOf(f8))).floatValue();
        }
        return Float.valueOf(f8);
    }

    public static final void shuffle(short[] sArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            short s7 = sArr[lastIndex];
            sArr[lastIndex] = sArr[nextInt];
            sArr[nextInt] = s7;
        }
    }

    public static final void sortDescending(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            kotlin.collections.k.sort(cArr);
            reverse(cArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(float[] fArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(fArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f8 : fArr) {
            Pair pair = (Pair) transform.invoke(Float.valueOf(f8));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Float> associateBy(float[] fArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(fArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f8 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f8)), Float.valueOf(f8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(byte[] bArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b8 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b8)), valueTransform.invoke(Byte.valueOf(b8)));
        }
        return destination;
    }

    public static final List<Float> dropLastWhile(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Float.valueOf(fArr[lastIndex]))).booleanValue()) {
                return take(fArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Long> dropWhile(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (long j8 : jArr) {
            if (z7) {
                arrayList.add(Long.valueOf(j8));
            } else if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
                z7 = true;
            }
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(float[] fArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Float.valueOf(f8)));
        }
        return arrayList;
    }

    public static final <A extends Appendable> A joinTo(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (int i10 : iArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Integer.valueOf(i10)));
            } else {
                buffer.append(String.valueOf(i10));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    private static final <R> R maxOfWithOrNull(long[] jArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <R> R minOfWithOrNull(long[] jArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final long reduce(long[] jArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                j8 = ((Number) operation.invoke(Long.valueOf(j8), Long.valueOf(jArr[it.nextInt()]))).longValue();
            }
            return j8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceIndexed(long[] jArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                j8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Long.valueOf(j8), Long.valueOf(jArr[nextInt]))).longValue();
            }
            return j8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRight(float[] fArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float f8 = fArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                f8 = ((Number) operation.invoke(Float.valueOf(fArr[i8]), Float.valueOf(f8))).floatValue();
            }
            return f8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRightIndexed(float[] fArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float f8 = fArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                f8 = ((Number) operation.invoke(Integer.valueOf(i8), Float.valueOf(fArr[i8]), Float.valueOf(f8))).floatValue();
            }
            return f8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static long[] reversedArray(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int lastIndex = getLastIndex(jArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            jArr2[lastIndex - nextInt] = jArr[nextInt];
        }
        return jArr2;
    }

    private static final <R> List<R> runningFold(long[] jArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r8);
        for (long j8 : jArr) {
            r8 = (R) operation.invoke(r8, Long.valueOf(j8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(long[] jArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r8);
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Long.valueOf(jArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final float single(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Long singleOrNull(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Long l8 = null;
        boolean z7 = false;
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                if (z7) {
                    return null;
                }
                l8 = Long.valueOf(j8);
                z7 = true;
            }
        }
        if (z7) {
            return l8;
        }
        return null;
    }

    public static final List<Float> takeLastWhile(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Float.valueOf(fArr[lastIndex]))).booleanValue()) {
                return drop(fArr, lastIndex + 1);
            }
        }
        return toList(fArr);
    }

    public static final List<Float> takeWhile(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    public static final List<Float> toList(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Float.valueOf(fArr[0]));
        }
        return toMutableList(fArr);
    }

    public static final Set<Float> toSet(float[] fArr) {
        Set<Float> emptySet;
        Set<Float> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(fArr.length);
            return (Set) toCollection(fArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Float.valueOf(fArr[0]));
        return of;
    }

    public static final List<Boolean> filterIndexed(boolean[] zArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            boolean z7 = zArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Boolean.valueOf(z7))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z7));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    private static final Boolean findLast(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                boolean z7 = zArr[length];
                if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                    return Boolean.valueOf(z7);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static final boolean first(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(boolean[] zArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(boolean[] zArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (boolean z7 : zArr) {
            v.addAll(destination, (Iterable) transform.invoke(Boolean.valueOf(z7)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(int[] iArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 : iArr) {
            Object invoke = keySelector.invoke(Integer.valueOf(i8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i8));
        }
        return destination;
    }

    public static final boolean last(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[getLastIndex(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Long lastOrNull(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            long j8 = jArr[length];
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return Long.valueOf(j8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(boolean[] zArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z7 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z7)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(boolean[] zArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final Pair<List<Integer>, List<Integer>> partition(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
            } else {
                arrayList2.add(Integer.valueOf(i8));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final long random(long[] jArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (jArr.length != 0) {
            return jArr[random.nextInt(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Double randomOrNull(double[] dArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    public static final List<Boolean> reversed(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Boolean> mutableList = toMutableList(zArr);
        x.reverse(mutableList);
        return mutableList;
    }

    public static final boolean[] sliceArray(boolean[] zArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr2[i8] = zArr[it.next().intValue()];
            i8++;
        }
        return zArr2;
    }

    private static final int sumOfUInt(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (boolean z7 : zArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Boolean.valueOf(z7))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (boolean z7 : zArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Boolean.valueOf(z7))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final List<Integer> take(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= iArr.length) {
            return toList(iArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Integer> takeLast(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = iArr.length;
        if (i8 >= length) {
            return toList(iArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Integer.valueOf(iArr[i9]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(boolean[] zArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i8]), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(short[] sArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s7 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s7)), valueTransform.invoke(Short.valueOf(s7)));
        }
        return destination;
    }

    public static final Short maxOrNull(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            if (s7 < s8) {
                s7 = s8;
            }
        }
        return Short.valueOf(s7);
    }

    public static final Short minOrNull(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            if (s7 > s8) {
                s7 = s8;
            }
        }
        return Short.valueOf(s7);
    }

    public static final <T extends Comparable<? super T>> void sortDescending(T[] tArr, int i8, int i9) {
        Comparator reverseOrder;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        reverseOrder = kotlin.comparisons.g.reverseOrder();
        kotlin.collections.k.sortWith(tArr, reverseOrder, i8, i9);
    }

    public static final short maxOrThrow(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s8 = sArr[it.nextInt()];
                if (s7 < s8) {
                    s7 = s8;
                }
            }
            return s7;
        }
        throw new NoSuchElementException();
    }

    public static final Long maxWithOrNull(long[] jArr, Comparator<? super Long> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) < 0) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final short minOrThrow(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s7 = sArr[0];
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s8 = sArr[it.nextInt()];
                if (s7 > s8) {
                    s7 = s8;
                }
            }
            return s7;
        }
        throw new NoSuchElementException();
    }

    public static final Long minWithOrNull(long[] jArr, Comparator<? super Long> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) > 0) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final Boolean randomOrNull(boolean[] zArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    public static final Double reduceRightIndexedOrNull(double[] dArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double d8 = dArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            d8 = ((Number) operation.invoke(Integer.valueOf(i8), Double.valueOf(dArr[i8]), Double.valueOf(d8))).doubleValue();
        }
        return Double.valueOf(d8);
    }

    public static final Double reduceRightOrNull(double[] dArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double d8 = dArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            d8 = ((Number) operation.invoke(Double.valueOf(dArr[i8]), Double.valueOf(d8))).doubleValue();
        }
        return Double.valueOf(d8);
    }

    public static final Float singleOrNull(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Float f8 = null;
        boolean z7 = false;
        for (float f9 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f9))).booleanValue()) {
                if (z7) {
                    return null;
                }
                f8 = Float.valueOf(f9);
                z7 = true;
            }
        }
        if (z7) {
            return f8;
        }
        return null;
    }

    public static final List<Byte> slice(byte[] bArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final void sortDescending(byte[] bArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.collections.k.sort(bArr, i8, i9);
        reverse(bArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(double[] dArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(dArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d8 : dArr) {
            Pair pair = (Pair) transform.invoke(Double.valueOf(d8));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Double> associateBy(double[] dArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(dArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d8 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d8)), Double.valueOf(d8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(int[] iArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i8)), valueTransform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    public static final <K> List<Long> distinctBy(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j8)))) {
                arrayList.add(Long.valueOf(j8));
            }
        }
        return arrayList;
    }

    public static final List<Double> dropLastWhile(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Double.valueOf(dArr[lastIndex]))).booleanValue()) {
                return take(dArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Character> filterIndexed(char[] cArr, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            char c8 = cArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(c8))).booleanValue()) {
                arrayList.add(Character.valueOf(c8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    private static final Character findLast(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                char c8 = cArr[length];
                if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                    return Character.valueOf(c8);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static final char first(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <R> List<R> flatMap(double[] dArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d8 : dArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Double.valueOf(d8)));
        }
        return arrayList;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(char[] cArr, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(char[] cArr, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (char c8 : cArr) {
            v.addAll(destination, (Iterable) transform.invoke(Character.valueOf(c8)));
        }
        return destination;
    }

    public static final <K> Map<K, List<Integer>> groupBy(int[] iArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 : iArr) {
            Object invoke = keySelector.invoke(Integer.valueOf(i8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i8));
        }
        return linkedHashMap;
    }

    public static final char last(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[getLastIndex(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Float lastOrNull(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            float f8 = fArr[length];
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return Float.valueOf(f8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(char[] cArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c8 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(char[] cArr, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    private static final double maxOf(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m381maxOfOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(long[] jArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final long maxWithOrThrow(long[] jArr, Comparator<? super Long> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) < 0) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    private static final double minOf(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m417minOfOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(long[] jArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final long minWithOrThrow(long[] jArr, Comparator<? super Long> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) > 0) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final float random(float[] fArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (fArr.length != 0) {
            return fArr[random.nextInt(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Float reduceIndexedOrNull(float[] fArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            f8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Float.valueOf(f8), Float.valueOf(fArr[nextInt]))).floatValue();
        }
        return Float.valueOf(f8);
    }

    public static final Float reduceOrNull(float[] fArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f8 = ((Number) operation.invoke(Float.valueOf(f8), Float.valueOf(fArr[it.nextInt()]))).floatValue();
        }
        return Float.valueOf(f8);
    }

    public static final double reduceRight(double[] dArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double d8 = dArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                d8 = ((Number) operation.invoke(Double.valueOf(dArr[i8]), Double.valueOf(d8))).doubleValue();
            }
            return d8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceRightIndexed(double[] dArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double d8 = dArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                d8 = ((Number) operation.invoke(Integer.valueOf(i8), Double.valueOf(dArr[i8]), Double.valueOf(d8))).doubleValue();
            }
            return d8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(jArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            long j8 = jArr[nextInt];
            jArr[nextInt] = jArr[lastIndex];
            jArr[lastIndex] = j8;
            lastIndex--;
        }
    }

    public static final List<Character> reversed(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Character> mutableList = toMutableList(cArr);
        x.reverse(mutableList);
        return mutableList;
    }

    private static final List<Long> runningReduce(long[] jArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long j8 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j8));
        int length = jArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            j8 = ((Number) operation.invoke(Long.valueOf(j8), Long.valueOf(jArr[i8]))).longValue();
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    private static final List<Long> runningReduceIndexed(long[] jArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long j8 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j8));
        int length = jArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            j8 = ((Number) operation.invoke(Integer.valueOf(i8), Long.valueOf(j8), Long.valueOf(jArr[i8]))).longValue();
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static final void shuffle(int[] iArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            int i8 = iArr[lastIndex];
            iArr[lastIndex] = iArr[nextInt];
            iArr[nextInt] = i8;
        }
    }

    public static final double single(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final char[] sliceArray(char[] cArr, Collection<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            cArr2[i8] = cArr[it.next().intValue()];
            i8++;
        }
        return cArr2;
    }

    private static final int sumOfUInt(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (char c8 : cArr) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Character.valueOf(c8))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (char c8 : cArr) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Character.valueOf(c8))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final List<Double> takeLastWhile(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Double.valueOf(dArr[lastIndex]))).booleanValue()) {
                return drop(dArr, lastIndex + 1);
            }
        }
        return toList(dArr);
    }

    public static final List<Double> takeWhile(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d8 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d8));
        }
        return arrayList;
    }

    public static final List<Double> toList(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Double.valueOf(dArr[0]));
        }
        return toMutableList(dArr);
    }

    public static final Set<Double> toSet(double[] dArr) {
        Set<Double> emptySet;
        Set<Double> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(dArr.length);
            return (Set) toCollection(dArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Double.valueOf(dArr[0]));
        return of;
    }

    public static final <R, V> List<V> zip(char[] cArr, R[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final List<Float> dropWhile(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (float f8 : fArr) {
            if (z7) {
                arrayList.add(Float.valueOf(f8));
            } else if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
                z7 = true;
            }
        }
        return arrayList;
    }

    private static final <R> R maxOfWithOrNull(float[] fArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <R> R minOfWithOrNull(float[] fArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Character randomOrNull(char[] cArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    public static final float reduce(float[] fArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                f8 = ((Number) operation.invoke(Float.valueOf(f8), Float.valueOf(fArr[it.nextInt()]))).floatValue();
            }
            return f8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceIndexed(float[] fArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                f8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Float.valueOf(f8), Float.valueOf(fArr[nextInt]))).floatValue();
            }
            return f8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float[] reversedArray(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            fArr2[lastIndex - nextInt] = fArr[nextInt];
        }
        return fArr2;
    }

    private static final <R> List<R> runningFold(float[] fArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r8);
        for (float f8 : fArr) {
            r8 = (R) operation.invoke(r8, Float.valueOf(f8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(float[] fArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r8);
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Float.valueOf(fArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final void sortDescending(short[] sArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.collections.k.sort(sArr, i8, i9);
        reverse(sArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(long[] jArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j8 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j8)), valueTransform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final Double singleOrNull(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Double d8 = null;
        boolean z7 = false;
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                if (z7) {
                    return null;
                }
                d8 = Double.valueOf(d9);
                z7 = true;
            }
        }
        if (z7) {
            return d8;
        }
        return null;
    }

    public static final <T> T first(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (T t7 : tArr) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                return t7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <A extends Appendable> A joinTo(long[] jArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (long j8 : jArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Long.valueOf(j8)));
            } else {
                buffer.append(String.valueOf(j8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> T last(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                T t7 = tArr[length];
                if (!((Boolean) predicate.invoke(t7)).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return t7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Double lastOrNull(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            double d8 = dArr[length];
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                return Double.valueOf(d8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R extends Comparable<? super R>> int maxByOrThrow(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i8;
            }
            Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
                if (comparable.compareTo(comparable2) < 0) {
                    i8 = i9;
                    comparable = comparable2;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final Integer maxOrNull(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (i8 < i9) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final <R extends Comparable<? super R>> int minByOrThrow(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i8;
            }
            Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
                if (comparable.compareTo(comparable2) > 0) {
                    i8 = i9;
                    comparable = comparable2;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final Integer minOrNull(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (i8 > i9) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final double random(double[] dArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (dArr.length != 0) {
            return dArr[random.nextInt(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Boolean reduceRightIndexedOrNull(boolean[] zArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean z7 = zArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            z7 = ((Boolean) operation.invoke(Integer.valueOf(i8), Boolean.valueOf(zArr[i8]), Boolean.valueOf(z7))).booleanValue();
        }
        return Boolean.valueOf(z7);
    }

    public static final Boolean reduceRightOrNull(boolean[] zArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean z7 = zArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            z7 = ((Boolean) operation.invoke(Boolean.valueOf(zArr[i8]), Boolean.valueOf(z7))).booleanValue();
        }
        return Boolean.valueOf(z7);
    }

    public static final <T> T[] sliceArray(T[] tArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? (T[]) kotlin.collections.k.copyOfRange(tArr, 0, 0) : (T[]) kotlin.collections.k.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static void sortDescending(int[] iArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.collections.k.sort(iArr, i8, i9);
        reverse(iArr, i8, i9);
    }

    public static final <T, R, V> List<V> zip(T[] tArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i8], r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(boolean[] zArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(zArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z7 : zArr) {
            Pair pair = (Pair) transform.invoke(Boolean.valueOf(z7));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Boolean> associateBy(boolean[] zArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(zArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z7 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z7)), Boolean.valueOf(z7));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(float[] fArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f8 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f8)), valueTransform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    public static final List<Boolean> dropLastWhile(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(zArr[lastIndex]))).booleanValue()) {
                return take(zArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final <R> List<R> flatMap(boolean[] zArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z7 : zArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Boolean.valueOf(z7)));
        }
        return arrayList;
    }

    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(long[] jArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (long j8 : jArr) {
            Object invoke = keySelector.invoke(Long.valueOf(j8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j8));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Integer maxByOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) < 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final int maxOrThrow(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (i8 < i9) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Integer minByOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) > 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final int minOrThrow(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (i8 > i9) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final Pair<List<Long>, List<Long>> partition(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            } else {
                arrayList2.add(Long.valueOf(j8));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduceRight(boolean[] zArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean z7 = zArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                z7 = ((Boolean) operation.invoke(Boolean.valueOf(zArr[i8]), Boolean.valueOf(z7))).booleanValue();
            }
            return z7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceRightIndexed(boolean[] zArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean z7 = zArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                z7 = ((Boolean) operation.invoke(Integer.valueOf(i8), Boolean.valueOf(zArr[i8]), Boolean.valueOf(z7))).booleanValue();
            }
            return z7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean single(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final List<Short> slice(short[] sArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Long> take(long[] jArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= jArr.length) {
            return toList(jArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (long j8 : jArr) {
            arrayList.add(Long.valueOf(j8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Long> takeLast(long[] jArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = jArr.length;
        if (i8 >= length) {
            return toList(jArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Long.valueOf(jArr[i9]));
        }
        return arrayList;
    }

    public static final List<Boolean> takeLastWhile(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(zArr[lastIndex]))).booleanValue()) {
                return drop(zArr, lastIndex + 1);
            }
        }
        return toList(zArr);
    }

    public static final List<Boolean> takeWhile(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z7 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z7));
        }
        return arrayList;
    }

    public static final List<Boolean> toList(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Boolean.valueOf(zArr[0]));
        }
        return toMutableList(zArr);
    }

    public static final Set<Boolean> toSet(boolean[] zArr) {
        Set<Boolean> emptySet;
        Set<Boolean> of;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(zArr.length);
            return (Set) toCollection(zArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Boolean.valueOf(zArr[0]));
        return of;
    }

    public static final byte first(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (byte b8 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                return b8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Float maxWithOrNull(float[] fArr, Comparator<? super Float> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) < 0) {
                f8 = f9;
            }
        }
        return Float.valueOf(f8);
    }

    public static final Float minWithOrNull(float[] fArr, Comparator<? super Float> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) > 0) {
                f8 = f9;
            }
        }
        return Float.valueOf(f8);
    }

    public static final Double reduceIndexedOrNull(double[] dArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            d8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Double.valueOf(d8), Double.valueOf(dArr[nextInt]))).doubleValue();
        }
        return Double.valueOf(d8);
    }

    public static final Double reduceOrNull(double[] dArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d8 = ((Number) operation.invoke(Double.valueOf(d8), Double.valueOf(dArr[it.nextInt()]))).doubleValue();
        }
        return Double.valueOf(d8);
    }

    public static final void shuffle(long[] jArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            long j8 = jArr[lastIndex];
            jArr[lastIndex] = jArr[nextInt];
            jArr[nextInt] = j8;
        }
    }

    public static final Boolean singleOrNull(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Boolean bool = null;
        boolean z7 = false;
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                if (z7) {
                    return null;
                }
                bool = Boolean.valueOf(z8);
                z7 = true;
            }
        }
        if (z7) {
            return bool;
        }
        return null;
    }

    public static byte[] sliceArray(byte[] bArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : kotlin.collections.k.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static void sortDescending(long[] jArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.collections.k.sort(jArr, i8, i9);
        reverse(jArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(double[] dArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d8 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d8)), valueTransform.invoke(Double.valueOf(d8)));
        }
        return destination;
    }

    public static final <K> List<Float> distinctBy(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f8)))) {
                arrayList.add(Float.valueOf(f8));
            }
        }
        return arrayList;
    }

    public static final List<Double> dropWhile(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (double d8 : dArr) {
            if (z7) {
                arrayList.add(Double.valueOf(d8));
            } else if (!((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                arrayList.add(Double.valueOf(d8));
                z7 = true;
            }
        }
        return arrayList;
    }

    public static final Boolean lastOrNull(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            boolean z7 = zArr[length];
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                return Boolean.valueOf(z7);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    private static final double maxOf(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m379maxOfOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(float[] fArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <R> R maxOfWithOrNull(double[] dArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final float maxWithOrThrow(float[] fArr, Comparator<? super Float> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) < 0) {
                    f8 = f9;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    private static final double minOf(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m415minOfOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(float[] fArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <R> R minOfWithOrNull(double[] dArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final float minWithOrThrow(float[] fArr, Comparator<? super Float> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) > 0) {
                    f8 = f9;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final boolean random(boolean[] zArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (zArr.length != 0) {
            return zArr[random.nextInt(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final double reduce(double[] dArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                d8 = ((Number) operation.invoke(Double.valueOf(d8), Double.valueOf(dArr[it.nextInt()]))).doubleValue();
            }
            return d8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceIndexed(double[] dArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                d8 = ((Number) operation.invoke(Integer.valueOf(nextInt), Double.valueOf(d8), Double.valueOf(dArr[nextInt]))).doubleValue();
            }
            return d8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            float f8 = fArr[nextInt];
            fArr[nextInt] = fArr[lastIndex];
            fArr[lastIndex] = f8;
            lastIndex--;
        }
    }

    public static final double[] reversedArray(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            dArr2[lastIndex - nextInt] = dArr[nextInt];
        }
        return dArr2;
    }

    private static final <R> List<R> runningFold(double[] dArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r8);
        for (double d8 : dArr) {
            r8 = (R) operation.invoke(r8, Double.valueOf(d8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(double[] dArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r8);
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Double.valueOf(dArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final List<Float> runningReduce(float[] fArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float f8 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f8));
        int length = fArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            f8 = ((Number) operation.invoke(Float.valueOf(f8), Float.valueOf(fArr[i8]))).floatValue();
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    private static final List<Float> runningReduceIndexed(float[] fArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float f8 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f8));
        int length = fArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            f8 = ((Number) operation.invoke(Integer.valueOf(i8), Float.valueOf(f8), Float.valueOf(fArr[i8]))).floatValue();
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    public static final short first(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                return s7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte last(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                byte b8 = bArr[length];
                if (!((Boolean) predicate.invoke(Byte.valueOf(b8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return b8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character reduceRightIndexedOrNull(char[] cArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char c8 = cArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            c8 = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(cArr[i8]), Character.valueOf(c8))).charValue();
        }
        return Character.valueOf(c8);
    }

    public static final Character reduceRightOrNull(char[] cArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char c8 = cArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            c8 = ((Character) operation.invoke(Character.valueOf(cArr[i8]), Character.valueOf(c8))).charValue();
        }
        return Character.valueOf(c8);
    }

    public static short[] sliceArray(short[] sArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new short[0] : kotlin.collections.k.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static void sortDescending(float[] fArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.collections.k.sort(fArr, i8, i9);
        reverse(fArr, i8, i9);
    }

    public static final <R, V> List<V> zip(byte[] bArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(char[] cArr, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(cArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c8 : cArr) {
            Pair pair = (Pair) transform.invoke(Character.valueOf(c8));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Character> associateBy(char[] cArr, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(cArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c8 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c8)), Character.valueOf(c8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(boolean[] zArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z7 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z7)), valueTransform.invoke(Boolean.valueOf(z7)));
        }
        return destination;
    }

    public static final List<Character> dropLastWhile(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(cArr[lastIndex]))).booleanValue()) {
                return take(cArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final <R> List<R> flatMap(char[] cArr, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c8 : cArr) {
            v.addAll(arrayList, (Iterable) transform.invoke(Character.valueOf(c8)));
        }
        return arrayList;
    }

    public static final <K> Map<K, List<Long>> groupBy(long[] jArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j8 : jArr) {
            Object invoke = keySelector.invoke(Long.valueOf(j8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j8));
        }
        return linkedHashMap;
    }

    public static final Long maxOrNull(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (j8 < j9) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final Long minOrNull(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (j8 > j9) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final char reduceRight(char[] cArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char c8 = cArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                c8 = ((Character) operation.invoke(Character.valueOf(cArr[i8]), Character.valueOf(c8))).charValue();
            }
            return c8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceRightIndexed(char[] cArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char c8 = cArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                c8 = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(cArr[i8]), Character.valueOf(c8))).charValue();
            }
            return c8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static char single(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Character singleOrNull(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z7 = false;
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                if (z7) {
                    return null;
                }
                ch = Character.valueOf(c8);
                z7 = true;
            }
        }
        if (z7) {
            return ch;
        }
        return null;
    }

    public static final List<Character> takeLastWhile(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(cArr[lastIndex]))).booleanValue()) {
                return drop(cArr, lastIndex + 1);
            }
        }
        return toList(cArr);
    }

    public static final List<Character> takeWhile(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c8 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c8));
        }
        return arrayList;
    }

    public static final List<Character> toList(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return kotlin.collections.q.listOf(Character.valueOf(cArr[0]));
        }
        return toMutableList(cArr);
    }

    public static final Set<Character> toSet(char[] cArr) {
        Set<Character> emptySet;
        Set<Character> of;
        int coerceAtMost;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length != 1) {
            coerceAtMost = j6.v.coerceAtMost(cArr.length, 128);
            mapCapacity = l0.mapCapacity(coerceAtMost);
            return (Set) toCollection(cArr, new LinkedHashSet(mapCapacity));
        }
        of = w0.setOf(Character.valueOf(cArr[0]));
        return of;
    }

    public static final int first(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return i8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character lastOrNull(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            char c8 = cArr[length];
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                return Character.valueOf(c8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final long maxOrThrow(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (j8 < j9) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final long minOrThrow(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (j8 > j9) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final char random(char[] cArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (cArr.length != 0) {
            return cArr[random.nextInt(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List<Integer> slice(int[] iArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static int[] sliceArray(int[] iArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new int[0] : kotlin.collections.k.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final void sortDescending(double[] dArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.collections.k.sort(dArr, i8, i9);
        reverse(dArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(char[] cArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c8 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c8)), valueTransform.invoke(Character.valueOf(c8)));
        }
        return destination;
    }

    public static final <A extends Appendable> A joinTo(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (float f8 : fArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Float.valueOf(f8)));
            } else {
                buffer.append(String.valueOf(f8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Boolean reduceIndexedOrNull(boolean[] zArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            z7 = ((Boolean) operation.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z7), Boolean.valueOf(zArr[nextInt]))).booleanValue();
        }
        return Boolean.valueOf(z7);
    }

    public static final Boolean reduceOrNull(boolean[] zArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            z7 = ((Boolean) operation.invoke(Boolean.valueOf(z7), Boolean.valueOf(zArr[it.nextInt()]))).booleanValue();
        }
        return Boolean.valueOf(z7);
    }

    public static final void shuffle(float[] fArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(fArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            float f8 = fArr[lastIndex];
            fArr[lastIndex] = fArr[nextInt];
            fArr[nextInt] = f8;
        }
    }

    public static final List<Boolean> dropWhile(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (boolean z8 : zArr) {
            if (z7) {
                arrayList.add(Boolean.valueOf(z8));
            } else if (!((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z8));
                z7 = true;
            }
        }
        return arrayList;
    }

    public static final long first(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return j8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(float[] fArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (float f8 : fArr) {
            Object invoke = keySelector.invoke(Float.valueOf(f8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f8));
        }
        return destination;
    }

    public static final short last(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                short s7 = sArr[length];
                if (!((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return s7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final <R> R maxOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Double maxWithOrNull(double[] dArr, Comparator<? super Double> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d9 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d8), Double.valueOf(d9)) < 0) {
                d8 = d9;
            }
        }
        return Double.valueOf(d8);
    }

    private static final <R> R minOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Double minWithOrNull(double[] dArr, Comparator<? super Double> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d9 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d8), Double.valueOf(d9)) > 0) {
                d8 = d9;
            }
        }
        return Double.valueOf(d8);
    }

    public static final Pair<List<Float>, List<Float>> partition(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            } else {
                arrayList2.add(Float.valueOf(f8));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduce(boolean[] zArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean z7 = zArr[0];
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                z7 = ((Boolean) operation.invoke(Boolean.valueOf(z7), Boolean.valueOf(zArr[it.nextInt()]))).booleanValue();
            }
            return z7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceIndexed(boolean[] zArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean z7 = zArr[0];
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                z7 = ((Boolean) operation.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z7), Boolean.valueOf(zArr[nextInt]))).booleanValue();
            }
            return z7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean[] reversedArray(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            zArr2[lastIndex - nextInt] = zArr[nextInt];
        }
        return zArr2;
    }

    private static final <R> List<R> runningFold(boolean[] zArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r8);
        for (boolean z7 : zArr) {
            r8 = (R) operation.invoke(r8, Boolean.valueOf(z7));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(boolean[] zArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r8);
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Boolean.valueOf(zArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static long[] sliceArray(long[] jArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new long[0] : kotlin.collections.k.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final void sortDescending(char[] cArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.collections.k.sort(cArr, i8, i9);
        reverse(cArr, i8, i9);
    }

    public static final List<Float> take(float[] fArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= fArr.length) {
            return toList(fArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Float> takeLast(float[] fArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = fArr.length;
        if (i8 >= length) {
            return toList(fArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Float.valueOf(fArr[i9]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(short[] sArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(T[] tArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(tArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t7 : tArr) {
            linkedHashMap.put(keySelector.invoke(t7), valueTransform.invoke(t7));
        }
        return linkedHashMap;
    }

    public static final <K> List<Double> distinctBy(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d8 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d8)))) {
                arrayList.add(Double.valueOf(d8));
            }
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> long maxByOrThrow(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j8;
            }
            Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
                if (comparable.compareTo(comparable2) < 0) {
                    j8 = j9;
                    comparable = comparable2;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    private static final double maxOf(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m378maxOfOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(double[] dArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final double maxWithOrThrow(double[] dArr, Comparator<? super Double> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                double d9 = dArr[it.nextInt()];
                if (comparator.compare(Double.valueOf(d8), Double.valueOf(d9)) < 0) {
                    d8 = d9;
                }
            }
            return d8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> long minByOrThrow(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j8;
            }
            Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
                if (comparable.compareTo(comparable2) > 0) {
                    j8 = j9;
                    comparable = comparable2;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    private static final double minOf(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m414minOfOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(double[] dArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final double minWithOrThrow(double[] dArr, Comparator<? super Double> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                double d9 = dArr[it.nextInt()];
                if (comparator.compare(Double.valueOf(d8), Double.valueOf(d9)) > 0) {
                    d8 = d9;
                }
            }
            return d8;
        }
        throw new NoSuchElementException();
    }

    public static final void reverse(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(dArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            double d8 = dArr[nextInt];
            dArr[nextInt] = dArr[lastIndex];
            dArr[lastIndex] = d8;
            lastIndex--;
        }
    }

    private static final List<Double> runningReduce(double[] dArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double d8 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d8));
        int length = dArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            d8 = ((Number) operation.invoke(Double.valueOf(d8), Double.valueOf(dArr[i8]))).doubleValue();
            arrayList.add(Double.valueOf(d8));
        }
        return arrayList;
    }

    private static final List<Double> runningReduceIndexed(double[] dArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double d8 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d8));
        int length = dArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            d8 = ((Number) operation.invoke(Integer.valueOf(i8), Double.valueOf(d8), Double.valueOf(dArr[i8]))).doubleValue();
            arrayList.add(Double.valueOf(d8));
        }
        return arrayList;
    }

    public static final <T> T single(T[] tArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        T t7 = null;
        boolean z7 = false;
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                if (z7) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                t7 = t8;
                z7 = true;
            }
        }
        if (z7) {
            return t7;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return f8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Float maxOrNull(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f8 = Math.max(f8, fArr[it.nextInt()]);
        }
        return Float.valueOf(f8);
    }

    public static final Float minOrNull(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f8 = Math.min(f8, fArr[it.nextInt()]);
        }
        return Float.valueOf(f8);
    }

    public static final float[] sliceArray(float[] fArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new float[0] : kotlin.collections.k.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <R extends Comparable<? super R>> Long maxByOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) < 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final float maxOrThrow(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                f8 = Math.max(f8, fArr[it.nextInt()]);
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Long minByOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) > 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final float minOrThrow(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                f8 = Math.min(f8, fArr[it.nextInt()]);
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final List<Long> slice(long[] jArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final double first(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                return d8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                int i9 = iArr[length];
                if (!((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return i9;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character reduceIndexedOrNull(char[] cArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            c8 = ((Character) operation.invoke(Integer.valueOf(nextInt), Character.valueOf(c8), Character.valueOf(cArr[nextInt]))).charValue();
        }
        return Character.valueOf(c8);
    }

    public static final Character reduceOrNull(char[] cArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            c8 = ((Character) operation.invoke(Character.valueOf(c8), Character.valueOf(cArr[it.nextInt()]))).charValue();
        }
        return Character.valueOf(c8);
    }

    public static final void shuffle(double[] dArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(dArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            double d8 = dArr[lastIndex];
            dArr[lastIndex] = dArr[nextInt];
            dArr[nextInt] = d8;
        }
    }

    public static final double[] sliceArray(double[] dArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new double[0] : kotlin.collections.k.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <R, V> List<V> zip(int[] iArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(byte[] bArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(bArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b8 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b8)), valueTransform.invoke(Byte.valueOf(b8)));
        }
        return linkedHashMap;
    }

    public static final List<Character> dropWhile(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (char c8 : cArr) {
            if (z7) {
                arrayList.add(Character.valueOf(c8));
            } else if (!((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                arrayList.add(Character.valueOf(c8));
                z7 = true;
            }
        }
        return arrayList;
    }

    public static final <K> Map<K, List<Float>> groupBy(float[] fArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f8 : fArr) {
            Object invoke = keySelector.invoke(Float.valueOf(f8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f8));
        }
        return linkedHashMap;
    }

    private static final <R> R maxOfWithOrNull(char[] cArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <R> R minOfWithOrNull(char[] cArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final char reduce(char[] cArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                c8 = ((Character) operation.invoke(Character.valueOf(c8), Character.valueOf(cArr[it.nextInt()]))).charValue();
            }
            return c8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceIndexed(char[] cArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                c8 = ((Character) operation.invoke(Integer.valueOf(nextInt), Character.valueOf(c8), Character.valueOf(cArr[nextInt]))).charValue();
            }
            return c8;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char[] reversedArray(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        f0 it = new j6.m(0, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            cArr2[lastIndex - nextInt] = cArr[nextInt];
        }
        return cArr2;
    }

    private static final <R> List<R> runningFold(char[] cArr, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r8);
        for (char c8 : cArr) {
            r8 = (R) operation.invoke(r8, Character.valueOf(c8));
            arrayList.add(r8);
        }
        return arrayList;
    }

    private static final <R> List<R> runningFoldIndexed(char[] cArr, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r8);
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Character.valueOf(cArr[i8]));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final byte single(byte[] bArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Byte b8 = null;
        boolean z7 = false;
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                if (!z7) {
                    b8 = Byte.valueOf(b9);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(b8, "null cannot be cast to non-null type kotlin.Byte");
            return b8.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                return z7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <A extends Appendable> A joinTo(double[] dArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (double d8 : dArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Double.valueOf(d8)));
            } else {
                buffer.append(String.valueOf(d8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Boolean maxWithOrNull(boolean[] zArr, Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z8 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z7), Boolean.valueOf(z8)) < 0) {
                z7 = z8;
            }
        }
        return Boolean.valueOf(z7);
    }

    public static final Boolean minWithOrNull(boolean[] zArr, Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z8 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z7), Boolean.valueOf(z8)) > 0) {
                z7 = z8;
            }
        }
        return Boolean.valueOf(z7);
    }

    public static final boolean[] sliceArray(boolean[] zArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : kotlin.collections.k.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <K> List<Boolean> distinctBy(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z7 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z7)))) {
                arrayList.add(Boolean.valueOf(z7));
            }
        }
        return arrayList;
    }

    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(double[] dArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (double d8 : dArr) {
            Object invoke = keySelector.invoke(Double.valueOf(d8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d8));
        }
        return destination;
    }

    private static final double maxOf(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m384maxOfOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(boolean[] zArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final boolean maxWithOrThrow(boolean[] zArr, Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z7 = zArr[0];
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                boolean z8 = zArr[it.nextInt()];
                if (comparator.compare(Boolean.valueOf(z7), Boolean.valueOf(z8)) < 0) {
                    z7 = z8;
                }
            }
            return z7;
        }
        throw new NoSuchElementException();
    }

    private static final double minOf(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m420minOfOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(boolean[] zArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final boolean minWithOrThrow(boolean[] zArr, Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z7 = zArr[0];
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                boolean z8 = zArr[it.nextInt()];
                if (comparator.compare(Boolean.valueOf(z7), Boolean.valueOf(z8)) > 0) {
                    z7 = z8;
                }
            }
            return z7;
        }
        throw new NoSuchElementException();
    }

    public static final Pair<List<Double>, List<Double>> partition(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d8 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                arrayList.add(Double.valueOf(d8));
            } else {
                arrayList2.add(Double.valueOf(d8));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final void reverse(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            boolean z7 = zArr[nextInt];
            zArr[nextInt] = zArr[lastIndex];
            zArr[lastIndex] = z7;
            lastIndex--;
        }
    }

    private static final List<Boolean> runningReduce(boolean[] zArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z7 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z7));
        int length = zArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            z7 = ((Boolean) operation.invoke(Boolean.valueOf(z7), Boolean.valueOf(zArr[i8]))).booleanValue();
            arrayList.add(Boolean.valueOf(z7));
        }
        return arrayList;
    }

    private static final List<Boolean> runningReduceIndexed(boolean[] zArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z7 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z7));
        int length = zArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            z7 = ((Boolean) operation.invoke(Integer.valueOf(i8), Boolean.valueOf(z7), Boolean.valueOf(zArr[i8]))).booleanValue();
            arrayList.add(Boolean.valueOf(z7));
        }
        return arrayList;
    }

    public static final List<Double> take(double[] dArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= dArr.length) {
            return toList(dArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (double d8 : dArr) {
            arrayList.add(Double.valueOf(d8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Double> takeLast(double[] dArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = dArr.length;
        if (i8 >= length) {
            return toList(dArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Double.valueOf(dArr[i9]));
        }
        return arrayList;
    }

    public static final char first(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                return c8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                long j8 = jArr[length];
                if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return j8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Double maxOrNull(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d8 = Math.max(d8, dArr[it.nextInt()]);
        }
        return Double.valueOf(d8);
    }

    public static final Double minOrNull(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d8 = Math.min(d8, dArr[it.nextInt()]);
        }
        return Double.valueOf(d8);
    }

    public static final List<Float> slice(float[] fArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final char[] sliceArray(char[] cArr, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new char[0] : kotlin.collections.k.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <R, V> List<V> zip(long[] jArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(short[] sArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(sArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s7 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s7)), valueTransform.invoke(Short.valueOf(s7)));
        }
        return linkedHashMap;
    }

    public static final double maxOrThrow(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                d8 = Math.max(d8, dArr[it.nextInt()]);
            }
            return d8;
        }
        throw new NoSuchElementException();
    }

    public static final double minOrThrow(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                d8 = Math.min(d8, dArr[it.nextInt()]);
            }
            return d8;
        }
        throw new NoSuchElementException();
    }

    public static final void shuffle(boolean[] zArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(zArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            boolean z7 = zArr[lastIndex];
            zArr[lastIndex] = zArr[nextInt];
            zArr[nextInt] = z7;
        }
    }

    public static final <R extends Comparable<? super R>> float maxByOrThrow(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f8;
            }
            Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
                if (comparable.compareTo(comparable2) < 0) {
                    f8 = f9;
                    comparable = comparable2;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> float minByOrThrow(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f8;
            }
            Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
                if (comparable.compareTo(comparable2) > 0) {
                    f8 = f9;
                    comparable = comparable2;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final short single(short[] sArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Short sh = null;
        boolean z7 = false;
        for (short s7 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s7))).booleanValue()) {
                if (!z7) {
                    sh = Short.valueOf(s7);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(sh, "null cannot be cast to non-null type kotlin.Short");
            return sh.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                float f8 = fArr[length];
                if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return f8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character maxWithOrNull(char[] cArr, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c8), Character.valueOf(c9)) < 0) {
                c8 = c9;
            }
        }
        return Character.valueOf(c8);
    }

    public static final Character minWithOrNull(char[] cArr, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c8), Character.valueOf(c9)) > 0) {
                c8 = c9;
            }
        }
        return Character.valueOf(c8);
    }

    public static final <R, V> List<V> zip(float[] fArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(int[] iArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(iArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i8)), valueTransform.invoke(Integer.valueOf(i8)));
        }
        return linkedHashMap;
    }

    public static final <K> List<Character> distinctBy(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c8 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c8)))) {
                arrayList.add(Character.valueOf(c8));
            }
        }
        return arrayList;
    }

    public static final <K> Map<K, List<Double>> groupBy(double[] dArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d8 : dArr) {
            Object invoke = keySelector.invoke(Double.valueOf(d8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d8));
        }
        return linkedHashMap;
    }

    public static final <A extends Appendable> A joinTo(boolean[] zArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (boolean z7 : zArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Boolean.valueOf(z7)));
            } else {
                buffer.append(String.valueOf(z7));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <R extends Comparable<? super R>> Float maxByOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) < 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    private static final double maxOf(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m377maxOfOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(char[] cArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) < 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final char maxWithOrThrow(char[] cArr, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c9 = cArr[it.nextInt()];
                if (comparator.compare(Character.valueOf(c8), Character.valueOf(c9)) < 0) {
                    c8 = c9;
                }
            }
            return c8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Float minByOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) > 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    private static final double minOf(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            double doubleValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).doubleValue();
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m413minOfOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).doubleValue();
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(char[] cArr, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                Object invoke = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
                if (comparator.compare(r8, invoke) > 0) {
                    r8 = (R) invoke;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final char minWithOrThrow(char[] cArr, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c9 = cArr[it.nextInt()];
                if (comparator.compare(Character.valueOf(c8), Character.valueOf(c9)) > 0) {
                    c8 = c9;
                }
            }
            return c8;
        }
        throw new NoSuchElementException();
    }

    public static final void reverse(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(cArr);
        f0 it = new j6.m(0, length).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char c8 = cArr[nextInt];
            cArr[nextInt] = cArr[lastIndex];
            cArr[lastIndex] = c8;
            lastIndex--;
        }
    }

    private static final List<Character> runningReduce(char[] cArr, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char c8 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c8));
        int length = cArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            c8 = ((Character) operation.invoke(Character.valueOf(c8), Character.valueOf(cArr[i8]))).charValue();
            arrayList.add(Character.valueOf(c8));
        }
        return arrayList;
    }

    private static final List<Character> runningReduceIndexed(char[] cArr, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char c8 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c8));
        int length = cArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            c8 = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(c8), Character.valueOf(cArr[i8]))).charValue();
            arrayList.add(Character.valueOf(c8));
        }
        return arrayList;
    }

    public static final List<Double> slice(double[] dArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(boolean[] zArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z7 : zArr) {
            Object invoke = keySelector.invoke(Boolean.valueOf(z7));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z7));
        }
        return destination;
    }

    public static final Character maxOrNull(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.s.compare((int) c8, (int) c9) < 0) {
                c8 = c9;
            }
        }
        return Character.valueOf(c8);
    }

    public static final Character minOrNull(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.s.compare((int) c8, (int) c9) > 0) {
                c8 = c9;
            }
        }
        return Character.valueOf(c8);
    }

    public static final Pair<List<Boolean>, List<Boolean>> partition(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z7 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z7));
            } else {
                arrayList2.add(Boolean.valueOf(z7));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final void shuffle(char[] cArr, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(cArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            char c8 = cArr[lastIndex];
            cArr[lastIndex] = cArr[nextInt];
            cArr[nextInt] = c8;
        }
    }

    public static final List<Boolean> take(boolean[] zArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= zArr.length) {
            return toList(zArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (boolean z7 : zArr) {
            arrayList.add(Boolean.valueOf(z7));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Boolean> takeLast(boolean[] zArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = zArr.length;
        if (i8 >= length) {
            return toList(zArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Boolean.valueOf(zArr[i9]));
        }
        return arrayList;
    }

    public static final char maxOrThrow(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c9 = cArr[it.nextInt()];
                if (kotlin.jvm.internal.s.compare((int) c8, (int) c9) < 0) {
                    c8 = c9;
                }
            }
            return c8;
        }
        throw new NoSuchElementException();
    }

    public static final char minOrThrow(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c9 = cArr[it.nextInt()];
                if (kotlin.jvm.internal.s.compare((int) c8, (int) c9) > 0) {
                    c8 = c9;
                }
            }
            return c8;
        }
        throw new NoSuchElementException();
    }

    public static final double last(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                double d8 = dArr[length];
                if (!((Boolean) predicate.invoke(Double.valueOf(d8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return d8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <R, V> List<V> zip(double[] dArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(long[] jArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(jArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j8 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j8)), valueTransform.invoke(Long.valueOf(j8)));
        }
        return linkedHashMap;
    }

    public static final int single(int[] iArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Integer num = null;
        boolean z7 = false;
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                if (!z7) {
                    num = Integer.valueOf(i8);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
            return num.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final List<Boolean> slice(boolean[] zArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> double maxByOrThrow(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d8;
            }
            Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                double d9 = dArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d9));
                if (comparable.compareTo(comparable2) < 0) {
                    d8 = d9;
                    comparable = comparable2;
                }
            }
            return d8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m364maxOf(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length != 0) {
            float floatValue = ((Number) selector.invoke(tArr[0])).floatValue();
            f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(tArr[it.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m391maxOfOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(tArr[0])).floatValue();
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(tArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <R extends Comparable<? super R>> double minByOrThrow(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double d8 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d8;
            }
            Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                double d9 = dArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d9));
                if (comparable.compareTo(comparable2) > 0) {
                    d8 = d9;
                    comparable = comparable2;
                }
            }
            return d8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m400minOf(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length != 0) {
            float floatValue = ((Number) selector.invoke(tArr[0])).floatValue();
            f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(tArr[it.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m427minOfOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(tArr[0])).floatValue();
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(tArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <T> void reverse(T[] tArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, tArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            T t7 = tArr[i8];
            tArr[i8] = tArr[i11];
            tArr[i11] = t7;
            i11--;
            i8++;
        }
    }

    public static final <A extends Appendable> A joinTo(char[] cArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.s.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.s.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (char c8 : cArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Character.valueOf(c8)));
            } else {
                buffer.append(c8);
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean last(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                boolean z7 = zArr[length];
                if (!((Boolean) predicate.invoke(Boolean.valueOf(z7))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return z7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <R, V> List<V> zip(boolean[] zArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(float[] fArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(fArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f8 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f8)), valueTransform.invoke(Float.valueOf(f8)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Boolean>> groupBy(boolean[] zArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z7 : zArr) {
            Object invoke = keySelector.invoke(Boolean.valueOf(z7));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z7));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(char[] cArr, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (char c8 : cArr) {
            Object invoke = keySelector.invoke(Character.valueOf(c8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c8));
        }
        return destination;
    }

    public static final Pair<List<Character>, List<Character>> partition(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                arrayList.add(Character.valueOf(c8));
            } else {
                arrayList2.add(Character.valueOf(c8));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final List<Character> take(char[] cArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= cArr.length) {
            return toList(cArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (char c8 : cArr) {
            arrayList.add(Character.valueOf(c8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Character> takeLast(char[] cArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = cArr.length;
        if (i8 >= length) {
            return toList(cArr);
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Character.valueOf(cArr[i9]));
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> Double maxByOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d8);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d9 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d9));
            if (comparable.compareTo(comparable2) < 0) {
                d8 = d9;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d8);
    }

    public static final <R extends Comparable<? super R>> Double minByOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d8);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d9 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d9));
            if (comparable.compareTo(comparable2) > 0) {
                d8 = d9;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d8);
    }

    public static final long single(long[] jArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Long l8 = null;
        boolean z7 = false;
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                if (!z7) {
                    l8 = Long.valueOf(j8);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(l8, "null cannot be cast to non-null type kotlin.Long");
            return l8.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final List<Character> slice(char[] cArr, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final char last(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                char c8 = cArr[length];
                if (!((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return c8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static void reverse(byte[] bArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, bArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            bArr[i8] = bArr[i11];
            bArr[i11] = b8;
            i11--;
            i8++;
        }
    }

    public static final <R, V> List<V> zip(char[] cArr, Iterable<? extends R> other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(double[] dArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(dArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d8 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d8)), valueTransform.invoke(Double.valueOf(d8)));
        }
        return linkedHashMap;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m358maxOf(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m385maxOfOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m394minOf(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m421minOfOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Byte.valueOf(bArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Byte.valueOf(bArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(T[] tArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t7 : tArr) {
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

    public static final <R extends Comparable<? super R>> boolean maxByOrThrow(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            boolean z7 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z7;
            }
            Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z7));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                boolean z8 = zArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z8));
                if (comparable.compareTo(comparable2) < 0) {
                    z7 = z8;
                    comparable = comparable2;
                }
            }
            return z7;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> boolean minByOrThrow(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            boolean z7 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z7;
            }
            Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z7));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                boolean z8 = zArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z8));
                if (comparable.compareTo(comparable2) > 0) {
                    z7 = z8;
                    comparable = comparable2;
                }
            }
            return z7;
        }
        throw new NoSuchElementException();
    }

    public static final <V> List<V> zip(byte[] bArr, byte[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i8]), Byte.valueOf(other[i8])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(boolean[] zArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(zArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z7 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z7)), valueTransform.invoke(Boolean.valueOf(z7)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Character>> groupBy(char[] cArr, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c8 : cArr) {
            Object invoke = keySelector.invoke(Character.valueOf(c8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c8));
        }
        return linkedHashMap;
    }

    public static void reverse(short[] sArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, sArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            short s7 = sArr[i8];
            sArr[i8] = sArr[i11];
            sArr[i11] = s7;
            i11--;
            i8++;
        }
    }

    public static final float single(float[] fArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Float f8 = null;
        boolean z7 = false;
        for (float f9 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f9))).booleanValue()) {
                if (!z7) {
                    f8 = Float.valueOf(f9);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(f8, "null cannot be cast to non-null type kotlin.Float");
            return f8.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m365maxOf(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m392maxOfOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m401minOf(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m428minOfOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Short.valueOf(sArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Short.valueOf(sArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <V> List<V> zip(short[] sArr, short[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i8]), Short.valueOf(other[i8])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(char[] cArr, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(cArr.length);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c8 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c8)), valueTransform.invoke(Character.valueOf(c8)));
        }
        return linkedHashMap;
    }

    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z7);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z8 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z8));
            if (comparable.compareTo(comparable2) < 0) {
                z7 = z8;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z7);
    }

    public static final <R extends Comparable<? super R>> Boolean minByOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z7);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z8 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z8));
            if (comparable.compareTo(comparable2) > 0) {
                z7 = z8;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z7);
    }

    public static void reverse(int[] iArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, iArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            int i12 = iArr[i8];
            iArr[i8] = iArr[i11];
            iArr[i11] = i12;
            i11--;
            i8++;
        }
    }

    public static final <V> List<V> zip(int[] iArr, int[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i8]), Integer.valueOf(other[i8])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(byte[] bArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b8 : bArr) {
            Object invoke = keySelector.invoke(Byte.valueOf(b8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Byte.valueOf(b8)));
        }
        return destination;
    }

    public static final double single(double[] dArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Double d8 = null;
        boolean z7 = false;
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                if (!z7) {
                    d8 = Double.valueOf(d9);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(d8, "null cannot be cast to non-null type kotlin.Double");
            return d8.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, List<V>> groupBy(T[] tArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t7 : tArr) {
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

    public static final <R extends Comparable<? super R>> char maxByOrThrow(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c8;
            }
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                char c9 = cArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c9));
                if (comparable.compareTo(comparable2) < 0) {
                    c8 = c9;
                    comparable = comparable2;
                }
            }
            return c8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m362maxOf(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m389maxOfOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <R extends Comparable<? super R>> char minByOrThrow(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            char c8 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c8;
            }
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c8));
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                char c9 = cArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c9));
                if (comparable.compareTo(comparable2) > 0) {
                    c8 = c9;
                    comparable = comparable2;
                }
            }
            return c8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m398minOf(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m425minOfOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Integer.valueOf(iArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Integer.valueOf(iArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <V> List<V> zip(long[] jArr, long[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i8]), Long.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static void reverse(long[] jArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, jArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            long j8 = jArr[i8];
            jArr[i8] = jArr[i11];
            jArr[i11] = j8;
            i11--;
            i8++;
        }
    }

    public static final <V> List<V> zip(float[] fArr, float[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i8]), Float.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final boolean single(boolean[] zArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Boolean bool = null;
        boolean z7 = false;
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                if (!z7) {
                    bool = Boolean.valueOf(z8);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(short[] sArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s7 : sArr) {
            Object invoke = keySelector.invoke(Short.valueOf(s7));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Short.valueOf(s7)));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Character maxByOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c8);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c9));
            if (comparable.compareTo(comparable2) < 0) {
                c8 = c9;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c8);
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m363maxOf(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m390maxOfOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <R extends Comparable<? super R>> Character minByOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c8);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c9));
            if (comparable.compareTo(comparable2) > 0) {
                c8 = c9;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c8);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m399minOf(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m426minOfOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Long.valueOf(jArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Long.valueOf(jArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <V> List<V> zip(double[] dArr, double[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i8]), Double.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final void reverse(float[] fArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, fArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            float f8 = fArr[i8];
            fArr[i8] = fArr[i11];
            fArr[i11] = f8;
            i11--;
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(byte[] bArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b8 : bArr) {
            Object invoke = keySelector.invoke(Byte.valueOf(b8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Byte.valueOf(b8)));
        }
        return linkedHashMap;
    }

    public static final <V> List<V> zip(boolean[] zArr, boolean[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i8]), Boolean.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final char single(char[] cArr, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z7 = false;
        for (char c8 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c8))).booleanValue()) {
                if (!z7) {
                    ch = Character.valueOf(c8);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(int[] iArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 : iArr) {
            Object invoke = keySelector.invoke(Integer.valueOf(i8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m361maxOf(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m388maxOfOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m397minOf(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m424minOfOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Float.valueOf(fArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Float.valueOf(fArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final void reverse(double[] dArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, dArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            double d8 = dArr[i8];
            dArr[i8] = dArr[i11];
            dArr[i11] = d8;
            i11--;
            i8++;
        }
    }

    public static final <V> List<V> zip(char[] cArr, char[] other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i8]), Character.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final <T, R> List<Pair<T, R>> zip(T[] tArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(tArr[i8], other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(short[] sArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s7 : sArr) {
            Object invoke = keySelector.invoke(Short.valueOf(s7));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Short.valueOf(s7)));
        }
        return linkedHashMap;
    }

    public static final void reverse(boolean[] zArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, zArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            boolean z7 = zArr[i8];
            zArr[i8] = zArr[i11];
            zArr[i11] = z7;
            i11--;
            i8++;
        }
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m360maxOf(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m387maxOfOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m396minOf(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m423minOfOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Double.valueOf(dArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Double.valueOf(dArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(long[] jArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j8 : jArr) {
            Object invoke = keySelector.invoke(Long.valueOf(j8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final <R> List<Pair<Byte, R>> zip(byte[] bArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            byte b8 = bArr[i8];
            arrayList.add(y5.h.to(Byte.valueOf(b8), other[i8]));
        }
        return arrayList;
    }

    public static final void reverse(char[] cArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, cArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            char c8 = cArr[i8];
            cArr[i8] = cArr[i11];
            cArr[i11] = c8;
            i11--;
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(int[] iArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 : iArr) {
            Object invoke = keySelector.invoke(Integer.valueOf(i8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Integer.valueOf(i8)));
        }
        return linkedHashMap;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m366maxOf(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m393maxOfOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m402minOf(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m429minOfOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Boolean.valueOf(zArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <R> List<Pair<Short, R>> zip(short[] sArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            short s7 = sArr[i8];
            arrayList.add(y5.h.to(Short.valueOf(s7), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(float[] fArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f8 : fArr) {
            Object invoke = keySelector.invoke(Float.valueOf(f8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m359maxOf(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m386maxOfOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m395minOf(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            float floatValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).floatValue();
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m422minOfOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Character.valueOf(cArr[0]))).floatValue();
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Character.valueOf(cArr[it.nextInt()]))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <R> List<Pair<Integer, R>> zip(int[] iArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            int i9 = iArr[i8];
            arrayList.add(y5.h.to(Integer.valueOf(i9), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(long[] jArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j8 : jArr) {
            Object invoke = keySelector.invoke(Long.valueOf(j8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Long.valueOf(j8)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(double[] dArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d8 : dArr) {
            Object invoke = keySelector.invoke(Double.valueOf(d8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Double.valueOf(d8)));
        }
        return destination;
    }

    public static final <R> List<Pair<Long, R>> zip(long[] jArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            long j8 = jArr[i8];
            arrayList.add(y5.h.to(Long.valueOf(j8), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m373maxOf(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length != 0) {
            R r8 = (R) selector.invoke(tArr[0]);
            f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(tArr[it.nextInt()]);
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(tArr[0]);
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(tArr[it.nextInt()]);
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m409minOf(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length != 0) {
            R r8 = (R) selector.invoke(tArr[0]);
            f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(tArr[it.nextInt()]);
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <T, R extends Comparable<? super R>> R minOfOrNull(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(tArr[0]);
        f0 it = new j6.m(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(tArr[it.nextInt()]);
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(float[] fArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f8 : fArr) {
            Object invoke = keySelector.invoke(Float.valueOf(f8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Float.valueOf(f8)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(boolean[] zArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z7 : zArr) {
            Object invoke = keySelector.invoke(Boolean.valueOf(z7));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Boolean.valueOf(z7)));
        }
        return destination;
    }

    public static final <R> List<Pair<Float, R>> zip(float[] fArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            float f8 = fArr[i8];
            arrayList.add(y5.h.to(Float.valueOf(f8), other[i8]));
        }
        return arrayList;
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
        f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m367maxOf(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m403minOf(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            R r8 = (R) selector.invoke(Byte.valueOf(bArr[0]));
            f0 it = new j6.m(1, getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <R> List<Pair<Double, R>> zip(double[] dArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            double d8 = dArr[i8];
            arrayList.add(y5.h.to(Double.valueOf(d8), other[i8]));
        }
        return arrayList;
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
        f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(char[] cArr, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c8 : cArr) {
            Object invoke = keySelector.invoke(Character.valueOf(c8));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(c8)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(double[] dArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d8 : dArr) {
            Object invoke = keySelector.invoke(Double.valueOf(d8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Double.valueOf(d8)));
        }
        return linkedHashMap;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m374maxOf(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m410minOf(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            R r8 = (R) selector.invoke(Short.valueOf(sArr[0]));
            f0 it = new j6.m(1, getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <R> List<Pair<Boolean, R>> zip(boolean[] zArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            boolean z7 = zArr[i8];
            arrayList.add(y5.h.to(Boolean.valueOf(z7), other[i8]));
        }
        return arrayList;
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
        f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m371maxOf(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m407minOf(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            R r8 = (R) selector.invoke(Integer.valueOf(iArr[0]));
            f0 it = new j6.m(1, getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <R> List<Pair<Character, R>> zip(char[] cArr, R[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            char c8 = cArr[i8];
            arrayList.add(y5.h.to(Character.valueOf(c8), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(boolean[] zArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z7 : zArr) {
            Object invoke = keySelector.invoke(Boolean.valueOf(z7));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Boolean.valueOf(z7)));
        }
        return linkedHashMap;
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
        f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m372maxOf(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m408minOf(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            R r8 = (R) selector.invoke(Long.valueOf(jArr[0]));
            f0 it = new j6.m(1, getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <T, R> List<Pair<T, R>> zip(T[] tArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(tArr[i8], r8));
            i8++;
        }
        return arrayList;
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
        f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(char[] cArr, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c8 : cArr) {
            Object invoke = keySelector.invoke(Character.valueOf(c8));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(c8)));
        }
        return linkedHashMap;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m370maxOf(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m406minOf(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            R r8 = (R) selector.invoke(Float.valueOf(fArr[0]));
            f0 it = new j6.m(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
        f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    public static final <R> List<Pair<Byte, R>> zip(byte[] bArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Byte.valueOf(bArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m369maxOf(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m405minOf(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            R r8 = (R) selector.invoke(Double.valueOf(dArr[0]));
            f0 it = new j6.m(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <R> List<Pair<Short, R>> zip(short[] sArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Short.valueOf(sArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
        f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m375maxOf(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m411minOf(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            R r8 = (R) selector.invoke(Boolean.valueOf(zArr[0]));
            f0 it = new j6.m(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <R> List<Pair<Integer, R>> zip(int[] iArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Integer.valueOf(iArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m368maxOf(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m404minOf(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            R r8 = (R) selector.invoke(Character.valueOf(cArr[0]));
            f0 it = new j6.m(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    public static final <R> List<Pair<Long, R>> zip(long[] jArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Long.valueOf(jArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<Pair<Float, R>> zip(float[] fArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Float.valueOf(fArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<Pair<Double, R>> zip(double[] dArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Double.valueOf(dArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<Pair<Boolean, R>> zip(boolean[] zArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Boolean.valueOf(zArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<Pair<Character, R>> zip(char[] cArr, Iterable<? extends R> other) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(y5.h.to(Character.valueOf(cArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final List<Pair<Byte, Byte>> zip(byte[] bArr, byte[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Byte.valueOf(bArr[i8]), Byte.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<Pair<Short, Short>> zip(short[] sArr, short[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Short.valueOf(sArr[i8]), Short.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<Pair<Integer, Integer>> zip(int[] iArr, int[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Integer.valueOf(iArr[i8]), Integer.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<Pair<Long, Long>> zip(long[] jArr, long[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Long.valueOf(jArr[i8]), Long.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<Pair<Float, Float>> zip(float[] fArr, float[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Float.valueOf(fArr[i8]), Float.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<Pair<Double, Double>> zip(double[] dArr, double[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Double.valueOf(dArr[i8]), Double.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<Pair<Boolean, Boolean>> zip(boolean[] zArr, boolean[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Boolean.valueOf(zArr[i8]), Boolean.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<Pair<Character, Character>> zip(char[] cArr, char[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Character.valueOf(cArr[i8]), Character.valueOf(other[i8])));
        }
        return arrayList;
    }
}
