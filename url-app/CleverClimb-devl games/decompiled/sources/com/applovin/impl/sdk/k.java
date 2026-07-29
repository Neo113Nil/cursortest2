package com.applovin.impl.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.impl.sdk.d.i;
import com.applovin.impl.sdk.d.q;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.cmplay.base.util.webview.util.WebUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.mopub.common.AdType;
import com.mopub.common.GpsHelper;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.ProductRequestItem;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Queue<String> f3295a = new LinkedList();
    private static String f;
    private static String g;
    private static int h;

    /* renamed from: b, reason: collision with root package name */
    private final j f3296b;

    /* renamed from: c, reason: collision with root package name */
    private final p f3297c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f3298d;
    private final Map<Class, Object> e;
    private final AtomicReference<a> i = new AtomicReference<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3303a;

        /* renamed from: b, reason: collision with root package name */
        public String f3304b = "";
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f3305a;

        /* renamed from: b, reason: collision with root package name */
        public String f3306b;

        /* renamed from: c, reason: collision with root package name */
        public String f3307c;

        /* renamed from: d, reason: collision with root package name */
        public String f3308d;
        public String e;
        public long f;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f3309a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f3310b = -1;
    }

    public static class d {
        public Boolean A;

        /* renamed from: a, reason: collision with root package name */
        public String f3311a;

        /* renamed from: b, reason: collision with root package name */
        public String f3312b;

        /* renamed from: c, reason: collision with root package name */
        public String f3313c;

        /* renamed from: d, reason: collision with root package name */
        public String f3314d;
        public String e;
        public String f;
        public String g;
        public int h;
        public String i;
        public String j;
        public Locale k;
        public String l;
        public float m;
        public int n;
        public double o;
        public int p;
        public boolean q;
        public c r;
        public int s;
        public String t;
        public boolean u;
        public boolean v;
        public boolean w;
        public String x;
        public long y;
        public Boolean z;
    }

    static {
        f3295a.add("act");
        f3295a.add("acm");
        f3295a.add("adr");
        f3295a.add("build");
        f3295a.add("volume");
        f3295a.add("ua");
    }

    protected k(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3296b = jVar;
        this.f3297c = jVar.u();
        this.f3298d = jVar.w();
        this.e = Collections.synchronizedMap(new HashMap());
    }

    private d a(d dVar) {
        if (dVar == null) {
            dVar = new d();
        }
        dVar.z = g.a(this.f3298d);
        dVar.A = g.b(this.f3298d);
        dVar.r = ((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.en)).booleanValue() ? j() : null;
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.ev)).booleanValue()) {
            dVar.q = n();
        }
        try {
            if (((AudioManager) this.f3298d.getSystemService("audio")) != null) {
                dVar.s = (int) (r0.getStreamVolume(3) * ((Float) this.f3296b.a(com.applovin.impl.sdk.b.b.ew)).floatValue());
            }
        } catch (Throwable th) {
            this.f3297c.b("DataCollector", "Unable to collect volume", th);
        }
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.ex)).booleanValue()) {
            if (f == null) {
                String r = r();
                if (!com.applovin.impl.sdk.e.i.b(r)) {
                    r = "";
                }
                f = r;
            }
            if (com.applovin.impl.sdk.e.i.b(f)) {
                dVar.t = f;
            }
        }
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eq)).booleanValue()) {
            try {
                dVar.y = Environment.getDataDirectory().getFreeSpace();
            } catch (Throwable th2) {
                dVar.y = -1L;
                this.f3297c.b("DataCollector", "Unable to collect free space.", th2);
            }
        }
        String str = (String) this.f3296b.v().a(com.applovin.impl.sdk.b.b.ez);
        if (g == null || !str.equalsIgnoreCase(g)) {
            try {
                g = str;
                PackageInfo packageInfo = this.f3298d.getPackageManager().getPackageInfo(str, 0);
                dVar.p = packageInfo.versionCode;
                h = packageInfo.versionCode;
            } catch (Throwable unused) {
                h = 0;
            }
        } else {
            dVar.p = h;
        }
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eo)).booleanValue()) {
            dVar.w = m();
        }
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.ep)).booleanValue()) {
            String k = k();
            if (!TextUtils.isEmpty(k)) {
                dVar.x = k;
            }
        }
        dVar.l = g();
        return dVar;
    }

    private boolean a(String str) {
        return a(str, this.f3298d);
    }

    public static boolean a(String str, Context context) {
        if (str == null) {
            throw new IllegalArgumentException("No permission name specified");
        }
        if (context != null) {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        }
        throw new IllegalArgumentException("No context specified");
    }

    private boolean a(String str, com.applovin.impl.sdk.b.b<String> bVar) {
        Iterator<String> it = com.applovin.impl.sdk.e.c.a((String) this.f3296b.a(bVar)).iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private String b(int i) {
        String str;
        JSONObject jSONObject = new JSONObject(f());
        PriorityQueue priorityQueue = new PriorityQueue(f3295a);
        while (true) {
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(Charset.defaultCharset()), 2);
            if (encodeToString.length() <= i) {
                return encodeToString;
            }
            do {
                str = (String) priorityQueue.poll();
                if (jSONObject.has(str)) {
                    break;
                }
            } while (!priorityQueue.isEmpty());
            if (TextUtils.isEmpty(str)) {
                this.f3297c.d("DataCollector", "Unable to generate base64 request parameters with max length: " + i);
                return "";
            }
            jSONObject.remove(str);
        }
    }

    private String b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        int length2 = iArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = length2 - 1; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    private String c(int i) {
        if (i == 1) {
            return "receiver";
        }
        if (i == 2) {
            return "speaker";
        }
        if (i == 4 || i == 3) {
            return "headphones";
        }
        if (i == 8) {
            return "bluetootha2dpoutput";
        }
        if (i == 13 || i == 19 || i == 5 || i == 6 || i == 12 || i == 11) {
            return "lineout";
        }
        if (i == 9 || i == 10) {
            return "hdmioutput";
        }
        return null;
    }

    private Map<String, String> f() {
        return a(null, false, true);
    }

    private String g() {
        String str;
        try {
            int e = com.applovin.impl.sdk.e.l.e(this.f3298d);
            if (e == 1) {
                str = TJAdUnitConstants.String.PORTRAIT;
            } else {
                if (e != 2) {
                    return "none";
                }
                str = TJAdUnitConstants.String.LANDSCAPE;
            }
            return str;
        } catch (Throwable th) {
            this.f3296b.u().b("DataCollector", "Encountered error while attempting to collect application orientation", th);
            return "none";
        }
    }

    private a h() {
        p pVar;
        String str;
        String str2;
        try {
            ContentResolver contentResolver = this.f3298d.getContentResolver();
            String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
            a aVar = new a();
            if (string == null) {
                string = "";
            }
            aVar.f3304b = string;
            aVar.f3303a = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
            return aVar;
        } catch (Settings.SettingNotFoundException e) {
            e = e;
            pVar = this.f3297c;
            str = "DataCollector";
            str2 = "Unable to determine if FireOS limited ad tracking is turned on";
            pVar.b(str, str2, e);
            return null;
        } catch (Throwable th) {
            e = th;
            pVar = this.f3297c;
            str = "DataCollector";
            str2 = "Unable to collect FireOS IDFA";
            pVar.b(str, str2, e);
            return null;
        }
    }

    private a i() {
        Object invoke;
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            if (cls != null && (invoke = cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.f3298d)) != null) {
                Class<?> cls2 = invoke.getClass();
                Object invoke2 = cls2.getMethod(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, (Class[]) null).invoke(invoke, (Object[]) null);
                String str = (String) cls2.getMethod("getId", (Class[]) null).invoke(invoke, (Object[]) null);
                if (str == null) {
                    str = "";
                }
                a aVar = new a();
                aVar.f3303a = ((Boolean) invoke2).booleanValue();
                aVar.f3304b = str;
                return aVar;
            }
        } catch (ClassNotFoundException e) {
            this.f3297c.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e);
        } catch (Throwable th) {
            this.f3297c.b("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
        }
        return new a();
    }

    private c j() {
        try {
            c cVar = new c();
            Intent registerReceiver = this.f3298d.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
            if (intExtra <= 0 || intExtra2 <= 0) {
                cVar.f3310b = -1;
            } else {
                cVar.f3310b = (int) ((intExtra / intExtra2) * 100.0f);
            }
            cVar.f3309a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
            return cVar;
        } catch (Throwable th) {
            this.f3297c.b("DataCollector", "Unable to collect battery info", th);
            return null;
        }
    }

    private String k() {
        try {
            AudioManager audioManager = (AudioManager) this.f3298d.getSystemService("audio");
            StringBuilder sb = new StringBuilder();
            if (com.applovin.impl.sdk.e.d.g()) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    String c2 = c(audioDeviceInfo.getType());
                    if (!TextUtils.isEmpty(c2)) {
                        sb.append(c2);
                        sb.append(",");
                    }
                }
            } else {
                if (audioManager.isWiredHeadsetOn()) {
                    sb.append("headphones");
                    sb.append(",");
                }
                if (audioManager.isBluetoothA2dpOn()) {
                    sb.append("bluetootha2dpoutput");
                }
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                this.f3297c.a("DataCollector", "No sound outputs detected");
            }
            return sb2;
        } catch (Throwable th) {
            this.f3297c.b("DataCollector", "Unable to collect sound outputs", th);
            return null;
        }
    }

    private double l() {
        double offset = TimeZone.getDefault().getOffset(new Date().getTime());
        Double.isNaN(offset);
        double round = Math.round((offset * 10.0d) / 3600000.0d);
        Double.isNaN(round);
        return round / 10.0d;
    }

    private boolean m() {
        try {
            if (this.f3296b.g()) {
                return this.f3298d.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            }
            PackageManager packageManager = this.f3298d.getPackageManager();
            return com.applovin.impl.sdk.e.d.f() ? packageManager.hasSystemFeature(DeviceProperties.FEATURE_TV_3) : com.applovin.impl.sdk.e.d.c() ? packageManager.hasSystemFeature(DeviceProperties.FEATURE_TV_2) : !packageManager.hasSystemFeature("android.hardware.touchscreen");
        } catch (Throwable th) {
            this.f3297c.b("DataCollector", "Failed to determine if device is TV.", th);
            return false;
        }
    }

    private boolean n() {
        try {
            if (!o()) {
                if (!p()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean o() {
        String str = Build.TAGS;
        return str != null && str.contains(b("lz}$blpz"));
    }

    private boolean p() {
        for (String str : new String[]{"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"}) {
            if (new File(b(str)).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean q() {
        return a(Build.DEVICE, com.applovin.impl.sdk.b.b.es) || a(Build.HARDWARE, com.applovin.impl.sdk.b.b.er) || a(Build.MANUFACTURER, com.applovin.impl.sdk.b.b.et) || a(Build.MODEL, com.applovin.impl.sdk.b.b.eu);
    }

    private String r() {
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(this.f3298d.getMainLooper()).post(new Runnable() { // from class: com.applovin.impl.sdk.k.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        atomicReference.set(new WebView(k.this.f3298d).getSettings().getUserAgentString());
                    } catch (Throwable th) {
                        k.this.f3297c.b("DataCollector", "Unable to collect user agent string", th);
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await(((Long) this.f3296b.a(com.applovin.impl.sdk.b.b.ey)).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
        return (String) atomicReference.get();
    }

    private String s() {
        if (!com.applovin.impl.sdk.e.d.b() || !com.applovin.impl.sdk.e.d.a((Class<?>) AppLovinInterstitialActivity.class, this.f3298d)) {
            return "custom_size,launch_app";
        }
        return "custom_size,launch_app,video";
    }

    com.applovin.impl.sdk.ad.f a(int i) {
        String b2 = b(i);
        boolean z = this.i.get() != null;
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eV)).booleanValue()) {
            return new com.applovin.impl.sdk.ad.f(com.applovin.impl.sdk.e.h.a(b2, this.f3296b.s(), com.applovin.impl.sdk.e.l.a(this.f3296b)), z);
        }
        return new com.applovin.impl.sdk.ad.f(b2, z);
    }

    public d a() {
        d dVar;
        TelephonyManager telephonyManager;
        Object obj = this.e.get(d.class);
        if (obj != null) {
            dVar = (d) obj;
        } else {
            dVar = new d();
            dVar.k = Locale.getDefault();
            dVar.f3311a = Build.MODEL;
            dVar.f3312b = Build.VERSION.RELEASE;
            dVar.f3313c = b();
            dVar.f3314d = Build.MANUFACTURER;
            dVar.e = Build.BRAND;
            dVar.f = Build.HARDWARE;
            dVar.h = Build.VERSION.SDK_INT;
            dVar.g = Build.DEVICE;
            dVar.o = l();
            dVar.u = q();
            try {
                dVar.v = ((SensorManager) this.f3298d.getSystemService(com.umeng.commonsdk.proguard.d.aa)).getDefaultSensor(4) != null;
            } catch (Throwable th) {
                this.f3297c.b("DataCollector", "Unable to retrieve gyroscope availability", th);
            }
            if (a("android.permission.READ_PHONE_STATE") && (telephonyManager = (TelephonyManager) this.f3298d.getSystemService("phone")) != null) {
                dVar.i = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                try {
                    dVar.j = URLEncoder.encode(networkOperatorName, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    dVar.j = networkOperatorName;
                }
            }
            try {
                DisplayMetrics displayMetrics = this.f3298d.getResources().getDisplayMetrics();
                dVar.m = displayMetrics.density;
                dVar.n = displayMetrics.densityDpi;
            } catch (Throwable unused2) {
            }
            this.e.put(d.class, dVar);
        }
        return a(dVar);
    }

    public Map<String, String> a(Map<String, String> map, boolean z, boolean z2) {
        a d2;
        HashMap hashMap = new HashMap();
        d a2 = a();
        hashMap.put("brand", com.applovin.impl.sdk.e.i.e(a2.f3314d));
        hashMap.put("brand_name", com.applovin.impl.sdk.e.i.e(a2.e));
        hashMap.put("hardware", com.applovin.impl.sdk.e.i.e(a2.f));
        hashMap.put("api_level", String.valueOf(a2.h));
        hashMap.put(com.umeng.commonsdk.proguard.d.O, com.applovin.impl.sdk.e.i.e(a2.j));
        hashMap.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, com.applovin.impl.sdk.e.i.e(a2.i));
        hashMap.put("locale", com.applovin.impl.sdk.e.i.e(a2.k.toString()));
        hashMap.put("model", com.applovin.impl.sdk.e.i.e(a2.f3311a));
        hashMap.put(com.umeng.commonsdk.proguard.d.w, com.applovin.impl.sdk.e.i.e(a2.f3312b));
        hashMap.put(TapjoyConstants.TJC_PLATFORM, com.applovin.impl.sdk.e.i.e(a2.f3313c));
        hashMap.put("revision", com.applovin.impl.sdk.e.i.e(a2.g));
        hashMap.put("orientation_lock", a2.l);
        hashMap.put("tz_offset", String.valueOf(a2.o));
        hashMap.put("wvvc", String.valueOf(a2.p));
        hashMap.put("adns", String.valueOf(a2.m));
        hashMap.put("adnsd", String.valueOf(a2.n));
        hashMap.put("sim", com.applovin.impl.sdk.e.i.a(a2.u));
        hashMap.put("gy", com.applovin.impl.sdk.e.i.a(a2.v));
        hashMap.put(ProductRequestItem.Device.TYPE_TV, com.applovin.impl.sdk.e.i.a(a2.w));
        hashMap.put("fs", String.valueOf(a2.y));
        hashMap.put("adr", com.applovin.impl.sdk.e.i.a(a2.q));
        hashMap.put("volume", String.valueOf(a2.s));
        com.applovin.impl.sdk.e.l.a("ua", com.applovin.impl.sdk.e.i.e(a2.t), hashMap);
        com.applovin.impl.sdk.e.l.a("so", com.applovin.impl.sdk.e.i.e(a2.x), hashMap);
        c cVar = a2.r;
        if (cVar != null) {
            hashMap.put("act", String.valueOf(cVar.f3309a));
            hashMap.put("acm", String.valueOf(cVar.f3310b));
        }
        Boolean bool = a2.z;
        if (bool != null) {
            hashMap.put("huc", bool.toString());
        }
        Boolean bool2 = a2.A;
        if (bool2 != null) {
            hashMap.put("aru", bool2.toString());
        }
        Point a3 = com.applovin.impl.sdk.e.d.a(this.f3298d);
        hashMap.put("dx", Integer.toString(a3.x));
        hashMap.put("dy", Integer.toString(a3.y));
        hashMap.put("accept", s());
        hashMap.put("api_did", this.f3296b.a(com.applovin.impl.sdk.b.b.M));
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("build", Integer.toString(109));
        hashMap.put("format", AdType.STATIC_NATIVE);
        b c2 = c();
        hashMap.put("app_version", com.applovin.impl.sdk.e.i.e(c2.f3306b));
        hashMap.put("ia", Long.toString(c2.f));
        hashMap.put("tg", String.valueOf(c2.e));
        hashMap.put("installer_name", c2.f3308d);
        com.applovin.impl.sdk.e.l.a("mediation_provider", com.applovin.impl.sdk.e.i.e(this.f3296b.m()), hashMap);
        hashMap.put("network", com.applovin.impl.sdk.e.e.d(this.f3296b));
        com.applovin.impl.sdk.e.l.a("plugin_version", (String) this.f3296b.a(com.applovin.impl.sdk.b.b.ei), hashMap);
        hashMap.put("preloading", String.valueOf(z));
        com.applovin.impl.sdk.e.l.a("test_ads", Boolean.valueOf(this.f3296b.l().isTestAdsEnabled()), hashMap);
        hashMap.put("first_install", String.valueOf(this.f3296b.A()));
        if (!((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eU)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3296b.s());
        }
        hashMap.put(WebUtils.SC, this.f3296b.a(com.applovin.impl.sdk.b.b.Q));
        hashMap.put("sc2", this.f3296b.a(com.applovin.impl.sdk.b.b.R));
        hashMap.put("server_installed_at", com.applovin.impl.sdk.e.i.e((String) this.f3296b.a(com.applovin.impl.sdk.b.b.S)));
        com.applovin.impl.sdk.e.l.a("persisted_data", com.applovin.impl.sdk.e.i.e((String) this.f3296b.a(com.applovin.impl.sdk.b.d.r)), hashMap);
        hashMap.put("v1", Boolean.toString(com.applovin.impl.sdk.e.d.a("android.permission.WRITE_EXTERNAL_STORAGE", this.f3298d)));
        hashMap.put("v2", Boolean.toString(com.applovin.impl.sdk.e.d.a((Class<?>) AppLovinInterstitialActivity.class, this.f3298d)));
        hashMap.put("v3", Boolean.toString(com.applovin.impl.sdk.e.d.b(this.f3298d)));
        hashMap.put("v4", Boolean.toString(com.applovin.impl.sdk.e.d.c(this.f3298d)));
        hashMap.put("v5", Boolean.toString(com.applovin.impl.sdk.e.d.a((Class<?>) AppLovinWebViewActivity.class, this.f3298d)));
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eA)).booleanValue()) {
            com.applovin.impl.sdk.c.h D = this.f3296b.D();
            hashMap.put("li", String.valueOf(D.b(com.applovin.impl.sdk.c.g.f3051b)));
            hashMap.put("si", String.valueOf(D.b(com.applovin.impl.sdk.c.g.f3053d)));
            hashMap.put("pf", String.valueOf(D.b(com.applovin.impl.sdk.c.g.h)));
            hashMap.put("mpf", String.valueOf(D.b(com.applovin.impl.sdk.c.g.q)));
            hashMap.put("gpf", String.valueOf(D.b(com.applovin.impl.sdk.c.g.i)));
        }
        hashMap.put("vz", com.applovin.impl.sdk.e.i.a(this.f3298d.getPackageName(), this.f3296b));
        if (this.f3296b.i()) {
            hashMap.put("pnr", Boolean.toString(this.f3296b.j()));
        }
        if (z2) {
            d2 = this.i.get();
            if (d2 == null) {
                d2 = new a();
                hashMap.put("inc", Boolean.toString(true));
            }
            e();
        } else {
            d2 = this.f3296b.G().d();
        }
        String str = d2.f3304b;
        if (com.applovin.impl.sdk.e.i.b(str)) {
            hashMap.put("idfa", str);
        }
        hashMap.put("dnt", Boolean.toString(d2.f3303a));
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public String b() {
        return this.f3296b.g() ? "fireos" : TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
    }

    public b c() {
        PackageInfo packageInfo;
        Object obj = this.e.get(b.class);
        if (obj != null) {
            return (b) obj;
        }
        ApplicationInfo applicationInfo = this.f3298d.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        PackageManager packageManager = this.f3298d.getPackageManager();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f3298d.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        b bVar = new b();
        bVar.f3307c = applicationInfo.packageName;
        if (str == null) {
            str = "";
        }
        bVar.f3308d = str;
        bVar.f = lastModified;
        bVar.f3305a = String.valueOf(packageManager.getApplicationLabel(applicationInfo));
        bVar.f3306b = packageInfo != null ? packageInfo.versionName : "";
        bVar.e = (String) this.f3296b.a(com.applovin.impl.sdk.b.d.f3009c);
        this.e.put(b.class, bVar);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a d() {
        a i;
        if (this.f3296b.g()) {
            i = h();
            if (i == null) {
                if (!((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.ek)).booleanValue()) {
                    i = new a();
                }
            }
            if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eh)).booleanValue()) {
                return new a();
            }
            if (!i.f3303a || ((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eg)).booleanValue()) {
                return i;
            }
            i.f3304b = "";
            return i;
        }
        i = i();
        if (((Boolean) this.f3296b.a(com.applovin.impl.sdk.b.b.eh)).booleanValue()) {
        }
    }

    public void e() {
        this.f3296b.C().a(new com.applovin.impl.sdk.d.i(this.f3296b, new i.a() { // from class: com.applovin.impl.sdk.k.2
            @Override // com.applovin.impl.sdk.d.i.a
            public void a(a aVar) {
                k.this.i.set(aVar);
            }
        }), q.a.BACKGROUND);
    }
}
