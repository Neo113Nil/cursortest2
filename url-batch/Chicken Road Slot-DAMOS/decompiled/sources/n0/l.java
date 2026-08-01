package n0;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static final boolean a(int i3) {
        return i3 == 3 || i3 == 4 || i3 == 6;
    }

    public static int b(float f3, int i3, int i10) {
        return (Float.hashCode(f3) + i3) * i10;
    }

    public static int c(int i3, int i10, long j) {
        return (Long.hashCode(j) + i3) * i10;
    }

    public static int d(int i3, int i10, boolean z10) {
        return (Boolean.hashCode(z10) + i3) * i10;
    }

    public static ClassCastException e(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String f(int i3, String str, String str2) {
        return str + i3 + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder i(int i3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i3);
        sb2.append(str2);
        return sb2;
    }

    public static void j(int i3, int i10, int i11, int i12, int i13) {
        cf.c.e(i3);
        cf.c.e(i10);
        cf.c.e(i11);
        cf.c.e(i12);
        cf.c.e(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(i5.c cVar) {
        boolean isTerminated;
        if (cVar instanceof AutoCloseable) {
            cVar.close();
            return;
        }
        if (!(cVar instanceof ExecutorService)) {
            if (cVar instanceof TypedArray) {
                ((TypedArray) cVar).recycle();
                return;
            } else if (cVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cVar).release();
                return;
            } else {
                if (!(cVar instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) cVar).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cVar;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z10 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    executorService.shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static void l(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static /* synthetic */ String m(int i3) {
        switch (i3) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "UNMETERED";
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return "NOT_ROAMING";
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "METERED";
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String n(int i3) {
        switch (i3) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "SUCCEEDED";
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return "FAILED";
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "BLOCKED";
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
