package p000createpolar;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageJobSchedulerSpectraTitan1488 implements Runnable {
    public final /* synthetic */ Runnable PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ PolarVoyageWorkManagerVortexNova2773 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ PolarVoyageLayoutInfernoSpeed9711 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageJobSchedulerSpectraTitan1488(PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773, PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711, int i, Runnable runnable) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageWorkManagerVortexNova2773;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLayoutInfernoSpeed9711;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711 = this.PolarVoyageStrictModeLegendEpic1532;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Runnable runnable = this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060 = polarVoyageWorkManagerVortexNova2773.PolarVoyageDiffUtilTurboStrike5735;
        try {
            try {
                PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta80602 = polarVoyageWorkManagerVortexNova2773.PolarVoyageKotlinBetaPulseBeta3653;
                Objects.requireNonNull(polarVoyageExoPlayerNeoDelta80602);
                polarVoyageExoPlayerNeoDelta8060.PolarVoyageRotateAnimationCyberCelestialDelta4768(new PolarVoyageObjectAnimatorEclipseLegend1405(polarVoyageExoPlayerNeoDelta80602, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) polarVoyageWorkManagerVortexNova2773.PolarVoyageZipVortexCelestial6185.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    polarVoyageExoPlayerNeoDelta8060.PolarVoyageRotateAnimationCyberCelestialDelta4768(new PolarVoyageCamera2SparkPhantom6048(polarVoyageWorkManagerVortexNova2773, polarVoyageLayoutInfernoSpeed9711, i));
                } else {
                    polarVoyageWorkManagerVortexNova2773.PolarVoyageZipVortexCelestial6185(polarVoyageLayoutInfernoSpeed9711, i);
                }
                runnable.run();
            } catch (PolarVoyageThreadNeoDeltaThunder5906 unused) {
                polarVoyageWorkManagerVortexNova2773.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutForceEpicAurora7183(polarVoyageLayoutInfernoSpeed9711, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
