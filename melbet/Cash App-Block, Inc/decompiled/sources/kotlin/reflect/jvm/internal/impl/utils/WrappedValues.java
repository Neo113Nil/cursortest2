package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes9.dex */
public class WrappedValues {
    public static final AnonymousClass1 NULL_VALUE = new AnonymousClass1();
    public static volatile boolean throwWrappedProcessCanceledException = false;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    public final class ThrowableWrapper {
        public final Throwable throwable;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format2);
            }
        }

        public ThrowableWrapper(Throwable th) {
            if (th != null) {
                this.throwable = th;
            } else {
                $$$reportNull$$$0(0);
                throw null;
            }
        }

        public final String toString() {
            return this.throwable.toString();
        }
    }

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    public static <V> Object escapeNull(V v) {
        return v == null ? NULL_VALUE : v;
    }

    public static Object escapeThrowable(Throwable th) {
        if (th != null) {
            return new ThrowableWrapper(th);
        }
        $$$reportNull$$$0(3);
        throw null;
    }

    public static <V> V unescapeExceptionOrNull(Object obj) {
        if (obj != null) {
            return (V) unescapeNull(unescapeThrowable(obj));
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeNull(Object obj) {
        if (obj == 0) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (obj == NULL_VALUE) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeThrowable(Object obj) {
        if (!(obj instanceof ThrowableWrapper)) {
            return obj;
        }
        Throwable th = ((ThrowableWrapper) obj).throwable;
        if (th == null) {
            ThrowableWrapper.$$$reportNull$$$0(1);
            throw null;
        }
        if (throwWrappedProcessCanceledException && ExceptionUtilsKt.isProcessCanceledException(th)) {
            throw new WrappedProcessCanceledException(th);
        }
        throw ExceptionUtilsKt.rethrow(th);
    }
}
