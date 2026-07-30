package j6;

/* loaded from: classes4.dex */
class u {
    public static final void checkStepIsPositive(boolean z7, Number step) {
        kotlin.jvm.internal.s.checkNotNullParameter(step, "step");
        if (z7) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    private static final <T, R extends h & Iterable<? extends T>> boolean contains(R r8, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(r8, "<this>");
        return t7 != null && r8.contains((Comparable) t7);
    }

    public static final <T extends Comparable<? super T>> h rangeTo(T t7, T that) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(that, "that");
        return new j(t7, that);
    }

    public static final <T extends Comparable<? super T>> s rangeUntil(T t7, T that) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(that, "that");
        return new i(t7, that);
    }

    private static final <T, R extends s & Iterable<? extends T>> boolean contains(R r8, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(r8, "<this>");
        return t7 != null && r8.contains((Comparable) t7);
    }

    public static final g rangeTo(double d8, double d9) {
        return new e(d8, d9);
    }

    public static final s rangeUntil(double d8, double d9) {
        return new q(d8, d9);
    }

    public static final g rangeTo(float f8, float f9) {
        return new f(f8, f9);
    }

    public static final s rangeUntil(float f8, float f9) {
        return new r(f8, f9);
    }
}
