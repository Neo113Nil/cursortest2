package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.appsflyer.ab;
import com.appsflyer.af;
import com.appsflyer.ah;
import com.appsflyer.l;
import com.appsflyer.o;
import com.appsflyer.p;
import com.appsflyer.t;
import com.appsflyer.v;
import com.cmplay.base.util.webview.util.WebUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i implements r {

    /* renamed from: a, reason: collision with root package name */
    static final String f3447a = "4.8.10".substring(0, "4.8.10".indexOf("."));

    /* renamed from: b, reason: collision with root package name */
    static final String f3448b;

    /* renamed from: c, reason: collision with root package name */
    static h f3449c;
    private static final String f;
    private static String g;
    private static String h;
    private static String i;
    private static final List<String> l;
    private static final List<String> m;
    private static g o;
    private static i w;
    private String C;
    private boolean D;
    private boolean E;

    /* renamed from: d, reason: collision with root package name */
    String f3450d;
    String e;
    private Map<String, String> q;
    private long s;
    private long u;
    private long v;
    private ab.a x;
    private long z;
    private long j = -1;
    private long k = -1;
    private long n = TimeUnit.SECONDS.toMillis(5);
    private n p = null;
    private boolean r = false;
    private ScheduledExecutorService t = null;
    private Uri y = null;
    private boolean A = false;
    private boolean B = false;
    private ad F = new ad();
    private boolean G = false;
    private boolean H = false;

    static /* synthetic */ String b(WeakReference weakReference) {
        String a2 = j.a().a("channel");
        return a2 == null ? a((WeakReference<Context>) weakReference, "CHANNEL") : a2;
    }

    static /* synthetic */ void b(Map map) {
        if (o != null) {
            try {
                o.b((Map<String, String>) map);
            } catch (Throwable th) {
                com.appsflyer.d.a(th.getLocalizedMessage(), th);
            }
        }
    }

    static /* synthetic */ String c(String str) {
        return j.a().a(str);
    }

    static /* synthetic */ void a(i iVar, Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, Intent intent) {
        if (context == null) {
            com.appsflyer.d.c("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        boolean z3 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("appsflyer-data", 0);
        j.a().a(sharedPreferences);
        if (!iVar.d()) {
            StringBuilder sb = new StringBuilder("sendTrackingWithEvent from activity: ");
            sb.append(context.getClass().getName());
            com.appsflyer.d.d(sb.toString());
        }
        boolean z4 = str2 == null;
        Map<String, Object> a2 = iVar.a(context, str, str2, str3, str4, z, sharedPreferences, z4, intent);
        String str5 = (String) a2.get("appsflyerKey");
        if (str5 == null || str5.length() == 0) {
            com.appsflyer.d.c("Not sending data yet, waiting for dev key");
            return;
        }
        if (!iVar.d()) {
            com.appsflyer.d.d("AppsFlyerLib.sendTrackingWithEvent");
        }
        String b2 = m.b(z4 ? z2 ? g : h : i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b2);
        sb2.append(context.getPackageName());
        e eVar = new e(iVar, sb2.toString(), a2, context.getApplicationContext(), z4, a(sharedPreferences, "appsFlyerCount", false), (byte) 0);
        if (z4 && e(context)) {
            if (iVar.q != null && iVar.q.size() > 0) {
                z3 = true;
            }
            if (!z3) {
                com.appsflyer.d.c("Failed to get new referrer, wait ...");
                a(com.appsflyer.a.a().c(), eVar, 500L, TimeUnit.MILLISECONDS);
                return;
            }
        }
        eVar.run();
    }

    static /* synthetic */ void a(i iVar, String str, String str2, String str3, WeakReference weakReference, String str4, boolean z) throws IOException {
        URL url = new URL(str);
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(url.toString());
        com.appsflyer.d.d(sb.toString());
        t.AnonymousClass3.b("data: ".concat(String.valueOf(str2)));
        a((Context) weakReference.get(), "AppsFlyer_4.8.10", "EVENT_DATA", str2);
        try {
            iVar.a(url, str2, str3, (WeakReference<Context>) weakReference, str4, z);
        } catch (IOException e2) {
            com.appsflyer.d.a("Exception in sendRequestToServer. ", e2);
            if (j.a().b("useHttpFallback", false)) {
                iVar.a(new URL(str.replace("https:", "http:")), str2, str3, (WeakReference<Context>) weakReference, str4, z);
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send requeset to server. ");
            sb2.append(e2.getLocalizedMessage());
            com.appsflyer.d.d(sb2.toString());
            a((Context) weakReference.get(), "AppsFlyer_4.8.10", "ERROR", e2.getLocalizedMessage());
            throw e2;
        }
    }

    static /* synthetic */ boolean a(i iVar) {
        return iVar.q != null && iVar.q.size() > 0;
    }

    static /* synthetic */ ScheduledExecutorService e(i iVar) {
        iVar.t = null;
        return null;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f3447a);
        sb.append("/androidevent?buildnumber=4.8.10&app_id=");
        f = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://attr.%s/api/v");
        sb2.append(f);
        g = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://t.%s/api/v");
        sb3.append(f);
        h = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://events.%s/api/v");
        sb4.append(f);
        i = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://register.%s/api/v");
        sb5.append(f);
        f3448b = sb5.toString();
        l = Arrays.asList("is_cache");
        m = Arrays.asList("googleplay", "playstore", "googleplaystore");
        o = null;
        f3449c = null;
        w = new i();
    }

    final void a() {
        this.u = System.currentTimeMillis();
    }

    final void b() {
        this.v = System.currentTimeMillis();
    }

    final void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("shouldMonitor");
        if (stringExtra != null) {
            com.appsflyer.d.d("Turning on monitoring.");
            j.a().a("shouldMonitor", stringExtra.equals("true"));
            a(context, (String) null, "START_TRACKING", context.getPackageName());
            return;
        }
        com.appsflyer.d.d("****** onReceive called *******");
        j.a().b();
        String stringExtra2 = intent.getStringExtra(TapjoyConstants.TJC_REFERRER);
        com.appsflyer.d.d("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                SharedPreferences.Editor edit = context.getSharedPreferences("appsflyer-data", 0).edit();
                edit.clear();
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
                j.a().a(false);
                com.appsflyer.d.d("Test mode started..");
                this.z = System.currentTimeMillis();
            }
            SharedPreferences.Editor edit2 = context.getSharedPreferences("appsflyer-data", 0).edit();
            edit2.putString(TapjoyConstants.TJC_REFERRER, stringExtra2);
            if (Build.VERSION.SDK_INT >= 9) {
                edit2.apply();
            } else {
                edit2.commit();
            }
            j.a().b(stringExtra2);
            if (j.a().c()) {
                com.appsflyer.d.d("onReceive: isLaunchCalled");
                if (stringExtra2 == null || stringExtra2.length() <= 5) {
                    return;
                }
                ScheduledThreadPoolExecutor c2 = com.appsflyer.a.a().c();
                a(c2, new d(this, new WeakReference(context.getApplicationContext()), null, null, null, stringExtra2, c2, true, intent, (byte) 0), 5L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private static void a(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    String str2 = str;
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        try {
                            if (jSONArray2.getLong(i3) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i3) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i3) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                i3++;
                                str2 = next;
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    str = str2;
                } catch (JSONException unused3) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    static void a(Context context, String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        com.appsflyer.d.c("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = context.getSharedPreferences("appsflyer-data", 0).getString("extraReferrers", null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                jSONObject = new JSONObject(string);
                if (jSONObject.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
            }
            if (jSONArray.length() < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                a(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject2 = jSONObject.toString();
            SharedPreferences.Editor edit = context.getSharedPreferences("appsflyer-data", 0).edit();
            edit.putString("extraReferrers", jSONObject2);
            if (Build.VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            com.appsflyer.d.a(sb.toString(), th);
        }
    }

    private i() {
        f.a();
    }

    public static i c() {
        return w;
    }

    private void b(Application application) {
        j.a().b(application.getApplicationContext());
        if (Build.VERSION.SDK_INT >= 14) {
            if (Build.VERSION.SDK_INT < 14 || this.x != null) {
                return;
            }
            ab.a();
            this.x = new ab.a() { // from class: com.appsflyer.i.1
                @Override // com.appsflyer.ab.a
                public final void a(Activity activity) {
                    if (2 > i.a(i.b(activity))) {
                        t a2 = t.a(activity);
                        a2.f3491a.post(a2.f);
                        a2.f3491a.post(a2.e);
                    }
                    com.appsflyer.d.d("onBecameForeground");
                    i.c().a();
                    i.c().b(activity, (String) null, (Map<String, Object>) null);
                    com.appsflyer.d.a();
                }

                @Override // com.appsflyer.ab.a
                public final void a(WeakReference<Context> weakReference) {
                    Context applicationContext = weakReference.get().getApplicationContext();
                    com.appsflyer.d.d("onBecameBackground");
                    i.c().b();
                    com.appsflyer.d.d("callStatsBackground background call");
                    i.c().a(new WeakReference<>(applicationContext));
                    ag a2 = ag.a();
                    if (a2.f()) {
                        a2.c();
                        if (applicationContext != null) {
                            ag.a(applicationContext.getPackageName(), applicationContext.getPackageManager());
                        }
                        a2.d();
                    } else {
                        com.appsflyer.d.c("RD status is OFF");
                    }
                    com.appsflyer.a.a().d();
                    t a3 = t.a(weakReference.get());
                    a3.f3491a.post(a3.f);
                }
            };
            ab.b().a(application, this.x);
            return;
        }
        com.appsflyer.d.d("SDK<14 call trackEvent manually");
        com.appsflyer.d.d("onBecameForeground");
        c().u = System.currentTimeMillis();
        c().b(application, (String) null, (Map<String, Object>) null);
        com.appsflyer.d.a();
    }

    public void a(boolean z) {
        ag.a().a("setCollectAndroidID", String.valueOf(z));
        j.a().a("collectAndroidId", Boolean.toString(z));
    }

    public void b(boolean z) {
        ag.a().a("setCollectIMEI", String.valueOf(z));
        j.a().a("collectIMEI", Boolean.toString(z));
    }

    public i a(String str, g gVar) {
        ag a2 = ag.a();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = gVar == null ? "null" : "conversionDataListener";
        a2.a("init", strArr);
        com.appsflyer.d.b(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "4.8.10", "381"));
        this.E = true;
        j.a().a("AppsFlyerKey", str);
        t.AnonymousClass3.a(str);
        o = gVar;
        return this;
    }

    public i a(String str, g gVar, Context context) {
        if (context != null && e(context)) {
            if (this.p == null) {
                this.p = new n();
                this.p.a(context, this);
            } else {
                com.appsflyer.d.e("AFInstallReferrer instance already created");
            }
        }
        return a(str, gVar);
    }

    private static boolean e(Context context) {
        if (a(context.getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            com.appsflyer.d.a("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.a.a.a");
            if (v.a.a(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                com.appsflyer.d.c("Install referrer is allowed");
                return true;
            }
            com.appsflyer.d.c("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            com.appsflyer.d.a("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            com.appsflyer.d.a("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    public void a(Application application) {
        if (!this.E) {
            com.appsflyer.d.e("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        } else {
            a(application, (String) null);
        }
    }

    public void a(Application application, String str) {
        ag.a().a("startTracking", str);
        com.appsflyer.d.d(String.format("Starting AppsFlyer Tracking: (v%s.%s)", "4.8.10", "381"));
        com.appsflyer.d.d("Build Number: 381");
        j.a().b(application.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            j.a().a("AppsFlyerKey", str);
            t.AnonymousClass3.a(str);
        } else if (TextUtils.isEmpty(j.a().a("AppsFlyerKey"))) {
            com.appsflyer.d.e("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
            return;
        }
        b(application);
    }

    public void a(String str) {
        ag.a().a("setCurrencyCode", str);
        j.a().a("currencyCode", str);
    }

    final void a(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        com.appsflyer.d.d("app went to background");
        SharedPreferences sharedPreferences = weakReference.get().getSharedPreferences("appsflyer-data", 0);
        j.a().a(sharedPreferences);
        long j = this.v - this.u;
        HashMap hashMap = new HashMap();
        String a2 = j.a().a("AppsFlyerKey");
        if (a2 == null) {
            com.appsflyer.d.e("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String a3 = j.a().a("KSAppsFlyerId");
        if (j.a().b("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
        }
        w a4 = aa.a(weakReference.get().getContentResolver());
        if (a4 != null) {
            hashMap.put("amazon_aid", a4.a());
            hashMap.put("amazon_aid_limit", String.valueOf(a4.b()));
        }
        String a5 = j.a().a("advertiserId");
        if (a5 != null) {
            hashMap.put("advertiserId", a5);
        }
        hashMap.put(TapjoyConstants.TJC_APP_ID, weakReference.get().getPackageName());
        hashMap.put("devkey", a2);
        hashMap.put("uid", ac.a(weakReference));
        hashMap.put("time_in_app", String.valueOf(j / 1000));
        hashMap.put("statType", "user_closed_app");
        hashMap.put(TapjoyConstants.TJC_PLATFORM, "Android");
        hashMap.put("launch_counter", Integer.toString(a(sharedPreferences, "appsFlyerCount", false)));
        hashMap.put("gcd_conversion_data_timing", Long.toString(sharedPreferences.getLong("appsflyerGetConversionDataTiming", 0L)));
        String a6 = j.a().a("channel");
        if (a6 == null) {
            a6 = a(weakReference, "CHANNEL");
        }
        hashMap.put("channel", a6);
        if (a3 == null) {
            a3 = "";
        }
        hashMap.put("originalAppsflyerId", a3);
        if (this.G) {
            try {
                x xVar = new x(null, d());
                xVar.f3515a = hashMap;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    com.appsflyer.d.c("Main thread detected. Running callStats task in a new thread.");
                    xVar.execute(m.b("https://stats.%s/stats"));
                    return;
                }
                StringBuilder sb = new StringBuilder("Running callStats task (on current thread: ");
                sb.append(Thread.currentThread().toString());
                sb.append(" )");
                com.appsflyer.d.c(sb.toString());
                xVar.onPreExecute();
                xVar.onPostExecute(xVar.doInBackground(m.b("https://stats.%s/stats")));
                return;
            } catch (Throwable th) {
                com.appsflyer.d.a("Could not send callStats request", th);
                return;
            }
        }
        com.appsflyer.d.c("Stats call is disabled, ignore ...");
    }

    public void a(Context context, String str, Map<String, Object> map) {
        ag.a().a("trackEvent", str, new JSONObject(map == null ? new HashMap<>() : map).toString());
        b(context, str, map);
    }

    final void b(Context context, String str, Map<String, Object> map) {
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (j.a().a("AppsFlyerKey") == null) {
            com.appsflyer.d.e("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        JSONObject jSONObject = new JSONObject(map);
        String a2 = j.a().a(context);
        String jSONObject2 = jSONObject.toString();
        if (a2 == null) {
            a2 = "";
        }
        a(context, (String) null, str, jSONObject2, a2, intent);
    }

    private static void a(Context context, String str, String str2, String str3) {
        if (j.a().b("shouldMonitor", false)) {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra(TJAdUnitConstants.String.MESSAGE, str2);
            intent.putExtra("value", str3);
            intent.putExtra("packageName", "true");
            intent.putExtra("pid", new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", str);
            intent.putExtra(TapjoyConstants.TJC_SDK_PLACEMENT, "4.8.10");
            context.sendBroadcast(intent);
        }
    }

    final void b(Context context, String str) {
        if (j.a().b("waitForCustomerId", false) && j.a().a("AppUserId") == null) {
            com.appsflyer.d.a("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        String a2 = j.a().a("AppsFlyerKey");
        if (a2 == null) {
            com.appsflyer.d.e("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("installDate", simpleDateFormat.format(new Date(j)));
        } catch (Throwable th) {
            com.appsflyer.d.a("Exception while collecting application version info.", th);
        }
        a(context, hashMap);
        String a3 = j.a().a("AppUserId");
        if (a3 != null) {
            hashMap.put("appUserId", a3);
        }
        try {
            hashMap.put("model", Build.MODEL);
            hashMap.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            com.appsflyer.d.a("Exception while collecting device brand and model.", th2);
        }
        if (j.a().b("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
        }
        w a4 = aa.a(context.getContentResolver());
        if (a4 != null) {
            hashMap.put("amazon_aid", a4.a());
            hashMap.put("amazon_aid_limit", String.valueOf(a4.b()));
        }
        String a5 = j.a().a("advertiserId");
        if (a5 != null) {
            hashMap.put("advertiserId", a5);
        }
        hashMap.put("devkey", a2);
        hashMap.put("uid", ac.a((WeakReference<Context>) new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(a(context.getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)));
        hashMap.put(TapjoyConstants.TJC_SDK_PLACEMENT, Integer.toString(Build.VERSION.SDK_INT));
        WeakReference weakReference = new WeakReference(context);
        String a6 = j.a().a("channel");
        if (a6 == null) {
            a6 = a((WeakReference<Context>) weakReference, "CHANNEL");
        }
        if (a6 != null) {
            hashMap.put("channel", a6);
        }
        try {
            x xVar = new x(context, d());
            xVar.f3515a = hashMap;
            StringBuilder sb = new StringBuilder();
            sb.append(m.b(f3448b));
            sb.append(packageName);
            xVar.execute(sb.toString());
        } catch (Throwable th3) {
            com.appsflyer.d.a(th3.getMessage(), th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> f(Context context) throws y {
        String string = context.getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return d(string);
        }
        throw new y();
    }

    private static Map<String, String> d(Context context, String str) {
        int i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=");
            String substring = indexOf > 0 ? str2.substring(0, indexOf) : str2;
            if (!linkedHashMap.containsKey(substring)) {
                if (substring.equals("c")) {
                    substring = "campaign";
                } else if (substring.equals("pid")) {
                    substring = "media_source";
                } else if (substring.equals("af_prt")) {
                    substring = "agency";
                    z = true;
                }
                linkedHashMap.put(substring, "");
            }
            linkedHashMap.put(substring, (indexOf <= 0 || str2.length() <= (i2 = indexOf + 1)) ? null : str2.substring(i2));
        }
        try {
            if (!linkedHashMap.containsKey("install_time")) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                long j = packageInfo.firstInstallTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                linkedHashMap.put("install_time", simpleDateFormat.format(new Date(j)));
            }
        } catch (Exception e2) {
            com.appsflyer.d.a("Could not fetch install time. ", e2);
        }
        if (!linkedHashMap.containsKey("af_status")) {
            linkedHashMap.put("af_status", "Non-organic");
        }
        if (z) {
            linkedHashMap.remove("media_source");
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> d(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!l.contains(next)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string) && !"null".equals(string)) {
                        hashMap.put(next, string);
                    }
                }
            }
            return hashMap;
        } catch (JSONException e2) {
            com.appsflyer.d.a(e2.getMessage(), e2);
            return null;
        }
    }

    private void a(Context context, String str, String str2, String str3, String str4, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        boolean z = false;
        boolean z2 = str2 == null;
        if (j.a().b("waitForCustomerId", false) && j.a().a("AppUserId") == null) {
            z = true;
        }
        if (z) {
            com.appsflyer.d.a("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z2) {
            if (j.a().b("launchProtectEnabled", true)) {
                if (h()) {
                    return;
                }
            } else {
                com.appsflyer.d.d("Allowing multiple launches within a 5 second time window.");
            }
            this.j = System.currentTimeMillis();
        }
        ScheduledThreadPoolExecutor c2 = com.appsflyer.a.a().c();
        a(c2, new d(this, new WeakReference(applicationContext), str, str2, str3, str4, c2, false, intent, (byte) 0), 150L, TimeUnit.MILLISECONDS);
    }

    private boolean h() {
        if (this.j > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.j;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.j;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.k;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.n && !d()) {
                com.appsflyer.d.d(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.n)));
                return true;
            }
            if (!d()) {
                com.appsflyer.d.d(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", format, format2, Long.valueOf(currentTimeMillis)));
            }
        } else if (!d()) {
            com.appsflyer.d.d("Sending first launch for this session!");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:332:0x0643, code lost:
    
        if (r17.f3450d != null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x06a8, code lost:
    
        if (r17.e != null) goto L276;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0425 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0445 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x044d A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0459 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0461 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x046d A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x047d A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05d0 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06d0 A[Catch: Exception -> 0x06d6, Throwable -> 0x0bdf, TRY_LEAVE, TryCatch #5 {Exception -> 0x06d6, blocks: (B:174:0x06c5, B:176:0x06d0), top: B:173:0x06c5, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0749 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0790 A[Catch: Throwable -> 0x082f, TryCatch #10 {Throwable -> 0x082f, blocks: (B:198:0x0788, B:200:0x0790, B:201:0x079c, B:203:0x07b4, B:205:0x07f6, B:207:0x0806, B:208:0x0817, B:210:0x081c), top: B:197:0x0788 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07b4 A[Catch: Throwable -> 0x082f, TryCatch #10 {Throwable -> 0x082f, blocks: (B:198:0x0788, B:200:0x0790, B:201:0x079c, B:203:0x07b4, B:205:0x07f6, B:207:0x0806, B:208:0x0817, B:210:0x081c), top: B:197:0x0788 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0840 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0850 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0861 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x088b A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0896 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08dd A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0917 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0926 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x095f A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0987 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09a7 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0a14 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a5c A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0bbb A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05d9 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0650 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0674 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06b5 A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06c0 A[Catch: Throwable -> 0x0bdf, TRY_LEAVE, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06ad A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x065b A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x05be A[Catch: Throwable -> 0x0bdf, TryCatch #3 {Throwable -> 0x0bdf, blocks: (B:5:0x0033, B:7:0x0039, B:10:0x0046, B:14:0x0060, B:17:0x006b, B:19:0x0087, B:20:0x0091, B:22:0x0099, B:23:0x009e, B:25:0x00a6, B:28:0x00b5, B:29:0x00bc, B:31:0x00f0, B:33:0x00ff, B:35:0x0109, B:36:0x0192, B:38:0x019e, B:39:0x01a5, B:41:0x01a9, B:43:0x01cc, B:44:0x01f3, B:45:0x01f7, B:46:0x0216, B:47:0x022e, B:49:0x024b, B:50:0x0253, B:52:0x0266, B:53:0x02ef, B:56:0x0307, B:58:0x0311, B:59:0x031b, B:61:0x0327, B:63:0x032c, B:65:0x033a, B:67:0x0347, B:69:0x0353, B:71:0x0359, B:72:0x035e, B:74:0x036f, B:75:0x0375, B:77:0x037b, B:79:0x0382, B:81:0x038c, B:82:0x0391, B:84:0x03a0, B:86:0x03ce, B:87:0x03d7, B:89:0x03ea, B:91:0x03f2, B:93:0x0491, B:94:0x03fc, B:96:0x040d, B:98:0x0419, B:103:0x0425, B:105:0x0439, B:110:0x0445, B:112:0x044d, B:117:0x0459, B:119:0x0461, B:124:0x046d, B:129:0x047d, B:136:0x048a, B:138:0x049c, B:139:0x04a5, B:141:0x04b2, B:143:0x04bd, B:145:0x04c3, B:146:0x04e0, B:148:0x04ec, B:149:0x04f1, B:151:0x04fd, B:153:0x051a, B:155:0x0521, B:156:0x0526, B:158:0x0532, B:159:0x0541, B:161:0x054e, B:163:0x0554, B:164:0x056a, B:165:0x056f, B:167:0x057b, B:168:0x0580, B:392:0x05be, B:170:0x05c3, B:172:0x05d0, B:174:0x06c5, B:176:0x06d0, B:179:0x06ed, B:181:0x0702, B:184:0x0717, B:185:0x072c, B:189:0x0749, B:212:0x083a, B:214:0x0840, B:215:0x0847, B:217:0x0850, B:218:0x0855, B:220:0x0861, B:221:0x086e, B:223:0x088b, B:226:0x0896, B:228:0x089a, B:229:0x08b1, B:232:0x08b8, B:234:0x08c4, B:236:0x08cc, B:237:0x08d0, B:239:0x08d4, B:241:0x08d9, B:243:0x08dd, B:244:0x0901, B:247:0x0919, B:251:0x0926, B:252:0x0953, B:254:0x095f, B:256:0x096e, B:257:0x0976, B:258:0x097d, B:260:0x0987, B:261:0x099d, B:263:0x09a7, B:265:0x09ad, B:267:0x09b5, B:268:0x09ba, B:271:0x09ee, B:275:0x0a00, B:277:0x0a14, B:278:0x0a1e, B:280:0x0a5c, B:282:0x0a60, B:284:0x0a6d, B:285:0x0a94, B:287:0x0a9a, B:288:0x0a9f, B:290:0x0ab8, B:293:0x0ac4, B:295:0x0ad2, B:296:0x0ad7, B:298:0x0bbb, B:305:0x0835, B:193:0x0772, B:312:0x0727, B:315:0x0712, B:319:0x06fd, B:322:0x06d8, B:323:0x05d9, B:325:0x05f6, B:327:0x05fa, B:371:0x0606, B:335:0x0650, B:336:0x0660, B:338:0x0674, B:340:0x0678, B:352:0x0684, B:348:0x06b5, B:349:0x06c0, B:355:0x0691, B:357:0x0695, B:344:0x06a6, B:346:0x06aa, B:363:0x069e, B:365:0x06ad, B:368:0x065b, B:374:0x0626, B:376:0x062a, B:331:0x0641, B:333:0x0645, B:384:0x0635, B:381:0x063b, B:386:0x0648, B:396:0x05af, B:398:0x05b6, B:399:0x0503, B:401:0x050f, B:402:0x04c9, B:404:0x04d5, B:406:0x04db, B:407:0x0bcc, B:409:0x03a8, B:411:0x03b9, B:412:0x03c7, B:418:0x0342, B:420:0x027b, B:422:0x0286, B:424:0x028f, B:425:0x02c7, B:427:0x02e0, B:428:0x02e4, B:431:0x02ea, B:434:0x00ae, B:437:0x0051, B:390:0x059a), top: B:4:0x0033, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #11, #12, #14, #15 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map<String, Object> a(Context context, String str, String str2, String str3, String str4, boolean z, SharedPreferences sharedPreferences, boolean z2, Intent intent) {
        String a2;
        String str5;
        String str6;
        boolean b2;
        String str7;
        SharedPreferences sharedPreferences2;
        Object string;
        String a3;
        long currentTimeMillis;
        String a4;
        w a5;
        String a6;
        PackageInfo packageInfo;
        Object a7;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String a8;
        String str8;
        String valueOf;
        j a9;
        Map<String, Object> hashMap = new HashMap<>();
        aa.a(context, hashMap);
        long time = new Date().getTime();
        hashMap.put("af_timestamp", Long.toString(time));
        Object a10 = u.a(context, time);
        if (a10 != null) {
            hashMap.put("cksm_v1", a10);
        }
        try {
            if (!d()) {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                sb.append(z2 ? "Launch" : str2);
                com.appsflyer.d.d(sb.toString());
            } else {
                com.appsflyer.d.d("SDK tracking has been stopped");
            }
            a(context, "AppsFlyer_4.8.10", "EVENT_CREATED_WITH_NAME", z2 ? "Launch" : str2);
            com.appsflyer.a.a.a().a(context);
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!asList.contains("android.permission.INTERNET")) {
                    com.appsflyer.d.e("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    a(context, (String) null, "PERMISSION_INTERNET_MISSING", (String) null);
                }
                if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    com.appsflyer.d.e("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                }
                if (!asList.contains("android.permission.ACCESS_WIFI_STATE")) {
                    com.appsflyer.d.e("Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
                }
            } catch (Exception e2) {
                com.appsflyer.d.a("Exception while validation permissions. ", e2);
            }
            if (z) {
                hashMap.put("af_events_api", "1");
            }
            hashMap.put("brand", Build.BRAND);
            hashMap.put(TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX, Build.DEVICE);
            hashMap.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
            hashMap.put(TapjoyConstants.TJC_SDK_PLACEMENT, Integer.toString(Build.VERSION.SDK_INT));
            hashMap.put("model", Build.MODEL);
            hashMap.put("deviceType", Build.TYPE);
            if (z2) {
                if (!context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount")) {
                    if (!j.a().f()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.F.a("com.tune.Tune") ? 1 : 0);
                        sb2.append(this.F.a("com.adjust.sdk.Adjust") ? 1 : 0);
                        sb2.append(this.F.a("com.kochava.android.tracker.Feature") ? 1 : 0);
                        sb2.append(this.F.a("io.branch.referral.Branch") ? 1 : 0);
                        sb2.append(this.F.a("com.apsalar.sdk.Apsalar") ? 1 : 0);
                        sb2.append(this.F.a("com.localytics.android.Localytics") ? 1 : 0);
                        sb2.append(this.F.a("com.tenjin.android.TenjinSDK") ? 1 : 0);
                        sb2.append(this.F.a("place holder for TD") ? 1 : 0);
                        sb2.append(this.F.a("it.partytrack.sdk.Track") ? 1 : 0);
                        sb2.append(this.F.a("jp.appAdForce.android.LtvManager") ? 1 : 0);
                        hashMap.put("af_sdks", sb2.toString());
                        hashMap.put("batteryLevel", String.valueOf(h(context)));
                    }
                    int i2 = 18;
                    if ("OPPO".equals(Build.BRAND)) {
                        i2 = 23;
                        com.appsflyer.d.a("OPPO device found");
                    }
                    if (Build.VERSION.SDK_INT >= i2) {
                        StringBuilder sb3 = new StringBuilder("OS SDK is=");
                        sb3.append(Build.VERSION.SDK_INT);
                        sb3.append("; use KeyStore");
                        com.appsflyer.d.a(sb3.toString());
                        com.appsflyer.c cVar = new com.appsflyer.c(context);
                        if (cVar.b()) {
                            cVar.a();
                            j.a().a("KSAppsFlyerId", cVar.c());
                            str8 = "KSAppsFlyerRICounter";
                            valueOf = String.valueOf(cVar.d());
                            a9 = j.a();
                        } else {
                            cVar.a(ac.a((WeakReference<Context>) new WeakReference(context)));
                            j.a().a("KSAppsFlyerId", cVar.c());
                            str8 = "KSAppsFlyerRICounter";
                            valueOf = String.valueOf(cVar.d());
                            a9 = j.a();
                        }
                        a9.a(str8, valueOf);
                    } else {
                        StringBuilder sb4 = new StringBuilder("OS SDK is=");
                        sb4.append(Build.VERSION.SDK_INT);
                        sb4.append("; no KeyStore usage");
                        com.appsflyer.d.a(sb4.toString());
                    }
                }
                long j = context.getSharedPreferences("appsflyer-data", 0).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long currentTimeMillis2 = System.currentTimeMillis();
                b(context, "AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis2);
                hashMap.put("timepassedsincelastlaunch", Long.toString(j > 0 ? (currentTimeMillis2 - j) / 1000 : -1L));
                Object a11 = j.a().a("oneLinkSlug");
                if (a11 != null) {
                    hashMap.put("onelink_id", a11);
                    hashMap.put("ol_ver", j.a().a("onelinkVersion"));
                }
            } else {
                SharedPreferences sharedPreferences3 = context.getSharedPreferences("appsflyer-data", 0);
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                try {
                    String string2 = sharedPreferences3.getString("prev_event_name", null);
                    if (string2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(sharedPreferences3.getLong("prev_event_timestamp", -1L));
                        jSONObject.put("prev_event_timestamp", sb5.toString());
                        jSONObject.put("prev_event_value", sharedPreferences3.getString("prev_event_value", null));
                        jSONObject.put("prev_event_name", string2);
                        hashMap.put("prev_event", jSONObject.toString());
                    }
                    edit.putString("prev_event_name", str2);
                    edit.putString("prev_event_value", str3);
                    edit.putLong("prev_event_timestamp", System.currentTimeMillis());
                    if (Build.VERSION.SDK_INT >= 9) {
                        edit.apply();
                    } else {
                        edit.commit();
                    }
                } catch (Exception e3) {
                    com.appsflyer.d.a("Error while processing previous event.", e3);
                }
            }
            Object a12 = j.a().a("KSAppsFlyerId");
            String a13 = j.a().a("KSAppsFlyerRICounter");
            if (a12 != null && a13 != null && Integer.valueOf(a13).intValue() > 0) {
                hashMap.put("reinstallCounter", a13);
                hashMap.put("originalAppsflyerId", a12);
            }
            Object a14 = j.a().a("additionalCustomData");
            if (a14 != null) {
                hashMap.put("customData", a14);
            }
            try {
                Object installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    hashMap.put("installer_package", installerPackageName);
                }
            } catch (Exception e4) {
                com.appsflyer.d.a("Exception while getting the app's installer package. ", e4);
            }
            String a15 = j.a().a("sdkExtension");
            if (a15 != null && a15.length() > 0) {
                hashMap.put("sdkExtension", a15);
            }
            WeakReference weakReference = new WeakReference(context);
            String a16 = j.a().a("channel");
            if (a16 == null) {
                a16 = a((WeakReference<Context>) weakReference, "CHANNEL");
            }
            Object e5 = e(context, a16);
            if (e5 != null) {
                hashMap.put("channel", e5);
            }
            if ((e5 != null && !e5.equals(a16)) || (e5 == null && a16 != null)) {
                hashMap.put("af_latestchannel", a16);
            }
            SharedPreferences sharedPreferences4 = context.getSharedPreferences("appsflyer-data", 0);
            if (sharedPreferences4.contains("INSTALL_STORE")) {
                a2 = sharedPreferences4.getString("INSTALL_STORE", null);
            } else {
                a2 = context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ true ? a((WeakReference<Context>) new WeakReference(context), "AF_STORE") : null;
                b(context, "INSTALL_STORE", a2);
            }
            if (a2 != null) {
                hashMap.put("af_installstore", a2.toLowerCase());
            }
            SharedPreferences sharedPreferences5 = context.getSharedPreferences("appsflyer-data", 0);
            String a17 = j.a().a("preInstallName");
            if (a17 == null) {
                if (sharedPreferences5.contains("preInstallName")) {
                    a17 = sharedPreferences5.getString("preInstallName", null);
                } else {
                    if (!context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount")) {
                        File f2 = f(e("ro.appsflyer.preinstall.path"));
                        if (f2 != null && f2.exists()) {
                            z3 = false;
                            if (z3) {
                                f2 = f(a("AF_PRE_INSTALL_PATH", context.getPackageManager(), context.getPackageName()));
                            }
                            if (f2 != null && f2.exists()) {
                                z4 = false;
                                if (z4) {
                                    f2 = f("/data/local/tmp/pre_install.appsflyer");
                                }
                                if (f2 != null && f2.exists()) {
                                    z5 = false;
                                    if (z5) {
                                        f2 = f("/etc/pre_install.appsflyer");
                                    }
                                    if (f2 != null && f2.exists()) {
                                        z6 = false;
                                        a17 = (!z6 || (a8 = a(f2, context.getPackageName())) == null) ? null : a8;
                                        if (a17 != null) {
                                            a17 = a((WeakReference<Context>) new WeakReference(context), "AF_PRE_INSTALL_NAME");
                                        }
                                    }
                                    z6 = true;
                                    if (z6) {
                                    }
                                    if (a17 != null) {
                                    }
                                }
                                z5 = true;
                                if (z5) {
                                }
                                if (f2 != null) {
                                    z6 = false;
                                    if (z6) {
                                    }
                                    if (a17 != null) {
                                    }
                                }
                                z6 = true;
                                if (z6) {
                                }
                                if (a17 != null) {
                                }
                            }
                            z4 = true;
                            if (z4) {
                            }
                            if (f2 != null) {
                                z5 = false;
                                if (z5) {
                                }
                                if (f2 != null) {
                                }
                                z6 = true;
                                if (z6) {
                                }
                                if (a17 != null) {
                                }
                            }
                            z5 = true;
                            if (z5) {
                            }
                            if (f2 != null) {
                            }
                            z6 = true;
                            if (z6) {
                            }
                            if (a17 != null) {
                            }
                        }
                        z3 = true;
                        if (z3) {
                        }
                        if (f2 != null) {
                            z4 = false;
                            if (z4) {
                            }
                            if (f2 != null) {
                            }
                            z5 = true;
                            if (z5) {
                            }
                            if (f2 != null) {
                            }
                            z6 = true;
                            if (z6) {
                            }
                            if (a17 != null) {
                            }
                        }
                        z4 = true;
                        if (z4) {
                        }
                        if (f2 != null) {
                        }
                        z5 = true;
                        if (z5) {
                        }
                        if (f2 != null) {
                        }
                        z6 = true;
                        if (z6) {
                        }
                        if (a17 != null) {
                        }
                    }
                    if (a17 != null) {
                        b(context, "preInstallName", a17);
                    }
                }
                if (a17 != null) {
                    j.a().a("preInstallName", a17);
                }
            }
            if (a17 != null) {
                hashMap.put("af_preinstall_name", a17.toLowerCase());
            }
            String a18 = a((WeakReference<Context>) new WeakReference(context), "AF_STORE");
            if (a18 != null) {
                hashMap.put("af_currentstore", a18.toLowerCase());
            }
            if (str != null && str.length() >= 0) {
                hashMap.put("appsflyerKey", str);
            } else {
                String a19 = j.a().a("AppsFlyerKey");
                if (a19 != null && a19.length() >= 0) {
                    hashMap.put("appsflyerKey", a19);
                } else {
                    com.appsflyer.d.d("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                    a(context, "AppsFlyer_4.8.10", "DEV_KEY_MISSING", (String) null);
                    com.appsflyer.d.d("AppsFlyer will not track this event.");
                    return null;
                }
            }
            Object a20 = j.a().a("AppUserId");
            if (a20 != null) {
                hashMap.put("appUserId", a20);
            }
            Object a21 = j.a().a("userEmails");
            if (a21 != null) {
                hashMap.put("user_emails", a21);
            } else {
                String a22 = j.a().a("userEmail");
                if (a22 != null) {
                    hashMap.put("sha1_el", ae.a(a22));
                }
            }
            if (str2 != null) {
                hashMap.put("eventName", str2);
                if (str3 != null) {
                    hashMap.put("eventValue", str3);
                }
            }
            if (j.a().a("appid") != null) {
                hashMap.put("appid", j.a().a("appid"));
            }
            String a23 = j.a().a("currencyCode");
            if (a23 != null) {
                if (a23.length() != 3) {
                    StringBuilder sb6 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                    sb6.append(a23);
                    sb6.append("' is not a legal value.");
                    com.appsflyer.d.e(sb6.toString());
                }
                hashMap.put("currency", a23);
            }
            Object a24 = j.a().a("IS_UPDATE");
            if (a24 != null) {
                hashMap.put("isUpdate", a24);
            }
            hashMap.put("af_preinstalled", Boolean.toString(a(context)));
            if (j.a().b("collectFacebookAttrId", true)) {
                try {
                    try {
                        context.getPackageManager().getApplicationInfo(Constants.PKG_FB, 0);
                        str5 = a(context.getContentResolver());
                    } catch (Throwable th) {
                        com.appsflyer.d.a("Exception while collecting facebook's attribution ID. ", th);
                        str5 = null;
                        if (str5 != null) {
                        }
                        if (j.a().b("deviceTrackingDisabled", false)) {
                        }
                        a7 = ac.a((WeakReference<Context>) new WeakReference(context));
                        if (a7 != null) {
                        }
                        hashMap.put(WebUtils.LANG, Locale.getDefault().getDisplayLanguage());
                        hashMap.put("lang_code", Locale.getDefault().getLanguage());
                        hashMap.put(com.umeng.commonsdk.proguard.d.N, Locale.getDefault().getCountry());
                        hashMap.put("platformextension", this.F.a());
                        a(context, (Map<String, ? super String>) hashMap);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                        if (Build.VERSION.SDK_INT >= 9) {
                        }
                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        sharedPreferences2 = sharedPreferences;
                        try {
                            if (packageInfo.versionCode > sharedPreferences2.getInt("versionCode", 0)) {
                            }
                            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
                            hashMap.put("app_version_name", packageInfo.versionName);
                            if (Build.VERSION.SDK_INT >= 9) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            com.appsflyer.d.a("Exception while collecting app version data ", th);
                            if (str4.length() > 0) {
                            }
                            string = sharedPreferences2.getString("extraReferrers", null);
                            if (string != null) {
                            }
                            a3 = j.a().a("afUninstallToken");
                            if (a3 != null) {
                            }
                            this.D = ah.a(context);
                            StringBuilder sb7 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb7.append(this.D);
                            com.appsflyer.d.c(sb7.toString());
                            if (!this.D) {
                            }
                            if (z2) {
                            }
                            if (z2) {
                            }
                            if (this.B) {
                            }
                            currentTimeMillis = System.currentTimeMillis() - this.z;
                            a4 = j.a().a(context);
                            if (currentTimeMillis > 30000 && a4 != null && a4.contains("AppsFlyer_Test")) {
                            }
                            if (j.a().a("advertiserId") == null) {
                            }
                            a5 = aa.a(context.getContentResolver());
                            if (a5 != null) {
                            }
                            a6 = j.a().a(context);
                            if (a6 != null) {
                            }
                            boolean equals = "true".equals(sharedPreferences2.getString("sentSuccessfully", ""));
                            hashMap.put("registeredUninstall", Boolean.valueOf(sharedPreferences2.getBoolean("sentRegisterRequestToAF", false)));
                            int a25 = a(sharedPreferences2, "appsFlyerCount", z2);
                            hashMap.put("counter", Integer.toString(a25));
                            hashMap.put("iaecounter", Integer.toString(a(sharedPreferences2, "appsFlyerInAppEventCount", str2 == null)));
                            if (z2) {
                            }
                            hashMap.put("isFirstCall", Boolean.toString(!equals));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("cpu_abi", e("ro.product.cpu.abi"));
                            hashMap2.put("cpu_abi2", e("ro.product.cpu.abi2"));
                            hashMap2.put("arch", e("os.arch"));
                            hashMap2.put("build_display_id", e("ro.build.display.id"));
                            if (z2) {
                            }
                            hashMap2.put("dim", com.appsflyer.e.a(context));
                            hashMap.put("deviceData", hashMap2);
                            new ae();
                            String str9 = (String) hashMap.get("appsflyerKey");
                            String str10 = (String) hashMap.get("af_timestamp");
                            String str11 = (String) hashMap.get("uid");
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(str9.substring(0, 7));
                            sb8.append(str11.substring(0, 7));
                            sb8.append(str10.substring(str10.length() - 7));
                            hashMap.put("af_v", ae.a(sb8.toString()));
                            new ae();
                            String str12 = (String) hashMap.get("appsflyerKey");
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(str12);
                            sb9.append(hashMap.get("af_timestamp"));
                            String obj = sb9.toString();
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(obj);
                            sb10.append(hashMap.get("uid"));
                            String obj2 = sb10.toString();
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(obj2);
                            sb11.append(hashMap.get("installDate"));
                            String obj3 = sb11.toString();
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(obj3);
                            sb12.append(hashMap.get("counter"));
                            String obj4 = sb12.toString();
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(obj4);
                            sb13.append(hashMap.get("iaecounter"));
                            hashMap.put("af_v2", ae.a(ae.b(sb13.toString())));
                            if (sharedPreferences2.contains("is_stop_tracking_used")) {
                            }
                            return hashMap;
                        }
                        if (str4.length() > 0) {
                        }
                        string = sharedPreferences2.getString("extraReferrers", null);
                        if (string != null) {
                        }
                        a3 = j.a().a("afUninstallToken");
                        if (a3 != null) {
                        }
                        this.D = ah.a(context);
                        StringBuilder sb72 = new StringBuilder("didConfigureTokenRefreshService=");
                        sb72.append(this.D);
                        com.appsflyer.d.c(sb72.toString());
                        if (!this.D) {
                        }
                        if (z2) {
                        }
                        if (z2) {
                        }
                        if (this.B) {
                        }
                        currentTimeMillis = System.currentTimeMillis() - this.z;
                        a4 = j.a().a(context);
                        if (currentTimeMillis > 30000 && a4 != null && a4.contains("AppsFlyer_Test")) {
                        }
                        if (j.a().a("advertiserId") == null) {
                        }
                        a5 = aa.a(context.getContentResolver());
                        if (a5 != null) {
                        }
                        a6 = j.a().a(context);
                        if (a6 != null) {
                            hashMap.put(TapjoyConstants.TJC_REFERRER, a6);
                        }
                        boolean equals2 = "true".equals(sharedPreferences2.getString("sentSuccessfully", ""));
                        hashMap.put("registeredUninstall", Boolean.valueOf(sharedPreferences2.getBoolean("sentRegisterRequestToAF", false)));
                        int a252 = a(sharedPreferences2, "appsFlyerCount", z2);
                        hashMap.put("counter", Integer.toString(a252));
                        hashMap.put("iaecounter", Integer.toString(a(sharedPreferences2, "appsFlyerInAppEventCount", str2 == null)));
                        if (z2) {
                            j.a().d();
                            if (j.a().b("waitForCustomerId", false)) {
                            }
                        }
                        hashMap.put("isFirstCall", Boolean.toString(!equals2));
                        HashMap hashMap22 = new HashMap();
                        hashMap22.put("cpu_abi", e("ro.product.cpu.abi"));
                        hashMap22.put("cpu_abi2", e("ro.product.cpu.abi2"));
                        hashMap22.put("arch", e("os.arch"));
                        hashMap22.put("build_display_id", e("ro.build.display.id"));
                        if (z2) {
                        }
                        hashMap22.put("dim", com.appsflyer.e.a(context));
                        hashMap.put("deviceData", hashMap22);
                        new ae();
                        String str92 = (String) hashMap.get("appsflyerKey");
                        String str102 = (String) hashMap.get("af_timestamp");
                        String str112 = (String) hashMap.get("uid");
                        StringBuilder sb82 = new StringBuilder();
                        sb82.append(str92.substring(0, 7));
                        sb82.append(str112.substring(0, 7));
                        sb82.append(str102.substring(str102.length() - 7));
                        hashMap.put("af_v", ae.a(sb82.toString()));
                        new ae();
                        String str122 = (String) hashMap.get("appsflyerKey");
                        StringBuilder sb92 = new StringBuilder();
                        sb92.append(str122);
                        sb92.append(hashMap.get("af_timestamp"));
                        String obj5 = sb92.toString();
                        StringBuilder sb102 = new StringBuilder();
                        sb102.append(obj5);
                        sb102.append(hashMap.get("uid"));
                        String obj22 = sb102.toString();
                        StringBuilder sb112 = new StringBuilder();
                        sb112.append(obj22);
                        sb112.append(hashMap.get("installDate"));
                        String obj32 = sb112.toString();
                        StringBuilder sb122 = new StringBuilder();
                        sb122.append(obj32);
                        sb122.append(hashMap.get("counter"));
                        String obj42 = sb122.toString();
                        StringBuilder sb132 = new StringBuilder();
                        sb132.append(obj42);
                        sb132.append(hashMap.get("iaecounter"));
                        hashMap.put("af_v2", ae.a(ae.b(sb132.toString())));
                        if (sharedPreferences2.contains("is_stop_tracking_used")) {
                        }
                        return hashMap;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.appsflyer.d.e("Exception while collecting facebook's attribution ID. ");
                    str5 = null;
                    if (str5 != null) {
                    }
                    if (j.a().b("deviceTrackingDisabled", false)) {
                    }
                    a7 = ac.a((WeakReference<Context>) new WeakReference(context));
                    if (a7 != null) {
                    }
                    hashMap.put(WebUtils.LANG, Locale.getDefault().getDisplayLanguage());
                    hashMap.put("lang_code", Locale.getDefault().getLanguage());
                    hashMap.put(com.umeng.commonsdk.proguard.d.N, Locale.getDefault().getCountry());
                    hashMap.put("platformextension", this.F.a());
                    a(context, (Map<String, ? super String>) hashMap);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                    if (Build.VERSION.SDK_INT >= 9) {
                    }
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    sharedPreferences2 = sharedPreferences;
                    if (packageInfo.versionCode > sharedPreferences2.getInt("versionCode", 0)) {
                    }
                    hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    hashMap.put("app_version_name", packageInfo.versionName);
                    if (Build.VERSION.SDK_INT >= 9) {
                    }
                    if (str4.length() > 0) {
                    }
                    string = sharedPreferences2.getString("extraReferrers", null);
                    if (string != null) {
                    }
                    a3 = j.a().a("afUninstallToken");
                    if (a3 != null) {
                    }
                    this.D = ah.a(context);
                    StringBuilder sb722 = new StringBuilder("didConfigureTokenRefreshService=");
                    sb722.append(this.D);
                    com.appsflyer.d.c(sb722.toString());
                    if (!this.D) {
                    }
                    if (z2) {
                    }
                    if (z2) {
                    }
                    if (this.B) {
                    }
                    currentTimeMillis = System.currentTimeMillis() - this.z;
                    a4 = j.a().a(context);
                    if (currentTimeMillis > 30000 && a4 != null && a4.contains("AppsFlyer_Test")) {
                    }
                    if (j.a().a("advertiserId") == null) {
                    }
                    a5 = aa.a(context.getContentResolver());
                    if (a5 != null) {
                    }
                    a6 = j.a().a(context);
                    if (a6 != null) {
                    }
                    boolean equals22 = "true".equals(sharedPreferences2.getString("sentSuccessfully", ""));
                    hashMap.put("registeredUninstall", Boolean.valueOf(sharedPreferences2.getBoolean("sentRegisterRequestToAF", false)));
                    int a2522 = a(sharedPreferences2, "appsFlyerCount", z2);
                    hashMap.put("counter", Integer.toString(a2522));
                    hashMap.put("iaecounter", Integer.toString(a(sharedPreferences2, "appsFlyerInAppEventCount", str2 == null)));
                    if (z2) {
                    }
                    hashMap.put("isFirstCall", Boolean.toString(!equals22));
                    HashMap hashMap222 = new HashMap();
                    hashMap222.put("cpu_abi", e("ro.product.cpu.abi"));
                    hashMap222.put("cpu_abi2", e("ro.product.cpu.abi2"));
                    hashMap222.put("arch", e("os.arch"));
                    hashMap222.put("build_display_id", e("ro.build.display.id"));
                    if (z2) {
                    }
                    hashMap222.put("dim", com.appsflyer.e.a(context));
                    hashMap.put("deviceData", hashMap222);
                    new ae();
                    String str922 = (String) hashMap.get("appsflyerKey");
                    String str1022 = (String) hashMap.get("af_timestamp");
                    String str1122 = (String) hashMap.get("uid");
                    StringBuilder sb822 = new StringBuilder();
                    sb822.append(str922.substring(0, 7));
                    sb822.append(str1122.substring(0, 7));
                    sb822.append(str1022.substring(str1022.length() - 7));
                    hashMap.put("af_v", ae.a(sb822.toString()));
                    new ae();
                    String str1222 = (String) hashMap.get("appsflyerKey");
                    StringBuilder sb922 = new StringBuilder();
                    sb922.append(str1222);
                    sb922.append(hashMap.get("af_timestamp"));
                    String obj52 = sb922.toString();
                    StringBuilder sb1022 = new StringBuilder();
                    sb1022.append(obj52);
                    sb1022.append(hashMap.get("uid"));
                    String obj222 = sb1022.toString();
                    StringBuilder sb1122 = new StringBuilder();
                    sb1122.append(obj222);
                    sb1122.append(hashMap.get("installDate"));
                    String obj322 = sb1122.toString();
                    StringBuilder sb1222 = new StringBuilder();
                    sb1222.append(obj322);
                    sb1222.append(hashMap.get("counter"));
                    String obj422 = sb1222.toString();
                    StringBuilder sb1322 = new StringBuilder();
                    sb1322.append(obj422);
                    sb1322.append(hashMap.get("iaecounter"));
                    hashMap.put("af_v2", ae.a(ae.b(sb1322.toString())));
                    if (sharedPreferences2.contains("is_stop_tracking_used")) {
                    }
                    return hashMap;
                }
                if (str5 != null) {
                    hashMap.put("fb", str5);
                }
            }
            if (j.a().b("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            } else {
                SharedPreferences sharedPreferences6 = context.getSharedPreferences("appsflyer-data", 0);
                boolean b3 = j.a().b("collectIMEI", true);
                String string3 = sharedPreferences6.getString("imeiCached", null);
                if (b3) {
                    if (Build.VERSION.SDK_INT < 19 || !g(context)) {
                        try {
                            try {
                                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                str6 = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                                if (str6 == null) {
                                    if (this.f3450d != null) {
                                        str6 = this.f3450d;
                                    } else {
                                        if (string3 == null) {
                                            string3 = null;
                                        }
                                        str6 = string3;
                                    }
                                }
                            } catch (InvocationTargetException unused2) {
                                com.appsflyer.d.e("WARNING: READ_PHONE_STATE is missing.");
                            }
                        } catch (Exception e6) {
                            com.appsflyer.d.a("WARNING: READ_PHONE_STATE is missing. ", e6);
                        }
                        if (str6 == null) {
                            b(context, "imeiCached", str6);
                            hashMap.put("imei", str6);
                        } else {
                            com.appsflyer.d.d("IMEI was not collected.");
                        }
                        b2 = j.a().b("collectAndroidId", true);
                        String string4 = sharedPreferences6.getString("androidIdCached", null);
                        if (b2) {
                            if (this.e != null) {
                            }
                            str7 = null;
                            if (str7 != null) {
                            }
                        } else {
                            if (Build.VERSION.SDK_INT < 19 || !g(context)) {
                                try {
                                    str7 = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
                                    if (str7 == null) {
                                        if (this.e != null) {
                                            str7 = this.e;
                                        } else if (string4 != null) {
                                            str7 = string4;
                                        }
                                    }
                                } catch (Exception e7) {
                                    com.appsflyer.d.a(e7.getMessage(), e7);
                                }
                                if (str7 != null) {
                                    b(context, "androidIdCached", str7);
                                    hashMap.put(TapjoyConstants.TJC_ANDROID_ID, str7);
                                } else {
                                    com.appsflyer.d.d("Android ID was not collected.");
                                }
                            }
                            str7 = null;
                            if (str7 != null) {
                            }
                        }
                        str7 = this.e;
                        if (str7 != null) {
                        }
                    }
                    str6 = null;
                    if (str6 == null) {
                    }
                    b2 = j.a().b("collectAndroidId", true);
                    String string42 = sharedPreferences6.getString("androidIdCached", null);
                    if (b2) {
                    }
                    str7 = this.e;
                    if (str7 != null) {
                    }
                } else {
                    if (this.f3450d != null) {
                    }
                    str6 = null;
                    if (str6 == null) {
                    }
                    b2 = j.a().b("collectAndroidId", true);
                    String string422 = sharedPreferences6.getString("androidIdCached", null);
                    if (b2) {
                    }
                    str7 = this.e;
                    if (str7 != null) {
                    }
                }
                str6 = this.f3450d;
                if (str6 == null) {
                }
                b2 = j.a().b("collectAndroidId", true);
                String string4222 = sharedPreferences6.getString("androidIdCached", null);
                if (b2) {
                }
                str7 = this.e;
                if (str7 != null) {
                }
            }
            try {
                a7 = ac.a((WeakReference<Context>) new WeakReference(context));
                if (a7 != null) {
                    hashMap.put("uid", a7);
                }
            } catch (Exception e8) {
                StringBuilder sb14 = new StringBuilder("ERROR: could not get uid ");
                sb14.append(e8.getMessage());
                com.appsflyer.d.a(sb14.toString(), e8);
            }
            try {
                hashMap.put(WebUtils.LANG, Locale.getDefault().getDisplayLanguage());
            } catch (Exception e9) {
                com.appsflyer.d.a("Exception while collecting display language name. ", e9);
            }
            try {
                hashMap.put("lang_code", Locale.getDefault().getLanguage());
            } catch (Exception e10) {
                com.appsflyer.d.a("Exception while collecting display language code. ", e10);
            }
            try {
                hashMap.put(com.umeng.commonsdk.proguard.d.N, Locale.getDefault().getCountry());
            } catch (Exception e11) {
                com.appsflyer.d.a("Exception while collecting country name. ", e11);
            }
            hashMap.put("platformextension", this.F.a());
            a(context, (Map<String, ? super String>) hashMap);
            SimpleDateFormat simpleDateFormat22 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                    simpleDateFormat22.setTimeZone(TimeZone.getTimeZone("UTC"));
                    hashMap.put("installDate", simpleDateFormat22.format(new Date(j2)));
                } catch (Exception e12) {
                    com.appsflyer.d.a("Exception while collecting install date. ", e12);
                }
            }
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                sharedPreferences2 = sharedPreferences;
                if (packageInfo.versionCode > sharedPreferences2.getInt("versionCode", 0)) {
                    b(context, "appsflyerConversionDataRequestRetries", 0);
                    b(context, "versionCode", packageInfo.versionCode);
                }
                hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
                hashMap.put("app_version_name", packageInfo.versionName);
                if (Build.VERSION.SDK_INT >= 9) {
                    long j3 = packageInfo.firstInstallTime;
                    long j4 = packageInfo.lastUpdateTime;
                    simpleDateFormat22.setTimeZone(TimeZone.getTimeZone("UTC"));
                    hashMap.put("date1", simpleDateFormat22.format(new Date(j3)));
                    simpleDateFormat22.setTimeZone(TimeZone.getTimeZone("UTC"));
                    hashMap.put("date2", simpleDateFormat22.format(new Date(j4)));
                    String string5 = context.getSharedPreferences("appsflyer-data", 0).getString("appsFlyerFirstInstall", null);
                    if (string5 == null) {
                        if (!context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount")) {
                            com.appsflyer.d.c("AppsFlyer: first launch detected");
                            string5 = simpleDateFormat22.format(new Date());
                        } else {
                            string5 = "";
                        }
                        b(context, "appsFlyerFirstInstall", string5);
                    }
                    com.appsflyer.d.d("AppsFlyer: first launch date: ".concat(String.valueOf(string5)));
                    hashMap.put("firstLaunchDate", string5);
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferences2 = sharedPreferences;
            }
            if (str4.length() > 0) {
                hashMap.put(TapjoyConstants.TJC_REFERRER, str4);
            }
            string = sharedPreferences2.getString("extraReferrers", null);
            if (string != null) {
                hashMap.put("extraReferrers", string);
            }
            a3 = j.a().a("afUninstallToken");
            if (a3 != null) {
                hashMap.put("af_gcm_token", q.a(a3).a());
            }
            this.D = ah.a(context);
            StringBuilder sb7222 = new StringBuilder("didConfigureTokenRefreshService=");
            sb7222.append(this.D);
            com.appsflyer.d.c(sb7222.toString());
            if (!this.D) {
                hashMap.put("tokenRefreshConfigured", Boolean.FALSE);
            }
            if (z2) {
                if (this.C != null) {
                    JSONObject jSONObject2 = new JSONObject(this.C);
                    jSONObject2.put("isPush", "true");
                    hashMap.put("af_deeplink", jSONObject2.toString());
                }
                this.C = null;
            }
            if (z2) {
                Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
                if (data != null) {
                    a(context, hashMap, data);
                } else if (this.y != null) {
                    a(context, hashMap, this.y);
                }
            }
            if (this.B) {
                hashMap.put("testAppMode_retargeting", "true");
                String jSONObject3 = new JSONObject(hashMap).toString();
                Intent intent2 = new Intent("com.appsflyer.testIntgrationBroadcast");
                intent2.putExtra("params", jSONObject3);
                context.sendBroadcast(intent2);
                com.appsflyer.d.d("Sent retargeting params to test app");
            }
            currentTimeMillis = System.currentTimeMillis() - this.z;
            a4 = j.a().a(context);
            if (currentTimeMillis > 30000 && a4 != null && a4.contains("AppsFlyer_Test")) {
                hashMap.put("testAppMode", "true");
                String jSONObject4 = new JSONObject(hashMap).toString();
                Intent intent3 = new Intent("com.appsflyer.testIntgrationBroadcast");
                intent3.putExtra("params", jSONObject4);
                context.sendBroadcast(intent3);
                com.appsflyer.d.d("Sent params to test app");
                com.appsflyer.d.d("Test mode ended!");
                this.z = 0L;
            }
            if (j.a().a("advertiserId") == null) {
                aa.a(context, hashMap);
                if (j.a().a("advertiserId") != null) {
                    hashMap.put("GAID_retry", "true");
                } else {
                    hashMap.put("GAID_retry", "false");
                }
            }
            a5 = aa.a(context.getContentResolver());
            if (a5 != null) {
                hashMap.put("amazon_aid", a5.a());
                hashMap.put("amazon_aid_limit", String.valueOf(a5.b()));
            }
            a6 = j.a().a(context);
            if (a6 != null && a6.length() > 0 && hashMap.get(TapjoyConstants.TJC_REFERRER) == null) {
                hashMap.put(TapjoyConstants.TJC_REFERRER, a6);
            }
            boolean equals222 = "true".equals(sharedPreferences2.getString("sentSuccessfully", ""));
            hashMap.put("registeredUninstall", Boolean.valueOf(sharedPreferences2.getBoolean("sentRegisterRequestToAF", false)));
            int a25222 = a(sharedPreferences2, "appsFlyerCount", z2);
            hashMap.put("counter", Integer.toString(a25222));
            hashMap.put("iaecounter", Integer.toString(a(sharedPreferences2, "appsFlyerInAppEventCount", str2 == null)));
            if (z2 && a25222 == 1) {
                j.a().d();
                if (j.a().b("waitForCustomerId", false)) {
                    hashMap.put("wait_cid", Boolean.toString(true));
                }
            }
            hashMap.put("isFirstCall", Boolean.toString(!equals222));
            HashMap hashMap2222 = new HashMap();
            hashMap2222.put("cpu_abi", e("ro.product.cpu.abi"));
            hashMap2222.put("cpu_abi2", e("ro.product.cpu.abi2"));
            hashMap2222.put("arch", e("os.arch"));
            hashMap2222.put("build_display_id", e("ro.build.display.id"));
            if (z2) {
                if (this.A) {
                    p pVar = p.a.f3483a;
                    Location a26 = p.a(context);
                    HashMap hashMap3 = new HashMap(3);
                    if (a26 != null) {
                        hashMap3.put(com.umeng.analytics.pro.b.x, String.valueOf(a26.getLatitude()));
                        hashMap3.put("lon", String.valueOf(a26.getLongitude()));
                        hashMap3.put("ts", String.valueOf(a26.getTime()));
                    }
                    if (!hashMap3.isEmpty()) {
                        hashMap2222.put(WebUtils.LOC, hashMap3);
                    }
                }
                o.a a27 = o.b.f3482a.a(context);
                hashMap2222.put("btl", Float.toString(a27.a()));
                if (a27.b() != null) {
                    hashMap2222.put("btch", a27.b());
                }
                if (2 >= a25222) {
                    List<Map<String, Object>> c2 = t.a(context).c();
                    if (!c2.isEmpty()) {
                        hashMap2222.put("sensors", c2);
                    }
                }
            }
            hashMap2222.put("dim", com.appsflyer.e.a(context));
            hashMap.put("deviceData", hashMap2222);
            new ae();
            String str9222 = (String) hashMap.get("appsflyerKey");
            String str10222 = (String) hashMap.get("af_timestamp");
            String str11222 = (String) hashMap.get("uid");
            StringBuilder sb8222 = new StringBuilder();
            sb8222.append(str9222.substring(0, 7));
            sb8222.append(str11222.substring(0, 7));
            sb8222.append(str10222.substring(str10222.length() - 7));
            hashMap.put("af_v", ae.a(sb8222.toString()));
            new ae();
            String str12222 = (String) hashMap.get("appsflyerKey");
            StringBuilder sb9222 = new StringBuilder();
            sb9222.append(str12222);
            sb9222.append(hashMap.get("af_timestamp"));
            String obj522 = sb9222.toString();
            StringBuilder sb10222 = new StringBuilder();
            sb10222.append(obj522);
            sb10222.append(hashMap.get("uid"));
            String obj2222 = sb10222.toString();
            StringBuilder sb11222 = new StringBuilder();
            sb11222.append(obj2222);
            sb11222.append(hashMap.get("installDate"));
            String obj3222 = sb11222.toString();
            StringBuilder sb12222 = new StringBuilder();
            sb12222.append(obj3222);
            sb12222.append(hashMap.get("counter"));
            String obj4222 = sb12222.toString();
            StringBuilder sb13222 = new StringBuilder();
            sb13222.append(obj4222);
            sb13222.append(hashMap.get("iaecounter"));
            hashMap.put("af_v2", ae.a(ae.b(sb13222.toString())));
            if (sharedPreferences2.contains("is_stop_tracking_used")) {
                hashMap.put("istu", String.valueOf(sharedPreferences2.getBoolean("is_stop_tracking_used", false)));
            }
        } catch (Throwable th4) {
            com.appsflyer.d.a(th4.getLocalizedMessage(), th4);
        }
        return hashMap;
    }

    private static void a(Context context, Map<String, ? super String> map) {
        v vVar = v.b.f3507a;
        v.a a2 = v.a(context);
        map.put("network", a2.a());
        if (a2.c() != null) {
            map.put("operator", a2.c());
        }
        if (a2.b() != null) {
            map.put(com.umeng.commonsdk.proguard.d.O, a2.b());
        }
    }

    private void a(Context context, Map<String, Object> map, Uri uri) {
        final Map<String, String> hashMap;
        map.put("af_deeplink", uri.toString());
        if (uri.getQueryParameter("af_deeplink") != null) {
            this.B = "AppsFlyer_Test".equals(uri.getQueryParameter("media_source")) && Boolean.parseBoolean(uri.getQueryParameter("is_retargeting"));
            hashMap = d(context, uri.getQuery());
            String path = uri.getPath();
            if (path != null) {
                hashMap.put("path", path);
            }
            String scheme = uri.getScheme();
            if (scheme != null) {
                hashMap.put("scheme", scheme);
            }
            String host = uri.getHost();
            if (host != null) {
                hashMap.put("host", host);
            }
        } else {
            hashMap = new HashMap<>();
            hashMap.put("link", uri.toString());
        }
        final WeakReference weakReference = new WeakReference(context);
        af afVar = new af(uri, this);
        afVar.a(new l.a());
        if (afVar.c()) {
            afVar.a(new af.a() { // from class: com.appsflyer.i.2
                @Override // com.appsflyer.af.a
                public final void a(String str) {
                    if (i.o != null) {
                        b(hashMap);
                        i.o.b(str);
                    }
                }

                private void b(Map<String, String> map2) {
                    if (weakReference.get() != null) {
                        i.b((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map2).toString());
                    }
                }

                @Override // com.appsflyer.af.a
                public final void a(Map<String, String> map2) {
                    for (String str : map2.keySet()) {
                        hashMap.put(str, map2.get(str));
                    }
                    b(hashMap);
                    i.b(hashMap);
                }
            });
            com.appsflyer.a.a().b().execute(afVar);
        } else if (o != null) {
            try {
                o.b(hashMap);
            } catch (Throwable th) {
                com.appsflyer.d.a(th.getLocalizedMessage(), th);
            }
        }
    }

    private static boolean g(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            com.appsflyer.d.a("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            com.appsflyer.d.a("WARNING:  Google Play Services is unavailable. ", e2);
            return false;
        }
    }

    private static String e(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            com.appsflyer.d.a(th.getMessage(), th);
            return null;
        }
    }

    private static String a(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return a(str, weakReference.get().getPackageManager(), weakReference.get().getPackageName());
    }

    private static String a(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = ((PackageItemInfo) packageManager.getApplicationInfo(str2, 128)).metaData;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            com.appsflyer.d.a(sb.toString(), th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(File file, String str) {
        FileReader fileReader;
        Reader reader = null;
        try {
            try {
                try {
                    Properties properties = new Properties();
                    fileReader = new FileReader(file);
                    try {
                        properties.load(fileReader);
                        com.appsflyer.d.d("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            fileReader.close();
                        } catch (Throwable th) {
                            com.appsflyer.d.a(th.getMessage(), th);
                        }
                        return property;
                    } catch (FileNotFoundException unused) {
                        StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
                        sb.append(file.getAbsolutePath());
                        com.appsflyer.d.c(sb.toString());
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.appsflyer.d.a(th.getMessage(), th);
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        try {
                            reader.close();
                        } catch (Throwable th4) {
                            com.appsflyer.d.a(th4.getMessage(), th4);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                fileReader = null;
            } catch (Throwable th5) {
                th = th5;
                if (0 != 0) {
                }
                throw th;
            }
        } catch (Throwable th6) {
            com.appsflyer.d.a(th6.getMessage(), th6);
        }
    }

    private static File f(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            com.appsflyer.d.a(th.getMessage(), th);
            return null;
        }
    }

    public boolean a(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e2) {
            com.appsflyer.d.a("Could not check if app is pre installed", e2);
        }
        return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(Context context, String str) throws PackageManager.NameNotFoundException {
        SharedPreferences sharedPreferences = context.getSharedPreferences("appsflyer-data", 0);
        if (sharedPreferences.contains("CACHED_CHANNEL")) {
            return sharedPreferences.getString("CACHED_CHANNEL", null);
        }
        b(context, "CACHED_CHANNEL", str);
        return str;
    }

    public String a(ContentResolver contentResolver) {
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
        if (query != null) {
            try {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex("aid"));
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Exception e2) {
                                com.appsflyer.d.a(e2.getMessage(), e2);
                            }
                        }
                        return string;
                    }
                } catch (Exception e3) {
                    com.appsflyer.d.a("Could not collect cursor attribution. ", e3);
                    if (query == null) {
                        return null;
                    }
                    try {
                        query.close();
                        return null;
                    } catch (Exception e4) {
                        com.appsflyer.d.a(e4.getMessage(), e4);
                        return null;
                    }
                }
            } finally {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e5) {
                        com.appsflyer.d.a(e5.getMessage(), e5);
                    }
                }
            }
        }
        return null;
    }

    static SharedPreferences b(Context context) {
        return context.getSharedPreferences("appsflyer-data", 0);
    }

    static int a(SharedPreferences sharedPreferences) {
        return a(sharedPreferences, "appsFlyerCount", false);
    }

    private static int a(SharedPreferences sharedPreferences, String str, boolean z) {
        int i2 = sharedPreferences.getInt(str, 0);
        if (z) {
            i2++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i2);
            if (Build.VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
        if (ag.a().f()) {
            ag.a().a(String.valueOf(i2));
        }
        return i2;
    }

    public String c(Context context) {
        ag.a().a("getAppsFlyerUID", new String[0]);
        return ac.a((WeakReference<Context>) new WeakReference(context));
    }

    private void a(URL url, String str, String str2, WeakReference<Context> weakReference, String str3, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        Context context = weakReference.get();
        boolean z2 = z && o != null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            ag.a().a(url.toString(), str);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(str.getBytes().length));
                httpURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, "application/json");
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoOutput(true);
                try {
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                    try {
                        outputStreamWriter2.write(str);
                        outputStreamWriter2.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        String a2 = a(httpURLConnection);
                        ag.a().a(url.toString(), responseCode, a2);
                        com.appsflyer.d.d("response code: ".concat(String.valueOf(responseCode)));
                        a(context, "AppsFlyer_4.8.10", "SERVER_RESPONSE_CODE", Integer.toString(responseCode));
                        SharedPreferences sharedPreferences = context.getSharedPreferences("appsflyer-data", 0);
                        if (responseCode == 200) {
                            if (weakReference.get() != null && z) {
                                this.k = System.currentTimeMillis();
                            }
                            String a3 = j.a().a("afUninstallToken");
                            if (a3 != null) {
                                com.appsflyer.d.c("Uninstall Token exists: ".concat(String.valueOf(a3)));
                                if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false)) {
                                    com.appsflyer.d.c("Resending Uninstall token to AF servers: ".concat(String.valueOf(a3)));
                                    ah.a(context, new q(a3));
                                }
                            } else if (j.a().a("gcmProjectNumber") != null) {
                                com.appsflyer.d.c("GCM Project number exists. Fetching token and sending to AF servers");
                                new ah.a(new WeakReference(context)).execute(new Void[0]);
                            }
                            if (this.y != null) {
                                this.y = null;
                            }
                            if (str3 != null) {
                                com.appsflyer.a.a.a().a(str3, context);
                            }
                            if (weakReference.get() != null && str3 == null) {
                                b(context, "sentSuccessfully", "true");
                                if (!this.r && System.currentTimeMillis() - this.s >= 15000 && this.t == null) {
                                    this.t = com.appsflyer.a.a().c();
                                    a(this.t, new c(context), 1L, TimeUnit.SECONDS);
                                }
                            }
                            this.G = m.a(a2).optBoolean("send_background", false);
                        }
                        int i2 = sharedPreferences.getInt("appsflyerConversionDataRequestRetries", 0);
                        long j = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0L);
                        if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                            b(context, "attributionId", (String) null);
                            b(context, "appsflyerConversionDataCacheExpiration", 0L);
                        }
                        if (sharedPreferences.getString("attributionId", null) == null && str2 != null && z2 && o != null && i2 <= 5) {
                            ScheduledThreadPoolExecutor c2 = com.appsflyer.a.a().c();
                            a(c2, new b(context.getApplicationContext(), str2, c2), 10L, TimeUnit.MILLISECONDS);
                        } else if (str2 == null) {
                            com.appsflyer.d.e("AppsFlyer dev key is missing.");
                        } else if (z2 && o != null && sharedPreferences.getString("attributionId", null) != null && a(sharedPreferences, "appsFlyerCount", false) > 1) {
                            try {
                                Map<String, String> f2 = f(context);
                                if (f2 != null) {
                                    try {
                                        if (!f2.containsKey("is_first_launch")) {
                                            f2.put("is_first_launch", Boolean.toString(false));
                                        }
                                        o.a(f2);
                                    } catch (Throwable th) {
                                        com.appsflyer.d.a(th.getLocalizedMessage(), th);
                                    }
                                }
                            } catch (y e2) {
                                com.appsflyer.d.a(e2.getMessage(), e2);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStreamWriter = outputStreamWriter2;
                        if (outputStreamWriter != null) {
                            outputStreamWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
    }

    private static void a(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e2) {
                com.appsflyer.d.a("scheduleJob failed with RejectedExecutionException Exception", e2);
                return;
            } catch (Throwable th) {
                com.appsflyer.d.a("scheduleJob failed with Exception", th);
                return;
            }
        }
        com.appsflyer.d.e("scheduler is null, shut downed or terminated");
    }

    @Override // com.appsflyer.r
    public void a(Map<String, String> map) {
        this.q = map;
    }

    public boolean d() {
        return this.H;
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Intent f3462a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<Context> f3463b;

        /* renamed from: c, reason: collision with root package name */
        private String f3464c;

        /* renamed from: d, reason: collision with root package name */
        private String f3465d;
        private String e;
        private String f;
        private ExecutorService g;
        private boolean h;
        private boolean i;

        /* synthetic */ d(i iVar, WeakReference weakReference, String str, String str2, String str3, String str4, ExecutorService executorService, boolean z, Intent intent, byte b2) {
            this(weakReference, str, str2, str3, str4, executorService, z, intent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d(WeakReference<Context> weakReference, String str, String str2, String str3, String str4, boolean z, boolean z2, Intent intent) {
            this.f3463b = weakReference;
            this.f3464c = str;
            this.f3465d = str2;
            this.e = str3;
            this.f = str4;
            this.h = true;
            this.g = z;
            this.i = z2;
            this.f3462a = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.a(i.this, this.f3463b.get(), this.f3464c, this.f3465d, this.e, this.f, this.h, this.i, this.f3462a);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private String f3466a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<Context> f3467b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, Object> f3468c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3469d;
        private int e;

        /* synthetic */ e(i iVar, String str, Map map, Context context, boolean z, int i, byte b2) {
            this(str, map, context, z, i);
        }

        private e(String str, Map<String, Object> map, Context context, boolean z, int i) {
            this.f3467b = null;
            this.f3466a = str;
            this.f3468c = map;
            this.f3467b = new WeakReference<>(context);
            this.f3469d = z;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            String jSONObject;
            if (i.this.d()) {
                return;
            }
            String str2 = null;
            if (this.f3469d && this.e <= 2 && i.a(i.this)) {
                this.f3468c.put("rfr", i.this.q);
            }
            try {
                try {
                    str = (String) this.f3468c.get("appsflyerKey");
                    jSONObject = com.appsflyer.b.a((Map<String, ?>) this.f3468c).toString();
                } catch (IOException e) {
                    e = e;
                }
                try {
                    i.a(i.this, this.f3466a, jSONObject, str, this.f3467b, null, this.f3469d);
                } catch (IOException e2) {
                    e = e2;
                    str2 = jSONObject;
                    com.appsflyer.d.a("Exception while sending request to server. ", e);
                    if (str2 == null || this.f3467b == null || this.f3466a.contains("&isCachedRequest=true&timeincache=")) {
                        return;
                    }
                    com.appsflyer.a.a.a().a(new com.appsflyer.a.b(this.f3466a, str2, "4.8.10"), this.f3467b.get());
                    com.appsflyer.d.a(e.getMessage(), e);
                }
            } catch (Throwable th) {
                com.appsflyer.d.a(th.getMessage(), th);
            }
        }
    }

    class b extends a {
        public b(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }

        @Override // com.appsflyer.i.a
        public final String a() {
            return m.b("https://api.%s/install_data/v3/");
        }

        @Override // com.appsflyer.i.a
        protected final void a(Map<String, String> map) {
            map.put("is_first_launch", Boolean.toString(true));
            i.o.a(map);
            i.b(this.f3455a.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        @Override // com.appsflyer.i.a
        protected final void a(String str, int i) {
            i.o.a(str);
            if (i < 400 || i >= 500) {
                return;
            }
            i.b(this.f3455a.get(), "appsflyerConversionDataRequestRetries", i.b(this.f3455a.get()).getInt("appsflyerConversionDataRequestRetries", 0) + 1);
        }
    }

    abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<Context> f3455a;

        /* renamed from: b, reason: collision with root package name */
        private String f3456b;

        /* renamed from: c, reason: collision with root package name */
        private ScheduledExecutorService f3457c;

        /* renamed from: d, reason: collision with root package name */
        private AtomicInteger f3458d = new AtomicInteger(0);

        public abstract String a();

        protected abstract void a(String str, int i);

        protected abstract void a(Map<String, String> map);

        a(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.f3455a = null;
            this.f3455a = new WeakReference<>(context);
            this.f3456b = str;
            if (scheduledExecutorService == null) {
                this.f3457c = com.appsflyer.a.a().c();
            } else {
                this.f3457c = scheduledExecutorService;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            Context context;
            if (this.f3456b == null || this.f3456b.length() == 0 || i.this.d()) {
                return;
            }
            this.f3458d.incrementAndGet();
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    context = this.f3455a.get();
                } catch (Throwable th) {
                    th = th;
                }
                if (context == null) {
                    this.f3458d.decrementAndGet();
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String e = i.e(context, i.b(new WeakReference(context)));
                String str = "";
                if (e != null) {
                    if (i.m.contains(e.toLowerCase())) {
                        com.appsflyer.d.e(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", e));
                    } else {
                        str = "-".concat(String.valueOf(e));
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(a());
                sb.append(context.getPackageName());
                sb.append(str);
                sb.append("?devkey=");
                sb.append(this.f3456b);
                sb.append("&device_id=");
                sb.append(ac.a((WeakReference<Context>) new WeakReference(context)));
                ag.a().a(sb.toString(), "");
                StringBuilder sb2 = new StringBuilder("Calling server for attribution url: ");
                sb2.append(sb.toString());
                t.AnonymousClass3.b(sb2.toString());
                httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    String a2 = i.a(httpURLConnection);
                    ag.a().a(sb.toString(), responseCode, a2);
                    if (responseCode == 200) {
                        i.b(context, "appsflyerGetConversionDataTiming", (System.currentTimeMillis() - currentTimeMillis) / 1000);
                        t.AnonymousClass3.b("Attribution data: ".concat(String.valueOf(a2)));
                        if (a2.length() > 0 && context != null) {
                            Map<String, String> d2 = i.d(a2);
                            String str2 = d2.get("iscache");
                            if (str2 != null && Boolean.toString(false).equals(str2)) {
                                i.b(context, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (d2.containsKey("af_siteid")) {
                                if (d2.containsKey("af_channel")) {
                                    StringBuilder sb3 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb3.append(d2.get("af_channel"));
                                    com.appsflyer.d.c(sb3.toString());
                                } else {
                                    com.appsflyer.d.c(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", d2.get("af_siteid")));
                                }
                            }
                            if (d2.containsKey("af_siteid")) {
                                StringBuilder sb4 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb4.append(d2.get("af_channel"));
                                com.appsflyer.d.c(sb4.toString());
                            }
                            d2.put("is_first_launch", Boolean.toString(false));
                            String jSONObject = new JSONObject(d2).toString();
                            if (jSONObject != null) {
                                i.b(context, "attributionId", jSONObject);
                            } else {
                                i.b(context, "attributionId", a2);
                            }
                            StringBuilder sb5 = new StringBuilder("iscache=");
                            sb5.append(str2);
                            sb5.append(" caching conversion data");
                            com.appsflyer.d.c(sb5.toString());
                            if (i.o != null && this.f3458d.intValue() <= 1) {
                                try {
                                    d2 = i.f(context);
                                } catch (y e2) {
                                    com.appsflyer.d.a("Exception while trying to fetch attribution data. ", e2);
                                }
                                a(d2);
                            }
                        }
                    } else {
                        if (i.o != null) {
                            a("Error connection to server: ".concat(String.valueOf(responseCode)), responseCode);
                        }
                        StringBuilder sb6 = new StringBuilder("AttributionIdFetcher response code: ");
                        sb6.append(responseCode);
                        sb6.append("  url: ");
                        sb6.append((Object) sb);
                        t.AnonymousClass3.b(sb6.toString());
                    }
                    this.f3458d.decrementAndGet();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    if (i.o != null) {
                        a(th.getMessage(), 0);
                    }
                    com.appsflyer.d.a(th.getMessage(), th);
                    this.f3458d.decrementAndGet();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    this.f3457c.shutdown();
                }
                this.f3457c.shutdown();
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005d, code lost:
    
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String a(HttpURLConnection httpURLConnection) {
        InputStreamReader inputStreamReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream == null) {
                        errorStream = httpURLConnection.getInputStream();
                    }
                    inputStreamReader = new InputStreamReader(errorStream);
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                                sb.append('\n');
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                StringBuilder sb2 = new StringBuilder("Could not read connection response from: ");
                                sb2.append(httpURLConnection.getURL().toString());
                                com.appsflyer.d.a(sb2.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                            }
                        }
                        bufferedReader2.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
            inputStreamReader.close();
        } catch (Throwable unused) {
        }
        String obj = sb.toString();
        try {
            new JSONObject(obj);
            return obj;
        } catch (JSONException unused2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", obj);
                return jSONObject.toString();
            } catch (JSONException unused3) {
                return new JSONObject().toString();
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<Context> f3460a;

        public c(Context context) {
            this.f3460a = null;
            this.f3460a = new WeakReference<>(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (i.this.r) {
                return;
            }
            i.this.s = System.currentTimeMillis();
            if (this.f3460a == null) {
                return;
            }
            i.this.r = true;
            try {
                try {
                    String c2 = i.c("AppsFlyerKey");
                    synchronized (this.f3460a) {
                        for (com.appsflyer.a.b bVar : com.appsflyer.a.a.a().b(this.f3460a.get())) {
                            StringBuilder sb = new StringBuilder("resending request: ");
                            sb.append(bVar.c());
                            com.appsflyer.d.d(sb.toString());
                            try {
                                long currentTimeMillis = System.currentTimeMillis();
                                long parseLong = Long.parseLong(bVar.d(), 10);
                                i iVar = i.this;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(bVar.c());
                                sb2.append("&isCachedRequest=true&timeincache=");
                                sb2.append(Long.toString((currentTimeMillis - parseLong) / 1000));
                                i.a(iVar, sb2.toString(), bVar.b(), c2, this.f3460a, bVar.d(), false);
                            } catch (Exception e) {
                                com.appsflyer.d.a("Failed to resend cached request", e);
                            }
                        }
                    }
                } catch (Exception e2) {
                    com.appsflyer.d.a("failed to check cache. ", e2);
                }
                i.this.r = false;
                i.this.t.shutdown();
                i.e(i.this);
            } catch (Throwable th) {
                i.this.r = false;
                throw th;
            }
        }
    }

    private static float h(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (intExtra / intExtra2) * 100.0f;
        } catch (Throwable th) {
            com.appsflyer.d.a(th.getMessage(), th);
            return 1.0f;
        }
    }

    public String e() {
        String a2 = j.a().a("custom_host");
        return a2 != null ? a2 : "appsflyer.com";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("appsflyer-data", 0).edit();
        edit.putString(str, str2);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("appsflyer-data", 0).edit();
        edit.putInt(str, i2);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("appsflyer-data", 0).edit();
        edit.putLong(str, j);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }
}
