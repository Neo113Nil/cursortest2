package com.anythink.core.common.v;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import java.lang.reflect.Method;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16898a = "anythink_platform_check";

    /* renamed from: b, reason: collision with root package name */
    private static volatile e f16899b = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f16900d = -1;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f16901c = new JSONObject();

    private e() {
    }

    public static e a() {
        if (f16899b == null) {
            synchronized (e.class) {
                try {
                    if (f16899b == null) {
                        f16899b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16899b;
    }

    public final void a(final JSONArray jSONArray) {
        com.anythink.core.common.d.t.b().b(new Runnable() { // from class: com.anythink.core.common.v.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JSONArray jSONArray2 = jSONArray;
                    if (jSONArray2 == null || jSONArray2.length() <= 0) {
                        return;
                    }
                    if (e.f16900d == -1 || e.f16900d != jSONArray.length()) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                            if (jSONObject != null) {
                                String optString = jSONObject.optString(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_NAME);
                                String optString2 = jSONObject.optString("network_class");
                                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                                    e.a(e.this, optString, optString2);
                                }
                            }
                        }
                        if (e.this.f16901c.length() > 0) {
                            Objects.toString(e.this.f16901c);
                            com.anythink.core.common.u.e.a(e.this.f16901c.toString());
                            int unused = e.f16900d = jSONArray.length();
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, String str2) {
        char c4;
        try {
            try {
                Class.forName(str2);
                this.f16901c.put(str, "");
            } catch (Throwable unused) {
                return;
            }
        } catch (ClassNotFoundException unused2) {
        }
        int hashCode = str.hashCode();
        if (hashCode == 102037) {
            if (str.equals("g_m")) {
                c4 = 1;
                if (c4 != 0) {
                }
            }
            c4 = 65535;
            if (c4 != 0) {
            }
        } else if (hashCode != 114519) {
            if (hashCode == 114533 && str.equals("t_p")) {
                c4 = 2;
                if (c4 != 0) {
                    Class<?> cls = Class.forName(str2);
                    Method method = cls.getMethod("getVersion", new Class[0]);
                    method.setAccessible(true);
                    String str3 = (String) method.invoke(cls, new Object[0]);
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    this.f16901c.put(str, str3);
                    return;
                }
                if (c4 != 1) {
                    if (c4 != 2) {
                        return;
                    }
                    Class<?> cls2 = Class.forName(str2);
                    Method method2 = cls2.getMethod("getSdkVersion", new Class[0]);
                    method2.setAccessible(true);
                    String str4 = (String) method2.invoke(cls2, new Object[0]);
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    this.f16901c.put(str, str4);
                    return;
                }
                Class<?> cls3 = Class.forName(str2);
                Method method3 = cls3.getMethod("getAdManager", new Class[0]);
                method3.setAccessible(true);
                Object invoke = method3.invoke(cls3, new Object[0]);
                if (invoke != null) {
                    Method method4 = invoke.getClass().getMethod("getSDKVersion", new Class[0]);
                    method4.setAccessible(true);
                    String str5 = (String) method4.invoke(invoke, new Object[0]);
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    }
                    this.f16901c.put(str, str5);
                    return;
                }
                return;
            }
            c4 = 65535;
            if (c4 != 0) {
            }
        } else {
            if (str.equals("t_b")) {
                c4 = 0;
                if (c4 != 0) {
                }
            }
            c4 = 65535;
            if (c4 != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(e eVar, String str, String str2) {
        char c4;
        try {
            try {
                Class.forName(str2);
                eVar.f16901c.put(str, "");
            } catch (Throwable unused) {
                return;
            }
        } catch (ClassNotFoundException unused2) {
        }
        int hashCode = str.hashCode();
        if (hashCode == 102037) {
            if (str.equals("g_m")) {
                c4 = 1;
                if (c4 != 0) {
                }
            }
            c4 = 65535;
            if (c4 != 0) {
            }
        } else if (hashCode != 114519) {
            if (hashCode == 114533 && str.equals("t_p")) {
                c4 = 2;
                if (c4 != 0) {
                    Class<?> cls = Class.forName(str2);
                    Method method = cls.getMethod("getVersion", new Class[0]);
                    method.setAccessible(true);
                    String str3 = (String) method.invoke(cls, new Object[0]);
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    eVar.f16901c.put(str, str3);
                    return;
                }
                if (c4 != 1) {
                    if (c4 != 2) {
                        return;
                    }
                    Class<?> cls2 = Class.forName(str2);
                    Method method2 = cls2.getMethod("getSdkVersion", new Class[0]);
                    method2.setAccessible(true);
                    String str4 = (String) method2.invoke(cls2, new Object[0]);
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    eVar.f16901c.put(str, str4);
                    return;
                }
                Class<?> cls3 = Class.forName(str2);
                Method method3 = cls3.getMethod("getAdManager", new Class[0]);
                method3.setAccessible(true);
                Object invoke = method3.invoke(cls3, new Object[0]);
                if (invoke != null) {
                    Method method4 = invoke.getClass().getMethod("getSDKVersion", new Class[0]);
                    method4.setAccessible(true);
                    String str5 = (String) method4.invoke(invoke, new Object[0]);
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    }
                    eVar.f16901c.put(str, str5);
                    return;
                }
                return;
            }
            c4 = 65535;
            if (c4 != 0) {
            }
        } else {
            if (str.equals("t_b")) {
                c4 = 0;
                if (c4 != 0) {
                }
            }
            c4 = 65535;
            if (c4 != 0) {
            }
        }
    }
}
