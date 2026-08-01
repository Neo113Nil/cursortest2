package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* compiled from: SelasAgent.java */
/* loaded from: classes3.dex */
public class S {
    public static int a = 504;
    public static String b = null;
    public static String c = "";
    private static Context d;

    public static void a(Context context, String str) {
        if (d == null) {
            d = context;
        }
        int i = a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        System.currentTimeMillis();
        b = str;
        a = 102;
        AbstractC1123c.a(new T(context, null));
    }

    public static synchronized String b() {
        String str;
        synchronized (S.class) {
            if (TextUtils.isEmpty(c)) {
                c = (String) com.pgl.ssdk.ces.a.meta(303, d, null);
            }
            str = c;
        }
        return str;
    }

    public static void c() {
        Context context = d;
        if (context != null) {
            a = 102;
            AbstractC1123c.a(new T(context, null));
            com.pgl.ssdk.ces.c.g().a();
            C1141v.a();
        }
    }

    public static synchronized Object a(byte[] bArr) {
        synchronized (S.class) {
            if (bArr == null) {
                return null;
            }
            return com.pgl.ssdk.ces.a.meta(302, d, bArr);
        }
    }

    public static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("version", "6.1.0.0.overseas-rc.2");
            String str = c;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", c);
            } else {
                try {
                    jSONObject.put("token_id", b());
                } catch (Throwable unused) {
                    jSONObject.put("token_id", "");
                }
            }
            jSONObject.put("code", a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused2) {
            return "";
        }
    }
}
