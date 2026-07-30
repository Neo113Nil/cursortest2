package p000createpolar;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageImageCaptureCelestialVortex1699 implements PolarVoyageViewModelScopeMaxInferno6305 {
    public final float[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageImageCaptureCelestialVortex1699(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.PolarVoyageZipVortexCelestial6185 = new int[size];
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new float[size];
        for (int i = 0; i < size; i++) {
            this.PolarVoyageZipVortexCelestial6185[i] = ((Integer) arrayList.get(i)).intValue();
            this.PolarVoyageMotionLayoutTransitionHeroVision4068[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (z) {
            PolarVoyageMotionLayoutTransitionHeroVision4068((View) parent, fArr);
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyagePoseDetectionCosmosVision6217(fArr2);
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageKotlinHeroHyper4083(fArr2, -view.getScrollX(), -view.getScrollY());
            PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLooperThreadAlphaPrime1279(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyagePoseDetectionCosmosVision6217(fArr2);
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageKotlinHeroHyper4083(fArr2, left, top);
            PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLooperThreadAlphaPrime1279(fArr, fArr2);
        } else {
            int[] iArr = this.PolarVoyageZipVortexCelestial6185;
            view.getLocationInWindow(iArr);
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyagePoseDetectionCosmosVision6217(fArr2);
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageKotlinHeroHyper4083(fArr2, -view.getScrollX(), -view.getScrollY());
            PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLooperThreadAlphaPrime1279(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyagePoseDetectionCosmosVision6217(fArr2);
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageKotlinHeroHyper4083(fArr2, f, f2);
            PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLooperThreadAlphaPrime1279(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageClipboardManagerAuroraPixel8666(fArr2, matrix);
        PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLooperThreadAlphaPrime1279(fArr, fArr2);
    }

    @Override // p000createpolar.PolarVoyageViewModelScopeMaxInferno6305
    public void PolarVoyageZipVortexCelestial6185(View view, float[] fArr) {
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyagePoseDetectionCosmosVision6217(fArr);
        PolarVoyageMotionLayoutTransitionHeroVision4068(view, fArr);
    }

    public PolarVoyageImageCaptureCelestialVortex1699(int i, int i2) {
        this.PolarVoyageZipVortexCelestial6185 = new int[]{i, i2};
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new float[]{0.0f, 1.0f};
    }

    public PolarVoyageImageCaptureCelestialVortex1699(int i, int i2, int i3) {
        this.PolarVoyageZipVortexCelestial6185 = new int[]{i, i2, i3};
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public PolarVoyageImageCaptureCelestialVortex1699(float[] fArr) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = fArr;
        this.PolarVoyageZipVortexCelestial6185 = new int[2];
    }
}
