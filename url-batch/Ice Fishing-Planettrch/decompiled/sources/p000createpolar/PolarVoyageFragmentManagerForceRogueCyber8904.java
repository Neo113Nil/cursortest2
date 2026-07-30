package p000createpolar;

import java.net.URL;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentManagerForceRogueCyber8904 {
    public Object PolarVoyageKotlinBetaPulseBeta3653;
    public long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageFragmentManagerForceRogueCyber8904(int i, URL url, long j) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = url;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j;
    }

    public synchronized void PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.PolarVoyageZipVortexCelestial6185 = 0;
            }
            return;
        }
        this.PolarVoyageZipVortexCelestial6185++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                ((PolarVoyageJobIntentServiceFusionMax9020) this.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageZipVortexCelestial6185.getClass();
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = System.currentTimeMillis() + min;
            }
            double pow = Math.pow(2.0d, this.PolarVoyageZipVortexCelestial6185);
            ((PolarVoyageJobIntentServiceFusionMax9020) this.PolarVoyageKotlinBetaPulseBeta3653).getClass();
            min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            ((PolarVoyageJobIntentServiceFusionMax9020) this.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageZipVortexCelestial6185.getClass();
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = System.currentTimeMillis() + min;
        }
        return;
    }

    public synchronized boolean PolarVoyageZipVortexCelestial6185() {
        boolean z;
        if (this.PolarVoyageZipVortexCelestial6185 != 0) {
            ((PolarVoyageJobIntentServiceFusionMax9020) this.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageZipVortexCelestial6185.getClass();
            z = System.currentTimeMillis() > this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        return z;
    }
}
