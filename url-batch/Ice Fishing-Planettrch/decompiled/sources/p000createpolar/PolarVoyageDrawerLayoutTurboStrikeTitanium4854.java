package p000createpolar;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDrawerLayoutTurboStrikeTitanium4854 {
    public PolarVoyageContentProviderNovaXPixel3239 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final ArrayList PolarVoyageBitmapVisionAuroraPixel4705 = new ArrayList();
    public boolean PolarVoyageDiffUtilTurboStrike5735;
    public boolean PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageColorDrawableNovaXPhoenix5992 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDrawerLayoutTurboStrikeTitanium4854(PolarVoyageColorDrawableNovaXPhoenix5992 polarVoyageColorDrawableNovaXPhoenix5992, String str) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageColorDrawableNovaXPhoenix5992;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageDrawerLayoutTurboStrikeTitanium4854 polarVoyageDrawerLayoutTurboStrikeTitanium4854, String str, long j, PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        polarVoyageDrawerLayoutTurboStrikeTitanium4854.getClass();
        str.getClass();
        polarVoyageFragmentPulseEliteDragon8768.getClass();
        polarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageKotlinBetaPulseBeta3653(new PolarVoyageAuthHyperNovaXAlpha4860(str, z, polarVoyageFragmentPulseEliteDragon8768), j);
    }

    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageContentProviderNovaXPixel3239 polarVoyageContentProviderNovaXPixel3239, long j, boolean z) {
        Logger logger = this.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageContentProviderNovaXPixel3239.getClass();
        PolarVoyageDrawerLayoutTurboStrikeTitanium4854 polarVoyageDrawerLayoutTurboStrikeTitanium4854 = polarVoyageContentProviderNovaXPixel3239.PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyageDrawerLayoutTurboStrikeTitanium4854 != this) {
            if (polarVoyageDrawerLayoutTurboStrikeTitanium4854 != null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("task is in multiple queues");
                return false;
            }
            polarVoyageContentProviderNovaXPixel3239.PolarVoyageKotlinBetaPulseBeta3653 = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.PolarVoyageBitmapVisionAuroraPixel4705;
        int indexOf = arrayList.indexOf(polarVoyageContentProviderNovaXPixel3239);
        if (indexOf != -1) {
            if (polarVoyageContentProviderNovaXPixel3239.PolarVoyageBarcodeScannerInfernoSolarSpark7767 <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel3239, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        polarVoyageContentProviderNovaXPixel3239.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j2;
        if (logger.isLoggable(Level.FINE)) {
            PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel3239, this, z ? "run again after ".concat(PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageStrictModeLegendEpic1532(j2 - nanoTime)) : "scheduled after ".concat(PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageStrictModeLegendEpic1532(j2 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((PolarVoyageContentProviderNovaXPixel3239) obj).PolarVoyageBarcodeScannerInfernoSolarSpark7767 - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, polarVoyageContentProviderNovaXPixel3239);
        return i == 0;
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705() {
        PolarVoyageColorDrawableNovaXPhoenix5992 polarVoyageColorDrawableNovaXPhoenix5992 = this.PolarVoyageZipVortexCelestial6185;
        TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
        synchronized (polarVoyageColorDrawableNovaXPhoenix5992) {
            this.PolarVoyageKotlinBetaPulseBeta3653 = true;
            if (PolarVoyageZipVortexCelestial6185()) {
                this.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(this);
            }
        }
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageContentProviderNovaXPixel3239 polarVoyageContentProviderNovaXPixel3239, long j) {
        polarVoyageContentProviderNovaXPixel3239.getClass();
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            if (!this.PolarVoyageKotlinBetaPulseBeta3653) {
                if (PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageContentProviderNovaXPixel3239, j, false)) {
                    this.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(this);
                }
                return;
            }
            boolean z = polarVoyageContentProviderNovaXPixel3239.PolarVoyageMotionLayoutTransitionHeroVision4068;
            Logger logger = this.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel3239, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel3239, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean PolarVoyageZipVortexCelestial6185() {
        PolarVoyageContentProviderNovaXPixel3239 polarVoyageContentProviderNovaXPixel3239 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (polarVoyageContentProviderNovaXPixel3239 != null && polarVoyageContentProviderNovaXPixel3239.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            this.PolarVoyageDiffUtilTurboStrike5735 = true;
        }
        ArrayList arrayList = this.PolarVoyageBitmapVisionAuroraPixel4705;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((PolarVoyageContentProviderNovaXPixel3239) arrayList.get(size)).PolarVoyageMotionLayoutTransitionHeroVision4068) {
                Logger logger = this.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageContentProviderNovaXPixel3239 polarVoyageContentProviderNovaXPixel32392 = (PolarVoyageContentProviderNovaXPixel3239) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel32392, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }
}
