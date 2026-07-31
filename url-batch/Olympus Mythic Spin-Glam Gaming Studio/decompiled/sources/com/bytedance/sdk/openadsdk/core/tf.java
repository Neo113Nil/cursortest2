package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class tf implements so {
    private static final Map<Integer, String> fs = new HashMap<Integer, String>(59) { // from class: com.bytedance.sdk.openadsdk.core.tf.1
        {
            put(1, "is_init");
            put(2, "abtest");
            put(3, POBConstants.KEY_LANGUAGE);
            put(4, "ad_sdk_version");
            put(5, "package_name");
            put(6, "user_data");
            put(7, "ts");
            put(8, "ipv4");
            put(9, "ipv6");
            put(10, "adx_id");
            put(11, "target_region");
            put(12, O6.X0);
            put(13, "did");
            put(14, "banner");
            put(15, "app_reg");
            put(16, "apk-sign");
            put(17, "screen_scale");
            put(18, CommonUrlParts.APP_SET_ID_SCOPE);
            put(19, CommonUrlParts.APP_SET_ID);
            put(20, "installed_source");
            put(21, "app_running_time");
            put(22, "js_render_ver");
            put(23, "js_render_v3_ver");
            put(24, "gp_v_name");
            put(25, "gp_v_code");
            put(26, VastAttributes.VENDOR);
            put(27, "model");
            put(28, "user_agent_device");
            put(29, "user_agent_webview");
            put(30, "sys_compiling_time");
            put(31, CommonUrlParts.SCREEN_HEIGHT);
            put(32, CommonUrlParts.SCREEN_WIDTH);
            put(33, "rom_version");
            put(34, "carrier_name");
            put(35, CommonUrlParts.OS_VERSION);
            put(36, "conn_type");
            put(37, "boot");
            put(38, "oem_store");
            put(39, "board");
            put(40, "timezone");
            put(41, "device_city");
            put(42, "cpu_num");
            put(43, "density");
            put(44, "bt_time");
            put(45, "bt_id");
            put(46, "sec_did");
            put(47, "X-Armors");
            put(48, "url");
            put(49, "pangle_m");
            put(50, "ec");
            put(51, "pglx");
            put(52, O6.u);
            put(53, "bp");
            put(54, "t_ver");
            put(55, "is_fold");
            put(56, CampaignEx.JSON_KEY_AAB);
            put(57, "abi");
            put(58, "is_multi");
            put(59, "w_ver");
            put(60, "feature_data");
        }
    };
    private final AtomicReference<JSONObject> zmn = new AtomicReference<>();
    private int zn = 0;

    @Override // com.bytedance.sdk.openadsdk.core.so
    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public tf zmn(String str) {
        iv.fs().zmn(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    /* renamed from: btk, reason: merged with bridge method [inline-methods] */
    public tf fs(String str) {
        iv.fs().zn(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public so zmn(int i) {
        iv.fs().btk(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public so fs() {
        com.bytedance.sdk.component.utils.cn.zmn("PangleSDK-8104");
        com.bykv.vk.openvk.zmn.zmn.zmn.nps.zn.zmn("PangleSDK-8104");
        com.bytedance.sdk.component.utils.iqz.zmn("PangleSDK-8104");
        com.bytedance.sdk.component.utils.cn.zmn();
        com.bytedance.sdk.component.nps.zmn.zmn();
        com.bykv.vk.openvk.zmn.zmn.zmn.nps.zn.zmn();
        com.bytedance.sdk.component.utils.iqz.zmn();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public so fb(int i) {
        iv.fs().fb(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public int btk() {
        return iv.fs().iv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public String zn() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public void zmn(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.oub.klz("getBiddingToken");
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            try {
                zg(adxId);
                String gn = kgc.fb().gn();
                int i = 2;
                AdSlot adSlot = null;
                if (!com.bytedance.sdk.openadsdk.core.rc.fs.zmn().hhw()) {
                    pAGBidError = new PAGBidError(40060, bvs.zmn(40060));
                } else if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().fb()) {
                    pAGBidError = new PAGBidError(10007, bvs.zmn(10007));
                } else if (!com.bytedance.sdk.openadsdk.core.rc.fs.zmn().bvs()) {
                    pAGBidError = new PAGBidError(10008, bvs.zmn(10008));
                } else if (TextUtils.isEmpty(gn)) {
                    pAGBidError = new PAGBidError(10011, bvs.zmn(10011));
                    zmn(5, pAGBiddingRequest);
                } else if (!hhw(gn) || kgc.fb().am(adxId)) {
                    pAGBidError = null;
                } else {
                    pAGBidError = new PAGBidError(10006, bvs.zmn(10006));
                    zmn(2, pAGBiddingRequest);
                }
                if (pAGBidError != null) {
                    pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                    iv(adxId);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().rc() && iv.fs().rc()) {
                    pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, bvs.zmn(10004)));
                    iv(adxId);
                    zmn(3, pAGBiddingRequest);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.klz.zn.zmn();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_init", cn.btk() ? 1 : 0);
                String bvs = kgc.fb().bvs();
                String zak = kgc.fb().zak();
                if (bvs != null && zak != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("version", bvs);
                    jSONObject2.put("param", zak);
                    jSONObject.put("abtest", jSONObject2);
                }
                jSONObject.put(POBConstants.KEY_LANGUAGE, mw.fs());
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.oub.hhw());
                if (pAGBiddingRequest != null) {
                    if (!TextUtils.isEmpty(pAGBiddingRequest.getSlotId())) {
                        adSlot = new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build();
                    }
                    jSONObject.put("user_data", uqh.zmn(adSlot));
                }
                jSONObject.put("ts", System.currentTimeMillis() / 1000);
                String fs2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                if (!fs2.isEmpty()) {
                    jSONObject.put("ipv6", fs2);
                } else {
                    String fs3 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", "key_ipv4", "");
                    if (!fs3.isEmpty()) {
                        jSONObject.put("ipv4", fs3);
                    }
                }
                jSONObject.put("adx_id", adxId);
                Object eug = kgc.fb().eug();
                jSONObject.put("target_region", eug);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    com.bytedance.sdk.openadsdk.core.settings.rc fb = kgc.fb();
                    com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(jSONObject);
                    String zmn = mw.zmn(kgc.zmn());
                    if (!TextUtils.isEmpty(zmn)) {
                        try {
                            jSONObject.put("did", Long.parseLong(zmn));
                        } catch (Throwable unused) {
                        }
                    }
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", zmn(pAGBiddingRequest));
                    }
                    jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.rc.fs.zmn().hhw() ? 1 : 0);
                    Context zmn2 = kgc.zmn();
                    jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.zn.bvs());
                    jSONObject.put("screen_scale", jy.hhw(zmn2));
                    jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, com.bytedance.sdk.openadsdk.core.settings.fb.fs());
                    jSONObject.put(CommonUrlParts.APP_SET_ID, com.bytedance.sdk.openadsdk.core.settings.fb.zn());
                    jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.fb.fb());
                    jSONObject.put("app_running_time", (System.currentTimeMillis() - cn.zmn()) / 1000);
                    jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.iv.mw.zn());
                    jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.iv.mw.fb());
                    jSONObject.put("gp_v_name", DeviceUtils.btk(zmn2));
                    jSONObject.put("gp_v_code", DeviceUtils.hhw(zmn2));
                    jSONObject.put(VastAttributes.VENDOR, Build.MANUFACTURER);
                    jSONObject.put("model", Build.MODEL);
                    jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.oub.fs());
                    jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.oub.fb());
                    jSONObject.put("sys_compiling_time", mw.fs(zmn2));
                    jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, jy.btk(zmn2));
                    jSONObject.put(CommonUrlParts.SCREEN_WIDTH, jy.zn(zmn2));
                    jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.zak.zmn());
                    jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.yj.zmn());
                    jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
                    jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.oub.zg(zmn2));
                    if (fb.zak("boot")) {
                        jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                    }
                    com.bytedance.sdk.openadsdk.utils.oub.zmn(jSONObject);
                    jSONObject.put("board", Build.BOARD);
                    jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.oub.kjb());
                    jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.oub.uqh());
                    jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.iv.fs());
                    jSONObject.put("density", jy.zg(zmn2));
                    DeviceUtils.zmn(jSONObject);
                    com.bytedance.sdk.openadsdk.core.klz.zn.zmn(jSONObject);
                    com.bytedance.sdk.openadsdk.utils.zg.zmn(jSONObject, zmn2);
                    jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.phc.zmn(zmn2));
                    com.bytedance.sdk.openadsdk.utils.zg.fs(jSONObject, zmn2);
                    i = fs.size();
                }
                while (i > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(fs.get(Integer.valueOf(i)));
                    i--;
                }
                com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn(jSONObject);
                JSONObject zmn3 = zmn(jSONObject);
                while (i > 0 && zmn3.toString().getBytes().length > 12288) {
                    jSONObject.remove(fs.get(Integer.valueOf(i)));
                    zmn3 = zmn(jSONObject);
                    i--;
                }
                if (zmn3.length() > 0) {
                    zmn3.put("target_region", eug);
                }
                if (com.bytedance.sdk.component.utils.cn.zn()) {
                    zmn3.toString();
                    int length = zmn3.toString().getBytes().length;
                }
                zmn3.toString();
                pAGBidCallback.onBiddingTokenCollected(zmn3.toString());
                bvs(adxId);
            } catch (Throwable unused2) {
                str = adxId;
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
                zmn(4, pAGBiddingRequest);
                iv(str);
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean hhw(String str) {
        return "TX".equals(str);
    }

    protected void zmn(int i, PAGBiddingRequest pAGBiddingRequest) {
        try {
            String doe = iv.fs().doe();
            String str = "";
            String adxId = pAGBiddingRequest != null ? pAGBiddingRequest.getAdxId() : "";
            boolean tev = kgc.fb().tev();
            Set<String> rsi = kgc.fb().rsi();
            JSONArray jSONArray = new JSONArray();
            if (rsi != null) {
                Iterator<String> it = rsi.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            String gn = com.bytedance.sdk.openadsdk.core.settings.rc.fs().gn();
            int btk = btk();
            int fb = cn.fb();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_adx_id", doe);
            jSONObject.put("bidding_adx_id", adxId);
            jSONObject.put("token_enable", tev ? 1 : 0);
            if (!TextUtils.isEmpty(gn)) {
                str = gn;
            }
            jSONObject.put("setting_dc", str);
            jSONObject.put("setting_token_adx_ids", jSONArray);
            jSONObject.put("init_pa_consent", btk);
            jSONObject.put("init_state", fb);
            jSONObject.put("reason", i);
            if (cn.btk()) {
                com.bytedance.sdk.openadsdk.cyb.fb.zmn("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.tf.2
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs
                    public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                        return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("biddingtoken_error").fs(jSONObject.toString());
                    }
                });
                final JSONObject andSet = this.zmn.getAndSet(null);
                if (andSet != null) {
                    com.bytedance.sdk.openadsdk.cyb.fb.zmn("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.tf.3
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs
                        public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                            return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("biddingtoken_error").fs(andSet.toString());
                        }
                    });
                    return;
                }
                return;
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.zmn, null, jSONObject);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static JSONObject zmn(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static JSONObject zmn(JSONObject jSONObject) {
        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new bjh(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
        rp.zmn(encryptType4);
        return encryptType4 != null ? encryptType4 : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public so fs(int i) {
        this.zn = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public int fb() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public so zn(int i) {
        iv.fs().zn(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.so
    public so zn(String str) {
        iv.fs().zg(str);
        return this;
    }

    private static void zg(final String str) {
        try {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.tf.4
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("bidding_token");
                    zmnVar.nps(tf.rc(str).toString());
                    return zmnVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void bvs(final String str) {
        try {
            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.tf.5
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("bidding_token");
                    zmnVar.nps(tf.rc(str).toString());
                    return zmnVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void iv(final String str) {
        try {
            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.tf.6
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("bidding_token");
                    zmnVar.nps(tf.rc(str).toString());
                    return zmnVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject rc(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
