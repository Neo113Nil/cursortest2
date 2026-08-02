package kotlin.collections;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.random.XorWowRandom;
import kotlin.ranges.IntRange;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    public static ArrayList arrayListOf(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    public static int binarySearch$default(List list, Comparable comparable) {
        int size = list.size();
        list.getClass();
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int compareValues = ComparisonsKt__ComparisonsKt.compareValues((Comparable) list.get(i3), comparable);
            if (compareValues < 0) {
                i2 = i3 + 1;
            } else {
                if (compareValues <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static EmptyList emptyList() {
        return EmptyList.INSTANCE;
    }

    public static IntRange getIndices(Collection collection) {
        collection.getClass();
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int getLastIndex(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List listOf(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return EmptyList.INSTANCE;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static List listOfNotNull(Object obj) {
        return obj != null ? CollectionsKt__CollectionsJVMKt.listOf(obj) : EmptyList.INSTANCE;
    }

    public static ArrayList mutableListOf(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    public static final List optimizeReadOnlyList(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt__CollectionsJVMKt.listOf(list.get(0)) : EmptyList.INSTANCE;
    }

    public static final void rangeCheck$CollectionsKt__CollectionsKt(int i, int i2) {
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static List shuffled(List list, XorWowRandom xorWowRandom) {
        list.getClass();
        List mutableList = CollectionsKt___CollectionsKt.toMutableList(list);
        ArrayList arrayList = (ArrayList) mutableList;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            int nextInt = xorWowRandom.nextInt(0, size + 1);
            arrayList.set(nextInt, arrayList.set(size, arrayList.get(nextInt)));
        }
        return mutableList;
    }

    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
