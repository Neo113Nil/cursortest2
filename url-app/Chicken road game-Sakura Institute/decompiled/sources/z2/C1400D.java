package z2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1400D extends C1399C {
    public static void j(Iterable elements, AbstractCollection abstractCollection) {
        Intrinsics.checkNotNullParameter(abstractCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final boolean k(Iterable iterable, Function1 function1, boolean z4) {
        Iterator it = iterable.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z4) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    public static void l(Q.v vVar, Function1 predicate) {
        int d4;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (vVar == null) {
            Intrinsics.d(vVar, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            k(vVar, predicate, true);
            return;
        }
        int d5 = C1441y.d(vVar);
        int i2 = 0;
        if (d5 >= 0) {
            int i4 = 0;
            while (true) {
                Object obj = vVar.get(i2);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i4 != i2) {
                        vVar.set(i4, obj);
                    }
                    i4++;
                }
                if (i2 == d5) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i4;
        }
        if (i2 >= vVar.size() || i2 > (d4 = C1441y.d(vVar))) {
            return;
        }
        while (true) {
            vVar.remove(d4);
            if (d4 == i2) {
                return;
            } else {
                d4--;
            }
        }
    }

    public static Object m(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object n(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(C1441y.d(list));
    }
}
