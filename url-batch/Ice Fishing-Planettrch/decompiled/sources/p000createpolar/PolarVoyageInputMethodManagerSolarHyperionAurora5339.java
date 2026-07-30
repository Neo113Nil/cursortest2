package p000createpolar;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageInputMethodManagerSolarHyperionAurora5339 {
    public static HashMap PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final String[] PolarVoyageBitmapVisionAuroraPixel4705;
    public static final String[] PolarVoyageDiffUtilTurboStrike5735;
    public static final int[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final Pattern PolarVoyageKotlinBetaPulseBeta3653;
    public static final byte[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final int[] PolarVoyageStrictModeLegendEpic1532;
    public static final int[] PolarVoyageTextInputEditTextNebulaHero6651;
    public static final String PolarVoyageZipVortexCelestial6185;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        PolarVoyageZipVortexCelestial6185 = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        PolarVoyageMotionLayoutTransitionHeroVision4068 = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        PolarVoyageKotlinBetaPulseBeta3653 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        PolarVoyageBitmapVisionAuroraPixel4705 = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        PolarVoyageDiffUtilTurboStrike5735 = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        PolarVoyageTextInputEditTextNebulaHero6651 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        PolarVoyageItemDecorationUltraDeltaEpic7485 = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        PolarVoyageStrictModeLegendEpic1532 = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312, PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega13122, Inflater inflater) {
        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() > 0 && polarVoyageTextRecognitionHeroOmega1312.PolarVoyageRotateAnimationCyberCelestialDelta4768() == 120 && polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() != 0) {
            if (polarVoyageTextRecognitionHeroOmega13122.PolarVoyageZipVortexCelestial6185.length < polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185()) {
                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185());
            int i = 0;
            while (true) {
                try {
                    byte[] bArr = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageZipVortexCelestial6185;
                    i += inflater.inflate(bArr, i, bArr.length - i);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageZipVortexCelestial6185;
                        if (i == bArr2.length) {
                            polarVoyageTextRecognitionHeroOmega13122.PolarVoyageKotlinBetaPulseBeta3653(bArr2.length * 2);
                        }
                    } else {
                        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageGuidelineStormSolar2850(i);
                        inflater.reset();
                        return true;
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
            inflater.reset();
        }
        return false;
    }

    public static String PolarVoyageAlarmManagerShadowHyperBeta8339(int i) {
        return new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII);
    }

    public static boolean PolarVoyageAlertDialogCyberHeroQuantum3938(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    public static int PolarVoyageAnimatorSetSparkUltraMax8233(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static int PolarVoyageBarcodeScannerInfernoSolarSpark7767(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    public static String PolarVoyageBitmapMaxTitanTitan7960(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    public static int PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static Handler PolarVoyageBottomSheetOmegaNeo1907(PolarVoyagePreviewDragonShadowForce2497 polarVoyagePreviewDragonShadowForce2497) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, polarVoyagePreviewDragonShadowForce2497);
    }

    public static int PolarVoyageCameraPixelBlaze2629(int i) {
        if (i == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                break;
            default:
                switch (i) {
                    case 13:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                    case 14:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                }
        }
        return 0;
    }

    public static boolean PolarVoyageCameraViewSpectraMaxSpectra2824(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    public static long PolarVoyageCardViewAlphaVortexCelestial9747(int i, long j) {
        return PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(j, 1000000L, i, RoundingMode.DOWN);
    }

    public static int PolarVoyageContentProviderHyperSpark3838(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static String PolarVoyageDiffUtilDragonSpeedEclipse6225(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(str);
        int i = 0;
        String str2 = PolarVoyageFlingGestureEclipsePrimeMax1376.split("-", 2)[0];
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = PolarVoyageBitmapVisionAuroraPixel4705;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
            }
            PolarVoyageBarcodeScannerInfernoSolarSpark7767 = hashMap;
        }
        String str4 = (String) PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(str2);
        if (str4 != null) {
            PolarVoyageFlingGestureEclipsePrimeMax1376 = str4.concat(PolarVoyageFlingGestureEclipsePrimeMax1376.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return PolarVoyageFlingGestureEclipsePrimeMax1376;
        }
        while (true) {
            String[] strArr2 = PolarVoyageDiffUtilTurboStrike5735;
            if (i >= strArr2.length) {
                return PolarVoyageFlingGestureEclipsePrimeMax1376;
            }
            if (PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith(strArr2[i])) {
                return strArr2[i + 1] + PolarVoyageFlingGestureEclipsePrimeMax1376.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    public static float PolarVoyageDiffUtilTurboStrike5735(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static String PolarVoyageDisplayMetricsVortexDragon9516(int i) {
        switch (i) {
            case -2:
                return "none";
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "unknown";
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                return "metadata";
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                return i >= 10000 ? PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("custom (", i, ")") : "?";
        }
    }

    public static int PolarVoyageDrawableDeltaHyperion5742(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    if (i == 1879048192) {
                                        return 8;
                                    }
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static Object[] PolarVoyageFCMCelestialCosmosPixel3711(int i, Object[] objArr) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    public static long PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? PolarVoyageToolbarEclipseInfernoHero6368(j, j2, j3, roundingMode) : PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageCardViewAlphaVortexCelestial9747(j2, PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j, j3, RoundingMode.UNNECESSARY)) : PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j2, PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j3, j, RoundingMode.UNNECESSARY), roundingMode) : PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageCardViewAlphaVortexCelestial9747(j, PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j2, j3, RoundingMode.UNNECESSARY)) : PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j, PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void PolarVoyageFlingGestureEclipsePrimeMax1376(long[] jArr, long j) {
        long j2;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(jArr[i], PolarVoyageDisplayMetricsVortexDragon9516, roundingMode);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long PolarVoyageDisplayMetricsVortexDragon95162 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(1000000L, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageCardViewAlphaVortexCelestial9747(jArr[i], PolarVoyageDisplayMetricsVortexDragon95162);
                i++;
            }
            return;
        }
        int i2 = 0;
        while (i2 < jArr.length) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j >= j3 && j % j3 == 0) {
                    jArr[i2] = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(1000000L, PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j >= j3 || j3 % j != 0) {
                    j2 = j;
                    jArr[i2] = PolarVoyageToolbarEclipseInfernoHero6368(j3, 1000000L, j2, roundingMode);
                    i2++;
                    j = j2;
                } else {
                    jArr[i2] = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageCardViewAlphaVortexCelestial9747(1000000L, PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j3, j, RoundingMode.UNNECESSARY));
                }
            }
            j2 = j;
            i2++;
            j = j2;
        }
    }

    public static long PolarVoyageGuidelineStormSolar2850(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long PolarVoyageItemDecorationUltraDeltaEpic7485(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static int PolarVoyageKotlinBetaPulseBeta3653(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int PolarVoyageLayerDrawableShadowTitaniumOmega1942(Uri uri, String str) {
        int i;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageContentProviderHyperSpark3838("rtsp", scheme) && !PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageContentProviderHyperSpark3838("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(lastPathSegment.substring(lastIndexOf + 1));
                        PolarVoyageFlingGestureEclipsePrimeMax1376.getClass();
                        switch (PolarVoyageFlingGestureEclipsePrimeMax1376) {
                            case "ism":
                            case "isml":
                                i = 1;
                                break;
                            case "mpd":
                                i = 0;
                                break;
                            case "m3u8":
                                i = 2;
                                break;
                            default:
                                i = 4;
                                break;
                        }
                        if (i != 4) {
                            return i;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = PolarVoyageKotlinBetaPulseBeta3653.matcher(path);
                    if (matcher.matches()) {
                        String group = matcher.group(2);
                        if (group != null) {
                            if (!group.contains("format=mpd-time-csf")) {
                                if (group.contains("format=m3u8-aapl")) {
                                    return 2;
                                }
                            }
                            return 0;
                        }
                        return 1;
                    }
                }
                return 4;
            }
            return 3;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    break;
                }
                break;
        }
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Switch insn not found in header
            	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000createpolar.PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLayerDrawableShadowTitaniumOmega1942(android.net.Uri, java.lang.String):int");
    }

    public static long PolarVoyageLifecycleOlympianOmega3762(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static boolean PolarVoyageLooperThreadAlphaPrime1279(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void PolarVoyageMotionLayoutForceEpicAurora7183(int i) {
        Integer.toString(i, 36);
    }

    public static int PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageOnDeviceTranslatorNovaBeta2948 polarVoyageOnDeviceTranslatorNovaBeta2948, long j) {
        int i = polarVoyageOnDeviceTranslatorNovaBeta2948.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (polarVoyageOnDeviceTranslatorNovaBeta2948.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < polarVoyageOnDeviceTranslatorNovaBeta2948.PolarVoyageMotionLayoutTransitionHeroVision4068 && polarVoyageOnDeviceTranslatorNovaBeta2948.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static long PolarVoyageNavigationViewHyperHyperHyperion1793(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static boolean PolarVoyagePackageManagerCelestialPhoenix8393(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i == 30) {
            String str = Build.MODEL;
            if (PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageContentProviderHyperSpark3838(str, "moto g(20)") || PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageContentProviderHyperSpark3838(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageContentProviderHyperSpark3838(Build.MODEL, "sm-x200");
    }

    public static int PolarVoyageRemoteModelManagerOlympianCelestial9141(String str) {
        String[] split;
        int length;
        int i = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    public static int PolarVoyageRotateAnimationCyberCelestialDelta4768(int i, int i2, int i3, byte[] bArr) {
        while (i < i2) {
            i3 = PolarVoyageTextInputEditTextNebulaHero6651[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static Point PolarVoyageSnackbarGammaEclipse2140(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && PolarVoyageLooperThreadAlphaPrime1279(context)) {
            String PolarVoyageBitmapMaxTitanTitan7960 = Build.VERSION.SDK_INT < 28 ? PolarVoyageBitmapMaxTitanTitan7960("sys.display-size") : PolarVoyageBitmapMaxTitanTitan7960("vendor.display-size");
            if (!TextUtils.isEmpty(PolarVoyageBitmapMaxTitanTitan7960)) {
                try {
                    String[] split = PolarVoyageBitmapMaxTitanTitan7960.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageRemoteModelManagerOlympianCelestial9141("Util", "Invalid display size: " + PolarVoyageBitmapMaxTitanTitan7960);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static boolean PolarVoyageStrictModeLegendEpic1532(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static int PolarVoyageTextInputEditTextNebulaHero6651(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long PolarVoyageToolbarEclipseInfernoHero6368(long j, long j2, long j3, RoundingMode roundingMode) {
        double d;
        long j4;
        long PolarVoyageCardViewAlphaVortexCelestial9747 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageCardViewAlphaVortexCelestial9747(j, j2);
        if (PolarVoyageCardViewAlphaVortexCelestial9747 != Long.MAX_VALUE && PolarVoyageCardViewAlphaVortexCelestial9747 != Long.MIN_VALUE) {
            return PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageCardViewAlphaVortexCelestial9747, j3, roundingMode);
        }
        long PolarVoyageAlertDialogCyberHeroQuantum3938 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageAlertDialogCyberHeroQuantum3938(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j2, PolarVoyageAlertDialogCyberHeroQuantum3938, roundingMode2);
        long PolarVoyageDisplayMetricsVortexDragon95162 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j3, PolarVoyageAlertDialogCyberHeroQuantum3938, roundingMode2);
        long PolarVoyageAlertDialogCyberHeroQuantum39382 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageAlertDialogCyberHeroQuantum3938(Math.abs(j), Math.abs(PolarVoyageDisplayMetricsVortexDragon95162));
        long PolarVoyageDisplayMetricsVortexDragon95163 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(j, PolarVoyageAlertDialogCyberHeroQuantum39382, roundingMode2);
        long PolarVoyageDisplayMetricsVortexDragon95164 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageDisplayMetricsVortexDragon95162, PolarVoyageAlertDialogCyberHeroQuantum39382, roundingMode2);
        long PolarVoyageCardViewAlphaVortexCelestial97472 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageCardViewAlphaVortexCelestial9747(PolarVoyageDisplayMetricsVortexDragon95163, PolarVoyageDisplayMetricsVortexDragon9516);
        if (PolarVoyageCardViewAlphaVortexCelestial97472 != Long.MAX_VALUE && PolarVoyageCardViewAlphaVortexCelestial97472 != Long.MIN_VALUE) {
            return PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageCardViewAlphaVortexCelestial97472, PolarVoyageDisplayMetricsVortexDragon95164, roundingMode);
        }
        double d2 = PolarVoyageDisplayMetricsVortexDragon95163 * (PolarVoyageDisplayMetricsVortexDragon9516 / PolarVoyageDisplayMetricsVortexDragon95164);
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i = PolarVoyageLifecycleCameraControllerNebulaTurboStorm9637.PolarVoyageZipVortexCelestial6185;
        if (!PolarVoyageTransformNeoTitanium1654.PolarVoyagePackageManagerCelestialPhoenix8393(d2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (PolarVoyageCardViewBetaVision6888.PolarVoyageZipVortexCelestial6185[roundingMode.ordinal()]) {
            case 1:
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageLifecycleCameraControllerNebulaTurboStorm9637.PolarVoyageZipVortexCelestial6185(d2));
                d = d2;
                if (!((-9.223372036854776E18d) - d >= 1.0d) || !(d < 9.223372036854776E18d)) {
                    return (long) d;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 2:
                if (d2 < 0.0d && !PolarVoyageLifecycleCameraControllerNebulaTurboStorm9637.PolarVoyageZipVortexCelestial6185(d2)) {
                    j4 = ((long) d2) - 1;
                    d = j4;
                    if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                    }
                }
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d2 > 0.0d && !PolarVoyageLifecycleCameraControllerNebulaTurboStorm9637.PolarVoyageZipVortexCelestial6185(d2)) {
                    j4 = ((long) d2) + 1;
                    d = j4;
                    if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                    }
                }
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                if (!PolarVoyageLifecycleCameraControllerNebulaTurboStorm9637.PolarVoyageZipVortexCelestial6185(d2)) {
                    d = ((long) d2) + (d2 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                    }
                }
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                d = Math.rint(d2);
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                d = Math.rint(d2);
                if (Math.abs(d2 - d) == 0.5d) {
                    d = Math.copySign(0.5d, d2) + d2;
                }
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                d = Math.rint(d2);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void PolarVoyageViewBindingPulseHeroSpeed5705(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static int PolarVoyageViewRogueMaster4778(int i) {
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return 21;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int PolarVoyageZipVortexCelestial6185(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i = binarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            binarySearch = i;
        }
        return z ? binarySearch : i;
    }
}
