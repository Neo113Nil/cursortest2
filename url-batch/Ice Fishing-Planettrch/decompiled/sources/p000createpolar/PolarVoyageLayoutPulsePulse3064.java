package p000createpolar;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLayoutPulsePulse3064 {
    public static final Pattern PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final Pattern PolarVoyageKotlinBetaPulseBeta3653;
    public static final Pattern PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final Pattern PolarVoyageZipVortexCelestial6185 = Pattern.compile("\\{([^}]*)\\}");

    static {
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        Locale locale = Locale.US;
        PolarVoyageMotionLayoutTransitionHeroVision4068 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        PolarVoyageKotlinBetaPulseBeta3653 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF PolarVoyageZipVortexCelestial6185(String str) {
        String group;
        String group2;
        Matcher matcher = PolarVoyageMotionLayoutTransitionHeroVision4068.matcher(str);
        Matcher matcher2 = PolarVoyageKotlinBetaPulseBeta3653.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
