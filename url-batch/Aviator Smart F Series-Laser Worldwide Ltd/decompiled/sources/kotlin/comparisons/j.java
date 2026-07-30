package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class j implements Comparator {
    public static final j INSTANCE = new j();

    private j() {
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return k.INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(Comparable<Object> a8, Comparable<Object> b8) {
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(b8, "b");
        return a8.compareTo(b8);
    }
}
