package p000createpolar;

import android.text.Layout;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageShapeDrawableCelestialHyperion4704 implements PolarVoyageFlowMaxTitanAlpha3096 {
    public final XmlPullParserFactory PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final Pattern PolarVoyageStrictModeLegendEpic1532 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern PolarVoyageRotateAnimationCyberCelestialDelta4768 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern PolarVoyageBottomSheetOmegaNeo1907 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern PolarVoyageViewRogueMaster4778 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern PolarVoyageCameraPixelBlaze2629 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern PolarVoyageDrawableDeltaHyperion5742 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern PolarVoyageSnackbarGammaEclipse2140 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final PolarVoyageJavaPhantomBlaze7410 PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageJavaPhantomBlaze7410(30.0f, 1, 1);

    public PolarVoyageShapeDrawableCelestialHyperion4704() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static void PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str, PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike7440) {
        Matcher matcher;
        String group;
        String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = PolarVoyageBottomSheetOmegaNeo1907;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new PolarVoyageMotionLayoutGammaNeo3391("Invalid number of entries for fontSize: " + split.length + ".");
            }
            matcher = pattern.matcher(split[1]);
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new PolarVoyageMotionLayoutGammaNeo3391(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                polarVoyageGradlePluginHyperionPulseStrike7440.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 3;
                break;
            case "em":
                polarVoyageGradlePluginHyperionPulseStrike7440.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 2;
                break;
            case "px":
                polarVoyageGradlePluginHyperionPulseStrike7440.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1;
                break;
            default:
                throw new PolarVoyageMotionLayoutGammaNeo3391(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        polarVoyageGradlePluginHyperionPulseStrike7440.PolarVoyageBottomSheetOmegaNeo1907 = Float.parseFloat(group2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long PolarVoyageBottomSheetOmegaNeo1907(String str, PolarVoyageJavaPhantomBlaze7410 polarVoyageJavaPhantomBlaze7410) {
        double d;
        double d2;
        Matcher matcher = PolarVoyageStrictModeLegendEpic1532.matcher(str);
        char c = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / polarVoyageJavaPhantomBlaze7410.PolarVoyageZipVortexCelestial6185 : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / polarVoyageJavaPhantomBlaze7410.PolarVoyageMotionLayoutTransitionHeroVision4068) / polarVoyageJavaPhantomBlaze7410.PolarVoyageZipVortexCelestial6185 : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = PolarVoyageRotateAnimationCyberCelestialDelta4768.matcher(str);
        if (!matcher2.matches()) {
            throw new PolarVoyageMotionLayoutGammaNeo3391("Malformed time expression: " + str);
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3494:
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d = polarVoyageJavaPhantomBlaze7410.PolarVoyageZipVortexCelestial6185;
                parseDouble /= d;
                break;
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = polarVoyageJavaPhantomBlaze7410.PolarVoyageKotlinBetaPulseBeta3653;
                parseDouble /= d;
                break;
            case 4:
                d = 1000.0d;
                parseDouble /= d;
                break;
        }
        parseDouble *= d2;
        return (long) (parseDouble * 1000000.0d);
    }

    public static PolarVoyageJavaPhantomBlaze7410 PolarVoyageDiffUtilTurboStrike5735(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageSnackbarGammaEclipse2140("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        PolarVoyageJavaPhantomBlaze7410 polarVoyageJavaPhantomBlaze7410 = PolarVoyageContentProviderHyperSpark3838;
        int i = polarVoyageJavaPhantomBlaze7410.PolarVoyageMotionLayoutTransitionHeroVision4068;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = polarVoyageJavaPhantomBlaze7410.PolarVoyageKotlinBetaPulseBeta3653;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new PolarVoyageJavaPhantomBlaze7410(parseInt * f, i, i2);
    }

    public static int PolarVoyageKotlinBetaPulseBeta3653(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = PolarVoyageSnackbarGammaEclipse2140.matcher(attributeValue);
        if (!matcher.matches()) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDrawableDeltaHyperion5742(parseInt, parseInt2, "Invalid cell resolution %s %s", z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static boolean PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PolarVoyageGradlePluginHyperionPulseStrike7440 PolarVoyageRotateAnimationCyberCelestialDelta4768(XmlPullParser xmlPullParser, PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike7440) {
        char c;
        ?? r9;
        boolean z;
        char c2;
        int i;
        PolarVoyageAdapterBlazeSpectra6030 PolarVoyageRotateAnimationCyberCelestialDelta47682;
        int i2;
        int hashCode;
        int i3;
        PolarVoyageFragmentManagerDeltaPrime6059 polarVoyageFragmentManagerDeltaPrime6059;
        int i4;
        char c3;
        int attributeCount = xmlPullParser.getAttributeCount();
        PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike74402 = polarVoyageGradlePluginHyperionPulseStrike7440;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            String attributeName = xmlPullParser.getAttributeName(i5);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageStrictModeLegendEpic1532 = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageDisplayMetricsVortexDragon9516 = attributeValue;
                    break;
                case 2:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageZipVortexCelestial6185 = attributeValue;
                    break;
                case 3:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(attributeValue);
                    PolarVoyageFlingGestureEclipsePrimeMax1376.getClass();
                    switch (PolarVoyageFlingGestureEclipsePrimeMax1376.hashCode()) {
                        case -1364013995:
                            if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("start")) {
                                r9 = 4;
                                break;
                            }
                            r9 = -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageSnackbarGammaEclipse2140 = alignment;
                    break;
                case 4:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageBitmapMaxTitanTitan7960 = attributeValue;
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                    String PolarVoyageFlingGestureEclipsePrimeMax13762 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(attributeValue);
                    PolarVoyageFlingGestureEclipsePrimeMax13762.getClass();
                    switch (PolarVoyageFlingGestureEclipsePrimeMax13762.hashCode()) {
                        case -1461280213:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("nounderline")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1026963764:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("underline")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 913457136:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("nolinethrough")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1679736913:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("linethrough")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageTextInputEditTextNebulaHero6651 = 0;
                            break;
                        case true:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageTextInputEditTextNebulaHero6651 = 1;
                            break;
                        case true:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageDiffUtilTurboStrike5735 = 0;
                            break;
                        case true:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageDiffUtilTurboStrike5735 = 1;
                            break;
                    }
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageItemDecorationUltraDeltaEpic7485 = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ("style".equals(xmlPullParser.getName())) {
                        polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageViewRogueMaster4778 = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                    String PolarVoyageFlingGestureEclipsePrimeMax13763 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(attributeValue);
                    PolarVoyageFlingGestureEclipsePrimeMax13763.getClass();
                    switch (PolarVoyageFlingGestureEclipsePrimeMax13763.hashCode()) {
                        case -618561360:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13763.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -410956671:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13763.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -250518009:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13763.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -136074796:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13763.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3016401:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13763.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3556653:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13763.equals("text")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        case 4:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageCameraPixelBlaze2629 = 2;
                            break;
                        case 1:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageCameraPixelBlaze2629 = 1;
                            break;
                        case 2:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageCameraPixelBlaze2629 = 4;
                            break;
                        case 3:
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                            polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageCameraPixelBlaze2629 = 3;
                            break;
                    }
                case '\t':
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    try {
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageCombineOlympianCosmos3121.PolarVoyageZipVortexCelestial6185(attributeValue, false);
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageKotlinBetaPulseBeta3653 = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    PolarVoyageGradlePluginHyperionPulseStrike7440 PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    Matcher matcher = PolarVoyageViewRogueMaster4778.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e) {
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("TtmlParser", "Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    PolarVoyageZipVortexCelestial6185.PolarVoyageAnimatorSetSparkUltraMax8233 = f;
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185;
                    break;
                case 11:
                    String PolarVoyageFlingGestureEclipsePrimeMax13764 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(attributeValue);
                    PolarVoyageFlingGestureEclipsePrimeMax13764.getClass();
                    if (PolarVoyageFlingGestureEclipsePrimeMax13764.equals("all")) {
                        polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageRemoteModelManagerOlympianCelestial9141 = 1;
                        break;
                    } else if (PolarVoyageFlingGestureEclipsePrimeMax13764.equals("none")) {
                        polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageRemoteModelManagerOlympianCelestial9141 = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                        PolarVoyageBarcodeScannerInfernoSolarSpark7767(attributeValue, polarVoyageGradlePluginHyperionPulseStrike74402);
                        break;
                    } catch (PolarVoyageMotionLayoutGammaNeo3391 unused2) {
                        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    Pattern pattern = PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (attributeValue != null) {
                        String PolarVoyageFlingGestureEclipsePrimeMax13765 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(attributeValue.trim());
                        if (!PolarVoyageFlingGestureEclipsePrimeMax13765.isEmpty()) {
                            String[] split = TextUtils.split(PolarVoyageFlingGestureEclipsePrimeMax13765, PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                            int length = split.length;
                            PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799 PolarVoyageRotateAnimationCyberCelestialDelta47683 = length != 0 ? length != 1 ? PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799.PolarVoyageRotateAnimationCyberCelestialDelta4768(split.length, (Object[]) split.clone()) : new PolarVoyageRoomDaoHeroShadow1445(split[0]) : PolarVoyageAdapterDelegateCelestialMaxVision3488.PolarVoyageRemoteModelManagerOlympianCelestial9141;
                            PolarVoyageBindingAdapterAlphaMax4806 polarVoyageBindingAdapterAlphaMax4806 = new PolarVoyageBindingAdapterAlphaMax4806(PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageItemDecorationUltraDeltaEpic7485, PolarVoyageRotateAnimationCyberCelestialDelta47683));
                            String str = (String) (polarVoyageBindingAdapterAlphaMax4806.hasNext() ? polarVoyageBindingAdapterAlphaMax4806.next() : "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i = 2;
                                        PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageRotateAnimationCyberCelestialDelta47683);
                                        if (PolarVoyageRotateAnimationCyberCelestialDelta47682.isEmpty()) {
                                            PolarVoyageAdapterBlazeSpectra6030 PolarVoyageRotateAnimationCyberCelestialDelta47684 = PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageTextInputEditTextNebulaHero6651, PolarVoyageRotateAnimationCyberCelestialDelta47683);
                                            PolarVoyageAdapterBlazeSpectra6030 PolarVoyageRotateAnimationCyberCelestialDelta47685 = PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageDiffUtilTurboStrike5735, PolarVoyageRotateAnimationCyberCelestialDelta47683);
                                            if (PolarVoyageRotateAnimationCyberCelestialDelta47684.isEmpty() && PolarVoyageRotateAnimationCyberCelestialDelta47685.isEmpty()) {
                                                polarVoyageFragmentManagerDeltaPrime6059 = new PolarVoyageFragmentManagerDeltaPrime6059(-1, 0, i);
                                            } else {
                                                PolarVoyageBindingAdapterAlphaMax4806 polarVoyageBindingAdapterAlphaMax48062 = new PolarVoyageBindingAdapterAlphaMax4806(PolarVoyageRotateAnimationCyberCelestialDelta47684);
                                                String str2 = (String) (polarVoyageBindingAdapterAlphaMax48062.hasNext() ? polarVoyageBindingAdapterAlphaMax48062.next() : "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i2 = 2;
                                                    PolarVoyageBindingAdapterAlphaMax4806 polarVoyageBindingAdapterAlphaMax48063 = new PolarVoyageBindingAdapterAlphaMax4806(PolarVoyageRotateAnimationCyberCelestialDelta47685);
                                                    String str3 = (String) (!polarVoyageBindingAdapterAlphaMax48063.hasNext() ? polarVoyageBindingAdapterAlphaMax48063.next() : "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i3 = 2;
                                                            polarVoyageFragmentManagerDeltaPrime6059 = new PolarVoyageFragmentManagerDeltaPrime6059(i3, i2, i);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i3 = 3;
                                                        polarVoyageFragmentManagerDeltaPrime6059 = new PolarVoyageFragmentManagerDeltaPrime6059(i3, i2, i);
                                                    }
                                                    i3 = 1;
                                                    polarVoyageFragmentManagerDeltaPrime6059 = new PolarVoyageFragmentManagerDeltaPrime6059(i3, i2, i);
                                                }
                                                i2 = 1;
                                                PolarVoyageBindingAdapterAlphaMax4806 polarVoyageBindingAdapterAlphaMax480632 = new PolarVoyageBindingAdapterAlphaMax4806(PolarVoyageRotateAnimationCyberCelestialDelta47685);
                                                String str32 = (String) (!polarVoyageBindingAdapterAlphaMax480632.hasNext() ? polarVoyageBindingAdapterAlphaMax480632.next() : "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i3 = 1;
                                                polarVoyageFragmentManagerDeltaPrime6059 = new PolarVoyageFragmentManagerDeltaPrime6059(i3, i2, i);
                                            }
                                        } else {
                                            String str4 = (String) new PolarVoyageBindingAdapterAlphaMax4806(PolarVoyageRotateAnimationCyberCelestialDelta47682).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i4 = 0;
                                                polarVoyageFragmentManagerDeltaPrime6059 = new PolarVoyageFragmentManagerDeltaPrime6059(i4, 0, i);
                                            }
                                            i4 = -1;
                                            polarVoyageFragmentManagerDeltaPrime6059 = new PolarVoyageFragmentManagerDeltaPrime6059(i4, 0, i);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i = -2;
                                    PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageRotateAnimationCyberCelestialDelta47683);
                                    if (PolarVoyageRotateAnimationCyberCelestialDelta47682.isEmpty()) {
                                    }
                                }
                                polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFragmentManagerDeltaPrime6059;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i = 1;
                            PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFragmentManagerDeltaPrime6059.PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageRotateAnimationCyberCelestialDelta47683);
                            if (PolarVoyageRotateAnimationCyberCelestialDelta47682.isEmpty()) {
                            }
                            polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFragmentManagerDeltaPrime6059;
                        }
                    }
                    polarVoyageFragmentManagerDeltaPrime6059 = null;
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFragmentManagerDeltaPrime6059;
                    break;
                case 14:
                    String PolarVoyageFlingGestureEclipsePrimeMax13766 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(attributeValue);
                    PolarVoyageFlingGestureEclipsePrimeMax13766.getClass();
                    if (PolarVoyageFlingGestureEclipsePrimeMax13766.equals("before")) {
                        polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageDrawableDeltaHyperion5742 = 1;
                        break;
                    } else if (PolarVoyageFlingGestureEclipsePrimeMax13766.equals("after")) {
                        polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageDrawableDeltaHyperion5742 = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    try {
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageCombineOlympianCosmos3121.PolarVoyageZipVortexCelestial6185(attributeValue, false);
                        polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageBitmapVisionAuroraPixel4705 = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    polarVoyageGradlePluginHyperionPulseStrike74402 = PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginHyperionPulseStrike74402);
                    String PolarVoyageFlingGestureEclipsePrimeMax13767 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(attributeValue);
                    PolarVoyageFlingGestureEclipsePrimeMax13767.getClass();
                    switch (PolarVoyageFlingGestureEclipsePrimeMax13767.hashCode()) {
                        case -1364013995:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13767.equals("center")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 100571:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13767.equals("end")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3317767:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13767.equals("left")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108511772:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13767.equals("right")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109757538:
                            if (PolarVoyageFlingGestureEclipsePrimeMax13767.equals("start")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageContentProviderHyperSpark3838 = alignment;
                    break;
            }
        }
        return polarVoyageGradlePluginHyperionPulseStrike74402;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static PolarVoyageLaunchTitanHyperPhoenix7302 PolarVoyageStrictModeLegendEpic1532(XmlPullParser xmlPullParser, PolarVoyageLaunchTitanHyperPhoenix7302 polarVoyageLaunchTitanHyperPhoenix7302, HashMap hashMap, PolarVoyageJavaPhantomBlaze7410 polarVoyageJavaPhantomBlaze7410) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        PolarVoyageGradlePluginHyperionPulseStrike7440 PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = PolarVoyageBottomSheetOmegaNeo1907(attributeValue, polarVoyageJavaPhantomBlaze7410);
                    break;
                case 2:
                    j3 = PolarVoyageBottomSheetOmegaNeo1907(attributeValue, polarVoyageJavaPhantomBlaze7410);
                    break;
                case 3:
                    j2 = PolarVoyageBottomSheetOmegaNeo1907(attributeValue, polarVoyageJavaPhantomBlaze7410);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (polarVoyageLaunchTitanHyperPhoenix7302 != null) {
            long j5 = polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 == -9223372036854775807L) {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (polarVoyageLaunchTitanHyperPhoenix7302 != null) {
                long j6 = polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageBitmapVisionAuroraPixel4705;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new PolarVoyageLaunchTitanHyperPhoenix7302(xmlPullParser.getName(), null, j2, j, PolarVoyageRotateAnimationCyberCelestialDelta47682, strArr, str2, str, polarVoyageLaunchTitanHyperPhoenix7302);
                }
            }
        }
        j = j3;
        return new PolarVoyageLaunchTitanHyperPhoenix7302(xmlPullParser.getName(), null, j2, j, PolarVoyageRotateAnimationCyberCelestialDelta47682, strArr, str2, str, polarVoyageLaunchTitanHyperPhoenix7302);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageTextInputEditTextNebulaHero6651(XmlPullParser xmlPullParser, HashMap hashMap, int i, PolarVoyageResourcePhoenixMaster2270 polarVoyageResourcePhoenixMaster2270, HashMap hashMap2, HashMap hashMap3) {
        String PolarVoyageDiffUtilTurboStrike5735;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        String PolarVoyageDiffUtilTurboStrike57352;
        int i3;
        PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123 polarVoyageDigitalInkRecognitionAuroraDeltaMega8123;
        char c;
        float parseFloat;
        float parseFloat2;
        String PolarVoyageDiffUtilTurboStrike57353;
        PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike7440;
        String PolarVoyageDiffUtilTurboStrike57354;
        PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike74402;
        String[] split;
        do {
            xmlPullParser.next();
            if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(xmlPullParser, "style")) {
                String PolarVoyageDiffUtilTurboStrike57355 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "style");
                PolarVoyageGradlePluginHyperionPulseStrike7440 PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768(xmlPullParser, new PolarVoyageGradlePluginHyperionPulseStrike7440());
                if (PolarVoyageDiffUtilTurboStrike57355 != null) {
                    String trim = PolarVoyageDiffUtilTurboStrike57355.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        PolarVoyageRotateAnimationCyberCelestialDelta47682.PolarVoyageZipVortexCelestial6185((PolarVoyageGradlePluginHyperionPulseStrike7440) hashMap.get(str2));
                    }
                }
                String str3 = PolarVoyageRotateAnimationCyberCelestialDelta47682.PolarVoyageViewRogueMaster4778;
                if (str3 != null) {
                    hashMap.put(str3, PolarVoyageRotateAnimationCyberCelestialDelta47682);
                }
            } else if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(xmlPullParser, "region")) {
                String PolarVoyageDiffUtilTurboStrike57356 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "id");
                if (PolarVoyageDiffUtilTurboStrike57356 != null) {
                    String PolarVoyageDiffUtilTurboStrike57357 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "origin");
                    if (PolarVoyageDiffUtilTurboStrike57357 == null && (PolarVoyageDiffUtilTurboStrike57354 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "style")) != null && (polarVoyageGradlePluginHyperionPulseStrike74402 = (PolarVoyageGradlePluginHyperionPulseStrike7440) hashMap.get(PolarVoyageDiffUtilTurboStrike57354)) != null) {
                        PolarVoyageDiffUtilTurboStrike57357 = polarVoyageGradlePluginHyperionPulseStrike74402.PolarVoyageBitmapMaxTitanTitan7960;
                    }
                    int i4 = 2;
                    Pattern pattern = PolarVoyageDrawableDeltaHyperion5742;
                    Pattern pattern2 = PolarVoyageCameraPixelBlaze2629;
                    if (PolarVoyageDiffUtilTurboStrike57357 != null) {
                        Matcher matcher = pattern2.matcher(PolarVoyageDiffUtilTurboStrike57357);
                        Matcher matcher2 = pattern.matcher(PolarVoyageDiffUtilTurboStrike57357);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f3 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f2 = Float.parseFloat(group2) / 100.0f;
                                f = 100.0f;
                            } catch (NumberFormatException unused) {
                                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring region with malformed origin: ".concat(PolarVoyageDiffUtilTurboStrike57357));
                            }
                        } else if (!matcher2.matches()) {
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring region with unsupported origin: ".concat(PolarVoyageDiffUtilTurboStrike57357));
                        } else if (polarVoyageResourcePhoenixMaster2270 == null) {
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring region with missing tts:extent: ".concat(PolarVoyageDiffUtilTurboStrike57357));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f = 100.0f;
                                float f7 = parseInt / polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185;
                                float parseInt2 = Integer.parseInt(group4) / polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                f3 = f7;
                                f2 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring region with malformed origin: ".concat(PolarVoyageDiffUtilTurboStrike57357));
                            }
                        }
                    } else {
                        f = 100.0f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    String PolarVoyageDiffUtilTurboStrike57358 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "extent");
                    if (PolarVoyageDiffUtilTurboStrike57358 == null && (PolarVoyageDiffUtilTurboStrike57353 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "style")) != null && (polarVoyageGradlePluginHyperionPulseStrike7440 = (PolarVoyageGradlePluginHyperionPulseStrike7440) hashMap.get(PolarVoyageDiffUtilTurboStrike57353)) != null) {
                        PolarVoyageDiffUtilTurboStrike57358 = polarVoyageGradlePluginHyperionPulseStrike7440.PolarVoyageDisplayMetricsVortexDragon9516;
                    }
                    if (PolarVoyageDiffUtilTurboStrike57358 != null) {
                        Matcher matcher3 = pattern2.matcher(PolarVoyageDiffUtilTurboStrike57358);
                        Matcher matcher4 = pattern.matcher(PolarVoyageDiffUtilTurboStrike57358);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f;
                            } catch (NumberFormatException unused3) {
                                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Ignoring region with malformed extent: ", PolarVoyageDiffUtilTurboStrike57357, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Ignoring region with unsupported extent: ", PolarVoyageDiffUtilTurboStrike57357, "TtmlParser");
                        } else if (polarVoyageResourcePhoenixMaster2270 == null) {
                            PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Ignoring region with missing tts:extent: ", PolarVoyageDiffUtilTurboStrike57357, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f8 = parseInt3 / polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185;
                            parseFloat2 = Integer.parseInt(group8) / polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            parseFloat = f8;
                        }
                        f4 = parseFloat;
                        f5 = parseFloat2;
                    } else {
                        f4 = 1.0f;
                        f5 = 1.0f;
                    }
                    String PolarVoyageDiffUtilTurboStrike57359 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "displayAlign");
                    if (PolarVoyageDiffUtilTurboStrike57359 != null) {
                        String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(PolarVoyageDiffUtilTurboStrike57359);
                        PolarVoyageFlingGestureEclipsePrimeMax1376.getClass();
                        if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("center")) {
                            f6 = f2 + (f5 / 2.0f);
                            i2 = 1;
                        } else if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("after")) {
                            f6 = f2 + f5;
                            i2 = 2;
                        }
                        float f9 = 1.0f / i;
                        PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "writingMode");
                        if (PolarVoyageDiffUtilTurboStrike57352 != null) {
                            String PolarVoyageFlingGestureEclipsePrimeMax13762 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(PolarVoyageDiffUtilTurboStrike57352);
                            PolarVoyageFlingGestureEclipsePrimeMax13762.getClass();
                            switch (PolarVoyageFlingGestureEclipsePrimeMax13762.hashCode()) {
                                case 3694:
                                    if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("tb")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3553396:
                                    if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("tblr")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3553576:
                                    if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("tbrl")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                case 1:
                                    i3 = i4;
                                    break;
                                case 2:
                                    i3 = 1;
                                    break;
                            }
                            polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 = new PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123(PolarVoyageDiffUtilTurboStrike57356, f3, f6, 0, i2, f4, f5, 1, f9, i3);
                            if (polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 != null) {
                                hashMap2.put(polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.PolarVoyageZipVortexCelestial6185, polarVoyageDigitalInkRecognitionAuroraDeltaMega8123);
                            }
                        }
                        i4 = Integer.MIN_VALUE;
                        i3 = i4;
                        polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 = new PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123(PolarVoyageDiffUtilTurboStrike57356, f3, f6, 0, i2, f4, f5, 1, f9, i3);
                        if (polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 != null) {
                        }
                    }
                    f6 = f2;
                    i2 = 0;
                    float f92 = 1.0f / i;
                    PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "writingMode");
                    if (PolarVoyageDiffUtilTurboStrike57352 != null) {
                    }
                    i4 = Integer.MIN_VALUE;
                    i3 = i4;
                    polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 = new PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123(PolarVoyageDiffUtilTurboStrike57356, f3, f6, 0, i2, f4, f5, 1, f92, i3);
                    if (polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 != null) {
                    }
                }
                polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 = null;
                if (polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 != null) {
                }
            } else if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(xmlPullParser, "image") && (PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "id")) != null) {
                        hashMap3.put(PolarVoyageDiffUtilTurboStrike5735, xmlPullParser.nextText());
                    }
                } while (!PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageItemDecorationUltraDeltaEpic7485(xmlPullParser, "metadata"));
            }
        } while (!PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageItemDecorationUltraDeltaEpic7485(xmlPullParser, "head"));
    }

    public static PolarVoyageResourcePhoenixMaster2270 PolarVoyageViewRogueMaster4778(XmlPullParser xmlPullParser) {
        String PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, "extent");
        if (PolarVoyageDiffUtilTurboStrike5735 == null) {
            return null;
        }
        Matcher matcher = PolarVoyageDrawableDeltaHyperion5742.matcher(PolarVoyageDiffUtilTurboStrike5735);
        if (!matcher.matches()) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring non-pixel tts extent: ".concat(PolarVoyageDiffUtilTurboStrike5735));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new PolarVoyageResourcePhoenixMaster2270(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TtmlParser", "Ignoring malformed tts extent: ".concat(PolarVoyageDiffUtilTurboStrike5735));
            return null;
        }
    }

    public static PolarVoyageGradlePluginHyperionPulseStrike7440 PolarVoyageZipVortexCelestial6185(PolarVoyageGradlePluginHyperionPulseStrike7440 polarVoyageGradlePluginHyperionPulseStrike7440) {
        return polarVoyageGradlePluginHyperionPulseStrike7440 == null ? new PolarVoyageGradlePluginHyperionPulseStrike7440() : polarVoyageGradlePluginHyperionPulseStrike7440;
    }

    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    public final PolarVoyageBottomSheetInfernoOmega3378 PolarVoyageBitmapVisionAuroraPixel4705(byte[] bArr, int i, int i2) {
        try {
            XmlPullParser newPullParser = this.PolarVoyageItemDecorationUltraDeltaEpic7485.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            PolarVoyageResourcePhoenixMaster2270 polarVoyageResourcePhoenixMaster2270 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            PolarVoyageJavaPhantomBlaze7410 polarVoyageJavaPhantomBlaze7410 = PolarVoyageContentProviderHyperSpark3838;
            int i3 = 0;
            int i4 = 15;
            PolarVoyageServiceUltraUltraNeo9663 polarVoyageServiceUltraUltraNeo9663 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                PolarVoyageLaunchTitanHyperPhoenix7302 polarVoyageLaunchTitanHyperPhoenix7302 = (PolarVoyageLaunchTitanHyperPhoenix7302) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            polarVoyageJavaPhantomBlaze7410 = PolarVoyageDiffUtilTurboStrike5735(newPullParser);
                            i4 = PolarVoyageKotlinBetaPulseBeta3653(newPullParser);
                            polarVoyageResourcePhoenixMaster2270 = PolarVoyageViewRogueMaster4778(newPullParser);
                        }
                        PolarVoyageJavaPhantomBlaze7410 polarVoyageJavaPhantomBlaze74102 = polarVoyageJavaPhantomBlaze7410;
                        PolarVoyageResourcePhoenixMaster2270 polarVoyageResourcePhoenixMaster22702 = polarVoyageResourcePhoenixMaster2270;
                        int i5 = i4;
                        if (PolarVoyageMotionLayoutTransitionHeroVision4068(name)) {
                            if ("head".equals(name)) {
                                PolarVoyageTextInputEditTextNebulaHero6651(newPullParser, hashMap, i5, polarVoyageResourcePhoenixMaster22702, hashMap2, hashMap3);
                            } else {
                                try {
                                    PolarVoyageLaunchTitanHyperPhoenix7302 PolarVoyageStrictModeLegendEpic15322 = PolarVoyageStrictModeLegendEpic1532(newPullParser, polarVoyageLaunchTitanHyperPhoenix7302, hashMap2, polarVoyageJavaPhantomBlaze74102);
                                    arrayDeque.push(PolarVoyageStrictModeLegendEpic15322);
                                    if (polarVoyageLaunchTitanHyperPhoenix7302 != null) {
                                        if (polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageCameraPixelBlaze2629 == null) {
                                            polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageCameraPixelBlaze2629 = new ArrayList();
                                        }
                                        polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageCameraPixelBlaze2629.add(PolarVoyageStrictModeLegendEpic15322);
                                    }
                                } catch (PolarVoyageMotionLayoutGammaNeo3391 e) {
                                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("TtmlParser", "Suppressing parser error", e);
                                }
                            }
                            i4 = i5;
                            polarVoyageResourcePhoenixMaster2270 = polarVoyageResourcePhoenixMaster22702;
                            polarVoyageJavaPhantomBlaze7410 = polarVoyageJavaPhantomBlaze74102;
                        } else {
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i3++;
                        i4 = i5;
                        polarVoyageResourcePhoenixMaster2270 = polarVoyageResourcePhoenixMaster22702;
                        polarVoyageJavaPhantomBlaze7410 = polarVoyageJavaPhantomBlaze74102;
                    } else if (eventType == 4) {
                        polarVoyageLaunchTitanHyperPhoenix7302.getClass();
                        PolarVoyageLaunchTitanHyperPhoenix7302 PolarVoyageZipVortexCelestial6185 = PolarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageZipVortexCelestial6185(newPullParser.getText());
                        if (polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageCameraPixelBlaze2629 == null) {
                            polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageCameraPixelBlaze2629 = new ArrayList();
                        }
                        polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageCameraPixelBlaze2629.add(PolarVoyageZipVortexCelestial6185);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            PolarVoyageLaunchTitanHyperPhoenix7302 polarVoyageLaunchTitanHyperPhoenix73022 = (PolarVoyageLaunchTitanHyperPhoenix7302) arrayDeque.peek();
                            polarVoyageLaunchTitanHyperPhoenix73022.getClass();
                            polarVoyageServiceUltraUltraNeo9663 = new PolarVoyageServiceUltraUltraNeo9663(polarVoyageLaunchTitanHyperPhoenix73022, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                newPullParser.next();
            }
            polarVoyageServiceUltraUltraNeo9663.getClass();
            return polarVoyageServiceUltraUltraNeo9663;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i, int i2, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        PolarVoyageTransformNeoTitanium1654.PolarVoyageGuidelineStormSolar2850(PolarVoyageBitmapVisionAuroraPixel4705(bArr, i, i2), polarVoyageProximitySensorNovaXStrikeSolar8705, polarVoyageScaleAnimationVortexAurora2886);
    }
}
