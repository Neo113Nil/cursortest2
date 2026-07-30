package p000createpolar;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlowOnTitaniumVortexPixel6888 implements PolarVoyageFlowMaxTitanAlpha3096 {
    public static final Pattern PolarVoyageDrawableDeltaHyperion5742 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public LinkedHashMap PolarVoyageBottomSheetOmegaNeo1907;
    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageCameraSelectorMegaHyperion6530 PolarVoyageStrictModeLegendEpic1532;
    public float PolarVoyageViewRogueMaster4778 = -3.4028235E38f;
    public float PolarVoyageCameraPixelBlaze2629 = -3.4028235E38f;
    public final PolarVoyageTextRecognitionHeroOmega1312 PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageTextRecognitionHeroOmega1312();

    public PolarVoyageFlowOnTitaniumVortexPixel6888(List list) {
        if (list == null || list.isEmpty()) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
            this.PolarVoyageStrictModeLegendEpic1532 = null;
            return;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(str.startsWith("Format:"));
        PolarVoyageCameraSelectorMegaHyperion6530 PolarVoyageZipVortexCelestial6185 = PolarVoyageCameraSelectorMegaHyperion6530.PolarVoyageZipVortexCelestial6185(str);
        PolarVoyageZipVortexCelestial6185.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageZipVortexCelestial6185;
        PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageTextRecognitionHeroOmega1312((byte[]) list.get(1)), charset);
    }

    public static long PolarVoyageKotlinBetaPulseBeta3653(String str) {
        Matcher matcher = PolarVoyageDrawableDeltaHyperion5742.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    public static int PolarVoyageZipVortexCelestial6185(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i, int i2, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        Charset charset;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312;
        PolarVoyageCameraSelectorMegaHyperion6530 polarVoyageCameraSelectorMegaHyperion6530;
        long j;
        int parseInt;
        long PolarVoyageKotlinBetaPulseBeta3653;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i5;
        int i6;
        int i7;
        float f4;
        float f5;
        float f6;
        boolean z;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        float f8;
        int i12;
        int i13;
        int i14;
        PolarVoyageFlowOnTitaniumVortexPixel6888 polarVoyageFlowOnTitaniumVortexPixel6888 = this;
        long j2 = polarVoyageProximitySensorNovaXStrikeSolar8705.PolarVoyageZipVortexCelestial6185;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega13122 = polarVoyageFlowOnTitaniumVortexPixel6888.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, i + i2);
        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i);
        Charset PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149();
        if (PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 == null) {
            PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = StandardCharsets.UTF_8;
        }
        boolean z2 = polarVoyageFlowOnTitaniumVortexPixel6888.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (!z2) {
            polarVoyageFlowOnTitaniumVortexPixel6888.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextRecognitionHeroOmega13122, PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149);
        }
        PolarVoyageCameraSelectorMegaHyperion6530 polarVoyageCameraSelectorMegaHyperion65302 = z2 ? polarVoyageFlowOnTitaniumVortexPixel6888.PolarVoyageStrictModeLegendEpic1532 : null;
        while (true) {
            String PolarVoyageDrawableDeltaHyperion57422 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149);
            if (PolarVoyageDrawableDeltaHyperion57422 == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !polarVoyageProximitySensorNovaXStrikeSolar8705.PolarVoyageMotionLayoutTransitionHeroVision4068) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                            return;
                        }
                        long longValue = ((Long) arrayList2.get(i15)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision9846 = new PolarVoyageConstraintSetCloneOlympianMegaVision9846(longValue, longValue2 - longValue, list);
                        if (j3 == -9223372036854775807L || longValue2 >= j3) {
                            polarVoyageScaleAnimationVortexAurora2886.accept(polarVoyageConstraintSetCloneOlympianMegaVision9846);
                        } else if (arrayList3 != null) {
                            arrayList3.add(polarVoyageConstraintSetCloneOlympianMegaVision9846);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList3.get(i16);
                        i16++;
                        polarVoyageScaleAnimationVortexAurora2886.accept((PolarVoyageConstraintSetCloneOlympianMegaVision9846) obj);
                    }
                    return;
                }
                return;
            }
            if (PolarVoyageDrawableDeltaHyperion57422.startsWith("Format:")) {
                polarVoyageCameraSelectorMegaHyperion65302 = PolarVoyageCameraSelectorMegaHyperion6530.PolarVoyageZipVortexCelestial6185(PolarVoyageDrawableDeltaHyperion57422);
            } else {
                if (PolarVoyageDrawableDeltaHyperion57422.startsWith("Dialogue:")) {
                    if (polarVoyageCameraSelectorMegaHyperion65302 == null) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaParser", "Skipping dialogue line before complete format: ".concat(PolarVoyageDrawableDeltaHyperion57422));
                    } else {
                        int i17 = polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageDiffUtilTurboStrike5735;
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(PolarVoyageDrawableDeltaHyperion57422.startsWith("Dialogue:"));
                        String substring = PolarVoyageDrawableDeltaHyperion57422.substring(9);
                        int i18 = polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageZipVortexCelestial6185;
                        String[] split = substring.split(",", i17);
                        if (split.length != i17) {
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(PolarVoyageDrawableDeltaHyperion57422));
                        } else {
                            if (i18 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i18].trim());
                                } catch (RuntimeException unused) {
                                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaParser", "Fail to parse layer: " + split[i18]);
                                }
                                PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(split[polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageMotionLayoutTransitionHeroVision4068]);
                                charset = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                                if (PolarVoyageKotlinBetaPulseBeta3653 != -9223372036854775807L) {
                                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaParser", "Skipping invalid timing: ".concat(PolarVoyageDrawableDeltaHyperion57422));
                                    j = j2;
                                    polarVoyageCameraSelectorMegaHyperion6530 = polarVoyageCameraSelectorMegaHyperion65302;
                                    polarVoyageTextRecognitionHeroOmega1312 = polarVoyageTextRecognitionHeroOmega13122;
                                    polarVoyageFlowOnTitaniumVortexPixel6888 = this;
                                    PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = charset;
                                    j2 = j;
                                    polarVoyageCameraSelectorMegaHyperion65302 = polarVoyageCameraSelectorMegaHyperion6530;
                                    polarVoyageTextRecognitionHeroOmega13122 = polarVoyageTextRecognitionHeroOmega1312;
                                } else {
                                    j = j2;
                                    long PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageKotlinBetaPulseBeta3653(split[polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageKotlinBetaPulseBeta3653]);
                                    if (PolarVoyageKotlinBetaPulseBeta36532 == -9223372036854775807L || PolarVoyageKotlinBetaPulseBeta36532 <= PolarVoyageKotlinBetaPulseBeta3653) {
                                        polarVoyageCameraSelectorMegaHyperion6530 = polarVoyageCameraSelectorMegaHyperion65302;
                                        polarVoyageTextRecognitionHeroOmega1312 = polarVoyageTextRecognitionHeroOmega13122;
                                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaParser", "Skipping invalid timing: ".concat(PolarVoyageDrawableDeltaHyperion57422));
                                    } else {
                                        LinkedHashMap linkedHashMap = polarVoyageFlowOnTitaniumVortexPixel6888.PolarVoyageBottomSheetOmegaNeo1907;
                                        PolarVoyageTraceVisionMega1085 polarVoyageTraceVisionMega1085 = (linkedHashMap == null || (i14 = polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageBarcodeScannerInfernoSolarSpark7767) == -1) ? null : (PolarVoyageTraceVisionMega1085) linkedHashMap.get(split[i14].trim());
                                        String str = split[polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageBitmapVisionAuroraPixel4705];
                                        Matcher matcher = PolarVoyageLayoutPulsePulse3064.PolarVoyageZipVortexCelestial6185.matcher(str);
                                        polarVoyageCameraSelectorMegaHyperion6530 = polarVoyageCameraSelectorMegaHyperion65302;
                                        PointF pointF = null;
                                        int i19 = -1;
                                        while (matcher.find()) {
                                            PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega13123 = polarVoyageTextRecognitionHeroOmega13122;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF PolarVoyageZipVortexCelestial6185 = PolarVoyageLayoutPulsePulse3064.PolarVoyageZipVortexCelestial6185(group);
                                                if (PolarVoyageZipVortexCelestial6185 != null) {
                                                    pointF = PolarVoyageZipVortexCelestial6185;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = PolarVoyageLayoutPulsePulse3064.PolarVoyageBarcodeScannerInfernoSolarSpark7767.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i13 = PolarVoyageTraceVisionMega1085.PolarVoyageZipVortexCelestial6185(group2);
                                                } else {
                                                    i13 = -1;
                                                }
                                                if (i13 != -1) {
                                                    i19 = i13;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            polarVoyageTextRecognitionHeroOmega13122 = polarVoyageTextRecognitionHeroOmega13123;
                                        }
                                        polarVoyageTextRecognitionHeroOmega1312 = polarVoyageTextRecognitionHeroOmega13122;
                                        String replace = PolarVoyageLayoutPulsePulse3064.PolarVoyageZipVortexCelestial6185.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f9 = polarVoyageFlowOnTitaniumVortexPixel6888.PolarVoyageViewRogueMaster4778;
                                        float f10 = polarVoyageFlowOnTitaniumVortexPixel6888.PolarVoyageCameraPixelBlaze2629;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (polarVoyageTraceVisionMega1085 != null) {
                                            boolean z3 = polarVoyageTraceVisionMega1085.PolarVoyageTextInputEditTextNebulaHero6651;
                                            Integer num = polarVoyageTraceVisionMega1085.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                            Integer num2 = polarVoyageTraceVisionMega1085.PolarVoyageKotlinBetaPulseBeta3653;
                                            if (num2 != null) {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                            }
                                            if (polarVoyageTraceVisionMega1085.PolarVoyageRotateAnimationCyberCelestialDelta4768 == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i9, spannableString.length(), i8);
                                            }
                                            float f11 = polarVoyageTraceVisionMega1085.PolarVoyageBitmapVisionAuroraPixel4705;
                                            if (f11 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                                f7 = -3.4028235E38f;
                                                i10 = Integer.MIN_VALUE;
                                            } else {
                                                f7 = f11 / f2;
                                                i10 = 1;
                                            }
                                            boolean z4 = polarVoyageTraceVisionMega1085.PolarVoyageDiffUtilTurboStrike5735;
                                            if (z4 && z) {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                if (z4) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (polarVoyageTraceVisionMega1085.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                                                spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i12);
                                            }
                                            if (polarVoyageTraceVisionMega1085.PolarVoyageStrictModeLegendEpic1532) {
                                                spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i12);
                                            }
                                            i4 = i11;
                                            f3 = f8;
                                        } else {
                                            f = f9;
                                            f2 = f10;
                                            i3 = 0;
                                            f3 = -3.4028235E38f;
                                            i4 = Integer.MIN_VALUE;
                                        }
                                        if (i19 == -1) {
                                            i19 = polarVoyageTraceVisionMega1085 != null ? polarVoyageTraceVisionMega1085.PolarVoyageMotionLayoutTransitionHeroVision4068 : -1;
                                        }
                                        switch (i19) {
                                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            default:
                                                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageAlertDialogCyberHeroQuantum3938("Unknown alignment: ", i19, "SsaParser");
                                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i20 = Integer.MIN_VALUE;
                                        switch (i19) {
                                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            default:
                                                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageAlertDialogCyberHeroQuantum3938("Unknown alignment: ", i19, "SsaParser");
                                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                i5 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                                                i5 = i3;
                                                break;
                                            case 2:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                                                i5 = 1;
                                                break;
                                            case 3:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                                            case 9:
                                                i5 = 2;
                                                break;
                                        }
                                        switch (i19) {
                                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                break;
                                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            default:
                                                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageAlertDialogCyberHeroQuantum3938("Unknown alignment: ", i19, "SsaParser");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i20 = 2;
                                                break;
                                            case 4:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                                                i20 = 1;
                                                break;
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                                            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                                            case 9:
                                                i20 = i3;
                                                break;
                                        }
                                        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                            float f12 = 0.95f;
                                            if (i5 != 0) {
                                                i6 = 1;
                                                if (i5 != 1) {
                                                    i7 = 2;
                                                    f4 = i5 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i7 = 2;
                                                    f4 = 0.5f;
                                                }
                                            } else {
                                                i6 = 1;
                                                i7 = 2;
                                                f4 = 0.05f;
                                            }
                                            if (i20 == 0) {
                                                f12 = 0.05f;
                                            } else if (i20 == i6) {
                                                f12 = 0.5f;
                                            } else if (i20 != i7) {
                                                f12 = -3.4028235E38f;
                                            }
                                            f5 = f12;
                                            f6 = f4;
                                        } else {
                                            f6 = pointF.x / f;
                                            f5 = pointF.y / f2;
                                        }
                                        PolarVoyageProcessCameraProviderHeroBetaSolar3759 polarVoyageProcessCameraProviderHeroBetaSolar3759 = new PolarVoyageProcessCameraProviderHeroBetaSolar3759(spannableString, alignment2, null, null, f5, i3, i20, f6, i5, i4, f3, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, parseInt);
                                        int PolarVoyageZipVortexCelestial61852 = PolarVoyageZipVortexCelestial6185(PolarVoyageKotlinBetaPulseBeta36532, arrayList2, arrayList);
                                        for (int PolarVoyageZipVortexCelestial61853 = PolarVoyageZipVortexCelestial6185(PolarVoyageKotlinBetaPulseBeta3653, arrayList2, arrayList); PolarVoyageZipVortexCelestial61853 < PolarVoyageZipVortexCelestial61852; PolarVoyageZipVortexCelestial61853++) {
                                            ((List) arrayList.get(PolarVoyageZipVortexCelestial61853)).add(polarVoyageProcessCameraProviderHeroBetaSolar3759);
                                        }
                                    }
                                    polarVoyageFlowOnTitaniumVortexPixel6888 = this;
                                    PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = charset;
                                    j2 = j;
                                    polarVoyageCameraSelectorMegaHyperion65302 = polarVoyageCameraSelectorMegaHyperion6530;
                                    polarVoyageTextRecognitionHeroOmega13122 = polarVoyageTextRecognitionHeroOmega1312;
                                }
                            }
                            parseInt = 0;
                            PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(split[polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageMotionLayoutTransitionHeroVision4068]);
                            charset = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                            if (PolarVoyageKotlinBetaPulseBeta3653 != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                j = j2;
                polarVoyageCameraSelectorMegaHyperion6530 = polarVoyageCameraSelectorMegaHyperion65302;
                polarVoyageTextRecognitionHeroOmega1312 = polarVoyageTextRecognitionHeroOmega13122;
                polarVoyageFlowOnTitaniumVortexPixel6888 = this;
                PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = charset;
                j2 = j;
                polarVoyageCameraSelectorMegaHyperion65302 = polarVoyageCameraSelectorMegaHyperion6530;
                polarVoyageTextRecognitionHeroOmega13122 = polarVoyageTextRecognitionHeroOmega1312;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312, Charset charset) {
        int i;
        PolarVoyageTraceVisionMega1085 polarVoyageTraceVisionMega1085;
        while (true) {
            String PolarVoyageDrawableDeltaHyperion57422 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(charset);
            if (PolarVoyageDrawableDeltaHyperion57422 == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(PolarVoyageDrawableDeltaHyperion57422)) {
                while (true) {
                    String PolarVoyageDrawableDeltaHyperion57423 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(charset);
                    if (PolarVoyageDrawableDeltaHyperion57423 == null) {
                        break;
                    }
                    if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() != 0) {
                        if ((polarVoyageTextRecognitionHeroOmega1312.PolarVoyageItemDecorationUltraDeltaEpic7485(charset) != 0 ? PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = PolarVoyageDrawableDeltaHyperion57423.split(":");
                    if (split.length == 2) {
                        String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(split[0].trim());
                        PolarVoyageFlingGestureEclipsePrimeMax1376.getClass();
                        if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("playresx")) {
                            this.PolarVoyageViewRogueMaster4778 = Float.parseFloat(split[1].trim());
                        } else if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("playresy")) {
                            try {
                                this.PolarVoyageCameraPixelBlaze2629 = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(PolarVoyageDrawableDeltaHyperion57422)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                PolarVoyageDrawableCompatHyperionSpectraInferno7346 polarVoyageDrawableCompatHyperionSpectraInferno7346 = null;
                while (true) {
                    String PolarVoyageDrawableDeltaHyperion57424 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(charset);
                    if (PolarVoyageDrawableDeltaHyperion57424 != null) {
                        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() != 0) {
                            if ((polarVoyageTextRecognitionHeroOmega1312.PolarVoyageItemDecorationUltraDeltaEpic7485(charset) != 0 ? PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793(r0 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (PolarVoyageDrawableDeltaHyperion57424.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(PolarVoyageDrawableDeltaHyperion57424.substring(7), ",");
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < split2.length; i15++) {
                                String PolarVoyageFlingGestureEclipsePrimeMax13762 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(split2[i15].trim());
                                PolarVoyageFlingGestureEclipsePrimeMax13762.getClass();
                                switch (PolarVoyageFlingGestureEclipsePrimeMax13762.hashCode()) {
                                    case -1178781136:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("italic")) {
                                            i = i2;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case -1026963764:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("underline")) {
                                            i = 1;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case -192095652:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("strikeout")) {
                                            i = 2;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case -70925746:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("primarycolour")) {
                                            i = 3;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 3029637:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("bold")) {
                                            i = 4;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 3373707:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("name")) {
                                            i = 5;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 366554320:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("fontsize")) {
                                            i = 6;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 767321349:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("borderstyle")) {
                                            i = 7;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 1767875043:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("alignment")) {
                                            i = 8;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 1988365454:
                                        if (PolarVoyageFlingGestureEclipsePrimeMax13762.equals("outlinecolour")) {
                                            i = 9;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case 3:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                        i5 = i15;
                                        break;
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                                        i9 = i15;
                                        break;
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                                        i14 = i15;
                                        break;
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            polarVoyageDrawableCompatHyperionSpectraInferno7346 = i5 != -1 ? new PolarVoyageDrawableCompatHyperionSpectraInferno7346(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, split2.length) : null;
                        } else {
                            if (PolarVoyageDrawableDeltaHyperion57424.startsWith("Style:")) {
                                if (polarVoyageDrawableCompatHyperionSpectraInferno7346 == null) {
                                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(PolarVoyageDrawableDeltaHyperion57424));
                                } else {
                                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(PolarVoyageDrawableDeltaHyperion57424.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(PolarVoyageDrawableDeltaHyperion57424.substring(6), ",");
                                    int length = split3.length;
                                    int i16 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageBottomSheetOmegaNeo1907;
                                    if (length != i16) {
                                        int length2 = split3.length;
                                        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                                        Locale locale = Locale.US;
                                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaStyle", "Skipping malformed 'Style:' line (expected " + i16 + " values, found " + length2 + "): '" + PolarVoyageDrawableDeltaHyperion57424 + "'");
                                    } else {
                                        try {
                                            String trim = split3[polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageZipVortexCelestial6185].trim();
                                            int i17 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                            int PolarVoyageZipVortexCelestial6185 = i17 != -1 ? PolarVoyageTraceVisionMega1085.PolarVoyageZipVortexCelestial6185(split3[i17].trim()) : -1;
                                            int i18 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageKotlinBetaPulseBeta3653;
                                            Integer PolarVoyageKotlinBetaPulseBeta3653 = i18 != -1 ? PolarVoyageTraceVisionMega1085.PolarVoyageKotlinBetaPulseBeta3653(split3[i18].trim()) : null;
                                            int i19 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                            Integer PolarVoyageKotlinBetaPulseBeta36532 = i19 != -1 ? PolarVoyageTraceVisionMega1085.PolarVoyageKotlinBetaPulseBeta3653(split3[i19].trim()) : null;
                                            int i20 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageBitmapVisionAuroraPixel4705;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String trim2 = split3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(trim2);
                                                } catch (NumberFormatException e) {
                                                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageDiffUtilTurboStrike5735;
                                            boolean z = i21 != -1 && PolarVoyageTraceVisionMega1085.PolarVoyageMotionLayoutTransitionHeroVision4068(split3[i21].trim());
                                            int i22 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageTextInputEditTextNebulaHero6651;
                                            boolean z2 = i22 != -1 && PolarVoyageTraceVisionMega1085.PolarVoyageMotionLayoutTransitionHeroVision4068(split3[i22].trim());
                                            int i23 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                            boolean z3 = i23 != -1 && PolarVoyageTraceVisionMega1085.PolarVoyageMotionLayoutTransitionHeroVision4068(split3[i23].trim());
                                            int i24 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageStrictModeLegendEpic1532;
                                            boolean z4 = i24 != -1 && PolarVoyageTraceVisionMega1085.PolarVoyageMotionLayoutTransitionHeroVision4068(split3[i24].trim());
                                            int i25 = polarVoyageDrawableCompatHyperionSpectraInferno7346.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                            if (i25 != -1) {
                                                String trim3 = split3[i25].trim();
                                                try {
                                                    int parseInt = Integer.parseInt(trim3.trim());
                                                    if (parseInt == 1 || parseInt == 3) {
                                                        i4 = parseInt;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                            }
                                            polarVoyageTraceVisionMega1085 = new PolarVoyageTraceVisionMega1085(trim, PolarVoyageZipVortexCelestial6185, PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageKotlinBetaPulseBeta36532, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("SsaStyle", "Skipping malformed 'Style:' line: '" + PolarVoyageDrawableDeltaHyperion57424 + "'", e2);
                                        }
                                        if (polarVoyageTraceVisionMega1085 != null) {
                                            linkedHashMap.put(polarVoyageTraceVisionMega1085.PolarVoyageZipVortexCelestial6185, polarVoyageTraceVisionMega1085);
                                        }
                                    }
                                    polarVoyageTraceVisionMega1085 = null;
                                    if (polarVoyageTraceVisionMega1085 != null) {
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.PolarVoyageBottomSheetOmegaNeo1907 = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(PolarVoyageDrawableDeltaHyperion57422)) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(PolarVoyageDrawableDeltaHyperion57422)) {
                return;
            }
        }
    }
}
