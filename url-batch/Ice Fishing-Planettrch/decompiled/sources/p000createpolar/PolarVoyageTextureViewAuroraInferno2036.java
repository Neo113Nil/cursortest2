package p000createpolar;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageTextureViewAuroraInferno2036 extends PolarVoyageLiveDataSpectraNebulaPixel5961 {
    public static Font PolarVoyageBitmapMaxTitanTitan7960(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(Constants.MINIMAL_ERROR_STATUS_CODE, 0);
        Font font = fontFamily.getFont(0);
        int PolarVoyageMotionLayoutForceEpicAurora7183 = PolarVoyageMotionLayoutForceEpicAurora7183(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int PolarVoyageMotionLayoutForceEpicAurora71832 = PolarVoyageMotionLayoutForceEpicAurora7183(fontStyle, font2.getStyle());
            if (PolarVoyageMotionLayoutForceEpicAurora71832 < PolarVoyageMotionLayoutForceEpicAurora7183) {
                font = font2;
                PolarVoyageMotionLayoutForceEpicAurora7183 = PolarVoyageMotionLayoutForceEpicAurora71832;
            }
        }
        return font;
    }

    public static int PolarVoyageMotionLayoutForceEpicAurora7183(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageBarcodeScannerInfernoSolarSpark7767(Context context, PolarVoyageConfigurationCyberHero6081 polarVoyageConfigurationCyberHero6081, Resources resources) {
        try {
            FontFamily.Builder builder = null;
            for (PolarVoyageJavaPixelDeltaCelestial2899 polarVoyageJavaPixelDeltaCelestial2899 : polarVoyageConfigurationCyberHero6081.PolarVoyageZipVortexCelestial6185) {
                try {
                    Font build = new Font.Builder(resources, polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageDiffUtilTurboStrike5735).setWeight(polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageMotionLayoutTransitionHeroVision4068).setSlant(polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageKotlinBetaPulseBeta3653 ? 1 : 0).setTtcIndex(polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageBitmapVisionAuroraPixel4705).setFontVariationSettings(polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageBarcodeScannerInfernoSolarSpark7767).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(PolarVoyageBitmapMaxTitanTitan7960(build2).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageBitmapVisionAuroraPixel4705(Context context, PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
        try {
            FontFamily PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr, context.getContentResolver());
            if (PolarVoyageDisplayMetricsVortexDragon9516 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(PolarVoyageDisplayMetricsVortexDragon9516).setStyle(PolarVoyageBitmapMaxTitanTitan7960(PolarVoyageDisplayMetricsVortexDragon9516).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageDiffUtilTurboStrike5735(Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageDisplayMetricsVortexDragon9516((PolarVoyageProcessCameraProviderDragonEpicCosmos5977[]) list.get(0), contentResolver);
            if (PolarVoyageDisplayMetricsVortexDragon9516 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(PolarVoyageDisplayMetricsVortexDragon9516);
            for (int i = 1; i < list.size(); i++) {
                FontFamily PolarVoyageDisplayMetricsVortexDragon95162 = PolarVoyageDisplayMetricsVortexDragon9516((PolarVoyageProcessCameraProviderDragonEpicCosmos5977[]) list.get(i), contentResolver);
                if (PolarVoyageDisplayMetricsVortexDragon95162 != null) {
                    customFallbackBuilder.addCustomFallback(PolarVoyageDisplayMetricsVortexDragon95162);
                }
            }
            return customFallbackBuilder.setStyle(PolarVoyageBitmapMaxTitanTitan7960(PolarVoyageDisplayMetricsVortexDragon9516).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos5977 : polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
            if (Objects.equals(polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageZipVortexCelestial6185.getScheme(), "systemfont")) {
                font = PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageProcessCameraProviderDragonEpicCosmos5977);
            } else {
                try {
                    Uri uri = polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageZipVortexCelestial6185;
                    str = polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageBitmapVisionAuroraPixel4705;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageKotlinBetaPulseBeta3653).setSlant(polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 1 : 0).setTtcIndex(polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos5977) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageTextInputEditTextNebulaHero6651(Context context, Resources resources, String str) {
        try {
            Font build = new Font.Builder(resources, R.font.polar_app_font).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
