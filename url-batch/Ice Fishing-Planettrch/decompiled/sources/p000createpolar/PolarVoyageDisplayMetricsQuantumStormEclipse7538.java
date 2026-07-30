package p000createpolar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageDisplayMetricsQuantumStormEclipse7538 {
    public static Paint PolarVoyageKotlinBetaPulseBeta3653;
    public static final PolarVoyageIntentServicePixelMaxElite4283 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final PolarVoyageLiveDataSpectraNebulaPixel5961 PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            PolarVoyageZipVortexCelestial6185 = new PolarVoyageAnimationSetOlympianPixel3919();
        } else if (i >= 29) {
            PolarVoyageZipVortexCelestial6185 = new PolarVoyageTextureViewAuroraInferno2036();
        } else if (i >= 28) {
            PolarVoyageZipVortexCelestial6185 = new PolarVoyageRemoteModelManagerInfernoHero5422();
        } else if (i >= 26) {
            PolarVoyageZipVortexCelestial6185 = new PolarVoyageSupervisorJobMaxSpectra4388();
        } else {
            Method method = PolarVoyageColorStateListInflaterMaxVortex5857.PolarVoyageKotlinBetaPulseBeta3653;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                PolarVoyageZipVortexCelestial6185 = new PolarVoyageColorStateListInflaterMaxVortex5857();
            } else {
                PolarVoyageZipVortexCelestial6185 = new PolarVoyageLifecycleRogueVortexTurbo2281();
            }
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageIntentServicePixelMaxElite4283(16);
        PolarVoyageKotlinBetaPulseBeta3653 = null;
        Trace.endSection();
    }

    public static Font PolarVoyageBarcodeScannerInfernoSolarSpark7767(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (PolarVoyageKotlinBetaPulseBeta3653 == null) {
            PolarVoyageKotlinBetaPulseBeta3653 = new Paint();
        }
        PolarVoyageKotlinBetaPulseBeta3653.setTextSize(10.0f);
        PolarVoyageKotlinBetaPulseBeta3653.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, PolarVoyageKotlinBetaPulseBeta3653);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }

    public static Typeface PolarVoyageKotlinBetaPulseBeta3653(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static String PolarVoyageMotionLayoutTransitionHeroVision4068(Resources resources, String str, int i) {
        return resources.getResourcePackageName(R.font.polar_app_font) + '-' + str + '-' + i + '-' + R.font.polar_app_font + "-0";
    }

    public static Typeface PolarVoyageZipVortexCelestial6185(Context context, PolarVoyageGeocoderPhoenixTurboThunder4776 polarVoyageGeocoderPhoenixTurboThunder4776, Resources resources, String str, int i, PolarVoyageInputMethodManagerBetaShadowHyper4520 polarVoyageInputMethodManagerBetaShadowHyper4520) {
        Typeface PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z = polarVoyageGeocoderPhoenixTurboThunder4776 instanceof PolarVoyageContentObserverUltraShadowFusion2438;
        PolarVoyageIntentServicePixelMaxElite4283 polarVoyageIntentServicePixelMaxElite4283 = PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (z) {
            PolarVoyageContentObserverUltraShadowFusion2438 polarVoyageContentObserverUltraShadowFusion2438 = (PolarVoyageContentObserverUltraShadowFusion2438) polarVoyageGeocoderPhoenixTurboThunder4776;
            String str2 = polarVoyageContentObserverUltraShadowFusion2438.PolarVoyageMotionLayoutTransitionHeroVision4068;
            boolean z2 = false;
            if (TextUtils.isEmpty(str2) || (build = PolarVoyageKotlinBetaPulseBeta3653(str2)) == null) {
                ArrayList arrayList = polarVoyageContentObserverUltraShadowFusion2438.PolarVoyageZipVortexCelestial6185;
                if (arrayList.size() == 1) {
                    build = PolarVoyageKotlinBetaPulseBeta3653(((PolarVoyageInstrumentationMaxLegendBeta6222) arrayList.get(0)).PolarVoyageBitmapVisionAuroraPixel4705);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayList.size()) {
                                        break;
                                    }
                                    PolarVoyageInstrumentationMaxLegendBeta6222 polarVoyageInstrumentationMaxLegendBeta6222 = (PolarVoyageInstrumentationMaxLegendBeta6222) arrayList.get(i3);
                                    if (i3 == arrayList.size() - 1 && TextUtils.isEmpty(polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageDiffUtilTurboStrike5735)) {
                                        customFallbackBuilder.setSystemFallback(polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageBitmapVisionAuroraPixel4705);
                                        break;
                                    }
                                    String str3 = polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageBitmapVisionAuroraPixel4705;
                                    String str4 = polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageDiffUtilTurboStrike5735;
                                    Font PolarVoyageBarcodeScannerInfernoSolarSpark77672 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageKotlinBetaPulseBeta3653(str3));
                                    if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageBitmapVisionAuroraPixel4705 + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = PolarVoyageTextWatcherGammaOlympian3878.PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageBarcodeScannerInfernoSolarSpark77672).build();
                                    } else {
                                        try {
                                            PolarVoyageTextWatcherGammaOlympian3878.PolarVoyageSnackbarGammaEclipse2140();
                                            PolarVoyageTextWatcherGammaOlympian3878.PolarVoyageCameraViewSpectraMaxSpectra2824();
                                            fontVariationSettings = PolarVoyageOrientationSensorAlphaSparkStrike1050.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBarcodeScannerInfernoSolarSpark77672).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = PolarVoyageTextWatcherGammaOlympian3878.PolarVoyageStrictModeLegendEpic1532(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = PolarVoyageTextWatcherGammaOlympian3878.PolarVoyageBitmapVisionAuroraPixel4705(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i3++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (PolarVoyageKotlinBetaPulseBeta3653(((PolarVoyageInstrumentationMaxLegendBeta6222) arrayList.get(i2)).PolarVoyageBitmapVisionAuroraPixel4705) == null) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                polarVoyageIntentServicePixelMaxElite4283.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageMotionLayoutTransitionHeroVision4068(resources, str, i), build);
                return build;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            PolarVoyageServiceInfoNovaCyber2044 polarVoyageServiceInfoNovaCyber2044 = new PolarVoyageServiceInfoNovaCyber2044(6);
            ArrayList arrayList2 = polarVoyageContentObserverUltraShadowFusion2438.PolarVoyageZipVortexCelestial6185;
            PolarVoyageLinearLayoutInfernoDelta2662 polarVoyageLinearLayoutInfernoDelta2662 = new PolarVoyageLinearLayoutInfernoDelta2662(0, handler);
            PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590 = new PolarVoyageZoomStateAlphaVision6590(9, polarVoyageServiceInfoNovaCyber2044, polarVoyageLinearLayoutInfernoDelta2662);
            if (arrayList2.size() > 1) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Fallbacks with blocking fetches are not supported for performance reasons");
                return null;
            }
            PolarVoyageInstrumentationMaxLegendBeta6222 polarVoyageInstrumentationMaxLegendBeta62222 = (PolarVoyageInstrumentationMaxLegendBeta6222) arrayList2.get(0);
            PolarVoyageIntentServicePixelMaxElite4283 polarVoyageIntentServicePixelMaxElite42832 = PolarVoyageScaleAnimationStrikeEpic4566.PolarVoyageZipVortexCelestial6185;
            ArrayList arrayList3 = new ArrayList(1);
            Object obj = new Object[]{polarVoyageInstrumentationMaxLegendBeta62222}[0];
            Objects.requireNonNull(obj);
            arrayList3.add(obj);
            List unmodifiableList = Collections.unmodifiableList(arrayList3);
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < unmodifiableList.size(); i4++) {
                sb.append(((PolarVoyageInstrumentationMaxLegendBeta6222) unmodifiableList.get(i4)).PolarVoyageTextInputEditTextNebulaHero6651);
                sb.append("-0");
                if (i4 < unmodifiableList.size() - 1) {
                    sb.append(";");
                }
            }
            String sb2 = sb.toString();
            PolarVoyageBarcodeScannerInfernoSolarSpark7767 = (Typeface) PolarVoyageScaleAnimationStrikeEpic4566.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068(sb2);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                polarVoyageLinearLayoutInfernoDelta2662.execute(new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(16, polarVoyageServiceInfoNovaCyber2044, PolarVoyageBarcodeScannerInfernoSolarSpark7767, z2));
            } else {
                ArrayList arrayList4 = new ArrayList(1);
                Object obj2 = new Object[]{polarVoyageInstrumentationMaxLegendBeta62222}[0];
                Objects.requireNonNull(obj2);
                arrayList4.add(obj2);
                PolarVoyageMotionEventAlphaCelestialThunder3331 PolarVoyageZipVortexCelestial61852 = PolarVoyageScaleAnimationStrikeEpic4566.PolarVoyageZipVortexCelestial6185(sb2, context, Collections.unmodifiableList(arrayList4));
                polarVoyageZoomStateAlphaVision6590.PolarVoyageNavigationViewHyperHyperHyperion1793(PolarVoyageZipVortexCelestial61852);
                PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageZipVortexCelestial61852.PolarVoyageZipVortexCelestial6185;
            }
        } else {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, (PolarVoyageConfigurationCyberHero6081) polarVoyageGeocoderPhoenixTurboThunder4776, resources);
        }
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
            polarVoyageIntentServicePixelMaxElite4283.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageMotionLayoutTransitionHeroVision4068(resources, str, i), PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        }
        return PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }
}
