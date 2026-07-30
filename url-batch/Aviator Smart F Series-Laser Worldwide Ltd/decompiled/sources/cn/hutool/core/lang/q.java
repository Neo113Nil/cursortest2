package cn.hutool.core.lang;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.h1;
import java.util.Map;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class q {
    private static final String TEMPLATE_VALUE_MUST_BE_BETWEEN_AND = "The value must be between {} and {}.";

    private static String badIndexMsg(int i8, int i9, String str, Object... objArr) {
        if (i8 < 0) {
            return cn.hutool.core.text.l.format("{} ({}) must not be negative", cn.hutool.core.text.l.format(str, objArr), Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return cn.hutool.core.text.l.format("{} ({}) must be less than size ({})", cn.hutool.core.text.l.format(str, objArr), Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }

    public static <X extends Throwable> int checkBetween(int i8, int i9, int i10, Supplier<? extends X> supplier) {
        Object obj;
        if (i8 >= i9 && i8 <= i10) {
            return i8;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static int checkIndex(int i8, int i9) {
        return checkIndex(i8, i9, "[Assertion failed]", new Object[0]);
    }

    public static void equals(Object obj, Object obj2) {
        equals(obj, obj2, "({}) must be equals ({})", obj, obj2);
    }

    public static void isAssignable(Class<?> cls, Class<?> cls2) {
        isAssignable(cls, cls2, "{} is not assignable to {})", cls2, cls);
    }

    public static <X extends Throwable> void isFalse(boolean z7, Supplier<X> supplier) {
        Object obj;
        if (z7) {
            obj = supplier.get();
            throw ((Throwable) obj);
        }
    }

    public static <T> T isInstanceOf(Class<?> cls, T t7) {
        return (T) isInstanceOf(cls, t7, "Object [{}] is not instanceof [{}]", t7, cls);
    }

    public static <X extends Throwable> void isNull(Object obj, Supplier<X> supplier) {
        Object obj2;
        if (obj == null) {
            return;
        }
        obj2 = supplier.get();
        throw ((Throwable) obj2);
    }

    public static <X extends Throwable> void isTrue(boolean z7, Supplier<? extends X> supplier) {
        Object obj;
        if (z7) {
            return;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$checkBetween$11(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$checkBetween$12(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$checkBetween$13(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$equals$15(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$isFalse$1(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$isNull$2(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$isTrue$0(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$noNullElements$8(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notBlank$5(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notContain$6(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notEmpty$10(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notEmpty$4(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notEmpty$7(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notEmpty$9(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notEquals$14(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$notNull$3(String str, Object[] objArr) {
        return new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    public static <T, X extends Throwable> T[] noNullElements(T[] tArr, Supplier<X> supplier) {
        Object obj;
        if (!cn.hutool.core.util.h.hasNull(tArr)) {
            return tArr;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static <T extends CharSequence, X extends Throwable> T notBlank(T t7, Supplier<X> supplier) {
        Object obj;
        if (!cn.hutool.core.text.l.isBlank(t7)) {
            return t7;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static <T extends CharSequence, X extends Throwable> T notContain(CharSequence charSequence, T t7, Supplier<X> supplier) {
        Object obj;
        if (!cn.hutool.core.text.l.contains(charSequence, t7)) {
            return t7;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static <T extends CharSequence, X extends Throwable> T notEmpty(T t7, Supplier<X> supplier) {
        Object obj;
        if (!cn.hutool.core.text.l.isEmpty(t7)) {
            return t7;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static void notEquals(Object obj, Object obj2) {
        notEquals(obj, obj2, "({}) must be not equals ({})", obj, obj2);
    }

    public static <T, X extends Throwable> T notNull(T t7, Supplier<X> supplier) {
        Object obj;
        if (t7 != null) {
            return t7;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static void state(boolean z7, Supplier<String> supplier) {
        Object obj;
        if (z7) {
            return;
        }
        obj = supplier.get();
        throw new IllegalStateException((String) obj);
    }

    public static int checkBetween(int i8, int i9, int i10, final String str, final Object... objArr) {
        return checkBetween(i8, i9, i10, new Supplier() { // from class: cn.hutool.core.lang.a
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$checkBetween$11;
                lambda$checkBetween$11 = q.lambda$checkBetween$11(str, objArr);
                return lambda$checkBetween$11;
            }
        });
    }

    public static int checkIndex(int i8, int i9, String str, Object... objArr) {
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException(badIndexMsg(i8, i9, str, objArr));
        }
        return i8;
    }

    public static void equals(Object obj, Object obj2, final String str, final Object... objArr) {
        equals(obj, obj2, new Supplier() { // from class: cn.hutool.core.lang.o
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$equals$15;
                lambda$equals$15 = q.lambda$equals$15(str, objArr);
                return lambda$equals$15;
            }
        });
    }

    public static void isAssignable(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        notNull(cls, "Type to check against must not be null", new Object[0]);
        if (cls2 == null || !cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
        }
    }

    public static void isFalse(boolean z7, final String str, final Object... objArr) {
        isFalse(z7, new Supplier() { // from class: cn.hutool.core.lang.g
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$isFalse$1;
                lambda$isFalse$1 = q.lambda$isFalse$1(str, objArr);
                return lambda$isFalse$1;
            }
        });
    }

    public static <T> T isInstanceOf(Class<?> cls, T t7, String str, Object... objArr) {
        notNull(cls, "Type to check against must not be null", new Object[0]);
        if (cls.isInstance(t7)) {
            return t7;
        }
        throw new IllegalArgumentException(cn.hutool.core.text.l.format(str, objArr));
    }

    public static void isNull(Object obj, final String str, final Object... objArr) {
        isNull(obj, new Supplier() { // from class: cn.hutool.core.lang.c
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$isNull$2;
                lambda$isNull$2 = q.lambda$isNull$2(str, objArr);
                return lambda$isNull$2;
            }
        });
    }

    public static void isTrue(boolean z7, final String str, final Object... objArr) {
        isTrue(z7, new Supplier() { // from class: cn.hutool.core.lang.j
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$isTrue$0;
                lambda$isTrue$0 = q.lambda$isTrue$0(str, objArr);
                return lambda$isTrue$0;
            }
        });
    }

    public static void notEquals(Object obj, Object obj2, final String str, final Object... objArr) {
        notEquals(obj, obj2, new Supplier() { // from class: cn.hutool.core.lang.b
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notEquals$14;
                lambda$notEquals$14 = q.lambda$notEquals$14(str, objArr);
                return lambda$notEquals$14;
            }
        });
    }

    public static <T> T notNull(T t7, final String str, final Object... objArr) {
        return (T) notNull(t7, new Supplier() { // from class: cn.hutool.core.lang.m
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notNull$3;
                lambda$notNull$3 = q.lambda$notNull$3(str, objArr);
                return lambda$notNull$3;
            }
        });
    }

    public static void state(boolean z7, String str, Object... objArr) {
        if (!z7) {
            throw new IllegalStateException(cn.hutool.core.text.l.format(str, objArr));
        }
    }

    public static int checkBetween(int i8, int i9, int i10) {
        return checkBetween(i8, i9, i10, TEMPLATE_VALUE_MUST_BE_BETWEEN_AND, Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static <X extends Throwable> void equals(Object obj, Object obj2, Supplier<X> supplier) {
        Object obj3;
        if (cn.hutool.core.util.e0.notEqual(obj, obj2)) {
            obj3 = supplier.get();
            throw ((Throwable) obj3);
        }
    }

    public static void isFalse(boolean z7) {
        isFalse(z7, "[Assertion failed] - this expression must be false", new Object[0]);
    }

    public static void isNull(Object obj) {
        isNull(obj, "[Assertion failed] - the object argument must be null", new Object[0]);
    }

    public static void isTrue(boolean z7) {
        isTrue(z7, "[Assertion failed] - this expression must be true", new Object[0]);
    }

    public static <T> T[] noNullElements(T[] tArr, final String str, final Object... objArr) {
        return (T[]) noNullElements(tArr, new Supplier() { // from class: cn.hutool.core.lang.f
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$noNullElements$8;
                lambda$noNullElements$8 = q.lambda$noNullElements$8(str, objArr);
                return lambda$noNullElements$8;
            }
        });
    }

    public static <T extends CharSequence> T notBlank(T t7, final String str, final Object... objArr) {
        return (T) notBlank(t7, new Supplier() { // from class: cn.hutool.core.lang.k
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notBlank$5;
                lambda$notBlank$5 = q.lambda$notBlank$5(str, objArr);
                return lambda$notBlank$5;
            }
        });
    }

    public static String notContain(String str, String str2, final String str3, final Object... objArr) {
        return (String) notContain(str, str2, new Supplier() { // from class: cn.hutool.core.lang.h
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notContain$6;
                lambda$notContain$6 = q.lambda$notContain$6(str3, objArr);
                return lambda$notContain$6;
            }
        });
    }

    public static <T extends CharSequence> T notEmpty(T t7, final String str, final Object... objArr) {
        return (T) notEmpty(t7, new Supplier() { // from class: cn.hutool.core.lang.d
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notEmpty$4;
                lambda$notEmpty$4 = q.lambda$notEmpty$4(str, objArr);
                return lambda$notEmpty$4;
            }
        });
    }

    public static <X extends Throwable> void notEquals(Object obj, Object obj2, Supplier<X> supplier) {
        Object obj3;
        if (cn.hutool.core.util.e0.equals(obj, obj2)) {
            obj3 = supplier.get();
            throw ((Throwable) obj3);
        }
    }

    public static <T> T notNull(T t7) {
        return (T) notNull(t7, "[Assertion failed] - this argument is required; it must not be null", new Object[0]);
    }

    public static void state(boolean z7) {
        state(z7, "[Assertion failed] - this state invariant must be true", new Object[0]);
    }

    public static <X extends Throwable> long checkBetween(long j8, long j9, long j10, Supplier<? extends X> supplier) {
        Object obj;
        if (j8 >= j9 && j8 <= j10) {
            return j8;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static <T> T[] noNullElements(T[] tArr) {
        return (T[]) noNullElements(tArr, "[Assertion failed] - this array must not contain any null elements", new Object[0]);
    }

    public static <T extends CharSequence> T notBlank(T t7) {
        return (T) notBlank(t7, "[Assertion failed] - this String argument must have text; it must not be null, empty, or blank", new Object[0]);
    }

    public static String notContain(String str, String str2) {
        return notContain(str, str2, "[Assertion failed] - this String argument must not contain the substring [{}]", str2);
    }

    public static <T extends CharSequence> T notEmpty(T t7) {
        return (T) notEmpty(t7, "[Assertion failed] - this String argument must have length; it must not be null or empty", new Object[0]);
    }

    public static long checkBetween(long j8, long j9, long j10, final String str, final Object... objArr) {
        return checkBetween(j8, j9, j10, new Supplier() { // from class: cn.hutool.core.lang.l
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$checkBetween$12;
                lambda$checkBetween$12 = q.lambda$checkBetween$12(str, objArr);
                return lambda$checkBetween$12;
            }
        });
    }

    public static <T, X extends Throwable> T[] notEmpty(T[] tArr, Supplier<X> supplier) {
        Object obj;
        if (!cn.hutool.core.util.h.isEmpty((Object[]) tArr)) {
            return tArr;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static long checkBetween(long j8, long j9, long j10) {
        return checkBetween(j8, j9, j10, TEMPLATE_VALUE_MUST_BE_BETWEEN_AND, Long.valueOf(j9), Long.valueOf(j10));
    }

    public static <X extends Throwable> double checkBetween(double d8, double d9, double d10, Supplier<? extends X> supplier) {
        Object obj;
        if (d8 >= d9 && d8 <= d10) {
            return d8;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static <T> T[] notEmpty(T[] tArr, final String str, final Object... objArr) {
        return (T[]) notEmpty(tArr, new Supplier() { // from class: cn.hutool.core.lang.e
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notEmpty$7;
                lambda$notEmpty$7 = q.lambda$notEmpty$7(str, objArr);
                return lambda$notEmpty$7;
            }
        });
    }

    public static double checkBetween(double d8, double d9, double d10, final String str, final Object... objArr) {
        return checkBetween(d8, d9, d10, new Supplier() { // from class: cn.hutool.core.lang.n
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$checkBetween$13;
                lambda$checkBetween$13 = q.lambda$checkBetween$13(str, objArr);
                return lambda$checkBetween$13;
            }
        });
    }

    public static <T> T[] notEmpty(T[] tArr) {
        return (T[]) notEmpty(tArr, "[Assertion failed] - this array must not be empty: it must contain at least 1 element", new Object[0]);
    }

    public static double checkBetween(double d8, double d9, double d10) {
        return checkBetween(d8, d9, d10, TEMPLATE_VALUE_MUST_BE_BETWEEN_AND, Double.valueOf(d9), Double.valueOf(d10));
    }

    public static <E, T extends Iterable<E>, X extends Throwable> T notEmpty(T t7, Supplier<X> supplier) {
        Object obj;
        if (!CollUtil.isEmpty((Iterable<?>) t7)) {
            return t7;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static Number checkBetween(Number number, Number number2, Number number3) {
        notNull(number);
        notNull(number2);
        notNull(number3);
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        double doubleValue3 = number3.doubleValue();
        if (doubleValue < doubleValue2 || doubleValue > doubleValue3) {
            throw new IllegalArgumentException(cn.hutool.core.text.l.format(TEMPLATE_VALUE_MUST_BE_BETWEEN_AND, number2, number3));
        }
        return number;
    }

    public static <E, T extends Iterable<E>> T notEmpty(T t7, final String str, final Object... objArr) {
        return (T) notEmpty(t7, new Supplier() { // from class: cn.hutool.core.lang.p
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notEmpty$9;
                lambda$notEmpty$9 = q.lambda$notEmpty$9(str, objArr);
                return lambda$notEmpty$9;
            }
        });
    }

    public static <E, T extends Iterable<E>> T notEmpty(T t7) {
        return (T) notEmpty(t7, "[Assertion failed] - this collection must not be empty: it must contain at least 1 element", new Object[0]);
    }

    public static <K, V, T extends Map<K, V>, X extends Throwable> T notEmpty(T t7, Supplier<X> supplier) {
        Object obj;
        if (!h1.isEmpty(t7)) {
            return t7;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public static <K, V, T extends Map<K, V>> T notEmpty(T t7, final String str, final Object... objArr) {
        return (T) notEmpty(t7, new Supplier() { // from class: cn.hutool.core.lang.i
            @Override // java.util.function.Supplier
            public final Object get() {
                IllegalArgumentException lambda$notEmpty$10;
                lambda$notEmpty$10 = q.lambda$notEmpty$10(str, objArr);
                return lambda$notEmpty$10;
            }
        });
    }

    public static <K, V, T extends Map<K, V>> T notEmpty(T t7) {
        return (T) notEmpty(t7, "[Assertion failed] - this map must not be empty; it must contain at least one entry", new Object[0]);
    }
}
