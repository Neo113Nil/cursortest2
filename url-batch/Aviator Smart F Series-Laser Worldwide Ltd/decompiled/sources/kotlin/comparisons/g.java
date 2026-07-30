package kotlin.comparisons;

import f6.p;
import java.util.Comparator;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class g {

    public static final class a implements Comparator {
        final /* synthetic */ f6.l $selector;

        public a(f6.l lVar) {
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareValues;
            f6.l lVar = this.$selector;
            compareValues = g.compareValues((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            return compareValues;
        }
    }

    public static final class b implements Comparator {
        final /* synthetic */ Comparator<Object> $comparator;
        final /* synthetic */ f6.l $selector;

        public b(Comparator<Object> comparator, f6.l lVar) {
            this.$comparator = comparator;
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Comparator<Object> comparator = this.$comparator;
            f6.l lVar = this.$selector;
            return comparator.compare(lVar.invoke(obj), lVar.invoke(obj2));
        }
    }

    public static final class c implements Comparator {
        final /* synthetic */ f6.l $selector;

        public c(f6.l lVar) {
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareValues;
            f6.l lVar = this.$selector;
            compareValues = g.compareValues((Comparable) lVar.invoke(obj2), (Comparable) lVar.invoke(obj));
            return compareValues;
        }
    }

    public static final class d implements Comparator {
        final /* synthetic */ Comparator<Object> $comparator;
        final /* synthetic */ f6.l $selector;

        public d(Comparator<Object> comparator, f6.l lVar) {
            this.$comparator = comparator;
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Comparator<Object> comparator = this.$comparator;
            f6.l lVar = this.$selector;
            return comparator.compare(lVar.invoke(obj2), lVar.invoke(obj));
        }
    }

    public static final class e implements Comparator {
        final /* synthetic */ f6.l $selector;
        final /* synthetic */ Comparator<Object> $this_thenBy;

        public e(Comparator<Object> comparator, f6.l lVar) {
            this.$this_thenBy = comparator;
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareValues;
            int compare = this.$this_thenBy.compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            f6.l lVar = this.$selector;
            compareValues = g.compareValues((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            return compareValues;
        }
    }

    public static final class f implements Comparator {
        final /* synthetic */ Comparator<Object> $comparator;
        final /* synthetic */ f6.l $selector;
        final /* synthetic */ Comparator<Object> $this_thenBy;

        public f(Comparator<Object> comparator, Comparator<Object> comparator2, f6.l lVar) {
            this.$this_thenBy = comparator;
            this.$comparator = comparator2;
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare = this.$this_thenBy.compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            Comparator<Object> comparator = this.$comparator;
            f6.l lVar = this.$selector;
            return comparator.compare(lVar.invoke(obj), lVar.invoke(obj2));
        }
    }

    /* renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    public static final class C0362g implements Comparator {
        final /* synthetic */ f6.l $selector;
        final /* synthetic */ Comparator<Object> $this_thenByDescending;

        public C0362g(Comparator<Object> comparator, f6.l lVar) {
            this.$this_thenByDescending = comparator;
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareValues;
            int compare = this.$this_thenByDescending.compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            f6.l lVar = this.$selector;
            compareValues = g.compareValues((Comparable) lVar.invoke(obj2), (Comparable) lVar.invoke(obj));
            return compareValues;
        }
    }

    public static final class h implements Comparator {
        final /* synthetic */ Comparator<Object> $comparator;
        final /* synthetic */ f6.l $selector;
        final /* synthetic */ Comparator<Object> $this_thenByDescending;

        public h(Comparator<Object> comparator, Comparator<Object> comparator2, f6.l lVar) {
            this.$this_thenByDescending = comparator;
            this.$comparator = comparator2;
            this.$selector = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare = this.$this_thenByDescending.compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            Comparator<Object> comparator = this.$comparator;
            f6.l lVar = this.$selector;
            return comparator.compare(lVar.invoke(obj2), lVar.invoke(obj));
        }
    }

    public static final class i implements Comparator {
        final /* synthetic */ p $comparison;
        final /* synthetic */ Comparator<Object> $this_thenComparator;

        public i(Comparator<Object> comparator, p pVar) {
            this.$this_thenComparator = comparator;
            this.$comparison = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare = this.$this_thenComparator.compare(obj, obj2);
            return compare != 0 ? compare : ((Number) this.$comparison.invoke(obj, obj2)).intValue();
        }
    }

    public static final <T> Comparator<T> compareBy(final f6.l... selectors) {
        s.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
                    compareBy$lambda$0$ComparisonsKt__ComparisonsKt = g.compareBy$lambda$0$ComparisonsKt__ComparisonsKt(selectors, obj, obj2);
                    return compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(f6.l[] selectors, Object obj, Object obj2) {
        s.checkNotNullParameter(selectors, "$selectors");
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(obj, obj2, selectors);
    }

    private static final <T> Comparator<T> compareByDescending(f6.l selector) {
        s.checkNotNullParameter(selector, "selector");
        return new c(selector);
    }

    public static <T extends Comparable<?>> int compareValues(T t7, T t8) {
        if (t7 == t8) {
            return 0;
        }
        if (t7 == null) {
            return -1;
        }
        if (t8 == null) {
            return 1;
        }
        return t7.compareTo(t8);
    }

    public static final <T> int compareValuesBy(T t7, T t8, f6.l... selectors) {
        s.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t7, t8, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t7, T t8, f6.l[] lVarArr) {
        int compareValues;
        for (f6.l lVar : lVarArr) {
            compareValues = compareValues((Comparable) lVar.invoke(t7), (Comparable) lVar.invoke(t8));
            if (compareValues != 0) {
                return compareValues;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        j jVar = j.INSTANCE;
        s.checkNotNull(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    public static final <T> Comparator<T> nullsFirst(final Comparator<? super T> comparator) {
        s.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
                nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt = g.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
                return nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        s.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    public static final <T> Comparator<T> nullsLast(final Comparator<? super T> comparator) {
        s.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
                nullsLast$lambda$4$ComparisonsKt__ComparisonsKt = g.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
                return nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        s.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        k kVar = k.INSTANCE;
        s.checkNotNull(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    public static final <T> Comparator<T> reversed(Comparator<T> comparator) {
        s.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof l) {
            return (Comparator<T>) ((l) comparator).getComparator();
        }
        Comparator<T> comparator2 = j.INSTANCE;
        if (s.areEqual(comparator, comparator2)) {
            k kVar = k.INSTANCE;
            s.checkNotNull(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (s.areEqual(comparator, k.INSTANCE)) {
            s.checkNotNull(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new l(comparator);
        }
        return comparator2;
    }

    public static final <T> Comparator<T> then(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        s.checkNotNullParameter(comparator, "<this>");
        s.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int then$lambda$1$ComparisonsKt__ComparisonsKt;
                then$lambda$1$ComparisonsKt__ComparisonsKt = g.then$lambda$1$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
                return then$lambda$1$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        s.checkNotNullParameter(this_then, "$this_then");
        s.checkNotNullParameter(comparator, "$comparator");
        int compare = this_then.compare(obj, obj2);
        return compare != 0 ? compare : comparator.compare(obj, obj2);
    }

    private static final <T> Comparator<T> thenBy(Comparator<T> comparator, f6.l selector) {
        s.checkNotNullParameter(comparator, "<this>");
        s.checkNotNullParameter(selector, "selector");
        return new e(comparator, selector);
    }

    private static final <T> Comparator<T> thenByDescending(Comparator<T> comparator, f6.l selector) {
        s.checkNotNullParameter(comparator, "<this>");
        s.checkNotNullParameter(selector, "selector");
        return new C0362g(comparator, selector);
    }

    private static final <T> Comparator<T> thenComparator(Comparator<T> comparator, p comparison) {
        s.checkNotNullParameter(comparator, "<this>");
        s.checkNotNullParameter(comparison, "comparison");
        return new i(comparator, comparison);
    }

    public static final <T> Comparator<T> thenDescending(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        s.checkNotNullParameter(comparator, "<this>");
        s.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt;
                thenDescending$lambda$2$ComparisonsKt__ComparisonsKt = g.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
                return thenDescending$lambda$2$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        s.checkNotNullParameter(this_thenDescending, "$this_thenDescending");
        s.checkNotNullParameter(comparator, "$comparator");
        int compare = this_thenDescending.compare(obj, obj2);
        return compare != 0 ? compare : comparator.compare(obj2, obj);
    }

    private static final <T, K> Comparator<T> compareByDescending(Comparator<? super K> comparator, f6.l selector) {
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        return new d(comparator, selector);
    }

    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        Comparator naturalOrder;
        naturalOrder = naturalOrder();
        return nullsFirst(naturalOrder);
    }

    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        Comparator naturalOrder;
        naturalOrder = naturalOrder();
        return nullsLast(naturalOrder);
    }

    private static final <T, K> Comparator<T> thenBy(Comparator<T> comparator, Comparator<? super K> comparator2, f6.l selector) {
        s.checkNotNullParameter(comparator, "<this>");
        s.checkNotNullParameter(comparator2, "comparator");
        s.checkNotNullParameter(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    private static final <T, K> Comparator<T> thenByDescending(Comparator<T> comparator, Comparator<? super K> comparator2, f6.l selector) {
        s.checkNotNullParameter(comparator, "<this>");
        s.checkNotNullParameter(comparator2, "comparator");
        s.checkNotNullParameter(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    private static final <T> Comparator<T> compareBy(f6.l selector) {
        s.checkNotNullParameter(selector, "selector");
        return new a(selector);
    }

    private static final <T> int compareValuesBy(T t7, T t8, f6.l selector) {
        int compareValues;
        s.checkNotNullParameter(selector, "selector");
        compareValues = compareValues((Comparable) selector.invoke(t7), (Comparable) selector.invoke(t8));
        return compareValues;
    }

    private static final <T, K> Comparator<T> compareBy(Comparator<? super K> comparator, f6.l selector) {
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        return new b(comparator, selector);
    }

    private static final <T, K> int compareValuesBy(T t7, T t8, Comparator<? super K> comparator, f6.l selector) {
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(t7), selector.invoke(t8));
    }
}
