package p000createpolar;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageOnAttachStateChangeListenerTurboUltraPulse3911 {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        int i = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Charset charset = StandardCharsets.UTF_8;
        String PolarVoyageDrawableDeltaHyperion5742 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(charset);
        if (PolarVoyageDrawableDeltaHyperion5742 == null || !PolarVoyageDrawableDeltaHyperion5742.startsWith("WEBVTT")) {
            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i);
            throw PolarVoyageToastNeoOmega7549.PolarVoyageZipVortexCelestial6185(null, "Expected WEBVTT. Got " + polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(charset));
        }
    }

    public static long PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static float PolarVoyageZipVortexCelestial6185(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
