package p000createpolar;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageThemeOverlayUltraInferno5971 implements ThreadFactory {
    public static final ThreadFactory PolarVoyageBitmapVisionAuroraPixel4705 = Executors.defaultThreadFactory();
    public final StrictMode.ThreadPolicy PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final AtomicLong PolarVoyageZipVortexCelestial6185 = new AtomicLong();

    public PolarVoyageThemeOverlayUltraInferno5971(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = PolarVoyageBitmapVisionAuroraPixel4705.newThread(new PolarVoyageMediaPlayerNebulaTurboLegend3509(13, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.PolarVoyageMotionLayoutTransitionHeroVision4068 + " Thread #" + this.PolarVoyageZipVortexCelestial6185.getAndIncrement());
        return newThread;
    }
}
