package kotlin.comparisons;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class NaturalOrderComparator implements Comparator {
    public static final NaturalOrderComparator INSTANCE = new NaturalOrderComparator();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return ReverseOrderComparator.INSTANCE;
    }
}
