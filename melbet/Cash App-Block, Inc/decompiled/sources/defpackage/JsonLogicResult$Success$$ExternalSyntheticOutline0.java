package defpackage;

import android.content.res.TypedArray;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract /* synthetic */ class JsonLogicResult$Success$$ExternalSyntheticOutline0 implements CallbackToFutureAdapter$Resolver {
    public static /* synthetic */ void m(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static int m(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int m(int i, int i2, Set set) {
        return (set.hashCode() + i) * i2;
    }

    public static int m(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static Object m(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String m(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String m(float f, String str, String str2) {
        return str + f + str2;
    }

    public static String m(int i, String str) {
        return str + i;
    }

    public static String m(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(String str, int i, char c) {
        return str + i + c;
    }

    public static String m(String str, String str2, Object obj) {
        return str + obj + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String m(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m2m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m3m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static Ref$ObjectRef m(Object obj) {
        SafeTrace.throwOnFailure(obj);
        return new Ref$ObjectRef();
    }

    public static int m(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m4m(Object obj) {
        if (obj == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }
}
