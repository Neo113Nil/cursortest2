package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
class i extends h {
    public static final <T> T maxOf(T t7, T t8, T t9, Comparator<? super T> comparator) {
        s.checkNotNullParameter(comparator, "comparator");
        return (T) maxOf(t7, maxOf(t8, t9, comparator), comparator);
    }

    public static final <T> T minOf(T t7, T t8, T t9, Comparator<? super T> comparator) {
        s.checkNotNullParameter(comparator, "comparator");
        return (T) minOf(t7, minOf(t8, t9, comparator), comparator);
    }

    public static final <T> T maxOf(T t7, T t8, Comparator<? super T> comparator) {
        s.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t7, t8) >= 0 ? t7 : t8;
    }

    public static final <T> T minOf(T t7, T t8, Comparator<? super T> comparator) {
        s.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t7, t8) <= 0 ? t7 : t8;
    }

    public static final <T> T maxOf(T t7, T[] other, Comparator<? super T> comparator) {
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(comparator, "comparator");
        for (T t8 : other) {
            if (comparator.compare(t7, t8) < 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static final <T> T minOf(T t7, T[] other, Comparator<? super T> comparator) {
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(comparator, "comparator");
        for (T t8 : other) {
            if (comparator.compare(t7, t8) > 0) {
                t7 = t8;
            }
        }
        return t7;
    }
}
