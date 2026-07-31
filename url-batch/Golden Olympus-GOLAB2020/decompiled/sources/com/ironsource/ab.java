package com.ironsource;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.IronSourceSharedPreferencesUtilities;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.of;
import com.ironsource.q9;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class ab implements of, of.a {

    /* renamed from: A, reason: collision with root package name */
    private static final String f15029A = "browser_user_agent";

    /* renamed from: B, reason: collision with root package name */
    private static final String f15030B = "browser_user_agent_time";

    /* renamed from: C, reason: collision with root package name */
    private static final String f15031C = "IABTCF_gdprApplies";

    /* renamed from: D, reason: collision with root package name */
    private static final String f15032D = "IABTCF_TCString";

    /* renamed from: E, reason: collision with root package name */
    private static final String f15033E = "IABTCF_AddtlConsent";

    /* renamed from: j, reason: collision with root package name */
    private static final String f15034j = "android";

    /* renamed from: k, reason: collision with root package name */
    private static final String f15035k = "com.google.android.gms.permission.AD_ID";

    /* renamed from: l, reason: collision with root package name */
    private static final String f15036l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* renamed from: m, reason: collision with root package name */
    private static final String f15037m = "com.google.android.gms.appset.AppSet";

    /* renamed from: n, reason: collision with root package name */
    private static final String f15038n = "com.google.android.gms.tasks.OnSuccessListener";

    /* renamed from: o, reason: collision with root package name */
    private static final String f15039o = "getAdvertisingIdInfo";

    /* renamed from: p, reason: collision with root package name */
    private static final String f15040p = "getClient";

    /* renamed from: q, reason: collision with root package name */
    private static final String f15041q = "getAppSetIdInfo";

    /* renamed from: r, reason: collision with root package name */
    private static final String f15042r = "addOnSuccessListener";

    /* renamed from: s, reason: collision with root package name */
    private static final String f15043s = "getId";

    /* renamed from: t, reason: collision with root package name */
    private static final String f15044t = "isLimitAdTrackingEnabled";

    /* renamed from: u, reason: collision with root package name */
    private static final String f15045u = "Mediation_Shared_Preferences";

    /* renamed from: v, reason: collision with root package name */
    private static final String f15046v = "supersonic_shared_preferen";

    /* renamed from: w, reason: collision with root package name */
    private static final String f15047w = "cachedUUID";

    /* renamed from: x, reason: collision with root package name */
    private static final String f15048x = "auid";

    /* renamed from: y, reason: collision with root package name */
    private static final String f15049y = "unityads-installinfo";

    /* renamed from: z, reason: collision with root package name */
    private static final String f15050z = "unityads-idfi";

    /* renamed from: b, reason: collision with root package name */
    private String f15051b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f15052c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f15053d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f15054e = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f15055f = false;

    /* renamed from: g, reason: collision with root package name */
    private String f15056g = "";

    /* renamed from: h, reason: collision with root package name */
    private volatile String f15057h;

    /* renamed from: i, reason: collision with root package name */
    private volatile String f15058i;

    class a implements InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String obj3 = obj2.getClass().getMethod(ab.f15043s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(obj3)) {
                            ab.this.f15056g = obj3;
                        }
                    }
                } catch (Exception e4) {
                    o9.d().a(e4);
                }
            }
            return null;
        }
    }

    private String O(Context context) {
        Object Q3 = Q(context);
        return Q3.getClass().getMethod(f15043s, null).invoke(Q3, null).toString();
    }

    private void P(Context context) {
        Object invoke = AppSet.class.getMethod(f15040p, Context.class).invoke(AppSet.class, context);
        Object invoke2 = invoke.getClass().getMethod(f15041q, null).invoke(invoke, null);
        invoke2.getClass().getMethod(f15042r, OnSuccessListener.class).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object Q(Context context) {
        return AdvertisingIdClient.class.getMethod(f15039o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String R(Context context) {
        Object Q3 = Q(context);
        return String.valueOf(((Boolean) Q3.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(Q3, null)).booleanValue());
    }

    @NotNull
    private String S(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f15045u, f15029A, "");
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return "";
        }
    }

    private long T(Context context) {
        try {
            return Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f15045u, f15030B, String.valueOf(-1L)));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.of
    public int A(Context context) {
        int L3 = L(context);
        int H3 = H(context);
        return (((L3 == 0 || L3 == 2) && H3 == 2) || ((L3 == 1 || L3 == 3) && H3 == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.of
    public int B(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, f15031C, -1);
        } catch (Exception e4) {
            o9.d().a(e4);
            return -1;
        }
    }

    @Override // com.ironsource.of
    public int C(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.of
    public String D(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, f15032D, null);
        } catch (Exception e4) {
            o9.d().a(e4);
            return null;
        }
    }

    @Override // com.ironsource.of
    public boolean E(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.of
    public String F(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.of
    public String G(Context context) {
        if (!xa.f20303a.c()) {
            return "";
        }
        try {
            P(context);
            return !TextUtils.isEmpty(this.f15056g) ? this.f15056g : "";
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    @Override // com.ironsource.of
    public int H(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.of
    public String I(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.of
    public boolean J(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.of
    public String K(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, f15033E, null);
        } catch (Exception e4) {
            o9.d().a(e4);
            return null;
        }
    }

    @Override // com.ironsource.of
    public int L(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.of
    public synchronized String M(Context context) {
        if (!TextUtils.isEmpty(this.f15051b)) {
            return this.f15051b;
        }
        if (IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, f15045u, of.f18516a, true)) {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f15045u, f15047w, "");
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String uuid = UUID.randomUUID().toString();
                this.f15051b = uuid;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f15045u, f15047w, uuid);
            } else {
                this.f15051b = stringFromSharedPrefs;
            }
        }
        return this.f15051b;
    }

    @Override // com.ironsource.of
    public int N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.of
    public int a() {
        return k();
    }

    @Override // com.ironsource.of
    @Nullable
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.of
    @Nullable
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.of
    public int d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.of
    public File e(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.of
    public String f(Context context) {
        if (context == null) {
            return "";
        }
        int N3 = N(context);
        if (N3 == 0) {
            return b9.h.f15433C;
        }
        if (N3 == 1) {
            return b9.h.f15435D;
        }
        if (N3 == 11) {
            return b9.h.f15433C;
        }
        if (N3 == 12) {
            return b9.h.f15435D;
        }
        switch (N3) {
            case 6:
            case 8:
                return b9.h.f15433C;
            case 7:
            case 9:
                return b9.h.f15435D;
            default:
                return "none";
        }
    }

    @Override // com.ironsource.of
    public String g() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.of
    public float h() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.of
    @Nullable
    public String i() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e4) {
            IronLog.INTERNAL.error(e4.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.of
    public long j() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.of
    public int k() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.of
    public int l() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.of
    public float m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.of
    public long n() {
        if (c()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.of
    public long o() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.of
    public String p() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.of
    public int q() {
        return -(TimeZone.getDefault().getOffset(j()) / OrderStatusCode.ORDER_STATE_CANCEL);
    }

    @Override // com.ironsource.of
    @Nullable
    public String r(Context context) {
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveActivity != null) {
                return resolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th) {
            o9.d().a(th);
            return null;
        }
    }

    @Override // com.ironsource.of
    public int s() {
        return d();
    }

    @Override // com.ironsource.of
    public String t() {
        try {
            return this.f15054e.isEmpty() ? S(ContextProvider.getInstance().getApplicationContext()) : this.f15054e;
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    @Override // com.ironsource.of
    public File u(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.of
    public boolean v(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), Base64Utils.IO_BUFFER_SIZE).requestedPermissions) {
                if (str.equalsIgnoreCase(f15035k)) {
                    return true;
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
        }
        return false;
    }

    @Override // com.ironsource.of
    @Nullable
    public String w(Context context) {
        if (!TextUtils.isEmpty(this.f15053d)) {
            return this.f15053d;
        }
        if (context == null) {
            return null;
        }
        String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "unityads-installinfo", f15050z, null);
        this.f15053d = stringFromSharedPrefs;
        return stringFromSharedPrefs;
    }

    @Override // com.ironsource.of
    public File x(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.of
    public int y(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return -1;
    }

    @Override // com.ironsource.of
    @Nullable
    public ActivityManager.MemoryInfo z(Context context) {
        if (context == null || !nm.S().d().a()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
    }

    @Override // com.ironsource.of
    public String b() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.ironsource.of
    public boolean c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (Environment.isExternalStorageRemovable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e4) {
            o9.d().a(e4);
            return false;
        }
    }

    @Override // com.ironsource.of
    public boolean d(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return false;
        }
    }

    @Override // com.ironsource.of
    public String e() {
        return Build.MODEL;
    }

    @Override // com.ironsource.of
    public boolean f() {
        return b("su");
    }

    @Override // com.ironsource.of
    public boolean g(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.of
    public long h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.of
    public String i(Context context) {
        return s(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.of
    public String j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.of
    public File k(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.of
    public int l(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.of
    public String m() {
        return "android";
    }

    @Override // com.ironsource.of
    public String n(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.of
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<ApplicationInfo> o(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.of
    @Nullable
    public String p(Context context) {
        xa xaVar = xa.f20303a;
        if (xaVar.b()) {
            try {
                if (!xaVar.a()) {
                    return O(context);
                }
                if (this.f15058i != null) {
                    return this.f15058i;
                }
                String O3 = O(context);
                if (TextUtils.isEmpty(O3)) {
                    return O3;
                }
                this.f15058i = O3;
                return O3;
            } catch (Exception e4) {
                o9.d().a(e4);
            }
        }
        return null;
    }

    @Override // com.ironsource.of
    public boolean q(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return false;
        }
    }

    @Override // com.ironsource.of
    public boolean r() {
        return this.f15055f;
    }

    @Override // com.ironsource.of
    public boolean s(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.of
    public synchronized String t(Context context) {
        if (!TextUtils.isEmpty(this.f15052c)) {
            return this.f15052c;
        }
        if (context == null) {
            return "";
        }
        String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
        this.f15052c = stringFromSharedPrefs;
        if (TextUtils.isEmpty(stringFromSharedPrefs)) {
            String uuid = UUID.randomUUID().toString();
            this.f15052c = uuid;
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", uuid);
        }
        return this.f15052c;
    }

    @Override // com.ironsource.of
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.of
    public String b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.of
    public boolean c(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return false;
        }
    }

    private void b(Context context, long j4) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f15045u, f15030B, String.valueOf(j4));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // com.ironsource.of
    @Nullable
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i4 = 0; i4 < 8; i4++) {
                if (new File(strArr[i4] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
        }
        return false;
    }

    @Override // com.ironsource.of
    @Nullable
    public String a(Context context) {
        try {
            if (!xa.f20303a.a()) {
                return R(context);
            }
            if (this.f15057h != null) {
                return this.f15057h;
            }
            String R3 = R(context);
            if (TextUtils.isEmpty(R3)) {
                return R3;
            }
            this.f15057h = R3;
            return R3;
        } catch (Exception e4) {
            o9.d().a(e4);
            return null;
        }
    }

    @Override // com.ironsource.of.a
    public void a(Context context, long j4) {
        if (context != null) {
            if (!new lv(new q9.a()).a(T(context), j4)) {
                this.f15054e = S(context);
                this.f15055f = !r0.isEmpty();
            }
            if (this.f15054e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f15054e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j4 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                }
            }
        }
    }

    private void a(Context context, String str) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f15045u, f15029A, str);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // com.ironsource.of
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | Base64Utils.IO_BUFFER_SIZE) == systemUiVisibility || (systemUiVisibility | com.ironsource.mediationsdk.metadata.a.f17688n) == systemUiVisibility;
    }
}
