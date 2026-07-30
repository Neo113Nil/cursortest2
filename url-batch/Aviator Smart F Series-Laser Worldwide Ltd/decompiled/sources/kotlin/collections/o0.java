package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* loaded from: classes4.dex */
class o0 extends n0 {
    public static final <K, V> boolean all(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    private static final <K, V> Iterable<Map.Entry<K, V>> asIterable(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.entrySet();
    }

    public static final <K, V> kotlin.sequences.m asSequence(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return CollectionsKt___CollectionsKt.asSequence(map.entrySet());
    }

    private static final <K, V> int count(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    private static final <K, V, R> R firstNotNullOf(Map<? extends K, ? extends V> map, f6.l transform) {
        R r8;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                r8 = null;
                break;
            }
            r8 = (R) transform.invoke(it.next());
            if (r8 != null) {
                break;
            }
        }
        if (r8 != null) {
            return r8;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    private static final <K, V, R> R firstNotNullOfOrNull(Map<? extends K, ? extends V> map, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R r8 = (R) transform.invoke(it.next());
            if (r8 != null) {
                return r8;
            }
        }
        return null;
    }

    public static final <K, V, R> List<R> flatMap(Map<? extends K, ? extends V> map, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v.addAll(arrayList, (Iterable) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> List<R> flatMapSequence(Map<? extends K, ? extends V> map, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v.addAll(arrayList, (kotlin.sequences.m) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapSequenceTo(Map<? extends K, ? extends V> map, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v.addAll(destination, (kotlin.sequences.m) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(Map<? extends K, ? extends V> map, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <K, V> void forEach(Map<? extends K, ? extends V> map, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <K, V, R> List<R> map(Map<? extends K, ? extends V> map, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> List<R> mapNotNull(Map<? extends K, ? extends V> map, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object invoke = transform.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(Map<? extends K, ? extends V> map, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object invoke = transform.invoke(it.next());
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapTo(Map<? extends K, ? extends V> map, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        Object obj;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) selector.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrThrow(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                Object next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return (Map.Entry) next;
    }

    private static final <K, V> double maxOf(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m460maxOfOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <K, V, R> R maxOfWith(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke = selector.invoke(it.next());
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <K, V, R> R maxOfWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke2 = selector.invoke(it.next());
            if (comparator.compare(invoke, invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return (R) invoke;
    }

    private static final <K, V> Map.Entry<K, V> maxWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.maxWithOrNull(map.entrySet(), comparator);
    }

    private static final <K, V> Map.Entry<K, V> maxWithOrThrow(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.maxWithOrThrow(map.entrySet(), comparator);
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        Object obj;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) selector.invoke(next2);
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrThrow(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                Object next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return (Map.Entry) next;
    }

    private static final <K, V> double minOf(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m464minOfOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(it.next())).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(it.next())).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <K, V, R> R minOfWith(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke = selector.invoke(it.next());
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <K, V, R> R minOfWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            Object invoke2 = selector.invoke(it.next());
            if (comparator.compare(invoke, invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return (R) invoke;
    }

    private static final <K, V> Map.Entry<K, V> minWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.minWithOrNull(map.entrySet(), comparator);
    }

    private static final <K, V> Map.Entry<K, V> minWithOrThrow(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.minWithOrThrow(map.entrySet(), comparator);
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(M m8, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(m8, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        Iterator<Map.Entry<K, V>> it = m8.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return m8;
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEachIndexed(M m8, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(m8, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int i8 = 0;
        for (Object obj : m8.entrySet()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i8), obj);
            i8 = i9;
        }
        return m8;
    }

    public static final <K, V> List<Pair<K, V>> toList(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return q.listOf(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <K, V> int count(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V> float m458maxOf(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) selector.invoke(it.next())).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(it.next())).floatValue());
        }
        return floatValue;
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m461maxOfOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(it.next())).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(it.next())).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <K, V> float m462minOf(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) selector.invoke(it.next())).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(it.next())).floatValue());
        }
        return floatValue;
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m465minOfOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(it.next())).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(it.next())).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m459maxOf(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(it.next());
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <K, V, R extends Comparable<? super R>> R maxOfOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) selector.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) selector.invoke(it.next());
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return (R) comparable;
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m463minOf(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(it.next());
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    private static final <K, V, R extends Comparable<? super R>> R minOfOrNull(Map<? extends K, ? extends V> map, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) selector.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) selector.invoke(it.next());
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return (R) comparable;
    }
}
