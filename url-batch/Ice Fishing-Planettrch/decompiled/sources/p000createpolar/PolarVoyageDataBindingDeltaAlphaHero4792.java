package p000createpolar;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDataBindingDeltaAlphaHero4792 extends PolarVoyageFlatMapBlazeCosmos6136 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final OnBackInvokedCallback PolarVoyageBitmapVisionAuroraPixel4705;
    public boolean PolarVoyageDiffUtilTurboStrike5735;
    public final OnBackInvokedDispatcher PolarVoyageKotlinBetaPulseBeta3653;

    public PolarVoyageDataBindingDeltaAlphaHero4792(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.PolarVoyageKotlinBetaPulseBeta3653 = onBackInvokedDispatcher;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: create-polar.PolarVoyageNavigationDeltaPulse1072
            public final void onBackInvoked() {
                PolarVoyageDataBindingDeltaAlphaHero4792.this.PolarVoyageZipVortexCelestial6185();
            }
        } : new PolarVoyageCamera2SpeedGamma7298(this);
    }

    @Override // p000createpolar.PolarVoyageFlatMapBlazeCosmos6136
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.PolarVoyageBitmapVisionAuroraPixel4705;
        if (z && !this.PolarVoyageDiffUtilTurboStrike5735) {
            this.PolarVoyageKotlinBetaPulseBeta3653.registerOnBackInvokedCallback(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, onBackInvokedCallback);
            this.PolarVoyageDiffUtilTurboStrike5735 = true;
        } else {
            if (z || !this.PolarVoyageDiffUtilTurboStrike5735) {
                return;
            }
            this.PolarVoyageKotlinBetaPulseBeta3653.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.PolarVoyageDiffUtilTurboStrike5735 = false;
        }
    }
}
