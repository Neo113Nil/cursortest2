package p000createpolar;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePlaceholderRogueTitanium7752 {
    public static final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
    public final Map PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageBitmapVisionAuroraPixel4705;
    public final long PolarVoyageDiffUtilTurboStrike5735;
    public final byte[] PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageTextInputEditTextNebulaHero6651;
    public final Uri PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyagePlaceholderOlympianVision8131.PolarVoyageZipVortexCelestial6185("media3.datasource");
    }

    public PolarVoyagePlaceholderRogueTitanium7752(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j >= 0);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j >= 0);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j2 > 0 || j2 == -1);
        uri.getClass();
        this.PolarVoyageZipVortexCelestial6185 = uri;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = (bArr == null || bArr.length == 0) ? null : bArr;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Collections.unmodifiableMap(new HashMap(map));
        this.PolarVoyageBitmapVisionAuroraPixel4705 = j;
        this.PolarVoyageDiffUtilTurboStrike5735 = j2;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", ");
        sb.append(this.PolarVoyageBitmapVisionAuroraPixel4705);
        sb.append(", ");
        sb.append(this.PolarVoyageDiffUtilTurboStrike5735);
        sb.append(", null, ");
        sb.append(this.PolarVoyageTextInputEditTextNebulaHero6651);
        sb.append("]");
        return sb.toString();
    }
}
