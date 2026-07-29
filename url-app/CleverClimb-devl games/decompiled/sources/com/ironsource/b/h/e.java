package com.ironsource.b.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.b.d.c;
import com.ironsource.b.m;
import com.mopub.common.GpsHelper;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* compiled from: GeneralPropertiesWorker.java */
/* loaded from: classes2.dex */
public class e implements Runnable {
    private Context A;

    /* renamed from: a, reason: collision with root package name */
    private final String f6936a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private final String f6937b = "bundleId";

    /* renamed from: c, reason: collision with root package name */
    private final String f6938c = GpsHelper.ADVERTISING_ID_KEY;

    /* renamed from: d, reason: collision with root package name */
    private final String f6939d = GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY;
    private final String e = "appKey";
    private final String f = "deviceOS";
    private final String g = "osVersion";
    private final String h = "connectionType";
    private final String i = com.umeng.commonsdk.proguard.d.M;
    private final String j = "deviceOEM";
    private final String k = "deviceModel";
    private final String l = "mobileCarrier";
    private final String m = "externalFreeMemory";
    private final String n = "internalFreeMemory";
    private final String o = com.umeng.commonsdk.proguard.d.W;
    private final String p = com.umeng.analytics.pro.b.x;
    private final String q = "lon";
    private final String r = "gmtMinutesOffset";
    private final String s = "appVersion";
    private final String t = "sessionId";
    private final String u = "pluginType";
    private final String v = "pluginVersion";
    private final String w = "plugin_fw_v";
    private final String x = "jb";
    private final String y = "advertisingIdType";
    private final String z = "mt";

    private String g() {
        return "Android";
    }

    private e() {
    }

    public e(Context context) {
        this.A = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.ironsource.b.f.e.a().a(a());
            g.a(this.A, com.ironsource.b.f.e.a().b());
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "Thread name = " + getClass().getSimpleName(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, Object> a() {
        String str;
        boolean z;
        String a2;
        String j;
        String k;
        String l;
        String m;
        int t;
        String b2;
        String c2;
        String d2;
        String valueOf;
        String v;
        double[] r;
        String[] a3;
        HashMap hashMap = new HashMap();
        String u = u();
        if (!TextUtils.isEmpty(u)) {
            hashMap.put("sessionId", u);
        }
        String e = e();
        if (!TextUtils.isEmpty(e)) {
            hashMap.put("bundleId", e);
            String c3 = com.ironsource.environment.a.c(this.A, e);
            if (!TextUtils.isEmpty(c3)) {
                hashMap.put("appVersion", c3);
            }
        }
        hashMap.put("appKey", f());
        str = "";
        String str2 = "";
        try {
            a3 = com.ironsource.environment.c.a(this.A);
        } catch (Exception unused) {
        }
        if (a3 != null && a3.length == 2) {
            str = TextUtils.isEmpty(a3[0]) ? "" : a3[0];
            z = Boolean.valueOf(a3[1]).booleanValue();
            if (TextUtils.isEmpty(str)) {
                str2 = "GAID";
            } else {
                str = com.ironsource.environment.c.l(this.A);
                if (!TextUtils.isEmpty(str)) {
                    str2 = "UUID";
                }
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(GpsHelper.ADVERTISING_ID_KEY, str);
                hashMap.put("advertisingIdType", str2);
                hashMap.put(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, Boolean.valueOf(z));
            }
            hashMap.put("deviceOS", g());
            if (!TextUtils.isEmpty(h())) {
                hashMap.put("osVersion", h());
            }
            a2 = g.a(this.A);
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("connectionType", a2);
            }
            hashMap.put("sdkVersion", i());
            j = j();
            if (!TextUtils.isEmpty(j)) {
                hashMap.put(com.umeng.commonsdk.proguard.d.M, j);
            }
            k = k();
            if (!TextUtils.isEmpty(k)) {
                hashMap.put("deviceOEM", k);
            }
            l = l();
            if (!TextUtils.isEmpty(l)) {
                hashMap.put("deviceModel", l);
            }
            m = m();
            if (!TextUtils.isEmpty(m)) {
                hashMap.put("mobileCarrier", m);
            }
            hashMap.put("internalFreeMemory", Long.valueOf(o()));
            hashMap.put("externalFreeMemory", Long.valueOf(p()));
            hashMap.put(com.umeng.commonsdk.proguard.d.W, Integer.valueOf(q()));
            if (g.b(this.A, "GeneralProperties.ALLOW_LOCATION_SHARED_PREFS_KEY", false) && (r = r()) != null && r.length == 2) {
                hashMap.put(com.umeng.analytics.pro.b.x, Double.valueOf(r[0]));
                hashMap.put("lon", Double.valueOf(r[1]));
            }
            t = t();
            if (a(t)) {
                hashMap.put("gmtMinutesOffset", Integer.valueOf(t));
            }
            b2 = b();
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put("pluginType", b2);
            }
            c2 = c();
            if (!TextUtils.isEmpty(c2)) {
                hashMap.put("pluginVersion", c2);
            }
            d2 = d();
            if (!TextUtils.isEmpty(d2)) {
                hashMap.put("plugin_fw_v", d2);
            }
            valueOf = String.valueOf(com.ironsource.environment.c.f());
            if (!TextUtils.isEmpty(valueOf)) {
                hashMap.put("jb", valueOf);
            }
            v = v();
            if (!TextUtils.isEmpty(v)) {
                hashMap.put("mt", v);
            }
            return hashMap;
        }
        z = false;
        if (TextUtils.isEmpty(str)) {
        }
        if (!TextUtils.isEmpty(str)) {
        }
        hashMap.put("deviceOS", g());
        if (!TextUtils.isEmpty(h())) {
        }
        a2 = g.a(this.A);
        if (!TextUtils.isEmpty(a2)) {
        }
        hashMap.put("sdkVersion", i());
        j = j();
        if (!TextUtils.isEmpty(j)) {
        }
        k = k();
        if (!TextUtils.isEmpty(k)) {
        }
        l = l();
        if (!TextUtils.isEmpty(l)) {
        }
        m = m();
        if (!TextUtils.isEmpty(m)) {
        }
        hashMap.put("internalFreeMemory", Long.valueOf(o()));
        hashMap.put("externalFreeMemory", Long.valueOf(p()));
        hashMap.put(com.umeng.commonsdk.proguard.d.W, Integer.valueOf(q()));
        if (g.b(this.A, "GeneralProperties.ALLOW_LOCATION_SHARED_PREFS_KEY", false)) {
            hashMap.put(com.umeng.analytics.pro.b.x, Double.valueOf(r[0]));
            hashMap.put("lon", Double.valueOf(r[1]));
        }
        t = t();
        if (a(t)) {
        }
        b2 = b();
        if (!TextUtils.isEmpty(b2)) {
        }
        c2 = c();
        if (!TextUtils.isEmpty(c2)) {
        }
        d2 = d();
        if (!TextUtils.isEmpty(d2)) {
        }
        valueOf = String.valueOf(com.ironsource.environment.c.f());
        if (!TextUtils.isEmpty(valueOf)) {
        }
        v = v();
        if (!TextUtils.isEmpty(v)) {
        }
        return hashMap;
    }

