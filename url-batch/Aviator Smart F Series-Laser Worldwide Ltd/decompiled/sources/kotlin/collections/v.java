package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class v extends u {
    public static <T> boolean addAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    public static <T> Collection<T> convertToListIfNotCollection(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = CollectionsKt___CollectionsKt.toList(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable<? extends T> iterable, f6.l lVar, boolean z7) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z7) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    private static final <T> void minusAssign(Collection<? super T> collection, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        collection.remove(t7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void plusAssign(Collection<? super T> collection, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        collection.add(t7);
    }

    private static final <T> boolean remove(Collection<? extends T> collection, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        return kotlin.jvm.internal.x.asMutableCollection(collection).remove(t7);
    }

    private static final <T> boolean removeAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return kotlin.jvm.internal.x.asMutableCollection(collection).removeAll(elements);
    }

    public static <T> T removeFirst(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final <T> T removeFirstOrNull(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T removeLast(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    public static <T> T removeLastOrNull(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    private static final <T> boolean retainAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return kotlin.jvm.internal.x.asMutableCollection(collection).retainAll(elements);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection<?> collection) {
        boolean z7 = !collection.isEmpty();
        collection.clear();
        return z7;
    }

    private static final <T> void minusAssign(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        removeAll(collection, elements);
    }

    private static final <T> void plusAssign(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        addAll(collection, elements);
    }

    private static final <T> T remove(List<T> list, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return list.remove(i8);
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return collection.removeAll(convertToListIfNotCollection(elements));
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return collection.retainAll(convertToListIfNotCollection(elements));
    }

    private static final <T> void minusAssign(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        removeAll(collection, elements);
    }

    private static final <T> void plusAssign(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        addAll(collection, elements);
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        List list = SequencesKt___SequencesKt.toList(elements);
        return (list.isEmpty() ^ true) && collection.removeAll(list);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (!(elements.length == 0)) {
            return collection.retainAll(k.asList(elements));
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static <T> boolean addAll(Collection<? super T> collection, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    private static final <T> void minusAssign(Collection<? super T> collection, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        removeAll(collection, elements);
    }

    private static final <T> void plusAssign(Collection<? super T> collection, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        addAll(collection, elements);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List<T> list, f6.l lVar, boolean z7) {
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.s.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return filterInPlace$CollectionsKt__MutableCollectionsKt(kotlin.jvm.internal.x.asMutableIterable(list), lVar, z7);
        }
        f0 it = new j6.m(0, CollectionsKt__CollectionsKt.getLastIndex(list)).iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t7 = list.get(nextInt);
            if (((Boolean) lVar.invoke(t7)).booleanValue() != z7) {
                if (i8 != nextInt) {
                    list.set(i8, t7);
                }
                i8++;
            }
        }
        if (i8 >= list.size()) {
            return false;
        }
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (i8 > lastIndex) {
            return true;
        }
        while (true) {
            list.remove(lastIndex);
            if (lastIndex == i8) {
                return true;
            }
            lastIndex--;
        }
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return ((elements.length == 0) ^ true) && collection.removeAll(k.asList(elements));
    }

    public static <T> boolean addAll(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return collection.addAll(k.asList(elements));
    }

    public static final <T> boolean removeAll(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, predicate, true);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        List list = SequencesKt___SequencesKt.toList(elements);
        if (!list.isEmpty()) {
            return collection.retainAll(list);
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static final <T> boolean removeAll(List<T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, predicate, true);
    }

    public static <T> boolean retainAll(Iterable<? extends T> iterable, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, predicate, false);
    }

    public static final <T> boolean retainAll(List<T> list, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, predicate, false);
    }
}
