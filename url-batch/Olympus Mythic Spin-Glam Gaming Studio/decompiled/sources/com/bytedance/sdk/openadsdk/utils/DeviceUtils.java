package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.sdk.openadsdk.core.settings.iv;
import com.bytedance.sdk.openadsdk.utils.nps;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSupport;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.unity3d.player.UnityPlayer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class DeviceUtils {
    private static int bvs = 0;
    private static int cn = 0;
    private static int cyb = 0;
    private static int mw = 0;
    private static int rt = 0;
    private static int zg = 0;
    public static String zmn = "";
    private static volatile long fs = System.currentTimeMillis();
    private static volatile boolean zn = false;
    private static volatile boolean fb = false;
    private static volatile boolean btk = false;
    private static volatile boolean hhw = true;
    private static long nps = 0;
    private static String iv = "";
    private static int rc = 0;
    private static final AtomicBoolean klz = new AtomicBoolean(false);
    private static AtomicBoolean olo = new AtomicBoolean(false);
    private static final Object kgc = new Object();
    private static volatile String kw = null;
    private static volatile String iqz = null;

    public static void zmn(Context context) {
        if (zn) {
            return;
        }
        try {
            fs fsVar = new fs();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(fsVar, intentFilter);
            zn = true;
        } catch (Throwable unused) {
        }
    }

    public static long zmn() {
        return fs;
    }

    public static boolean fs() {
        if (SystemClock.elapsedRealtime() - nps >= 20000) {
            nps = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.kgc.zmn().getSystemService("power");
                if (powerManager != null) {
                    hhw = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return hhw;
    }

    public static boolean fs(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zn(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int fb(Context context) {
        if (zn(context)) {
            return 3;
        }
        return fs(context) ? 2 : 1;
    }

    private static void fs(JSONObject jSONObject) throws JSONException {
        zn(jSONObject);
    }

    private static void zn(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(jSONObject);
    }

    public static String btk(Context context) {
        if (!klz.get()) {
            cn(context);
        }
        return iv;
    }

    public static int hhw(Context context) {
        if (!klz.get()) {
            cn(context);
        }
        return rc;
    }

    private static void cn(Context context) {
        if (context == null || !klz.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                iv = packageInfo.versionName;
                rc = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject zmn(Context context, boolean z) {
        String iv2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", zg(context));
            fs(jSONObject);
            jSONObject.put("type", fb(context));
            jSONObject.put("os", 1);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put(VastAttributes.VENDOR, Build.MANUFACTURER);
            jSONObject.put("conn_type", oub.zg(context));
            jSONObject.put(CommonUrlParts.APP_SET_ID, com.bytedance.sdk.openadsdk.core.settings.fb.zn());
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, com.bytedance.sdk.openadsdk.core.settings.fb.fs());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.fb.fb());
            jSONObject.put("screen_scale", jy.hhw(context));
            jSONObject.put("density", jy.zg(context));
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, jy.zn(context));
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, jy.btk(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.klz.zn.hhw());
            com.bytedance.sdk.openadsdk.core.settings.rc fb2 = com.bytedance.sdk.openadsdk.core.kgc.fb();
            if (fb2.zak("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put(CommonUrlParts.UUID, com.bytedance.sdk.openadsdk.core.mw.zn(context));
            jSONObject.put("rom_version", zak.zmn());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.mw.fs(context));
            jSONObject.put("timezone", oub.kjb());
            jSONObject.put(POBConstants.KEY_LANGUAGE, com.bytedance.sdk.openadsdk.core.mw.fs());
            jSONObject.put("carrier_name", yj.zmn());
            if (z) {
                iv2 = oub.zmn(context);
                jSONObject.put("board", Build.BOARD);
                jSONObject.put("device_city", oub.uqh());
                zmn(jSONObject);
            } else {
                iv2 = oub.iv();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(iv2) * 1024));
            jSONObject.put("locale_language", fb());
            jSONObject.put("screen_bright", Math.ceil(btk() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !fs() ? 1 : 0);
            jSONObject.put("cpu_num", iv.fs());
            jSONObject.put("cpu_max_freq", iv.zn());
            jSONObject.put("cpu_min_freq", iv.fb());
            nps.zmn zmn2 = nps.zmn();
            jSONObject.put("battery_remaining_pct", (int) zmn2.fs);
            jSONObject.put("is_charging", zmn2.zmn);
            jSONObject.put("total_space", String.valueOf(oub.fs(context)));
            jSONObject.put("free_space_in", String.valueOf(oub.mw()));
            jSONObject.put("sdcard_size", String.valueOf(oub.rt()));
            jSONObject.put("rooted", oub.cyb());
            jSONObject.put("enable_assisted_clicking", hhw());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.doe.zmn(context, "tt_choose_language"));
            jSONObject.put("airplane", bvs(context));
            jSONObject.put("darkmode", cyb(context));
            jSONObject.put("headset", olo(context));
            jSONObject.put("ringmute", iv(context));
            jSONObject.put("screenscale", kgc(context));
            jSONObject.put("volume", zg());
            jSONObject.put("low_power_mode", kw(context));
            jSONObject.put("enable_draw_feed", oub.so());
            if (z) {
                zg.zmn(jSONObject, context);
                jSONObject.put("gp_v_name", btk(context));
                jSONObject.put("gp_v_code", hhw(context));
            }
            if (fb2.zak("mnc")) {
                jSONObject.put("mnc", yj.zn());
            }
            if (fb2.zak("mcc")) {
                jSONObject.put("mcc", yj.fs());
            }
            jSONObject.put(POBConstants.KEY_ACT, com.bytedance.sdk.openadsdk.core.zmn.zmn.fs(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.zmn.zmn.zmn());
            String zn2 = com.bytedance.sdk.openadsdk.core.klz.zn.zn();
            com.bytedance.sdk.openadsdk.core.klz.zn.fb();
            if (!TextUtils.isEmpty(zn2)) {
                jSONObject.put("sof_chara", zn2);
            }
            String fs2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!fs2.isEmpty()) {
                jSONObject.put("ipv6", fs2);
            }
            jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.phc.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void zmn(JSONObject jSONObject) {
        try {
            com.bytedance.sdk.openadsdk.core.settings.rc fb2 = com.bytedance.sdk.openadsdk.core.kgc.fb();
            if (fb2.zak("boot")) {
                jSONObject.put("bt_time", kw());
            } else {
                jSONObject.put("bt_time", "not_allowed");
                com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("bt_time");
            }
            if (fb2.zak("bt_id")) {
                jSONObject.put("bt_id", kgc());
            } else {
                jSONObject.put("bt_id", "not_allowed");
                com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("bt_id");
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject nps(Context context) {
        return zmn(context, false);
    }

    public static int zn() {
        return com.bytedance.sdk.openadsdk.core.zn.zmn().fs("limit_ad_track", -1);
    }

    public static String fb() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static float btk() {
        int i = -1;
        try {
            Context zmn2 = com.bytedance.sdk.openadsdk.core.kgc.zmn();
            if (zmn2 != null) {
                i = Settings.System.getInt(zmn2.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static int hhw() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.kgc.zmn().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static int zg(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static int bvs(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int cyb(Context context) {
        int i;
        try {
            i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i == 32) {
            return 1;
        }
        return i == 16 ? 0 : -1;
    }

    private static int olo(Context context) {
        return cn;
    }

    public static int iv(Context context) {
        return zg;
    }

    private static float kgc(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int nps() {
        return mw;
    }

    public static int zg() {
        return rt;
    }

    public static int bvs() {
        return bvs;
    }

    private static int kw(Context context) {
        return cyb;
    }

    public static String iv() {
        if (TextUtils.isEmpty(zmn)) {
            zmn = com.bytedance.sdk.openadsdk.core.zn.zmn().fs("framework_name", "");
        }
        return zmn;
    }

    public static void rc() {
        com.bytedance.sdk.openadsdk.core.settings.rc.zmn(new iv.zmn() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.iv.zmn
            public void zmn() {
                com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.iv.zmn
            public void fs() {
                com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(true);
                DeviceUtils.olo();
            }
        });
        Context zmn2 = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        if (zmn2 != null) {
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("cpu_count", iv.zmn());
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("cpu_max_frequency", iv.zmn(iv.zmn()));
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("cpu_min_frequency", iv.fs(iv.zmn()));
            String rc2 = oub.rc();
            if (rc2 != null) {
                com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("total_memory", rc2);
            }
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("total_internal_storage", oub.klz());
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("free_internal_storage", com.bytedance.sdk.component.utils.olo.zmn());
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("total_sdcard_storage", oub.cn());
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("is_root", oub.olo() ? 1 : 0);
            if (TextUtils.isEmpty(iv())) {
                try {
                    Activity activity = UnityPlayer.currentActivity;
                    zmn = "unity";
                } catch (ClassNotFoundException unused) {
                    zmn = "native";
                }
                com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("framework_name", zmn);
            }
            klz();
            iqz(zmn2);
            cyb = doe(zmn2);
            zg.zmn(zmn2);
            olo();
        }
    }

    public static void klz() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.kgc.zmn().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                zg = 1;
            } else if (ringerMode == 1) {
                zg = 2;
            } else {
                zg = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static void iqz(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            bvs = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            mw = streamVolume;
            rt = (int) ((streamVolume / bvs) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void phc(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.cyb = DeviceUtils.doe(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int doe(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return nqi(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int nqi(Context context) {
        try {
            String str = Build.MANUFACTURER;
            int i = 1;
            if (str.equalsIgnoreCase("XIAOMI")) {
                if (Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1) {
                }
                i = 0;
            } else if (!str.equalsIgnoreCase("HUAWEI")) {
                return 0;
            }
            return i;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void rc(Context context) {
        AudioInfoReceiver.fs(context);
    }

    public static void klz(Context context) {
        Context applicationContext;
        if (btk || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                uqh(applicationContext);
            } else {
                zmn.fs(applicationContext);
            }
            btk = true;
        } catch (Throwable unused) {
        }
    }

    private static void uqh(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.phc(applicationContext);
            }
        });
    }

    private static String zmn(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split = str2.split(StringUtils.COMMA);
            int rp = com.bytedance.sdk.openadsdk.core.settings.rc.fs().rp();
            if (rp != 1) {
                if (str.equals(split[0])) {
                    return str2;
                }
                if ("bt_time".equals(str3) && Math.abs(Long.parseLong(str) - Long.parseLong(split[0])) < 1000) {
                    return str2;
                }
                if (split.length < rp) {
                    str = str + StringUtils.COMMA + str2;
                } else {
                    int lastIndexOf = str2.lastIndexOf(StringUtils.COMMA);
                    if (lastIndexOf != -1) {
                        str = str + StringUtils.COMMA + str2.substring(0, lastIndexOf);
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn().zmn(str3, str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void olo() {
        if (com.bytedance.sdk.openadsdk.core.kgc.fb().zak("bt_id")) {
            try {
                if (iqz == null) {
                    synchronized (kgc) {
                        try {
                            if (iqz == null) {
                                iqz = zmn(PglSupport.getBootid(), com.bytedance.sdk.openadsdk.core.zn.zmn().fs("bt_id", ""), "bt_id");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
                iqz = "";
            }
        }
    }

    private static String kgc() {
        try {
            if (iqz == null) {
                return com.bytedance.sdk.openadsdk.core.zn.zmn().fs("bt_id", "");
            }
            return iqz;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String kw() {
        try {
            if (kw == null) {
                synchronized (kgc) {
                    try {
                        if (kw == null) {
                            kw = zmn(String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), com.bytedance.sdk.openadsdk.core.zn.zmn().fs("bt_time", ""), "bt_time");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable unused) {
            kw = "";
        }
        return kw;
    }

    static class fs extends BroadcastReceiver {
        fs() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.hhw = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.hhw = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.fs = System.currentTimeMillis();
            }
        }
    }

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.mw.bvs> zmn = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void fs(Context context) {
            if (DeviceUtils.fb || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.bvs.zmn());
                boolean unused = DeviceUtils.fb = true;
            } catch (Throwable unused2) {
            }
        }

        public static void zmn(com.bytedance.sdk.openadsdk.mw.bvs bvsVar) {
            if (bvsVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.mw.bvs> copyOnWriteArrayList = zmn;
                if (copyOnWriteArrayList.contains(bvsVar)) {
                    return;
                }
                copyOnWriteArrayList.add(bvsVar);
            }
        }

        public static void fs(com.bytedance.sdk.openadsdk.mw.bvs bvsVar) {
            if (bvsVar == null) {
                return;
            }
            zmn.remove(bvsVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = DeviceUtils.mw = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if (!zmn.isEmpty()) {
                            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Iterator<com.bytedance.sdk.openadsdk.mw.bvs> it = AudioInfoReceiver.zmn.iterator();
                                    while (it.hasNext()) {
                                        it.next().zn(DeviceUtils.mw);
                                    }
                                }
                            });
                        }
                        if (DeviceUtils.bvs != 0) {
                            int unused2 = DeviceUtils.rt = (int) ((DeviceUtils.mw / DeviceUtils.bvs) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.cn = intent.getIntExtra("state", 0);
                }
            } catch (Exception unused4) {
            }
        }
    }

    private static class zmn extends BroadcastReceiver {
        private zmn() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void fs(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i >= 33) {
                    context.registerReceiver(new zmn(), intentFilter, 2);
                } else {
                    context.registerReceiver(new zmn(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.phc(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.cyb = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }
}
