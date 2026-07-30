package kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes4.dex */
class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
    public static final <R> m filterIsInstance(m mVar, final Class<R> klass) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(klass, "klass");
        m filter = SequencesKt___SequencesKt.filter(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt___SequencesJvmKt$filterIsInstance$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(klass.isInstance(obj));
            }
        });
        kotlin.jvm.internal.s.checkNotNull(filter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return filter;
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(m mVar, C destination, Class<R> klass) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(klass, "klass");
        for (Object obj : mVar) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m1199max(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SequencesKt___SequencesKt.m1207maxOrNull(mVar);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
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
        return (T) next;
    }

    public static final /* synthetic */ Object maxWith(m mVar, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return SequencesKt___SequencesKt.maxWithOrNull(mVar, comparator);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m1201min(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SequencesKt___SequencesKt.m1215minOrNull(mVar);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
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
        return (T) next;
    }

    public static final /* synthetic */ Object minWith(m mVar, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return SequencesKt___SequencesKt.minWithOrNull(mVar, comparator);
    }

    private static final <T> BigDecimal sumOfBigDecimal(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(it.next()));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final <T> BigInteger sumOfBigInteger(m mVar, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add((BigInteger) selector.invoke(it.next()));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return (SortedSet) SequencesKt___SequencesKt.toCollection(mVar, new TreeSet());
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m1200max(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SequencesKt___SequencesKt.m1208maxOrNull(mVar);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m1202min(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SequencesKt___SequencesKt.m1216minOrNull(mVar);
    }

    public static final <T> SortedSet<T> toSortedSet(m mVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) SequencesKt___SequencesKt.toCollection(mVar, new TreeSet(comparator));
    }

    public static final /* synthetic */ Comparable max(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SequencesKt___SequencesKt.maxOrNull(mVar);
    }

    public static final /* synthetic */ Comparable min(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return SequencesKt___SequencesKt.minOrNull(mVar);
    }
}
