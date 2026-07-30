package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o0 {
    public static StringBuilder BRwzKIf41E4i(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void EcgxDIVH5in8(int i, tf0 tf0Var, p7 p7Var, tf0 tf0Var2, k1 k1Var) {
        th0.tmVwIGCQF4zR(tf0Var, p7Var, Integer.valueOf(i));
        th0.kpCQ9veP6n3I(tf0Var2, k1Var);
    }

    public static String OPXfSBeufaJ8(int i, String str, String str2) {
        return str + i + str2;
    }

    public static int PxuCJdSBwIXG(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static String QrzZRwfaDlRX(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static ClassCastException RAsUl2FVSrh6(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static void RfyTYNmI9Srp(int i, tf0 tf0Var, int i2, p7 p7Var) {
        tf0Var.JTxCbbCwomzt(Integer.valueOf(i));
        tf0Var.lS5Rgt96tfkO(p7Var, Integer.valueOf(i2));
    }

    public static /* synthetic */ void S2OOm9zPNm0h(AutoCloseable autoCloseable) {
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

    public static void S9EYkSpbGuxq(long j, StringBuilder sb, String str) {
        sb.append((Object) hl.OPXfSBeufaJ8(j));
        sb.append(str);
    }

    public static int TSizfFm2Yiuu(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void VhhvGxCb8gfr(hy1 hy1Var) {
        boolean isTerminated;
        if (hy1Var instanceof AutoCloseable) {
            hy1Var.close();
            return;
        }
        if (!(hy1Var instanceof ExecutorService)) {
            if (hy1Var instanceof TypedArray) {
                ((TypedArray) hy1Var).recycle();
                return;
            } else if (hy1Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) hy1Var).release();
                return;
            } else {
                if (!(hy1Var instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) hy1Var).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) hy1Var;
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

    public static void XL4ISE6Oc65B(int i, int i2, int i3, int i4, int i5) {
        ki0.TSizfFm2Yiuu(i);
        ki0.TSizfFm2Yiuu(i2);
        ki0.TSizfFm2Yiuu(i3);
        ki0.TSizfFm2Yiuu(i4);
        ki0.TSizfFm2Yiuu(i5);
    }

    public static int Y1f8riQaR6yg(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static /* synthetic */ void ZbWwgt3aGe7A(Object obj) {
        if (obj == null) {
            return;
        }
        u9.VhhvGxCb8gfr();
    }

    public static tm a92UlCVFR9N8(String str) {
        ep0.TSizfFm2Yiuu(str);
        return new tm();
    }

    public static String cpQdD2nAriOS(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String dgRBjINgWbAK(String str, String str2, char c) {
        return str + str2 + c;
    }

    public static int e9gEMXR7LXtO(dj2 dj2Var, int i, int i2) {
        return (dj2Var.hashCode() + i) * i2;
    }

    public static String gPXPFXrUH4XX(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static int lS5Rgt96tfkO(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static boolean pnx5pC0XzaCw(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        return bundle.containsKey(str2);
    }

    public static String r3s1LDPKFs1S(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String rtx2ld2ELZv4(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String wdg6QnbFHrFF(String str, int i) {
        return str + i;
    }

    public static String x50lh2ztY7Y5(String str, String str2, String str3) {
        return str + str2 + str3;
    }
}
