package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class l implements Comparator {
    private final Comparator<Object> comparator;

    public l(Comparator<Object> comparator) {
        s.checkNotNullParameter(comparator, "comparator");
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.comparator.compare(obj2, obj);
    }

    public final Comparator<Object> getComparator() {
        return this.comparator;
    }

    @Override // java.util.Comparator
    public final Comparator<Object> reversed() {
        return this.comparator;
    }
}
