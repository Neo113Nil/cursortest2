package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n13 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8865a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f8866b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f8867c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f8868d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f8869e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f8870f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f8871g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f8872h;

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f8873i;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f8874j;

    /* renamed from: k, reason: collision with root package name */
    private static HashMap<String, String> f8875k;

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f8876l;

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f8877m;

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f8878n;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f8879o;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f8865a = i7;
        String str = Build.DEVICE;
        f8866b = str;
        String str2 = Build.MANUFACTURER;
        f8867c = str2;
        String str3 = Build.MODEL;
        f8868d = str3;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i7);
        f8869e = sb.toString();
        f8870f = new byte[0];
        f8871g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f8872h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f8873i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f8874j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f8876l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f8877m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f8878n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f8879o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static float A(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f7, f9));
    }

    public static <T> T[] B(T[] tArr, int i7) {
        wu1.d(i7 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i7);
    }

    public static String[] C() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = f8865a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{i(configuration.locale)};
        for (int i7 = 0; i7 < split.length; i7++) {
            split[i7] = k(split[i7]);
        }
        return split;
    }

    public static String[] D(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] E(String str, String str2) {
        return str.split(str2, 2);
    }

    private static String F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            oc2.a("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e7);
            return null;
        }
    }

    private static HashMap<String, String> G() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f8876l.length;
        HashMap<String, String> hashMap = new HashMap<>(length + 86);
        int i7 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f8876l;
            int length3 = strArr.length;
            if (i7 >= 86) {
                return hashMap;
            }
            hashMap.put(strArr[i7], strArr[i7 + 1]);
            i7 += 2;
        }
    }

    public static int H(long[] jArr, long j7, boolean z6, boolean z7) {
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j7);
        return !z6 ? binarySearch : binarySearch - 1;
    }

    public static int I(int[] iArr, int i7, boolean z6, boolean z7) {
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i7);
        return binarySearch;
    }

    public static int J(long[] jArr, long j7, boolean z6, boolean z7) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j7);
            i7 = binarySearch + 1;
        }
        return z7 ? Math.max(0, i7) : i7;
    }

    public static int K(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static int L(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static int M(byte[] bArr, int i7, int i8, int i9) {
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 = f8878n[(i10 >>> 24) ^ (bArr[i11] & 255)] ^ (i10 << 8);
        }
        return i10;
    }

    public static int N(byte[] bArr, int i7, int i8, int i9) {
        int i10 = 0;
        while (i7 < i8) {
            i10 = f8879o[i10 ^ (bArr[i7] & 255)];
            i7++;
        }
        return i10;
    }

    public static int O(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int P(int i7) {
        switch (i7) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case c4.w0.f2149o /* 7 */:
                return 1276;
            case c4.w0.f2150p /* 8 */:
                int i8 = f8865a;
                return (i8 < 23 && i8 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int Q(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
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
                switch (i7) {
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

    public static int R(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int S(int i7, int i8) {
        if (i7 != 2) {
            if (i7 == 3) {
                return i8;
            }
            if (i7 != 4) {
                if (i7 != 268435456) {
                    if (i7 == 536870912) {
                        return i8 * 3;
                    }
                    if (i7 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i8 * 4;
        }
        return i8 + i8;
    }

    public static long T(long j7, long j8, long j9) {
        long j10 = j7 + j8;
        if (((j7 ^ j10) & (j8 ^ j10)) < 0) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    public static long U(long j7, long j8, long j9) {
        return Math.max(j8, Math.min(j7, j9));
    }

    public static long V(long j7, float f7) {
        if (f7 == 1.0f) {
            return j7;
        }
        double d7 = j7;
        double d8 = f7;
        Double.isNaN(d7);
        Double.isNaN(d8);
        return Math.round(d7 * d8);
    }

    public static long W(long j7) {
        return j7 == -9223372036854775807L ? System.currentTimeMillis() : j7 + SystemClock.elapsedRealtime();
    }

    public static long X(long j7, float f7) {
        if (f7 == 1.0f) {
            return j7;
        }
        double d7 = j7;
        double d8 = f7;
        Double.isNaN(d7);
        Double.isNaN(d8);
        return Math.round(d7 / d8);
    }

    public static long Y(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static long Z(long j7, long j8, long j9) {
        if (j9 >= j8 && j9 % j8 == 0) {
            return j7 / (j9 / j8);
        }
        if (j9 < j8 && j8 % j9 == 0) {
            return j7 * (j8 / j9);
        }
        double d7 = j7;
        double d8 = j8;
        double d9 = j9;
        Double.isNaN(d8);
        Double.isNaN(d9);
        Double.isNaN(d7);
        return (long) (d7 * (d8 / d9));
    }

    public static Looper a() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long a0(long j7, long j8, long j9) {
        long j10 = j7 - j8;
        if (((j7 ^ j10) & (j8 ^ j7)) < 0) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public static c0 b(int i7, int i8, int i9) {
        bf4 bf4Var = new bf4();
        bf4Var.s("audio/raw");
        bf4Var.e0(i8);
        bf4Var.t(i9);
        bf4Var.n(i7);
        return bf4Var.y();
    }

    public static long b0(int i7, int i8) {
        return (i8 & 4294967295L) | ((i7 & 4294967295L) << 32);
    }

    public static <T> T c(T t6) {
        return t6;
    }

    public static long c0(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Point d0(Context context) {
        DisplayManager displayManager;
        int i7 = f8865a;
        Display display = null;
        if (i7 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && t(context)) {
            String F = F(i7 < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(F)) {
                try {
                    String[] split = F.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(F);
                Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(f8867c) && f8868d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i8 = f8865a;
        if (i8 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        if (i8 >= 17) {
            display.getRealSize(point);
            return point;
        }
        display.getSize(point);
        return point;
    }

    public static String e(byte[] bArr, int i7, int i8) {
        return new String(bArr, i7, i8, c43.f3729c);
    }

    public static Handler e0(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String f(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        while (true) {
            int length = objArr.length;
            if (i7 >= length) {
                return sb.toString();
            }
            sb.append(objArr[i7].getClass().getSimpleName());
            if (i7 < length - 1) {
                sb.append(", ");
            }
            i7++;
        }
    }

    public static Handler f0(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        wu1.b(myLooper);
        return new Handler(myLooper, null);
    }

    public static String g(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return w33.b(networkCountryIso);
            }
        }
        return w33.b(Locale.getDefault().getCountry());
    }

    public static String h(int i7) {
        if (i7 == 0) {
            return "NO";
        }
        if (i7 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i7 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i7 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i7 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String i(Locale locale) {
        return f8865a >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static String j(int i7) {
        switch (i7) {
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return "?";
        }
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String a7 = w33.a(str);
        int i7 = 0;
        String str2 = a7.split("-", 2)[0];
        if (f8875k == null) {
            f8875k = G();
        }
        String str3 = f8875k.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(a7.substring(str2.length()));
            a7 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return a7;
        }
        while (true) {
            String[] strArr = f8877m;
            int length = strArr.length;
            if (i7 >= 18) {
                return a7;
            }
            if (a7.startsWith(strArr[i7])) {
                String valueOf2 = String.valueOf(strArr[i7 + 1]);
                String valueOf3 = String.valueOf(a7.substring(strArr[i7].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i7 += 2;
        }
    }

    public static ExecutorService l(String str) {
        final String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        return Executors.newSingleThreadExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.m03

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f8147a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.f8147a);
            }
        });
    }

    public static void m(he1 he1Var) {
        try {
            he1Var.i();
        } catch (IOException unused) {
        }
    }

    public static void n(long[] jArr, long j7, long j8) {
        int i7 = 0;
        if (j8 >= 1000000 && j8 % 1000000 == 0) {
            long j9 = j8 / 1000000;
            while (i7 < jArr.length) {
                jArr[i7] = jArr[i7] / j9;
                i7++;
            }
            return;
        }
        if (j8 < 1000000 && 1000000 % j8 == 0) {
            long j10 = 1000000 / j8;
            while (i7 < jArr.length) {
                jArr[i7] = jArr[i7] * j10;
                i7++;
            }
            return;
        }
        double d7 = j8;
        Double.isNaN(d7);
        double d8 = 1000000.0d / d7;
        while (i7 < jArr.length) {
            double d9 = jArr[i7];
            Double.isNaN(d9);
            jArr[i7] = (long) (d9 * d8);
            i7++;
        }
    }

    public static void o(Parcel parcel, boolean z6) {
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static boolean p(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean q(int i7) {
        return i7 == 536870912 || i7 == 805306368 || i7 == 4;
    }

    public static boolean r(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4;
    }

    public static boolean s(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean t(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean u(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static boolean v(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] w(String str) {
        return str.getBytes(c43.f3729c);
    }

    public static byte[] x(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static <T> T[] y(T[] tArr) {
        return tArr;
    }

    public static <T> T[] z(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
