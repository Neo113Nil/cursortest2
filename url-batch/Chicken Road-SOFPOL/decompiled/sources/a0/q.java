package a0;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static int a(float f6, int i, int i8) {
        return (Float.hashCode(f6) + i) * i8;
    }

    public static int b(int i, int i8, int i9) {
        return (Integer.hashCode(i) + i8) * i9;
    }

    public static int c(int i, int i8, long j7) {
        return (Long.hashCode(j7) + i) * i8;
    }

    public static int d(int i, int i8, boolean z3) {
        return (Boolean.hashCode(z3) + i) * i8;
    }

    public static int e(g2.i0 i0Var, int i, int i8) {
        return (i0Var.hashCode() + i) * i8;
    }

    public static a5.c f(String str) {
        t1.a.c(str);
        return new a5.c();
    }

    public static ClassCastException g(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String h(String str, int i) {
        return str + i;
    }

    public static String i(String str, int i, String str2, int i8) {
        return str + i + str2 + i8;
    }

    public static String j(StringBuilder sb, float f6, char c8) {
        sb.append(f6);
        sb.append(c8);
        return sb.toString();
    }

    public static String k(StringBuilder sb, int i, char c8) {
        sb.append(i);
        sb.append(c8);
        return sb.toString();
    }

    public static StringBuilder l(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void m(int i, int i8, int i9, int i10, int i11) {
        h0.a.c(i);
        h0.a.c(i8);
        h0.a.c(i9);
        h0.a.c(i10);
        h0.a.c(i11);
    }

    public static void n(int i, m0.s sVar, int i8, w1.g gVar) {
        sVar.f0(Integer.valueOf(i));
        sVar.b(Integer.valueOf(i8), gVar);
    }

    public static void o(long j7, StringBuilder sb, String str) {
        sb.append((Object) f1.s.i(j7));
        sb.append(str);
    }

    public static /* synthetic */ void p(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z3 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z3) {
                    executorService.shutdownNow();
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return "LEFT";
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return "TOP";
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case x.v0.f8304b /* 9 */:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
