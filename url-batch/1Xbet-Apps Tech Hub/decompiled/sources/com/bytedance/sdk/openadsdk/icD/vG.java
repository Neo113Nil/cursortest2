package com.bytedance.sdk.openadsdk.icD;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.rCZ;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.bytedance.sdk.openadsdk.icD.pvs;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.gA;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.zM;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pgl.ssdk.ces.out.DungeonFlag;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* compiled from: AdEventManager.java */
/* loaded from: classes2.dex */
public class vG {
    public static void pvs() {
        try {
            Class.forName(vG.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void pvs(cR cRVar, String str, final int i) {
        pvs(System.currentTimeMillis(), cRVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("preload_status", Integer.valueOf(i));
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(final cR cRVar, String str) {
        pvs(System.currentTimeMillis(), cRVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.11
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (cR.vG(cR.this)) {
                        if (cR.this.TN() != null) {
                            jSONObject2.putOpt(ImagesContract.URL, cR.this.TN().vG());
                            jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, cR.this.TN().pvs());
                            jSONObject2.putOpt("md5", cR.this.TN().icD());
                        }
                        if (cR.this.od() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt(ImagesContract.URL, cR.this.od().kj());
                        jSONObject2.putOpt("style_id", cR.this.LGJ());
                        if (cR.this.od() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.icD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(final cR cRVar, String str, final long j) {
        pvs(System.currentTimeMillis(), cRVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.22
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (cR.vG(cR.this)) {
                        if (cR.this.TN() != null) {
                            jSONObject2.putOpt(ImagesContract.URL, cR.this.TN().vG());
                            jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, cR.this.TN().pvs());
                            jSONObject2.putOpt("md5", cR.this.TN().icD());
                        }
                        if (cR.this.od() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt(ImagesContract.URL, cR.this.od().kj());
                        jSONObject2.putOpt("style_id", cR.this.LGJ());
                        if (cR.this.od() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.icD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(final cR cRVar, String str, final long j, final int i, final String str2, final String str3) {
        pvs(System.currentTimeMillis(), cRVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.33
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (cR.vG(cR.this)) {
                        if (cR.this.TN() != null) {
                            jSONObject2.putOpt(ImagesContract.URL, cR.this.TN().vG());
                            jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, cR.this.TN().pvs());
                            jSONObject2.putOpt("md5", cR.this.TN().icD());
                        }
                        if (cR.this.od() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt(ImagesContract.URL, cR.this.od().kj());
                        jSONObject2.putOpt("style_id", cR.this.LGJ());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject2.putOpt("error_url", str3);
                        }
                        if (cR.this.od() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject2.put("error_code", i);
                    jSONObject2.put("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.icD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(final cR cRVar, String str, final long j, final int i, final int i2) {
        pvs(System.currentTimeMillis(), cRVar, str, "load", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.41
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("interaction_method", Integer.valueOf(cR.this.vA()));
                    jSONObject2.put("first_page", i2);
                    jSONObject2.put("preload_h5_type", cR.this.CL());
                    int i3 = i;
                    if (i3 >= 0) {
                        jSONObject2.putOpt("preload_status", Integer.valueOf(i3));
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(String str, cR cRVar, String str2, final Map<String, Object> map) {
        pvs(System.currentTimeMillis(), cRVar, str2, str, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.42
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (map != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(long j, cR cRVar, String str, String str2, final JSONObject jSONObject, yiw yiwVar, com.bytedance.sdk.openadsdk.icD.icD.pvs pvsVar) {
        pvs(j, cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.43
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void pvs(cR cRVar, String str, JSONObject jSONObject) {
        Jd(cRVar, "show", str, jSONObject);
    }

    @DungeonFlag
    private static void Jd(final cR cRVar, final String str, final String str2, final JSONObject jSONObject) {
        if (cRVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (cRVar.Mvw() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            cRVar.so(true);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        pvs(new com.bytedance.sdk.component.so.so("onShow") { // from class: com.bytedance.sdk.openadsdk.icD.vG.44
            @Override // java.lang.Runnable
            public void run() {
                vG.pvs(currentTimeMillis, cRVar, str2, str, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.44.1
                    @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                    public JSONObject pvs() {
                        Object obj;
                        try {
                            rCZ.icD(cRVar);
                            String pvs2 = com.bytedance.sdk.openadsdk.core.mnm.Jd().elv() ? com.bytedance.sdk.openadsdk.core.NB.pvs.pvs.pvs((Application) com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs(str2, DeviceUtils.pvs(), cRVar.yTz()) : "none";
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                if (jSONObject != null) {
                                    jSONObject.put("interaction_method", cRVar.vA());
                                    jSONObject.put("real_interaction_method", cRVar.mnm());
                                    jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.mnm.Jd().Ju(String.valueOf(cRVar.yTz())));
                                    jSONObject.put("au_show", pvs2);
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                } else {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("interaction_method", cRVar.vA());
                                    jSONObject3.put("real_interaction_method", cRVar.mnm());
                                    jSONObject3.put("video_skip_result", com.bytedance.sdk.openadsdk.core.mnm.Jd().Ju(String.valueOf(cRVar.yTz())));
                                    jSONObject3.put("au_show", pvs2);
                                    jSONObject2.put("ad_extra_data", jSONObject3.toString());
                                }
                                jSONObject2.putOpt("log_extra", cRVar.HWd());
                                float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - cRVar.sDK()).floatValue();
                                if (floatValue <= 0.0f) {
                                    floatValue = 0.0f;
                                }
                                jSONObject2.putOpt("show_time", Float.valueOf(floatValue));
                                jSONObject2.putOpt("ua_policy", Integer.valueOf(cRVar.sP()));
                                String CvL = cRVar.CvL();
                                if (!TextUtils.isEmpty(CvL) && !TextUtils.isEmpty(CvL)) {
                                    try {
                                        jSONObject2.put("ttdsp_price", Math.round(Float.parseFloat(CvL) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject2.put("ttdsp_price", 0);
                                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (cRVar.Wby() == null) {
                                    return jSONObject2;
                                }
                                try {
                                    Object obj2 = cRVar.Wby().get("sdk_bidding_type");
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = cRVar.Wby().get(FirebaseAnalytics.Param.PRICE)) == null) {
                                        return jSONObject2;
                                    }
                                    jSONObject2.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject2;
                                } catch (Throwable th2) {
                                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", "client bidding price error: ", th2);
                                    return jSONObject2;
                                }
                            } catch (Exception unused) {
                                return jSONObject2;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!cRVar.Oa()) {
                        if (cRVar.OBt()) {
                            com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(cRVar.OyE(), new vG.icD("show_urls", cRVar));
                        } else {
                            vG.pvs(cRVar);
                        }
                    }
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        int optInt = jSONObject2.optInt("dynamic_show_type");
                        if (cRVar.BHj() == 1 && optInt == 7) {
                            com.bytedance.sdk.component.utils.so.pvs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vG.44.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject3.put("auto_click", true);
                                        vG.icD(cRVar, str2, "click", jSONObject3);
                                    } catch (Exception unused) {
                                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().EFw());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.NB.vG.vG();
                }
            }
        });
    }

    public static void pvs(cR cRVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.qh.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(com.bytedance.sdk.openadsdk.mnm.pvs.pvs(cRVar.OyE(), true), 1, cRVar.neB());
    }

    @DungeonFlag
    public static void pvs(final String str, final cR cRVar, final String str2, final yiw yiwVar) {
        if (cRVar == null || yiwVar == null || !yiwVar.pvs()) {
            return;
        }
        pvs(System.currentTimeMillis(), cRVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.45
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, str);
                    yiw yiwVar2 = yiwVar;
                    if (yiwVar2 != null && yiwVar2.icD() != null) {
                        JSONObject icD = yiwVar.icD();
                        if (str2.equals("open_ad")) {
                            icD.put("is_icon_only", cRVar.OUT() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", icD.toString());
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(final cR cRVar, final String str, final gA gAVar) {
        if (cRVar == null) {
            return;
        }
        final long vG = gAVar.vG();
        pvs(System.currentTimeMillis(), cRVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.2
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", vG);
                    jSONObject.put("click_time", gAVar.pvs);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", cRVar.OUT() ? 1 : 0);
                    }
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void icD(cR cRVar, String str, final long j) {
        if (cRVar != null && j > 0 && j < 200000) {
            pvs(System.currentTimeMillis(), cRVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.3
                @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                public JSONObject pvs() {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j);
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (Throwable unused) {
                    }
                    return jSONObject2;
                }
            });
        }
    }

    public static void pvs(cR cRVar, final String str, final int i, final String str2, final long j, final boolean z, final int i2, final long j2) {
        pvs(System.currentTimeMillis(), cRVar, str, "arbitrage_loading", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.4
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z);
                    jSONObject.put("arbi_convert_count", i2);
                    jSONObject.put("loading_start_timestamp", j2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                Object[] objArr = new Object[3];
                return jSONObject2;
            }
        });
    }

    public static void pvs(cR cRVar, String str, final long j, final boolean z) {
        pvs(System.currentTimeMillis(), cRVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.5
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put(TypedValues.TransitionType.S_DURATION, j);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void icD(cR cRVar, String str, final int i) {
        pvs(System.currentTimeMillis(), cRVar, str, "check_meta", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.6
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().ABo());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void vG(cR cRVar, String str, final int i) {
        pvs(System.currentTimeMillis(), cRVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.7
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().ABo());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void pvs(cR cRVar, final String str, final int i, final String str2) {
        pvs(System.currentTimeMillis(), cRVar, str, "arbitrage_load_start", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.8
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                Object[] objArr = new Object[3];
                return jSONObject2;
            }
        });
    }

    public static void pvs(cR cRVar, final String str, final int i, final String str2, final float f) {
        pvs(System.currentTimeMillis(), cRVar, str, "arbitrage_load_finish", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.9
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                Object[] objArr = new Object[3];
                return jSONObject2;
            }
        });
    }

    public static void pvs(cR cRVar, final String str, final int i, final String str2, final String str3, final int i2) {
        pvs(System.currentTimeMillis(), cRVar, str, "arbitrage_load_url", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.10
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("load_url", str3);
                    jSONObject.put("url_flag", i2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                Object[] objArr = new Object[3];
                return jSONObject2;
            }
        });
    }

    public static void icD(final cR cRVar, String str) {
        pvs(System.currentTimeMillis(), cRVar, str, "picture_click", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.12
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", cR.this.jlb().getNativeAdType());
                    jSONObject.put("interaction_method", cR.this.vA());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    @DungeonFlag
    public static void pvs(final String str, final cR cRVar, final com.bytedance.sdk.openadsdk.core.model.Wyp wyp, final String str2, final boolean z, final Map<String, Object> map, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        pvs(new com.bytedance.sdk.component.so.so("onClick") { // from class: com.bytedance.sdk.openadsdk.icD.vG.13
            @Override // java.lang.Runnable
            public void run() {
                cR cRVar2 = cRVar;
                if (cRVar2 == null) {
                    return;
                }
                vG.pvs(currentTimeMillis, cRVar2, str2, str, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.13.1
                    @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                    public JSONObject pvs() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            if (wyp != null) {
                                JSONObject pvs2 = wyp.pvs();
                                pvs2.put("is_valid", z);
                                if (i > 0 && i <= 2) {
                                    pvs2.put("user_behavior_type", i);
                                }
                                if (map != null) {
                                    if (map.containsKey(TypedValues.TransitionType.S_DURATION)) {
                                        jSONObject.put(TypedValues.TransitionType.S_DURATION, map.get(TypedValues.TransitionType.S_DURATION));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!TypedValues.TransitionType.S_DURATION.equals(entry.getKey())) {
                                            pvs2.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                pvs2.put("interaction_method", cRVar.vA());
                                if (str2.equals("open_ad")) {
                                    pvs2.put("is_icon_only", cRVar.OUT() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", pvs2.toString());
                            }
                            jSONObject.putOpt("log_extra", cRVar.HWd());
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - cRVar.sDK()).floatValue();
                            if (floatValue <= 0.0f) {
                                floatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(floatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(cRVar.sP()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.qh.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(com.bytedance.sdk.openadsdk.mnm.pvs.pvs(cRVar.joF(), true), 2, cRVar.neB());
                }
                if ("click".equals(str)) {
                    rCZ.vG(cRVar);
                }
            }
        });
    }

    public static void pvs(cR cRVar, String str, String str2, final JSONObject jSONObject) {
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.14
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    if (jSONObject.has(TypedValues.TransitionType.S_DURATION)) {
                        jSONObject2.put(TypedValues.TransitionType.S_DURATION, jSONObject.get(TypedValues.TransitionType.S_DURATION));
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
        if ("click".equals(str2)) {
            rCZ.vG(cRVar);
        }
    }

    public static void pvs(cR cRVar, String str, final int i, final long j) {
        pvs(System.currentTimeMillis(), cRVar, str, "video_choose", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.15
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("video_choose", i);
                    jSONObject2.put("video_choose_duration", j);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.toString());
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(cR cRVar, String str, final String str2, final long j, final int i, JSONObject jSONObject, final yiw yiwVar) {
        final JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.16
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                yiw yiwVar2;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(TypedValues.TransitionType.S_DURATION, j);
                    jSONObject3.put("percent", i);
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (yiwVar2 = yiwVar) != null) {
                        yiwVar2.pvs(jSONObject2);
                    }
                    jSONObject3.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void icD(cR cRVar, String str, String str2, final JSONObject jSONObject) {
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.17
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void pvs(cR cRVar, String str, String str2, final JSONObject jSONObject, final long j) {
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.18
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                    jSONObject2.put(TypedValues.TransitionType.S_DURATION, j);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void pvs(final cR cRVar, String str, String str2, final Map<String, Object> map) {
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.19
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject2.put("dp_creative_type", cRVar.xyK());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void pvs(long j, cR cRVar, String str, String str2) {
        pvs(j, cRVar, str, str2, (com.bytedance.sdk.openadsdk.Wyp.vG.pvs) null);
    }

    @DungeonFlag
    public static void pvs(final long j, final cR cRVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.Wyp.vG.pvs pvsVar) {
        if (cRVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || pvs(cRVar.jMV(), str2)) {
            return;
        }
        pvs(new com.bytedance.sdk.component.so.so(str2) { // from class: com.bytedance.sdk.openadsdk.icD.vG.20
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs pvsVar2 = pvsVar;
                    if (pvsVar2 != null) {
                        jSONObject = pvsVar2.pvs();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.putOpt("log_extra", cRVar.HWd());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(cRVar.sP()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new pvs.C0091pvs(j, cRVar).icD(str).vG(str2).NB(cRVar.neB()).pvs(cRVar.cGU()).pvs(jSONObject).yiw(cRVar.Yjw()).pvs((com.bytedance.sdk.openadsdk.icD.icD.pvs) null);
            }
        });
    }

    public static void icD(final long j, final cR cRVar, String str, final String str2) {
        pvs(System.currentTimeMillis(), cRVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.21
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                    if (cR.vG(cRVar)) {
                        if (cRVar.TN() != null) {
                            jSONObject2.putOpt(ImagesContract.URL, cRVar.TN().vG());
                            jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, cRVar.TN().pvs());
                            jSONObject2.putOpt("md5", cRVar.TN().icD());
                        }
                        jSONObject2.putOpt(TypedValues.TransitionType.S_FROM, str2);
                        if (cRVar.od() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.put(ImagesContract.URL, cRVar.od().kj());
                        jSONObject2.put("style_id", cRVar.LGJ());
                        if (cRVar.od() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.icD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void vG(final cR cRVar, String str) {
        if (cRVar == null || !cR.vG(cRVar) || cRVar.TN() == null) {
            return;
        }
        pvs(System.currentTimeMillis(), cRVar, str, "endcard_show", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.23
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt(ImagesContract.URL, cR.this.TN().vG());
                    jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, cR.this.TN().pvs());
                    jSONObject2.putOpt("md5", cR.this.TN().icD());
                    if (cR.this.od() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(cR.this.od().Jd()));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(cR cRVar, final com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvsVar, final String str) {
        pvs(System.currentTimeMillis(), cRVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.24
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.vG());
                    jSONObject2.put("keyword", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.vA());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    zM.icD("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                Object[] objArr = new Object[3];
                return jSONObject;
            }
        });
    }

    public static void icD(cR cRVar, final com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvsVar, final String str) {
        pvs(System.currentTimeMillis(), cRVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.25
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.vG());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.Jd());
                    jSONObject2.put("arbi_load_duration", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.cR());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    zM.icD("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                Object[] objArr = new Object[3];
                return jSONObject;
            }
        });
    }

    public static void vG(cR cRVar, final com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvsVar, final String str) {
        pvs(System.currentTimeMillis(), cRVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.26
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.vG());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.Jd());
                    jSONObject2.put("arbi_stay_duration", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.IP());
                    jSONObject2.put("browsing_percentage", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.bNS());
                    jSONObject2.put("out_focus_scene", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.mnm());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    zM.icD("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                Object[] objArr = new Object[3];
                return jSONObject;
            }
        });
    }

    public static void Jd(cR cRVar, final com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvsVar, final String str) {
        pvs(System.currentTimeMillis(), cRVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.27
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.vG());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.Jd());
                    jSONObject2.put("trigger_scroll_x", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.Mxy());
                    jSONObject2.put("trigger_scroll_y", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.Wyp());
                    jSONObject2.put("arbi_offset_y", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.qh());
                    jSONObject2.put("scroll_type", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.kj());
                    jSONObject2.put("scroll_duration", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.Ju());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    zM.icD("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                Object[] objArr = new Object[3];
                return jSONObject;
            }
        });
    }

    public static void NB(cR cRVar, final com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvsVar, final String str) {
        pvs(System.currentTimeMillis(), cRVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.28
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.vG());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.Jd());
                    jSONObject2.put("arbi_start_x", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.NB());
                    jSONObject2.put("arbi_start_y", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.sUS());
                    jSONObject2.put("click_duration", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.yiw());
                    jSONObject2.put("is_trigger_jump", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.so());
                    jSONObject2.put("click_type", String.valueOf(com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.zM()));
                    if (com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.pvs() != -1) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("hit_type", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.pvs());
                        jSONObject3.put("hit_extra", com.bytedance.sdk.openadsdk.Wyp.pvs.pvs.this.icD());
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    zM.icD("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                Object[] objArr = new Object[3];
                return jSONObject;
            }
        });
    }

    public static void pvs(final long j, final cR cRVar, String str) {
        if (cRVar == null || !cR.vG(cRVar) || cRVar.TN() == null) {
            return;
        }
        pvs(System.currentTimeMillis(), cRVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.29
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt(ImagesContract.URL, cR.this.TN().vG());
                    jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, cR.this.TN().pvs());
                    jSONObject2.putOpt("md5", cR.this.TN().icD());
                    if (cR.this.od() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(cR.this.od().Jd()));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.icD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(cR cRVar, String str, final String str2) {
        pvs(System.currentTimeMillis(), cRVar, str, "show_error", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.30
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(cR cRVar, String str, String str2, final long j, final JSONObject jSONObject) {
        if (cRVar == null || jSONObject == null) {
            return;
        }
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.31
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(TypedValues.TransitionType.S_DURATION, j);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void icD(cR cRVar, String str, String str2, final JSONObject jSONObject, final long j) {
        if (cRVar == null || jSONObject == null) {
            return;
        }
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.32
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put(TypedValues.TransitionType.S_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void vG(cR cRVar, final String str, final String str2, final JSONObject jSONObject) {
        if (cRVar == null || jSONObject == null) {
            return;
        }
        pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.34
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException unused) {
                }
                Object[] objArr = new Object[6];
                return jSONObject2;
            }
        });
    }

    public static void pvs(String str, long j) {
        com.bytedance.sdk.openadsdk.core.Jd.vG.pvs(str, j);
    }

    @DungeonFlag
    public static void pvs(final cR cRVar, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject, final boolean z) {
        if (cRVar == null || pvs(cRVar.jMV(), str3)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        pvs(new com.bytedance.sdk.component.so.so("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.icD.vG.35
            @Override // java.lang.Runnable
            public void run() {
                JSONArray optJSONArray;
                String cGU = cRVar.cGU();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String optString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(optString)) {
                            jSONObject2 = new JSONObject(optString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.NB(com.bytedance.sdk.openadsdk.core.mnm.pvs()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z) {
                                jSONObject2.put("click_scence", 1);
                            } else if (com.bytedance.sdk.openadsdk.core.model.rCZ.icD(cRVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int optInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z && optInt == 2) {
                            cGU = jSONObject2.optString("app_log_url");
                        }
                        int i = 0;
                        if ("click".equals(str3)) {
                            rCZ.vG(cRVar);
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - cR.icD(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (floatValue <= 0.0f) {
                                floatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(floatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.qh.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()))) {
                                if (z && optInt == 2) {
                                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (optJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i < optJSONArray2.length()) {
                                            arrayList.add(optJSONArray2.optString(i));
                                            i++;
                                        }
                                        com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(com.bytedance.sdk.openadsdk.mnm.pvs.pvs(arrayList, true), 2, String.valueOf(j));
                                    }
                                } else {
                                    cR cRVar2 = cRVar;
                                    if (cRVar2 != null) {
                                        com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(com.bytedance.sdk.openadsdk.mnm.pvs.pvs(cRVar2.joF(), true), 2, cRVar.neB());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.qh.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs())) && z && optInt == 2 && (optJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i < optJSONArray.length()) {
                                arrayList2.add(optJSONArray.optString(i));
                                i++;
                            }
                            com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(com.bytedance.sdk.openadsdk.mnm.pvs.pvs(arrayList2, true), 1, String.valueOf(j));
                        }
                    } catch (Exception unused) {
                    }
                }
                new pvs.C0091pvs(currentTimeMillis, cRVar).Jd(str).icD(str2).vG(str3).NB(String.valueOf(j)).sUS(String.valueOf(j2)).pvs(cGU).pvs(jSONObject).pvs((com.bytedance.sdk.openadsdk.icD.icD.pvs) null);
            }
        });
    }

    public static void icD(cR cRVar, String str, JSONObject jSONObject) {
        if (cRVar == null) {
            return;
        }
        pvs(cRVar, str, -1L, jSONObject);
    }

    public static void pvs(cR cRVar, String str, final long j, final JSONObject jSONObject) {
        pvs(System.currentTimeMillis(), cRVar, "open_ad", str, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.36
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 != -1) {
                        jSONObject2.put(TypedValues.TransitionType.S_DURATION, j2);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    } else {
                        jSONObject2.put("ad_extra_data", new JSONObject().toString());
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void pvs(final com.bytedance.sdk.component.so.so soVar) {
        if (soVar == null) {
            return;
        }
        if (ae.NB()) {
            com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vG.37
                @Override // java.lang.Runnable
                public void run() {
                    ae.icD(com.bytedance.sdk.component.so.so.this, 10);
                }
            });
        } else if (!ae.sUS()) {
            ae.icD(soVar, 10);
        } else {
            soVar.run();
        }
    }

    public static void pvs(final com.bytedance.sdk.openadsdk.Wyp.pvs.icD icd) {
        if (icd == null || icd.icD() == null) {
            return;
        }
        final cR icD = icd.icD();
        final int jhZ = icD.jhZ();
        if (jhZ == 2 || jhZ == 8) {
            pvs(System.currentTimeMillis(), icD, icd.vG(), "open_browser", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.38
                @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                public JSONObject pvs() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int Jd = com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.Jd();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("count", jlb.IP(com.bytedance.sdk.openadsdk.core.mnm.pvs()));
                        jSONObject2.put("interceptor", Jd);
                        jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.NB());
                        jSONObject2.put("link", com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.pvs());
                        jSONObject2.put("interaction_type", jhZ);
                        jSONObject2.put("real_interaction_type", com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.yiw());
                        if (com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.Jd() == 9) {
                            jSONObject2.put("is_act_signals_api_available", com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.so());
                            jSONObject2.put("is_act_signals_callback", com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.Mxy());
                        }
                        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.sUS())) {
                            jSONObject2.put("exception_msg", com.bytedance.sdk.openadsdk.Wyp.pvs.icD.this.sUS());
                        }
                        if (Jd == 2 || Jd == 5) {
                            jSONObject2.put("meta", icD.wjr().toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", e.getMessage());
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void vG(cR cRVar, String str, JSONObject jSONObject) {
        Jd(cRVar, "activity_recreate", str, jSONObject);
    }

    /* compiled from: AdEventManager.java */
    public static class pvs {
        public static void pvs(String str, final JSONObject jSONObject, cR cRVar) {
            String pvs = jlb.pvs(cRVar);
            if (pvs == null) {
                return;
            }
            vG.pvs(System.currentTimeMillis(), cRVar, pvs + "_landingpage", str, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.pvs.1
                @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                public JSONObject pvs() {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.loadEvent error", th);
                    }
                    return jSONObject2;
                }
            });
        }

        public static void pvs(final int i, final int i2, cR cRVar) {
            String pvs = jlb.pvs(cRVar);
            if (pvs == null) {
                return;
            }
            vG.pvs(System.currentTimeMillis(), cRVar, pvs + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.pvs.2
                @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                public JSONObject pvs() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("all_times", i2);
                        jSONObject2.put("hit_times", i);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }

        public static void pvs(final long j, final cR cRVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            vG.pvs(System.currentTimeMillis(), cRVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.pvs.3
                @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                public JSONObject pvs() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int pvs = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(ILoader.this, str2);
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("is_arbitrage", cRVar.yWX() ? 1 : 0);
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                        jSONObject2.put(ImagesContract.URL, cRVar.CjQ());
                        jSONObject2.put("channel_name", cRVar.tQ());
                        jSONObject2.put("interceptor_status", (TextUtils.isEmpty(cRVar.tQ()) || pvs <= 0) ? 0 : 1);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("resource_count", pvs);
                        jSONObject2.put("resource_info", jSONObject4);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }

        public static void pvs(final int i, final int i2, final int i3, final int i4, final cR cRVar, String str, final int i5) {
            if (str == null || TextUtils.isEmpty(cRVar.tQ())) {
                return;
            }
            vG.pvs(System.currentTimeMillis(), cRVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.pvs.4
                @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                public JSONObject pvs() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("next_url", cR.this.CjQ());
                        jSONObject2.put("channel_name", cR.this.tQ());
                        jSONObject2.put("preload_status", i <= 0 ? 0 : 2);
                        jSONObject2.put("first_page", i5);
                        jSONObject2.put("preload_h5_type", cR.this.CL());
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("channel_response", i);
                        jSONObject3.put("failResourceCount", i2);
                        jSONObject3.put("successCount", i3);
                        jSONObject3.put("failCount", i4);
                        jSONObject2.put("resource_info", jSONObject3);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void pvs(cR cRVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(LinkHeader.Parameters.Type, i);
        } catch (JSONException unused) {
        }
        icD(cRVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void icD(cR cRVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(LinkHeader.Parameters.Type, i);
        } catch (JSONException unused) {
        }
        icD(cRVar, str, "download_app_ad_track", jSONObject);
    }

    public static void pvs(cR cRVar, String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i) {
        pvs(System.currentTimeMillis(), cRVar, str, "start_show_endcard", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.39
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isSkip", z);
                    jSONObject2.put("force", z2);
                    jSONObject2.put("isFromLandingPage", z3);
                    jSONObject2.put("finishing", z4);
                    jSONObject2.put(TypedValues.TransitionType.S_FROM, i);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pvs(final cR cRVar, final boolean z, String str, final String str2, final long j, final String str3, final String str4, final int i, final String str5) {
        pvs(System.currentTimeMillis(), cRVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.vG.40
            /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:(2:2|3))|(11:5|(9:36|9|(1:(1:14))(2:26|(2:28|(1:30))(2:31|(1:33)))|15|(1:17)|18|19|20|21)|8|9|(0)(0)|15|(0)|18|19|20|21)(11:37|(9:39|9|(0)(0)|15|(0)|18|19|20|21)|8|9|(0)(0)|15|(0)|18|19|20|21)|40|41|42|43|19|20|21|(1:(1:44))) */
            /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:3:0x000e, B:12:0x003f, B:14:0x0047, B:15:0x009c, B:17:0x00bb, B:18:0x00c5, B:26:0x005d, B:28:0x0061, B:30:0x0069, B:31:0x007f, B:33:0x0087, B:34:0x001f, B:37:0x0029), top: B:2:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:3:0x000e, B:12:0x003f, B:14:0x0047, B:15:0x009c, B:17:0x00bb, B:18:0x00c5, B:26:0x005d, B:28:0x0061, B:30:0x0069, B:31:0x007f, B:33:0x0087, B:34:0x001f, B:37:0x0029), top: B:2:0x000e }] */
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public JSONObject pvs() {
                String str6;
                int hashCode;
                char c;
                cR.pvs gSd;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    try {
                        str6 = str4;
                        hashCode = str6.hashCode();
                    } catch (Throwable th) {
                        jSONObject2.put("error_code", Opcodes.I2L);
                        jSONObject2.put("error_msg", "send template error " + th.getMessage());
                    }
                } catch (Throwable unused) {
                }
                if (hashCode != -1606803861) {
                    if (hashCode == 3107 && str6.equals("ad")) {
                        c = 1;
                        if (c == 0) {
                            if (c == 1 && (gSd = cRVar.gSd()) != null) {
                                jSONObject2.putOpt(ImagesContract.URL, gSd.IP());
                                jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, gSd.NB());
                                jSONObject2.putOpt("md5", gSd.bNS());
                            }
                        } else if (z) {
                            com.bytedance.sdk.openadsdk.core.ugen.NB.pvs NZI = cRVar.NZI();
                            if (NZI != null) {
                                jSONObject2.putOpt(ImagesContract.URL, NZI.vG());
                                jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, NZI.pvs());
                                jSONObject2.putOpt("md5", NZI.icD());
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.ugen.NB.pvs TN = cRVar.TN();
                            if (TN != null) {
                                jSONObject2.putOpt(ImagesContract.URL, TN.vG());
                                jSONObject2.putOpt(FacebookMediationAdapter.KEY_ID, TN.pvs());
                                jSONObject2.putOpt("md5", TN.icD());
                            }
                        }
                        jSONObject2.put("ugen_status", str2);
                        jSONObject2.put(TypedValues.TransitionType.S_FROM, str3);
                        jSONObject2.put("ugen_scene", str4);
                        if ("fail".equals(str2)) {
                            jSONObject2.put("error_code", i);
                            jSONObject2.put("error_msg", str5);
                        }
                        jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        return jSONObject;
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    jSONObject2.put("ugen_status", str2);
                    jSONObject2.put(TypedValues.TransitionType.S_FROM, str3);
                    jSONObject2.put("ugen_scene", str4);
                    if ("fail".equals(str2)) {
                    }
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                }
                if (str6.equals("endcard")) {
                    c = 0;
                    if (c == 0) {
                    }
                    jSONObject2.put("ugen_status", str2);
                    jSONObject2.put(TypedValues.TransitionType.S_FROM, str3);
                    jSONObject2.put("ugen_scene", str4);
                    if ("fail".equals(str2)) {
                    }
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                }
                c = 65535;
                if (c == 0) {
                }
                jSONObject2.put("ugen_status", str2);
                jSONObject2.put(TypedValues.TransitionType.S_FROM, str3);
                jSONObject2.put("ugen_scene", str4);
                if ("fail".equals(str2)) {
                }
                jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
                return jSONObject;
                jSONObject2.put("error_code", Opcodes.I2L);
                jSONObject2.put("error_msg", "send template error " + th.getMessage());
                jSONObject.put("ad_extra_data", jSONObject2.toString());
                return jSONObject;
            }
        });
    }

    private static boolean pvs(int i, String str) {
        int gA;
        try {
            Set<String> GcG = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().GcG();
            if ((i == 1 && GcG != null && GcG.contains(str)) || (gA = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().gA(str)) == 0) {
                return true;
            }
            if (gA != 100) {
                return ((int) ((Math.random() * 100.0d) + 1.0d)) > gA;
            }
            return false;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }
}
