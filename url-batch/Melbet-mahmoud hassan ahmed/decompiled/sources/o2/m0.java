package o2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
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
import android.view.Display;
import android.view.WindowManager;
import c4.w0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import r0.n2;
import r0.s1;
import r0.v2;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19752a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f19753b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f19754c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f19755d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f19756e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f19757f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f19758g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f19759h;

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f19760i;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f19761j;

    /* renamed from: k, reason: collision with root package name */
    private static HashMap<String, String> f19762k;

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f19763l;

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f19764m;

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f19765n;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f19766o;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f19752a = i7;
        String str = Build.DEVICE;
        f19753b = str;
        String str2 = Build.MANUFACTURER;
        f19754c = str2;
        String str3 = Build.MODEL;
        f19755d = str3;
        f19756e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f19757f = new byte[0];
        f19758g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f19759h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f19760i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f19761j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f19763l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f19764m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f19765n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f19766o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private static HashMap<String, String> A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f19763l.length);
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
            String[] strArr = f19763l;
            if (i7 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i7], strArr[i7 + 1]);
            i7 += 2;
        }
    }

    public static <T> void A0(List<T> list, int i7, int i8, int i9) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i10 = (i8 - i7) - 1; i10 >= 0; i10--) {
            arrayDeque.addFirst(list.remove(i7 + i10));
        }
        list.addAll(Math.min(i9, list.size()), arrayDeque);
    }

    public static Uri B(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f19761j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static long B0(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static String C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static ExecutorService C0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o2.l0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread x02;
                x02 = m0.x0(str, runnable);
                return x02;
            }
        });
    }

    public static String D(byte[] bArr) {
        return new String(bArr, l4.d.f18614c);
    }

    public static String D0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e7 = l4.b.e(str);
        String str2 = R0(e7, "-")[0];
        if (f19762k == null) {
            f19762k = A();
        }
        String str3 = f19762k.get(str2);
        if (str3 != null) {
            e7 = str3 + e7.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? z0(e7) : e7;
    }

    public static String E(byte[] bArr, int i7, int i8) {
        return new String(bArr, i7, i8, l4.d.f18614c);
    }

    public static <T> T[] E0(T[] tArr, T t6) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t6;
        return (T[]) k(copyOf);
    }

    public static int F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static <T> T[] F0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static int G(int i7) {
        if (i7 == 12) {
            return f19752a >= 32 ? 743676 : 0;
        }
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
            case w0.f2149o /* 7 */:
                return 1276;
            case w0.f2150p /* 8 */:
                int i8 = f19752a;
                return (i8 < 23 && i8 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static <T> T[] G0(T[] tArr, int i7) {
        a.a(i7 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i7);
    }

    public static v2.b H(v2 v2Var, v2.b bVar) {
        boolean k7 = v2Var.k();
        boolean q7 = v2Var.q();
        boolean C = v2Var.C();
        boolean x6 = v2Var.x();
        boolean O = v2Var.O();
        boolean E = v2Var.E();
        boolean u6 = v2Var.I().u();
        boolean z6 = false;
        v2.b.a d7 = new v2.b.a().b(bVar).d(4, !k7).d(5, q7 && !k7).d(6, C && !k7).d(7, !u6 && (C || !O || q7) && !k7).d(8, x6 && !k7).d(9, !u6 && (x6 || (O && E)) && !k7).d(10, !k7).d(11, q7 && !k7);
        if (q7 && !k7) {
            z6 = true;
        }
        return d7.d(12, z6).e();
    }

    public static <T> T[] H0(T[] tArr, int i7, int i8) {
        a.a(i7 >= 0);
        a.a(i8 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i7, i8);
    }

    public static int I(ByteBuffer byteBuffer, int i7) {
        int i8 = byteBuffer.getInt(i7);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i8 : Integer.reverseBytes(i8);
    }

    public static long I0(String str) {
        Matcher matcher = f19758g.matcher(str);
        if (!matcher.matches()) {
            throw n2.a("Invalid date/time format: " + str, null);
        }
        int i7 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i7 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i7 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i7 != 0 ? timeInMillis - (i7 * 60000) : timeInMillis;
    }

    public static byte[] J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) ((Character.digit(str.charAt(i8), 16) << 4) + Character.digit(str.charAt(i8 + 1), 16));
        }
        return bArr;
    }

    public static long J0(String str) {
        Matcher matcher = f19759h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static int K(String str, int i7) {
        int i8 = 0;
        for (String str2 : S0(str)) {
            if (i7 == v.m(str2)) {
                i8++;
            }
        }
        return i8;
    }

    public static boolean K0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String L(String str, int i7) {
        String[] S0 = S0(str);
        if (S0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : S0) {
            if (i7 == v.m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static boolean L0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static String M(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < objArr.length; i7++) {
            sb.append(objArr[i7].getClass().getSimpleName());
            if (i7 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static <T> void M0(List<T> list, int i7, int i8) {
        if (i7 < 0 || i8 > list.size() || i7 > i8) {
            throw new IllegalArgumentException();
        }
        if (i7 != i8) {
            list.subList(i7, i8).clear();
        }
    }

    public static String N(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return l4.b.f(networkCountryIso);
            }
        }
        return l4.b.f(Locale.getDefault().getCountry());
    }

    public static long N0(long j7, long j8, long j9) {
        if (j9 >= j8 && j9 % j8 == 0) {
            return j7 / (j9 / j8);
        }
        if (j9 < j8 && j8 % j9 == 0) {
            return j7 * (j8 / j9);
        }
        double d7 = j8;
        double d8 = j9;
        Double.isNaN(d7);
        Double.isNaN(d8);
        double d9 = j7;
        Double.isNaN(d9);
        return (long) (d9 * (d7 / d8));
    }

    public static Point O(Context context) {
        DisplayManager displayManager;
        Display display = (f19752a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return P(context, display);
    }

    public static long[] O0(List<Long> list, long j7, long j8) {
        int size = list.size();
        long[] jArr = new long[size];
        int i7 = 0;
        if (j8 >= j7 && j8 % j7 == 0) {
            long j9 = j8 / j7;
            while (i7 < size) {
                jArr[i7] = list.get(i7).longValue() / j9;
                i7++;
            }
        } else if (j8 >= j7 || j7 % j8 != 0) {
            double d7 = j7;
            double d8 = j8;
            Double.isNaN(d7);
            Double.isNaN(d8);
            double d9 = d7 / d8;
            while (i7 < size) {
                double longValue = list.get(i7).longValue();
                Double.isNaN(longValue);
                jArr[i7] = (long) (longValue * d9);
                i7++;
            }
        } else {
            long j10 = j7 / j8;
            while (i7 < size) {
                jArr[i7] = list.get(i7).longValue() * j10;
                i7++;
            }
        }
        return jArr;
    }

    public static Point P(Context context, Display display) {
        if (display.getDisplayId() == 0 && w0(context)) {
            String j02 = j0(f19752a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(j02)) {
                try {
                    String[] Q0 = Q0(j02.trim(), "x");
                    if (Q0.length == 2) {
                        int parseInt = Integer.parseInt(Q0[0]);
                        int parseInt2 = Integer.parseInt(Q0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                r.c("Util", "Invalid display size: " + j02);
            }
            if ("Sony".equals(f19754c) && f19755d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i7 = f19752a;
        if (i7 >= 23) {
            T(display, point);
        } else if (i7 >= 17) {
            S(display, point);
        } else {
            R(display, point);
        }
        return point;
    }

    public static void P0(long[] jArr, long j7, long j8) {
        int i7 = 0;
        if (j8 >= j7 && j8 % j7 == 0) {
            long j9 = j8 / j7;
            while (i7 < jArr.length) {
                jArr[i7] = jArr[i7] / j9;
                i7++;
            }
            return;
        }
        if (j8 < j7 && j7 % j8 == 0) {
            long j10 = j7 / j8;
            while (i7 < jArr.length) {
                jArr[i7] = jArr[i7] * j10;
                i7++;
            }
            return;
        }
        double d7 = j7;
        double d8 = j8;
        Double.isNaN(d7);
        Double.isNaN(d8);
        double d9 = d7 / d8;
        while (i7 < jArr.length) {
            double d10 = jArr[i7];
            Double.isNaN(d10);
            jArr[i7] = (long) (d10 * d9);
            i7++;
        }
    }

    public static Looper Q() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static String[] Q0(String str, String str2) {
        return str.split(str2, -1);
    }

    private static void R(Display display, Point point) {
        display.getSize(point);
    }

    public static String[] R0(String str, String str2) {
        return str.split(str2, 2);
    }

    private static void S(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String[] S0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : Q0(str.trim(), "(\\s*,\\s*)");
    }

    private static void T(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long T0(long j7, long j8, long j9) {
        long j10 = j7 - j8;
        return ((j7 ^ j10) & (j8 ^ j7)) < 0 ? j9 : j10;
    }

    public static int U(int i7) {
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

    public static byte[] U0(InputStream inputStream) {
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

    public static int V(String str) {
        String[] Q0;
        int length;
        if (str == null || (length = (Q0 = Q0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = Q0[length - 1];
        boolean z6 = length >= 3 && "neg".equals(Q0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) a.e(str2));
            return z6 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long V0(int i7, int i8) {
        return W0(i8) | (W0(i7) << 32);
    }

    public static String W(int i7) {
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

    public static long W0(int i7) {
        return i7 & 4294967295L;
    }

    public static String X(Locale locale) {
        return f19752a >= 21 ? Y(locale) : locale.toString();
    }

    public static CharSequence X0(CharSequence charSequence, int i7) {
        return charSequence.length() <= i7 ? charSequence : charSequence.subSequence(0, i7);
    }

    private static String Y(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long Y0(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static long Z(long j7, float f7) {
        if (f7 == 1.0f) {
            return j7;
        }
        double d7 = j7;
        double d8 = f7;
        Double.isNaN(d7);
        Double.isNaN(d8);
        return Math.round(d7 * d8);
    }

    public static void Z0(Parcel parcel, boolean z6) {
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static long a0(long j7) {
        return j7 == -9223372036854775807L ? System.currentTimeMillis() : j7 + SystemClock.elapsedRealtime();
    }

    public static long b(long j7, long j8, long j9) {
        long j10 = j7 + j8;
        return ((j7 ^ j10) & (j8 ^ j10)) < 0 ? j9 : j10;
    }

    public static int b0(int i7) {
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

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static s1 c0(int i7, int i8, int i9) {
        return new s1.b().e0("audio/raw").H(i8).f0(i9).Y(i7).E();
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t6, boolean z6, boolean z7) {
        int i7;
        int binarySearch = Collections.binarySearch(list, t6);
        if (binarySearch < 0) {
            i7 = binarySearch ^ (-1);
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t6) == 0);
            i7 = z6 ? binarySearch - 1 : binarySearch;
        }
        return z7 ? Math.min(list.size() - 1, i7) : i7;
    }

    public static int d0(int i7, int i8) {
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
        return i8 * 2;
    }

    public static int e(long[] jArr, long j7, boolean z6, boolean z7) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i7 = binarySearch ^ (-1);
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j7);
            i7 = z6 ? binarySearch - 1 : binarySearch;
        }
        return z7 ? Math.min(jArr.length - 1, i7) : i7;
    }

    public static long e0(long j7, float f7) {
        if (f7 == 1.0f) {
            return j7;
        }
        double d7 = j7;
        double d8 = f7;
        Double.isNaN(d7);
        Double.isNaN(d8);
        return Math.round(d7 / d8);
    }

    public static <T extends Comparable<? super T>> int f(List<? extends Comparable<? super T>> list, T t6, boolean z6, boolean z7) {
        int i7;
        int binarySearch = Collections.binarySearch(list, t6);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t6) == 0);
            i7 = z6 ? binarySearch + 1 : binarySearch;
        }
        return z7 ? Math.max(0, i7) : i7;
    }

    public static int f0(int i7) {
        if (i7 == 13) {
            return 1;
        }
        switch (i7) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case w0.f2149o /* 7 */:
            case w0.f2150p /* 8 */:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static int g(s sVar, long j7, boolean z6, boolean z7) {
        int i7;
        int c7 = sVar.c() - 1;
        int i8 = 0;
        while (i8 <= c7) {
            int i9 = (i8 + c7) >>> 1;
            if (sVar.b(i9) < j7) {
                i8 = i9 + 1;
            } else {
                c7 = i9 - 1;
            }
        }
        if (z6 && (i7 = c7 + 1) < sVar.c() && sVar.b(i7) == j7) {
            return i7;
        }
        if (z7 && c7 == -1) {
            return 0;
        }
        return c7;
    }

    public static String[] g0() {
        String[] h02 = h0();
        for (int i7 = 0; i7 < h02.length; i7++) {
            h02[i7] = D0(h02[i7]);
        }
        return h02;
    }

    public static int h(int[] iArr, int i7, boolean z6, boolean z7) {
        int i8;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i7);
            i8 = z6 ? binarySearch + 1 : binarySearch;
        }
        return z7 ? Math.max(0, i8) : i8;
    }

    private static String[] h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f19752a >= 24 ? i0(configuration) : new String[]{X(configuration.locale)};
    }

    public static int i(long[] jArr, long j7, boolean z6, boolean z7) {
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
            i7 = z6 ? binarySearch + 1 : binarySearch;
        }
        return z7 ? Math.max(0, i7) : i7;
    }

    private static String[] i0(Configuration configuration) {
        return Q0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static <T> T j(T t6) {
        return t6;
    }

    private static String j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            r.d("Util", "Failed to read system property " + str, e7);
            return null;
        }
    }

    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    public static String k0(int i7) {
        switch (i7) {
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
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i7 < 10000) {
                    return "?";
                }
                return "custom (" + i7 + ")";
        }
    }

    public static int l(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static String l0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.18.1";
    }

    public static long m(long j7, long j8) {
        return ((j7 + j8) - 1) / j8;
    }

    public static byte[] m0(String str) {
        return str.getBytes(l4.d.f18614c);
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int n0(Uri uri) {
        int o02;
        String scheme = uri.getScheme();
        if (scheme != null && l4.b.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (o02 = o0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return o02;
        }
        Matcher matcher = f19761j.matcher((CharSequence) a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int o(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    public static int o0(String str) {
        String e7 = l4.b.e(str);
        e7.hashCode();
        switch (e7) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static float p(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f7, f9));
    }

    public static int p0(Uri uri, String str) {
        if (str == null) {
            return n0(uri);
        }
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

    public static int q(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static boolean q0(a0 a0Var, a0 a0Var2, Inflater inflater) {
        if (a0Var.a() <= 0) {
            return false;
        }
        if (a0Var2.b() < a0Var.a()) {
            a0Var2.c(a0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(a0Var.d(), a0Var.e(), a0Var.a());
        int i7 = 0;
        while (true) {
            try {
                i7 += inflater.inflate(a0Var2.d(), i7, a0Var2.b() - i7);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i7 == a0Var2.b()) {
                        a0Var2.c(a0Var2.b() * 2);
                    }
                } else {
                    a0Var2.N(i7);
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static long r(long j7, long j8, long j9) {
        return Math.max(j8, Math.min(j7, j9));
    }

    public static boolean r0(Context context) {
        return f19752a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s0(int i7) {
        return i7 == 536870912 || i7 == 805306368 || i7 == 4;
    }

    public static int t(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = f19765n[((i9 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static boolean t0(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4;
    }

    public static int u(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = f19766o[i9 ^ (bArr[i7] & 255)];
            i7++;
        }
        return i9;
    }

    public static boolean u0(int i7) {
        return i7 == 10 || i7 == 13;
    }

    public static Handler v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean v0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static Handler w() {
        return x(null);
    }

    public static boolean w0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Handler x(Handler.Callback callback) {
        return v((Looper) a.h(Looper.myLooper()), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread x0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Handler y() {
        return z(null);
    }

    public static int y0(int[] iArr, int i7) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (iArr[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public static Handler z(Handler.Callback callback) {
        return v(Q(), callback);
    }

    private static String z0(String str) {
        int i7 = 0;
        while (true) {
            String[] strArr = f19764m;
            if (i7 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i7])) {
                return strArr[i7 + 1] + str.substring(strArr[i7].length());
            }
            i7 += 2;
        }
    }
}
