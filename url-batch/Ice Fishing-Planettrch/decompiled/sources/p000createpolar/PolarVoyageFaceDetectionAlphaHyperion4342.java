package p000createpolar;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFaceDetectionAlphaHyperion4342 {
    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public boolean PolarVoyageBitmapVisionAuroraPixel4705;
    public final PolarVoyagePropertyValuesHolderHyperionUltra8479 PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyagePropertyValuesHolderHyperionUltra8479 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageBundlePhantomEclipseMega7910 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageFaceDetectionAlphaHyperion4342(Context context, Looper looper, PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 polarVoyageVelocityTrackerPhantomTitaniumStrike2970) {
        this.PolarVoyageZipVortexCelestial6185 = new PolarVoyageBundlePhantomEclipseMega7910(context.getApplicationContext());
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970.PolarVoyageZipVortexCelestial6185(looper, null);
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970.PolarVoyageZipVortexCelestial6185(Looper.getMainLooper(), null);
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(boolean z) {
        if (this.PolarVoyageBitmapVisionAuroraPixel4705 == z) {
            return;
        }
        this.PolarVoyageBitmapVisionAuroraPixel4705 = z;
        if (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            PolarVoyageZipVortexCelestial6185(true, z);
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(final boolean z, final boolean z2) {
        PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (z && z2) {
            polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new Runnable() { // from class: create-polar.PolarVoyageScaleAnimationQuantumStrike6872
                @Override // java.lang.Runnable
                public final void run() {
                    PolarVoyageBundlePhantomEclipseMega7910.PolarVoyageZipVortexCelestial6185(PolarVoyageFaceDetectionAlphaHyperion4342.this.PolarVoyageZipVortexCelestial6185, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185.postDelayed(new PolarVoyageTextWatcherCelestialVortexCyber5187(5, this, atomicBoolean), 1000L);
        polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new Runnable() { // from class: create-polar.PolarVoyageAnimationSpectraForce2152
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                PolarVoyageBundlePhantomEclipseMega7910.PolarVoyageZipVortexCelestial6185(PolarVoyageFaceDetectionAlphaHyperion4342.this.PolarVoyageZipVortexCelestial6185, z, z2);
            }
        });
    }
}
