package p000createpolar;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageItemDecorationStormNeo5630 {
    public static final Pattern PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageItemDecorationStormNeo5630(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !PolarVoyageBarcodeScannerInfernoSolarSpark7767.matcher(str3).matches()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.PolarVoyageZipVortexCelestial6185 = str3;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageKotlinBetaPulseBeta3653 = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageItemDecorationStormNeo5630)) {
            return false;
        }
        PolarVoyageItemDecorationStormNeo5630 polarVoyageItemDecorationStormNeo5630 = (PolarVoyageItemDecorationStormNeo5630) obj;
        return this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageItemDecorationStormNeo5630.PolarVoyageZipVortexCelestial6185) && this.PolarVoyageMotionLayoutTransitionHeroVision4068.equals(polarVoyageItemDecorationStormNeo5630.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageZipVortexCelestial6185});
    }
}
