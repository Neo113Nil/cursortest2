package cn.hutool.core.comparator;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

/* loaded from: classes.dex */
public class d {
    public static <T> int compare(T t7, T t8, Comparator<T> comparator) {
        return comparator == null ? compare((Comparable) t7, (Comparable) t8) : comparator.compare(t7, t8);
    }

    public static <T, U> Comparator<T> comparingIndexed(Function<? super T, ? extends U> function, U... uArr) {
        return comparingIndexed(function, false, uArr);
    }

    public static <T> Comparator<T> comparingPinyin(Function<T, String> function) {
        return comparingPinyin(function, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$comparingIndexed$2(e eVar, Function function, Object obj, Object obj2) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function.apply(obj2);
        return eVar.compare(apply, apply2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$comparingPinyin$0(PinyinComparator pinyinComparator, Function function, Object obj, Object obj2) {
        Object apply;
        Object apply2;
        apply = function.apply(obj2);
        apply2 = function.apply(obj);
        return pinyinComparator.compare((String) apply, (String) apply2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$comparingPinyin$1(PinyinComparator pinyinComparator, Function function, Object obj, Object obj2) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function.apply(obj2);
        return pinyinComparator.compare((String) apply, (String) apply2);
    }

    public static <E extends Comparable<? super E>> Comparator<E> naturalComparator() {
        return ComparableComparator.INSTANCE;
    }

    public static <T, U> Comparator<T> comparingIndexed(final Function<? super T, ? extends U> function, boolean z7, U... uArr) {
        Objects.requireNonNull(function);
        final e eVar = new e(z7, uArr);
        return new Comparator() { // from class: cn.hutool.core.comparator.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$comparingIndexed$2;
                lambda$comparingIndexed$2 = d.lambda$comparingIndexed$2(e.this, function, obj, obj2);
                return lambda$comparingIndexed$2;
            }
        };
    }

    public static <T> Comparator<T> comparingPinyin(final Function<T, String> function, boolean z7) {
        Objects.requireNonNull(function);
        final PinyinComparator pinyinComparator = new PinyinComparator();
        return z7 ? new Comparator() { // from class: cn.hutool.core.comparator.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$comparingPinyin$0;
                lambda$comparingPinyin$0 = d.lambda$comparingPinyin$0(PinyinComparator.this, function, obj, obj2);
                return lambda$comparingPinyin$0;
            }
        } : new Comparator() { // from class: cn.hutool.core.comparator.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$comparingPinyin$1;
                lambda$comparingPinyin$1 = d.lambda$comparingPinyin$1(PinyinComparator.this, function, obj, obj2);
                return lambda$comparingPinyin$1;
            }
        };
    }

    public static <T extends Comparable<? super T>> int compare(T t7, T t8) {
        return compare((Comparable) t7, (Comparable) t8, false);
    }

    public static <T extends Comparable<? super T>> int compare(T t7, T t8, boolean z7) {
        if (t7 == t8) {
            return 0;
        }
        if (t7 == null) {
            return z7 ? 1 : -1;
        }
        if (t8 == null) {
            return z7 ? -1 : 1;
        }
        return t7.compareTo(t8);
    }

    public static <T> int compare(T t7, T t8, boolean z7) {
        if (t7 == t8) {
            return 0;
        }
        if (t7 == null) {
            return z7 ? 1 : -1;
        }
        if (t8 == null) {
            return z7 ? -1 : 1;
        }
        if ((t7 instanceof Comparable) && (t8 instanceof Comparable)) {
            return ((Comparable) t7).compareTo(t8);
        }
        if (t7.equals(t8)) {
            return 0;
        }
        int compare = Integer.compare(t7.hashCode(), t8.hashCode());
        return compare == 0 ? compare(t7.toString(), t8.toString()) : compare;
    }
}
