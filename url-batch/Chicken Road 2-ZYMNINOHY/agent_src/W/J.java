package W;

import E.AbstractC0005f;
import E1.P;
import a.AbstractC0124a;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import i2.AbstractC0457a;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import w2.C1503a;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3263a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3264b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f3265c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3266d;

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f3267e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f3268f;

    /* renamed from: g, reason: collision with root package name */
    public static HashMap f3269g;

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f3270h;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f3271i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f3272j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3273k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f3274l;

    static {
        int i4 = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f3263a = str + ", " + Build.MODEL + ", " + str2 + ", " + i4;
        f3264b = new byte[0];
        f3265c = new long[0];
        f3266d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        f3267e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f3268f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f3270h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f3271i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f3272j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f3273k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f3274l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, BuildConfig.API_LEVEL, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j4) {
        return j4 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j4;
    }

    public static int B(int i4, ByteOrder byteOrder) {
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i4 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i4 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long C(long j4, float f4) {
        return f4 == 1.0f ? j4 : Math.round(j4 / f4);
    }

    public static String D(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            AbstractC0108a.f("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    public static String E(int i4) {
        switch (i4) {
            case -2:
                return "none";
            case -1:
                return CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
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
                return i4 >= 10000 ? AbstractC0005f.k(i4, "custom (", ")") : "?";
        }
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
    public static int F(Uri uri, String str) {
        int i4;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!U.i.h("rtsp", scheme) && !U.i.h("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String D3 = U.i.D(lastPathSegment.substring(lastIndexOf + 1));
                        D3.getClass();
                        switch (D3) {
                            case "ism":
                            case "isml":
                                i4 = 1;
                                break;
                            case "mpd":
                                i4 = 0;
                                break;
                            case "m3u8":
                                i4 = 2;
                                break;
                            default:
                                i4 = 4;
                                break;
                        }
                        if (i4 != 4) {
                            return i4;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = f3268f.matcher(path);
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
        throw new UnsupportedOperationException("Method not decompiled: W.J.F(android.net.Uri, java.lang.String):int");
    }

    public static void G(int i4) {
        Integer.toString(i4, 36);
    }

    public static boolean H(int i4) {
        return i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4;
    }

    public static boolean I(Context context) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i4 == 30) {
            String str = Build.MODEL;
            if (U.i.h(str, "moto g(20)") || U.i.h(str, "rmx3231")) {
                return true;
            }
        }
        return i4 == 34 && U.i.h(Build.MODEL, "sm-x200");
    }

    public static boolean J(int i4) {
        return i4 == 10 || i4 == 13;
    }

    public static boolean K(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean L(u uVar, u uVar2, Inflater inflater) {
        if (uVar.a() > 0 && uVar.j() == 120 && uVar.a() != 0) {
            if (uVar2.f3351a.length < uVar.a()) {
                uVar2.c(uVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(uVar.f3351a, uVar.f3352b, uVar.a());
            int i4 = 0;
            while (true) {
                try {
                    byte[] bArr = uVar2.f3351a;
                    i4 += inflater.inflate(bArr, i4, bArr.length - i4);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = uVar2.f3351a;
                        if (i4 == bArr2.length) {
                            uVar2.c(bArr2.length * 2);
                        }
                    } else {
                        uVar2.L(i4);
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

    public static long M(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    public static String N(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String D3 = U.i.D(str);
        int i4 = 0;
        String str2 = D3.split(TokenBuilder.TOKEN_DELIMITER, 2)[0];
        if (f3269g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f3270h;
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
            for (int i5 = 0; i5 < strArr.length; i5 += 2) {
                hashMap.put(strArr[i5], strArr[i5 + 1]);
            }
            f3269g = hashMap;
        }
        String str4 = (String) f3269g.get(str2);
        if (str4 != null) {
            D3 = str4 + D3.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return D3;
        }
        while (true) {
            String[] strArr2 = f3271i;
            if (i4 >= strArr2.length) {
                return D3;
            }
            if (D3.startsWith(strArr2[i4])) {
                return strArr2[i4 + 1] + D3.substring(strArr2[i4].length());
            }
            i4 += 2;
        }
    }

    public static Object[] O(int i4, Object[] objArr) {
        AbstractC0124a.h(i4 <= objArr.length);
        return Arrays.copyOf(objArr, i4);
    }

    public static long P(String str) {
        Matcher matcher = f3266d.matcher(str);
        if (!matcher.matches()) {
            throw T.G.a(null, "Invalid date/time format: " + str);
        }
        int i4 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int parseInt = Integer.parseInt(matcher.group(12)) * 60;
            String group = matcher.group(13);
            i4 = group != null ? Integer.parseInt(group) + parseInt : parseInt;
            if (TokenBuilder.TOKEN_DELIMITER.equals(matcher.group(11))) {
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

    public static void Q(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void R(ArrayList arrayList, int i4, int i5) {
        if (i4 < 0 || i5 > arrayList.size() || i4 > i5) {
            throw new IllegalArgumentException();
        }
        if (i4 != i5) {
            arrayList.subList(i4, i5).clear();
        }
    }

    public static long S(int i4, long j4) {
        return U(j4, 1000000L, i4, RoundingMode.DOWN);
    }

    public static void T(long[] jArr, long j4) {
        long j5;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i4 = 0;
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            long h2 = AbstractC0347t0.h(j4, 1000000L, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = AbstractC0347t0.h(jArr[i4], h2, roundingMode);
                i4++;
            }
            return;
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            long h4 = AbstractC0347t0.h(1000000L, j4, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = AbstractC0347t0.q(jArr[i4], h4);
                i4++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < jArr.length) {
            long j6 = jArr[i5];
            if (j6 != 0) {
                if (j4 >= j6 && j4 % j6 == 0) {
                    jArr[i5] = AbstractC0347t0.h(1000000L, AbstractC0347t0.h(j4, j6, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j4 >= j6 || j6 % j4 != 0) {
                    j5 = j4;
                    jArr[i5] = V(j6, 1000000L, j5, roundingMode);
                    i5++;
                    j4 = j5;
                } else {
                    jArr[i5] = AbstractC0347t0.q(1000000L, AbstractC0347t0.h(j6, j4, RoundingMode.UNNECESSARY));
                }
            }
            j5 = j4;
            i5++;
            j4 = j5;
        }
    }

    public static long U(long j4, long j5, long j6, RoundingMode roundingMode) {
        if (j4 == 0 || j5 == 0) {
            return 0L;
        }
        return (j6 < j5 || j6 % j5 != 0) ? (j6 >= j5 || j5 % j6 != 0) ? (j6 < j4 || j6 % j4 != 0) ? (j6 >= j4 || j4 % j6 != 0) ? V(j4, j5, j6, roundingMode) : AbstractC0347t0.q(j5, AbstractC0347t0.h(j4, j6, RoundingMode.UNNECESSARY)) : AbstractC0347t0.h(j5, AbstractC0347t0.h(j6, j4, RoundingMode.UNNECESSARY), roundingMode) : AbstractC0347t0.q(j4, AbstractC0347t0.h(j5, j6, RoundingMode.UNNECESSARY)) : AbstractC0347t0.h(j4, AbstractC0347t0.h(j6, j5, RoundingMode.UNNECESSARY), roundingMode);
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
    public static long V(long j4, long j5, long j6, RoundingMode roundingMode) {
        double d4;
        long j7;
        long q4 = AbstractC0347t0.q(j4, j5);
        if (q4 != Long.MAX_VALUE && q4 != Long.MIN_VALUE) {
            return AbstractC0347t0.h(q4, j6, roundingMode);
        }
        long j8 = AbstractC0347t0.j(Math.abs(j5), Math.abs(j6));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long h2 = AbstractC0347t0.h(j5, j8, roundingMode2);
        long h4 = AbstractC0347t0.h(j6, j8, roundingMode2);
        long j9 = AbstractC0347t0.j(Math.abs(j4), Math.abs(h4));
        long h5 = AbstractC0347t0.h(j4, j9, roundingMode2);
        long h6 = AbstractC0347t0.h(h4, j9, roundingMode2);
        long q5 = AbstractC0347t0.q(h5, h2);
        if (q5 != Long.MAX_VALUE && q5 != Long.MIN_VALUE) {
            return AbstractC0347t0.h(q5, h6, roundingMode);
        }
        double d5 = h5 * (h2 / h6);
        if (d5 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d5 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i4 = x2.c.f15984a;
        if (!V3.b.s(d5)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (x2.b.f15983a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0457a.e(x2.c.a(d5));
                d4 = d5;
                if (!((-9.223372036854776E18d) - d4 >= 1.0d) || !(d4 < 9.223372036854776E18d)) {
                    return (long) d4;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 2:
                if (d5 < 0.0d && !x2.c.a(d5)) {
                    j7 = ((long) d5) - 1;
                    d4 = j7;
                    if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                    }
                }
                d4 = d5;
                if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d5 > 0.0d && !x2.c.a(d5)) {
                    j7 = ((long) d5) + 1;
                    d4 = j7;
                    if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                    }
                }
                d4 = d5;
                if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d4 = d5;
                if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!x2.c.a(d5)) {
                    d4 = ((long) d5) + (d5 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                    }
                }
                d4 = d5;
                if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d4 = Math.rint(d5);
                if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d4 = Math.rint(d5);
                if (Math.abs(d5 - d4) == 0.5d) {
                    d4 = Math.copySign(0.5d, d5) + d5;
                }
                if (!(((-9.223372036854776E18d) - d4 >= 1.0d) & (d4 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d4 = Math.rint(d5);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static String[] W(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String X(int i4) {
        return new String(new byte[]{(byte) (i4 >> 24), (byte) (i4 >> 16), (byte) (i4 >> 8), (byte) i4}, StandardCharsets.US_ASCII);
    }

    public static String Y(byte[] bArr) {
        boolean z;
        w2.b bVar = w2.e.f15931e;
        w2.e eVar = bVar.f15934c;
        if (eVar == null) {
            C1503a c1503a = bVar.f15932a;
            char[] cArr = c1503a.f15922b;
            int length = cArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (U.i.p(cArr[i4])) {
                    int length2 = cArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            z = false;
                            break;
                        }
                        char c4 = cArr[i5];
                        if (c4 >= 'a' && c4 <= 'z') {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    AbstractC0124a.s("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i6 = 0; i6 < cArr.length; i6++) {
                        char c5 = cArr[i6];
                        if (U.i.p(c5)) {
                            c5 = (char) (c5 ^ ' ');
                        }
                        cArr2[i6] = c5;
                    }
                    C1503a c1503a2 = new C1503a(AbstractC0005f.q(new StringBuilder(), c1503a.f15921a, ".lowerCase()"), cArr2);
                    c1503a = c1503a.f15929i ? c1503a2.b() : c1503a2;
                } else {
                    i4++;
                }
            }
            eVar = c1503a == bVar.f15932a ? bVar : new w2.b(c1503a);
            bVar.f15934c = eVar;
        }
        int length3 = bArr.length;
        AbstractC0124a.r(0, length3, bArr.length);
        C1503a c1503a3 = eVar.f15932a;
        int i7 = c1503a3.f15925e;
        int i8 = c1503a3.f15926f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(AbstractC0124a.v(length3, i8) * i7);
        try {
            eVar.c(sb, bArr, length3);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public static long Z(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 / 1000;
    }

    public static long a(long j4, long j5) {
        long j6 = j4 + j5;
        long j7 = (((j5 ^ j4) > 0L ? 1 : ((j5 ^ j4) == 0L ? 0 : -1)) < 0) | ((j4 ^ j6) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 != Long.MIN_VALUE || j6 == Long.MIN_VALUE) && (j7 != Long.MAX_VALUE || j6 == Long.MAX_VALUE)) {
            return j7;
        }
        return Long.MAX_VALUE;
    }

    public static int b(long[] jArr, long j4, boolean z) {
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
        return z ? binarySearch : i4;
    }

    public static int c(P p2, long j4) {
        int i4 = p2.f518b - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            if (p2.d(i6) < j4) {
                i5 = i6 + 1;
            } else {
                i4 = i6 - 1;
            }
        }
        int i7 = i4 + 1;
        if (i7 < p2.f518b && p2.d(i7) == j4) {
            return i7;
        }
        if (i4 == -1) {
            return 0;
        }
        return i4;
    }

    public static int d(List list, Long l4, boolean z) {
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
        return z ? Math.max(0, i4) : i4;
    }

    public static int e(int[] iArr, int i4, boolean z, boolean z4) {
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
            i6 = z ? binarySearch : i5;
        }
        return z4 ? Math.max(0, i6) : i6;
    }

    public static int f(long[] jArr, long j4, boolean z) {
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
        return z ? Math.max(0, i4) : i4;
    }

    public static int g(int i4, int i5) {
        return ((i4 + i5) - 1) / i5;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float i(float f4, float f5, float f6) {
        return Math.max(f5, Math.min(f4, f6));
    }

    public static int j(int i4, int i5, int i6) {
        return Math.max(i5, Math.min(i4, i6));
    }

    public static long k(long j4, long j5, long j6) {
        return Math.max(j5, Math.min(j4, j6));
    }

    public static boolean l(SparseArray sparseArray, int i4) {
        return sparseArray.indexOfKey(i4) >= 0;
    }

    public static boolean m(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int n(int i4, int i5, int i6, byte[] bArr) {
        while (i4 < i5) {
            i6 = f3272j[((i6 >>> 24) ^ (bArr[i4] & 255)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i6 << 8);
            i4++;
        }
        return i6;
    }

    public static Handler o(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int q(int i4) {
        if (i4 == 30) {
            return 34;
        }
        switch (i4) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i4) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i4) {
                            case C0583e9.f11744D /* 20 */:
                                return 30;
                            case 21:
                            case Build.API_LEVELS.API_22 /* 22 */:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static int r(int i4) {
        if (i4 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i4 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i4 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i4) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                switch (i4) {
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

    public static int s(int i4) {
        if (i4 != 2) {
            if (i4 == 3) {
                return 1;
            }
            if (i4 != 4) {
                if (i4 != 21) {
                    if (i4 != 22) {
                        if (i4 != 268435456) {
                            if (i4 != 1342177280) {
                                if (i4 != 1610612736) {
                                    throw new IllegalArgumentException();
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

    public static byte[] t(String str) {
        w2.b bVar = w2.e.f15931e;
        w2.e eVar = bVar.f15935d;
        if (eVar == null) {
            C1503a b4 = bVar.f15932a.b();
            eVar = b4 == bVar.f15932a ? bVar : new w2.b(b4);
            bVar.f15935d = eVar;
        }
        try {
            int length = (int) (((eVar.f15932a.f15924d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int a3 = eVar.a(bArr, eVar.d(str));
            if (a3 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[a3];
            System.arraycopy(bArr, 0, bArr2, 0, a3);
            return bArr2;
        } catch (w2.d e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int u(int i4, String str) {
        int i5 = 0;
        for (String str2 : W(str)) {
            if (i4 == T.F.h(T.F.d(str2))) {
                i5++;
            }
        }
        return i5;
    }

    public static String v(int i4, String str) {
        String[] W4 = W(str);
        if (W4.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : W4) {
            if (i4 == T.F.h(T.F.d(str2))) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static Point w(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && K(context)) {
            String D3 = Build.VERSION.SDK_INT < 28 ? D("sys.display-size") : D("vendor.display-size");
            if (!TextUtils.isEmpty(D3)) {
                try {
                    String[] split = D3.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC0108a.e("Util", "Invalid display size: " + D3);
            }
            if ("Sony".equals(android.os.Build.MANUFACTURER) && android.os.Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int x(int i4) {
        if (i4 == 2 || i4 == 4) {
            return 6005;
        }
        if (i4 == 10) {
            return 6004;
        }
        if (i4 == 7) {
            return 6005;
        }
        if (i4 == 8) {
            return 6003;
        }
        switch (i4) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case C0583e9.f11743C /* 19 */:
            case C0583e9.f11744D /* 20 */:
            case 21:
            case Build.API_LEVELS.API_22 /* 22 */:
                return 6004;
            default:
                switch (i4) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case Build.API_LEVELS.API_28 /* 28 */:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int y(String str) {
        String[] split;
        int length;
        int i4 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i4 = Integer.parseInt(str2);
            if (z) {
                return -i4;
            }
        } catch (NumberFormatException unused) {
        }
        return i4;
    }

    public static long z(long j4, float f4) {
        return f4 == 1.0f ? j4 : Math.round(j4 * f4);
    }
}
