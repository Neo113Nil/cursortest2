package p000createpolar;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageJobSchedulerStormSolar7380 extends PolarVoyageAccelerometerAuroraTitanSpeed7821 {
    public static final PolarVoyageInterpolatorCelestialFusion9132 PolarVoyageBitmapMaxTitanTitan7960 = new PolarVoyageInterpolatorCelestialFusion9132(PolarVoyageMediaPlayerCelestialQuantumSpeed2213.PolarVoyageRemoteModelManagerOlympianCelestial9141);
    public static final PolarVoyagePaintLegendNebulaLegend3234 PolarVoyageDisplayMetricsVortexDragon9516 = new PolarVoyagePaintLegendNebulaLegend3234(0);
    public final PolarVoyageProximitySensorCosmosVisionSpectra3312 PolarVoyageAnimatorSetSparkUltraMax8233;
    public final Handler PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageContentProviderHyperSpark3838;
    public boolean PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final Choreographer PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Object PolarVoyageViewRogueMaster4778 = new Object();
    public final PolarVoyageMLKitNovaXNovaSpectra9261 PolarVoyageCameraPixelBlaze2629 = new PolarVoyageMLKitNovaXNovaSpectra9261();
    public ArrayList PolarVoyageDrawableDeltaHyperion5742 = new ArrayList();
    public ArrayList PolarVoyageSnackbarGammaEclipse2140 = new ArrayList();
    public final PolarVoyageLinearLayoutUltraSpectra6275 PolarVoyageNavigationViewHyperHyperHyperion1793 = new PolarVoyageLinearLayoutUltraSpectra6275(this);

    public PolarVoyageJobSchedulerStormSolar7380(Choreographer choreographer, Handler handler) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = choreographer;
        this.PolarVoyageBottomSheetOmegaNeo1907 = handler;
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = new PolarVoyageProximitySensorCosmosVisionSpectra3312(choreographer, this);
    }

    public static final void PolarVoyageToolbarEclipseInfernoHero6368(PolarVoyageJobSchedulerStormSolar7380 polarVoyageJobSchedulerStormSolar7380) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (polarVoyageJobSchedulerStormSolar7380.PolarVoyageViewRogueMaster4778) {
                PolarVoyageMLKitNovaXNovaSpectra9261 polarVoyageMLKitNovaXNovaSpectra9261 = polarVoyageJobSchedulerStormSolar7380.PolarVoyageCameraPixelBlaze2629;
                runnable = (Runnable) (polarVoyageMLKitNovaXNovaSpectra9261.isEmpty() ? null : polarVoyageMLKitNovaXNovaSpectra9261.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (polarVoyageJobSchedulerStormSolar7380.PolarVoyageViewRogueMaster4778) {
                    PolarVoyageMLKitNovaXNovaSpectra9261 polarVoyageMLKitNovaXNovaSpectra92612 = polarVoyageJobSchedulerStormSolar7380.PolarVoyageCameraPixelBlaze2629;
                    runnable = (Runnable) (polarVoyageMLKitNovaXNovaSpectra92612.isEmpty() ? null : polarVoyageMLKitNovaXNovaSpectra92612.removeFirst());
                }
            }
            synchronized (polarVoyageJobSchedulerStormSolar7380.PolarVoyageViewRogueMaster4778) {
                if (polarVoyageJobSchedulerStormSolar7380.PolarVoyageCameraPixelBlaze2629.isEmpty()) {
                    z = false;
                    polarVoyageJobSchedulerStormSolar7380.PolarVoyageContentProviderHyperSpark3838 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // p000createpolar.PolarVoyageAccelerometerAuroraTitanSpeed7821
    public final void PolarVoyageViewBindingPulseHeroSpeed5705(PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822, Runnable runnable) {
        synchronized (this.PolarVoyageViewRogueMaster4778) {
            this.PolarVoyageCameraPixelBlaze2629.addLast(runnable);
            if (!this.PolarVoyageContentProviderHyperSpark3838) {
                this.PolarVoyageContentProviderHyperSpark3838 = true;
                this.PolarVoyageBottomSheetOmegaNeo1907.post(this.PolarVoyageNavigationViewHyperHyperHyperion1793);
                if (!this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                    this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = true;
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768.postFrameCallback(this.PolarVoyageNavigationViewHyperHyperHyperion1793);
                }
            }
        }
    }
}
