package com.baidu.mshield.utility;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.util.l;
import com.baidu.mshield.MyProvider;
import com.baidu.mshield.ac.F;
import com.baidu.mshield.rp.Report;
import com.baidu.mshield.x0.EngineImpl;
import com.google.android.exoplayer2.C;
import com.my.lib.data.ErrorCode;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f8394a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f8395b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f8396c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f8397d = "";

    /* renamed from: e, reason: collision with root package name */
    public static int f8398e = -1;

    public static void a(String str, String str2) {
        f8394a = str;
        f8395b = str2;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            String a8 = com.baidu.xclient.gdid.a.a(context);
            if (a8 == null) {
                a8 = "";
            }
            jSONObject.put("0", a8);
            String b8 = com.baidu.xclient.gdid.a.b(context);
            if (b8 == null) {
                b8 = "";
            }
            jSONObject.put("1", b8);
            String e8 = com.baidu.xclient.gdid.a.e(context);
            if (e8 == null) {
                e8 = "";
            }
            jSONObject.put("2", e8);
            String str = Build.HOST;
            if (str == null) {
                str = "";
            }
            jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, str);
            String a9 = c.a();
            if (a9 == null) {
                a9 = "";
            }
            jSONObject.put("4", a9);
            String h8 = com.baidu.xclient.gdid.a.h(context);
            if (h8 == null) {
                h8 = "";
            }
            jSONObject.put(ErrorCode.PARAMETER_ERROR, h8);
            String str2 = Build.VERSION.CODENAME;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("6", str2);
            String str3 = Build.VERSION.INCREMENTAL;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("7", str3);
            jSONObject.put("8", c.b(context));
            String g8 = com.baidu.xclient.gdid.a.g(context);
            if (g8 == null) {
                g8 = "";
            }
            jSONObject.put("9", g8);
            String a10 = com.baidu.mshield.core.a.a("mod");
            if (a10 == null) {
                a10 = "";
            }
            jSONObject.put("10", a10);
            jSONObject.put("11", c.g(context));
            String a11 = com.baidu.mshield.core.a.a("arv");
            jSONObject.put("12", a11 != null ? a11 : "");
            jSONObject.put("13", c.h(context));
            jSONObject.put("20", com.baidu.mshield.core.a.a("arl"));
        } catch (Throwable th) {
            a(th);
        }
        return jSONObject;
    }

    public static String[] c(Context context) {
        if (!TextUtils.isEmpty(f8394a) && !TextUtils.isEmpty(f8395b)) {
            return new String[]{f8394a, f8395b};
        }
        String K = com.baidu.mshield.sharedpreferences.a.a(context).K();
        if (TextUtils.isEmpty(K)) {
            return new String[0];
        }
        String[] split = K.split("-");
        if (split == null || split.length != 2) {
            return new String[2];
        }
        f8394a = split[0];
        f8395b = split[1];
        return split;
    }

    @SuppressLint({"MissingPermission"})
    public static int d(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = com.baidu.mshield.b.e.b.a(context);
        } catch (Throwable th) {
            a(th);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return 0;
        }
        if (1 == networkInfo.getType()) {
            return 2;
        }
        networkInfo.getType();
        return 1;
    }

    public static String e(Context context) {
        try {
        } catch (Throwable th) {
            a(th);
        }
        if (TextUtils.isEmpty(f8397d) && f8398e != 1) {
            try {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(context.getPackageName() + ".mshield.ac.provider", 0);
                if (resolveContentProvider != null && !resolveContentProvider.multiprocess) {
                    f8397d = resolveContentProvider.processName;
                }
            } catch (Throwable th2) {
                a(th2);
            }
            f8398e = 1;
            return f8397d;
        }
        return f8397d;
    }

    public static String f(Context context) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("host=");
            String str = f.f8406a;
            sb.append(str);
            com.baidu.mshield.b.c.a.b(sb.toString());
            return new String(F.getInstance().ad(Base64.decode(str, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void g(Context context) {
        com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
        if (System.currentTimeMillis() - a8.b() <= 86400000) {
            a8.a(a8.l() + 1);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("0", Integer.valueOf(a8.l() + 1));
        a8.a(0);
        a8.k();
        a(context, "1067119", hashMap);
    }

    public static int h(Context context) {
        int a8;
        try {
            if (MyProvider.a() || TextUtils.isEmpty(e(context)) || (a8 = a(context)) == 1) {
                return 1;
            }
            if (a8 == 2) {
                return 0;
            }
            return MyProvider.a() ? 1 : 0;
        } catch (Throwable th) {
            a(th);
            return -1;
        }
    }

    public static String[] i(Context context) {
        String str = f8394a;
        String str2 = f8395b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            com.baidu.mshield.b.c.a.b("get key key select by in memory!");
            return new String[]{str, str2};
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            String K = com.baidu.mshield.sharedpreferences.a.a(context).K();
            if (!TextUtils.isEmpty(K)) {
                String[] split = K.split("-");
                if (split.length == 2) {
                    com.baidu.mshield.b.c.a.b("get key key select by  from Info");
                    return split;
                }
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            String a8 = com.baidu.mshield.sharedpreferences.a.a(context).a();
            if (!TextUtils.isEmpty(a8)) {
                String[] split2 = a8.split("-");
                if (split2.length == 2) {
                    com.baidu.mshield.b.c.a.b("get key key select by  in mark");
                    return split2;
                }
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.baidu.mshield.b.c.a.b("get key key select by by default");
            str = "985050001";
            str2 = "83162820e470e3b72501f0683504560e";
        }
        return new String[]{str, str2};
    }

    public static void a(Throwable th) {
        com.baidu.mshield.b.c.a.a(th);
    }

    public static void a(Context context, String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("0", System.currentTimeMillis());
            jSONObject2.put("1", "");
            jSONObject2.put("2", "");
            String[] i8 = i(context);
            jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, (i8 == null || i8.length != 2 || TextUtils.isEmpty(i8[0]) || TextUtils.isEmpty(i8[1])) ? "985050001" : i8[0]);
            jSONObject2.put("4", 0);
            jSONObject2.put(ErrorCode.PARAMETER_ERROR, 0);
            jSONObject2.put("6", 1);
            jSONObject2.put("7", 0);
            jSONObject2.put("8", "mshield");
            jSONObject2.put("9", "4.2.6");
            jSONObject2.put("10", str);
            jSONObject.put("Common_section", jSONObject2);
            if (map != null && map.size() > 0) {
                jSONObject.put("Module_section", new JSONObject(map));
            } else {
                jSONObject.put("Module_section", new JSONObject());
            }
            Report report = Report.getInstance(context);
            String jSONObject3 = jSONObject.toString();
            com.baidu.mshield.b.c.a.b("sendEventUDC:" + jSONObject3);
            report.s(jSONObject3);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void b(Context context, String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("Common_section");
            long optLong = optJSONObject.optLong("0");
            String optString = optJSONObject.optString("10");
            int optInt = optJSONObject.optInt(ErrorCode.PARAMETER_ERROR);
            int optInt2 = optJSONObject.optInt("6");
            int optInt3 = optJSONObject.optInt("7");
            int optInt4 = optJSONObject.optInt("11");
            String optString2 = optJSONObject.optString("12", "");
            if (optInt2 == 0) {
                optInt2 = 1;
            }
            com.baidu.mshield.rp.d.a aVar = new com.baidu.mshield.rp.d.a();
            aVar.f8353d = str;
            aVar.f8351b = optString;
            aVar.f8356g = optInt;
            aVar.f8352c = 3;
            aVar.f8354e = optLong;
            aVar.f8355f = optInt2;
            aVar.f8357h = optInt3;
            aVar.f8358i = optInt4;
            aVar.f8359j = optString2;
            b.a(context).a(aVar);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void a(Context context, byte[] bArr) {
        try {
            String[] i8 = i(context);
            if (i8.length == 2) {
                if (TextUtils.isEmpty(i8[0]) || TextUtils.isEmpty(i8[1]) || !"200080".equals(i8[0]) || !context.getPackageName().equals("com.baidu.BaiduMap") || bArr == null) {
                    return;
                }
                for (int i9 = 0; i9 < bArr.length; i9++) {
                    bArr[i9] = (byte) (bArr[i9] ^ 246);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject a(Context context, com.baidu.mshield.rp.b.a aVar, String str, boolean z7) {
        return a(context, aVar.f8341a, aVar.f8343c, z7 ? aVar.f8344d : aVar.f8345e, str);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        b.a(context).a(false);
        b.a(context).e();
        com.baidu.mshield.rp.b.a aVar = new com.baidu.mshield.rp.b.a();
        aVar.f8341a = str;
        aVar.f8342b = str2;
        aVar.f8343c = str3;
        aVar.f8344d = str4;
        aVar.f8345e = str5;
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return;
        }
        com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
        List<com.baidu.mshield.rp.b.a> p8 = a8.p();
        if (p8 == null) {
            a8.a(aVar);
        } else if (!p8.contains(aVar)) {
            a8.a(aVar);
        } else {
            a8.a(p8, aVar);
            b.a(context).b();
            return;
        }
        if (!a8.e(aVar.f8345e)) {
            b.a(context).a(aVar);
        }
        b.a(context).b();
        b.a(context).d();
    }

    public static void a(Context context, String str) {
        String str2 = "";
        com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("0");
                if (optJSONObject != null) {
                    String str3 = "";
                    while (optJSONObject.keys().hasNext()) {
                        str3 = String.valueOf(optJSONObject.keys().next());
                        if (!TextUtils.isEmpty(str3)) {
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        a8.a(str3, optJSONObject.optString(str3));
                    }
                }
            } catch (Throwable th) {
                a(th);
            }
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("1");
                if (optJSONObject2 != null) {
                    while (optJSONObject2.keys().hasNext()) {
                        str2 = String.valueOf(optJSONObject2.keys().next());
                        if (!TextUtils.isEmpty(str2)) {
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        a8.b(str2, optJSONObject2.optString(str2));
                    }
                }
            } catch (Throwable th2) {
                a(th2);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("2");
                if (optJSONArray != null) {
                    com.baidu.mshield.b.c.a.b("setAliveData rp= " + optJSONArray.toString());
                    a8.f(optJSONArray.toString());
                }
            } catch (Throwable th3) {
                a(th3);
            }
        } catch (Throwable th4) {
            a(th4);
        }
    }

    public static String a() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + "" + calendar.get(2) + "" + calendar.get(5);
    }

    public static JSONObject a(Context context, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("0", System.currentTimeMillis());
            jSONObject2.put("1", "0");
            jSONObject2.put("2", "0");
            String[] i8 = i(context);
            if (i8.length == 2) {
                jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, i8[0]);
            } else {
                jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, "985050001");
            }
            jSONObject2.put("4", 0);
            jSONObject2.put(ErrorCode.PARAMETER_ERROR, 0);
            jSONObject2.put("6", 1);
            jSONObject2.put("7", 0);
            jSONObject2.put("8", str);
            jSONObject2.put("9", str2);
            jSONObject2.put("10", str3);
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(str4)) {
                try {
                    jSONObject3 = new JSONObject(str4);
                } catch (Throwable th) {
                    a(th);
                }
            }
            jSONObject.put("Common_section", jSONObject2);
            jSONObject.put("Module_section", jSONObject3);
        } catch (Throwable th2) {
            a(th2);
        }
        return jSONObject;
    }

    public static void a(Context context, long j8) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            int i8 = Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE;
            new Intent("com.b.r.p").setPackage(context.getPackageName());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 101, new Intent("com.b.r.p"), i8);
            try {
                alarmManager.cancel(broadcast);
            } catch (Throwable th) {
                a(th);
            }
            try {
                alarmManager.set(0, System.currentTimeMillis() + j8, broadcast);
            } catch (Throwable th2) {
                a(th2);
            }
        } catch (Throwable th3) {
            a(th3);
        }
    }

    public static String a(byte[] bArr) {
        String str = "";
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            str = str + hexString.toUpperCase();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0157 A[Catch: all -> 0x015b, TRY_ENTER, TryCatch #4 {all -> 0x015b, blocks: (B:15:0x0087, B:17:0x008c, B:19:0x009a, B:21:0x00bf, B:23:0x00c8, B:25:0x00d7, B:27:0x00e3, B:29:0x00ec, B:31:0x00f5, B:33:0x0115, B:35:0x011c, B:37:0x0125, B:39:0x012e, B:41:0x0137, B:44:0x0157, B:52:0x015d, B:63:0x0080), top: B:62:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #4 {all -> 0x015b, blocks: (B:15:0x0087, B:17:0x008c, B:19:0x009a, B:21:0x00bf, B:23:0x00c8, B:25:0x00d7, B:27:0x00e3, B:29:0x00ec, B:31:0x00f5, B:33:0x0115, B:35:0x011c, B:37:0x0125, B:39:0x012e, B:41:0x0137, B:44:0x0157, B:52:0x015d, B:63:0x0080), top: B:62:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j8;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String r8;
        Object obj;
        JSONObject jSONObject3 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject2 = jSONObject.getJSONObject("Common_section");
        } catch (Throwable th) {
            a(th);
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            String optString = jSONObject2.optString("10");
            j8 = jSONObject2.optLong("0");
            String optString2 = jSONObject2.optString("1");
            String optString3 = jSONObject2.optString(ExifInterface.GPS_MEASUREMENT_3D);
            str5 = jSONObject2.optString("8");
            str4 = optString3;
            str3 = optString2;
            str2 = optString;
            str = jSONObject2.optString("9");
        } else {
            j8 = currentTimeMillis;
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            str5 = str4;
        }
        try {
            String charSequence = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            try {
                str7 = charSequence;
                str6 = "";
            } catch (Throwable th2) {
                th = th2;
                str7 = charSequence;
                str6 = "";
            }
        } catch (Throwable th3) {
            th = th3;
            str6 = "";
            str7 = str6;
        }
        try {
            str9 = com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0).versionName;
            str8 = str7;
        } catch (Throwable th4) {
            th = th4;
            try {
                a(th);
                str8 = str7;
                str9 = str6;
                jSONObject3.put("1", str8);
                jSONObject3.put("2", com.baidu.mshield.core.a.a("p"));
                jSONObject3.put(ExifInterface.GPS_MEASUREMENT_3D, str9);
                jSONObject3.put("4", c.b(context));
                jSONObject3.put(ErrorCode.PARAMETER_ERROR, str2);
                jSONObject3.put("6", j8);
                jSONObject3.put("7", str3);
                jSONObject3.put("8", str4);
                jSONObject3.put("9", str5);
                jSONObject3.put("10", str);
                com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
                jSONObject3.put("11", a8.o());
                jSONObject3.put("12", a8.t());
                jSONObject3.put("13", 0);
                jSONObject3.put("14", com.baidu.mshield.core.a.a("ws"));
                jSONObject3.put("20", c.j(context));
                jSONObject3.put("21", c.d(context));
                jSONObject3.put("22", c.h(context));
                r8 = a8.r();
                if (TextUtils.isEmpty(r8)) {
                }
                jSONObject3.put("23", r8);
                jSONObject3.put("25", com.baidu.mshield.rp.a.b(context));
                jSONObject3.put("26", com.baidu.mshield.rp.a.a(context));
                jSONObject3.put("27", com.baidu.mshield.rp.a.c(context));
                jSONObject3.put("28", EngineImpl.getInstance(context).getNui());
                jSONObject3.put("30", str6);
                obj = jSONObject.get("Module_section");
                if (!(obj instanceof JSONArray)) {
                }
            } catch (Throwable th5) {
                a(th5);
            }
            return jSONObject3;
        }
        jSONObject3.put("1", str8);
        jSONObject3.put("2", com.baidu.mshield.core.a.a("p"));
        jSONObject3.put(ExifInterface.GPS_MEASUREMENT_3D, str9);
        jSONObject3.put("4", c.b(context));
        jSONObject3.put(ErrorCode.PARAMETER_ERROR, str2);
        jSONObject3.put("6", j8);
        jSONObject3.put("7", str3);
        jSONObject3.put("8", str4);
        jSONObject3.put("9", str5);
        jSONObject3.put("10", str);
        com.baidu.mshield.sharedpreferences.a a82 = com.baidu.mshield.sharedpreferences.a.a(context);
        jSONObject3.put("11", a82.o());
        jSONObject3.put("12", a82.t());
        jSONObject3.put("13", 0);
        jSONObject3.put("14", com.baidu.mshield.core.a.a("ws"));
        jSONObject3.put("20", c.j(context));
        jSONObject3.put("21", c.d(context));
        jSONObject3.put("22", c.h(context));
        r8 = a82.r();
        if (TextUtils.isEmpty(r8)) {
            try {
                r8 = com.baidu.xclient.gdid.a.c(context);
                if (TextUtils.isEmpty(r8)) {
                    r8 = str6;
                }
                a82.j(r8);
            } catch (Throwable unused) {
            }
        }
        jSONObject3.put("23", r8);
        jSONObject3.put("25", com.baidu.mshield.rp.a.b(context));
        jSONObject3.put("26", com.baidu.mshield.rp.a.a(context));
        jSONObject3.put("27", com.baidu.mshield.rp.a.c(context));
        jSONObject3.put("28", EngineImpl.getInstance(context).getNui());
        jSONObject3.put("30", str6);
        obj = jSONObject.get("Module_section");
        if (!(obj instanceof JSONArray)) {
            jSONObject3.put("module_section", obj);
        } else {
            jSONObject3.put("module_section", new JSONArray().put(obj));
        }
        return jSONObject3;
    }

    public static int a(Context context) {
        try {
            String e8 = e(context);
            if (TextUtils.isEmpty(f8396c)) {
                f8396c = a(Process.myPid());
            }
            if (TextUtils.isEmpty(f8396c)) {
                return 0;
            }
            return !TextUtils.isEmpty(e8) ? e8.equals(f8396c) ? 1 : 2 : context.getPackageName().equals(f8396c) ? 3 : 4;
        } catch (Throwable th) {
            a(th);
            return 0;
        }
    }

    public static String a(int i8) {
        String str;
        String str2 = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
                try {
                    if (!TextUtils.isEmpty(str)) {
                        com.baidu.mshield.b.c.a.b("getProcessName return by P+:" + str);
                        return str.trim();
                    }
                } catch (Throwable th) {
                    th = th;
                    str2 = str;
                    a(th);
                    return str2;
                }
            } else {
                str = null;
            }
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
                if (!TextUtils.isEmpty(str)) {
                    com.baidu.mshield.b.c.a.b("getProcessName return by reflect:" + str);
                    return str.trim();
                }
            } catch (Throwable th2) {
                a(th2);
            }
            str2 = a(String.format("/proc/%d/cmdline", Integer.valueOf(i8)));
            if (!TextUtils.isEmpty(str2)) {
                com.baidu.mshield.b.c.a.b("getProcessName return by cmdline:" + str2);
                return str2.trim();
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return str2;
    }

    public static String a(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                String a8 = a(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (Throwable th) {
                    a(th);
                }
                return a8;
            } catch (Throwable th2) {
                th = th2;
                try {
                    a(th);
                    return null;
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            a(th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, l.UTF_8));
        StringBuilder sb = new StringBuilder();
        boolean z7 = true;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                if (z7) {
                    z7 = false;
                } else {
                    sb.append('\n');
                }
                sb.append(readLine);
            } else {
                return sb.toString();
            }
        }
    }
}
