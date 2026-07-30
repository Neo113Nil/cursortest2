package p000createpolar;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageAudioManagerCelestialHyperionOlympian2810 extends PolarVoyagePackageManagerNeoNeoTurbo8097 {
    public final Window PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final WindowInsetsController PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAudioManagerCelestialHyperionOlympian2810(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.PolarVoyageZipVortexCelestial6185 = insetsController;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = window;
    }

    @Override // p000createpolar.PolarVoyagePackageManagerNeoNeoTurbo8097
    public void PolarVoyageBottomSheetOmegaNeo1907(boolean z) {
        PolarVoyageSnackbarGammaEclipse2140(16, 16, z);
    }

    public final void PolarVoyageSnackbarGammaEclipse2140(int i, int i2, boolean z) {
        Window window = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.PolarVoyageZipVortexCelestial6185;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // p000createpolar.PolarVoyagePackageManagerNeoNeoTurbo8097
    public void PolarVoyageViewRogueMaster4778(boolean z) {
        PolarVoyageSnackbarGammaEclipse2140(8192, 8, z);
    }
}
