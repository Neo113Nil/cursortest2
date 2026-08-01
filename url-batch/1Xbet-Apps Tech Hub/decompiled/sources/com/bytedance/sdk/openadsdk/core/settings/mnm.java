package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.settings.IP;
import com.bytedance.sdk.openadsdk.core.settings.NB;
import com.bytedance.sdk.openadsdk.core.settings.bNS;
import com.bytedance.sdk.openadsdk.icD.pvs.IP;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.material.card.MaterialCardViewHelper;
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

/* compiled from: TTSdkSettings.java */
/* loaded from: classes2.dex */
public class mnm implements IP.pvs, sUS {
    private NB.icD<JSONObject> CvL;
    private volatile boolean IP;
    final NB.icD<ConcurrentHashMap<String, Integer>> Jd;
    private final AtomicBoolean Ju;
    NB.icD<com.bytedance.sdk.openadsdk.icD.pvs.IP> NB;
    private final BroadcastReceiver OT;
    private final Wyp Wyp;
    private final NB.icD<Map<String, Integer>> ZhG;
    private boolean bNS;
    private boolean cR;
    private final NB.icD<Set<String>> dX;
    private final Set<String> dyT;
    private final Ju kj;
    private int mnm;
    private final Runnable ny;
    private final com.bytedance.sdk.openadsdk.core.settings.pvs qh;
    private Mxy uc;
    private int vA;
    private Set<String> yiw;
    private static final String sUS = jlb.IP();
    private static final com.bytedance.sdk.component.so.so so = new com.bytedance.sdk.component.so.so("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.adexpress.pvs.icD.NB.icD().Mxy();
            com.bytedance.sdk.component.adexpress.pvs.icD.NB.icD().icD(false);
            com.bytedance.sdk.component.adexpress.pvs.icD.icD.icD();
            com.bytedance.sdk.component.adexpress.pvs.icD.NB.icD().vG();
        }
    };
    public static String pvs = "";
    public static String icD = "IABTCF_TCString";
    private static boolean Mxy = false;
    private static final ConcurrentLinkedQueue<bNS.pvs> zM = new ConcurrentLinkedQueue<>();
    private static final qh rCZ = new qh();
    static final ConcurrentHashMap<String, Integer> vG = new ConcurrentHashMap<>();

    /* compiled from: TTSdkSettings.java */
    private static final class pvs {
        static final mnm pvs = new mnm();
    }

    private static int vG(boolean z) {
        return z ? 20 : 5;
    }

    private mnm() {
        this.yiw = Collections.synchronizedSet(new HashSet());
        this.Wyp = new Wyp();
        this.qh = new com.bytedance.sdk.openadsdk.core.settings.pvs();
        this.kj = new Ju(new bNS.pvs() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.bNS.pvs
            public void pvs() {
                bNS.pvs[] pvsVarArr;
                boolean unused = mnm.Mxy = true;
                if (mnm.zM == null || mnm.zM.size() == 0 || (pvsVarArr = (bNS.pvs[]) mnm.zM.toArray()) == null) {
                    return;
                }
                for (bNS.pvs pvsVar : pvsVarArr) {
                    pvsVar.pvs();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.bNS.pvs
            public void icD() {
                if (mnm.zM == null || mnm.zM.isEmpty()) {
                    return;
                }
                Iterator it = mnm.zM.iterator();
                while (it.hasNext()) {
                    ((bNS.pvs) it.next()).icD();
                }
            }
        });
        this.Ju = new AtomicBoolean(false);
        this.IP = false;
        this.bNS = false;
        this.mnm = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
        this.vA = 10;
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.OT = anonymousClass11;
        this.ny = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.12
            @Override // java.lang.Runnable
            public void run() {
                mnm.this.Jd(2);
                mnm.this.VVr();
            }
        };
        this.Jd = new NB.icD<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> icD(String str) {
                if (TextUtils.isEmpty(str)) {
                    return mnm.vG;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int optInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && optInt >= 0 && optInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(optInt));
                        }
                    }
                } catch (JSONException e) {
                    Log.i("TTAD.SdkSettings", e.getMessage());
                }
                return concurrentHashMap;
            }
        };
        this.ZhG = new NB.icD<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> icD(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap hashMap = new HashMap(jSONObject.length());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int optInt = jSONObject.optInt(next, 100);
                            if (optInt >= 0 && optInt <= 100) {
                                hashMap.put(next, Integer.valueOf(optInt));
                            } else {
                                hashMap.put(next, 100);
                            }
                        }
                    }
                    return hashMap;
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.icD("get applog rate from sp failed:" + e.getMessage());
                    return null;
                }
            }
        };
        this.dyT = new HashSet();
        this.dX = new NB.icD<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public Set<String> icD(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("applog_count");
                        if (optInt >= 2 && optInt <= 100) {
                            mnm.this.vA = optInt;
                        }
                        int optInt2 = jSONObject.optInt("applog_interval");
                        if (optInt2 >= 100 && optInt2 <= 30000) {
                            mnm.this.mnm = optInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
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
        this.CvL = new NB.icD<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public JSONObject icD(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.NB = new NB.icD<com.bytedance.sdk.openadsdk.icD.pvs.IP>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.icD.pvs.IP icD(String str) {
                com.bytedance.sdk.openadsdk.icD.pvs.IP ip = new com.bytedance.sdk.openadsdk.icD.pvs.IP();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    ip.pvs(jSONObject.optInt("enable_strategy", 0) == 1);
                    ip.pvs(pvs(jSONObject.optJSONObject("default")));
                    JSONObject optJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ip.pvs(next, pvs(optJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return ip;
            }

            private IP.pvs pvs(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new IP.pvs(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                pvs2.registerReceiver(anonymousClass11, intentFilter, 4);
            } else {
                pvs2.registerReceiver(anonymousClass11, intentFilter);
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.SdkSettings", "", e);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void pvs() {
        try {
            vG.pvs();
            this.kj.vG();
            this.Wyp.vG();
            this.qh.vG();
            Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
            File file = new File(new File(pvs2.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                pvs2.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    private static void icD(int i, boolean z) {
        Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        if (pvs2 != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(pvs2.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z);
                intent.putExtra("_source", i);
                pvs2.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public static void nS() {
        Context pvs2;
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG() && (pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(pvs2.getPackageName());
                intent.setAction("_dataChanged");
                pvs2.sendBroadcast(intent);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.SdkSettings", "", th);
            }
        }
    }

    public static int icD(Context context) {
        SharedPreferences Jd;
        if (context == null || (Jd = Jd(context)) == null) {
            return -2;
        }
        if ((Jd.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE) == Integer.MIN_VALUE && Jd.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE) == Integer.MIN_VALUE) ? false : true) {
            return Jd.getInt("IABTCF_gdprApplies", -1);
        }
        return -2;
    }

    public static String vG(Context context) {
        SharedPreferences Jd;
        return (context == null || (Jd = Jd(context)) == null) ? "" : Jd.getString(icD, "");
    }

    private static SharedPreferences Jd(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static sUS Lxj() {
        if (com.bytedance.sdk.openadsdk.core.mnm.pvs() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("context is null");
            Log.e("Pangle", "context is null", illegalStateException);
            ApmHelper.reportCustomError("context is null", "context is null", illegalStateException);
            return rCZ;
        }
        return pvs.pvs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public synchronized void icD() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = !this.IP;
        this.Wyp.pvs(this.IP);
        this.qh.pvs(this.IP);
        this.kj.pvs(this.IP);
        vG.pvs(z);
        com.bytedance.sdk.openadsdk.core.so.icD().Jd(xa());
        this.IP = true;
        Object[] objArr = new Object[3];
        Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        if (z) {
            com.bytedance.sdk.openadsdk.core.Ju.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.7
                @Override // java.lang.Runnable
                public void run() {
                    if (IP.pvs()) {
                        mnm.this.Jd(1);
                        mnm.this.VVr();
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().icD();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String vG() {
        return this.kj.pvs("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int Jd() {
        return this.kj.pvs("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public JSONObject NB() {
        return (JSONObject) this.kj.pvs("digest", null, NB.pvs);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public long sUS() {
        return this.kj.pvs("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void yiw() {
        this.kj.pvs().pvs("tt_sdk_settings").pvs("ab_test_param").pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void pvs(JSONObject jSONObject, NB.pvs pvsVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        Ju ju = this.kj;
        String str = sUS;
        String pvs2 = ju.pvs("dyn_draw_engine_url", str);
        final String optString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(pvs2) && !TextUtils.isEmpty(optString) && !optString.equals(pvs2)) {
            com.bytedance.sdk.openadsdk.core.Ju.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.8
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(mnm.this.kj.pvs("dyn_draw_engine_url", mnm.sUS), optString)) {
                        com.bytedance.sdk.component.adexpress.pvs.icD.NB.icD().vG();
                    }
                }
            }, 5000L);
        }
        pvsVar.pvs("dyn_draw_engine_url", optString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int pvs(String str) {
        if (str == null) {
            return 0;
        }
        return com.bytedance.sdk.openadsdk.core.mnm.Jd().Gp(str).zM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void icD(JSONObject jSONObject, NB.pvs pvsVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int optInt = jSONObject.optInt("is_gdpr_user", -1);
            pvsVar.pvs("isGdprUser", (optInt == -1 || optInt == 1 || optInt == 0) ? optInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean so() {
        return this.kj.pvs("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean Mxy() {
        return !(this.kj.pvs("support_tnc", 1) == 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String Wyp() {
        return this.kj.pvs("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int qh() {
        return this.kj.pvs("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int kj() {
        return this.kj.pvs("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean Ju() {
        return this.kj.pvs("support_mem_dynamic", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int icD(String str) {
        Integer num;
        Map map = (Map) this.kj.pvs("perf_con_stats_rate", vG, this.Jd);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int gA(String str) {
        Integer num;
        Map map = (Map) this.kj.pvs("perf_con_applog_rate", null, this.ZhG);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int AEt() {
        return this.kj.pvs("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public Set<String> IP() {
        return MA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int bNS() {
        MA();
        return this.vA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int mnm() {
        MA();
        return this.mnm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean vA() {
        return this.kj.pvs("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean cR() {
        return this.kj.pvs("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean zM() {
        return this.kj.pvs("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean elv() {
        return this.kj.pvs("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public long rcB() {
        long pvs2 = this.kj.pvs("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME);
        return pvs2 < WorkRequest.MIN_BACKOFF_MILLIS ? WorkRequest.MIN_BACKOFF_MILLIS : pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int UYh() {
        int pvs2 = this.kj.pvs("bus_con_token_thread_count", 4);
        if (pvs2 <= 0 || pvs2 > 30) {
            return 4;
        }
        return pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String FFl() {
        return this.kj.pvs("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int yhq() {
        return this.kj.pvs("bus_con_behavior_count", MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String Tdd() {
        return this.kj.pvs("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean ABo() {
        return this.kj.pvs("bus_con_url_check", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean mRq() {
        return this.kj.pvs("bus_con_collect_arbitrage", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int SJ() {
        return this.kj.pvs("bus_con_arbitrage_loading_timeout", 10000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public float ig() {
        return this.kj.pvs("bus_con_arbitrage_loading_alpha", 1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int uc() {
        return this.kj.pvs("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String rCZ() {
        return this.kj.pvs("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public Mxy OT() {
        Mxy mxy = this.uc;
        if (mxy != null) {
            return mxy;
        }
        Mxy mxy2 = (Mxy) this.Wyp.pvs("mediation_init_conf", Mxy.pvs, new NB.icD<Mxy>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public Mxy icD(String str) {
                return new Mxy(str);
            }
        });
        this.uc = mxy2;
        return mxy2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean ny() {
        return this.kj.pvs("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public long ZhG() {
        return this.kj.pvs(TypedValues.TransitionType.S_DURATION, WorkRequest.MIN_BACKOFF_MILLIS);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int dyT() {
        return this.kj.pvs("max", 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public yiw dX() {
        return (yiw) this.kj.pvs("insert_js_config", yiw.pvs, new NB.icD<yiw>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public yiw icD(String str) {
                return new yiw(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String CvL() {
        return this.kj.pvs("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int Gp() {
        int pvs2 = this.kj.pvs("fetch_tpl_timeout_ctrl", PathInterpolatorCompat.MAX_NUM_POINTS);
        return pvs2 <= 0 ? PathInterpolatorCompat.MAX_NUM_POINTS : pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int ae() {
        int pvs2 = this.kj.pvs("fetch_tpl_second", 0);
        if (pvs2 <= 0) {
            return 0;
        }
        return pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void gA() {
        String LEC = LEC();
        if (TextUtils.isEmpty(LEC)) {
            return;
        }
        if (LEC.equals("zh-Hant")) {
            com.bytedance.sdk.component.utils.Wyp.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), "zh", "tw");
        } else {
            com.bytedance.sdk.component.utils.Wyp.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), LEC, null);
        }
        try {
            TTAdDislikeToast.pvs();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.SdkSettings", th.getMessage());
        }
    }

    private String LEC() {
        return this.kj.pvs("force_language", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int jlb() {
        return this.kj.pvs("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean vG(String str) {
        return Gp(str).vG == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean Jd(String str) {
        return Gp(str).ae;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean NB(String str) {
        int i = Gp(str).NB;
        if (i != 1) {
            return i == 2 && com.bytedance.sdk.component.utils.mnm.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs()) != 0;
        }
        return com.bytedance.sdk.component.utils.mnm.Jd(com.bytedance.sdk.openadsdk.core.mnm.pvs());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean sUS(String str) {
        return Gp(str).yiw == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int yiw(String str) {
        return Gp(str).cR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean so(String str) {
        return str == null || Gp(str).IP == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int Mxy(String str) {
        if (str == null) {
            return 1500;
        }
        return Gp(str).mnm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int Wyp(String str) {
        return Gp(str).qh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int qh(String str) {
        return Gp(str).kj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean kj(String str) {
        try {
            return Gp(str).ny != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean dx() {
        return this.kj.icD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int Ju(String str) {
        return Gp(String.valueOf(str)).so;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean IP(String str) {
        return Ju(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int bNS(String str) {
        return Gp(str).Wyp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int pvs(String str, boolean z) {
        if (str == null) {
            return vG(z);
        }
        icD Gp = Gp(str);
        return Gp.dyT != -1 ? Gp.dyT : vG(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean mnm(String str) {
        return Gp(str).OT == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean vA(String str) {
        return str == null || DeviceUtils.so(com.bytedance.sdk.openadsdk.core.mnm.pvs()) == 0 || Gp(str).Ju == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String Pj() {
        return this.kj.pvs("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String cRf() {
        return this.kj.pvs("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String sP() {
        return this.qh.pvs("apm_url", "pangolin16.sgsnssdk.com");
    }

    private int xa() {
        return this.kj.pvs("coppa", -99);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String gSd() {
        return this.kj.pvs("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int qD() {
        return this.kj.pvs("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String od() {
        return this.kj.pvs("dyn_draw_engine_url", sUS);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String OhP() {
        return this.kj.pvs("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int jhZ() {
        return this.kj.pvs("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int pvs(int i) {
        return Gp(String.valueOf(i)).Pj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int icD(int i) {
        return Gp(String.valueOf(i)).icD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int vG(int i) {
        return Gp(String.valueOf(i)).Mxy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int SE() {
        return this.kj.pvs("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public JSONObject cR(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.kj.pvs("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", Gp(str).ea);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int zM(String str) {
        return Gp(str).uc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean uc(String str) {
        return Gp(str).rCZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int rCZ(String str) {
        return Gp(str).dX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int OT(String str) {
        return Gp(str).CvL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int ny(String str) {
        return Gp(str).Gp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean ZhG(String str) {
        return Gp(str).gA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean dyT(String str) {
        return Gp(str).jlb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int dX(String str) {
        return Gp(str).dx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean CvL(String str) {
        return com.bytedance.sdk.openadsdk.core.mnm.Jd().Gp(str).bNS == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public icD Gp(String str) {
        return vG.pvs(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean yWX() {
        int pvs2 = this.kj.pvs("privacy_ad_enable", Integer.MAX_VALUE);
        if (pvs2 == 1) {
            return true;
        }
        if (pvs2 == 0) {
            return false;
        }
        int mnm = jlb.mnm();
        return mnm == 1 || mnm == 2 || mnm == 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int sq() {
        int pvs2 = this.kj.pvs("privacy_personalized_ad", Integer.MAX_VALUE);
        if (pvs2 != Integer.MAX_VALUE) {
            return pvs2;
        }
        int mnm = jlb.mnm();
        if (mnm == 1 || mnm == 2) {
            return 2;
        }
        return mnm != 3 ? 0 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean Ayu() {
        return this.kj.pvs("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean ZsW() {
        boolean z = this.kj.pvs("bus_con_sec_type", Integer.MAX_VALUE) != 0;
        Object[] objArr = new Object[2];
        Boolean.valueOf(z);
        return z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean CjQ() {
        return this.kj.pvs("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean BSi() {
        return this.kj.pvs("privacy_debug_unlock", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean ae(String str) {
        Set set = (Set) this.kj.pvs("privacy_fields_allowed", Collections.emptySet(), NB.icD);
        if (set.isEmpty()) {
            int mnm = jlb.mnm();
            if (mnm != 1) {
                if (mnm != 2 && mnm != 3) {
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

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean cnN() {
        return this.IP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean OyE() {
        return this.kj.pvs("global_rate", 1.0f) == 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean joF() {
        return this.kj.pvs("read_video_from_cache", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int thO() {
        int pvs2 = this.kj.pvs("perf_con_webview_cache_count", 0);
        if (pvs2 < 0) {
            return 0;
        }
        return pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int qd() {
        int pvs2 = this.kj.pvs("perf_con_webview_cache_count_v3", 0);
        if (pvs2 < 0) {
            return 0;
        }
        return pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int rW() {
        int pvs2 = this.kj.pvs("perf_con_webview_preload_cache", 0);
        if (pvs2 < 0) {
            return 0;
        }
        if (pvs2 > 5) {
            return 5;
        }
        int thO = thO();
        return pvs2 > thO ? thO : pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int Cwg() {
        int pvs2 = this.kj.pvs("perf_con_webview_preload_cache_v3", 0);
        if (pvs2 < 0) {
            return 0;
        }
        if (pvs2 > 5) {
            return 5;
        }
        int qd = qd();
        return pvs2 > qd ? qd : pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String[] neB() {
        Set<String> set;
        try {
            set = this.yiw;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.kj.pvs("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.yiw.add(jSONArray.getString(i));
                }
            }
            Set<String> pvs2 = Ju.pvs(this.yiw);
            this.yiw = pvs2;
            if (pvs2 != null) {
                if (pvs2.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.yiw.toArray(new String[0]);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int cGU() {
        return this.kj.pvs("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public JSONObject Ca() {
        return (JSONObject) this.kj.pvs("video_cache_config", null, NB.pvs);
    }

    private long LHy() {
        long pvs2 = this.kj.pvs("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (pvs2 < 0 || pvs2 > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : pvs2;
    }

    private long wr() {
        return this.kj.pvs("last_req_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void pvs(long j) {
        this.kj.pvs().pvs("last_req_time", j).pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void Zm() {
        this.bNS = true;
    }

    void VVr() {
        if (IP.pvs()) {
            com.bytedance.sdk.openadsdk.core.Ju.icD().removeCallbacks(this.ny);
            com.bytedance.sdk.openadsdk.core.Ju.icD().postDelayed(this.ny, LHy());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void Jd(int i) {
        pvs(i, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void pvs(int i, boolean z) {
        if (!com.bytedance.sdk.openadsdk.core.Ju.NB() && i != 1 && i != 2) {
            if (z) {
                this.cR = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.so.icD().Jd())) {
                return;
            }
            if (this.cR) {
                this.cR = false;
                if (!z) {
                    z = true;
                }
            }
            long wr = wr();
            long currentTimeMillis = System.currentTimeMillis();
            long LHy = LHy();
            long j = currentTimeMillis - wr;
            if (!z && j < LHy) {
                com.bytedance.sdk.openadsdk.core.sUS.pvs.pvs();
                return;
            }
            if (!IP.pvs()) {
                icD(i, z);
            } else if (this.Ju.compareAndSet(false, true)) {
                ae.icD(new IP(this, this.kj, this.Wyp, this.qh));
                com.bytedance.sdk.openadsdk.core.Ju.icD().removeCallbacks(this.ny);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.IP.pvs
    public void pvs(boolean z) {
        this.Ju.set(false);
        VVr();
        if (z) {
            nS();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public void pvs(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.OT, intentFilter, 4);
            } else {
                context.registerReceiver(this.OT, intentFilter);
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.SdkSettings", "", e);
        }
        if (cnN()) {
            Jd(1);
            VVr();
        }
    }

    /* compiled from: TTSdkSettings.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.mnm$11, reason: invalid class name */
    class AnonymousClass11 extends BroadcastReceiver {
        private final Runnable icD = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.11.1
            @Override // java.lang.Runnable
            public void run() {
                ae.icD(new com.bytedance.sdk.component.so.so("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            mnm.this.icD();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        AnonymousClass11() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            ae.icD(new com.bytedance.sdk.component.so.so("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.mnm.11.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        mnm.this.pvs(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.so.pvs().removeCallbacks(AnonymousClass11.this.icD);
                        com.bytedance.sdk.component.utils.so.pvs().postDelayed(AnonymousClass11.this.icD, WorkRequest.MIN_BACKOFF_MILLIS);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean HWd() {
        if (com.bytedance.sdk.component.adexpress.Jd.icD.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs())) {
            return this.kj.pvs("support_rtl", false);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int Ye() {
        return this.kj.pvs("bus_con_send_log_type", 1);
    }

    private Set<String> MA() {
        return (Set) this.kj.pvs("perf_con_applog_send", this.dyT, this.dX);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int tQ() {
        return this.kj.pvs("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean ea() {
        int pvs2 = this.qh.pvs("perf_con_apm", 100);
        if (pvs2 == 0) {
            return false;
        }
        return pvs2 < 0 || pvs2 >= 100 || pvs2 > ((int) (Math.random() * 100.0d));
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public long tCd() {
        return this.kj.pvs("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean wjr() {
        return this.kj.pvs("perf_con_use_new_thread_pool", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean Oa() {
        return this.kj.pvs("perf_con_is_new_net_thread", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean pvs(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene == PangleEncryptConstant.CryptDataScene.GET_ADS || cryptDataScene == PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            return this.kj.pvs("perf_con_crypt_V4_get_ad", false);
        }
        if (cryptDataScene == PangleEncryptConstant.CryptDataScene.APP_LOG) {
            return this.kj.pvs("perf_con_crypt_V4_applog", false);
        }
        return this.kj.pvs("perf_con_crypt_V4", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public JSONObject FN() {
        return (JSONObject) this.kj.pvs("perf_con_thread_pool_config", new JSONObject(), this.CvL);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean Wby() {
        return this.kj.pvs("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean MY() {
        return this.kj.pvs("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public String pR() {
        return this.kj.pvs("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int EFw() {
        int pvs2 = this.kj.pvs("bus_con_auto_click_delay", PathInterpolatorCompat.MAX_NUM_POINTS);
        return pvs2 <= 0 ? PathInterpolatorCompat.MAX_NUM_POINTS : pvs2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public com.bytedance.sdk.openadsdk.icD.pvs.IP sR() {
        return (com.bytedance.sdk.openadsdk.icD.pvs.IP) this.kj.pvs("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.icD.pvs.IP.pvs, this.NB);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public int RKd() {
        return this.kj.pvs("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public Set<String> GcG() {
        return (Set) this.kj.pvs("perf_con_drop2rt_skip_label_list", Collections.emptySet(), NB.icD);
    }

    public static boolean BiC() {
        return Mxy;
    }

    public static void pvs(bNS.pvs pvsVar) {
        ConcurrentLinkedQueue<bNS.pvs> concurrentLinkedQueue = zM;
        if (concurrentLinkedQueue.contains(pvsVar)) {
            return;
        }
        concurrentLinkedQueue.add(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean Mnp() {
        return this.kj.pvs("bus_con_rewardedfull_link", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sUS
    public boolean RGX() {
        return this.kj.pvs("bus_con_video_keep_screen_on", 1) == 1;
    }
}
