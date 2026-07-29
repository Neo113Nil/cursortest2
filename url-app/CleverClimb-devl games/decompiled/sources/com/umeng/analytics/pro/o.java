package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.c;
import com.umeng.analytics.pro.g;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: SessionTracker.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8949a = "session_start_time";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8950b = "session_end_time";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8951c = "session_id";
    private static String f;
    private static Context g;

    /* renamed from: d, reason: collision with root package name */
    private final String f8952d;
    private final String e;

    private o() {
        this.f8952d = "a_start_time";
        this.e = "a_end_time";
    }

    /* compiled from: SessionTracker.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final o f8953a = new o();

        private a() {
        }
    }

    public static o a() {
        return a.f8953a;
    }

    public boolean a(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        String string = sharedPreferences.getString("session_id", null);
        if (string == null) {
            return false;
        }
        long j = sharedPreferences.getLong(f8949a, 0L);
        long j2 = sharedPreferences.getLong(f8950b, 0L);
        if (j2 != 0) {
            int i = (Math.abs(j2 - j) > 86400000L ? 1 : (Math.abs(j2 - j) == 86400000L ? 0 : -1));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", string);
            jSONObject.put("__e", j);
            jSONObject.put(c.e.a.g, j2);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(b.x, location[0]);
                jSONObject2.put(b.y, location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(c.e.a.e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Method method = cls.getMethod("getUidRxBytes", Integer.TYPE);
            Method method2 = cls.getMethod("getUidTxBytes", Integer.TYPE);
            int i2 = context.getApplicationInfo().uid;
            if (i2 == -1) {
                return false;
            }
            long longValue = ((Long) method.invoke(null, Integer.valueOf(i2))).longValue();
            long longValue2 = ((Long) method2.invoke(null, Integer.valueOf(i2))).longValue();
            if (longValue > 0 && longValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(b.C, longValue);
                jSONObject3.put(b.B, longValue2);
                jSONObject.put(c.e.a.f8893d, jSONObject3);
            }
            g.a(context).a(string, jSONObject, g.a.NEWSESSION);
            p.a(g);
            h.a(g);
            try {
                a(sharedPreferences);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    private void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(f8949a);
        edit.remove(f8950b);
        edit.remove("a_start_time");
        edit.remove("a_end_time");
        edit.commit();
    }

    public String b(Context context) {
        String deviceId = DeviceConfig.getDeviceId(context);
        String appkey = UMUtils.getAppkey(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (appkey == null) {
            throw new RuntimeException("Appkey is null or empty, Please check!");
        }
        f = UMUtils.MD5(currentTimeMillis + appkey + deviceId);
        return f;
    }

    public void a(Context context, Object obj) {
        try {
            if (g == null && context != null) {
                g = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(g);
            if (sharedPreferences == null) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String string = sharedPreferences.getString(b.al, "");
            String appVersionName = UMUtils.getAppVersionName(g);
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                int i = sharedPreferences.getInt("versioncode", 0);
                String string2 = sharedPreferences.getString("pre_date", "");
                String string3 = sharedPreferences.getString("pre_version", "");
                String string4 = sharedPreferences.getString(b.al, "");
                edit.putString("vers_date", string2);
                edit.putString("vers_pre_version", string3);
                edit.putString("cur_version", string4);
                edit.putString("dp_vers_date", string2);
                edit.putString("dp_vers_pre_version", string3);
                edit.putString("dp_cur_version", string4);
                edit.putInt("vers_code", i);
                edit.putString("vers_name", string);
                edit.putInt("dp_vers_code", i);
                edit.putString("dp_vers_name", string);
                edit.putLong("a_end_time", 0L);
                edit.commit();
                if (c(context) == null) {
                    f = a(context, sharedPreferences, longValue);
                }
                a(g, longValue);
                b(g, longValue);
                return;
            }
            if (a(sharedPreferences, longValue)) {
                f = a(context, sharedPreferences, longValue);
                MLog.i("Start new session: " + f);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "Start new session: " + f);
                return;
            }
            f = sharedPreferences.getString("session_id", null);
            edit.putLong("a_start_time", longValue);
            edit.putLong("a_end_time", 0L);
            edit.commit();
            MLog.i("Extend current session: " + f);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "Extend current session: " + f);
            d(context);
            i.a(g).a(false);
            i.a(g).d();
        } catch (Throwable unused) {
        }
    }

    public void b(Context context, Object obj) {
        try {
            if (g == null && context != null) {
                g = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong("a_start_time", 0L) == 0 && AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
                MLog.e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("a_end_time", longValue);
            edit.putLong(f8950b, longValue);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    public boolean b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(g);
        if (sharedPreferences == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("a_start_time", 0L);
        return (j == 0 || currentTimeMillis - j >= AnalyticsConfig.kContinueSessionMillis) && currentTimeMillis - sharedPreferences.getLong("a_end_time", 0L) > AnalyticsConfig.kContinueSessionMillis;
    }

    private boolean a(SharedPreferences sharedPreferences, long j) {
        Iterator<String> keys;
        long j2 = sharedPreferences.getLong("a_start_time", 0L);
        long j3 = sharedPreferences.getLong("a_end_time", 0L);
        if (j2 != 0 && j - j2 < AnalyticsConfig.kContinueSessionMillis) {
            MLog.i("onResume called before onPause");
            return false;
        }
        if (j - j3 <= AnalyticsConfig.kContinueSessionMillis) {
            return false;
        }
        try {
            String string = sharedPreferences.getString("session_id", "-1");
            long j4 = sharedPreferences.getLong(f8950b, 0L);
            if ("-1".equals(string)) {
                return true;
            }
            if (j4 == 0) {
                j4 = System.currentTimeMillis();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.e.a.g, j4);
            g.a(g).a(string, jSONObject, g.a.END);
            if (!AnalyticsConfig.FLAG_DPLUS) {
                return true;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject j5 = com.umeng.analytics.b.a().j();
            if (j5.length() > 0) {
                jSONObject2.put(b.ab, j5);
            }
            jSONObject2.put(b.af, string);
            jSONObject2.put("__ii", string);
            jSONObject2.put(b.ag, j4);
            JSONObject h = com.umeng.analytics.b.a().h(g);
            if (h != null && h.length() > 0 && (keys = h.keys()) != null) {
                while (keys.hasNext()) {
                    try {
                        String obj = keys.next().toString();
                        if (!Arrays.asList(b.au).contains(obj)) {
                            jSONObject2.put(obj, h.get(obj));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            i.a(g).a(jSONObject2, 3, false);
            return true;
        } catch (Throwable unused2) {
            return true;
        }
    }

    private String a(Context context, SharedPreferences sharedPreferences, long j) {
        if (g == null && context != null) {
            g = context.getApplicationContext();
        }
        String b2 = b(g);
        try {
            d(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j);
            g.a(g).a(b2, jSONObject, g.a.BEGIN);
            a(g);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("session_id", b2);
            edit.putLong(f8949a, j);
            edit.putLong(f8950b, 0L);
            edit.putLong("a_start_time", j);
            edit.putLong("a_end_time", 0L);
            edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
            edit.putString(b.al, UMUtils.getAppVersionName(context));
            edit.commit();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject j2 = com.umeng.analytics.b.a().j();
            if (j2.length() > 0) {
                jSONObject2.put(b.ab, j2);
            }
            jSONObject2.put(b.ad, b2);
            jSONObject2.put("__ii", b2);
            jSONObject2.put(b.ae, j);
            i.a(g).c((Object) jSONObject2);
        } catch (Throwable unused) {
        }
        return b2;
    }

    private void d(Context context) {
        i.a(context).b(context);
        i.a(context).a();
    }

    public boolean a(Context context, long j) {
        String string;
        Iterator<String> keys;
        boolean z = true;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null || (string = sharedPreferences.getString("session_id", null)) == null) {
                return false;
            }
            long j2 = sharedPreferences.getLong("a_start_time", 0L);
            long j3 = sharedPreferences.getLong("a_end_time", 0L);
            if (j2 <= 0 || j3 != 0) {
                z = false;
            } else {
                try {
                    b(g, Long.valueOf(j));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(c.e.a.g, j);
                        g.a(context).a(string, jSONObject, g.a.END);
                        i.a(g).b();
                        if (AnalyticsConfig.FLAG_DPLUS) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject b2 = com.umeng.analytics.b.a().b();
                            if (b2 == null || b2.length() < 1) {
                                b2 = com.umeng.analytics.b.a().j();
                            }
                            if (b2.length() > 0) {
                                jSONObject2.put(b.ab, b2);
                            }
                            jSONObject2.put(b.af, string);
                            jSONObject2.put("__ii", string);
                            jSONObject2.put(b.ag, j);
                            JSONObject h = com.umeng.analytics.b.a().h(g);
                            if (h != null && h.length() > 0 && (keys = h.keys()) != null) {
                                while (keys.hasNext()) {
                                    try {
                                        String obj = keys.next().toString();
                                        if (!Arrays.asList(b.au).contains(obj)) {
                                            jSONObject2.put(obj, h.get(obj));
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            i.a(g).a(jSONObject2, 3, true);
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    return z;
                }
            }
            a(context);
            return z;
        } catch (Throwable unused4) {
            return false;
        }
    }

    public void b(Context context, long j) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        if (sharedPreferences == null) {
            return;
        }
        f = b(context);
        try {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("session_id", f);
            edit.putLong(f8949a, j);
            edit.putLong(f8950b, 0L);
            edit.putLong("a_start_time", j);
            edit.putLong("a_end_time", 0L);
            edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(g)));
            edit.putString(b.al, UMUtils.getAppVersionName(g));
            edit.commit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j);
            g.a(g).a(f, jSONObject, g.a.BEGIN);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject j2 = com.umeng.analytics.b.a().j();
            if (j2.length() > 0) {
                jSONObject2.put(b.ab, j2);
            }
            jSONObject2.put(b.ad, f);
            jSONObject2.put("__ii", f);
            jSONObject2.put(b.ae, j);
            i.a(g).b((Object) jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public String c() {
        return f;
    }

    public String c(Context context) {
        try {
            if (f == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f;
    }

    public String d() {
        return c(g);
    }
}
