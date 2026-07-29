package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.g;
import com.umeng.analytics.pro.h;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.j;
import com.umeng.analytics.pro.m;
import com.umeng.analytics.pro.n;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.p;
import com.umeng.analytics.pro.r;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InternalAgent.java */
/* loaded from: classes2.dex */
public class b implements n {
    private static final String g = "sp";
    private static final String h = "prepp";
    private static final int n = 128;
    private static final int o = 256;
    private static String p = "";
    private static String q = "";

    /* renamed from: a, reason: collision with root package name */
    private Context f8829a;

    /* renamed from: b, reason: collision with root package name */
    private r f8830b;

    /* renamed from: c, reason: collision with root package name */
    private j f8831c;

    /* renamed from: d, reason: collision with root package name */
    private p f8832d;
    private o e;
    private h f;
    private boolean i;
    private volatile JSONObject j;
    private volatile JSONObject k;
    private volatile JSONObject l;
    private boolean m;

    private b() {
        this.f8829a = null;
        this.f8831c = new j();
        this.f8832d = new p();
        this.e = o.a();
        this.f = null;
        this.i = false;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = false;
        this.f8831c.a(this);
    }

    /* compiled from: InternalAgent.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f8833a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f8833a;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (this.f8829a == null) {
                this.f8829a = context.getApplicationContext();
            }
            if (!this.i) {
                this.i = true;
                i(this.f8829a);
            }
            if (Build.VERSION.SDK_INT > 13) {
                synchronized (this) {
                    if (!this.m) {
                        this.f = new h(context);
                        if (this.f.a()) {
                            this.m = true;
                        }
                    }
                }
            } else {
                this.m = true;
            }
            if (UMConfigure.isDebugLog()) {
                UMConfigure.umDebugLog.mutlInfo("A_10090", 3, "", null, null);
            }
            try {
                try {
                    Class<?> cls = Class.forName("com.umeng.commonsdk.statistics.SdkVersion");
                    if (cls != null) {
                        Field field = cls.getField("SDK_VERSION");
                        if (field != null) {
                            String obj = field.get(cls).toString();
                            if (TextUtils.isEmpty(obj)) {
                                MLog.e("请注意匹配正确版本的common组件基础库，详见链接 https://developer.umeng.com/docs/66632/detail/70018?um_channel=sdk");
                            } else if (!Arrays.asList(AnalyticsConfig.UM_COMMON_VERSION_LIMIT).contains(obj)) {
                                MLog.e("您当前集成的common组件基础库的版本是" + obj + "，请注意匹配正确版本的common组件基础库，详见链接 https://developer.umeng.com/docs/66632/detail/70018?um_channel=sdk");
                            }
                        } else {
                            MLog.e("请注意匹配正确版本的common组件基础库，详见链接 https://developer.umeng.com/docs/66632/detail/70018?um_channel=sdk");
                        }
                    } else {
                        MLog.e("请注意匹配正确版本的common组件基础库，详见链接 https://developer.umeng.com/docs/66632/detail/70018?um_channel=sdk");
                    }
                } catch (Exception unused) {
                    MLog.e("请注意匹配正确版本的common组件基础库，详见链接 https://developer.umeng.com/docs/66632/detail/70018?um_channel=sdk");
                }
            } catch (Throwable unused2) {
            }
            if (Build.VERSION.SDK_INT > 13) {
                UMWorkDispatch.sendEvent(this.f8829a, i.a.t, CoreProtocol.getInstance(this.f8829a), Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused3) {
        }
    }

    private void i(Context context) {
        try {
            if (context == null) {
                MLog.e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (this.f8829a == null) {
                this.f8829a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString(g, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.j = new JSONObject(string);
                    this.k = new JSONObject(string);
                    if (this.j == null) {
                        this.j = new JSONObject();
                    }
                    if (this.k == null) {
                        this.k = new JSONObject();
                    }
                } catch (JSONException unused) {
                }
            }
            String string2 = sharedPreferences.getString(h, null);
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            this.l = new JSONObject(string2);
            if (this.l == null) {
                this.l = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    public JSONObject b() {
        return this.k;
    }

    public void c() {
        this.k = null;
    }

    void a(String str) {
        if (!AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            try {
                this.f8832d.a(str);
            } catch (Throwable unused) {
            }
        }
        if (UMConfigure.isDebugLog() && AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            UMConfigure.umDebugLog.aq("A_10102", 2, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    void b(String str) {
        if (!AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            try {
                this.f8832d.b(str);
            } catch (Throwable unused) {
            }
        }
        if (UMConfigure.isDebugLog() && AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            UMConfigure.umDebugLog.aq("A_10103", 2, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    public void a(r rVar) {
        this.f8830b = rVar;
    }

    public void a(Context context, int i) {
        if (context == null) {
            MLog.e("unexpected null context in setVerticalType");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        AnalyticsConfig.a(this.f8829a, i);
    }

    public String d() {
        return p;
    }

    public String e() {
        return q;
    }

    void b(Context context) {
        if (context == null) {
            MLog.e("unexpected null context in onResume");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMConfigure.umDebugLog.aq("A_10031", 2, "\\|");
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        try {
            if (!this.i || !this.m) {
                a(context);
            }
            if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
                this.f8832d.a(context.getClass().getName());
            }
            f();
            j(this.f8829a);
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                p = context.getClass().getName();
            }
        } catch (Throwable th) {
            MLog.e("Exception occurred in Mobclick.onResume(). ", th);
        }
    }

    private void j(Context context) {
        try {
            Class.forName("com.umeng.visual.UMVisualAgent");
        } catch (ClassNotFoundException unused) {
            if (Build.VERSION.SDK_INT > 13) {
                UMWorkDispatch.sendEvent(context, i.a.p, CoreProtocol.getInstance(context), Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    void c(Context context) {
        if (context == null) {
            UMConfigure.umDebugLog.aq("A_10032", 0, "\\|");
            MLog.e("unexpected null context in onPause");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMConfigure.umDebugLog.aq("A_10033", 2, "\\|");
        }
        try {
            if (!this.i || !this.m) {
                a(context);
            }
            if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
                this.f8832d.b(context.getClass().getName());
            }
            g();
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e("Exception occurred in Mobclick.onRause(). ", th);
            }
        }
        if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
            q = context.getClass().getName();
        }
    }

    public void a(Context context, String str, HashMap<String, Object> hashMap) {
        if (context != null) {
            try {
                if (this.f8829a == null) {
                    this.f8829a = context.getApplicationContext();
                }
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.e(th);
                    return;
                }
                return;
            }
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        m.a(this.f8829a).a(str, hashMap);
    }

    void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMConfigure.umDebugLog.aq("A_10061", 0, "\\|");
                return;
            }
            return;
        }
        if (context == null) {
            MLog.e("unexpected null context in reportError");
            UMConfigure.umDebugLog.aq("A_10060", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        try {
            if (!this.i || !this.m) {
                a(this.f8829a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(com.umeng.analytics.pro.b.L, 2);
            jSONObject.put(com.umeng.analytics.pro.b.M, str);
            jSONObject.put("__ii", this.e.d());
            UMWorkDispatch.sendEvent(this.f8829a, i.a.j, CoreProtocol.getInstance(this.f8829a), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    void a(Context context, Throwable th) {
        if (context == null || th == null) {
            UMConfigure.umDebugLog.aq("A_10062", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        try {
            if (!this.i || !this.m) {
                a(this.f8829a);
            }
            a(this.f8829a, DataHelper.convertExceptionToString(th));
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.e(e);
            }
        }
    }

    public void f() {
        try {
            if (this.f8829a != null) {
                UMWorkDispatch.sendEvent(this.f8829a, i.a.g, CoreProtocol.getInstance(this.f8829a), Long.valueOf(System.currentTimeMillis()));
            }
            if (this.f8830b != null) {
                this.f8830b.a();
            }
        } catch (Throwable unused) {
        }
    }

    public void g() {
        try {
            if (this.f8829a != null) {
                UMWorkDispatch.sendEvent(this.f8829a, i.a.h, CoreProtocol.getInstance(this.f8829a), Long.valueOf(System.currentTimeMillis()));
                UMWorkDispatch.sendEvent(this.f8829a, i.a.f8927d, CoreProtocol.getInstance(this.f8829a), null);
                UMWorkDispatch.sendEvent(this.f8829a, 4099, CoreProtocol.getInstance(this.f8829a), null);
                UMWorkDispatch.sendEvent(this.f8829a, i.a.i, CoreProtocol.getInstance(this.f8829a), null);
            }
        } catch (Throwable unused) {
        }
        if (this.f8830b != null) {
            this.f8830b.b();
        }
    }

    public void a(Context context, String str, String str2, long j, int i) {
        if (context != null) {
            try {
                if (this.f8829a == null) {
                    this.f8829a = context.getApplicationContext();
                }
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.e(th);
                    return;
                }
                return;
            }
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        m.a(this.f8829a).a(str, str2, j, i);
    }

    public void b(Context context, String str) {
        try {
            if (context == null) {
                UMConfigure.umDebugLog.aq("A_10120", 0, "\\|");
                return;
            }
            if (this.f8829a == null) {
                this.f8829a = context.getApplicationContext();
            }
            if (!this.i || !this.m) {
                a(this.f8829a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(com.umeng.analytics.pro.b.aq, str);
                b(this.f8829a, com.umeng.analytics.pro.b.ap, hashMap, -1L);
            } else {
                UMConfigure.umDebugLog.aq("A_10121", 0, "\\|");
                if (MLog.DEBUG) {
                    MLog.e("please check your link!");
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    private void b(Context context, String str, Map<String, Object> map, long j) {
        if (context == null) {
            return;
        }
        try {
            if (this.f8829a == null) {
                this.f8829a = context.getApplicationContext();
            }
            if (!this.i || !this.m) {
                a(this.f8829a);
            }
            m.a(this.f8829a).a(str, map, j);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    void a(Context context, String str, Map<String, Object> map, long j) {
        try {
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (Arrays.asList(com.umeng.analytics.pro.b.ar).contains(str)) {
                MLog.e("Event id uses reserved keywords, please use other event name. ");
                UMConfigure.umDebugLog.aq("A_10001", 0, "\\|");
                return;
            }
            if (map.isEmpty()) {
                MLog.e("Map is empty, please check.");
                UMConfigure.umDebugLog.aq("A_10003", 0, "\\|");
                return;
            }
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (Arrays.asList(com.umeng.analytics.pro.b.ar).contains(it.next().getKey())) {
                    MLog.e("Map key uses reserved keywords[_$!link], please use other key.");
                    UMConfigure.umDebugLog.aq("A_10004", 0, "\\|");
                    return;
                }
            }
            b(context, str, map, j);
            return;
        }
        MLog.e("Event id is empty, please check.");
        UMConfigure.umDebugLog.aq("A_10002", 0, "\\|");
    }

    public void a(Context context, String str, Map<String, Object> map) {
        if (context != null) {
            try {
                if (this.f8829a == null) {
                    this.f8829a = context.getApplicationContext();
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        if (TextUtils.isEmpty(str)) {
            MLog.e("the eventName is empty! please check~");
            UMConfigure.umDebugLog.aq("A_15012", 0, "\\|");
            return;
        }
        String str2 = "";
        if (this.j == null) {
            this.j = new JSONObject();
        } else {
            str2 = this.j.toString();
        }
        UMWorkDispatch.sendEvent(this.f8829a, 8194, CoreProtocol.getInstance(this.f8829a), new i.d(str, map, str2, System.currentTimeMillis()));
    }

    void d(Context context) {
        try {
            if (this.f8829a == null && context != null) {
                this.f8829a = context.getApplicationContext();
            }
            if (this.f != null) {
                this.f.c();
            }
            if (this.f8832d != null) {
                this.f8832d.a();
            }
            if (this.f8829a != null) {
                if (this.e != null) {
                    this.e.b(this.f8829a, Long.valueOf(System.currentTimeMillis()));
                }
                i.a(this.f8829a).a();
                p.a(this.f8829a);
                h.a(this.f8829a);
                PreferenceWrapper.getDefault(this.f8829a).edit().commit();
            }
            UMWorkDispatch.Quit();
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.n
    public void a(Throwable th) {
        try {
            if (this.f8832d != null) {
                this.f8832d.a();
            }
            if (this.f != null) {
                this.f.c();
            }
            if (this.f8829a != null) {
                if (this.e != null) {
                    this.e.b(this.f8829a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(com.umeng.analytics.pro.b.L, 1);
                    jSONObject.put(com.umeng.analytics.pro.b.M, DataHelper.convertExceptionToString(th));
                    g.a(this.f8829a).a(this.e.d(), jSONObject.toString(), 1);
                }
                i.a(this.f8829a).a();
                p.a(this.f8829a);
                h.a(this.f8829a);
                PreferenceWrapper.getDefault(this.f8829a).edit().commit();
            }
            UMWorkDispatch.Quit();
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.e("Exception in onAppCrash", e);
            }
        }
    }

    void a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.analytics.pro.b.H, str);
            jSONObject.put("uid", str2);
            UMWorkDispatch.sendEvent(this.f8829a, i.a.e, CoreProtocol.getInstance(this.f8829a), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    void h() {
        UMWorkDispatch.sendEvent(this.f8829a, i.a.f, CoreProtocol.getInstance(this.f8829a), null);
    }

    void a(boolean z) {
        AnalyticsConfig.CATCH_EXCEPTION = z;
    }

    void a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    void b(boolean z) {
        AnalyticsConfig.ACTIVITY_DURATION_OPEN = z;
    }

    void a(double d2, double d3) {
        if (AnalyticsConfig.f8815a == null) {
            AnalyticsConfig.f8815a = new double[2];
        }
        AnalyticsConfig.f8815a[0] = d2;
        AnalyticsConfig.f8815a[1] = d3;
    }

    void a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.e("unexpected null context in setScenarioType");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (eScenarioType != null) {
            int value = eScenarioType.toValue();
            if (value == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue()) {
                AnalyticsConfig.FLAG_DPLUS = true;
            } else if (value == MobclickAgent.EScenarioType.E_DUM_GAME.toValue()) {
                AnalyticsConfig.FLAG_DPLUS = true;
            } else {
                AnalyticsConfig.FLAG_DPLUS = false;
            }
            a(this.f8829a, value);
        }
        if (this.i && this.m) {
            return;
        }
        a(this.f8829a);
    }

    void c(Context context, String str) {
        if (context == null) {
            MLog.e("unexpected null context in setSecret");
            UMConfigure.umDebugLog.aq("A_10070", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        AnalyticsConfig.a(this.f8829a, str);
    }

    void a(long j) {
        AnalyticsConfig.kContinueSessionMillis = j;
    }

    public synchronized void a(Context context, String str, Object obj) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            MLog.e("unexpected null context in registerSuperProperty");
            UMConfigure.umDebugLog.aq("A_15014", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            String subStr = HelperUtils.subStr(str, 128);
            if (!Arrays.asList(com.umeng.analytics.pro.b.at).contains(subStr)) {
                if (obj instanceof String) {
                    obj = HelperUtils.subStr(obj.toString(), 256);
                }
                a(subStr, obj);
                UMWorkDispatch.sendEvent(this.f8829a, i.a.m, CoreProtocol.getInstance(this.f8829a), this.j.toString());
            } else {
                MLog.e("SuperProperty  key is invalid.  ");
            }
            return;
        }
        MLog.e("please check key or value, must not NULL!");
        UMConfigure.umDebugLog.aq("A_15015", 0, "\\|");
    }

    private void a(String str, Object obj) {
        try {
            if (this.j == null) {
                this.j = new JSONObject();
            }
            new JSONObject();
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    JSONArray jSONArray = new JSONArray();
                    while (i < strArr.length) {
                        jSONArray.put(strArr[i]);
                        i++;
                    }
                    this.j.put(str, jSONArray);
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i < jArr.length) {
                        jSONArray2.put(jArr[i]);
                        i++;
                    }
                    this.j.put(str, jSONArray2);
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i < iArr.length) {
                        jSONArray3.put(iArr[i]);
                        i++;
                    }
                    this.j.put(str, jSONArray3);
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i < fArr.length) {
                        jSONArray4.put(fArr[i]);
                        i++;
                    }
                    this.j.put(str, jSONArray4);
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i < dArr.length) {
                        jSONArray5.put(dArr[i]);
                        i++;
                    }
                    this.j.put(str, jSONArray5);
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i < sArr.length) {
                        jSONArray6.put((int) sArr[i]);
                        i++;
                    }
                    this.j.put(str, jSONArray6);
                    return;
                }
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i));
                    }
                    i++;
                }
                this.j.put(str, jSONArray7);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.j.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void a(Object obj) {
        if (obj != null) {
            try {
                if (this.f8829a != null) {
                    String str = (String) obj;
                    SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8829a).edit();
                    if (edit != null && !TextUtils.isEmpty(str)) {
                        edit.putString(g, this.j.toString()).commit();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            MLog.e("unexpected null context in unregisterSuperProperty");
            UMConfigure.umDebugLog.aq("A_15016", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        String subStr = HelperUtils.subStr(str, 128);
        if (this.j == null) {
            this.j = new JSONObject();
        }
        if (this.j.has(subStr)) {
            this.j.remove(subStr);
            UMWorkDispatch.sendEvent(this.f8829a, i.a.o, CoreProtocol.getInstance(this.f8829a), subStr);
        }
    }

    public synchronized void i() {
        try {
            if (this.j != null && this.f8829a != null) {
                SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8829a).edit();
                edit.putString(g, this.j.toString());
                edit.commit();
            } else {
                this.j = new JSONObject();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object e(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            MLog.e("unexpected null context in getSuperProperty");
            UMConfigure.umDebugLog.aq("A_15017", 0, "\\|");
            return null;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (this.j != null) {
            String subStr = HelperUtils.subStr(str, 128);
            if (this.j.has(subStr)) {
                return this.j.opt(subStr);
            }
        } else {
            this.j = new JSONObject();
        }
        return null;
    }

    public synchronized String e(Context context) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            MLog.e("unexpected null context in getSuperProperties");
            UMConfigure.umDebugLog.aq("A_15017", 0, "\\|");
            return null;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (this.j != null) {
            return this.j.toString();
        }
        this.j = new JSONObject();
        return null;
    }

    public synchronized JSONObject j() {
        try {
            if (this.j == null) {
                this.j = new JSONObject();
            }
        } catch (Throwable unused) {
        }
        return this.j;
    }

    public synchronized void f(Context context) {
        if (context == null) {
            MLog.e("unexpected null context in clearSuperProperties");
            UMConfigure.umDebugLog.aq("A_15016", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        this.j = new JSONObject();
        UMWorkDispatch.sendEvent(this.f8829a, i.a.n, CoreProtocol.getInstance(this.f8829a), null);
    }

    public synchronized void k() {
        try {
            if (this.f8829a != null) {
                SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8829a).edit();
                edit.remove(g);
                edit.commit();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public synchronized void a(Context context, List<String> list) {
        try {
        } catch (Throwable th) {
            MLog.e(th);
        }
        if (context == null) {
            MLog.e("unexpected null context in setFirstLaunchEvent");
            UMConfigure.umDebugLog.aq("A_15018", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        m.a(this.f8829a).a(list);
    }

    public synchronized void a(Context context, JSONObject jSONObject) {
        if (context == null) {
            MLog.e("unexpected null context in setPreProperties");
            UMConfigure.umDebugLog.aq("A_15020", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        if (this.l == null) {
            this.l = new JSONObject();
        }
        if (UMConfigure.isDebugLog() && jSONObject == null) {
            UMConfigure.umDebugLog.aq("A_15021", 0, "\\|");
        }
        Iterator<String> keys = jSONObject.keys();
        if (keys != null) {
            while (keys.hasNext()) {
                try {
                    String obj = keys.next().toString();
                    Object obj2 = jSONObject.get(obj);
                    if (b(obj, obj2)) {
                        this.l.put(obj, obj2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (this.l.length() > 0) {
            UMWorkDispatch.sendEvent(this.f8829a, i.a.q, CoreProtocol.getInstance(this.f8829a), this.l.toString());
        }
    }

    public synchronized void f(Context context, String str) {
        if (context == null) {
            MLog.e("unexpected null context in clearPreProperties(context, " + str + ")");
            UMConfigure.umDebugLog.aq("A_15022", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        if (this.l == null) {
            this.l = new JSONObject();
        }
        if (this.l.has(str)) {
            this.l.remove(str);
            UMWorkDispatch.sendEvent(this.f8829a, i.a.r, CoreProtocol.getInstance(this.f8829a), this.l.toString());
        } else if (UMConfigure.isDebugLog()) {
            UMConfigure.umDebugLog.aq("A_15023", 0, "\\|");
        }
    }

    public synchronized void g(Context context) {
        if (context == null) {
            MLog.e("unexpected null context in clearPreProperties");
            UMConfigure.umDebugLog.aq("A_15024", 0, "\\|");
            return;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        if (this.l.length() > 0) {
            UMWorkDispatch.sendEvent(this.f8829a, i.a.s, CoreProtocol.getInstance(this.f8829a), null);
        }
        this.l = new JSONObject();
    }

    public synchronized JSONObject h(Context context) {
        if (context == null) {
            MLog.e("unexpected null context in clearPreProperties");
            UMConfigure.umDebugLog.aq("A_15025", 0, "\\|");
            return null;
        }
        if (this.f8829a == null) {
            this.f8829a = context.getApplicationContext();
        }
        if (!this.i || !this.m) {
            a(this.f8829a);
        }
        if (this.l == null) {
            this.l = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (this.l.length() > 0) {
            try {
                jSONObject = new JSONObject(this.l.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public synchronized void b(Object obj) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8829a).edit();
            if (obj != null) {
                String str = (String) obj;
                if (edit != null && !TextUtils.isEmpty(str)) {
                    edit.putString(h, str).commit();
                }
            } else if (edit != null) {
                edit.remove(h).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean b(String str, Object obj) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            i = str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            i = 0;
        }
        if (i <= 128 && !Arrays.asList(com.umeng.analytics.pro.b.au).contains(str)) {
            return obj instanceof String ? ((String) obj).getBytes("UTF-8").length <= 256 : (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float);
        }
        return false;
    }
}
