package cn.hutool.core.collection;

import cn.hutool.core.comparator.PinyinComparator;
import cn.hutool.core.comparator.PropertyComparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class n0 {
    public static <T> List<T> empty() {
        return Collections.emptyList();
    }

    public static <T> int[] indexOfAll(List<T> list, cn.hutool.core.lang.d0 d0Var) {
        return CollUtil.indexOfAll(list, d0Var);
    }

    public static <T> int lastIndexOf(List<T> list, cn.hutool.core.lang.d0 d0Var) {
        int size;
        if (list == null || (size = list.size()) <= 0) {
            return -1;
        }
        for (int i8 = size - 1; i8 >= 0; i8--) {
            if (d0Var == null || d0Var.match(list.get(i8))) {
                return i8;
            }
        }
        return -1;
    }

    public static <T> List<T> list(boolean z7) {
        return z7 ? new LinkedList() : new ArrayList();
    }

    @SafeVarargs
    public static <T> List<T> of(T... tArr) {
        return cn.hutool.core.util.h.isEmpty((Object[]) tArr) ? Collections.emptyList() : Collections.unmodifiableList(toList(tArr));
    }

    public static <T> List<T> page(int i8, int i9, List<T> list) {
        if (CollUtil.isEmpty((Collection<?>) list)) {
            return new ArrayList(0);
        }
        int size = list.size();
        if (size <= i9) {
            return i8 < cn.hutool.core.util.f0.getFirstPageNo() + 1 ? unmodifiable(list) : new ArrayList(0);
        }
        if ((i8 - cn.hutool.core.util.f0.getFirstPageNo()) * i9 > size) {
            return new ArrayList(0);
        }
        int[] transToStartEnd = cn.hutool.core.util.f0.transToStartEnd(i8, i9);
        if (transToStartEnd[1] > size) {
            transToStartEnd[1] = size;
            if (transToStartEnd[0] > size) {
                return new ArrayList(0);
            }
        }
        return sub(list, transToStartEnd[0], transToStartEnd[1]);
    }

    public static <T> List<List<T>> partition(List<T> list, int i8) {
        return CollUtil.isEmpty((Collection<?>) list) ? empty() : list instanceof RandomAccess ? new r0(list, i8) : new p0(list, i8);
    }

    public static <T> List<T> reverse(List<T> list) {
        Collections.reverse(list);
        return list;
    }

    public static <T> List<T> reverseNew(List<T> list) {
        List list2 = (List) cn.hutool.core.util.e0.clone(list);
        if (list2 == null) {
            list2 = new ArrayList(list);
        }
        try {
            return reverse(list2);
        } catch (UnsupportedOperationException unused) {
            return reverse(list(false, (Collection) list));
        }
    }

    public static <T> List<T> setOrAppend(List<T> list, int i8, T t7) {
        cn.hutool.core.lang.q.notNull(list, "List must be not null !", new Object[0]);
        if (i8 < list.size()) {
            list.set(i8, t7);
        } else {
            list.add(t7);
        }
        return list;
    }

    public static <T> List<T> setOrPadding(List<T> list, int i8, T t7) {
        return setOrPadding(list, i8, t7, null);
    }

    public static <T> List<T> sort(List<T> list, Comparator<? super T> comparator) {
        if (CollUtil.isEmpty((Collection<?>) list)) {
            return list;
        }
        list.sort(comparator);
        return list;
    }

    public static List<String> sortByPinyin(List<String> list) {
        return sort(list, new PinyinComparator());
    }

    public static <T> List<T> sortByProperty(List<T> list, String str) {
        return sort(list, new PropertyComparator(str));
    }

    public static <T> List<List<T>> split(List<T> list, int i8) {
        return partition(list, i8);
    }

    public static <T> List<List<T>> splitAvg(List<T> list, int i8) {
        return CollUtil.isEmpty((Collection<?>) list) ? empty() : list instanceof RandomAccess ? new q0(list, i8) : new a(list, i8);
    }

    public static <T> List<T> sub(List<T> list, int i8, int i9) {
        return sub(list, i8, i9, 1);
    }

    public static <T> void swapElement(List<T> list, T t7, T t8) {
        int indexOf;
        if (!CollUtil.isNotEmpty((Collection<?>) list) || (indexOf = list.indexOf(t8)) < 0) {
            return;
        }
        swapTo(list, t7, Integer.valueOf(indexOf));
    }

    public static <T> void swapTo(List<T> list, T t7, Integer num) {
        int indexOf;
        if (!CollUtil.isNotEmpty((Collection<?>) list) || (indexOf = list.indexOf(t7)) < 0) {
            return;
        }
        Collections.swap(list, indexOf, num.intValue());
    }

    public static <T> CopyOnWriteArrayList<T> toCopyOnWriteArrayList(Collection<T> collection) {
        return collection == null ? new CopyOnWriteArrayList<>() : new CopyOnWriteArrayList<>(collection);
    }

    @SafeVarargs
    public static <T> LinkedList<T> toLinkedList(T... tArr) {
        return (LinkedList) list(true, (Object[]) tArr);
    }

    @SafeVarargs
    public static <T> ArrayList<T> toList(T... tArr) {
        return (ArrayList) list(false, (Object[]) tArr);
    }

    public static <T> List<T> unmodifiable(List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @SafeVarargs
    public static <T> List<T> list(boolean z7, T... tArr) {
        if (cn.hutool.core.util.h.isEmpty((Object[]) tArr)) {
            return list(z7);
        }
        List<T> linkedList = z7 ? new LinkedList<>() : new ArrayList<>(tArr.length);
        Collections.addAll(linkedList, tArr);
        return linkedList;
    }

    public static <T> List<T> setOrPadding(List<T> list, int i8, T t7, T t8) {
        cn.hutool.core.lang.q.notNull(list, "List must be not null !", new Object[0]);
        int size = list.size();
        if (i8 < size) {
            list.set(i8, t7);
        } else {
            cn.hutool.core.lang.c1.checkIndexLimit(i8, list.size());
            while (size < i8) {
                list.add(t8);
                size++;
            }
            list.add(t7);
        }
        return list;
    }

    public static <T> List<T> sub(List<T> list, int i8, int i9, int i10) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return new ArrayList(0);
        }
        int size = list.size();
        if (i8 < 0) {
            i8 += size;
        }
        if (i9 < 0) {
            i9 += size;
        }
        if (i8 == size) {
            return new ArrayList(0);
        }
        if (i8 <= i9) {
            int i11 = i9;
            i9 = i8;
            i8 = i11;
        }
        if (i8 <= size) {
            size = i8;
        } else if (i9 >= size) {
            return new ArrayList(0);
        }
        if (i10 < 1) {
            i10 = 1;
        }
        ArrayList arrayList = new ArrayList();
        while (i9 < size) {
            arrayList.add(list.get(i9));
            i9 += i10;
        }
        return arrayList;
    }

    public static <T> ArrayList<T> toList(Collection<T> collection) {
        return (ArrayList) list(false, (Collection) collection);
    }

    public static <T> ArrayList<T> toList(Iterable<T> iterable) {
        return (ArrayList) list(false, (Iterable) iterable);
    }

    public static <T> ArrayList<T> toList(Iterator<T> it) {
        return (ArrayList) list(false, (Iterator) it);
    }

    public static <T> ArrayList<T> toList(Enumeration<T> enumeration) {
        return (ArrayList) list(false, (Enumeration) enumeration);
    }

    public static <T> List<T> list(boolean z7, Collection<T> collection) {
        if (collection == null) {
            return list(z7);
        }
        return z7 ? new LinkedList(collection) : new ArrayList(collection);
    }

    public static <T> List<T> list(boolean z7, Iterable<T> iterable) {
        if (iterable == null) {
            return list(z7);
        }
        return list(z7, iterable.iterator());
    }

    public static <T> List<T> list(boolean z7, Iterator<T> it) {
        List<T> list = list(z7);
        if (it != null) {
            while (it.hasNext()) {
                list.add(it.next());
            }
        }
        return list;
    }

    public static <T> List<T> list(boolean z7, Enumeration<T> enumeration) {
        List<T> list = list(z7);
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                list.add(enumeration.nextElement());
            }
        }
        return list;
    }

    public static <T> void page(List<T> list, int i8, Consumer<List<T>> consumer) {
        if (CollUtil.isEmpty((Collection<?>) list) || i8 <= 0) {
            return;
        }
        int size = list.size();
        int i9 = cn.hutool.core.util.f0.totalPage(size, i8);
        for (int firstPageNo = cn.hutool.core.util.f0.getFirstPageNo(); firstPageNo < cn.hutool.core.util.f0.getFirstPageNo() + i9; firstPageNo++) {
            int[] transToStartEnd = cn.hutool.core.util.f0.transToStartEnd(firstPageNo, i8);
            if (transToStartEnd[1] > size) {
                transToStartEnd[1] = size;
            }
            consumer.accept(sub(list, transToStartEnd[0], transToStartEnd[1]));
        }
    }
}
