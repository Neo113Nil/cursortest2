package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zk extends el {
    public static Object BUo4iHFctTZi(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object FT2GK7JK5Ma2(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Comparable HiC8volkyM7b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
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

    public static Object MDTGUQSX7PXD(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        rc1.RAsUl2FVSrh6("List is empty.");
        return null;
    }

    public static ArrayList P6VAkUObIv30(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static int TVHukqbqS4tB(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                fx1.mFd1aGiJX24N();
                throw null;
            }
            if (cs0.wdg6QnbFHrFF(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List Yadk4uqlxLy8(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (size == 1) {
            return fx1.jJwa0q7P5wHq(kRWHK87H9qm4(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object a(ArrayList arrayList) {
        J54yh1s3n4Aq j54yh1s3n4Aq = tr1.rtx2ld2ELZv4;
        if (arrayList.isEmpty()) {
            rc1.RAsUl2FVSrh6("Collection is empty.");
            return null;
        }
        return arrayList.get(tr1.rtx2ld2ELZv4.lS5Rgt96tfkO(arrayList.size()));
    }

    public static List b(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return i(iterable);
        }
        List k = k(iterable);
        Collections.reverse(k);
        return k;
    }

    public static List c(AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.size() <= 1) {
            return i(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static String ctD2u3GUHhtA(Iterable iterable, String str, String str2, String str3, le0 le0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            le0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        i6zQx8Kd7UPU(iterable, sb, str4, str5, str6, "...", le0Var);
        return sb.toString();
    }

    public static List d(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List k = k(iterable);
            dl.Y2PHjkwWz56c(k, comparator);
            return k;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return i(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List e(int i, List list) {
        Object obj = null;
        if (i < 0) {
            u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (i >= list.size()) {
            return i(list);
        }
        if (i == 1) {
            list.getClass();
            if (list instanceof List) {
                obj = MDTGUQSX7PXD(list);
            } else {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                } else {
                    rc1.RAsUl2FVSrh6("Collection is empty.");
                }
            }
            return fx1.jJwa0q7P5wHq(obj);
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return fx1.VzNxmvWisHL1(arrayList);
    }

    public static boolean[] f(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static boolean fkblLSN2bAgv(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : TVHukqbqS4tB(iterable, obj) >= 0;
    }

    public static final void g(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] h(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List i(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return fx1.VzNxmvWisHL1(k(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return fx1.jJwa0q7P5wHq(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final void i6zQx8Kd7UPU(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, le0 le0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            th0.OPXfSBeufaJ8(sb, obj, le0Var);
        }
        sb.append(charSequence3);
    }

    public static ArrayList j(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List k(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        g(iterable, arrayList);
        return arrayList;
    }

    public static Object kRWHK87H9qm4(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        rc1.RAsUl2FVSrh6("List is empty.");
        return null;
    }

    public static Set l(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(w41.i68hK7ahKtgp(collection.size()));
                    g(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            g(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return t50.rtx2ld2ELZv4;
    }

    public static Object qYgDo2Ye5PY7(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static /* synthetic */ void vfcx0XMziUg4(List list, StringBuilder sb, r3s1LDPKFs1S r3s1ldpkfs1s, int i) {
        if ((i & 64) != 0) {
            r3s1ldpkfs1s = null;
        }
        i6zQx8Kd7UPU(list, sb, "\n", "", "", "...", r3s1ldpkfs1s);
    }

    public static ArrayList wcHq2YQJmeHg(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }
}
