package kotlin.comparisons;

import java.util.Comparator;

/* loaded from: classes7.dex */
public final class ReverseOrderComparator implements Comparator {
    public static final ReverseOrderComparator INSTANCE = new ReverseOrderComparator();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return NaturalOrderComparator.INSTANCE;
    }
}
