package com.baidu.mshield.x6.f;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/* loaded from: classes2.dex */
public class b {
    public static void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT <= 28 && com.baidu.sec.privacy.f.c.d(context) && k.a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                com.baidu.mshield.b.c.a.a("write Ext id");
                File a8 = com.baidu.mshield.b.e.a.a(context, Environment.getExternalStorageDirectory() + File.separator + str2);
                new File(a8.getParent()).mkdirs();
                FileWriter fileWriter = new FileWriter(a8, false);
                fileWriter.write(str);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static String b(Context context) {
        try {
            String Q = com.baidu.mshield.x6.c.b.b() ? new com.baidu.mshield.x6.b.b(context).Q() : new com.baidu.mshield.x6.b.b(context).A();
            if (TextUtils.isEmpty(Q)) {
                Q = com.baidu.mshield.x6.c.b.b() ? b(context, "x_o_b_d") : b(context, "x_b_d");
            }
            if (TextUtils.isEmpty(Q)) {
                return com.baidu.mshield.x6.c.b.b() ? a(context, ".x_o_b_d") : a(context, ".x_b_d");
            }
            return Q;
        } catch (Throwable th) {
            f.b(th);
            return "";
        }
    }

    public static void c(Context context) {
        try {
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            String b8 = b(context);
            if (!TextUtils.isEmpty(b8) && !bVar.l()) {
                if (!a(b8)) {
                    return;
                }
                a(context, 1);
                a(context, 2);
                a(context, 3);
            }
            bVar.f(true);
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static void d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (com.baidu.mshield.x6.c.b.b()) {
                new com.baidu.mshield.x6.b.b(context).q(str);
                b(context, str, "x_o_b_d");
                a(context, str, ".x_o_b_d");
            } else {
                new com.baidu.mshield.x6.b.b(context).i(str);
                b(context, str, "x_b_d");
                a(context, str, ".x_b_d");
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static void e(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new com.baidu.mshield.x6.b.b(context).y(str);
            b(context, str, "g_b_d_v");
            a(context, str, ".g_b_d_v");
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static void c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (com.baidu.mshield.x6.c.b.b()) {
                new com.baidu.mshield.x6.b.b(context).p(str);
                b(context, str, "g_m_o_bs");
                a(context, str, ".g_m_o_bs");
            } else {
                new com.baidu.mshield.x6.b.b(context).f(str);
                b(context, str, "g_m_b_s");
                a(context, str, ".g_m_b_s");
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static String a(Context context, String str) {
        try {
            if (!com.baidu.sec.privacy.f.c.d(context) || !k.a(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE"})) {
                return "";
            }
            File a8 = com.baidu.mshield.b.e.a.a(context, Environment.getExternalStorageDirectory() + File.separator + str);
            if (a8 == null || !a8.exists()) {
                return "";
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(a8));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString().trim();
                }
            }
        } catch (Throwable th) {
            f.b(th);
            return "";
        }
    }

    public static void b(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !k.a(context, new String[]{"android.permission.WRITE_SETTINGS"})) {
            return;
        }
        try {
            com.baidu.mshield.b.e.a.a(context, str2, str);
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static String b(Context context, String str) {
        try {
            return com.baidu.mshield.b.e.a.d(context, str);
        } catch (Throwable th) {
            f.b(th);
            return "";
        }
    }

    public static boolean a(String str) {
        try {
        } catch (Throwable th) {
            f.b(th);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.length() > 70;
    }

    public static void a(Context context, int i8) {
        String str;
        String str2;
        try {
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            if (i8 == 1) {
                if (com.baidu.mshield.x6.c.b.b()) {
                    bVar.q("");
                    str = "x_o_b_d";
                    str2 = ".x_o_b_d";
                } else {
                    bVar.i("");
                    str = "x_b_d";
                    str2 = ".x_b_d";
                }
            } else if (i8 == 2) {
                bVar.y("");
                str = "g_b_d_v";
                str2 = ".g_b_d_v";
            } else if (i8 == 3) {
                bVar.k("");
                str = "g_c_o_m";
                str2 = ".g_c_o_m";
            } else {
                str = "";
                str2 = str;
            }
            try {
                if (!TextUtils.isEmpty(str) && k.a(context, new String[]{"android.permission.WRITE_SETTINGS"})) {
                    com.baidu.mshield.b.e.a.a(context, str, "");
                }
            } catch (Throwable th) {
                f.b(th);
            }
            try {
                if (!TextUtils.isEmpty(str2) && com.baidu.sec.privacy.f.c.d(context) && k.a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                    File a8 = com.baidu.mshield.b.e.a.a(context, Environment.getExternalStorageDirectory() + File.separator + str2);
                    if (a8 == null || !a8.exists()) {
                        return;
                    }
                    a8.delete();
                }
            } catch (Throwable th2) {
                f.b(th2);
            }
        } catch (Throwable th3) {
            f.b(th3);
        }
    }

    public static String a(Context context) {
        String A;
        String b8;
        String a8;
        try {
            if (com.baidu.mshield.x6.c.b.b()) {
                A = new com.baidu.mshield.x6.b.b(context).Q();
                b8 = b(context, "x_o_b_d");
                a8 = a(context, ".x_o_b_d");
            } else {
                A = new com.baidu.mshield.x6.b.b(context).A();
                b8 = b(context, "x_b_d");
                a8 = a(context, ".x_b_d");
            }
            boolean a9 = k.a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
            boolean a10 = k.a(context, new String[]{"android.permission.WRITE_SETTINGS"});
            return (a9 && a10) ? (TextUtils.isEmpty(A) && TextUtils.isEmpty(b8) && TextUtils.isEmpty(a8)) ? "1" : (TextUtils.isEmpty(A) || TextUtils.isEmpty(b8) || TextUtils.isEmpty(a8)) ? (!TextUtils.isEmpty(A) || TextUtils.isEmpty(b8) || TextUtils.isEmpty(a8)) ? "4" : ExifInterface.GPS_MEASUREMENT_3D : "2" : (!a9 || a10) ? (a9 || !a10) ? !TextUtils.isEmpty(A) ? "2" : "4" : (TextUtils.isEmpty(A) && TextUtils.isEmpty(b8)) ? "1" : (TextUtils.isEmpty(A) || TextUtils.isEmpty(b8)) ? (!TextUtils.isEmpty(A) || TextUtils.isEmpty(b8)) ? "4" : ExifInterface.GPS_MEASUREMENT_3D : "2" : (TextUtils.isEmpty(A) && TextUtils.isEmpty(a8)) ? "1" : (TextUtils.isEmpty(A) || TextUtils.isEmpty(a8)) ? (!TextUtils.isEmpty(A) || TextUtils.isEmpty(a8)) ? "4" : ExifInterface.GPS_MEASUREMENT_3D : "2";
        } catch (Throwable th) {
            f.b(th);
            return "4";
        }
    }
}
