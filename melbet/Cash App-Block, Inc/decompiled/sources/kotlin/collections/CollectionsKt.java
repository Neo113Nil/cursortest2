package kotlin.collections;

import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.comparisons.ReverseOrderComparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Choreographers$$ExternalSyntheticLambda1;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {2, 3, 0}, xi = 49)
/* loaded from: classes.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 asSequence(Iterable iterable) {
        iterable.getClass();
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(iterable, 1);
    }

    public static double averageOfFloat(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static ArrayList chunked(Iterable iterable, int i, Function1 function1) {
        SlidingWindowKt.checkWindowSizeStep(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator windowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i, i, true, true);
            while (windowedIterator.hasNext()) {
                arrayList.add(function1.invoke((List) windowedIterator.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        MovingSubList movingSubList = new MovingSubList(list);
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            movingSubList.move(i2, i3 + i2);
            arrayList2.add(function1.invoke(movingSubList));
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean contains(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : indexOf(iterable, obj) >= 0;
    }

    public static int count(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
                throw null;
            }
        }
        return i;
    }

    public static List distinct(Iterable iterable) {
        iterable.getClass();
        return toList(toMutableSet(iterable));
    }

    public static List drop(Iterable iterable, int i) {
        ArrayList arrayList;
        iterable.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return toList(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return EmptyList.INSTANCE;
            }
            if (size == 1) {
                return CollectionsKt__CollectionsJVMKt.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static List dropLast(int i, List list) {
        list.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return take(list2, size);
    }

    public static Object elementAt(Iterable iterable, int i) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        DatePickerKt$$ExternalSyntheticLambda10 datePickerKt$$ExternalSyntheticLambda10 = new DatePickerKt$$ExternalSyntheticLambda10(i, 23);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            datePickerKt$$ExternalSyntheticLambda10.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            datePickerKt$$ExternalSyntheticLambda10.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        datePickerKt$$ExternalSyntheticLambda10.invoke(Integer.valueOf(i));
        throw null;
    }

    public static ArrayList filterNotNull(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object first(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return first((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection is empty.");
        return null;
    }

    public static Object firstOrNull(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object getOrNull(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int indexOf(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet intersect(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection convertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (convertToListIfNotCollection.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static /* synthetic */ void joinTo$default(Iterable iterable, StringBuilder sb, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.joinTo(iterable, sb, str4, str5, str6, -1, "...", function1);
    }

    public static String joinToString$default(Iterable iterable, CharSequence charSequence, String str, String str2, int i, String str3, Function1 function1, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str4 = (i2 & 2) != 0 ? "" : str;
        String str5 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = "...";
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str4.getClass();
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.joinTo(iterable, sb, charSequence2, str4, str5, i3, str6, function1);
        return sb.toString();
    }

    public static Object last(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return last((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object lastOrNull(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static Double m4122maxOrNull(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static double maxOrThrow(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return 0.0d;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static Double m4124minOrNull(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static double minOrThrow(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return 0.0d;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
        }
        return doubleValue;
    }

    public static List minus(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection convertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable2);
        if (convertToListIfNotCollection.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!convertToListIfNotCollection.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList plus(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            CollectionsKt__MutableCollectionsKt.addAll(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List reversed(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.reverse(mutableList);
        return mutableList;
    }

    public static Object single(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return single((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Collection has more than one element.");
        return null;
    }

    public static Object singleOrNull(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static List slice(List list, IntRange intRange) {
        list.getClass();
        intRange.getClass();
        return intRange.isEmpty() ? EmptyList.INSTANCE : toList(list.subList(intRange.first, intRange.last + 1));
    }

    public static List sorted(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
            CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array2 = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array2;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ArraysKt___ArraysJvmKt.asList(array2);
    }

    public static List sortedDescending(Iterable iterable) {
        iterable.getClass();
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        reverseOrderComparator.getClass();
        return sortedWith(iterable, reverseOrderComparator);
    }

    public static List sortedWith(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
            CollectionsKt__MutableCollectionsJVMKt.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array2 = collection.toArray(new Object[0]);
        array2.getClass();
        if (array2.length > 1) {
            Arrays.sort(array2, comparator);
        }
        List asList = Arrays.asList(array2);
        asList.getClass();
        return asList;
    }

    public static LinkedHashSet subtract(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection convertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!convertToListIfNotCollection.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static double sumOfDouble(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((Number) it.next()).doubleValue();
        }
        return d;
    }

    public static int sumOfInt(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static List take(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.INSTANCE;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i == 1) {
                return CollectionsKt__CollectionsJVMKt.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static List takeLast(int i, List list) {
        list.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.INSTANCE;
        }
        int size = list.size();
        if (i >= size) {
            return toList(list);
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(last(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] toBooleanArray(Collection collection) {
        collection.getClass();
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static void toCollection(Iterable iterable, java.util.AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] toFloatArray(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet toHashSet(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 12)));
        toCollection(iterable, hashSet);
        return hashSet;
    }

    public static int[] toIntArray(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List toList(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.optimizeReadOnlyList(CollectionsKt___CollectionsKt.toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] toLongArray(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList toMutableList(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static LinkedHashSet toMutableSet(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        toCollection(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set toSet(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            toCollection(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : SetsKt__SetsJVMKt.setOf(linkedHashSet.iterator().next()) : EmptySet.INSTANCE;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.INSTANCE;
        }
        if (size2 == 1) {
            return SetsKt__SetsJVMKt.setOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(collection.size()));
        toCollection(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static LinkedHashSet union(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        LinkedHashSet mutableSet = toMutableSet(iterable);
        CollectionsKt__MutableCollectionsKt.addAll(iterable2, mutableSet);
        return mutableSet;
    }

    public static ArrayList windowed(Iterable iterable, int i, int i2, boolean z) {
        iterable.getClass();
        SlidingWindowKt.checkWindowSizeStep(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator windowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i, i2, z, false);
            while (windowedIterator.hasNext()) {
                arrayList.add((List) windowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            if (i4 < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static /* synthetic */ ArrayList windowed$default(Iterable iterable, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return windowed(iterable, i, i2, false);
    }

    public static IndexingIterable withIndex(Iterable iterable) {
        iterable.getClass();
        return new IndexingIterable(new Choreographers$$ExternalSyntheticLambda1(iterable, 15), 0);
    }

    public static ArrayList zip(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Object first(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("List is empty.");
        return null;
    }

    public static ArrayList plus(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object singleOrNull(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static Object last(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("List is empty.");
        return null;
    }

    public static ArrayList plus(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return plus(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(iterable, arrayList);
        CollectionsKt__MutableCollectionsKt.addAll(iterable2, arrayList);
        return arrayList;
    }

    public static int indexOf(Object obj, List list) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static Comparable maxOrThrow(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static Object single(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        a$$ExternalSyntheticBUOutline0.m$3("List has more than one element.");
        return null;
    }

    public static Comparable maxOrNull(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static Float m4125minOrNull(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static ArrayList minus(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList plus(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object lastOrNull(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static Float m4123maxOrNull(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable minOrNull(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList chunked(Iterable iterable, int i) {
        iterable.getClass();
        return windowed(iterable, i, i, true);
    }
}
