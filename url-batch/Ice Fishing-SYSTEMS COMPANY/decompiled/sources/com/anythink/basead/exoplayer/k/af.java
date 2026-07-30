package com.anythink.basead.exoplayer.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8503a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f8504b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f8505c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f8506d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f8507e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f8508f = "Util";

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f8509g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f8510h;
    private static final Pattern i;

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f8511j;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i4 = 26;
        }
        f8503a = i4;
        String str = Build.DEVICE;
        f8504b = str;
        String str2 = Build.MANUFACTURER;
        f8505c = str2;
        String str3 = Build.MODEL;
        f8506d = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        f8507e = D.y.j(i4, ", ", sb);
        f8509g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f8510h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f8511j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    private af() {
    }

    private static boolean a() {
        return false;
    }

    public static int b(long j9, long j10) {
        if (j9 < j10) {
            return -1;
        }
        return j9 == j10 ? 0 : 1;
    }

    public static boolean c(int i4) {
        return i4 == Integer.MIN_VALUE || i4 == 1073741824;
    }

    public static int d(int i4) {
        if (i4 == 0) {
            return 2;
        }
        if (i4 == 1) {
            return 13;
        }
        if (i4 == 2) {
            return 6;
        }
        int i9 = 4;
        if (i4 != 4) {
            i9 = 5;
            if (i4 != 5) {
                return i4 != 8 ? 1 : 3;
            }
        }
        return i9;
    }

    public static int e(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2 || i4 == 4 || i4 == 5 || i4 == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int f(int i4) {
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

    public static byte[] g(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i9 = i4 * 2;
            bArr[i4] = (byte) (Character.digit(str.charAt(i9 + 1), 16) + (Character.digit(str.charAt(i9), 16) << 4));
        }
        return bArr;
    }

    private static int h(int i4) {
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 2;
        }
        if (i4 != 24) {
            return i4 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    private static long i(String str) {
        Matcher matcher = f8510h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
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
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    private static long j(String str) {
        Matcher matcher = f8509g.matcher(str);
        if (!matcher.matches()) {
            throw new com.anythink.basead.exoplayer.t("Invalid date/time format: ".concat(String.valueOf(str)));
        }
        int i4 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i4 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i4 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i4 != 0 ? timeInMillis - (i4 * 60000) : timeInMillis;
    }

    private static UUID k(String str) {
        String d2 = d(str);
        d2.getClass();
        switch (d2) {
            case "playready":
                return com.anythink.basead.exoplayer.b.bl;
            case "widevine":
                return com.anythink.basead.exoplayer.b.bk;
            case "clearkey":
                return com.anythink.basead.exoplayer.b.bj;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    private static int l(String str) {
        String d2 = d(str);
        if (d2.endsWith(".mpd")) {
            return 0;
        }
        if (d2.endsWith(".m3u8")) {
            return 2;
        }
        return d2.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    private static String m(String str) {
        int length = str.length();
        int i4 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (a(str.charAt(i10))) {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i9 * 2) + length);
        while (i9 > 0) {
            int i11 = i4 + 1;
            char charAt = str.charAt(i4);
            if (a(charAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(charAt));
                i9--;
            } else {
                sb.append(charAt);
            }
            i4 = i11;
        }
        if (i4 < length) {
            sb.append((CharSequence) str, i4, length);
        }
        return sb.toString();
    }

    private static boolean a(char c4) {
        return c4 == '\"' || c4 == '%' || c4 == '*' || c4 == '/' || c4 == ':' || c4 == '<' || c4 == '\\' || c4 == '|' || c4 == '>' || c4 == '?';
    }

    public static boolean b(int i4) {
        return i4 == 3 || i4 == 2 || i4 == Integer.MIN_VALUE || i4 == 1073741824 || i4 == 4;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    private static long d(long j9, long j10) {
        long j11 = j9 + j10;
        if (((j9 ^ j11) & (j10 ^ j11)) < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    private static long e(long j9, long j10) {
        long j11 = j9 - j10;
        if (((j9 ^ j11) & (j10 ^ j9)) < 0) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    public static int f(String str) {
        int length = str.length();
        C0544a.a(length <= 4);
        int i4 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i4 = (i4 << 8) | str.charAt(i9);
        }
        return i4;
    }

    public static String h(String str) {
        int length = str.length();
        int i4 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) == '%') {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        int i11 = length - (i9 * 2);
        StringBuilder sb = new StringBuilder(i11);
        Matcher matcher = i.matcher(str);
        while (i9 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt(matcher.group(1), 16);
            sb.append((CharSequence) str, i4, matcher.start());
            sb.append(parseInt);
            i4 = matcher.end();
            i9--;
        }
        if (i4 < length) {
            sb.append((CharSequence) str, i4, length);
        }
        if (sb.length() != i11) {
            return null;
        }
        return sb.toString();
    }

    public static boolean a(int i4) {
        return i4 == 10 || i4 == 13;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return d(str);
        }
    }

    private static long c(long j9, long j10) {
        return ((j9 + j10) - 1) / j10;
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    private static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static File c(Context context, String str) {
        return File.createTempFile(str, null, context.getCacheDir());
    }

    private static void d(Display display, Point point) {
        point.x = display.getWidth();
        point.y = display.getHeight();
    }

    public static int g(int i4) {
        if (i4 == 0) {
            return com.anythink.basead.exoplayer.b.bc;
        }
        if (i4 == 1) {
            return com.anythink.basead.exoplayer.b.aZ;
        }
        if (i4 == 2) {
            return com.anythink.basead.exoplayer.b.aY;
        }
        if (i4 == 3 || i4 == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    private static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    private static void c(Display display, Point point) {
        display.getSize(point);
    }

    private static <T> int b(List<? extends Comparable<? super T>> list, T t9, boolean z8, boolean z9) {
        int i4;
        int i9;
        int binarySearch = Collections.binarySearch(list, t9);
        if (binarySearch < 0) {
            i9 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i4 = binarySearch + 1;
                if (i4 >= size || list.get(i4).compareTo(t9) != 0) {
                    break;
                }
                binarySearch = i4;
            }
            i9 = z8 ? binarySearch : i4;
        }
        return z9 ? Math.min(list.size() - 1, i9) : i9;
    }

    public static ComponentName a(Context context, Intent intent) {
        ComponentName startForegroundService;
        if (f8503a >= 26) {
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
        return context.startService(intent);
    }

    public static long b(long j9, float f6) {
        return f6 == 1.0f ? j9 : Math.round(j9 / f6);
    }

    public static int b(int i4, int i9) {
        if (i4 == Integer.MIN_VALUE) {
            return i9 * 3;
        }
        if (i4 != 1073741824) {
            if (i4 == 2) {
                return i9 * 2;
            }
            if (i4 == 3) {
                return i9;
            }
            if (i4 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i9 * 4;
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    private static int b(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return l(path);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static <T extends Throwable> void b(Throwable th) {
        throw th;
    }

    private static boolean a(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    private static void b(Display display, Point point) {
        display.getRealSize(point);
    }

    private static File b(Context context, String str) {
        File createTempFile = File.createTempFile(str, null, context.getCacheDir());
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    public static <T> void a(List<T> list, int i4, int i9) {
        list.subList(i4, i9).clear();
    }

    public static <T> T[] a(T[] tArr, int i4) {
        C0544a.a(i4 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i4);
    }

    public static ExecutorService a(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.anythink.basead.exoplayer.k.af.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static void a(com.anythink.basead.exoplayer.j.h hVar) {
        if (hVar != null) {
            try {
                hVar.b();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(Parcel parcel, boolean z8) {
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static String a(byte[] bArr, int i4, int i9) {
        return new String(bArr, i4, i9, Charset.forName("UTF-8"));
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int a(int i4, int i9) {
        return ((i4 + i9) - 1) / i9;
    }

    public static int a(int i4, int i9, int i10) {
        return Math.max(i9, Math.min(i4, i10));
    }

    public static long a(long j9, long j10) {
        return Math.max(0L, Math.min(j9, j10));
    }

    public static float a(float f6) {
        return Math.max(0.1f, Math.min(f6, 8.0f));
    }

    public static int a(int[] iArr, int i4) {
        int binarySearch = Arrays.binarySearch(iArr, i4);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i4);
        return binarySearch;
    }

    public static int a(long[] jArr, long j9, boolean z8) {
        int i4;
        int binarySearch = Arrays.binarySearch(jArr, j9);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                int i9 = binarySearch - 1;
                if (i9 < 0 || jArr[i9] != j9) {
                    break;
                }
                binarySearch = i9;
            }
            i4 = binarySearch;
        }
        return z8 ? Math.max(0, i4) : i4;
    }

    private static <T> int a(List<? extends Comparable<? super T>> list, T t9, boolean z8, boolean z9) {
        int i4;
        int i9;
        int binarySearch = Collections.binarySearch(list, t9);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i4 = binarySearch - 1;
                if (i4 < 0 || list.get(i4).compareTo(t9) != 0) {
                    break;
                }
                binarySearch = i4;
            }
            i9 = z8 ? binarySearch : i4;
        }
        return z9 ? Math.max(0, i9) : i9;
    }

    public static int a(long[] jArr, long j9, boolean z8, boolean z9) {
        int i4;
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j9);
        if (binarySearch < 0) {
            i9 = ~binarySearch;
        } else {
            while (true) {
                i4 = binarySearch + 1;
                if (i4 >= jArr.length || jArr[i4] != j9) {
                    break;
                }
                binarySearch = i4;
            }
            i9 = z8 ? binarySearch : i4;
        }
        return z9 ? Math.min(jArr.length - 1, i9) : i9;
    }

    public static long a(long j9, long j10, long j11) {
        if (j11 >= j10 && j11 % j10 == 0) {
            return j9 / (j11 / j10);
        }
        if (j11 < j10 && j10 % j11 == 0) {
            return (j10 / j11) * j9;
        }
        return (long) (j9 * (j10 / j11));
    }

    private static long[] a(List<Long> list, long j9, long j10) {
        int size = list.size();
        long[] jArr = new long[size];
        int i4 = 0;
        if (j10 >= j9 && j10 % j9 == 0) {
            long j11 = j10 / j9;
            while (i4 < size) {
                jArr[i4] = list.get(i4).longValue() / j11;
                i4++;
            }
        } else if (j10 >= j9 || j9 % j10 != 0) {
            double d2 = j9 / j10;
            while (i4 < size) {
                jArr[i4] = (long) (list.get(i4).longValue() * d2);
                i4++;
            }
        } else {
            long j12 = j9 / j10;
            while (i4 < size) {
                jArr[i4] = list.get(i4).longValue() * j12;
                i4++;
            }
        }
        return jArr;
    }

    public static void a(long[] jArr, long j9) {
        int i4 = 0;
        if (j9 >= 1000000 && j9 % 1000000 == 0) {
            long j10 = j9 / 1000000;
            while (i4 < jArr.length) {
                jArr[i4] = jArr[i4] / j10;
                i4++;
            }
            return;
        }
        if (j9 < 1000000 && 1000000 % j9 == 0) {
            long j11 = 1000000 / j9;
            while (i4 < jArr.length) {
                jArr[i4] = jArr[i4] * j11;
                i4++;
            }
            return;
        }
        double d2 = 1000000.0d / j9;
        while (i4 < jArr.length) {
            jArr[i4] = (long) (jArr[i4] * d2);
            i4++;
        }
    }

    public static long a(long j9, float f6) {
        return f6 == 1.0f ? j9 : Math.round(j9 * f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long a(long j9, com.anythink.basead.exoplayer.ac acVar, long j10, long j11) {
        if (com.anythink.basead.exoplayer.ac.f6468a.equals(acVar)) {
            return j9;
        }
        long j12 = acVar.f6473f;
        long j13 = j9 - j12;
        if (((j12 ^ j9) & (j9 ^ j13)) < 0) {
            j13 = Long.MIN_VALUE;
        }
        long j14 = acVar.f6474g;
        long j15 = j9 + j14;
        if (((j14 ^ j15) & (j9 ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z8 = false;
        boolean z9 = j13 <= j10 && j10 <= j15;
        if (j13 <= j11 && j11 <= j15) {
            z8 = true;
        }
        if (!z9 || !z8) {
            if (!z9) {
                return z8 ? j11 : j13;
            }
            return j10;
        }
        if (Math.abs(j10 - j9) <= Math.abs(j11 - j9)) {
            return j10;
        }
    }

    public static int[] a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = list.get(i4).intValue();
        }
        return iArr;
    }

    public static String a(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < objArr.length; i4++) {
            sb.append(objArr[i4].getClass().getSimpleName());
            if (i4 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static String a(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        return AbstractC5051n.g(sb, Build.VERSION.RELEASE, ") ExoPlayerLib/2.8.4");
    }

    private static String a(String str, int i4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.trim().split("(\\s*,\\s*)", -1);
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i4 == o.f(str2)) {
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

    private static int a(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            String path = uri.getPath();
            if (path == null) {
                return 3;
            }
            return l(path);
        }
        return l(com.anythink.core.common.d.j.f12535z.concat(String.valueOf(str)));
    }

    private static String a(StringBuilder sb, Formatter formatter, long j9) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j9 = 0;
        }
        long j10 = (j9 + 500) / 1000;
        long j11 = j10 % 60;
        long j12 = (j10 / 60) % 60;
        long j13 = j10 / com.anythink.expressad.f.a.b.f18559P;
        sb.setLength(0);
        if (j13 > 0) {
            return formatter.format("%d:%02d:%02d", Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString();
        }
        return formatter.format("%02d:%02d", Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    private static void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        file.delete();
    }

    private static int a(byte[] bArr, int i4, int i9, int i10) {
        while (i4 < i9) {
            i10 = f8511j[((i10 >>> 24) ^ (bArr[i4] & p.f8630b)) & p.f8630b] ^ (i10 << 8);
            i4++;
        }
        return i10;
    }

    public static Point a(Context context) {
        return a(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006e, code lost:
    
        if (r4.equals("TPM171E") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Point a(Context context, Display display) {
        String str;
        if (f8503a < 25 && display.getDisplayId() == 0) {
            String str2 = f8505c;
            if ("Sony".equals(str2) && f8506d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (!"NVIDIA".equals(str2) || !f8506d.contains("SHIELD")) {
                if ("philips".equals(d(str2))) {
                    String str3 = f8506d;
                    if (!str3.startsWith("QM1")) {
                        if (!str3.equals("QV151E")) {
                        }
                    }
                }
            }
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", String.class).invoke(cls, "sys.display-size");
            } catch (Exception e6) {
                Log.e(f8508f, "Failed to read sys.display-size", e6);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e(f8508f, "Invalid sys.display-size: ".concat(String.valueOf(str)));
            }
        }
        Point point = new Point();
        int i4 = f8503a;
        if (i4 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i4 >= 17) {
            display.getRealSize(point);
        } else if (i4 >= 16) {
            display.getSize(point);
        } else {
            point.x = display.getWidth();
            point.y = display.getHeight();
        }
        return point;
    }

    private static void a(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void a(Throwable th) {
        throw th;
    }
}
