package kotlin.jvm.internal;

import A.AbstractC0017m;
import android.net.Uri;
import java.util.Arrays;
import y2.C1324D;

/* loaded from: classes.dex */
public class Intrinsics {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Uri uri) {
        if (uri != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Uri.parse(this) must not be null");
        f(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = Intrinsics.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            f(nullPointerException, Intrinsics.class.getName());
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static int e(int i2, int i4) {
        if (i2 < i4) {
            return -1;
        }
        return i2 == i4 ? 0 : 1;
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i2 = i4;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void g(String str) {
        C1324D c1324d = new C1324D(AbstractC0017m.j("lateinit property ", str, " has not been initialized"));
        f(c1324d, Intrinsics.class.getName());
        throw c1324d;
    }
}
