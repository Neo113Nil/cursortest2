package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class k implements Comparator {
    public static final k INSTANCE = new k();

    private k() {
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return j.INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(Comparable<Object> a8, Comparable<Object> b8) {
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(b8, "b");
        return b8.compareTo(a8);
    }
}
