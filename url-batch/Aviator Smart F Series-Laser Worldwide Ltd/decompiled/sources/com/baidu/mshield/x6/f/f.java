package com.baidu.mshield.x6.f;

import android.content.Context;
import android.nfc.NfcManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.MH;
import com.baidu.mshield.x6.EngineImpl;
import com.my.lib.data.ErrorCode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {
    public static String a() {
        String str = EngineImpl.sAppkey;
        return str != null ? str : "";
    }

    public static String b() {
        String str = EngineImpl.sSecKey;
        return str != null ? str : "";
    }

    public static String c() {
        try {
            Calendar calendar = Calendar.getInstance();
            return calendar.get(1) + "" + calendar.get(2) + "" + calendar.get(5);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String d(Context context) {
        try {
            return a(context, false) ? new com.baidu.mshield.x6.b.b(context).g() : l.f8570e;
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String e(Context context) {
        try {
            return MH.getVersion(context);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String f(Context context) {
        try {
            return new String(h.a(Base64.decode(g.f8562b, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String g(Context context) {
        String str = "";
        try {
            com.baidu.mshield.x6.b.c cVar = new com.baidu.mshield.x6.b.c(context);
            str = cVar.b();
            if (TextUtils.isEmpty(str)) {
                com.baidu.mshield.b.c.a.a("cloud token is empty");
                str = cVar.e();
            }
            com.baidu.mshield.b.c.a.a("getUserHoldToken : " + str);
        } catch (Throwable th) {
            b(th);
        }
        return str;
    }

    public static void h(Context context) {
        try {
            b.c(context);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            long currentTimeMillis = System.currentTimeMillis();
            long o8 = bVar.o() * 60000;
            long K = bVar.K();
            if (!bVar.n() || currentTimeMillis - K > o8) {
                com.baidu.mshield.x6.e.h.a(context).a(3);
            }
            if (!bVar.f()) {
                j(context);
                bVar.d(true);
            }
            com.baidu.mshield.x6.e.h.a(context).a(1, false);
            if (bVar.a()) {
                return;
            }
            com.baidu.mshield.x6.e.h.a(context).a();
        } catch (Throwable th) {
            b(th);
        }
    }

    public static void i(Context context) {
        try {
            String a8 = l.a(context);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            if (TextUtils.isEmpty(a8)) {
                bVar.a(System.currentTimeMillis(), false);
                return;
            }
            JSONObject jSONObject = new JSONObject(a8);
            try {
                String optString = jSONObject.optString("sig");
                if (TextUtils.isEmpty(optString)) {
                    com.baidu.mshield.b.c.a.a("sig sdata is empty ");
                } else {
                    String a9 = com.baidu.mshield.b.f.e.a(optString);
                    l.f8568c = a9;
                    bVar.h(a9);
                    String str = new String(com.baidu.mshield.b.a.c.b(Base64.decode(optString.getBytes(), 0)), "utf-8");
                    com.baidu.mshield.b.c.a.a("requestSigPolicy ungzSig : " + str);
                    l.f8566a = str;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("sgs");
                if (optJSONObject != null) {
                    String optString2 = optJSONObject.optString(ExifInterface.GPS_MEASUREMENT_3D, "");
                    l.f8567b = optString2;
                    com.baidu.mshield.b.c.a.a("requestSgsPolicy : " + optString2);
                }
            } catch (Throwable th) {
                b(th);
            }
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("drf");
                if (optJSONObject2 != null) {
                    l.f8569d = optJSONObject2.toString();
                    com.baidu.mshield.b.c.a.a("requestSigPolicy ungzDrf : " + new String(com.baidu.mshield.b.a.c.b(Base64.decode(optJSONObject2.optString("1").getBytes(), 0)), "utf-8"));
                    bVar.g(optJSONObject2.optString("2"));
                } else {
                    l.f8569d = "";
                }
            } catch (Throwable th2) {
                b(th2);
            }
            bVar.a(System.currentTimeMillis(), true);
            try {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rmf");
                if (optJSONObject3 == null) {
                    l.f8570e = "";
                    return;
                }
                if (a(context, false)) {
                    bVar.v(optJSONObject3.toString());
                    l.f8570e = "";
                } else {
                    l.f8570e = optJSONObject3.toString();
                    bVar.p();
                }
                com.baidu.mshield.b.c.a.a("requestSigPolicy ungzRmf : " + new String(com.baidu.mshield.b.a.c.b(Base64.decode(optJSONObject3.optString("1").getBytes(), 0)), "utf-8"));
            } catch (Throwable th3) {
                b(th3);
            }
        } catch (Throwable th4) {
            b(th4);
        }
    }

    public static void j(Context context) {
        try {
            String a8 = com.baidu.mshield.x6.c.a.a(context);
            String b8 = com.baidu.mshield.x6.c.a.b(context);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            if (!TextUtils.isEmpty(a8)) {
                bVar.o(com.baidu.mshield.b.f.e.a(a8));
            }
            if (TextUtils.isEmpty(b8)) {
                return;
            }
            bVar.n(com.baidu.mshield.b.f.e.a(b8));
        } catch (Throwable th) {
            b(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #2 {all -> 0x007f, blocks: (B:6:0x002f, B:8:0x0036, B:10:0x004a, B:12:0x0062, B:15:0x0078, B:16:0x00a8, B:18:0x00b9, B:21:0x00cb, B:23:0x00d4, B:30:0x0081, B:32:0x008b, B:33:0x0096, B:35:0x0099, B:36:0x00a2, B:40:0x002b), top: B:39:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:6:0x002f, B:8:0x0036, B:10:0x004a, B:12:0x0062, B:15:0x0078, B:16:0x00a8, B:18:0x00b9, B:21:0x00cb, B:23:0x00d4, B:30:0x0081, B:32:0x008b, B:33:0x0096, B:35:0x0099, B:36:0x00a2, B:40:0x002b), top: B:39:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(Context context, JSONObject jSONObject, String str, String str2, boolean z7) {
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject2 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str3 = com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0).versionName;
            try {
                str4 = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            } catch (Throwable th) {
                th = th;
                try {
                    b(th);
                    str4 = "";
                    jSONObject2.put("1", str4);
                    jSONObject2.put("2", EngineImpl.getInstance(context).getPropertyByType("p"));
                    jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, str3);
                    jSONObject2.put("4", com.baidu.mshield.utility.c.b(context));
                    jSONObject2.put(ErrorCode.PARAMETER_ERROR, str);
                    jSONObject2.put("6", currentTimeMillis);
                    jSONObject2.put("7", "");
                    jSONObject2.put("8", a());
                    str5 = EngineImpl.sLoadVersion;
                    if (TextUtils.isEmpty(str5)) {
                    }
                    jSONObject2.put("11", "");
                    jSONObject2.put("12", "");
                    jSONObject2.put("13", 1);
                    jSONObject2.put("14", EngineImpl.getInstance(context).getPropertyByType("ws"));
                    if (jSONObject != null) {
                    }
                } catch (Throwable th2) {
                    b(th2);
                }
                return jSONObject2;
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
        jSONObject2.put("1", str4);
        jSONObject2.put("2", EngineImpl.getInstance(context).getPropertyByType("p"));
        jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, str3);
        jSONObject2.put("4", com.baidu.mshield.utility.c.b(context));
        jSONObject2.put(ErrorCode.PARAMETER_ERROR, str);
        jSONObject2.put("6", currentTimeMillis);
        jSONObject2.put("7", "");
        jSONObject2.put("8", a());
        str5 = EngineImpl.sLoadVersion;
        if (TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/");
            if (split.length == 2) {
                jSONObject2.put("9", split[0]);
                jSONObject2.put("10", split[1]);
            } else if (split.length == 1) {
                jSONObject2.put("9", str2);
                jSONObject2.put("10", split[0]);
            } else {
                jSONObject2.put("9", str2);
                jSONObject2.put("10", "0");
            }
        } else {
            jSONObject2.put("9", str2);
            jSONObject2.put("10", "0");
        }
        jSONObject2.put("11", "");
        jSONObject2.put("12", "");
        jSONObject2.put("13", 1);
        jSONObject2.put("14", EngineImpl.getInstance(context).getPropertyByType("ws"));
        if (jSONObject != null) {
            jSONObject.put("989", e(context));
            jSONObject2.put("module_section", new JSONArray().put(jSONObject));
        }
        return jSONObject2;
    }

    public static void b(Throwable th) {
        com.baidu.mshield.b.c.a.a(th);
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(l.f8569d)) {
            return l.f8569d;
        }
        i(context);
        return l.f8569d;
    }

    public static String e() {
        return l.f8567b;
    }

    public static String d() {
        return l.f8568c;
    }

    public static String b(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(com.baidu.mshield.b.f.a.b(str.getBytes(), com.baidu.mshield.b.f.a.a()), 0);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static int c(String str) {
        int i8 = -1;
        if (str != null && str != "") {
            try {
                char[] charArray = str.trim().toCharArray();
                int i9 = 0;
                while (i9 < charArray.length - 1) {
                    if (i9 == 0) {
                        i8 = Character.getNumericValue(charArray[i9]);
                    } else {
                        char c8 = charArray[i9];
                        i9++;
                        int numericValue = Character.getNumericValue(charArray[i9]);
                        if (c8 == '%') {
                            i8 %= numericValue;
                        } else if (c8 != '&') {
                            if (c8 != '*') {
                                if (c8 == '+') {
                                    i8 += numericValue;
                                } else if (c8 == '-') {
                                    i8 -= numericValue;
                                } else if (c8 == '/') {
                                    i8 /= numericValue;
                                } else if (c8 == '^') {
                                    i8 ^= numericValue;
                                } else if (c8 != 'x') {
                                    i8 = c8 != '|' ? numericValue : i8 | numericValue;
                                }
                            }
                            i8 *= numericValue;
                        } else {
                            i8 &= numericValue;
                        }
                    }
                    i9++;
                }
                com.baidu.mshield.b.c.a.a("illegalArithmetic expr：" + str + "，res：" + i8);
            } catch (Throwable th) {
                b(th);
            }
            return i8;
        }
        com.baidu.mshield.b.c.a.a("illegalArithmetic expr is empty : " + str);
        return -1;
    }

    public static String c(Context context) {
        try {
        } catch (Throwable th) {
            b(th);
        }
        if (!TextUtils.isEmpty(l.f8566a)) {
            return l.f8566a;
        }
        i(context);
        return l.f8566a;
    }

    public static JSONObject a(Context context, JSONObject jSONObject, String str, boolean z7) {
        return a(context, jSONObject, str, "mshield_x6", z7);
    }

    public static String a(String str, String str2, long j8) {
        return com.baidu.mshield.b.f.e.a(str + j8 + str2);
    }

    public static boolean a(Context context, String str, boolean z7) {
        try {
            String a8 = new com.baidu.mshield.x6.b.a(context).a(str);
            if (!TextUtils.isEmpty(a8)) {
                return new JSONObject(a8).optInt("1") == 1;
            }
        } catch (Throwable th) {
            b(th);
        }
        return z7;
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            try {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            } catch (Throwable th3) {
                b(th3);
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        return stringWriter2.replaceAll("\t", ";").replaceAll("\n", ";");
    }

    public static boolean a(Context context) {
        try {
            return ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter() != null;
        } catch (Throwable th) {
            b(th);
            return false;
        }
    }

    public static boolean a(Context context, boolean z7) {
        try {
            String a8 = a(context, "plc104");
            if (!TextUtils.isEmpty(a8)) {
                JSONObject jSONObject = new JSONObject(a8).getJSONObject(ErrorCode.PARAMETER_ERROR);
                if (jSONObject.has("34")) {
                    return jSONObject.optInt("34") == 1;
                }
            }
        } catch (Throwable th) {
            b(th);
        }
        return z7;
    }

    public static String a(Context context, String str) {
        try {
            return new com.baidu.mshield.x6.b.a(context).a(str);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String a(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : new String(com.baidu.mshield.b.f.a.a(Base64.decode(str, 0), com.baidu.mshield.b.f.a.a()));
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }
}
