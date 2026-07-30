package p000createpolar;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageVectorDrawableCompatNovaXCyber9205 extends PolarVoyagePackageManagerNeoNeoTurbo8097 {
    public final Window PolarVoyageZipVortexCelestial6185;

    public PolarVoyageVectorDrawableCompatNovaXCyber9205(Window window) {
        this.PolarVoyageZipVortexCelestial6185 = window;
    }

    @Override // p000createpolar.PolarVoyagePackageManagerNeoNeoTurbo8097
    public final void PolarVoyageViewRogueMaster4778(boolean z) {
        Window window = this.PolarVoyageZipVortexCelestial6185;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
