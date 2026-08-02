package kotlin.comparisons;

/* loaded from: classes.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    public static Comparable maxOf(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static Comparable minOf(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }

    public static int maxOf(int i, int... iArr) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }
}
