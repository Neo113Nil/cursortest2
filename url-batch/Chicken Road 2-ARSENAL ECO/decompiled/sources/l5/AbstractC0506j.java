package l5;

import com.onesignal.inAppMessages.internal.k;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.v;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import y5.InterfaceC0766a;
import y5.InterfaceC0767b;

/* renamed from: l5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0506j extends AbstractC0510n {
    public static void D(Iterable elements, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Object E(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object F(int i7, List list) {
        if (i7 < 0 || i7 >= list.size()) {
            return null;
        }
        return list.get(i7);
    }

    public static final void G(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC0743l interfaceC0743l) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        sb.append(charSequence2);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                sb.append(charSequence);
            }
            AbstractC0676f.b(sb, obj, interfaceC0743l);
        }
        sb.append(charSequence3);
    }

    public static String I(Iterable iterable, String str, String str2, String str3, InterfaceC0743l interfaceC0743l, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i7 & 2) != 0 ? "" : str2;
        String str5 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            interfaceC0743l = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        G(iterable, sb, str4, prefix, str5, "...", interfaceC0743l);
        return sb.toString();
    }

    public static Object J(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0507k.y(list));
    }

    public static ArrayList K(Collection collection, Iterable iterable) {
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    public static void L(List list, k.z.a aVar) {
        int y;
        kotlin.jvm.internal.i.e(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC0766a) && !(list instanceof InterfaceC0767b)) {
                v.d(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) aVar.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int y6 = AbstractC0507k.y(list);
        int i7 = 0;
        if (y6 >= 0) {
            int i8 = 0;
            while (true) {
                Object obj = list.get(i7);
                if (!((Boolean) aVar.invoke(obj)).booleanValue()) {
                    if (i8 != i7) {
                        list.set(i8, obj);
                    }
                    i8++;
                }
                if (i7 == y6) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = i8;
        }
        if (i7 >= list.size() || i7 > (y = AbstractC0507k.y(list))) {
            return;
        }
        while (true) {
            list.remove(y);
            if (y == i7) {
                return;
            } else {
                y--;
            }
        }
    }

    public static List M(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        if (collection.size() <= 1) {
            return P(collection);
        }
        List R6 = R(collection);
        Collections.reverse(R6);
        return R6;
    }

    public static List N(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.size() <= 1) {
            return P(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.i.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC0505i.E(array);
    }

    public static final void O(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List P(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z5 = iterable instanceof Collection;
        C0512p c0512p = C0512p.f5303f;
        if (!z5) {
            List R6 = R(iterable);
            ArrayList arrayList = (ArrayList) R6;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? R6 : AbstractC0676f.n(arrayList.get(0)) : c0512p;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0512p;
        }
        if (size2 != 1) {
            return Q(collection);
        }
        return AbstractC0676f.n(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList Q(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List R(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Q((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        O(iterable, arrayList);
        return arrayList;
    }

    public static Set S(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set T(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        int size = collection.size();
        if (size == 0) {
            return r.f5305f;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(t.p0(collection.size()));
            O(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        kotlin.jvm.internal.i.d(singleton, "singleton(...)");
        return singleton;
    }
}
