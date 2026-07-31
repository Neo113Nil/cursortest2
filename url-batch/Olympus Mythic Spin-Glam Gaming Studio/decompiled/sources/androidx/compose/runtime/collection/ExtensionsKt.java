package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "toMutableObjectList", "(Landroidx/collection/ObjectList;)Landroidx/collection/MutableObjectList;", "", "K", "Lkotlin/Function1;", "selector", "sortedBy", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectList;", "", "isSorted", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Z", "", "sortBy", "(Landroidx/collection/MutableObjectList;Lkotlin/jvm/functions/Function1;)V", "removeLast", "(Landroidx/collection/MutableObjectList;)Ljava/lang/Object;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ExtensionsKt {
    public static final MutableObjectList toMutableObjectList(ObjectList objectList) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.get_size());
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            mutableObjectList.add(objArr[i2]);
        }
        return mutableObjectList;
    }

    public static final ObjectList sortedBy(ObjectList objectList, Function1 function1) {
        if (isSorted(objectList, function1)) {
            return objectList;
        }
        MutableObjectList mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, function1);
        return mutableObjectList;
    }

    public static final boolean isSorted(ObjectList objectList, Function1 function1) {
        if (objectList.get_size() <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) function1.invoke(objectList.get(0));
        if (comparable == null) {
            return false;
        }
        int i = objectList.get_size();
        int i2 = 1;
        while (i2 < i) {
            Comparable comparable2 = (Comparable) function1.invoke(objectList.get(i2));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i2++;
            comparable = comparable2;
        }
        return true;
    }

    public static final void sortBy(MutableObjectList mutableObjectList, final Function1 function1) {
        List asMutableList = mutableObjectList.asMutableList();
        if (asMutableList.size() > 1) {
            CollectionsKt.sortWith(asMutableList, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Function1 function12 = Function1.this;
                    return ComparisonsKt.compareValues((Comparable) function12.invoke(obj), (Comparable) function12.invoke(obj2));
                }
            });
        }
    }

    public static final Object removeLast(MutableObjectList mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = mutableObjectList.get_size() - 1;
        Object obj = mutableObjectList.get(i);
        mutableObjectList.removeAt(i);
        return obj;
    }
}
