package com.baidu.location;

import cn.hutool.core.util.l;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class Jni {

    /* renamed from: a, reason: collision with root package name */
    private static int f4384a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f4385b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static int f4386c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static int f4387d = 11;

    /* renamed from: e, reason: collision with root package name */
    private static int f4388e = 12;

    /* renamed from: f, reason: collision with root package name */
    private static int f4389f = 13;

    /* renamed from: g, reason: collision with root package name */
    private static int f4390g = 15;

    /* renamed from: h, reason: collision with root package name */
    private static int f4391h = 1024;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f4392i = false;

    static {
        try {
            System.loadLibrary("locSDK8b");
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
            f4392i = true;
        }
    }

    private static native String a(byte[] bArr, int i8);

    private static native String b(double d8, double d9, int i8, int i9);

    private static native String c(byte[] bArr, int i8);

    public static double[] coorEncrypt(double d8, double d9, String str) {
        double[] dArr = {i.DOUBLE_EPSILON, i.DOUBLE_EPSILON};
        if (f4392i) {
            return dArr;
        }
        try {
            String[] split = b(d8, d9, str.equals("gcj2wgs") ? 16 : str.equals("bd09") ? f4384a : str.equals("bd09ll") ? f4385b : str.equals("gcj02") ? f4386c : str.equals(BDLocation.BDLOCATION_WGS84_TO_GCJ02) ? f4387d : str.equals(BDLocation.BDLOCATION_BD09_TO_GCJ02) ? f4388e : str.equals(BDLocation.BDLOCATION_BD09LL_TO_GCJ02) ? f4389f : str.equals("wgs842mc") ? f4390g : -1, 132456).split(":");
            dArr[0] = Double.parseDouble(split[0]);
            dArr[1] = Double.parseDouble(split[1]);
        } catch (Throwable unused) {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        return dArr;
    }

    private static native String ee(String str, int i8);

    public static String en1(String str) {
        if (f4392i) {
            return "err!";
        }
        if (str == null) {
            return "null";
        }
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[f4391h];
        int length = bytes.length;
        if (length > 740) {
            length = 740;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            byte b8 = bytes[i9];
            if (b8 != 0) {
                bArr[i8] = b8;
                i8++;
            }
        }
        try {
            return a(bArr, 132456);
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
            return "err!";
        }
    }

    public static String encode(String str) {
        if (f4392i) {
            return "err!";
        }
        return en1(str) + "|tp=3";
    }

    public static String encode2(String str) {
        if (f4392i) {
            return "err!";
        }
        if (str == null) {
            return "null";
        }
        try {
            return c(str.getBytes(), 132456);
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
            return "err!";
        }
    }

    public static Long encode3(String str) {
        String str2;
        if (f4392i) {
            return null;
        }
        try {
            str2 = new String(str.getBytes(), l.UTF_8);
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            return Long.valueOf(murmur(str2));
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private static native String encodeNotLimit(String str, int i8);

    public static String encodeOfflineLocationUpdateRequest(String str) {
        String str2;
        String str3 = "err!";
        if (f4392i) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), l.UTF_8);
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            str3 = encodeNotLimit(str2, 132456);
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
        }
        return str3 + "|tp=3";
    }

    public static String encodeTp4(String str) {
        String str2;
        String str3 = "err!";
        if (f4392i) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), l.UTF_8);
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            str3 = ee(str2, 132456);
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
        }
        return str3 + "|tp=4";
    }

    public static String encodeTp4NoTag(String str) {
        String str2;
        if (f4392i) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), l.UTF_8);
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            return ee(str2, 132456);
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
            return "err!";
        }
    }

    public static double getGpsSwiftRadius(float f8, double d8, double d9) {
        if (f4392i) {
            return i.DOUBLE_EPSILON;
        }
        try {
            return gsr(f8, d8, d9);
        } catch (UnsatisfiedLinkError unused) {
            return i.DOUBLE_EPSILON;
        }
    }

    public static String getldkaiv() {
        if (f4392i) {
            return null;
        }
        try {
            return ldkaiv();
        } catch (UnsatisfiedLinkError e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private static native double gsr(float f8, double d8, double d9);

    private static native String ldkaiv();

    private static native long murmur(String str);
}
