package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3548lu {

    /* renamed from: a, reason: collision with root package name */
    public static final String f32613a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f32614b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f32615c;

    /* renamed from: d, reason: collision with root package name */
    public static HashMap f32616d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f32617e;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f32618f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f32619g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f32620h;
    public static final int[] i;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i4 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i4).length());
        AbstractC5051n.j(sb, str, ", ", str2, ", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i4);
        f32613a = sb.toString();
        f32614b = new byte[0];
        f32615c = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f32617e = new String[]{"alb", NativeAdvancedJsUtils.f18062n, "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", com.anythink.expressad.video.dynview.a.a.f21254S, "cze", "cs", com.anythink.expressad.f.a.b.ap, "nl", "ger", com.anythink.expressad.video.dynview.a.a.f21256U, "gre", "el", "fre", com.anythink.expressad.video.dynview.a.a.f21258W, "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", com.anythink.expressad.foundation.g.g.a.b.aZ, "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", com.anythink.expressad.foundation.g.g.a.b.aW, "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f32618f = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f32619g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f32620h = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        i = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, com.anythink.expressad.video.module.a.a.f21885Q, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, BaseATView.a.f9929H, 196, 195, 202, BaseATView.a.f9925D, 144, 151, 158, 153, 140, 139, com.anythink.expressad.video.module.a.a.f21889U, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, BaseATView.a.f9961z, BaseATView.a.f9926E, 219, 220, 213, BaseATView.a.f9930I, com.anythink.basead.exoplayer.k.p.f8630b, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, com.anythink.expressad.video.module.a.a.f21888T, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, BaseATView.a.f9927F, 200, 221, 218, BaseATView.a.J, BaseATView.a.f9931K, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, com.anythink.expressad.video.module.a.a.f21886R, 106, com.anythink.expressad.video.module.a.a.f21914z, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, com.anythink.expressad.video.module.a.a.f21890V, 222, 217, BaseATView.a.f9928G, 215, 194, 197, BaseATView.a.f9924C, BaseATView.a.f9923B, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String a(int i4) {
        return new String(new byte[]{(byte) (i4 >> 24), (byte) (i4 >> 16), (byte) (i4 >> 8), (byte) i4}, StandardCharsets.US_ASCII);
    }

    public static int b(int i4, ByteOrder byteOrder) {
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

    public static int c(int i4, ByteOrder byteOrder) {
        if (i4 == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i4 != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    public static boolean d(int i4) {
        return i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4 || i4 == 1895825408 || i4 == 1879048192 || i4 == 1912602624;
    }

    public static int e(int i4) {
        int i9;
        int i10 = 6396;
        if (i4 != 10) {
            if (i4 == 16) {
                i9 = 205215996;
            } else if (i4 != 24) {
                switch (i4) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return BaseATView.a.f9924C;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i4) {
                            case 12:
                                return 743676;
                            case 13:
                                i9 = 30136348;
                                break;
                            case 14:
                                i9 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                }
            } else {
                i9 = 67108860;
            }
            i10 = 0;
        } else {
            i9 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i9 : i10;
    }

    public static int f(int i4) {
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
                                    if (i4 == 1879048192) {
                                        return 8;
                                    }
                                    if (i4 != 1895825408) {
                                        if (i4 == 1912602624) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException();
                                    }
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

    public static int g(int i4) {
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
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i4) {
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

    public static int h(int i4, int i9, int i10, byte[] bArr) {
        while (i4 < i9) {
            i10 = f32619g[(i10 >>> 24) ^ (bArr[i4] & 255)] ^ (i10 << 8);
            i4++;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        r5.C(r4);
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(Lr lr, Lr lr2, Inflater inflater) {
        boolean z8;
        if (lr.B() > 0 && lr.I() == 120) {
            if (lr.B() == 0) {
                z8 = false;
            } else {
                if (lr2.f26233a.length < lr.B()) {
                    int B8 = lr.B();
                    lr2.A(B8 + B8);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(lr.f26233a, lr.f26234b, lr.B());
                int i4 = 0;
                while (true) {
                    try {
                        byte[] bArr = lr2.f26233a;
                        i4 += inflater.inflate(bArr, i4, bArr.length - i4);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break;
                            }
                            byte[] bArr2 = lr2.f26233a;
                            if (i4 == bArr2.length) {
                                int length = bArr2.length;
                                lr2.A(length + length);
                            }
                        } else {
                            break;
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
                z8 = false;
                inflater.reset();
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int k(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z8 = length >= 3 && "neg".equals(split[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int parseInt = Integer.parseInt(str2);
            return z8 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean l(Context context) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i4 == 30) {
            String str = Build.MODEL;
            if (AbstractC3035cL.D(str, "moto g(20)") || AbstractC3035cL.D(str, "rmx3231")) {
                return true;
            }
        }
        return i4 == 34 && AbstractC3035cL.D(Build.MODEL, "sm-x200");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r11 - r2) == 0.5d) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m(long j9, long j10, long j11, RoundingMode roundingMode) {
        double d2;
        long j12;
        long j13;
        long C7 = AbstractC3217fl.C(j9, j10);
        if (C7 != Long.MAX_VALUE && C7 != Long.MIN_VALUE) {
            return AbstractC3217fl.e(C7, j11, roundingMode);
        }
        long t9 = AbstractC3217fl.t(Math.abs(j10), Math.abs(j11));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long e6 = AbstractC3217fl.e(j10, t9, roundingMode2);
        long e9 = AbstractC3217fl.e(j11, t9, roundingMode2);
        long t10 = AbstractC3217fl.t(Math.abs(j9), Math.abs(e9));
        long e10 = AbstractC3217fl.e(j9, t10, roundingMode2);
        long e11 = AbstractC3217fl.e(e9, t10, roundingMode2);
        long C8 = AbstractC3217fl.C(e10, e6);
        if (C8 != Long.MAX_VALUE && C8 != Long.MIN_VALUE) {
            return AbstractC3217fl.e(C8, e11, roundingMode);
        }
        double d3 = (e6 / e11) * e10;
        if (d3 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d3 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i4 = QC.f27127a;
        if (!AbstractC2720Pd.r(d3)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (PC.f26879a[roundingMode.ordinal()]) {
            case 1:
                PA.v(QC.c(d3));
                d2 = d3;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                String valueOf = String.valueOf(roundingMode);
                StringBuilder sb = new StringBuilder(String.valueOf(d3).length() + 59 + valueOf.length());
                sb.append("rounded value is out of range for input ");
                sb.append(d3);
                sb.append(" and rounding mode ");
                sb.append(valueOf);
                throw new ArithmeticException(sb.toString());
            case 2:
                if (d3 < 0.0d && !QC.c(d3)) {
                    j12 = (long) d3;
                    j13 = -1;
                    d2 = j12 + j13;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d3 > 0.0d && !QC.c(d3)) {
                    j12 = (long) d3;
                    j13 = 1;
                    d2 = j12 + j13;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!QC.c(d3)) {
                    d2 = ((long) d3) + (d3 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = Math.rint(d3);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = Math.rint(d3);
                if (Math.abs(d3 - d2) == 0.5d) {
                    d2 = Math.copySign(0.5d, d3) + d3;
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = Math.rint(d3);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static String n(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e6) {
            AbstractC3217fl.X("Util", "Failed to read system property ".concat(str), e6);
            return null;
        }
    }

    public static Object[] o(Object[] objArr, int i4) {
        PA.n(i4 <= objArr.length);
        return Arrays.copyOf(objArr, i4);
    }

    public static Handler p() {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, null);
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(com.anythink.basead.exoplayer.b.ar)) {
            str = replace;
        }
        String f6 = AbstractC3035cL.f(str);
        int i4 = 0;
        String str2 = f6.split("-", 2)[0];
        if (f32616d == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f32617e;
            int length2 = strArr.length;
            HashMap hashMap = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i9 = 0; i9 < 88; i9 += 2) {
                hashMap.put(strArr[i9], strArr[i9 + 1]);
            }
            f32616d = hashMap;
        }
        String str4 = (String) f32616d.get(str2);
        if (str4 != null) {
            f6 = str4.concat(String.valueOf(f6.substring(str2.length())));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !com.anythink.expressad.video.dynview.a.a.f21254S.equals(str2)) {
            return f6;
        }
        while (true) {
            String[] strArr2 = f32618f;
            int length3 = strArr2.length;
            if (i4 >= 18) {
                return f6;
            }
            if (f6.startsWith(strArr2[i4])) {
                return String.valueOf(strArr2[i4 + 1]).concat(String.valueOf(f6.substring(strArr2[i4].length())));
            }
            i4 += 2;
        }
    }

    public static int r(int[] iArr, int i4, boolean z8, boolean z9) {
        int i9;
        int i10;
        int binarySearch = Arrays.binarySearch(iArr, i4);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                i9 = binarySearch - 1;
                if (i9 < 0 || iArr[i9] != i4) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z8 ? binarySearch : i9;
        }
        return z9 ? Math.max(0, i10) : i10;
    }

    public static int s(long[] jArr, long j9, boolean z8) {
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

    public static long t(long j9) {
        return (j9 == com.anythink.basead.exoplayer.b.f6539b || j9 == Long.MIN_VALUE) ? j9 : j9 / 1000;
    }

    public static long u(long j9) {
        return (j9 == com.anythink.basead.exoplayer.b.f6539b || j9 == Long.MIN_VALUE) ? j9 : j9 * 1000;
    }

    public static long v(int i4, long j9) {
        return w(j9, 1000000L, i4, RoundingMode.DOWN);
    }

    public static long w(long j9, long j10, long j11, RoundingMode roundingMode) {
        if (j9 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (j11 < j9 || j11 % j9 != 0) ? (j11 >= j9 || j9 % j11 != 0) ? m(j9, j10, j11, roundingMode) : AbstractC3217fl.C(j10, AbstractC3217fl.e(j9, j11, RoundingMode.UNNECESSARY)) : AbstractC3217fl.e(j10, AbstractC3217fl.e(j11, j9, RoundingMode.UNNECESSARY), roundingMode) : AbstractC3217fl.C(j9, AbstractC3217fl.e(j10, j11, RoundingMode.UNNECESSARY)) : AbstractC3217fl.e(j9, AbstractC3217fl.e(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void x(long[] jArr, long j9) {
        long j10;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i4 = 0;
        if (j9 >= 1000000 && j9 % 1000000 == 0) {
            long e6 = AbstractC3217fl.e(j9, 1000000L, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = AbstractC3217fl.e(jArr[i4], e6, roundingMode);
                i4++;
            }
            return;
        }
        if (j9 < 1000000 && 1000000 % j9 == 0) {
            long e9 = AbstractC3217fl.e(1000000L, j9, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = AbstractC3217fl.C(jArr[i4], e9);
                i4++;
            }
            return;
        }
        int i9 = 0;
        while (i9 < jArr.length) {
            long j11 = jArr[i9];
            if (j11 != 0) {
                if (j9 >= j11 && j9 % j11 == 0) {
                    jArr[i9] = AbstractC3217fl.e(1000000L, AbstractC3217fl.e(j9, j11, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j9 >= j11 || j11 % j9 != 0) {
                    j10 = j9;
                    jArr[i9] = m(j11, 1000000L, j10, roundingMode);
                    i9++;
                    j9 = j10;
                } else {
                    jArr[i9] = AbstractC3217fl.C(1000000L, AbstractC3217fl.e(j11, j9, RoundingMode.UNNECESSARY));
                }
            }
            j10 = j9;
            i9++;
            j9 = j10;
        }
    }

    public static long y(long j9, float f6) {
        return f6 == 1.0f ? j9 : Math.round(j9 * f6);
    }
}
