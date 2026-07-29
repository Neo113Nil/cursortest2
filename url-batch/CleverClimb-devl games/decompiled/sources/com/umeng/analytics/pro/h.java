package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.c;
import com.umeng.analytics.pro.g;
import com.umeng.analytics.pro.i;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AutoViewPageTracker.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static String f8915a;
    private static JSONArray e = new JSONArray();
    private static Object f = new Object();
    private Application g;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Long> f8918d = new HashMap();
    private boolean h = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f8916b = false;

    /* renamed from: c, reason: collision with root package name */
    Application.ActivityLifecycleCallbacks f8917c = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.h.1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            try {
                if (UMConfigure.isDebugLog()) {
                    String name = activity.getClass().getName();
                    if (name.equals(com.umeng.analytics.b.a().e())) {
                        return;
                    }
                    UMConfigure.umDebugLog.aq("A_10035", 0, "\\|", new String[]{"@"}, new String[]{name.substring(0, name.length())}, null, null);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity != null) {
                if (!h.this.f8916b) {
                    h.this.a(activity);
                    return;
                }
                h.this.f8916b = false;
                if (!TextUtils.isEmpty(h.f8915a)) {
                    if (h.f8915a.equals(activity.getPackageName() + "." + activity.getLocalClassName())) {
                        return;
                    }
                    h.this.a(activity);
                    return;
                }
                h.f8915a = activity.getPackageName() + "." + activity.getLocalClassName();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            h.this.b(activity);
            h.this.f8916b = false;
            try {
                if (UMConfigure.isDebugLog()) {
                    String name = activity.getClass().getName();
                    if (name.equals(com.umeng.analytics.b.a().d())) {
                        return;
                    }
                    UMConfigure.umDebugLog.aq("A_10034", 0, "\\|", new String[]{"@"}, new String[]{name}, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    };

    public boolean a() {
        return this.h;
    }

    public h(Context context) {
        this.g = null;
        synchronized (this) {
            if (this.g == null && context != null) {
                if (context instanceof Activity) {
                    this.g = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    this.g = (Application) context;
                }
                if (this.g != null) {
                    b(context);
                }
            }
        }
    }

    private void b(Context context) {
        if (this.h) {
            return;
        }
        this.h = true;
        if (this.g != null) {
            this.g.registerActivityLifecycleCallbacks(this.f8917c);
        }
        if ((context instanceof Activity) && f8915a == null) {
            this.f8916b = true;
            a((Activity) context);
        }
    }

    public void b() {
        this.h = false;
        if (this.g != null) {
            this.g.unregisterActivityLifecycleCallbacks(this.f8917c);
            this.g = null;
        }
    }

    public void c() {
        b((Activity) null);
        b();
    }

    public static void a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f) {
                    jSONArray = e.toString();
                    e = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put(c.e.a.f8892c, new JSONArray(jSONArray));
                    g.a(context).a(o.a().d(), jSONObject, g.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        Iterator<String> keys;
        f8915a = activity.getPackageName() + "." + activity.getLocalClassName();
        if (AnalyticsConfig.FLAG_DPLUS) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(b.ai, f8915a);
                jSONObject.put("_$!ts", System.currentTimeMillis());
                JSONObject j = com.umeng.analytics.b.a().j();
                if (j.length() > 0) {
                    jSONObject.put(b.ab, j);
                }
                String c2 = o.a().c();
                if (TextUtils.isEmpty(c2)) {
                    c2 = "-1";
                }
                jSONObject.put("__ii", c2);
                if (o.a().b()) {
                    jSONObject.put("__ii", "-1");
                }
                JSONObject h = com.umeng.analytics.b.a().h(activity.getApplicationContext());
                if (h != null && h.length() > 0 && (keys = h.keys()) != null) {
                    while (keys.hasNext()) {
                        try {
                            String obj = keys.next().toString();
                            if (!Arrays.asList(b.au).contains(obj)) {
                                jSONObject.put(obj, h.get(obj));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                UMWorkDispatch.sendEvent(activity.getApplicationContext(), i.a.k, CoreProtocol.getInstance(activity.getApplicationContext()), jSONObject);
            } catch (JSONException unused2) {
            }
        }
        synchronized (this.f8918d) {
            this.f8918d.put(f8915a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        long j = 0;
        try {
            synchronized (this.f8918d) {
                if (f8915a == null && activity != null) {
                    f8915a = activity.getPackageName() + "." + activity.getLocalClassName();
                }
                if (!TextUtils.isEmpty(f8915a) && this.f8918d.containsKey(f8915a)) {
                    j = System.currentTimeMillis() - this.f8918d.get(f8915a).longValue();
                    this.f8918d.remove(f8915a);
                }
            }
            synchronized (f) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(b.u, f8915a);
                    jSONObject.put("duration", j);
                    e.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
