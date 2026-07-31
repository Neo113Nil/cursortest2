package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class ee implements Runnable {

    /* renamed from: M, reason: collision with root package name */
    public static final String f16003M = "sdkVersion";

    /* renamed from: N, reason: collision with root package name */
    public static final String f16004N = "AdvIdOptOutReason";

    /* renamed from: O, reason: collision with root package name */
    private static final int f16005O = 15;

    /* renamed from: P, reason: collision with root package name */
    private static final int f16006P = 840;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f16007Q = -720;

    /* renamed from: K, reason: collision with root package name */
    private Context f16018K;

    /* renamed from: a, reason: collision with root package name */
    private final String f16020a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private final String f16021b = "bundleId";

    /* renamed from: c, reason: collision with root package name */
    private final String f16022c = "advertisingId";

    /* renamed from: d, reason: collision with root package name */
    private final String f16023d = b9.i.f15531M;

    /* renamed from: e, reason: collision with root package name */
    private final String f16024e = "appKey";

    /* renamed from: f, reason: collision with root package name */
    private final String f16025f = "deviceOS";

    /* renamed from: g, reason: collision with root package name */
    private final String f16026g = "osVersion";

    /* renamed from: h, reason: collision with root package name */
    private final String f16027h = b9.i.f15581t;

    /* renamed from: i, reason: collision with root package name */
    private final String f16028i = b9.i.f15582u;

    /* renamed from: j, reason: collision with root package name */
    private final String f16029j = "language";

    /* renamed from: k, reason: collision with root package name */
    private final String f16030k = b9.i.f15564k;

    /* renamed from: l, reason: collision with root package name */
    private final String f16031l = b9.i.f15566l;

    /* renamed from: m, reason: collision with root package name */
    private final String f16032m = b9.i.f15578r;

    /* renamed from: n, reason: collision with root package name */
    private final String f16033n = "externalFreeMemory";

    /* renamed from: o, reason: collision with root package name */
    private final String f16034o = "internalFreeMemory";

    /* renamed from: p, reason: collision with root package name */
    private final String f16035p = "battery";

    /* renamed from: q, reason: collision with root package name */
    private final String f16036q = "gmtMinutesOffset";

    /* renamed from: r, reason: collision with root package name */
    private final String f16037r = b9.i.f15541W;

    /* renamed from: s, reason: collision with root package name */
    private final String f16038s = "sessionId";

    /* renamed from: t, reason: collision with root package name */
    private final String f16039t = "pluginType";

    /* renamed from: u, reason: collision with root package name */
    private final String f16040u = "pluginVersion";

    /* renamed from: v, reason: collision with root package name */
    private final String f16041v = "plugin_fw_v";

    /* renamed from: w, reason: collision with root package name */
    private final String f16042w = "jb";

    /* renamed from: x, reason: collision with root package name */
    private final String f16043x = "advertisingIdType";

    /* renamed from: y, reason: collision with root package name */
    private final String f16044y = ge.f16434X0;

    /* renamed from: z, reason: collision with root package name */
    private final String f16045z = "firstSession";

    /* renamed from: A, reason: collision with root package name */
    private final String f16008A = "mcc";

    /* renamed from: B, reason: collision with root package name */
    private final String f16009B = "mnc";

    /* renamed from: C, reason: collision with root package name */
    private final String f16010C = "icc";

    /* renamed from: D, reason: collision with root package name */
    private final String f16011D = "tz";

    /* renamed from: E, reason: collision with root package name */
    private final String f16012E = ge.f16408K0;

    /* renamed from: F, reason: collision with root package name */
    private final String f16013F = "userLat";

    /* renamed from: G, reason: collision with root package name */
    private final String f16014G = "publisherAPI";

    /* renamed from: H, reason: collision with root package name */
    private final String f16015H = "missingDependencies";

    /* renamed from: I, reason: collision with root package name */
    private final String f16016I = "missingManifest";

    /* renamed from: J, reason: collision with root package name */
    private final String f16017J = "other";

    /* renamed from: L, reason: collision with root package name */
    private final of f16019L = nm.S().f();

    private ee() {
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? "missingDependencies" : !xa.f20303a.b() ? "publisherAPI" : !this.f16019L.v(this.f16018K) ? "missingManifest" : Boolean.parseBoolean(str) ? "userLat" : "other";
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    private String c() {
        return com.ironsource.mediationsdk.p.m().n();
    }

    private int d() {
        try {
            Intent registerReceiver = this.f16018K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f16020a + ":getBatteryLevel()", e4);
        }
        return -1;
    }

    private String e() {
        try {
            return this.f16018K.getPackageName();
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    private String h() {
        return b9.f15266d;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f16020a + ":getGmtMinutesOffset()", e4);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
        } catch (Exception e4) {
            o9.d().a(e4);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    private String m() {
        return com.ironsource.mediationsdk.p.m().q();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f16018K.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!networkOperatorName.equals("")) {
                    return networkOperatorName;
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f16020a + ":getMobileCarrier()", e4);
        }
        return "";
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e4);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e4);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e4);
            return "";
        }
    }

    private String r() {
        return IronSourceUtils.getSDKVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e4) {
            o9.d().a(e4);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            de.a().a(a());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e4);
        }
    }

    public ee(Context context) {
        this.f16018K = context.getApplicationContext();
    }

    private Map<String, Object> a() {
        boolean z4;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", IronSourceUtils.getSessionId());
        String e4 = e();
        if (!TextUtils.isEmpty(e4)) {
            hashMap.put("bundleId", e4);
            String b4 = C1442c4.b(this.f16018K, e4);
            if (!TextUtils.isEmpty(b4)) {
                hashMap.put(b9.i.f15541W, b4);
            }
        }
        hashMap.put("appKey", c());
        String p4 = this.f16019L.p(this.f16018K);
        String a4 = this.f16019L.a(this.f16018K);
        boolean z5 = false;
        if (TextUtils.isEmpty(p4)) {
            p4 = this.f16019L.M(this.f16018K);
            z4 = true;
            str = !TextUtils.isEmpty(p4) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z4 = false;
        }
        if (!TextUtils.isEmpty(p4)) {
            hashMap.put("advertisingId", p4);
            hashMap.put("advertisingIdType", str);
        }
        if (!TextUtils.isEmpty(a4)) {
            z5 = Boolean.parseBoolean(a4);
            hashMap.put(b9.i.f15531M, Boolean.valueOf(z5));
        }
        if (z4 || z5) {
            hashMap.put(f16004N, a(a4));
        }
        hashMap.put("deviceOS", h());
        if (!TextUtils.isEmpty(b())) {
            hashMap.put("osVersion", b());
        }
        String connectionType = IronSourceUtils.getConnectionType(this.f16018K);
        if (!TextUtils.isEmpty(connectionType)) {
            hashMap.put(b9.i.f15581t, connectionType);
        }
        String d4 = y8.d(this.f16018K);
        if (!TextUtils.isEmpty(d4)) {
            hashMap.put(b9.i.f15582u, d4);
        }
        hashMap.put("sdkVersion", r());
        String l4 = l();
        if (!TextUtils.isEmpty(l4)) {
            hashMap.put("language", l4);
        }
        String g4 = g();
        if (!TextUtils.isEmpty(g4)) {
            hashMap.put(b9.i.f15564k, g4);
        }
        String f4 = f();
        if (!TextUtils.isEmpty(f4)) {
            hashMap.put(b9.i.f15566l, f4);
        }
        String n4 = n();
        if (!TextUtils.isEmpty(n4)) {
            hashMap.put(b9.i.f15578r, n4);
        }
        hashMap.put("internalFreeMemory", Long.valueOf(k()));
        hashMap.put("externalFreeMemory", Long.valueOf(i()));
        hashMap.put("battery", Integer.valueOf(d()));
        int j4 = j();
        if (a(j4)) {
            hashMap.put("gmtMinutesOffset", Integer.valueOf(j4));
        }
        String p5 = p();
        if (!TextUtils.isEmpty(p5)) {
            hashMap.put("pluginType", p5);
        }
        String q4 = q();
        if (!TextUtils.isEmpty(q4)) {
            hashMap.put("pluginVersion", q4);
        }
        String o4 = o();
        if (!TextUtils.isEmpty(o4)) {
            hashMap.put("plugin_fw_v", o4);
        }
        String valueOf = String.valueOf(this.f16019L.f());
        if (!TextUtils.isEmpty(valueOf)) {
            hashMap.put("jb", valueOf);
        }
        String m4 = m();
        if (!TextUtils.isEmpty(m4)) {
            hashMap.put(ge.f16434X0, m4);
        }
        String valueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.f16018K));
        if (!TextUtils.isEmpty(valueOf2)) {
            hashMap.put("firstSession", valueOf2);
        }
        String t4 = this.f16019L.t(this.f16018K);
        if (!TextUtils.isEmpty(t4)) {
            hashMap.put(ge.f16408K0, t4);
        }
        hashMap.put("mcc", Integer.valueOf(x8.b(this.f16018K)));
        hashMap.put("mnc", Integer.valueOf(x8.c(this.f16018K)));
        String n5 = this.f16019L.n(this.f16018K);
        if (!TextUtils.isEmpty(n5)) {
            hashMap.put("icc", n5);
        }
        String b5 = this.f16019L.b();
        if (!TextUtils.isEmpty(b5)) {
            hashMap.put("tz", b5);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + hashMap);
        return hashMap;
    }

    private boolean a(int i4) {
        return i4 <= f16006P && i4 >= f16007Q && i4 % 15 == 0;
    }
}
