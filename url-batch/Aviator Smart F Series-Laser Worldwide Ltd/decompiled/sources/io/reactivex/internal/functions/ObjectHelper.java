package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* loaded from: classes2.dex */
public final class ObjectHelper {
    static final BiPredicate<Object, Object> EQUALS = new BiObjectPredicate();

    static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        BiObjectPredicate() {
        }

        @Override // io.reactivex.functions.BiPredicate
        public boolean test(Object obj, Object obj2) {
            return ObjectHelper.equals(obj, obj2);
        }
    }

    private ObjectHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static int compare(int i8, int i9) {
        if (i8 < i9) {
            return -1;
        }
        return i8 > i9 ? 1 : 0;
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> BiPredicate<T, T> equalsPredicate() {
        return (BiPredicate<T, T>) EQUALS;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }

    public static int verifyPositive(int i8, String str) {
        if (i8 > 0) {
            return i8;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i8);
    }

    public static int compare(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 > j9 ? 1 : 0;
    }

    @Deprecated
    public static long requireNonNull(long j8, String str) {
        throw new InternalError("Null check on a primitive: " + str);
    }

    public static long verifyPositive(long j8, String str) {
        if (j8 > 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j8);
    }
}
