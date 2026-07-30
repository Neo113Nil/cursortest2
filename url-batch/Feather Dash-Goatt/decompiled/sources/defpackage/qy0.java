package defpackage;

import android.content.res.TypedArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class qy0 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static int b(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int c(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int d(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int e(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int f(th1 th1Var, int i, int i2) {
        return (th1Var.hashCode() + i) * i2;
    }

    public static kc0 g(String str) {
        o80.c(str);
        return new kc0();
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String i(int i, String str) {
        return str + i;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder n(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static HashMap o(Class cls, ga gaVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, gaVar);
        return hashMap;
    }

    public static Map p(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void q(int i, int i2, int i3, int i4, int i5) {
        xa0.a(i);
        xa0.a(i2);
        xa0.a(i3);
        xa0.a(i4);
        xa0.a(i5);
    }

    public static void r(long j, StringBuilder sb, String str) {
        sb.append((Object) hi.i(j));
        sb.append(str);
    }

    public static void s(i8 i8Var, long j) {
        i8Var.g().i();
        i8Var.v(j);
    }

    public static /* synthetic */ void t(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (!(autoCloseable instanceof TypedArray)) {
                throw new IllegalArgumentException();
            }
            ((TypedArray) autoCloseable).recycle();
            return;
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

    public static /* synthetic */ void u(Object obj) {
        if (obj == null) {
            return;
        }
        af.c();
    }

    public static /* synthetic */ int v(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] w(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
