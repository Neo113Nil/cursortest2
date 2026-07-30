package p000createpolar;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageHandlerDragonInferno8931 {
    public static AutofillId PolarVoyageBarcodeScannerInfernoSolarSpark7767(View view) {
        return view.getAutofillId();
    }

    public static float PolarVoyageBitmapVisionAuroraPixel4705(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void PolarVoyageBottomSheetOmegaNeo1907(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void PolarVoyageCameraPixelBlaze2629(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static float PolarVoyageDiffUtilTurboStrike5735(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void PolarVoyageDrawableDeltaHyperion5742(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static float PolarVoyageItemDecorationUltraDeltaEpic7485(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Icon PolarVoyageKotlinBetaPulseBeta3653(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static Notification.Builder PolarVoyageMotionLayoutTransitionHeroVision4068(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void PolarVoyageRotateAnimationCyberCelestialDelta4768(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static boolean PolarVoyageStrictModeLegendEpic1532(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static float PolarVoyageTextInputEditTextNebulaHero6651(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void PolarVoyageViewRogueMaster4778(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static final ColorSpace PolarVoyageZipVortexCelestial6185(PolarVoyageFontFamilyHyperionStorm1277 polarVoyageFontFamilyHyperionStorm1277) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageBitmapVisionAuroraPixel4705)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageRemoteModelManagerOlympianCelestial9141)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageNavigationViewHyperHyperHyperion1793)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageSnackbarGammaEclipse2140)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageStrictModeLegendEpic1532)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageBitmapMaxTitanTitan7960)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageAnimatorSetSparkUltraMax8233)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageBottomSheetOmegaNeo1907)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageViewRogueMaster4778)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageTextInputEditTextNebulaHero6651)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageItemDecorationUltraDeltaEpic7485)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageDiffUtilTurboStrike5735)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageCameraPixelBlaze2629)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageContentProviderHyperSpark3838)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageDrawableDeltaHyperion5742)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageLayerDrawableShadowTitaniumOmega1942)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFontFamilyHyperionStorm1277, PolarVoyageCameraViewVortexElite1564.PolarVoyageMotionLayoutForceEpicAurora7183)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (polarVoyageFontFamilyHyperionStorm1277 instanceof PolarVoyagePropertyValuesHolderOmegaStorm7398) {
                String str = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185;
                PolarVoyagePropertyValuesHolderOmegaStorm7398 polarVoyagePropertyValuesHolderOmegaStorm7398 = (PolarVoyagePropertyValuesHolderOmegaStorm7398) polarVoyageFontFamilyHyperionStorm1277;
                float[] PolarVoyageZipVortexCelestial6185 = polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageZipVortexCelestial6185();
                PolarVoyageTransformBetaBeta5811 polarVoyageTransformBetaBeta5811 = polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageTextInputEditTextNebulaHero6651;
                ColorSpace.Rgb.TransferParameters transferParameters = polarVoyageTransformBetaBeta5811 != null ? new ColorSpace.Rgb.TransferParameters(polarVoyageTransformBetaBeta5811.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageTransformBetaBeta5811.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageTransformBetaBeta5811.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageTransformBetaBeta5811.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTransformBetaBeta5811.PolarVoyageDiffUtilTurboStrike5735, polarVoyageTransformBetaBeta5811.PolarVoyageTextInputEditTextNebulaHero6651, polarVoyageTransformBetaBeta5811.PolarVoyageZipVortexCelestial6185) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageItemDecorationUltraDeltaEpic7485, PolarVoyageZipVortexCelestial6185, transferParameters);
                }
                float[] fArr = polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageItemDecorationUltraDeltaEpic7485;
                final PolarVoyageContentProviderSolarRogue1341 polarVoyageContentProviderSolarRogue1341 = polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageViewRogueMaster4778;
                final int i = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: create-polar.PolarVoyageTextViewDragonVortexBlaze8674
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i2 = i;
                        PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492 = polarVoyageContentProviderSolarRogue1341;
                        switch (i2) {
                        }
                        return ((Number) polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(Double.valueOf(d))).doubleValue();
                    }
                };
                final PolarVoyageContentProviderSolarRogue1341 polarVoyageContentProviderSolarRogue13412 = polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageSnackbarGammaEclipse2140;
                final int i2 = 1;
                return new ColorSpace.Rgb(str, fArr, PolarVoyageZipVortexCelestial6185, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: create-polar.PolarVoyageTextViewDragonVortexBlaze8674
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i22 = i2;
                        PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492 = polarVoyageContentProviderSolarRogue13412;
                        switch (i22) {
                        }
                        return ((Number) polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(Double.valueOf(d))).doubleValue();
                    }
                }, polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyagePropertyValuesHolderOmegaStorm7398.PolarVoyageDiffUtilTurboStrike5735);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }
}
