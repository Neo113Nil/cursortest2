package p000createpolar;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageProGuardPrimeUltraSpectra1243 implements ThreadFactory {
    public final /* synthetic */ boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ String PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageProGuardPrimeUltraSpectra1243(String str, boolean z) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.PolarVoyageZipVortexCelestial6185);
        thread.setDaemon(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        return thread;
    }
}
