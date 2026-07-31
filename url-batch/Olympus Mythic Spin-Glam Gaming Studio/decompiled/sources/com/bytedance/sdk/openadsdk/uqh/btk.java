package com.bytedance.sdk.openadsdk.uqh;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.component.utils.zg;
import com.bytedance.sdk.openadsdk.core.bjh;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.settings.bvs;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.bytedance.sdk.openadsdk.uqh.fs;
import com.bytedance.sdk.openadsdk.utils.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class btk {
    private static volatile fb fb;
    public static String fs;
    private static final AtomicBoolean zn = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, Object> zmn = new ConcurrentHashMap<>();

    public static fb zmn(final Context context, final String str) {
        if (fb == null) {
            synchronized (btk.class) {
                try {
                    if (fb == null) {
                        try {
                            fb fbVar = new fb(new hhw() { // from class: com.bytedance.sdk.openadsdk.uqh.btk.1
                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public ExecutorService zmn() {
                                    return nu.btk();
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public Context fs() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : kgc.zmn();
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public String zn() {
                                    if (phc.zmn(fs())) {
                                        return "pag_adn_strategy_center";
                                    }
                                    return "pag_adn_strategy_center_" + phc.zn(fs());
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public Handler fb() {
                                    return cn.fs();
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public String btk() {
                                    String zmn2 = oub.zmn("/api/ad/union/sdk/strategies/adn", false, true);
                                    btk.fs = zmn2;
                                    return zmn2;
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public JSONObject hhw() {
                                    try {
                                        JSONObject zmn2 = bvs.zmn(rp.zmn(kgc.zmn(), 0L));
                                        if (!zmn2.has("app_id")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                zmn2.put("app_id", str);
                                            } else {
                                                if (TextUtils.isEmpty(iv.fs().fb())) {
                                                    return null;
                                                }
                                                zmn2.put("app_id", iv.fs().fb());
                                            }
                                        }
                                        return uqh.zmn(PangleEncryptConstant.CryptDataScene.STRATEGY, zmn2);
                                    } catch (Throwable th) {
                                        iqz.zn("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public Map<String, String> nps() {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("User-Agent", oub.fb());
                                    String fs2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!fs2.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", fs2);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new bjh(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (encryptType4 != null) {
                                            hashMap.put("transfer-param", encryptType4.optString("message"));
                                            if (encryptType4.optInt("cypher") == 4) {
                                                hashMap.put("cypher", "4");
                                            } else {
                                                hashMap.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        hashMap.put("x-pangle-target-idc", rc.fs().eug());
                                    } catch (Throwable unused2) {
                                    }
                                    return hashMap;
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public JSONObject zmn(JSONObject jSONObject) {
                                    String zmn2 = uqh.zmn(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                                    if (TextUtils.isEmpty(zmn2)) {
                                        return jSONObject;
                                    }
                                    try {
                                        return PangleNetworkBridge.jsonObjectInit(zmn2);
                                    } catch (Throwable unused) {
                                        return jSONObject;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public HandlerThread zmn(String str2, int i) {
                                    return zg.zmn(str2, i);
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.hhw
                                public boolean zg() {
                                    return com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk();
                                }
                            });
                            fb = fbVar;
                            fbVar.zmn(new zmn() { // from class: com.bytedance.sdk.openadsdk.uqh.btk.2
                                @Override // com.bytedance.sdk.openadsdk.uqh.zmn
                                public void zmn() {
                                    com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.uqh.btk.2.1
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar.fs("strategy_fetch");
                                            return zmnVar;
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.zmn
                                public void fs() {
                                    com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.uqh.btk.2.2
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar.fs("strategy_fetch");
                                            return zmnVar;
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.hhw.zmn.zmn().fs();
                                    com.bytedance.sdk.openadsdk.doe.zmn.zn.zmn().fs();
                                    nqi.fs();
                                    HashMap hashMap = new HashMap();
                                    String zmn2 = btk.zmn(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(zmn2)) {
                                        hashMap.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, zmn2);
                                    }
                                    com.bytedance.sdk.openadsdk.core.klz.zn.zmn(hashMap);
                                }

                                @Override // com.bytedance.sdk.openadsdk.uqh.zmn
                                public void zmn(int i, String str2) {
                                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.uqh.btk.2.3
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar.fs("strategy_fetch");
                                            return zmnVar;
                                        }
                                    });
                                    nqi.zmn(btk.fs);
                                }
                            });
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return fb;
    }

    private static fb klz() {
        return zmn(kgc.zmn(), iv.fs().fb());
    }

    public static String zmn() {
        zn fs2;
        SharedPreferences zmn2;
        try {
            fb klz = klz();
            if (klz == null || (fs2 = klz.fs()) == null || (zmn2 = fs2.zmn()) == null) {
                return null;
            }
            return new JSONObject(zmn2.getAll()).toString();
        } catch (Exception e) {
            iqz.zmn("StrategyUtils", "getStrategyConfig error", e);
            return null;
        }
    }

    public static int zmn(String str, int i) {
        fb klz = klz();
        return klz != null ? klz.zmn(str, i) : i;
    }

    public static boolean zmn(String str, boolean z) {
        fb klz = klz();
        return klz != null ? klz.zmn(str, z) : z;
    }

    public static String zmn(String str, String str2) {
        fb klz = klz();
        return klz != null ? klz.zmn(str, str2) : str2;
    }

    public static <T> T zmn(String str, T t, fs.zmn<T> zmnVar) {
        fb klz = klz();
        return klz != null ? (T) klz.zmn(str, t, zmnVar) : t;
    }

    public static int zmn(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = zmn;
            Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String zmn2 = klz().zmn(str, "");
                if (TextUtils.isEmpty(zmn2)) {
                    return i;
                }
                int optInt = PangleNetworkBridge.jsonObjectInit(zmn2).optInt(str2, i);
                concurrentHashMap.put(str3, Integer.valueOf(optInt));
                return optInt;
            } catch (Throwable th) {
                iqz.zn("StrategyUtils", th.getMessage());
            }
        }
        return i;
    }

    public static String zmn(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = zmn;
            Object obj = concurrentHashMap.get(str4);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String zmn2 = klz().zmn(str, "");
                if (TextUtils.isEmpty(zmn2)) {
                    return str3;
                }
                String optString = PangleNetworkBridge.jsonObjectInit(zmn2).optString(str2, str3);
                concurrentHashMap.put(str4, optString);
                return optString;
            } catch (Throwable th) {
                iqz.zn("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static void fs() {
        fb klz;
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || (klz = klz()) == null || zn.getAndSet(true)) {
            return;
        }
        klz.zmn();
    }

    public static boolean zn() {
        return zmn("ad_load_and_render_opt", a.k, 0) == 1;
    }

    public static boolean fb() {
        return zn() && zmn("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static boolean btk() {
        return zn() && zmn("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static int hhw() {
        if (zn()) {
            return zmn("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static int nps() {
        if (zn()) {
            return zmn("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static boolean zg() {
        return zmn("jsb_opt_enable", 0) == 1;
    }

    public static boolean bvs() {
        return zmn("no_call_close", 0) == 1;
    }

    public static boolean iv() {
        return zmn("iv_rv_listen_new_arch", 0) == 1;
    }

    public static boolean rc() {
        return zmn("iv_rv_top_bar_listen_new", 0) == 1;
    }

    private static int zmn(String str) {
        JSONObject jSONObject = (JSONObject) zmn("rviv_close_button_backup", (Object) null, fs.zmn);
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return -1;
        }
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return -1;
        } catch (JSONException e) {
            e.getMessage();
            return -1;
        }
    }

    public static int zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        if (fsVar == null) {
            return -1;
        }
        if (fsVar.rje) {
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
            if (!(zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.btk)) {
                return -1;
            }
            if (((com.bytedance.sdk.openadsdk.activity.single.btk) zgVar).zmn) {
                return zmn("one_more_mutlti_endcard");
            }
            com.bytedance.sdk.openadsdk.component.reward.zmn.kgc kgcVar = fsVar.yj;
            if (kgcVar == null || !kgcVar.iqz()) {
                return -1;
            }
            return zmn("one_more_mutlti_double_endcard");
        }
        if (am.fs(fsVar.fs)) {
            if (am.zg(fsVar.fs)) {
                return zmn("playable_link_endcard");
            }
            if (am.hhw(fsVar.fs)) {
                return zmn("pure_playable");
            }
            return zmn("playable");
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.kgc kgcVar2 = fsVar.yj;
        if (kgcVar2 != null && kgcVar2.iqz()) {
            return zmn("double_endcard");
        }
        if (com.bytedance.sdk.openadsdk.core.model.iqz.fb(fsVar.fs) || com.bytedance.sdk.openadsdk.core.model.iqz.fs(fsVar.fs) || com.bytedance.sdk.openadsdk.core.model.iqz.zg(fsVar.fs)) {
            return zmn("direct_landingpage");
        }
        return zmn(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }
}
