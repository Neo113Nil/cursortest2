package kotlin.jvm.internal;

import hd.g0;
import java.util.Arrays;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class Intrinsics {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i3, int i10) {
        if (i3 < i10) {
            return -1;
        }
        return i3 == i10 ? 0 : 1;
    }

    public static int c(long j, long j3) {
        if (j < j3) {
            return -1;
        }
        return j == j3 ? 0 : 1;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
        e(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = Intrinsics.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            e(nullPointerException, Intrinsics.class.getName());
            throw nullPointerException;
        }
    }

    public static void d() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void e(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i3 = i10;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void f(String str) {
        g0 g0Var = new g0(l.g("lateinit property ", str, " has not been initialized"));
        e(g0Var, Intrinsics.class.getName());
        throw g0Var;
    }
}
