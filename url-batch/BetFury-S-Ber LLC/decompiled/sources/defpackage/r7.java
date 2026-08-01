package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r7 {
    public static String a(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String b(String str, int i) {
        return str + i;
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String d(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(eb0 eb0Var) {
        boolean isTerminated;
        if (eb0Var instanceof AutoCloseable) {
            eb0Var.close();
            return;
        }
        if (!(eb0Var instanceof ExecutorService)) {
            if (eb0Var instanceof TypedArray) {
                ((TypedArray) eb0Var).recycle();
                return;
            } else if (eb0Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) eb0Var).release();
                return;
            } else {
                if (!(eb0Var instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) eb0Var).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) eb0Var;
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

    public static /* synthetic */ void f(AutoCloseable autoCloseable) {
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

    public static /* synthetic */ void g(Object obj) {
        if (obj == null) {
            return;
        }
        s9.c();
    }
}
