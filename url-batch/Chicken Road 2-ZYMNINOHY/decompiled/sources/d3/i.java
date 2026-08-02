package d3;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public abstract class i extends o {
    public static boolean b0(Iterable iterable, Object obj) {
        int i4;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                }
                Object next = it.next();
                if (i5 < 0) {
                    j.X();
                    throw null;
                }
                if (kotlin.jvm.internal.i.a(obj, next)) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
        } else {
            i4 = ((List) iterable).indexOf(obj);
        }
        return i4 >= 0;
    }

    public static List c0(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return k0(size, list);
    }

    public static Object d0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void e0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC1339l interfaceC1339l) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        sb.append(charSequence2);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            O3.d.d(sb, obj, interfaceC1339l);
        }
        sb.append(charSequence3);
    }

    public static String g0(Iterable iterable, String str, String str2, String str3, InterfaceC1339l interfaceC1339l, int i4) {
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i4 & 2) != 0 ? "" : str2;
        String str5 = (i4 & 4) != 0 ? "" : str3;
        if ((i4 & 32) != 0) {
            interfaceC1339l = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        e0(iterable, sb, str4, prefix, str5, "...", interfaceC1339l);
        return sb.toString();
    }

    public static Object h0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList i0(List list, Object obj) {
        kotlin.jvm.internal.i.e(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList j0(List list, List elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(elements);
        return arrayList;
    }

    public static List k0(int i4, List list) {
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.k(i4, "Requested element count ", " is less than zero.").toString());
        }
        q qVar = q.f8333a;
        if (i4 == 0) {
            return qVar;
        }
        if (i4 >= list.size()) {
            return n0(list);
        }
        if (i4 == 1) {
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return AbstractC0124a.H(list.get(0));
        }
        ArrayList arrayList = new ArrayList(i4);
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i5++;
            if (i5 == i4) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : AbstractC0124a.H(arrayList.get(0)) : qVar;
    }

    public static final void l0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] m0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = ((Number) it.next()).intValue();
            i4++;
        }
        return iArr;
    }

    public static List n0(Iterable iterable) {
        ArrayList arrayList;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        q qVar = q.f8333a;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return qVar;
            }
            if (size != 1) {
                return o0(collection);
            }
            return AbstractC0124a.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z) {
            arrayList = o0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            l0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : AbstractC0124a.H(arrayList.get(0)) : qVar;
    }

    public static ArrayList o0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set p0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(u.z(collection.size()));
                    l0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                kotlin.jvm.internal.i.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            l0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                kotlin.jvm.internal.i.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return s.f8335a;
    }
}
