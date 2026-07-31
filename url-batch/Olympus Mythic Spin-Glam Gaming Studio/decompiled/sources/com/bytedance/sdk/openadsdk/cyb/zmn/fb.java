package com.bytedance.sdk.openadsdk.cyb.zmn;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.cyb.zmn.fb;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class fb<T extends fb> implements zn {
    private String bvs;
    private String fs;
    private String iv;
    private String klz;
    private String mw;
    private String nps;
    private String rc;
    private String zmn;
    private String zn;
    private final String fb = BuildConfig.VERSION_NAME;
    private long btk = System.currentTimeMillis() / 1000;
    private int hhw = 0;
    private int zg = 0;

    private T cyb() {
        return this;
    }

    private fb() {
        try {
            this.mw = kjb.zmn();
        } catch (Throwable unused) {
            this.mw = "default";
        }
    }

    public static fb<fb> fs() {
        return new fb<>();
    }

    @Override // com.bytedance.sdk.openadsdk.cyb.zmn.zn
    public JSONObject zmn() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", nps());
            jSONObject2.put("app_version", oub.zg());
            jSONObject2.put("timestamp", zg());
            jSONObject2.put("conn_type", kgc.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn()));
            jSONObject2.put("appid", TextUtils.isEmpty(iv.fs().fb()) ? "" : iv.fs().fb());
            jSONObject2.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, cn());
            if (!TextUtils.isEmpty(zn())) {
                jSONObject2.put("type", zn());
            }
            jSONObject2.put("error_code", rc());
            if (!TextUtils.isEmpty(klz())) {
                jSONObject2.put("error_msg", klz());
            }
            if (!TextUtils.isEmpty(btk())) {
                jSONObject2.put("rit", btk());
            }
            if (!TextUtils.isEmpty(hhw())) {
                jSONObject2.put("creative_id", hhw());
            }
            if (bvs() > 0) {
                jSONObject2.put("adtype", bvs());
            }
            if (!TextUtils.isEmpty(iv())) {
                jSONObject2.put("req_id", iv());
            }
            if (!TextUtils.isEmpty(mw())) {
                jSONObject2.put("extra", mw());
            }
            String fb = fb();
            if (TextUtils.isEmpty(fb)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = PangleNetworkBridge.jsonObjectInit(fb);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.mw + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(fb)) {
                jSONObject2.put("event_extra", fb);
            }
            if (!TextUtils.isEmpty(rt())) {
                jSONObject2.put(IronSourceConstants.EVENTS_DURATION, rt());
            }
        } catch (Throwable th) {
            iqz.zn("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    private JSONObject cn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put(VastAttributes.VENDOR, Build.MANUFACTURER);
            jSONObject.put("package_name", oub.hhw());
            jSONObject.put("ua", oub.fb());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String zn() {
        return this.zmn;
    }

    public T zmn(String str) {
        this.zmn = str;
        return cyb();
    }

    public String fb() {
        return this.rc;
    }

    public T fs(String str) {
        this.rc = str;
        return cyb();
    }

    public String btk() {
        return this.fs;
    }

    public T zn(String str) {
        this.fs = str;
        return cyb();
    }

    public String hhw() {
        return this.zn;
    }

    public T fb(String str) {
        this.zn = str;
        return cyb();
    }

    public String nps() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public long zg() {
        return this.btk;
    }

    public int bvs() {
        return this.hhw;
    }

    public T zmn(int i) {
        this.hhw = i;
        return cyb();
    }

    public String iv() {
        return this.nps;
    }

    public T btk(String str) {
        this.nps = str;
        return cyb();
    }

    public int rc() {
        return this.zg;
    }

    public T fs(int i) {
        this.zg = i;
        return cyb();
    }

    public String klz() {
        return this.bvs;
    }

    public T hhw(String str) {
        this.bvs = str;
        return cyb();
    }

    public String mw() {
        return this.iv;
    }

    public T nps(String str) {
        this.iv = str;
        return cyb();
    }

    public String rt() {
        return this.klz;
    }

    public T zg(String str) {
        this.klz = str;
        return cyb();
    }
}
