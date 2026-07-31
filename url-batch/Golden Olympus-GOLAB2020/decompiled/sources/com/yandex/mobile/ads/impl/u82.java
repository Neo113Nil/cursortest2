package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class u82 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f32873a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f32874b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f32875c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f32876d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f32877e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f32878f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f32879g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f32880h;

    /* renamed from: i, reason: collision with root package name */
    private static HashMap<String, String> f32881i;

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f32882j;

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f32883k;

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f32884l;

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f32885m;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f32873a = i4;
        String str = Build.DEVICE;
        f32874b = str;
        String str2 = Build.MANUFACTURER;
        f32875c = str2;
        String str3 = Build.MODEL;
        f32876d = str3;
        f32877e = str + ", " + str3 + ", " + str2 + ", " + i4;
        f32878f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f32879g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f32880h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f32882j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f32883k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f32884l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f32885m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, InterfaceC1490j3.d.b.f16818j, 119, 126, 121, 108, 107, 98, InterfaceC1490j3.d.b.f16810b, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, InterfaceC1490j3.c.b.f16802c, InterfaceC1490j3.c.b.f16805f, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, InterfaceC1490j3.c.b.f16801b, InterfaceC1490j3.c.b.f16806g, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, InterfaceC1490j3.d.b.f16817i, 104, 97, 102, BuildConfig.API_LEVEL, 116, 125, 122, 137, 142, 135, UserVerificationMethods.USER_VERIFY_PATTERN, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, InterfaceC1490j3.c.b.f16807h, 200, 221, 218, 211, 212, 105, InterfaceC1490j3.d.b.f16816h, InterfaceC1490j3.d.b.f16812d, 96, 117, IronSourceConstants.FIRST_INSTANCE_RESULT, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, InterfaceC1490j3.d.b.f16815g, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, ModuleDescriptor.MODULE_VERSION, 132, 131, 222, 217, 208, 215, 194, 197, InterfaceC1490j3.c.b.f16804e, InterfaceC1490j3.c.b.f16803d, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};
    }

    public static long a(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    public static int c(int i4) {
        if (i4 == 13) {
            return 1;
        }
        switch (i4) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String d(int i4) {
        switch (i4) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return b9.h.f15450K0;
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i4 < 10000) {
                    return "?";
                }
                return "custom (" + i4 + ")";
        }
    }

    public static boolean e(int i4) {
        return i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 536870912 || i4 == 805306368 || i4 == 4;
    }

    public static String f(String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.charAt(i6) == '%') {
                i5++;
            }
        }
        if (i5 == 0) {
            return str;
        }
        int i7 = length - (i5 * 2);
        StringBuilder sb = new StringBuilder(i7);
        Matcher matcher = f32879g.matcher(str);
        while (i5 > 0 && matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            char parseInt = (char) Integer.parseInt(group, 16);
            sb.append((CharSequence) str, i4, matcher.start());
            sb.append(parseInt);
            i4 = matcher.end();
            i5--;
        }
        if (i4 < length) {
            sb.append((CharSequence) str, i4, length);
        }
        if (sb.length() != i7) {
            return null;
        }
        return sb.toString();
    }

    public static <T> T a(T t4) {
        return t4;
    }

    public static int b(int i4) {
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 2;
        }
        if (i4 != 24) {
            return i4 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static Point c(Context context) {
        DisplayManager displayManager;
        int i4 = f32873a;
        Display display = (i4 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && d(context)) {
            String b4 = i4 < 28 ? b("sys.display-size") : b("vendor.display-size");
            if (!TextUtils.isEmpty(b4)) {
                try {
                    String[] split = b4.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                ms0.b("Util", "Invalid display size: " + b4);
            }
            if ("Sony".equals(f32875c) && f32876d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i5 = f32873a;
        if (i5 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        if (i5 >= 17) {
            display.getRealSize(point);
            return point;
        }
        display.getSize(point);
        return point;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String b4 = C2207rf.b(str);
        int i4 = 0;
        String str2 = b4.split("-", 2)[0];
        if (f32881i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f32882j.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i5 = 0;
            while (true) {
                String[] strArr = f32882j;
                if (i5 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i5], strArr[i5 + 1]);
                i5 += 2;
            }
            f32881i = hashMap;
        }
        String str4 = f32881i.get(str2);
        if (str4 != null) {
            b4 = str4 + b4.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return b4;
        }
        while (true) {
            String[] strArr2 = f32883k;
            if (i4 >= strArr2.length) {
                return b4;
            }
            if (b4.startsWith(strArr2[i4])) {
                return strArr2[i4 + 1] + b4.substring(strArr2[i4].length());
            }
            i4 += 2;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j4, boolean z4) {
        int i4;
        int binarySearch = Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                int i5 = binarySearch - 1;
                if (i5 < 0 || jArr[i5] != j4) {
                    break;
                }
                binarySearch = i5;
            }
            i4 = binarySearch;
        }
        return z4 ? Math.max(0, i4) : i4;
    }

    public static int a(long[] jArr, long j4, boolean z4) {
        int i4;
        int binarySearch = Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i4 = binarySearch + 1;
            if (i4 >= jArr.length || jArr[i4] != j4) {
                break;
            }
            binarySearch = i4;
        }
        return z4 ? binarySearch : i4;
    }

    public static int a(os0 os0Var, long j4) {
        int a4 = os0Var.a() - 1;
        int i4 = 0;
        while (i4 <= a4) {
            int i5 = (i4 + a4) >>> 1;
            if (os0Var.a(i5) < j4) {
                i4 = i5 + 1;
            } else {
                a4 = i5 - 1;
            }
        }
        int i6 = a4 + 1;
        if (i6 < os0Var.a() && os0Var.a(i6) == j4) {
            return i6;
        }
        if (a4 == -1) {
            return 0;
        }
        return a4;
    }

    public static Handler b() {
        return b((Handler.Callback) null);
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C2207rf.c(networkCountryIso);
            }
        }
        return C2207rf.c(Locale.getDefault().getCountry());
    }

    public static int a(List list, Long l4, boolean z4) {
        int i4;
        int binarySearch = Collections.binarySearch(list, l4);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                int i5 = binarySearch - 1;
                if (i5 < 0 || ((Comparable) list.get(i5)).compareTo(l4) != 0) {
                    break;
                }
                binarySearch = i5;
            }
            i4 = binarySearch;
        }
        return z4 ? Math.max(0, i4) : i4;
    }

    public static boolean d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int a(int[] iArr, int i4, boolean z4, boolean z5) {
        int i5;
        int i6;
        int binarySearch = Arrays.binarySearch(iArr, i4);
        if (binarySearch < 0) {
            i6 = -(binarySearch + 2);
        } else {
            while (true) {
                i5 = binarySearch - 1;
                if (i5 < 0 || iArr[i5] != i4) {
                    break;
                }
                binarySearch = i5;
            }
            i6 = z4 ? binarySearch : i5;
        }
        return z5 ? Math.max(0, i6) : i6;
    }

    public static int b(int i4, int i5) {
        if (i4 != 2) {
            if (i4 == 3) {
                return i5;
            }
            if (i4 != 4) {
                if (i4 != 268435456) {
                    if (i4 == 536870912) {
                        return i5 * 3;
                    }
                    if (i4 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i5 * 4;
        }
        return i5 * 2;
    }

    public static long b(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 / 1000;
    }

    public static ExecutorService d(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.Ah
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread a4;
                a4 = u82.a(str, runnable);
                return a4;
            }
        });
    }

    public static Handler b(Handler.Callback callback) {
        return new Handler(c(), callback);
    }

    public static String[] d() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = f32873a >= 24 ? configuration.getLocales().toLanguageTags().split(StringUtils.COMMA, -1) : new String[]{a(configuration.locale)};
        for (int i4 = 0; i4 < split.length; i4++) {
            split[i4] = e(split[i4]);
        }
        return split;
    }

    public static int a(int i4, int i5) {
        return ((i4 + i5) - 1) / i5;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            ms0.a("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    public static float a(float f4) {
        return Math.max(0.0f, Math.min(f4, 0.95f));
    }

    public static int a(int i4, byte[] bArr) {
        int i5 = -1;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 = f32884l[((i5 >>> 24) ^ (bArr[i6] & 255)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i5 << 8);
        }
        return i5;
    }

    public static int a(int i4, int i5, byte[] bArr) {
        int i6 = 0;
        while (i4 < i5) {
            i6 = f32885m[i6 ^ (bArr[i4] & 255)];
            i4++;
        }
        return i6;
    }

    public static Handler a() {
        return a((Handler.Callback) null);
    }

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int a(int i4) {
        if (i4 == 12) {
            return f32873a >= 32 ? 743676 : 0;
        }
        switch (i4) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return InterfaceC1490j3.c.b.f16804e;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i5 = f32873a;
                return (i5 < 23 && i5 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int a(String str) {
        String[] split;
        int length;
        int i4 = 0;
        if (str == null || (length = (split = str.split(BundleUtil.UNDERLINE_TAG, -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z4 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i4 = Integer.parseInt(str2);
            if (z4) {
                return -i4;
            }
        } catch (NumberFormatException unused) {
        }
        return i4;
    }

    public static byte[] c(String str) {
        return str.getBytes(un.f33183c);
    }

    public static Looper c() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static int a(Uri uri, String str) {
        int i4;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && C2207rf.a(scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String b4 = C2207rf.b(lastPathSegment.substring(lastIndexOf + 1));
                b4.getClass();
                switch (b4.hashCode()) {
                    case 104579:
                        if (b4.equals("ism")) {
                            break;
                        }
                        break;
                    case 108321:
                        if (b4.equals("mpd")) {
                            break;
                        }
                        break;
                    case 3242057:
                        if (b4.equals("isml")) {
                            break;
                        }
                        break;
                    case 3299913:
                        if (b4.equals("m3u8")) {
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Method dump skipped, instructions count: 278
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u82.a(android.net.Uri, java.lang.String):int");
            }

            public static boolean a(sf1 sf1Var, sf1 sf1Var2, Inflater inflater) {
                if (sf1Var.a() <= 0) {
                    return false;
                }
                if (sf1Var2.b() < sf1Var.a()) {
                    sf1Var2.a(sf1Var.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(sf1Var.c(), sf1Var.d(), sf1Var.a());
                int i4 = 0;
                while (true) {
                    try {
                        i4 += inflater.inflate(sf1Var2.c(), i4, sf1Var2.b() - i4);
                        if (inflater.finished()) {
                            sf1Var2.d(i4);
                            inflater.reset();
                            return true;
                        }
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        if (i4 == sf1Var2.b()) {
                            sf1Var2.a(sf1Var2.b() * 2);
                        }
                    } catch (DataFormatException unused) {
                        return false;
                    } finally {
                        inflater.reset();
                    }
                }
                return false;
            }

            public static <T> T[] a(T[] tArr, T[] tArr2) {
                T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
                System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
                return tArr3;
            }

            public static Object[] a(int i4, Object[] objArr) {
                if (i4 <= objArr.length) {
                    return Arrays.copyOf(objArr, i4);
                }
                throw new IllegalArgumentException();
            }

            public static Object[] a(Object[] objArr, int i4) {
                if (i4 <= objArr.length) {
                    return Arrays.copyOfRange(objArr, 1, i4);
                }
                throw new IllegalArgumentException();
            }

            public static void a(Handler handler, Runnable runnable) {
                if (handler.getLooper().getThread().isAlive()) {
                    if (handler.getLooper() == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        handler.post(runnable);
                    }
                }
            }

            public static boolean a(Parcel parcel) {
                return parcel.readInt() != 0;
            }

            public static long a(long j4, long j5, long j6) {
                if (j6 >= j5 && j6 % j5 == 0) {
                    return j4 / (j6 / j5);
                }
                if (j6 < j5 && j5 % j6 == 0) {
                    return (j5 / j6) * j4;
                }
                return (long) (j4 * (j5 / j6));
            }

            public static void a(long[] jArr, long j4) {
                int i4 = 0;
                if (j4 >= 1000000 && j4 % 1000000 == 0) {
                    long j5 = j4 / 1000000;
                    while (i4 < jArr.length) {
                        jArr[i4] = jArr[i4] / j5;
                        i4++;
                    }
                    return;
                }
                if (j4 < 1000000 && 1000000 % j4 == 0) {
                    long j6 = 1000000 / j4;
                    while (i4 < jArr.length) {
                        jArr[i4] = jArr[i4] * j6;
                        i4++;
                    }
                    return;
                }
                double d4 = 1000000 / j4;
                while (i4 < jArr.length) {
                    jArr[i4] = (long) (jArr[i4] * d4);
                    i4++;
                }
            }

            public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
                return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
            }

            public static Handler a(Handler.Callback callback) {
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    return new Handler(myLooper, callback);
                }
                throw new IllegalStateException();
            }

            public static Handler a(Looper looper, Handler.Callback callback) {
                return new Handler(looper, callback);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Thread a(String str, Runnable runnable) {
                return new Thread(runnable, str);
            }

            public static String a(Locale locale) {
                if (f32873a >= 21) {
                    return locale.toLanguageTag();
                }
                return locale.toString();
            }

            public static String a(byte[] bArr) {
                return new String(bArr, un.f33183c);
            }

            public static String a(byte[] bArr, int i4, int i5) {
                return new String(bArr, i4, i5, un.f33183c);
            }
        }
