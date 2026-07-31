package Z1;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Uri uri) {
        if (uri != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Uri.parse(this) must not be null");
        i(illegalStateException, i.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        i(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        i(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        i(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = i.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            i(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static int g(int i3, int i4) {
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    public static final L1.q h(Object[] objArr) {
        f(objArr, "array");
        return new L1.q(objArr);
    }

    public static void i(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i3 = i4;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void j(String str) {
        L1.f fVar = new L1.f("lateinit property " + str + " has not been initialized");
        i(fVar, i.class.getName());
        throw fVar;
    }
}
