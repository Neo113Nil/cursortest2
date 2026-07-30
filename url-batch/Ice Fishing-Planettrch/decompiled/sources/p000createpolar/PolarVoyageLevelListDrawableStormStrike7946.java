package p000createpolar;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLevelListDrawableStormStrike7946 {
    public static final Pattern PolarVoyageKotlinBetaPulseBeta3653 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final PolarVoyageTextRecognitionHeroOmega1312 PolarVoyageZipVortexCelestial6185 = new PolarVoyageTextRecognitionHeroOmega1312();
    public final StringBuilder PolarVoyageMotionLayoutTransitionHeroVision4068 = new StringBuilder();

    public static void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        while (true) {
            for (boolean z = true; polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() > 0 && z; z = false) {
                int i = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
                byte[] bArr = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(1);
                } else {
                    int i2 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(i2 - polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        }
                    }
                }
            }
            return;
        }
    }

    public static String PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312, StringBuilder sb) {
        PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextRecognitionHeroOmega1312);
        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() == 0) {
            return null;
        }
        String PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(polarVoyageTextRecognitionHeroOmega1312, sb);
        if (!PolarVoyageZipVortexCelestial6185.isEmpty()) {
            return PolarVoyageZipVortexCelestial6185;
        }
        return "" + ((char) polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393());
    }

    public static String PolarVoyageZipVortexCelestial6185(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653;
        while (i < i2 && !z) {
            char c = (char) polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(i - polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068);
        return sb.toString();
    }
}
