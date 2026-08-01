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
import java.util.Set;

/* loaded from: classes.dex */
public abstract class uc extends ad {
    public static Object i0(final int i, Collection collection) {
        collection.getClass();
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        tr trVar = new tr() { // from class: bd
            @Override // defpackage.tr
            public final Object h(Object obj) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
            }
        };
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            trVar.h(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            trVar.h(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        trVar.h(Integer.valueOf(i));
        throw null;
    }

    public static final void j0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, tr trVar) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            mc0.d(sb, obj, trVar);
        }
        sb.append(charSequence3);
    }

    public static String k0(Collection collection, String str, String str2, String str3, h hVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            hVar = null;
        }
        collection.getClass();
        StringBuilder sb = new StringBuilder();
        j0(collection, sb, str4, str5, str6, "...", hVar);
        return sb.toString();
    }

    public static ArrayList l0(List list, Object obj) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static List m0(AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.size() <= 1) {
            return q0(abstractList);
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

    public static List n0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List r0 = r0(iterable);
            if (((ArrayList) r0).size() > 1) {
                Collections.sort(r0, comparator);
            }
            return r0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return q0(iterable);
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

    public static byte[] o0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void p0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List q0(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        wm wmVar = wm.f;
        if (!z) {
            List r0 = r0(iterable);
            ArrayList arrayList = (ArrayList) r0;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? r0 : bi.K(arrayList.get(0)) : wmVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return wmVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return bi.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List r0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        p0(iterable, arrayList);
        return arrayList;
    }

    public static Set s0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return ym.f;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(vz.Z(arrayList.size()));
            p0(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        singleton.getClass();
        return singleton;
    }
}
