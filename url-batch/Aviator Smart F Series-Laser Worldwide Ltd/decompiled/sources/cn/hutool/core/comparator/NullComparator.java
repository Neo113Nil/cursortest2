package cn.hutool.core.comparator;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public class NullComparator<T> implements Comparator<T>, Serializable {
    private static final long serialVersionUID = 1;
    protected final Comparator<T> comparator;
    protected final boolean nullGreater;

    /* JADX WARN: Multi-variable type inference failed */
    public NullComparator(boolean z7, Comparator<? super T> comparator) {
        this.nullGreater = z7;
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t7, T t8) {
        if (t7 == t8) {
            return 0;
        }
        return t7 == null ? this.nullGreater ? 1 : -1 : t8 == null ? this.nullGreater ? -1 : 1 : doCompare(t7, t8);
    }

    protected int doCompare(T t7, T t8) {
        Comparator<T> comparator = this.comparator;
        if (comparator != null) {
            return comparator.compare(t7, t8);
        }
        if ((t7 instanceof Comparable) && (t8 instanceof Comparable)) {
            return ((Comparable) t7).compareTo(t8);
        }
        return 0;
    }

    @Override // java.util.Comparator
    public Comparator<T> thenComparing(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator);
        boolean z7 = this.nullGreater;
        Comparator<T> comparator2 = this.comparator;
        if (comparator2 != null) {
            comparator = comparator2.thenComparing(comparator);
        }
        return new NullComparator(z7, comparator);
    }
}