    private String b() {
        try {
            return com.ironsource.b.a.a.a().b();
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    private String c() {
        try {
            return com.ironsource.b.a.a.a().c();
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    private String d() {
        try {
            return com.ironsource.b.a.a.a().d();
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    private String e() {
        try {
            return this.A.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    private String f() {
        return m.a().j();
    }

    private String h() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    private String i() {
        return g.d();
    }

    private String j() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    private String k() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    private String l() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private String m() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.A.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, this.f6936a + ":getMobileCarrier()", e);
            return "";
        }
    }

    private boolean n() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    private long o() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private long p() {
        if (!n()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private int q() {
        try {
            Intent registerReceiver = this.A.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, this.f6936a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    @SuppressLint({"MissingPermission"})
    private double[] r() {
        double[] dArr = new double[0];
        try {
            if (!s()) {
                return dArr;
            }
            LocationManager locationManager = (LocationManager) this.A.getApplicationContext().getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            Location location = null;
            Iterator<String> it = locationManager.getAllProviders().iterator();
            long j = Long.MIN_VALUE;
            while (it.hasNext()) {
                Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                if (lastKnownLocation != null && lastKnownLocation.getTime() > j) {
                    j = lastKnownLocation.getTime();
                    location = lastKnownLocation;
                }
            }
            return location != null ? new double[]{location.getLatitude(), location.getLongitude()} : dArr;
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, this.f6936a + ":getLastLocation()", e);
            return new double[0];
        }
    }

    private boolean s() {
        try {
            return this.A.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private int t() {
        int i = 0;
        try {
            TimeZone timeZone = TimeZone.getDefault();
            int offset = (timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60;
            try {
                return Math.round(offset / 15) * 15;
            } catch (Exception e) {
                e = e;
                i = offset;
                com.ironsource.b.d.d.c().a(c.a.NATIVE, this.f6936a + ":getGmtMinutesOffset()", e);
                return i;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private boolean a(int i) {
        return i <= 840 && i >= -720 && i % 15 == 0;
    }

    private String u() {
        return UUID.randomUUID().toString().replaceAll("-", "") + g.e();
    }

    private String v() {
        return m.a().h();
    }
}
