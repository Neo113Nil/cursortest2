package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.applovin.impl.n7$$ExternalSyntheticBackport2;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.klz;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.btk;
import com.bytedance.sdk.openadsdk.core.settings.bvs;
import com.bytedance.sdk.openadsdk.core.settings.iv;
import com.bytedance.sdk.openadsdk.fb.zmn.iv;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class rc implements bvs.zmn {
    private static String bjh;
    private volatile boolean cn;
    private int cyb;
    private final Set<String> doe;
    private final Runnable iqz;
    private Set<String> iv;
    private boolean kgc;
    private final com.bytedance.sdk.openadsdk.core.settings.zmn klz;
    private final zg mw;
    private final btk.fs<Set<String>> nqi;
    private int olo;
    private final btk.fs<Map<String, Integer>> phc;
    private final AtomicBoolean rt;
    private btk.fs<JSONObject> uqh;
    btk.fs<com.bytedance.sdk.openadsdk.fb.zmn.iv> zg;
    public static final String zmn = n7$$ExternalSyntheticBackport2.m("_", new CharSequence[]{"bus_con_collect", oub.yj()});
    public static final String fs = n7$$ExternalSyntheticBackport2.m("_", new CharSequence[]{"bus_con", oub.yj(), oub.am(), "timeout"});
    public static final String zn = n7$$ExternalSyntheticBackport2.m("_", new CharSequence[]{"bus_con", oub.yj(), oub.am(), "alpha"});
    private static final String bvs = oub.nqi();
    public static String fb = "";
    public static int btk = -2;
    public static String hhw = "IABTCF_TCString";
    private static boolean rc = false;
    private static final ConcurrentLinkedQueue<iv.zmn> kw = new ConcurrentLinkedQueue<>();
    static final ConcurrentHashMap<String, Integer> nps = new ConcurrentHashMap<>();

    private static final class zmn {
        static final rc zmn = new rc();
    }

    private rc() {
        this.iv = Collections.synchronizedSet(new HashSet());
        this.klz = new com.bytedance.sdk.openadsdk.core.settings.zmn();
        this.mw = new zg(new iv.zmn() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.iv.zmn
            public void zmn() {
                iv.zmn[] zmnVarArr;
                boolean unused = rc.rc = true;
                com.bytedance.sdk.openadsdk.core.rc.fs.zmn().rt();
                if (rc.kw == null || rc.kw.size() == 0 || (zmnVarArr = (iv.zmn[]) rc.kw.toArray()) == null) {
                    return;
                }
                for (iv.zmn zmnVar : zmnVarArr) {
                    zmnVar.zmn();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.iv.zmn
            public void fs() {
                com.bytedance.sdk.openadsdk.core.rc.fs.zmn().cn();
                if (rc.kw == null || rc.kw.isEmpty()) {
                    return;
                }
                Iterator it = rc.kw.iterator();
                while (it.hasNext()) {
                    ((iv.zmn) it.next()).fs();
                }
            }
        });
        this.rt = new AtomicBoolean(false);
        this.cn = false;
        this.cyb = 5000;
        this.olo = 10;
        this.iqz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.7
            @Override // java.lang.Runnable
            public void run() {
                rc.this.zmn(2, false);
                rc.this.nkt();
            }
        };
        this.phc = new btk.fs<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.btk.fs
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> fs(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                    HashMap hashMap = new HashMap(jsonObjectInit.length());
                    Iterator<String> keys = jsonObjectInit.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int optInt = jsonObjectInit.optInt(next, 100);
                            if (optInt >= 0 && optInt <= 100) {
                                hashMap.put(next, Integer.valueOf(optInt));
                            } else {
                                hashMap.put(next, 100);
                            }
                        }
                    }
                    return hashMap;
                } catch (Exception e) {
                    iqz.zn("get applog rate from sp failed:" + e.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.doe = new HashSet();
        this.nqi = new btk.fs<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.btk.fs
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public Set<String> fs(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                        int optInt = jsonObjectInit.optInt("applog_count");
                        if (optInt >= 2 && optInt <= 100) {
                            rc.this.olo = optInt;
                        }
                        int optInt2 = jsonObjectInit.optInt("applog_interval");
                        if (optInt2 >= 100 && optInt2 <= 30000) {
                            rc.this.cyb = optInt2;
                        }
                        JSONArray jSONArray = jsonObjectInit.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        Log.i("TTAD.SdkSettings", e.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.uqh = new btk.fs<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.btk.fs
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public JSONObject fs(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = PangleNetworkBridge.jsonObjectInit(str);
                } catch (Throwable th) {
                    iqz.zn("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.zg = new btk.fs<com.bytedance.sdk.openadsdk.fb.zmn.iv>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.btk.fs
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.fb.zmn.iv fs(String str) {
                com.bytedance.sdk.openadsdk.fb.zmn.iv ivVar = new com.bytedance.sdk.openadsdk.fb.zmn.iv();
                try {
                    JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                    ivVar.zmn(jsonObjectInit.optInt("enable_strategy", 0) == 1);
                    ivVar.zmn(zmn(jsonObjectInit.optJSONObject("default")));
                    JSONObject optJSONObject = jsonObjectInit.optJSONObject("adid_configs");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ivVar.zmn(next, zmn(optJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return ivVar;
            }

            private iv.zmn zmn(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new iv.zmn(jSONObject.optInt("retry_times", -1), jSONObject.optInt(SDKConstants.PARAM_A2U_TIME_INTERVAL, -1));
                }
                return null;
            }
        };
    }

    public void zmn() {
        try {
            zn.fs();
            this.mw.fb();
            this.klz.fb();
            Context zmn2 = kgc.zmn();
            File file = new File(new File(zmn2.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                zmn2.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    public static int zmn(Context context) {
        if (context == null) {
            return -2;
        }
        try {
            SharedPreferences zn2 = zn(context);
            if (zn2 == null) {
                return -2;
            }
            int i = zn2.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
            int i2 = zn2.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
            if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
                return -2;
            }
            return zn2.getInt(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, -1);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static String fs(Context context) {
        SharedPreferences zn2;
        return (context == null || (zn2 = zn(context)) == null) ? "" : zn2.getString(hhw, "");
    }

    @Nullable
    private static SharedPreferences zn(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static rc fs() {
        return zmn.zmn;
    }

    @WorkerThread
    public synchronized void zn() {
        SystemClock.elapsedRealtime();
        boolean z = this.cn;
        this.klz.zmn(this.cn);
        this.mw.zmn(this.cn);
        zn.zmn(!z);
        this.cn = true;
        SystemClock.elapsedRealtime();
        if (!z) {
            cn.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.3
                @Override // java.lang.Runnable
                public void run() {
                    rc.this.zmn(1, com.bytedance.sdk.openadsdk.core.rc.fs.zmn().nps() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().iv());
                    rc.this.nkt();
                }
            }, 1000L);
        }
    }

    public String fb() {
        return this.mw.zmn("aes_key", "");
    }

    public int btk() {
        return this.mw.zmn("max_tpl_cnts", 100);
    }

    @Nullable
    public JSONObject hhw() {
        return (JSONObject) this.mw.zmn("digest", null, btk.zmn);
    }

    public long nps() {
        return this.mw.zmn("data_time", 0L);
    }

    public void zg() {
        this.mw.fs().zmn("ab_test_param").zmn();
    }

    public void zmn(JSONObject jSONObject, btk.zmn zmnVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        zg zgVar = this.mw;
        String str = bvs;
        String zmn2 = zgVar.zmn("dyn_draw_engine_url", str);
        final String optString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(zmn2) && !TextUtils.isEmpty(optString) && !optString.equals(zmn2)) {
            cn.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(rc.this.mw.zmn("dyn_draw_engine_url", rc.bvs), optString)) {
                        com.bytedance.sdk.component.adexpress.zmn.fs.btk.fs().zn();
                    }
                }
            }, 5000L);
        }
        zmnVar.zmn("dyn_draw_engine_url", optString);
    }

    public int zmn(String str) {
        if (str == null) {
            return 0;
        }
        return kgc.fb().kjb(str).kw;
    }

    public String bvs() {
        return this.mw.zmn("ab_test_version", "");
    }

    public int iv() {
        return this.mw.zmn("splash_video_load_strategy", 0);
    }

    public int fs(String str) {
        Integer num;
        Map map = (Map) this.mw.zmn("perf_con_applog_rate", null, this.phc);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int rc() {
        return this.mw.zmn("perf_con_drawable_code", 0);
    }

    public Set<String> klz() {
        return vpd();
    }

    public int mw() {
        vpd();
        return this.olo;
    }

    public int rt() {
        vpd();
        return this.cyb;
    }

    public boolean cn() {
        return this.mw.zmn("allow_blind_mode_request_ad", false);
    }

    public boolean cyb() {
        return this.mw.zmn("support_gzip", false);
    }

    public boolean olo() {
        return this.mw.zmn("ad_revenue_enable", true);
    }

    public boolean kgc() {
        return this.mw.zmn("bus_con_adshow_check_enable", true);
    }

    public String kw() {
        return this.mw.zmn("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public int iqz() {
        return this.mw.zmn("bus_con_behavior_count", 300);
    }

    public String phc() {
        return this.mw.zmn("bus_con_check_clz", "");
    }

    public boolean doe() {
        return this.mw.zmn("bus_con_url_check", 1) != 0;
    }

    public boolean nqi() {
        return this.mw.zmn(zmn, false);
    }

    public int uqh() {
        return this.mw.zmn(fs, 10000);
    }

    public float bjh() {
        return this.mw.zmn(zn, 1.0f);
    }

    public int rp() {
        return this.mw.zmn("bus_con_slide_num", 2);
    }

    public int kjb() {
        return this.mw.zmn("loadedCallbackOpportunity", 0);
    }

    public String zak() {
        return this.mw.zmn("ab_test_param", "");
    }

    public boolean am() {
        return this.mw.zmn("landingpage_new_style", -1) == 1;
    }

    public long yj() {
        return this.mw.zmn(IronSourceConstants.EVENTS_DURATION, 10000L);
    }

    public int so() {
        return this.mw.zmn("max", 50);
    }

    public hhw ev() {
        return (hhw) this.mw.zmn("insert_js_config", hhw.zmn, new btk.fs<hhw>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.btk.fs
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public hhw fs(String str) {
                return new hhw(str);
            }
        });
    }

    public int tf() {
        int zmn2 = this.mw.zmn("fetch_tpl_timeout_ctrl", 3000);
        if (zmn2 <= 0) {
            return 3000;
        }
        return zmn2;
    }

    public int fkt() {
        int zmn2 = this.mw.zmn("fetch_tpl_second", 0);
        if (zmn2 <= 0) {
            return 0;
        }
        return zmn2;
    }

    public void hgd() {
        String va = va();
        if (TextUtils.isEmpty(va)) {
            return;
        }
        if (va.equals("zh-Hant")) {
            klz.zmn(kgc.zmn(), "zh", "tw");
        } else {
            klz.zmn(kgc.zmn(), va, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            iqz.zn("TTAD.SdkSettings", th.getMessage());
        }
    }

    private String va() {
        return this.mw.zmn("force_language", "");
    }

    public boolean zn(String str) {
        return kjb(str).zn == 1;
    }

    public boolean fb(String str) {
        return kjb(str).zak;
    }

    public boolean btk(String str) {
        int i = kjb(str).btk;
        if (i != 1) {
            return i == 2 && com.bytedance.sdk.component.utils.kgc.zn(kgc.zmn()) != 0;
        }
        return com.bytedance.sdk.component.utils.kgc.fb(kgc.zmn());
    }

    public boolean hhw(String str) {
        return kjb(str).nps == 1;
    }

    public int nps(String str) {
        return kjb(str).kgc;
    }

    public boolean zg(String str) {
        return str == null || kjb(str).rt == 1;
    }

    public int bvs(String str) {
        if (str == null) {
            return 1;
        }
        return kjb(str).rt;
    }

    public int iv(String str) {
        if (str == null) {
            return 5000;
        }
        return kjb(str).cyb;
    }

    public int rc(String str) {
        return kjb(str).rc;
    }

    public int klz(String str) {
        return kjb(str).klz;
    }

    public boolean mw(String str) {
        try {
            return kjb(str).nqi != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean nu() {
        return this.mw.zn();
    }

    public int rt(String str) {
        return kjb(String.valueOf(str)).zg;
    }

    public boolean cn(String str) {
        return rt(str) != 1;
    }

    public int cyb(String str) {
        return kjb(str).iv;
    }

    public boolean olo(String str) {
        return kjb(str).doe == 0;
    }

    public boolean kgc(String str) {
        return str == null || DeviceUtils.iv(kgc.zmn()) == 0 || kjb(str).mw == 1;
    }

    public String ww() {
        return this.mw.zmn("ads_url", "");
    }

    public String oub() {
        return this.mw.zmn("settings_url", "");
    }

    public String jy() {
        return this.mw.zmn("app_log_url", "");
    }

    public String vlj() {
        return this.mw.zmn("policy_url", "");
    }

    public int yof() {
        return this.mw.zmn("ivrv_downward", 0);
    }

    public String dgt() {
        return this.mw.zmn("dyn_draw_engine_url", bvs);
    }

    public String cud() {
        return this.mw.zmn("dc", "TX");
    }

    public String gn() {
        return this.mw.zmn("dc", "");
    }

    public int zmn(int i) {
        return kjb(String.valueOf(i)).so;
    }

    public int fs(int i) {
        return kjb(String.valueOf(i)).fs;
    }

    public int zn(int i) {
        return kjb(String.valueOf(i)).bvs;
    }

    public int uqd() {
        return this.mw.zmn("vbtt", 5);
    }

    public JSONObject kw(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(this.mw.zmn("core_settings", ""));
            try {
                jsonObjectInit.put("ad_slot_setting", kjb(str).ev);
                return jsonObjectInit;
            } catch (JSONException e) {
                e = e;
                jSONObject = jsonObjectInit;
                iqz.zn("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public int iqz(String str) {
        return kjb(str).iqz;
    }

    public boolean phc(String str) {
        return kjb(str).phc;
    }

    public int doe(String str) {
        return kjb(str).bjh;
    }

    public int nqi(String str) {
        return kjb(str).rp;
    }

    public int uqh(String str) {
        return kjb(str).kjb;
    }

    public boolean bjh(String str) {
        return kjb(str).yj;
    }

    public boolean rp(String str) {
        return kgc.fb().kjb(str).cn == 1;
    }

    @NonNull
    public fs kjb(String str) {
        return zn.zmn(str);
    }

    public boolean kra() {
        int zmn2 = this.mw.zmn("privacy_ad_enable", Integer.MAX_VALUE);
        if (zmn2 == 1) {
            return true;
        }
        if (zmn2 == 0) {
            return false;
        }
        int bjh2 = oub.bjh();
        return bjh2 == 1 || bjh2 == 2 || bjh2 == 3;
    }

    public int na() {
        int zmn2 = this.mw.zmn("privacy_personalized_ad", Integer.MAX_VALUE);
        if (zmn2 != Integer.MAX_VALUE) {
            return zmn2;
        }
        int bjh2 = oub.bjh();
        if (bjh2 == 1 || bjh2 == 2) {
            return 2;
        }
        return bjh2 != 3 ? 0 : 1;
    }

    public boolean mhu() {
        return this.mw.zmn("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public boolean bxw() {
        return this.mw.zmn("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    public boolean tet() {
        return this.mw.zmn("privacy_debug_unlock", 1) != 0;
    }

    public boolean zak(@NonNull String str) {
        Set set = (Set) this.mw.zmn("privacy_fields_allowed", Collections.emptySet(), btk.fs);
        if (set.isEmpty()) {
            int bjh2 = oub.bjh();
            if (bjh2 != 1) {
                if (bjh2 != 2 && bjh2 != 3) {
                    return false;
                }
                if (!"mcc".equals(str) && !"mnc".equals(str)) {
                    return false;
                }
            }
            return true;
        }
        return set.contains(str);
    }

    public String yo() {
        return this.mw.zmn("privacy_app_reg", "");
    }

    public boolean xrr() {
        return this.cn;
    }

    public boolean ve() {
        return this.mw.zmn("global_rate", 1.0f) == 1.0f;
    }

    public boolean cd() {
        return this.mw.zmn("read_video_from_cache", 1) == 1;
    }

    public int lt() {
        int zmn2 = this.mw.zmn("perf_con_webview_cache_count", 0);
        if (zmn2 < 0) {
            return 0;
        }
        return zmn2;
    }

    public int io() {
        int zmn2 = this.mw.zmn("perf_con_webview_cache_count_v3", 0);
        if (zmn2 < 0) {
            return 0;
        }
        return zmn2;
    }

    public String[] lbc() {
        Set<String> set;
        try {
            set = this.iv;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.mw.zmn("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.iv.add(jSONArray.getString(i));
                }
            }
            Set<String> zmn2 = zg.zmn(this.iv);
            this.iv = zmn2;
            if (zmn2 != null) {
                if (zmn2.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.iv.toArray(new String[0]);
    }

    public int hwg() {
        return this.mw.zmn("blank_detect_rate", 30);
    }

    public long rje() {
        long zmn2 = this.mw.zmn("req_inter_min", 600000L);
        if (zmn2 < 0 || zmn2 > 86400000) {
            return 600000L;
        }
        return zmn2;
    }

    public long zi() {
        return this.mw.zmn("last_req_time", 0L);
    }

    public void zmn(long j) {
        this.mw.fs().zmn("last_req_time", j).zmn();
    }

    void nkt() {
        cn.fs().removeCallbacks(this.iqz);
        cn.fs().postDelayed(this.iqz, rje());
    }

    public boolean oep() {
        return this.rt.get();
    }

    public void zmn(@TTSdkSettings.FETCH_REQUEST_SOURCE final int i, boolean z) {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().fb()) {
            return;
        }
        if (!cn.btk() && i != 1 && i != 2) {
            if (z) {
                this.kgc = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.iv.fs().fb())) {
                return;
            }
            if (this.kgc) {
                this.kgc = false;
                if (!z) {
                    z = true;
                }
            }
            long zi = zi();
            long currentTimeMillis = System.currentTimeMillis();
            long rje = rje();
            long j = currentTimeMillis - zi;
            if ((z || j >= rje) && this.rt.compareAndSet(false, true)) {
                nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.rc.fs.zmn().zmn(new com.bytedance.sdk.openadsdk.core.rc.fb() { // from class: com.bytedance.sdk.openadsdk.core.settings.rc.6.1
                            @Override // com.bytedance.sdk.openadsdk.core.rc.fb
                            public void zmn(boolean z2) {
                                if (!z2) {
                                    rc.this.rt.set(false);
                                } else {
                                    rc rcVar = rc.this;
                                    new bvs(rcVar, rcVar.mw, rc.this.klz).run();
                                }
                            }
                        }, i == 6);
                    }
                });
                cn.fs().removeCallbacks(this.iqz);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.bvs.zmn
    public void zmn(boolean z) {
        this.rt.set(false);
        nkt();
        if (z) {
            HashMap hashMap = new HashMap();
            Set<String> ob = ob();
            if (ob != null && !ob.isEmpty()) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, ob);
            }
            String kgc = oub.kgc();
            if (!TextUtils.isEmpty(kgc)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, kgc);
            }
            if (com.bytedance.sdk.openadsdk.utils.fs.fs()) {
                Set<String> hip = fs().hip();
                if (hip != null && !hip.isEmpty()) {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, hip);
                } else {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
                }
            } else {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, eug());
            com.bytedance.sdk.openadsdk.core.klz.zn.zmn(hashMap);
        }
    }

    public boolean tdm() {
        if (com.bytedance.sdk.component.adexpress.fb.fs.zmn(kgc.zmn())) {
            return this.mw.zmn("support_rtl", false);
        }
        return false;
    }

    private Set<String> vpd() {
        return (Set) this.mw.zmn("perf_con_applog_send", this.doe, this.nqi);
    }

    public boolean mpi() {
        int zmn2 = this.klz.zmn("perf_con_apm", 100);
        if (zmn2 == 0) {
            return false;
        }
        return zmn2 < 0 || zmn2 >= 100 || zmn2 > ((int) (Math.random() * 100.0d));
    }

    public long skn() {
        return this.mw.zmn("perf_con_adlog_expire_time", 0L);
    }

    public boolean ax() {
        return this.mw.zmn("perf_con_is_new_net_thread", 0) == 1;
    }

    public JSONObject obg() {
        return (JSONObject) this.mw.zmn("perf_con_thread_pool_config", new JSONObject(), this.uqh);
    }

    public boolean nlz() {
        return this.mw.zmn("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public boolean es() {
        return this.mw.zmn("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public String hsp() {
        return this.mw.zmn("dual_event_url", (String) null);
    }

    public Set<String> utx() {
        Set<String> set = (Set) this.mw.zmn("dual_event_url_backup", Collections.emptySet(), btk.fs);
        return (set == null || set.size() == 0) ? Collections.emptySet() : set;
    }

    public int uw() {
        int zmn2 = this.mw.zmn("bus_con_auto_click_delay", 3000);
        if (zmn2 <= 0) {
            return 3000;
        }
        return zmn2;
    }

    public com.bytedance.sdk.openadsdk.fb.zmn.iv wq() {
        return (com.bytedance.sdk.openadsdk.fb.zmn.iv) this.mw.zmn("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.fb.zmn.iv.zmn, this.zg);
    }

    public Set<String> bmc() {
        return (Set) this.mw.zmn("perf_con_drop2rt_skip_label_list", Collections.emptySet(), btk.fs);
    }

    public int vtz() {
        return this.mw.zmn("perf_con_sync_gaid", 0);
    }

    public static boolean mig() {
        return rc;
    }

    public static void zmn(iv.zmn zmnVar) {
        ConcurrentLinkedQueue<iv.zmn> concurrentLinkedQueue = kw;
        if (concurrentLinkedQueue.contains(zmnVar)) {
            return;
        }
        concurrentLinkedQueue.add(zmnVar);
    }

    public boolean ouf() {
        return this.mw.zmn("bus_con_video_keep_screen_on", 1) == 1;
    }

    public void sxr() {
        btk.zmn fs2 = this.mw.fs();
        fs2.zmn("settings_url", "");
        fs2.zmn();
        yj("");
    }

    public Set<String> ob() {
        return (Set) this.mw.zmn("privacy_fields_allowed", Collections.emptySet(), btk.fs);
    }

    public boolean tev() {
        return this.mw.zmn("token_enable", 0) == 1;
    }

    public boolean am(String str) {
        Set<String> rsi;
        if (TextUtils.isEmpty(str) || (rsi = rsi()) == null || rsi.size() == 0) {
            return false;
        }
        return rsi.contains(str);
    }

    public Set<String> rsi() {
        return (Set) this.mw.zmn("token_adx_ids", Collections.emptySet(), btk.fs);
    }

    public Set<String> hip() {
        Set<String> set = (Set) this.mw.zmn("ads_url_backup", Collections.emptySet(), btk.fs);
        return (set == null || set.size() == 0) ? Collections.emptySet() : set;
    }

    public String eug() {
        return this.mw.zmn("target_region", "");
    }

    public static String mrt() {
        if (bjh == null) {
            String fs2 = com.bytedance.sdk.openadsdk.core.zn.zmn().fs("settings_host_from_meta", "");
            bjh = fs2;
            if (fs2 == null) {
                bjh = "";
            }
        }
        return bjh;
    }

    public static void yj(String str) {
        if (str == null) {
            str = "";
        }
        String mrt = mrt();
        if (mrt == null || !mrt.equals(str)) {
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("settings_host_from_meta", str);
            bjh = str;
            fs().zmn(8, true);
        }
    }
}
