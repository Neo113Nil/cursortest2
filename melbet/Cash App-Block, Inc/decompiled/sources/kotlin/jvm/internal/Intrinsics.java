package kotlin.jvm.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes.dex */
public class Intrinsics {
    public static boolean areEqual(Double d, Double d2) {
        return d == null ? d2 == null : d2 != null && d.doubleValue() == d2.doubleValue();
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(Recorder$$ExternalSyntheticOutline2.m$1(str, " must not be null"));
        sanitizeStackTrace(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        m.append(str);
        NullPointerException nullPointerException = new NullPointerException(m.toString());
        sanitizeStackTrace(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void sanitizeStackTrace(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String stringPlus(Object obj, String str) {
        return str + obj;
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("lateinit property ", str, " has not been initialized"));
        sanitizeStackTrace(uninitializedPropertyAccessException, Intrinsics.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean areEqual(Double d) {
        return d != null && d.doubleValue() == 0.0d;
    }

    public static boolean areEqual(Float f, Float f2) {
        return f == null ? f2 == null : f2 != null && f.floatValue() == f2.floatValue();
    }

    public static boolean areEqual(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean areEqual(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }
}
