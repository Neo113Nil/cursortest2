package com.baidu.mshield.x0.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.text.l;
import com.baidu.mshield.rp.Report;
import com.baidu.mshield.x0.EngineImpl;
import com.baidu.mshield.x6.f.k;
import com.my.lib.data.ErrorCode;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f8434a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f8435b = {"L3N5c3RlbS94YmluL3N1", "L3N5c3RlbS9iaW4vc3U", "L3N5c3RlbS94YmluLy5zdQ==", "L3N5c3RlbS9iaW4vLnN1", "L3N5c3RlbS9iaW4vLnN1dg==", "L3N5c3RlbS94YmluLy5zdXY=", "L3N5c3RlbS94YmluL2Jkc3U=", "L3N5c3RlbS9iaW4vYmRzdQ==", "L3N5c3RlbS94YmluL2F1", "L3N5c3RlbS9iaW4vYXU=", "L3N5c3RlbS94YmluL2t1LnN1ZA==", "L3N5c3RlbS9iaW4va3Uuc3Vk", "L3N5c3RlbS9iaW4vLnJncw==", "L3N5c3RlbS94YmluLy5yZ3M=", "L3NiaW4vc3U="};

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8436c = false;

    public static class a extends com.baidu.mshield.x0.d.h.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f8437b;

        public a(Context context) {
            this.f8437b = context;
        }

        @Override // com.baidu.mshield.x0.d.h.b
        public void b() {
            boolean unused = d.f8436c = true;
            d.p(this.f8437b);
            boolean unused2 = d.f8436c = false;
        }
    }

    public static class b implements com.baidu.mshield.x0.e.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f8438a;

        public b(Context context) {
            this.f8438a = context;
        }

        @Override // com.baidu.mshield.x0.e.b
        public boolean a() {
            return true;
        }

        @Override // com.baidu.mshield.x0.e.b
        public void a(String str) {
            try {
                if (str.contains("mshield")) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("0", "mshield");
                    jSONObject.put("1", str.replaceAll("\t", ";").replaceAll("\n", ";"));
                    jSONArray.put(jSONObject);
                    d.a(this.f8438a, new c(), jSONArray, "1003138");
                }
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    public static void b(Context context, JSONArray jSONArray, String str) {
        try {
            c cVar = new c();
            String str2 = EngineImpl.KEY_CUID;
            cVar.f8430c = 0;
            String str3 = com.baidu.mshield.x0.a.f8412a;
            if (jSONArray == null || jSONArray.length() == 0) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("0", Long.toString(System.currentTimeMillis()));
                jSONObject2.put("1", cVar.f8428a);
                jSONObject2.put("2", cVar.f8429b);
                jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(c(context)));
                jSONObject2.put("4", cVar.f8430c);
                jSONObject2.put(ErrorCode.PARAMETER_ERROR, cVar.f8431d);
                jSONObject2.put("6", cVar.f8432e);
                jSONObject2.put("7", cVar.f8433f);
                jSONObject2.put("8", com.baidu.mshield.x0.a.f8415d);
                jSONObject2.put("9", EngineImpl.sLoadVersion);
                jSONObject2.put("10", str);
                jSONObject.put("Common_section", jSONObject2);
                jSONObject.put("Module_section", jSONArray);
                b(context, jSONObject.toString());
            } catch (Throwable th) {
                a(th);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public static String c(Context context) {
        try {
            String str = EngineImpl.sAppkey;
            return str != null ? str : "";
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static byte[] d() {
        char[] cArr = new char[16];
        try {
            char[] charArray = f8434a.toCharArray();
            for (int i8 = 0; i8 < 16; i8++) {
                int nextInt = new Random().nextInt(62);
                if (nextInt >= 0 && nextInt < charArray.length) {
                    cArr[i8] = charArray[nextInt];
                }
            }
        } catch (Throwable th) {
            a(th);
        }
        return new String(cArr).getBytes();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0057 -> B:13:0x005a). Please report as a decompilation issue!!! */
    public static String e() {
        LineNumberReader lineNumberReader;
        String str = "";
        InputStreamReader inputStreamReader = null;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(Runtime.getRuntime().exec("getprop ro.build.version.security_patch").getInputStream());
                try {
                    LineNumberReader lineNumberReader2 = new LineNumberReader(inputStreamReader2);
                    String str2 = "";
                    while (str2 != null) {
                        try {
                            str2 = lineNumberReader2.readLine();
                            if (str2 != null) {
                                str = str2.trim();
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader = inputStreamReader2;
                            lineNumberReader = lineNumberReader2;
                            try {
                                a(th);
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (Throwable th2) {
                                        a(th2);
                                    }
                                }
                                if (lineNumberReader != null) {
                                    lineNumberReader.close();
                                }
                                return str;
                            } finally {
                            }
                        }
                    }
                    try {
                        inputStreamReader2.close();
                    } catch (Throwable th3) {
                        a(th3);
                    }
                    lineNumberReader2.close();
                } catch (Throwable th4) {
                    th = th4;
                    lineNumberReader = null;
                    inputStreamReader = inputStreamReader2;
                }
            } catch (Throwable th5) {
                th = th5;
                lineNumberReader = null;
            }
        } catch (IOException e8) {
            a(e8);
        }
        return str;
    }

    public static int f(Context context) {
        try {
            return com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0).versionCode;
        } catch (Throwable th) {
            a(th);
            return 0;
        }
    }

    public static JSONObject g(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            int i8 = 0;
            int i9 = 0;
            for (String str : f8435b) {
                if (new File(new String(Base64.decode(str, 0))).exists()) {
                    jSONObject.put(Integer.toString(i9), "1");
                } else {
                    jSONObject.put(Integer.toString(i9), "0");
                }
                i9++;
            }
            try {
                File file = new File(new String(Base64.decode("L3NiaW5fb3JpZw==", 0)));
                if (file.exists() && file.isDirectory()) {
                    jSONObject.put(Integer.toString(i9), "0");
                    String[] list = file.list();
                    int length = list.length;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        String str2 = list[i8];
                        com.baidu.mshield.b.c.a.b(str2 + " exits!!");
                        if (str2.startsWith("su")) {
                            jSONObject.put(Integer.toString(i9), "1");
                            break;
                        }
                        i8++;
                    }
                } else {
                    jSONObject.put(Integer.toString(i9), "0");
                }
            } catch (Throwable th) {
                a(th);
            }
        } catch (Throwable th2) {
            a(th2);
        }
        return jSONObject;
    }

    public static String h(Context context) {
        try {
            File file = new File(context.getFilesDir(), com.baidu.mshield.x0.a.f8412a);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath();
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String i(Context context) {
        try {
            return com.baidu.xclient.gdid.a.c(context);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String j(Context context) {
        try {
            return Long.toString(com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0).firstInstallTime);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String k(Context context) {
        return "4.2.6";
    }

    public static String l(Context context) {
        try {
            return new String(com.baidu.mshield.b.f.d.a(Base64.decode(com.baidu.mshield.x0.a.f8413b, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void m(Context context) {
        com.baidu.mshield.x0.e.a.a().a(new b(context));
    }

    public static boolean n(Context context) {
        try {
            if (!k.a(context, new String[]{"android.permission.ACCESS_NETWORK_STATE"})) {
                return true;
            }
            NetworkInfo a8 = com.baidu.mshield.b.e.b.a(context);
            if (a8 == null) {
                return false;
            }
            return a8.isConnected();
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static boolean o(Context context) {
        try {
            return com.baidu.mshield.b.e.a.b(context, "adb_enabled") > 0;
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static void p(Context context) {
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(context);
            List<com.baidu.mshield.x0.l.b> e8 = aVar.e();
            if (e8 == null) {
                return;
            }
            com.baidu.mshield.b.c.a.b("re_con==" + e8.size());
            for (com.baidu.mshield.x0.l.b bVar : e8) {
                if (a(context, aVar.a(), bVar.f8490b)) {
                    a(context, bVar);
                }
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void q(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = "";
        com.baidu.mshield.b.c.a.b("setAliveDate begin");
        try {
            PackageInfo a8 = com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 16384);
            int i8 = a8.applicationInfo.flags;
            r5 = ((i8 & 1) == 1 || (i8 & 128) == 128) ? 1 : 0;
            try {
                str = com.baidu.mshield.b.f.e.a(new File(a8.applicationInfo.sourceDir));
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            a(th);
        }
        try {
            jSONObject2.put("0", "0");
            jSONObject2.put("15", Integer.toString(r5));
            jSONObject2.put("14", j(context));
            jSONObject2.put("16", e());
            jSONObject2.put("17", str);
            jSONObject2.put("18", e(context));
            jSONObject2.put("19", f(context));
            jSONObject2.put("990", com.baidu.xclient.gdid.a.d(context));
            jSONObject2.put("989", k(context));
            jSONObject2.put("993", e.a(context));
            jSONObject2.put("995", g.b(context));
            if (a(context, "plc31", true)) {
                jSONObject2.put("997", i(context));
            }
            jSONObject2.put("998", e.b(context));
            jSONObject2.put("999", TextUtils.isEmpty(com.baidu.mshield.utility.c.j(context)) ? com.baidu.mshield.utility.c.i(context) : com.baidu.mshield.utility.c.j(context));
            jSONObject2.put("981", new com.baidu.mshield.x0.l.c(context).a());
            jSONObject.put("0", new JSONObject().put("1001003", jSONObject2));
            com.baidu.mshield.b.c.a.b("setAliveDate begin to report" + jSONObject.toString());
            c(context, jSONObject.toString());
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public static String a(long j8, String str) {
        if (j8 >= 0) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return new SimpleDateFormat(str).format(new Date(j8));
                }
            } catch (Throwable th) {
                a(th);
            }
        }
        return "";
    }

    public static void c(Context context, String str) {
        try {
            Report.getInstance(context).w(str);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static String f() {
        try {
            return new String(com.baidu.mshield.b.f.d.a(Base64.decode(f.f8440b, 2), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String c() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String d(Context context) {
        try {
            String str = EngineImpl.sSecKey;
            return str != null ? str : "";
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static void a(Throwable th) {
        com.baidu.mshield.b.c.a.a(th);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        try {
            Report.getInstance(context).i(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static String a(String str, String str2, long j8) {
        try {
            return com.baidu.mshield.b.f.e.a(str + j8 + str2);
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    public static boolean a(Context context, String str, boolean z7) {
        try {
            String c8 = new com.baidu.mshield.x0.l.a(context).c(str);
            if (!TextUtils.isEmpty(c8)) {
                return new JSONObject(c8).optInt("1") == 1;
            }
        } catch (Throwable th) {
            a(th);
        }
        return z7;
    }

    public static String e(Context context) {
        return com.baidu.mshield.b.a.d.a(context);
    }

    public static boolean a(Context context, String str, boolean z7, com.baidu.mshield.x0.l.a aVar) {
        if (aVar == null) {
            try {
                aVar = new com.baidu.mshield.x0.l.a(context);
            } catch (Throwable th) {
                a(th);
            }
        }
        String c8 = aVar.c(str);
        if (!TextUtils.isEmpty(c8)) {
            return new JSONObject(c8).optInt("1") == 1;
        }
        return z7;
    }

    public static void b(Context context, String str) {
        try {
            Report.getInstance(context).sr(str);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void b(Context context) {
        try {
            synchronized (d.class) {
                try {
                    if (f8436c) {
                        return;
                    }
                    com.baidu.mshield.x0.d.h.d.b().a(new a(context));
                } finally {
                }
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void a(Context context, String str, c cVar, com.baidu.mshield.x0.l.a aVar) {
        if (cVar == null) {
            return;
        }
        if (aVar == null) {
            try {
                aVar = new com.baidu.mshield.x0.l.a(context);
            } catch (Throwable th) {
                a(th);
                return;
            }
        }
        String c8 = aVar.c(str);
        if (TextUtils.isEmpty(c8)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(c8);
        cVar.f8432e = jSONObject.optInt("2");
        cVar.f8431d = jSONObject.optInt(ExifInterface.GPS_MEASUREMENT_3D);
        cVar.f8433f = jSONObject.optInt("4");
    }

    public static String b() {
        try {
            Calendar calendar = Calendar.getInstance();
            return calendar.get(1) + "" + calendar.get(2) + "" + calendar.get(5);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static void a(Context context, JSONArray jSONArray, String str) {
        try {
            c cVar = new c();
            String str2 = EngineImpl.KEY_CUID;
            cVar.f8430c = 0;
            String str3 = com.baidu.mshield.x0.a.f8412a;
            a(context, cVar, jSONArray, str, true);
        } catch (Throwable th) {
            a(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject b(Context context, com.baidu.mshield.x0.l.b bVar, String str) {
        JSONObject jSONObject;
        Throwable th;
        String str2;
        int i8;
        String str3 = "";
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
            try {
            } catch (Throwable th2) {
                th = th2;
                str2 = "";
            }
        } catch (Throwable th3) {
            a(th3);
        }
        if ("1001003".endsWith(bVar.f8492d)) {
            PackageInfo a8 = com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0);
            String a9 = com.baidu.mshield.b.f.e.a(new File(a8.applicationInfo.sourceDir));
            try {
                str3 = a8.versionName;
                int i9 = a8.versionCode;
                str2 = str3;
                str3 = a9;
                i8 = i9;
            } catch (Throwable th4) {
                str2 = str3;
                str3 = a9;
                th = th4;
                a(th);
                i8 = 0;
                jSONObject.put("0", System.currentTimeMillis());
                jSONObject.put("1", "0");
                jSONObject.put("2", "0");
                jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, c(context));
                jSONObject.put("4", 0);
                jSONObject.put(ErrorCode.PARAMETER_ERROR, 0);
                jSONObject.put("6", 1);
                jSONObject.put("7", 0);
                jSONObject.put("8", bVar.f8489a);
                jSONObject.put("9", bVar.f8491c);
                jSONObject.put("10", bVar.f8492d);
                JSONObject jSONObject3 = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                }
                jSONObject2.put("Common_section", jSONObject);
                jSONObject2.put("Module_section", jSONObject3);
                a(context, jSONObject2.toString());
                return jSONObject2;
            }
            jSONObject.put("0", System.currentTimeMillis());
            jSONObject.put("1", "0");
            jSONObject.put("2", "0");
            jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, c(context));
            jSONObject.put("4", 0);
            jSONObject.put(ErrorCode.PARAMETER_ERROR, 0);
            jSONObject.put("6", 1);
            jSONObject.put("7", 0);
            jSONObject.put("8", bVar.f8489a);
            jSONObject.put("9", bVar.f8491c);
            jSONObject.put("10", bVar.f8492d);
            JSONObject jSONObject32 = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject4 = new JSONObject(str);
                    if ("1001003".endsWith(bVar.f8492d)) {
                        com.baidu.mshield.b.c.a.b("1001003 createInsertAlive");
                        jSONObject4.put("14", j(context));
                        jSONObject4.put("16", e());
                        jSONObject4.put("17", str3);
                        jSONObject4.put("18", str2);
                        jSONObject4.put("19", i8);
                    }
                    if (a(context, "plc31", false)) {
                        jSONObject4.put("997", i(context));
                    }
                    jSONObject4.put("998", e.b(context));
                    jSONObject4.put("990", com.baidu.xclient.gdid.a.d(context));
                    jSONObject4.put("989", k(context));
                    jSONObject4.put("999", TextUtils.isEmpty(com.baidu.mshield.utility.c.j(context)) ? com.baidu.mshield.utility.c.i(context) : com.baidu.mshield.utility.c.j(context));
                    jSONObject32 = jSONObject4;
                } catch (Throwable th5) {
                    a(th5);
                }
            }
            jSONObject2.put("Common_section", jSONObject);
            jSONObject2.put("Module_section", jSONObject32);
            a(context, jSONObject2.toString());
            return jSONObject2;
        }
        str2 = "";
        i8 = 0;
        jSONObject.put("0", System.currentTimeMillis());
        jSONObject.put("1", "0");
        jSONObject.put("2", "0");
        jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, c(context));
        jSONObject.put("4", 0);
        jSONObject.put(ErrorCode.PARAMETER_ERROR, 0);
        jSONObject.put("6", 1);
        jSONObject.put("7", 0);
        jSONObject.put("8", bVar.f8489a);
        jSONObject.put("9", bVar.f8491c);
        jSONObject.put("10", bVar.f8492d);
        JSONObject jSONObject322 = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
        }
        jSONObject2.put("Common_section", jSONObject);
        jSONObject2.put("Module_section", jSONObject322);
        a(context, jSONObject2.toString());
        return jSONObject2;
    }

    public static void a(Context context, c cVar, JSONArray jSONArray, String str) {
        a(context, cVar, jSONArray, str, true);
    }

    public static void a(Context context, c cVar, JSONArray jSONArray, String str, boolean z7) {
        if (jSONArray == null || jSONArray.length() == 0 || cVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i8);
                jSONObject3.put("991", i(context));
                jSONObject3.put("995", g.b(context));
                jSONObject3.put("998", e.b(context));
                jSONObject3.put("989", k(context));
            }
            jSONObject2.put("0", Long.toString(System.currentTimeMillis()));
            jSONObject2.put("1", cVar.f8428a);
            jSONObject2.put("2", cVar.f8429b);
            jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(c(context)));
            jSONObject2.put("4", cVar.f8430c);
            jSONObject2.put(ErrorCode.PARAMETER_ERROR, cVar.f8431d);
            jSONObject2.put("6", cVar.f8432e);
            jSONObject2.put("7", cVar.f8433f);
            jSONObject2.put("8", com.baidu.mshield.x0.a.f8415d);
            jSONObject2.put("9", EngineImpl.sLoadVersion);
            jSONObject2.put("10", str);
            jSONObject.put("Common_section", jSONObject2);
            jSONObject.put("Module_section", jSONArray);
            a(context, jSONObject.toString());
        } catch (Throwable th) {
            a(th);
        }
    }

    public static int a(Context context, String str) {
        try {
            Report.getInstance(context).s(str);
            return 0;
        } catch (Throwable th) {
            a(th);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(Context context, String str, JSONArray jSONArray) {
        String str2;
        String str3 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String c8 = c(context);
            String str4 = com.baidu.mshield.x0.a.f8415d;
            String str5 = EngineImpl.sLoadVersion;
            try {
                str2 = com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0).versionName;
                try {
                    str3 = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
                } catch (Throwable th) {
                    th = th;
                    a(th);
                    jSONObject.put("1", str3);
                    jSONObject.put("2", EngineImpl.getInstance(context).getPropertyByType("p"));
                    jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, str2);
                    jSONObject.put("4", com.baidu.mshield.utility.c.b(context));
                    jSONObject.put(ErrorCode.PARAMETER_ERROR, str);
                    jSONObject.put("6", currentTimeMillis);
                    jSONObject.put("7", l.SPACE);
                    jSONObject.put("8", c8);
                    jSONObject.put("9", str4);
                    jSONObject.put("10", str5);
                    jSONObject.put("11", l.SPACE);
                    jSONObject.put("12", l.SPACE);
                    jSONObject.put("13", l.SPACE);
                    jSONObject.put("14", EngineImpl.getInstance(context).getPropertyByType("ws"));
                    if (a(context, "plc31", false)) {
                    }
                    jSONObject.put("989", k(context));
                    jSONObject.put("module_section", jSONArray);
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = "";
            }
            jSONObject.put("1", str3);
            jSONObject.put("2", EngineImpl.getInstance(context).getPropertyByType("p"));
            jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, str2);
            jSONObject.put("4", com.baidu.mshield.utility.c.b(context));
            jSONObject.put(ErrorCode.PARAMETER_ERROR, str);
            jSONObject.put("6", currentTimeMillis);
            jSONObject.put("7", l.SPACE);
            jSONObject.put("8", c8);
            jSONObject.put("9", str4);
            jSONObject.put("10", str5);
            jSONObject.put("11", l.SPACE);
            jSONObject.put("12", l.SPACE);
            jSONObject.put("13", l.SPACE);
            jSONObject.put("14", EngineImpl.getInstance(context).getPropertyByType("ws"));
            if (a(context, "plc31", false)) {
                jSONObject.put("997", i(context));
            }
            jSONObject.put("989", k(context));
            jSONObject.put("module_section", jSONArray);
        } catch (Throwable th3) {
            a(th3);
        }
        return jSONObject;
    }

    public static String b(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(com.baidu.mshield.b.f.d.b(str.getBytes(), com.baidu.mshield.b.f.a.a(16)), 0);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0107 A[Catch: all -> 0x0110, TryCatch #1 {all -> 0x0110, blocks: (B:13:0x0050, B:15:0x0057, B:17:0x006b, B:19:0x0074, B:21:0x0087, B:23:0x0090, B:25:0x0097, B:27:0x00a3, B:29:0x00ac, B:31:0x00c9, B:33:0x00d2, B:35:0x00db, B:37:0x00e4, B:39:0x00ed, B:41:0x00f6, B:43:0x00ff, B:45:0x0107, B:46:0x0113, B:48:0x01ad, B:51:0x01b5, B:55:0x01be, B:84:0x01aa, B:90:0x004d, B:57:0x011e, B:59:0x012b, B:61:0x0139, B:62:0x0152, B:65:0x015c, B:67:0x0165, B:69:0x0176, B:70:0x017f, B:72:0x0186, B:74:0x018f, B:76:0x0198, B:78:0x01a1, B:81:0x017b), top: B:89:0x004d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5 A[Catch: all -> 0x0110, TRY_ENTER, TryCatch #1 {all -> 0x0110, blocks: (B:13:0x0050, B:15:0x0057, B:17:0x006b, B:19:0x0074, B:21:0x0087, B:23:0x0090, B:25:0x0097, B:27:0x00a3, B:29:0x00ac, B:31:0x00c9, B:33:0x00d2, B:35:0x00db, B:37:0x00e4, B:39:0x00ed, B:41:0x00f6, B:43:0x00ff, B:45:0x0107, B:46:0x0113, B:48:0x01ad, B:51:0x01b5, B:55:0x01be, B:84:0x01aa, B:90:0x004d, B:57:0x011e, B:59:0x012b, B:61:0x0139, B:62:0x0152, B:65:0x015c, B:67:0x0165, B:69:0x0176, B:70:0x017f, B:72:0x0186, B:74:0x018f, B:76:0x0198, B:78:0x01a1, B:81:0x017b), top: B:89:0x004d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #1 {all -> 0x0110, blocks: (B:13:0x0050, B:15:0x0057, B:17:0x006b, B:19:0x0074, B:21:0x0087, B:23:0x0090, B:25:0x0097, B:27:0x00a3, B:29:0x00ac, B:31:0x00c9, B:33:0x00d2, B:35:0x00db, B:37:0x00e4, B:39:0x00ed, B:41:0x00f6, B:43:0x00ff, B:45:0x0107, B:46:0x0113, B:48:0x01ad, B:51:0x01b5, B:55:0x01be, B:84:0x01aa, B:90:0x004d, B:57:0x011e, B:59:0x012b, B:61:0x0139, B:62:0x0152, B:65:0x015c, B:67:0x0165, B:69:0x0176, B:70:0x017f, B:72:0x0186, B:74:0x018f, B:76:0x0198, B:78:0x01a1, B:81:0x017b), top: B:89:0x004d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONArray a(Context context, com.baidu.mshield.x0.l.b bVar, String str) {
        String str2;
        String str3;
        int i8;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        String str4 = "";
        try {
            PackageInfo a8 = com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0);
            str2 = a8.versionName;
            try {
                i8 = a8.versionCode;
                try {
                    str3 = a8.applicationInfo.loadLabel(context.getPackageManager()).toString();
                    try {
                        if ("1001003".endsWith(bVar.f8492d)) {
                            str4 = com.baidu.mshield.b.f.e.a(new File(a8.applicationInfo.sourceDir));
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            a(th);
                            jSONObject2.put("1", str3);
                            jSONObject2.put("2", EngineImpl.getInstance(context).getPropertyByType("p"));
                            jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, str2);
                            jSONObject2.put("4", com.baidu.mshield.utility.c.b(context));
                            jSONObject2.put(ErrorCode.PARAMETER_ERROR, bVar.f8492d);
                            jSONObject2.put("6", currentTimeMillis);
                            jSONObject2.put("7", "0");
                            jSONObject2.put("8", c(context));
                            jSONObject2.put("9", bVar.f8489a);
                            jSONObject2.put("10", bVar.f8491c);
                            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(context);
                            jSONObject2.put("11", aVar.c());
                            jSONObject2.put("12", aVar.k());
                            jSONObject2.put("13", 1);
                            jSONObject2.put("14", EngineImpl.getInstance(context).getPropertyByType("ws"));
                            jSONObject2.put("20", com.baidu.mshield.utility.c.j(context));
                            jSONObject2.put("21", com.baidu.mshield.utility.c.i(context));
                            jSONObject2.put("22", e.b(context));
                            jSONObject2.put("23", i(context));
                            jSONObject2.put("26", e.a(context));
                            jSONObject2.put("28", g.b(context));
                            if ("1003003".endsWith(bVar.f8492d)) {
                            }
                            jSONObject = new JSONObject();
                            if (!TextUtils.isEmpty(str)) {
                            }
                            if (jSONObject.length() == 0) {
                            }
                        } catch (Throwable th2) {
                            a(th2);
                        }
                        return new JSONArray().put(jSONObject2);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str3 = "";
                }
            } catch (Throwable th4) {
                th = th4;
                str3 = "";
                i8 = 0;
                a(th);
                jSONObject2.put("1", str3);
                jSONObject2.put("2", EngineImpl.getInstance(context).getPropertyByType("p"));
                jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, str2);
                jSONObject2.put("4", com.baidu.mshield.utility.c.b(context));
                jSONObject2.put(ErrorCode.PARAMETER_ERROR, bVar.f8492d);
                jSONObject2.put("6", currentTimeMillis);
                jSONObject2.put("7", "0");
                jSONObject2.put("8", c(context));
                jSONObject2.put("9", bVar.f8489a);
                jSONObject2.put("10", bVar.f8491c);
                com.baidu.mshield.x0.l.a aVar2 = new com.baidu.mshield.x0.l.a(context);
                jSONObject2.put("11", aVar2.c());
                jSONObject2.put("12", aVar2.k());
                jSONObject2.put("13", 1);
                jSONObject2.put("14", EngineImpl.getInstance(context).getPropertyByType("ws"));
                jSONObject2.put("20", com.baidu.mshield.utility.c.j(context));
                jSONObject2.put("21", com.baidu.mshield.utility.c.i(context));
                jSONObject2.put("22", e.b(context));
                jSONObject2.put("23", i(context));
                jSONObject2.put("26", e.a(context));
                jSONObject2.put("28", g.b(context));
                if ("1003003".endsWith(bVar.f8492d)) {
                }
                jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                }
                if (jSONObject.length() == 0) {
                }
                return new JSONArray().put(jSONObject2);
            }
        } catch (Throwable th5) {
            th = th5;
            str2 = "";
            str3 = str2;
        }
        jSONObject2.put("1", str3);
        jSONObject2.put("2", EngineImpl.getInstance(context).getPropertyByType("p"));
        jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, str2);
        jSONObject2.put("4", com.baidu.mshield.utility.c.b(context));
        jSONObject2.put(ErrorCode.PARAMETER_ERROR, bVar.f8492d);
        jSONObject2.put("6", currentTimeMillis);
        jSONObject2.put("7", "0");
        jSONObject2.put("8", c(context));
        jSONObject2.put("9", bVar.f8489a);
        jSONObject2.put("10", bVar.f8491c);
        com.baidu.mshield.x0.l.a aVar22 = new com.baidu.mshield.x0.l.a(context);
        jSONObject2.put("11", aVar22.c());
        jSONObject2.put("12", aVar22.k());
        jSONObject2.put("13", 1);
        jSONObject2.put("14", EngineImpl.getInstance(context).getPropertyByType("ws"));
        jSONObject2.put("20", com.baidu.mshield.utility.c.j(context));
        jSONObject2.put("21", com.baidu.mshield.utility.c.i(context));
        jSONObject2.put("22", e.b(context));
        jSONObject2.put("23", i(context));
        jSONObject2.put("26", e.a(context));
        jSONObject2.put("28", g.b(context));
        if ("1003003".endsWith(bVar.f8492d)) {
            jSONObject2.put("29", "x0");
        }
        jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject3 = new JSONObject(str);
                if ("1001003".endsWith(bVar.f8492d)) {
                    com.baidu.mshield.b.c.a.b("1001003 createAlive");
                    jSONObject3.put("14", j(context));
                    jSONObject3.put("16", e());
                    jSONObject3.put("17", str4);
                    jSONObject3.put("18", str2);
                    jSONObject3.put("19", i8);
                }
                if (a(context, "plc31", false)) {
                    jSONObject3.put("997", i(context));
                }
                jSONObject3.put("998", e.b(context));
                jSONObject3.put("999", TextUtils.isEmpty(com.baidu.mshield.utility.c.j(context)) ? com.baidu.mshield.utility.c.i(context) : com.baidu.mshield.utility.c.j(context));
                jSONObject3.put("990", com.baidu.xclient.gdid.a.d(context));
                jSONObject3.put("989", k(context));
                jSONObject3.put("985", com.baidu.mshield.x6.f.e.a(context));
                jSONObject3.put("971", com.baidu.mshield.x6.f.e.b(context));
                jSONObject = jSONObject3;
            } catch (Throwable th6) {
                a(th6);
            }
        }
        if (jSONObject.length() == 0) {
            jSONObject2.put("module_section", new JSONArray());
        } else {
            jSONObject2.put("module_section", new JSONArray().put(jSONObject));
        }
        return new JSONArray().put(jSONObject2);
    }

    public static boolean a(Context context, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            if (str2.equals(context.getPackageName()) || str2.equals(com.baidu.mshield.x0.a.f8412a)) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    if (str2.equals(jSONArray.get(i8))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static void a(Context context, com.baidu.mshield.x0.l.b bVar) {
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(context);
            String d8 = aVar.d(bVar.f8492d);
            String b8 = b();
            if (d8.equals(b8)) {
                return;
            }
            String a8 = aVar.a(bVar.f8492d);
            if (!new com.baidu.mshield.x0.i.c(context, null).a(a(context, bVar, a8).toString())) {
                b(context, bVar, a8);
            }
            aVar.c(bVar.f8492d, b8);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static String a(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : new String(com.baidu.mshield.b.f.d.a(Base64.decode(str, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context, com.baidu.mshield.x0.l.a aVar, String str, String str2) {
        if (aVar == null) {
            try {
                aVar = new com.baidu.mshield.x0.l.a(context);
            } catch (Throwable th) {
                a(th);
            }
        }
        String c8 = aVar.c(str);
        if (!TextUtils.isEmpty(c8)) {
            JSONObject jSONObject = new JSONObject(c8).getJSONObject(ErrorCode.PARAMETER_ERROR);
            if (jSONObject.has(str2)) {
                return jSONObject.optString(str2, "");
            }
        }
        return "";
    }

    public static String a() {
        String property = System.getProperty("http.proxyHost");
        return TextUtils.isEmpty(property) ? "" : property;
    }

    public static JSONArray a(JSONArray jSONArray, int i8) {
        JSONArray jSONArray2 = new JSONArray();
        try {
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                if (i9 != i8) {
                    jSONArray2.put(jSONArray.get(i9));
                }
            }
        } catch (Throwable th) {
            a(th);
        }
        return jSONArray2;
    }
}
