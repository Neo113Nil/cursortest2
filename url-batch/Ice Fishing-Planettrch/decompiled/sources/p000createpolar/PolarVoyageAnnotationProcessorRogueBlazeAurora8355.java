package p000createpolar;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnnotationProcessorRogueBlazeAurora8355 implements PolarVoyageViewModelScopeMaxInferno6305 {
    public final Matrix PolarVoyageZipVortexCelestial6185 = new Matrix();
    public final int[] PolarVoyageMotionLayoutTransitionHeroVision4068 = new int[2];

    @Override // p000createpolar.PolarVoyageViewModelScopeMaxInferno6305
    public void PolarVoyageZipVortexCelestial6185(View view, float[] fArr) {
        Matrix matrix = this.PolarVoyageZipVortexCelestial6185;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageClipboardManagerAuroraPixel8666(fArr, matrix);
    }
}
