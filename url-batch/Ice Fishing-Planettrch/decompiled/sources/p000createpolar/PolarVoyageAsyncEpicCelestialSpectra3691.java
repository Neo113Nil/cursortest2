package p000createpolar;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAsyncEpicCelestialSpectra3691 implements ThreadFactory {
    public final ThreadFactory PolarVoyageMotionLayoutTransitionHeroVision4068 = Executors.defaultThreadFactory();
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAsyncEpicCelestialSpectra3691(String str) {
        this.PolarVoyageZipVortexCelestial6185 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.PolarVoyageMotionLayoutTransitionHeroVision4068.newThread(new PolarVoyageLooperThreadNovaSolar2749(runnable, 2));
        newThread.setName(this.PolarVoyageZipVortexCelestial6185);
        return newThread;
    }
}
