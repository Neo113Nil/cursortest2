package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class x extends w {
    public static final <R> List<R> filterIsInstance(Iterable<?> iterable, Class<R> klass) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(iterable, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Iterable<?> iterable, C destination, Class<R> klass) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m1186max(Iterable iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt___CollectionsKt.m434maxOrNull((Iterable<Double>) iterable);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    public static final /* synthetic */ Object maxWith(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt___CollectionsKt.maxWithOrNull(iterable, comparator);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m1188min(Iterable iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt___CollectionsKt.m442minOrNull((Iterable<Double>) iterable);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    public static final /* synthetic */ Object minWith(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt___CollectionsKt.minWithOrNull(iterable, comparator);
    }

    public static <T> void reverse(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        Collections.reverse(list);
    }

    private static final <T> BigDecimal sumOfBigDecimal(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(it.next()));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final <T> BigInteger sumOfBigInteger(Iterable<? extends T> iterable, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add((BigInteger) selector.invoke(it.next()));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return (SortedSet) CollectionsKt___CollectionsKt.toCollection(iterable, new TreeSet());
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m1187max(Iterable iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt___CollectionsKt.m435maxOrNull((Iterable<Float>) iterable);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m1189min(Iterable iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt___CollectionsKt.m443minOrNull((Iterable<Float>) iterable);
    }

    public static final <T> SortedSet<T> toSortedSet(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) CollectionsKt___CollectionsKt.toCollection(iterable, new TreeSet(comparator));
    }

    public static final /* synthetic */ Comparable max(Iterable iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt___CollectionsKt.maxOrNull(iterable);
    }

    public static final /* synthetic */ Comparable min(Iterable iterable) {
        Comparable minOrNull;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        minOrNull = CollectionsKt___CollectionsKt.minOrNull((Iterable<? extends Comparable>) iterable);
        return minOrNull;
    }
}
