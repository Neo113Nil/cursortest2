package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TTAdManagerImpl.java */
@Deprecated
/* loaded from: classes2.dex */
public class dX implements ZhG {
    private static final Map<Integer, String> NB = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.dX.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_set_id_scope");
            put(6, "app_set_id");
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, "vendor");
            put(10, "model");
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, ImagesContract.URL);
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, "screen_height");
            put(22, "screen_width");
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, "os_version");
            put(26, "conn_type");
            put(27, "boot");
        }
    };
    boolean pvs = false;
    boolean icD = false;
    String vG = "com.union_test.internationad";
    String Jd = "8025677";
    private int sUS = 0;

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public String Jd() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    /* renamed from: Jd, reason: merged with bridge method [inline-methods] */
    public dX pvs(String str) {
        so.icD().pvs(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    /* renamed from: NB, reason: merged with bridge method [inline-methods] */
    public dX icD(String str) {
        so.icD().icD(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public ZhG pvs(int i) {
        so.icD().NB(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public ZhG pvs() {
        com.bytedance.sdk.component.utils.Ju.pvs("PangleSDK-6109");
        com.bykv.vk.openvk.component.video.api.sUS.vG.pvs("PangleSDK-6109");
        com.bytedance.sdk.component.utils.Ju.icD();
        com.bytedance.sdk.component.yiw.pvs.pvs();
        com.bykv.vk.openvk.component.video.api.sUS.vG.pvs();
        com.bytedance.sdk.openadsdk.utils.zM.pvs();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public ZhG icD(int i) {
        so.icD().icD(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public int icD() {
        return so.icD().yiw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public ZhG vG(int i) {
        so.icD().vG(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public int vG() {
        return so.icD().so();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public String NB() {
        return vG((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public String vG(String str) {
        int i;
        jlb.Wyp("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.NB.vG.pvs();
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = true;
            jSONObject.put("is_init", Ju.NB() ? 1 : 0);
            String Wyp = mnm.Jd().Wyp();
            String rCZ = mnm.Jd().rCZ();
            if (Wyp != null && rCZ != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", Wyp);
                jSONObject2.put("param", rCZ);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("package_name", jlb.NB());
            jSONObject.put("user_data", cR.pvs(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.sUS Jd = mnm.Jd();
                if (Jd.ae("gaid")) {
                    jSONObject.put("gaid", com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD());
                }
                Context pvs = mnm.pvs();
                jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.pvs.yiw());
                jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.Jd.icD());
                jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.Jd.vG());
                jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.Jd.Jd());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - Ju.pvs()) / 1000);
                jSONObject.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Mnp() ? 1 : 0);
                jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.icD());
                jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.vG());
                jSONObject.put("vendor", Build.MANUFACTURER);
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("user_agent_device", jlb.icD());
                jSONObject.put("user_agent_webview", jlb.vG());
                jSONObject.put("sys_compiling_time", qh.icD(pvs));
                jSONObject.put("screen_height", Pj.Jd(pvs));
                jSONObject.put("screen_width", Pj.vG(pvs));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.ny.pvs());
                jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.ZhG.pvs());
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("conn_type", jlb.kj(pvs));
                if (Jd.ae("boot")) {
                    jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                com.bytedance.sdk.openadsdk.core.NB.vG.pvs(jSONObject);
                i = NB.size();
            } else {
                i = 2;
            }
            while (i > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(NB.get(Integer.valueOf(i)));
                i--;
            }
            if (!com.bytedance.sdk.openadsdk.core.settings.mnm.BiC() || !com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN)) {
                z = false;
            }
            JSONObject pvs2 = pvs(jSONObject, z);
            while (i > 0 && pvs2.toString().getBytes().length > 4096) {
                jSONObject.remove(NB.get(Integer.valueOf(i)));
                pvs2 = pvs(jSONObject, z);
                i--;
            }
            if (com.bytedance.sdk.component.utils.Ju.Jd()) {
                new StringBuilder("bidding token: ").append(pvs2).append("\nbidding token length: ");
                int length = pvs2.toString().getBytes().length;
            }
            new StringBuilder("bidding token: ").append(pvs2);
            return pvs2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private JSONObject pvs(JSONObject jSONObject, boolean z) {
        JSONObject pvs;
        if (z) {
            pvs = PangleEncryptManager.encryptType4(jSONObject, new zM(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            uc.pvs(pvs);
        } else {
            pvs = com.bytedance.sdk.component.utils.pvs.pvs(jSONObject);
        }
        return pvs != null ? pvs : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public boolean pvs(String str, int i, String str2, String str3, String str4) {
        if (!this.vG.equals(mnm.pvs().getPackageName()) || !this.Jd.equals(so.icD().Jd()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method pvs = com.bytedance.sdk.component.utils.ZhG.pvs("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (pvs != null) {
                pvs.invoke(null, str, Integer.valueOf(i), str2, str3, str4);
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public ZhG Jd(int i) {
        so.icD().sUS(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public int sUS() {
        return so.icD().uc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public ZhG NB(int i) {
        this.sUS = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public int yiw() {
        return this.sUS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZhG
    public ZhG sUS(int i) {
        so.icD().pvs(i);
        return this;
    }
}
