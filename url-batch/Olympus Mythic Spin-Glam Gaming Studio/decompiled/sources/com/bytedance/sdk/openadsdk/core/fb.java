package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fb extends tf {
    private static volatile ArrayList<String> zmn;
    private int fs = 12288;

    private static void zmn(JSONObject jSONObject, PAGBiddingRequest pAGBiddingRequest, String str) throws Throwable {
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
            jSONObject.put("user_data", uqh.zmn(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
        }
        jSONObject.put("ts", System.currentTimeMillis() / 1000);
        String fs = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
        if (!fs.isEmpty()) {
            jSONObject.put("ipv6", fs);
        } else {
            String fs2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", "key_ipv4", "");
            if (!fs2.isEmpty()) {
                jSONObject.put("ipv4", fs2);
            }
        }
        jSONObject.put("adx_id", str);
        jSONObject.put("target_region", kgc.fb().eug());
        com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(jSONObject);
        String zmn2 = mw.zmn(kgc.zmn());
        if (!TextUtils.isEmpty(zmn2)) {
            try {
                jSONObject.put("did", Long.parseLong(zmn2));
            } catch (Throwable unused) {
            }
        }
        if (pAGBiddingRequest != null) {
            jSONObject.put("banner", tf.zmn(pAGBiddingRequest));
        }
        com.bytedance.sdk.openadsdk.core.settings.rc fb = kgc.fb();
        jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.rc.fs.zmn().hhw() ? 1 : 0);
        Context zmn3 = kgc.zmn();
        jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.zn.bvs());
        jSONObject.put("screen_scale", jy.hhw(zmn3));
        jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, com.bytedance.sdk.openadsdk.core.settings.fb.fs());
        jSONObject.put(CommonUrlParts.APP_SET_ID, com.bytedance.sdk.openadsdk.core.settings.fb.zn());
        jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.fb.fb());
        jSONObject.put("app_running_time", (System.currentTimeMillis() - cn.zmn()) / 1000);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.iv.mw.zn());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.iv.mw.fb());
        jSONObject.put("gp_v_name", DeviceUtils.btk(zmn3));
        jSONObject.put("gp_v_code", DeviceUtils.hhw(zmn3));
        jSONObject.put(VastAttributes.VENDOR, Build.MANUFACTURER);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.oub.fs());
        jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.oub.fb());
        jSONObject.put("sys_compiling_time", mw.fs(zmn3));
        jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, jy.btk(zmn3));
        jSONObject.put(CommonUrlParts.SCREEN_WIDTH, jy.zn(zmn3));
        jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.zak.zmn());
        jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.yj.zmn());
        jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
        jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.oub.zg(zmn3));
        if (fb.zak("boot")) {
            jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        }
        com.bytedance.sdk.openadsdk.utils.oub.zmn(jSONObject);
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.oub.kjb());
        jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.oub.uqh());
        jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.iv.fs());
        jSONObject.put("density", jy.zg(zmn3));
        DeviceUtils.zmn(jSONObject);
        com.bytedance.sdk.openadsdk.core.klz.zn.zmn(jSONObject);
        com.bytedance.sdk.openadsdk.utils.zg.zmn(jSONObject, zmn3);
        jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.phc.zmn(zmn3));
        com.bytedance.sdk.openadsdk.utils.zg.fs(jSONObject, zmn3);
        com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn(jSONObject);
    }

    private void zg(final String str) {
        try {
            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.fb.1
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("bidding_token");
                    zmnVar.btk("new");
                    zmnVar.nps(fb.this.rc(str).toString());
                    return zmnVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void bvs(final String str) {
        try {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.fb.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("bidding_token");
                    zmnVar.btk("new");
                    zmnVar.nps(fb.this.rc(str).toString());
                    return zmnVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void iv(final String str) {
        try {
            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.fb.3
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("bidding_token");
                    zmnVar.btk("new");
                    zmnVar.nps(fb.this.rc(str).toString());
                    return zmnVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("BiddingTokenGenerator", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject rc(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private void zmn(final int i, final int i2, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("bid_tok_len_over_lim", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.fb.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("len_bef_rm", i);
                jSONObject.put("len_af_rm", i2);
                jSONObject.put("len_lm", fb.this.fs);
                jSONObject.put("re_f_key", str2);
                jSONObject.put("adx_id", str);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("bid_tok_len_over_lim").fs(jSONObject.toString());
            }
        });
    }

    public boolean zmn() {
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.uqh.btk.zmn("bid_tok_con", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn);
        if (jSONObject == null) {
            return false;
        }
        this.fs = jSONObject.optInt("en_m_l", this.fs);
        return jSONObject.optInt(a.k, 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tf, com.bytedance.sdk.openadsdk.core.so
    public void zmn(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        int length;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.oub.klz("getBiddingToken");
            if (pAGBiddingRequest != null && pAGBiddingRequest.getAdxId() != null) {
                str = pAGBiddingRequest.getAdxId();
            }
            bvs(str);
            String gn = kgc.fb().gn();
            String str2 = null;
            if (!com.bytedance.sdk.openadsdk.core.rc.fs.zmn().hhw()) {
                pAGBidError = new PAGBidError(40060, bvs.zmn(40060));
            } else if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().fb()) {
                pAGBidError = new PAGBidError(10007, bvs.zmn(10007));
            } else if (!com.bytedance.sdk.openadsdk.core.rc.fs.zmn().bvs()) {
                pAGBidError = new PAGBidError(10008, bvs.zmn(10008));
            } else if (TextUtils.isEmpty(gn)) {
                pAGBidError = new PAGBidError(10011, bvs.zmn(10011));
                zmn(5, pAGBiddingRequest);
            } else if (!tf.hhw(gn) || kgc.fb().am(str)) {
                pAGBidError = null;
            } else {
                pAGBidError = new PAGBidError(10006, bvs.zmn(10006));
                zmn(2, pAGBiddingRequest);
            }
            if (pAGBidError != null) {
                pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                zg(str);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().rc() && iv.fs().rc()) {
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, bvs.zmn(10004)));
                zg(str);
                zmn(3, pAGBiddingRequest);
                return;
            }
            com.bytedance.sdk.openadsdk.core.klz.zn.zmn();
            zmn zmnVar = new zmn(zmn == null);
            zmn(zmnVar, pAGBiddingRequest, str);
            ArrayList<String> zmn2 = zmnVar.zmn();
            if (zmn2 != null) {
                zmn = zmn2;
            }
            JSONObject zmn3 = tf.zmn(zmnVar);
            int i = -1;
            int size = zmn != null ? zmn.size() - 1 : -1;
            while (true) {
                length = zmn3.toString().getBytes().length;
                if (length > this.fs) {
                    if (i < 0) {
                        i = length;
                    }
                    if (size < 0) {
                        break;
                    }
                    str2 = zmn.get(size);
                    zmnVar.remove(str2);
                    size--;
                    zmn3 = tf.zmn(zmnVar);
                } else {
                    break;
                }
            }
            if (zmn3.length() > 0) {
                zmn3.put("target_region", kgc.fb().eug());
            }
            pAGBidCallback.onBiddingTokenCollected(zmn3.toString());
            iv(str);
            if (i >= 0) {
                zmn(i, length, str, str2);
            }
        } catch (Throwable unused) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
            zmn(4, pAGBiddingRequest);
            zg("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zmn extends JSONObject {
        private ArrayList<String> zmn;

        public zmn(boolean z) {
            if (z) {
                this.zmn = new ArrayList<>();
            }
        }

        public ArrayList<String> zmn() {
            return this.zmn;
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, boolean z) throws JSONException {
            ArrayList<String> arrayList = this.zmn;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, z);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, double d) throws JSONException {
            ArrayList<String> arrayList = this.zmn;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, d);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, int i) throws JSONException {
            ArrayList<String> arrayList = this.zmn;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, i);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, long j) throws JSONException {
            ArrayList<String> arrayList = this.zmn;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, j);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, @Nullable Object obj) throws JSONException {
            ArrayList<String> arrayList = this.zmn;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, obj);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject putOpt(@Nullable String str, @Nullable Object obj) throws JSONException {
            ArrayList<String> arrayList = this.zmn;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.putOpt(str, obj);
        }
    }
}
