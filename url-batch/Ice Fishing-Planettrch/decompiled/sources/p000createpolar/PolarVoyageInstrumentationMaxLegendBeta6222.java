package p000createpolar;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInstrumentationMaxLegendBeta6222 {
    public final List PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final String PolarVoyageBitmapVisionAuroraPixel4705;
    public final String PolarVoyageDiffUtilTurboStrike5735;
    public final String PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageTextInputEditTextNebulaHero6651;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageInstrumentationMaxLegendBeta6222(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.PolarVoyageZipVortexCelestial6185 = str;
        str2.getClass();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = str3;
        list.getClass();
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = list;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = str4;
        this.PolarVoyageDiffUtilTurboStrike5735 = str5;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.PolarVoyageZipVortexCelestial6185 + ", mProviderPackage: " + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", mQuery: " + this.PolarVoyageKotlinBetaPulseBeta3653 + ", mSystemFont: " + this.PolarVoyageBitmapVisionAuroraPixel4705 + ", mVariationSettings: " + this.PolarVoyageDiffUtilTurboStrike5735 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
