package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.core.settings.bNS;
import com.bytedance.sdk.openadsdk.utils.NB;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.ktor.http.LinkHeader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeviceUtils {
    private static int Ju = 0;
    private static int Mxy = 0;
    private static int Wyp = 0;
    private static int kj = 0;
    public static String pvs = "";
    private static int qh;
    private static int so;
    private static volatile long icD = System.currentTimeMillis();
    private static volatile boolean vG = false;
    private static volatile boolean Jd = false;
    private static volatile boolean NB = false;
    private static volatile boolean sUS = true;
    private static long yiw = 0;
    private static final AtomicBoolean IP = new AtomicBoolean(false);

    public static void pvs(Context context) {
        if (vG) {
            return;
        }
        try {
            icD icd = new icD();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(icd, intentFilter);
            vG = true;
        } catch (Throwable unused) {
        }
    }

    public static long pvs() {
        return icD;
    }

    @JProtect
    public static boolean icD() {
        if (SystemClock.elapsedRealtime() - yiw >= 20000) {
            yiw = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.mnm.pvs().getSystemService("power");
                if (powerManager != null) {
                    sUS = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return sUS;
    }

    public static boolean icD(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean vG(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int Jd(Context context) {
        if (vG(context)) {
            return 3;
        }
        return icD(context) ? 2 : 1;
    }

    private static void pvs(JSONObject jSONObject) throws JSONException {
        icD(jSONObject);
    }

    private static void icD(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.mnm.Jd().ae("gaid")) {
            jSONObject.put("gaid", com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD());
        }
    }

    @JProtect
    public static JSONObject pvs(Context context, boolean z) {
        String icD2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", sUS(context));
            pvs(jSONObject);
            jSONObject.put(LinkHeader.Parameters.Type, Jd(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", jlb.kj(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.Jd.vG());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.Jd.icD());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.Jd.Jd());
            jSONObject.put("screen_width", Pj.vG(context));
            jSONObject.put("screen_height", Pj.Jd(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.NB.vG.sUS());
            com.bytedance.sdk.openadsdk.core.settings.sUS Jd2 = com.bytedance.sdk.openadsdk.core.mnm.Jd();
            if (Jd2.ae("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.qh.vG(context));
            jSONObject.put("rom_version", ny.pvs());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.qh.icD(context));
            jSONObject.put("timezone", jlb.cR());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.qh.pvs());
            jSONObject.put("carrier_name", ZhG.pvs());
            if (z) {
                icD2 = jlb.pvs(context);
            } else {
                icD2 = jlb.icD(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(icD2) * 1024));
            jSONObject.put("locale_language", Jd());
            jSONObject.put("screen_bright", Math.ceil(NB() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", icD() ? 0 : 1);
            jSONObject.put("cpu_num", yiw.pvs(context));
            jSONObject.put("cpu_max_freq", yiw.icD(context));
            jSONObject.put("cpu_min_freq", yiw.vG(context));
            NB.pvs pvs2 = NB.pvs();
            jSONObject.put("battery_remaining_pct", (int) pvs2.icD);
            jSONObject.put("is_charging", pvs2.pvs);
            jSONObject.put("total_space", String.valueOf(jlb.vG(context)));
            jSONObject.put("free_space_in", String.valueOf(jlb.Jd(context)));
            jSONObject.put("sdcard_size", String.valueOf(jlb.NB(context)));
            jSONObject.put("rooted", jlb.sUS(context));
            jSONObject.put("enable_assisted_clicking", sUS());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.uc.pvs(context, "tt_choose_language"));
            jSONObject.put("airplane", yiw(context));
            jSONObject.put("darkmode", IP(context));
            jSONObject.put("headset", bNS(context));
            jSONObject.put("ringmute", so(context));
            jSONObject.put("screenscale", mnm(context));
            jSONObject.put("volume", so());
            jSONObject.put("low_power_mode", vA(context));
            if (Jd2.ae("mnc")) {
                jSONObject.put("mnc", ZhG.vG());
            }
            if (Jd2.ae("mcc")) {
                jSONObject.put("mcc", ZhG.icD());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.pvs.icD(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.pvs.pvs());
            String Jd3 = com.bytedance.sdk.openadsdk.core.NB.vG.Jd();
            if (!TextUtils.isEmpty(Jd3)) {
                jSONObject.put("sof_chara", Jd3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject NB(Context context) {
        return pvs(context, false);
    }

    public static int vG() {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).icD("limit_ad_track", -1);
    }

    public static String Jd() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static float NB() {
        int i = -1;
        try {
            Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
            if (pvs2 != null) {
                i = Settings.System.getInt(pvs2.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static int sUS() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.mnm.pvs().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static int sUS(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static int yiw(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int IP(Context context) {
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

    private static int bNS(Context context) {
        return kj;
    }

    public static int so(Context context) {
        return so;
    }

    private static float mnm(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int yiw() {
        return Wyp;
    }

    public static int so() {
        return qh;
    }

    public static int Mxy() {
        return Mxy;
    }

    private static int vA(Context context) {
        return Ju;
    }

    public static String Mxy(Context context) {
        if (TextUtils.isEmpty(pvs)) {
            pvs = com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("framework_name", "");
        }
        return pvs;
    }

    @JProtect
    public static void Wyp() {
        new vG().run();
        Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        if (pvs2 != null) {
            com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("cpu_count", yiw.pvs());
            com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("cpu_max_frequency", yiw.pvs(yiw.pvs()));
            com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("cpu_min_frequency", yiw.icD(yiw.pvs()));
            String Mxy2 = jlb.Mxy();
            if (Mxy2 != null) {
                com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("total_memory", Mxy2);
            }
            com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("total_internal_storage", jlb.Wyp());
            com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("free_internal_storage", com.bytedance.sdk.component.utils.IP.pvs());
            com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("total_sdcard_storage", jlb.qh());
            com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("is_root", jlb.kj() ? 1 : 0);
            if (TextUtils.isEmpty(Mxy(pvs2))) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    pvs = "unity";
                } catch (ClassNotFoundException unused) {
                    pvs = "native";
                }
                com.bytedance.sdk.openadsdk.core.vG.pvs(pvs2).pvs("framework_name", pvs);
            }
            qh();
            cR(pvs2);
            Ju = uc(pvs2);
        }
    }

    public static void qh() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.mnm.pvs().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                so = 1;
            } else if (ringerMode == 1) {
                so = 2;
            } else {
                so = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static void cR(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            Mxy = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            Wyp = streamVolume;
            qh = (int) ((streamVolume / Mxy) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zM(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        ae.icD(new com.bytedance.sdk.component.so.so("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.Ju = DeviceUtils.uc(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int uc(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") && !Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return rCZ(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int rCZ(Context context) {
        try {
            int i = 1;
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                if (Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1) {
                }
                i = 0;
            } else if (!Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return 0;
            }
            return i;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void Wyp(Context context) {
        AudioInfoReceiver.icD(context);
    }

    public static void qh(Context context) {
        Context applicationContext;
        if (NB || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                OT(applicationContext);
            } else {
                pvs.icD(applicationContext);
            }
            NB = true;
        } catch (Throwable unused) {
        }
    }

    private static void OT(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.zM(applicationContext);
            }
        });
    }

    static class icD extends BroadcastReceiver {
        icD() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.sUS = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.sUS = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.icD = System.currentTimeMillis();
            }
        }
    }

    public static class vG implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                final AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.mnm.pvs());
                if (advertisingIdInfo != null) {
                    i = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    DeviceUtils.icD(advertisingIdInfo);
                    com.bytedance.sdk.openadsdk.core.settings.mnm.pvs(new bNS.pvs() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.vG.1
                        @Override // com.bytedance.sdk.openadsdk.core.settings.bNS.pvs
                        public void pvs() {
                            DeviceUtils.icD(advertisingIdInfo);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.settings.bNS.pvs
                        public void icD() {
                            DeviceUtils.icD(advertisingIdInfo);
                        }
                    });
                } else {
                    i = -1;
                }
                if (i != -1) {
                    com.bytedance.sdk.openadsdk.core.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs("limit_ad_track", i);
                }
            } catch (IOException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(AdvertisingIdClient.Info info) {
        if (!com.bytedance.sdk.openadsdk.core.mnm.Jd().ae("gaid") || IP.getAndSet(true)) {
            return;
        }
        String id = info.getId();
        if (TextUtils.isEmpty(id)) {
            return;
        }
        com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD(id);
        com.com.bytedance.overseas.sdk.icD.pvs.pvs(id);
        com.bytedance.sdk.openadsdk.core.NB.vG.pvs(id);
    }

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.Mxy.yiw> pvs = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void icD(Context context) {
            if (DeviceUtils.Jd || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter);
                boolean unused = DeviceUtils.Jd = true;
            } catch (Throwable unused2) {
            }
        }

        public static void pvs(com.bytedance.sdk.openadsdk.Mxy.yiw yiwVar) {
            if (yiwVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.Mxy.yiw> copyOnWriteArrayList = pvs;
                if (copyOnWriteArrayList.contains(yiwVar)) {
                    return;
                }
                copyOnWriteArrayList.add(yiwVar);
            }
        }

        public static void icD(com.bytedance.sdk.openadsdk.Mxy.yiw yiwVar) {
            if (yiwVar == null) {
                return;
            }
            pvs.remove(yiwVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = DeviceUtils.Wyp = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        Iterator<com.bytedance.sdk.openadsdk.Mxy.yiw> it = pvs.iterator();
                        while (it.hasNext()) {
                            it.next().pvs(DeviceUtils.Wyp);
                        }
                        if (DeviceUtils.Mxy != 0) {
                            int unused2 = DeviceUtils.qh = (int) ((DeviceUtils.Wyp / DeviceUtils.Mxy) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.kj = intent.getIntExtra(RemoteConfigConstants.ResponseFieldKey.STATE, 0);
                }
            } catch (Exception unused4) {
            }
        }
    }

    private static class pvs extends BroadcastReceiver {
        private pvs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void icD(Context context) {
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(new pvs(), intentFilter, 2);
                } else {
                    context.registerReceiver(new pvs(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.zM(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.Ju = intent.getIntExtra(RemoteConfigConstants.ResponseFieldKey.STATE, 0) == 1 ? 1 : 0;
            }
        }
    }
}
