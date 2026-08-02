package kotlin.collections;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;

/* loaded from: classes.dex */
public class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
    public static void addAll(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final Collection convertToListIfNotCollection(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? (Collection) iterable : CollectionsKt.toList(iterable);
    }

    public static final boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable iterable, Function1 function1, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void removeAll(List list, Function1 function1) {
        int size;
        list.getClass();
        function1.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof KMappedMarker) && !(list instanceof KMutableCollection)) {
                TypeIntrinsics.throwCce(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                filterInPlace$CollectionsKt__MutableCollectionsKt(list, function1, true);
                return;
            } catch (ClassCastException e) {
                Intrinsics.sanitizeStackTrace(e, TypeIntrinsics.class.getName());
                throw e;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static Object removeFirst(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("List is empty.");
        return null;
    }

    public static Object removeLast(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("List is empty.");
        return null;
    }

    public static Object removeLastOrNull(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public static void addAll(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        collection.addAll(asList);
    }
}
