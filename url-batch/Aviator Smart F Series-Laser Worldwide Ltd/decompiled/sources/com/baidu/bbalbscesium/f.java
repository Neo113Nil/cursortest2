package com.baidu.bbalbscesium;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: e, reason: collision with root package name */
    private static final String f3877e = "CuidV266Info";

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f3878f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3879g = "libcuid.so";

    /* renamed from: h, reason: collision with root package name */
    private static final String f3880h = "ZGV2aWNlaWQ=";

    /* renamed from: i, reason: collision with root package name */
    private static final String f3881i = "aW1laQ==";

    /* renamed from: j, reason: collision with root package name */
    private static final String f3882j = "dmVy";

    /* renamed from: k, reason: collision with root package name */
    private static final int f3883k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3884l = "0";

    /* renamed from: m, reason: collision with root package name */
    public static final String f3885m = "O";

    /* renamed from: n, reason: collision with root package name */
    private static final int f3886n = 14;

    /* renamed from: a, reason: collision with root package name */
    public String f3887a;

    /* renamed from: b, reason: collision with root package name */
    public String f3888b;

    /* renamed from: c, reason: collision with root package name */
    public int f3889c = 2;

    /* renamed from: d, reason: collision with root package name */
    private int f3890d = 0;

    public static f a(String str) {
        return b(c(str));
    }

    private static f b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            String str2 = "0";
            String str3 = "0";
            while (keys.hasNext()) {
                String next = keys.next();
                if (!e(f3880h).equals(next) && !e(f3882j).equals(next)) {
                    str3 = jSONObject.optString(next, "0");
                }
            }
            String string = jSONObject.getString(e(f3880h));
            int i8 = jSONObject.getInt(e(f3882j));
            int length = TextUtils.isEmpty(str3) ? 0 : str3.length();
            if (!TextUtils.isEmpty(string)) {
                f fVar = new f();
                fVar.f3887a = string;
                fVar.f3889c = i8;
                fVar.f3890d = length;
                if (length < 14) {
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                    fVar.f3888b = str2;
                }
                fVar.a();
                return fVar;
            }
        } catch (JSONException e8) {
            com.baidu.bbalbscesium.o.c.a(e8);
        }
        return null;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] a8 = com.baidu.bbalbscesium.k.a.g.a();
            return new String(com.baidu.bbalbscesium.k.a.c.a(a8, a8, com.baidu.bbalbscesium.m.b.a(str.getBytes())));
        } catch (Exception e8) {
            com.baidu.bbalbscesium.o.c.a(e8);
            return "";
        }
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] a8 = com.baidu.bbalbscesium.k.a.g.a();
            return com.baidu.bbalbscesium.m.b.a(com.baidu.bbalbscesium.k.a.c.b(a8, a8, str.getBytes()), "utf-8");
        } catch (UnsupportedEncodingException | Exception e8) {
            com.baidu.bbalbscesium.o.c.a(e8);
            return "";
        }
    }

    private String f() {
        try {
            return new JSONObject().put(e(f3880h), this.f3887a).put(e(f3881i), this.f3888b).put(e(f3882j), this.f3889c).toString();
        } catch (JSONException e8) {
            com.baidu.bbalbscesium.o.c.a(e8);
            return null;
        }
    }

    public String e() {
        return d(f());
    }

    public static f a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        fVar.f3887a = str;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        fVar.f3890d = length;
        if (length < 14) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "0";
            }
            fVar.f3888b = str2;
        }
        return fVar;
    }

    private static String e(String str) {
        return new String(com.baidu.bbalbscesium.m.b.a(str.getBytes()));
    }

    public static boolean f(String str) {
        return TextUtils.isEmpty(str);
    }

    public String b() {
        String str = this.f3888b;
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return this.f3887a + b5.b.VERTICAL + str;
    }

    boolean c() {
        return a(this.f3890d);
    }

    boolean d() {
        return f(this.f3888b);
    }

    boolean a() {
        String str;
        if (c()) {
            str = "O";
        } else {
            if (!d()) {
                return false;
            }
            str = "0";
        }
        this.f3888b = str;
        return true;
    }

    public static boolean a(int i8) {
        return i8 >= 14;
    }
}
