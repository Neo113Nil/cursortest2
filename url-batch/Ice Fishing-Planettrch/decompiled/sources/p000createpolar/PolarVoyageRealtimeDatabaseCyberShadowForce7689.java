package p000createpolar;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class PolarVoyageRealtimeDatabaseCyberShadowForce7689 {
    public static int PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static void PolarVoyageBitmapVisionAuroraPixel4705(long j, StringBuilder sb, String str) {
        sb.append((Object) PolarVoyageContentResolverRogueSpeed9469.PolarVoyageStrictModeLegendEpic1532(j));
        sb.append(str);
    }

    public static /* synthetic */ void PolarVoyageDiffUtilTurboStrike5735(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
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

    public static int PolarVoyageKotlinBetaPulseBeta3653(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static /* synthetic */ void PolarVoyageTextInputEditTextNebulaHero6651(Object obj) {
        boolean isTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
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

    public static int PolarVoyageZipVortexCelestial6185(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }
}
