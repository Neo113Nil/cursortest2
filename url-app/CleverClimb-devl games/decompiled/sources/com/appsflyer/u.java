package com.appsflyer;

import android.content.Context;
import android.content.pm.PackageManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f3500a = {'a', 61245, 57026, 52619, 48419, 44278, 39830, 35691, 31468, 27022, 22866, 18676, 14228, 10079, 5861, 1459, 62793, 58541, 54146, 49996, 45584, 41386, 37202, 32797, 28583, 24437, 19991, 15756, 11637, 7177, 3035, 64362, 59909, 55745, 4218, '0', 5680, 63843, 51350, 56265, 43816, 47771, 36342, 40225, 27829, 32710, 20264, 24208, 8677, 12563, 174, 5095, 58122, 62096, 18632, 42904, 38510, 34102, 62855, 58448, 54120, 50138, 12811, 8485, 4513, '\b', 32559, 28671, 24089, 19780, 48558, 44111, 39752, 35814, 64226, 59648, 55740, 51439, 9990, 6024, 1781, 29965, 25996, 21757, 17185, 45974, '.', '\\', 61309, 'j', 61234, 57040, 52632, 48482, 44278, 39837, 35691, 31468, 27014, 22862, 18677, 14221, 10053, '/', 61232, 57031, 52634, 48420, 44282, '.', 61305, 56969, 52645, 48447, 44213, 39898, 35691, 31410, 27074, 'C', 61243, 57027, 52634, 48423, 44268, 39815, 35624, 31453, 27027, 22877, 18676, 14228, 10051, 5859, 1458, 62814, 14511, 55259, 58918, 62844, 34240, 37906, 41787, 46040, 16926, 20770, 25008, 28701, 3961, 8190, 11776, 15701, 52666, 56322, 60250, 64480, 35557, 39239, 43455, 47348, 22273, 26501, 30446, 1372, 5525, 9390, 13110, 50076, 53994, 57663, 61855, 32964, 40748, 44665, 48853, 19830, 23601, 'a', 61245, 57026, 52619, 48419, 44278, 39830, 35691, 31479, 27032, 22800, 18643, 14213, 10051, 5886, 1464, 62786, 58618, 54171, 49992, 45586, 41390, 37189, 32784, 28602, 64530, 4942, 8881, 12792, 16720, 20613, 26597, 30488, 34435, 38393, 42303, 46214, 52192, 56101, 60043, 63947, 2413, 6307, 12224, 16180, 20092, 24019, 27939, 'a', 61245, 57026, 52619, 48419, 44278, 39830, 35691, 31479, 27032, 22800, 18640, 14231, 10062, 5860, 1470, 62820, 58594, 54181, 49986, 27560, 34036, 46347, 42562, 55018, 51007, 61535, 57506, 4415, 583, 12931, 9078, 23672, 19596, 32042};

    /* renamed from: b, reason: collision with root package name */
    private static long f3501b = -7912217104322400429L;

    /* renamed from: c, reason: collision with root package name */
    private static int f3502c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f3503d = 1;

    /* JADX WARN: Removed duplicated region for block: B:39:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String a(Context context, long j) {
        String intern;
        String a2;
        String a3;
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (b(a(0, (char) 0, 34).intern())) {
            intern = a(34, (char) 4171, 1).intern();
            int i = f3503d + 29;
            f3502c = i % 128;
            if (i % 2 != 0) {
            }
        } else {
            intern = a(35, (char) 0, 1).intern();
        }
        sb2.append(intern);
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String a4 = a(packageName);
        sb2.append(a(34, (char) 4171, 1).intern());
        sb4.append(a4);
        if (!(a(context) != null)) {
            int i2 = f3503d + 107;
            f3502c = i2 % 128;
            int i3 = i2 % 2;
            sb2.append(a(35, (char) 0, 1).intern());
            sb4.append(packageName);
        } else {
            sb2.append(a(34, (char) 4171, 1).intern());
            sb4.append(packageName);
        }
        String b2 = b(context);
        if ((b2 == null ? 'F' : '`') != '`') {
            int i4 = f3502c + 35;
            f3503d = i4 % 128;
            int i5 = i4 % 2;
            sb2.append(a(35, (char) 0, 1).intern());
            sb4.append(packageName);
        } else {
            sb2.append(a(34, (char) 4171, 1).intern());
            sb4.append(b2);
        }
        sb.append(sb4.toString());
        try {
            long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(a(36, (char) 5705, 18).intern(), Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            sb.append(simpleDateFormat.format(new Date(j2)));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(a(36, (char) 5705, 18).intern(), Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
            sb.append(simpleDateFormat2.format(new Date(j)));
            sb3.append((b(a(177, (char) 0, 25).intern()) ? a(34, (char) 4171, 1) : a(35, (char) 0, 1)).intern());
            if ((b(a(202, (char) 64627, 23).intern()) ? '0' : '\r') != '0') {
                a2 = a(35, (char) 0, 1);
            } else {
                int i6 = f3503d + 95;
                f3502c = i6 % 128;
                int i7 = i6 % 2;
                a2 = a(34, (char) 4171, 1);
            }
            sb3.append(a2.intern());
            if (b(a(225, (char) 0, 20).intern())) {
                int i8 = f3503d + 61;
                f3502c = i8 % 128;
                if ((i8 % 2 != 0 ? '>' : (char) 19) == '>') {
                    str = a(90, (char) 4171, 0).intern();
                    sb3.append(str);
                    sb3.append((!b(a(245, (char) 27593, 15).intern()) ? a(35, (char) 0, 1) : a(34, (char) 4171, 1)).intern());
                    String b3 = ae.b(ae.c(sb.toString()));
                    String obj = sb2.toString();
                    StringBuilder sb5 = new StringBuilder(b3);
                    sb5.setCharAt(17, Integer.toString(Integer.parseInt(obj, 2), 16).charAt(0));
                    String obj2 = sb5.toString();
                    String obj3 = sb3.toString();
                    StringBuilder sb6 = new StringBuilder(obj2);
                    sb6.setCharAt(27, Integer.toString(Integer.parseInt(obj3, 2), 16).charAt(0));
                    return sb6.toString();
                }
                a3 = a(34, (char) 4171, 1);
            } else {
                a3 = a(35, (char) 0, 1);
            }
            str = a3.intern();
            sb3.append(str);
            sb3.append((!b(a(245, (char) 27593, 15).intern()) ? a(35, (char) 0, 1) : a(34, (char) 4171, 1)).intern());
            String b32 = ae.b(ae.c(sb.toString()));
            String obj4 = sb2.toString();
            StringBuilder sb52 = new StringBuilder(b32);
            sb52.setCharAt(17, Integer.toString(Integer.parseInt(obj4, 2), 16).charAt(0));
            String obj22 = sb52.toString();
            String obj32 = sb3.toString();
            StringBuilder sb62 = new StringBuilder(obj22);
            sb62.setCharAt(27, Integer.toString(Integer.parseInt(obj32, 2), 16).charAt(0));
            return sb62.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return a(54, (char) 18602, 32).intern();
        }
    }

    private static String a(String str) {
        int i = f3503d + 97;
        f3502c = i % 128;
        int i2 = i % 2;
        if ((!str.contains(a(86, (char) 0, 1).intern()) ? '\t' : 'Z') == '\t') {
            return str;
        }
        String[] split = str.split(a(87, (char) 0, 2).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i3 = length - 1;
        sb.append(split[i3]);
        sb.append(a(86, (char) 0, 1).intern());
        int i4 = 1;
        while (i4 < i3) {
            int i5 = f3503d + 31;
            f3502c = i5 % 128;
            if (i5 % 2 != 0) {
                sb.append(split[i4]);
                sb.append(a(49, (char) 0, 0).intern());
                i4 += 119;
            } else {
                sb.append(split[i4]);
                sb.append(a(86, (char) 0, 1).intern());
                i4++;
            }
        }
        sb.append(split[0]);
        String obj = sb.toString();
        int i6 = f3503d + 113;
        f3502c = i6 % 128;
        if ((i6 % 2 != 0 ? (char) 24 : 'E') != 'E') {
            Object obj2 = null;
            super.hashCode();
        }
        return obj;
    }

    private static String a(Context context) {
        int i = f3503d + 93;
        f3502c = i % 128;
        if (i % 2 != 0) {
            if ((System.getProperties().containsKey(a(28, (char) 0, 104).intern()) ? '>' : '/') == '/') {
                return null;
            }
        } else if (!System.getProperties().containsKey(a(89, (char) 0, 14).intern())) {
            return null;
        }
        int i2 = f3502c + 81;
        f3503d = i2 % 128;
        int i3 = i2 % 2;
        try {
            Matcher matcher = Pattern.compile(a(109, (char) 0, 10).intern()).matcher(context.getCacheDir().getPath().replace(a(103, (char) 0, 6).intern(), ""));
            if (!matcher.find()) {
                return null;
            }
            int i4 = f3503d + 105;
            f3502c = i4 % 128;
            int i5 = i4 % 2;
            return matcher.group(1);
        } catch (Exception e) {
            ag a2 = ag.a();
            String intern = a(119, (char) 0, 17).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(a(136, (char) 14569, 41).intern());
            sb.append(e);
            a2.b(intern, sb.toString());
            return null;
        }
    }

    private static String b(Context context) {
        int i = f3502c + 83;
        f3503d = i % 128;
        try {
            String str = ((i % 2 == 0 ? '\f' : (char) 16) != 16 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 1) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).packageName;
            int i2 = f3503d + 73;
            f3502c = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static boolean b(String str) {
        int i = f3502c + 55;
        f3503d = i % 128;
        int i2 = i % 2;
        try {
            Class.forName(str);
            int i3 = f3503d + 125;
            f3502c = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String a(int i, char c2, int i2) {
        int i3 = f3502c + 69;
        f3503d = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                break;
            }
            int i6 = f3503d + 67;
            f3502c = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((f3500a[i + i5] ^ (i5 * f3501b)) ^ c2);
            i5++;
        }
        String str = new String(cArr);
        int i8 = f3502c + 113;
        f3503d = i8 % 128;
        if (!(i8 % 2 != 0)) {
            Object obj = null;
            super.hashCode();
        }
        return str;
    }
}
