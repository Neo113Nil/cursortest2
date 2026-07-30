package p000createpolar;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageHandlerThreadHyperHyperionPhantom5390 extends PolarVoyageAdMobSpeedFusion2921 {
    public byte[] PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageDrawableDeltaHyperion5742;
    public int PolarVoyageSnackbarGammaEclipse2140;
    public PolarVoyagePlaceholderRogueTitanium7752 PolarVoyageViewRogueMaster4778;

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Uri PolarVoyageBottomSheetOmegaNeo1907() {
        PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752 = this.PolarVoyageViewRogueMaster4778;
        if (polarVoyagePlaceholderRogueTitanium7752 != null) {
            return polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
        }
        return null;
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final long PolarVoyageContentProviderHyperSpark3838(PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752) {
        PolarVoyageSnackbarGammaEclipse2140();
        this.PolarVoyageViewRogueMaster4778 = polarVoyagePlaceholderRogueTitanium7752;
        Uri uri = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
        long j = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageDiffUtilTurboStrike5735;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAnimatorSetSparkUltraMax8233("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new PolarVoyageToastNeoOmega7549("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.PolarVoyageCameraPixelBlaze2629 = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new PolarVoyageToastNeoOmega7549("Error while parsing Base64 encoded string: " + str2, e, true, 0);
            }
        } else {
            this.PolarVoyageCameraPixelBlaze2629 = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBitmapVisionAuroraPixel4705;
        byte[] bArr = this.PolarVoyageCameraPixelBlaze2629;
        if (j2 > bArr.length) {
            this.PolarVoyageCameraPixelBlaze2629 = null;
            throw new PolarVoyagePagingSourceFusionPhoenixThunder6968(2008);
        }
        int i = (int) j2;
        this.PolarVoyageDrawableDeltaHyperion5742 = i;
        int length = bArr.length - i;
        this.PolarVoyageSnackbarGammaEclipse2140 = length;
        if (j != -1) {
            this.PolarVoyageSnackbarGammaEclipse2140 = (int) Math.min(length, j);
        }
        PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
        return j != -1 ? j : this.PolarVoyageSnackbarGammaEclipse2140;
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final void close() {
        if (this.PolarVoyageCameraPixelBlaze2629 != null) {
            this.PolarVoyageCameraPixelBlaze2629 = null;
            PolarVoyageStrictModeLegendEpic1532();
        }
        this.PolarVoyageViewRogueMaster4778 = null;
    }

    @Override // p000createpolar.PolarVoyageTracePixelSparkNova2688
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.PolarVoyageSnackbarGammaEclipse2140;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.PolarVoyageCameraPixelBlaze2629;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        System.arraycopy(bArr2, this.PolarVoyageDrawableDeltaHyperion5742, bArr, i, min);
        this.PolarVoyageDrawableDeltaHyperion5742 += min;
        this.PolarVoyageSnackbarGammaEclipse2140 -= min;
        PolarVoyageKotlinBetaPulseBeta3653(min);
        return min;
    }
}
