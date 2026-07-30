package p000createpolar;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageChipHyperPhoenixNebula7861 {
    public static final Map PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final Map PolarVoyageKotlinBetaPulseBeta3653;
    public static final Pattern PolarVoyageZipVortexCelestial6185 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern PolarVoyageMotionLayoutTransitionHeroVision4068 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        PolarVoyageKotlinBetaPulseBeta3653 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Collections.unmodifiableMap(hashMap2);
    }

    public static PolarVoyageViewPager2InfernoNebula3418 PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str, Matcher matcher, PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312, ArrayList arrayList) {
        PolarVoyagePaintFlagsDrawFilterPulseRogue3875 polarVoyagePaintFlagsDrawFilterPulseRogue3875 = new PolarVoyagePaintFlagsDrawFilterPulseRogue3875();
        try {
            String group = matcher.group(1);
            group.getClass();
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageZipVortexCelestial6185 = PolarVoyageOnAttachStateChangeListenerTurboUltraPulse3911.PolarVoyageMotionLayoutTransitionHeroVision4068(group);
            String group2 = matcher.group(2);
            group2.getClass();
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageOnAttachStateChangeListenerTurboUltraPulse3911.PolarVoyageMotionLayoutTransitionHeroVision4068(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            PolarVoyageBitmapVisionAuroraPixel4705(group3, polarVoyagePaintFlagsDrawFilterPulseRogue3875);
            StringBuilder sb = new StringBuilder();
            polarVoyageTextRecognitionHeroOmega1312.getClass();
            String PolarVoyageDrawableDeltaHyperion5742 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(PolarVoyageDrawableDeltaHyperion5742)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(PolarVoyageDrawableDeltaHyperion5742.trim());
                PolarVoyageDrawableDeltaHyperion5742 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(StandardCharsets.UTF_8);
            }
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageDiffUtilTurboStrike5735(str, sb.toString(), arrayList);
            return new PolarVoyageViewPager2InfernoNebula3418(polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageZipVortexCelestial6185().PolarVoyageZipVortexCelestial6185(), polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageZipVortexCelestial6185, polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageMotionLayoutTransitionHeroVision4068);
        } catch (IllegalArgumentException unused) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0081, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageBitmapVisionAuroraPixel4705(String str, PolarVoyagePaintFlagsDrawFilterPulseRogue3875 polarVoyagePaintFlagsDrawFilterPulseRogue3875) {
        int i;
        int i2;
        int i3;
        Matcher matcher = PolarVoyageMotionLayoutTransitionHeroVision4068.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    PolarVoyageTextInputEditTextNebulaHero6651(group2, polarVoyagePaintFlagsDrawFilterPulseRogue3875);
                } else {
                    char c = 5;
                    boolean z = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z = 5;
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
                            case true:
                                i = 2;
                                break;
                            case true:
                                i = 3;
                                break;
                            case true:
                                i = 4;
                                break;
                            case true:
                                i = 5;
                                break;
                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                i = 1;
                                break;
                            default:
                                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i = 2;
                                break;
                        }
                        polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                    i2 = 0;
                                    break;
                                case 1:
                                case 3:
                                    i2 = 1;
                                    break;
                                case 2:
                                case 4:
                                    i2 = 2;
                                    break;
                                default:
                                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageStrictModeLegendEpic1532 = i2;
                            group2 = group2.substring(0, indexOf);
                        }
                        polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageOnAttachStateChangeListenerTurboUltraPulse3911.PolarVoyageZipVortexCelestial6185(group2);
                    } else if ("size".equals(group)) {
                        polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageOnAttachStateChangeListenerTurboUltraPulse3911.PolarVoyageZipVortexCelestial6185(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i3 = 2;
                        } else if (group2.equals("rl")) {
                            i3 = 1;
                        } else {
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i3 = Integer.MIN_VALUE;
                        }
                        polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageBottomSheetOmegaNeo1907 = i3;
                    } else {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString PolarVoyageDiffUtilTurboStrike5735(String str, String str2, List list) {
        char c;
        char c2;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    PolarVoyageZipVortexCelestial6185(str, (PolarVoyageRotateDrawableEliteSolar5839) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                PolarVoyageZipVortexCelestial6185(str, new PolarVoyageRotateDrawableEliteSolar5839("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(!trim.isEmpty());
                        String str4 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case 98:
                                if (str5.equals("b")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 99:
                                if (str5.equals("c")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 105:
                                if (str5.equals("i")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 117:
                                if (str5.equals("u")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 118:
                                if (str5.equals("v")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3314158:
                                if (str5.equals("lang")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
                                    c = 7;
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
                            case 2:
                            case 3:
                            case 4:
                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        PolarVoyageRotateDrawableEliteSolar5839 polarVoyageRotateDrawableEliteSolar5839 = (PolarVoyageRotateDrawableEliteSolar5839) arrayDeque.pop();
                                        PolarVoyageZipVortexCelestial6185(str, polarVoyageRotateDrawableEliteSolar5839, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new PolarVoyageMotionSceneFusionForcePhantom2671(polarVoyageRotateDrawableEliteSolar5839, spannableStringBuilder.length()));
                                        }
                                        if (polarVoyageRotateDrawableEliteSolar5839.PolarVoyageZipVortexCelestial6185.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c2 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c2 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c2];
                                    HashSet hashSet = new HashSet();
                                    for (int i5 = 1; i5 < split.length; i5++) {
                                        hashSet.add(split[i5]);
                                    }
                                    arrayDeque.push(new PolarVoyageRotateDrawableEliteSolar5839(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = i2;
            }
        }
    }

    public static int PolarVoyageKotlinBetaPulseBeta3653(List list, String str, PolarVoyageRotateDrawableEliteSolar5839 polarVoyageRotateDrawableEliteSolar5839) {
        ArrayList PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageMotionLayoutTransitionHeroVision4068(list, str, polarVoyageRotateDrawableEliteSolar5839);
        for (int i = 0; i < PolarVoyageMotionLayoutTransitionHeroVision40682.size(); i++) {
            int i2 = ((PolarVoyageBroadcastReceiverRogueSolarSpeed9264) PolarVoyageMotionLayoutTransitionHeroVision40682.get(i)).PolarVoyageStrictModeLegendEpic1532.PolarVoyageContentProviderHyperSpark3838;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068(List list, String str, PolarVoyageRotateDrawableEliteSolar5839 polarVoyageRotateDrawableEliteSolar5839) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115 polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115 = (PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115) list.get(i);
            String str2 = polarVoyageRotateDrawableEliteSolar5839.PolarVoyageZipVortexCelestial6185;
            Set set = polarVoyageRotateDrawableEliteSolar5839.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            String str3 = polarVoyageRotateDrawableEliteSolar5839.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageZipVortexCelestial6185.isEmpty() && polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageMotionLayoutTransitionHeroVision4068.isEmpty() && polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageKotlinBetaPulseBeta3653.isEmpty() && polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBarcodeScannerInfernoSolarSpark7767.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int PolarVoyageZipVortexCelestial61852 = PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageZipVortexCelestial6185(PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageZipVortexCelestial6185(PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageZipVortexCelestial6185(0, 1073741824, polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageZipVortexCelestial6185, str), 2, polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageMotionLayoutTransitionHeroVision4068, str2), 4, polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBarcodeScannerInfernoSolarSpark7767, str3);
                size = (PolarVoyageZipVortexCelestial61852 == -1 || !set.containsAll(polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageKotlinBetaPulseBeta3653)) ? 0 : PolarVoyageZipVortexCelestial61852 + (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageKotlinBetaPulseBeta3653.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new PolarVoyageBroadcastReceiverRogueSolarSpeed9264(size, polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void PolarVoyageTextInputEditTextNebulaHero6651(String str, PolarVoyagePaintFlagsDrawFilterPulseRogue3875 polarVoyagePaintFlagsDrawFilterPulseRogue3875) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageTextInputEditTextNebulaHero6651 = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageOnAttachStateChangeListenerTurboUltraPulse3911.PolarVoyageZipVortexCelestial6185(str);
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageDiffUtilTurboStrike5735 = 0;
        } else {
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageBitmapVisionAuroraPixel4705 = Integer.parseInt(str);
            polarVoyagePaintFlagsDrawFilterPulseRogue3875.PolarVoyageDiffUtilTurboStrike5735 = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void PolarVoyageZipVortexCelestial6185(String str, PolarVoyageRotateDrawableEliteSolar5839 polarVoyageRotateDrawableEliteSolar5839, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        int i;
        int i2;
        int i3;
        int i4 = polarVoyageRotateDrawableEliteSolar5839.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int length = spannableStringBuilder.length();
        String str2 = polarVoyageRotateDrawableEliteSolar5839.PolarVoyageZipVortexCelestial6185;
        str2.getClass();
        int i5 = -1;
        switch (str2.hashCode()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
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
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case 2:
                for (String str3 : polarVoyageRotateDrawableEliteSolar5839.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                    Map map = PolarVoyageKotlinBetaPulseBeta3653;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                spannableStringBuilder.setSpan(new PolarVoyageClipboardManagerCosmosNovaMaster1319(polarVoyageRotateDrawableEliteSolar5839.PolarVoyageKotlinBetaPulseBeta3653), i4, length, 33);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                int PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageKotlinBetaPulseBeta3653(list2, str, polarVoyageRotateDrawableEliteSolar5839);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, PolarVoyageMotionSceneFusionForcePhantom2671.PolarVoyageKotlinBetaPulseBeta3653);
                int i6 = polarVoyageRotateDrawableEliteSolar5839.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i7 = 0;
                int i8 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((PolarVoyageMotionSceneFusionForcePhantom2671) arrayList.get(i7)).PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185)) {
                        PolarVoyageMotionSceneFusionForcePhantom2671 polarVoyageMotionSceneFusionForcePhantom2671 = (PolarVoyageMotionSceneFusionForcePhantom2671) arrayList.get(i7);
                        int PolarVoyageKotlinBetaPulseBeta36533 = PolarVoyageKotlinBetaPulseBeta3653(list2, str, polarVoyageMotionSceneFusionForcePhantom2671.PolarVoyageZipVortexCelestial6185);
                        if (PolarVoyageKotlinBetaPulseBeta36533 == i5) {
                            PolarVoyageKotlinBetaPulseBeta36533 = PolarVoyageKotlinBetaPulseBeta36532 != i5 ? PolarVoyageKotlinBetaPulseBeta36532 : 1;
                        }
                        int i9 = polarVoyageMotionSceneFusionForcePhantom2671.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068 - i8;
                        int i10 = polarVoyageMotionSceneFusionForcePhantom2671.PolarVoyageMotionLayoutTransitionHeroVision4068 - i8;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new PolarVoyageLooperThreadFusionNovaX4589(subSequence.toString(), PolarVoyageKotlinBetaPulseBeta36533), i6, i9, 33);
                        i8 = subSequence.length() + i8;
                        i6 = i9;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageMotionLayoutTransitionHeroVision4068(list2, str, polarVoyageRotateDrawableEliteSolar5839);
        for (int i11 = 0; i11 < PolarVoyageMotionLayoutTransitionHeroVision40682.size(); i11++) {
            PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115 polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115 = ((PolarVoyageBroadcastReceiverRogueSolarSpeed9264) PolarVoyageMotionLayoutTransitionHeroVision40682.get(i11)).PolarVoyageStrictModeLegendEpic1532;
            int i12 = polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageViewRogueMaster4778;
            if (i12 == -1 && polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageCameraPixelBlaze2629 == -1) {
                i = -1;
            } else {
                i = (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageCameraPixelBlaze2629 == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageViewRogueMaster4778;
                if (i13 == -1 && polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageCameraPixelBlaze2629 == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageCameraPixelBlaze2629 == 1 ? 2 : 0);
                }
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageZipVortexCelestial6185(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageRotateAnimationCyberCelestialDelta4768 == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBottomSheetOmegaNeo1907 == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageTextInputEditTextNebulaHero6651) {
                if (!polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageTextInputEditTextNebulaHero6651) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Font color not defined");
                    return;
                }
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageZipVortexCelestial6185(spannableStringBuilder, new ForegroundColorSpan(polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageDiffUtilTurboStrike5735), i4, length);
            }
            if (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageStrictModeLegendEpic1532) {
                if (!polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageStrictModeLegendEpic1532) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Background color not defined.");
                    return;
                }
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageZipVortexCelestial6185(spannableStringBuilder, new BackgroundColorSpan(polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageItemDecorationUltraDeltaEpic7485), i4, length);
            }
            if (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBitmapVisionAuroraPixel4705 != null) {
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageZipVortexCelestial6185(spannableStringBuilder, new TypefaceSpan(polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBitmapVisionAuroraPixel4705), i4, length);
            }
            int i14 = polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageDrawableDeltaHyperion5742;
            if (i14 == 1) {
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageZipVortexCelestial6185(spannableStringBuilder, new AbsoluteSizeSpan((int) polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageSnackbarGammaEclipse2140, true), i4, length);
            } else if (i14 == 2) {
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageZipVortexCelestial6185(spannableStringBuilder, new RelativeSizeSpan(polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageSnackbarGammaEclipse2140), i4, length);
            } else if (i14 == 3) {
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageZipVortexCelestial6185(spannableStringBuilder, new RelativeSizeSpan(polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageSnackbarGammaEclipse2140 / 100.0f), i4, length);
            }
            if (polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                spannableStringBuilder.setSpan(new PolarVoyageActionBarHeroNebulaPulse5673(), i4, length, 33);
            }
        }
    }
}
