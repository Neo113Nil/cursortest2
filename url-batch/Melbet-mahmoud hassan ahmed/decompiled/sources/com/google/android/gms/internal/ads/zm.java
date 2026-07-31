package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zm {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15186a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f15187b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f15188c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f15189d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f15190e;

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f15191f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f15192g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f15193h;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i7 = 26;
        }
        f15186a = i7;
        String str = Build.DEVICE;
        f15187b = str;
        String str2 = Build.MANUFACTURER;
        f15188c = str2;
        String str3 = Build.MODEL;
        f15189d = str3;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i7);
        f15190e = sb.toString();
        f15191f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f15192g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f15193h = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static float a(float f7, float f8, float f9) {
        return Math.max(0.1f, Math.min(f7, 8.0f));
    }

    public static int b(long[] jArr, long j7, boolean z6, boolean z7) {
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

    public static int c(long[] jArr, long j7, boolean z6, boolean z7) {
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

    public static int d(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static int e(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static int f(int i7) {
        return i7 != 1 ? 13107200 : 3538944;
    }

    public static int g(String str) {
        int length = str.length();
        jm.c(length <= 4);
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            i7 = (i7 << 8) | str.charAt(i8);
        }
        return i7;
    }

    public static int h(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int i(int i7, int i8) {
        if (i7 == Integer.MIN_VALUE) {
            return i8 * 3;
        }
        if (i7 == 1073741824) {
            return i8 * 4;
        }
        if (i7 == 2) {
            return i8 + i8;
        }
        if (i7 == 3) {
            return i8;
        }
        throw new IllegalArgumentException();
    }

    public static long j(long j7, long j8, long j9) {
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

    public static String k(Object[] objArr) {
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

    public static ExecutorService l(String str) {
        return Executors.newSingleThreadExecutor(new ym("Loader:ExtractorMediaPeriod"));
    }

    public static void m(tl tlVar) {
        if (tlVar != null) {
            try {
                tlVar.g();
            } catch (IOException unused) {
            }
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

    public static boolean o(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] p(String str) {
        byte[] bArr = new byte[38];
        for (int i7 = 0; i7 < 38; i7++) {
            int i8 = i7 + i7;
            bArr[i7] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i8), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i8 + 1), 16));
        }
        return bArr;
    }

    public static byte[] q(String str) {
        return str.getBytes(Charset.defaultCharset());
    }
}
