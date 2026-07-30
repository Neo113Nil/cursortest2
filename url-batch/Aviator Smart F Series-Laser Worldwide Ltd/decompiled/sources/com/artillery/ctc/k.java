package com.artillery.ctc;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1114a = {"huawei"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1115b = {"vivo"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1116c = {"xiaomi"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1117d = {"oppo"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f1118e = {"leeco", "letv"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f1119f = {"360", "qiku"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f1120g = {"zte"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f1121h = {"oneplus"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f1122i = {"nubia"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f1123j = {"coolpad", "yulong"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f1124k = {"lg", "lge"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f1125l = {"google"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f1126m = {"samsung"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f1127n = {"meizu"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f1128o = {"lenovo"};

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f1129p = {"smartisan", "deltainno"};

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f1130q = {"htc"};

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f1131r = {"sony"};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f1132s = {"gionee", "amigo"};

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f1133t = {"motorola"};

    /* renamed from: u, reason: collision with root package name */
    public static a f1134u;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f1135a;

        /* renamed from: b, reason: collision with root package name */
        public String f1136b;

        public String toString() {
            return "RomInfo{name=" + this.f1135a + ", version=" + this.f1136b + "}";
        }
    }

    public static boolean a(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static String b() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static a c() {
        a aVar = f1134u;
        if (aVar != null) {
            return aVar;
        }
        f1134u = new a();
        String a8 = a();
        String b8 = b();
        String[] strArr = f1114a;
        if (a(a8, b8, strArr)) {
            f1134u.f1135a = strArr[0];
            String a9 = a("ro.build.version.emui");
            String[] split = a9.split("_");
            if (split.length > 1) {
                f1134u.f1136b = split[1];
            } else {
                f1134u.f1136b = a9;
            }
            return f1134u;
        }
        String[] strArr2 = f1115b;
        if (a(a8, b8, strArr2)) {
            f1134u.f1135a = strArr2[0];
            f1134u.f1136b = a("ro.vivo.os.build.display.id");
            return f1134u;
        }
        String[] strArr3 = f1116c;
        if (a(a8, b8, strArr3)) {
            f1134u.f1135a = strArr3[0];
            f1134u.f1136b = a("ro.build.version.incremental");
            return f1134u;
        }
        String[] strArr4 = f1117d;
        if (a(a8, b8, strArr4)) {
            f1134u.f1135a = strArr4[0];
            f1134u.f1136b = a("ro.build.version.opporom");
            return f1134u;
        }
        String[] strArr5 = f1118e;
        if (a(a8, b8, strArr5)) {
            f1134u.f1135a = strArr5[0];
            f1134u.f1136b = a("ro.letv.release.version");
            return f1134u;
        }
        String[] strArr6 = f1119f;
        if (a(a8, b8, strArr6)) {
            f1134u.f1135a = strArr6[0];
            f1134u.f1136b = a("ro.build.uiversion");
            return f1134u;
        }
        String[] strArr7 = f1120g;
        if (a(a8, b8, strArr7)) {
            f1134u.f1135a = strArr7[0];
            f1134u.f1136b = a("ro.build.MiFavor_version");
            return f1134u;
        }
        String[] strArr8 = f1121h;
        if (a(a8, b8, strArr8)) {
            f1134u.f1135a = strArr8[0];
            f1134u.f1136b = a("ro.rom.version");
            return f1134u;
        }
        String[] strArr9 = f1122i;
        if (a(a8, b8, strArr9)) {
            f1134u.f1135a = strArr9[0];
            f1134u.f1136b = a("ro.build.rom.id");
            return f1134u;
        }
        String[] strArr10 = f1123j;
        if (a(a8, b8, strArr10)) {
            f1134u.f1135a = strArr10[0];
        } else {
            String[] strArr11 = f1124k;
            if (a(a8, b8, strArr11)) {
                f1134u.f1135a = strArr11[0];
            } else {
                String[] strArr12 = f1125l;
                if (a(a8, b8, strArr12)) {
                    f1134u.f1135a = strArr12[0];
                } else {
                    String[] strArr13 = f1126m;
                    if (a(a8, b8, strArr13)) {
                        f1134u.f1135a = strArr13[0];
                    } else {
                        String[] strArr14 = f1127n;
                        if (a(a8, b8, strArr14)) {
                            f1134u.f1135a = strArr14[0];
                        } else {
                            String[] strArr15 = f1128o;
                            if (a(a8, b8, strArr15)) {
                                f1134u.f1135a = strArr15[0];
                            } else {
                                String[] strArr16 = f1129p;
                                if (a(a8, b8, strArr16)) {
                                    f1134u.f1135a = strArr16[0];
                                } else {
                                    String[] strArr17 = f1130q;
                                    if (a(a8, b8, strArr17)) {
                                        f1134u.f1135a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f1131r;
                                        if (a(a8, b8, strArr18)) {
                                            f1134u.f1135a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f1132s;
                                            if (a(a8, b8, strArr19)) {
                                                f1134u.f1135a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f1133t;
                                                if (a(a8, b8, strArr20)) {
                                                    f1134u.f1135a = strArr20[0];
                                                } else {
                                                    f1134u.f1135a = b8;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        f1134u.f1136b = a("");
        return f1134u;
    }

    public static String d(String str) {
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
                try {
                    readLine = bufferedReader.readLine();
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 == null) {
                        return "";
                    }
                    bufferedReader2.close();
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                return "";
            }
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (readLine != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
            return readLine;
        }
        bufferedReader.close();
        return "";
    }

    public static String e(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String b(String str) {
        String d8 = d(str);
        if (!TextUtils.isEmpty(d8)) {
            return d8;
        }
        String e8 = e(str);
        return (TextUtils.isEmpty(e8) && Build.VERSION.SDK_INT < 28) ? c(str) : e8;
    }

    public static String a(String str) {
        String b8 = !TextUtils.isEmpty(str) ? b(str) : "";
        if (TextUtils.isEmpty(b8) || b8.equals("unknown")) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    b8 = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(b8) ? "unknown" : b8;
    }

    public static String c(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }
}
