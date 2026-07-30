package p000createpolar;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageThreadInfernoVisionHero2526 implements Executor {
    public static final Logger PolarVoyageCameraPixelBlaze2629 = Logger.getLogger(PolarVoyageThreadInfernoVisionHero2526.class.getName());
    public final Executor PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final ArrayDeque PolarVoyageStrictModeLegendEpic1532 = new ArrayDeque();
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1;
    public long PolarVoyageBottomSheetOmegaNeo1907 = 0;
    public final PolarVoyageFaceDetectionPrimeUltraPhoenix9679 PolarVoyageViewRogueMaster4778 = new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(this);

    public PolarVoyageThreadInfernoVisionHero2526(Executor executor) {
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(executor);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(runnable);
        synchronized (this.PolarVoyageStrictModeLegendEpic1532) {
            int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (i != 4 && i != 3) {
                long j = this.PolarVoyageBottomSheetOmegaNeo1907;
                boolean z = true;
                PolarVoyageLooperThreadNovaSolar2749 polarVoyageLooperThreadNovaSolar2749 = new PolarVoyageLooperThreadNovaSolar2749(runnable, 1);
                this.PolarVoyageStrictModeLegendEpic1532.add(polarVoyageLooperThreadNovaSolar2749);
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 2;
                try {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485.execute(this.PolarVoyageViewRogueMaster4778);
                    if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != 2) {
                        return;
                    }
                    synchronized (this.PolarVoyageStrictModeLegendEpic1532) {
                        try {
                            if (this.PolarVoyageBottomSheetOmegaNeo1907 == j && this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == 2) {
                                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.PolarVoyageStrictModeLegendEpic1532) {
                        try {
                            int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                            if ((i2 != 1 && i2 != 2) || !this.PolarVoyageStrictModeLegendEpic1532.removeLastOccurrence(polarVoyageLooperThreadNovaSolar2749)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.PolarVoyageStrictModeLegendEpic1532.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + "}";
    }
}
