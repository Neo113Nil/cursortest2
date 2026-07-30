package p000createpolar;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDatabaseThunderNeo8011 extends PolarVoyagePreviewTitaniumStrikeCelestial8850 {
    public final Context PolarVoyageDrawableDeltaHyperion5742;
    public final int PolarVoyageSnackbarGammaEclipse2140;

    public PolarVoyageDatabaseThunderNeo8011(Context context) {
        super(new PolarVoyageResourceBetaDragon8086[1], new PolarVoyageCrashlyticsPixelStorm7227[1]);
        this.PolarVoyageDrawableDeltaHyperion5742 = context;
        this.PolarVoyageSnackbarGammaEclipse2140 = -1;
    }

    @Override // p000createpolar.PolarVoyagePreviewTitaniumStrikeCelestial8850
    public final PolarVoyageObjectDetectionNovaXElite1714 PolarVoyageItemDecorationUltraDeltaEpic7485() {
        return new PolarVoyageCrashlyticsPixelStorm7227(this);
    }

    @Override // p000createpolar.PolarVoyagePreviewTitaniumStrikeCelestial8850
    public final PolarVoyageScrollViewStrikeInfernoStorm8820 PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageResourceBetaDragon8086 polarVoyageResourceBetaDragon8086, PolarVoyageObjectDetectionNovaXElite1714 polarVoyageObjectDetectionNovaXElite1714, boolean z) {
        PolarVoyageCrashlyticsPixelStorm7227 polarVoyageCrashlyticsPixelStorm7227 = (PolarVoyageCrashlyticsPixelStorm7227) polarVoyageObjectDetectionNovaXElite1714;
        ByteBuffer byteBuffer = polarVoyageResourceBetaDragon8086.PolarVoyageViewRogueMaster4778;
        byteBuffer.getClass();
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(byteBuffer.hasArray());
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.PolarVoyageSnackbarGammaEclipse2140;
            if (i == -1) {
                Context context = this.PolarVoyageDrawableDeltaHyperion5742;
                if (context != null) {
                    Point PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageSnackbarGammaEclipse2140(context);
                    int i2 = PolarVoyageSnackbarGammaEclipse2140.x;
                    int i3 = PolarVoyageSnackbarGammaEclipse2140.y;
                    PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356 = polarVoyageResourceBetaDragon8086.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (polarVoyageDisplayMetricsSpectraNeoHero6356 != null) {
                        int i4 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageCanvasElitePhoenix4750;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            polarVoyageCrashlyticsPixelStorm7227.PolarVoyageViewRogueMaster4778 = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBottomSheetOmegaNeo1907(byteBuffer.array(), byteBuffer.remaining(), i);
            polarVoyageCrashlyticsPixelStorm7227.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageResourceBetaDragon8086.PolarVoyageDrawableDeltaHyperion5742;
            return null;
        } catch (PolarVoyageToastNeoOmega7549 e) {
            return new PolarVoyageContentObserverForceMax7692("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new PolarVoyageContentObserverForceMax7692(e2);
        }
    }

    @Override // p000createpolar.PolarVoyagePreviewTitaniumStrikeCelestial8850
    public final PolarVoyageScrollViewStrikeInfernoStorm8820 PolarVoyageStrictModeLegendEpic1532(Throwable th) {
        return new PolarVoyageContentObserverForceMax7692("Unexpected decode error", th);
    }

    @Override // p000createpolar.PolarVoyagePreviewTitaniumStrikeCelestial8850
    public final PolarVoyageResourceBetaDragon8086 PolarVoyageTextInputEditTextNebulaHero6651() {
        return new PolarVoyageResourceBetaDragon8086(1);
    }
}
