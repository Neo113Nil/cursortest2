package com.ijinshan.cloudconfig.deepcloudconfig;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CloudConfigExtra.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile HashMap<String, JSONObject> f6695a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6696b = false;

    /* renamed from: c, reason: collision with root package name */
    private static List<String> f6697c = new ArrayList();

    public static String a(Integer num, String str, String str2, String str3) {
        JSONObject a2 = a(num, str);
        if (a2 == null) {
            return str3;
        }
        try {
            return a2.optString(str2, str3);
        } catch (Exception unused) {
            return str3;
        }
    }

    public static int a(Integer num, String str, String str2, int i) {
        JSONObject a2 = a(num, str);
        if (a2 == null) {
            return i;
        }
        try {
            return a2.optInt(str2, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long a(Integer num, String str, String str2, long j) {
        JSONObject a2 = a(num, str);
        if (a2 == null) {
            return j;
        }
        try {
            return a2.optLong(str2, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public static boolean a(Integer num, String str, String str2, boolean z) {
        JSONObject a2 = a(num, str);
        if (a2 == null) {
            return z;
        }
        try {
            return a2.optBoolean(str2, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public static double a(Integer num, String str, String str2, double d2) {
        JSONObject a2 = a(num, str);
        if (a2 == null) {
            return d2;
        }
        try {
            return a2.optDouble(str2, d2);
        } catch (Exception unused) {
            return d2;
        }
    }

    private static synchronized JSONObject a(Integer num, String str) {
        synchronized (b.class) {
            String str2 = num + "," + str;
            JSONObject jSONObject = f6695a.get(str2);
            if (jSONObject == null || f6696b) {
                String b2 = a.a().b(num, str);
                if (TextUtils.isEmpty(b2)) {
                    if (jSONObject != null) {
                        f6697c.add(str2);
                    }
                    return null;
                }
                try {
                    jSONObject = new JSONObject(b2);
                    f6695a.put(str2, jSONObject);
                } catch (JSONException unused) {
                    return null;
                }
            }
            return jSONObject;
        }
    }

    public static void a() {
        Set<String> keySet;
        f6697c.clear();
        if (f6695a.size() > 0 && (keySet = f6695a.keySet()) != null && keySet.size() > 0) {
            Iterator<String> it = keySet.iterator();
            f6696b = true;
            while (it.hasNext()) {
                try {
                    String[] split = it.next().split(",");
                    if (split != null && split.length == 2) {
                        a(Integer.valueOf(Integer.parseInt(split[0])), split[1]);
                    } else if (split != null && split.length == 1) {
                        a(Integer.valueOf(Integer.parseInt(split[0])), "");
                    }
                } catch (Exception unused) {
                }
            }
        }
        f6696b = false;
        if (f6697c.size() > 0) {
            Iterator<String> it2 = f6697c.iterator();
            while (it2.hasNext()) {
                try {
                    f6695a.remove(it2.next());
                } catch (Exception unused2) {
                }
            }
        }
    }
}
