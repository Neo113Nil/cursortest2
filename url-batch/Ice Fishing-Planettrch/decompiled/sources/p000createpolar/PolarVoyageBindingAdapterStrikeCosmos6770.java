package p000createpolar;

import android.os.SystemClock;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBindingAdapterStrikeCosmos6770 {
    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageBindingAdapterStrikeCosmos6770() {
        this(PolarVoyageVelocityTrackerPhantomTitaniumStrike2970.PolarVoyageZipVortexCelestial6185);
    }

    public final synchronized boolean PolarVoyageKotlinBetaPulseBeta3653() {
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return false;
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        if (j <= 0) {
            return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        this.PolarVoyageZipVortexCelestial6185.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            PolarVoyageZipVortexCelestial6185();
        } else {
            boolean z = false;
            while (!this.PolarVoyageMotionLayoutTransitionHeroVision4068 && elapsedRealtime < j2) {
                try {
                    this.PolarVoyageZipVortexCelestial6185.getClass();
                    wait(j2 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.PolarVoyageZipVortexCelestial6185.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final synchronized void PolarVoyageZipVortexCelestial6185() {
        boolean z = false;
        while (!this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            try {
                this.PolarVoyageZipVortexCelestial6185.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public PolarVoyageBindingAdapterStrikeCosmos6770(PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 polarVoyageVelocityTrackerPhantomTitaniumStrike2970) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970;
    }
}
