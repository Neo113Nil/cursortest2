package operations.logic.equals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import okhttp3.Headers;
import operations.logic.unwrap.SingleNestedValue;

/* loaded from: classes9.dex */
public abstract class EqualsTableOfTruth {
    public static final Map tableOfTruth;

    static {
        Boolean bool = Boolean.TRUE;
        Headers.Builder builder = new Headers.Builder(2);
        builder.add(bool);
        builder.addSpread(getAllVariantsOf(1));
        ArrayList arrayList = builder.namesAndValues;
        Pair pair = new Pair(bool, CollectionsKt__CollectionsKt.listOf(arrayList.toArray(new Object[arrayList.size()])));
        Boolean bool2 = Boolean.FALSE;
        Headers.Builder builder2 = new Headers.Builder(7);
        builder2.add(bool2);
        builder2.addSpread(getAllVariantsOf(0));
        builder2.add("");
        EmptyList emptyList = EmptyList.INSTANCE;
        builder2.add(emptyList);
        builder2.add(new SingleNestedValue(emptyList));
        builder2.add(new SingleNestedValue(""));
        builder2.add(new SingleNestedValue(null));
        ArrayList arrayList2 = builder2.namesAndValues;
        Pair pair2 = new Pair(bool2, CollectionsKt__CollectionsKt.listOf(arrayList2.toArray(new Object[arrayList2.size()])));
        Headers.Builder builder3 = new Headers.Builder(2);
        builder3.add(bool);
        builder3.addSpread(getAllVariantsOf(1));
        ArrayList arrayList3 = builder3.namesAndValues;
        Pair pair3 = new Pair(1, CollectionsKt__CollectionsKt.listOf(arrayList3.toArray(new Object[arrayList3.size()])));
        Headers.Builder builder4 = new Headers.Builder(7);
        builder4.add(bool2);
        builder4.addSpread(getAllVariantsOf(0));
        builder4.add("");
        builder4.add(emptyList);
        builder4.add(new SingleNestedValue(emptyList));
        builder4.add(new SingleNestedValue(""));
        builder4.add(new SingleNestedValue(null));
        ArrayList arrayList4 = builder4.namesAndValues;
        Pair pair4 = new Pair(0, CollectionsKt__CollectionsKt.listOf(arrayList4.toArray(new Object[arrayList4.size()])));
        Pair pair5 = new Pair("true", CollectionsKt__CollectionsJVMKt.listOf("true"));
        Pair pair6 = new Pair("false", CollectionsKt__CollectionsJVMKt.listOf("false"));
        Double valueOf = Double.valueOf(1.0d);
        Pair pair7 = new Pair("1", CollectionsKt__CollectionsKt.listOf(bool, 1, valueOf, "1", new SingleNestedValue(1), new SingleNestedValue(valueOf), new SingleNestedValue("1")));
        Double valueOf2 = Double.valueOf(0.0d);
        Pair pair8 = new Pair("0", CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, "0", new SingleNestedValue(0), new SingleNestedValue(valueOf2), new SingleNestedValue("0")));
        Pair pair9 = new Pair("", CollectionsKt__CollectionsKt.listOf(bool2, 0, "", emptyList, new SingleNestedValue(emptyList), new SingleNestedValue(""), new SingleNestedValue(null)));
        Pair pair10 = new Pair(null, CollectionsKt__CollectionsJVMKt.listOf(null));
        Pair pair11 = new Pair(emptyList, CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, ""));
        Pair pair12 = new Pair(new SingleNestedValue(null), CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, ""));
        Pair pair13 = new Pair(new SingleNestedValue(""), CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, ""));
        Pair pair14 = new Pair(new SingleNestedValue(emptyList), CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, ""));
        Pair pair15 = new Pair(new SingleNestedValue(0), CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, "0"));
        Pair pair16 = new Pair(new SingleNestedValue(1), CollectionsKt__CollectionsKt.listOf(bool, 1, valueOf, "1"));
        Pair pair17 = new Pair(new SingleNestedValue("1"), CollectionsKt__CollectionsKt.listOf(bool, 1, valueOf, "1"));
        Pair pair18 = new Pair(new SingleNestedValue("0"), CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, "0"));
        Pair pair19 = new Pair(new SingleNestedValue(valueOf2), CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2, "0"));
        Pair pair20 = new Pair(new SingleNestedValue(valueOf), CollectionsKt__CollectionsKt.listOf(bool, 1, valueOf, "1"));
        Pair pair21 = new Pair(new SingleNestedValue("1.0"), CollectionsKt__CollectionsKt.listOf(bool, 1, valueOf));
        Pair pair22 = new Pair(new SingleNestedValue("0.0"), CollectionsKt__CollectionsKt.listOf(bool2, 0, valueOf2));
        Pair pair23 = new Pair(valueOf, CollectionsKt__CollectionsKt.listOf(valueOf, new SingleNestedValue(valueOf), new SingleNestedValue(1), new SingleNestedValue("1.0"), "1", 1, bool, "1.0"));
        Pair pair24 = new Pair("1.0", CollectionsKt__CollectionsKt.listOf("1.0", valueOf, 1, bool));
        Headers.Builder builder5 = new Headers.Builder(4);
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(valueOf2);
        List list = listOf;
        List list2 = listOf;
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList5.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        builder5.addSpread(plusNested(plusStrings(CollectionsKt.plus((Iterable) arrayList5, (Collection) list))).toArray(new Object[0]));
        Boolean bool3 = Boolean.FALSE;
        builder5.add(bool3);
        EmptyList emptyList2 = EmptyList.INSTANCE;
        builder5.add(emptyList2);
        builder5.add(new SingleNestedValue(emptyList2));
        ArrayList arrayList6 = builder5.namesAndValues;
        tableOfTruth = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, new Pair(valueOf2, CollectionsKt__CollectionsKt.listOf(arrayList6.toArray(new Object[arrayList6.size()]))), new Pair("0.0", CollectionsKt__CollectionsKt.listOf("0.0", valueOf2, 0, bool3)));
    }

    public static Object[] getAllVariantsOf(int i) {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(i));
        List list = listOf;
        List list2 = listOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        return plusNested(plusStrings(CollectionsKt.plus((Iterable) arrayList, (Collection) list))).toArray(new Object[0]);
    }

    public static ArrayList plusNested(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new SingleNestedValue(it.next()));
        }
        return CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList);
    }

    public static ArrayList plusStrings(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Number) it.next()).toString());
        }
        return CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList);
    }
}
