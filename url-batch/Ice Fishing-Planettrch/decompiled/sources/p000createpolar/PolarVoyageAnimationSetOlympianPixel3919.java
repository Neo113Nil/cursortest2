package p000createpolar;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimationSetOlympianPixel3919 extends PolarVoyageTextureViewAuroraInferno2036 {
    @Override // p000createpolar.PolarVoyageTextureViewAuroraInferno2036
    public final Font PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos5977) {
        Font PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Uri uri = polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageZipVortexCelestial6185;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageBitmapVisionAuroraPixel4705;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageDisplayMetricsQuantumStormEclipse7538.PolarVoyageBarcodeScannerInfernoSolarSpark7767(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                }
                try {
                    return new Font.Builder(PolarVoyageBarcodeScannerInfernoSolarSpark7767).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
