package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.random.Random;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class CollectionsKt__CollectionsKt extends q {
    private static final <T> List<T> List(int i8, f6.l init) {
        kotlin.jvm.internal.s.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(init.invoke(Integer.valueOf(i9)));
        }
        return arrayList;
    }

    private static final <T> List<T> MutableList(int i8, f6.l init) {
        kotlin.jvm.internal.s.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(init.invoke(Integer.valueOf(i9)));
        }
        return arrayList;
    }

    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList<>();
    }

    public static final <T> Collection<T> asCollection(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return new f(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T t7, int i8, int i9) {
        int compareValues;
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            compareValues = kotlin.comparisons.g.compareValues(list.get(i11), t7);
            if (compareValues < 0) {
                i8 = i11 + 1;
            } else {
                if (compareValues <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = list.size();
        }
        return binarySearch((List<? extends Comparable>) list, comparable, i8, i9);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(List<? extends T> list, K k8, int i8, int i9, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i8, i9, new CollectionsKt__CollectionsKt$binarySearchBy$1(selector, k8));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i8, int i9, f6.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = list.size();
        }
        return binarySearch(list, i8, i9, new CollectionsKt__CollectionsKt$binarySearchBy$1(lVar, comparable));
    }

    private static final <E> List<E> buildList(f6.l builderAction) {
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        List createListBuilder = q.createListBuilder();
        builderAction.invoke(createListBuilder);
        return q.build(createListBuilder);
    }

    private static final <T> boolean containsAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return collection.containsAll(elements);
    }

    public static <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    public static j6.m getIndices(Collection<?> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return new j6.m(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lf6/a;)TR; */
    private static final Object ifEmpty(Collection collection, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    private static final <T> boolean isNotEmpty(Collection<? extends T> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return !collection.isEmpty();
    }

    private static final <T> boolean isNullOrEmpty(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> List<T> listOf(T... elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? k.asList(elements) : emptyList();
    }

    public static final <T> List<T> listOfNotNull(T t7) {
        return t7 != null ? q.listOf(t7) : emptyList();
    }

    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> optimizeReadOnlyList(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : q.listOf(list.get(0)) : emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Collection<T> orEmpty(Collection<? extends T> collection) {
        return collection == 0 ? emptyList() : collection;
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i8, int i9, int i10) {
        if (i9 > i10) {
            throw new IllegalArgumentException("fromIndex (" + i9 + ") is greater than toIndex (" + i10 + ").");
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i9 + ") is less than zero.");
        }
        if (i10 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i8 + ").");
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        CollectionsKt___CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static <T> ArrayList<T> arrayListOf(T... elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new f(elements, true));
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = list.size();
        }
        return binarySearch(list, obj, comparator, i8, i9);
    }

    private static final <E> List<E> buildList(int i8, f6.l builderAction) {
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        List createListBuilder = q.createListBuilder(i8);
        builderAction.invoke(createListBuilder);
        return q.build(createListBuilder);
    }

    private static final <T> List<T> listOf() {
        return emptyList();
    }

    public static <T> List<T> listOfNotNull(T... elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return ArraysKt___ArraysKt.filterNotNull(elements);
    }

    public static <T> List<T> mutableListOf(T... elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new f(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> List<T> orEmpty(List<? extends T> list) {
        return list == 0 ? emptyList() : list;
    }

    public static /* synthetic */ int binarySearch$default(List list, int i8, int i9, f6.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = list.size();
        }
        return binarySearch(list, i8, i9, lVar);
    }

    public static final <T> int binarySearch(List<? extends T> list, T t7, Comparator<? super T> comparator, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int compare = comparator.compare(list.get(i11), t7);
            if (compare < 0) {
                i8 = i11 + 1;
            } else {
                if (compare <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final <T> int binarySearch(List<? extends T> list, int i8, int i9, f6.l comparison) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparison, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int intValue = ((Number) comparison.invoke(list.get(i11))).intValue();
            if (intValue < 0) {
                i8 = i11 + 1;
            } else {
                if (intValue <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }
}
