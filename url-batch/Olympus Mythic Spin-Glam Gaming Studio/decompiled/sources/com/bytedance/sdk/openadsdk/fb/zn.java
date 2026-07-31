package com.bytedance.sdk.openadsdk.fb;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.ev;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;
import com.bytedance.sdk.openadsdk.core.zak;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.fb.zmn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.ww;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class zn {
    @WorkerThread
    public static void zmn() {
        try {
            Class.forName(zn.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void zmn(nqi nqiVar, String str, final int i) {
        zmn(System.currentTimeMillis(), nqiVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(final nqi nqiVar, String str) {
        zmn(System.currentTimeMillis(), nqiVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.12
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (nqi.zn(nqi.this)) {
                        if (nqi.this.hgd() != null) {
                            jSONObject.putOpt("url", nqi.this.hgd().zn());
                            jSONObject.putOpt("id", nqi.this.hgd().zmn());
                            jSONObject.putOpt("md5", nqi.this.hgd().fs());
                        }
                        if (nqi.this.mrt() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", nqi.this.mrt().klz());
                        jSONObject.putOpt("style_id", nqi.this.tf());
                        if (nqi.this.mrt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(final nqi nqiVar, String str, final long j) {
        zmn(System.currentTimeMillis(), nqiVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.23
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (nqi.zn(nqi.this)) {
                        if (nqi.this.hgd() != null) {
                            jSONObject.putOpt("url", nqi.this.hgd().zn());
                            jSONObject.putOpt("id", nqi.this.hgd().zmn());
                            jSONObject.putOpt("md5", nqi.this.hgd().fs());
                        }
                        if (nqi.this.mrt() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", nqi.this.mrt().klz());
                        jSONObject.putOpt("style_id", nqi.this.tf());
                        if (nqi.this.mrt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(final nqi nqiVar, String str, final long j, final int i, final String str2, final String str3) {
        zmn(System.currentTimeMillis(), nqiVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.33
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (nqi.zn(nqi.this)) {
                        if (nqi.this.hgd() != null) {
                            jSONObject.putOpt("url", nqi.this.hgd().zn());
                            jSONObject.putOpt("id", nqi.this.hgd().zmn());
                            jSONObject.putOpt("md5", nqi.this.hgd().fs());
                        }
                        if (nqi.this.mrt() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", nqi.this.mrt().klz());
                        jSONObject.putOpt("style_id", nqi.this.tf());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (nqi.this.mrt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", str2);
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(final nqi nqiVar, String str, final long j, final int i, final int i2) {
        zmn(System.currentTimeMillis(), nqiVar, str, "load", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.44
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, Math.min(j, 600000L));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(nqiVar.lt()));
                    jSONObject.put("first_page", i2);
                    jSONObject.put("preload_h5_type", nqiVar.ww());
                    int i3 = i;
                    if (i3 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i3));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(String str, nqi nqiVar, String str2, final Map<String, Object> map) {
        zmn(System.currentTimeMillis(), nqiVar, str2, str, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.48
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @DungeonFlag
    public static void zmn(nqi nqiVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        zmn(nqiVar, "show", str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    private static void zmn(final nqi nqiVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (nqiVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (nqiVar.yof() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            nqiVar.iv(true);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zmn(new com.bytedance.sdk.component.zg.fs.zn("onShow") { // from class: com.bytedance.sdk.openadsdk.fb.zn.49
            @Override // java.lang.Runnable
            public void run() {
                final String str3;
                if (!com.bytedance.sdk.openadsdk.core.kgc.fb().kgc()) {
                    str3 = "none";
                } else {
                    str3 = com.bytedance.sdk.openadsdk.core.klz.zmn.zmn.zmn((Application) com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn(str2, DeviceUtils.zmn(), nqiVar.qvo());
                }
                zn.zmn(currentTimeMillis, nqiVar, str2, str, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.49.1
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject fs() {
                        Object obj;
                        Object obj2;
                        try {
                            zak.fs(nqiVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", nqiVar.ze());
                                float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - nqiVar.sc()).floatValue();
                                if (floatValue <= 0.0f) {
                                    floatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(floatValue));
                                long elapsedRealtime = SystemClock.elapsedRealtime() - nqiVar.bvs();
                                if (elapsedRealtime > 0) {
                                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                                }
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(nqiVar.mig()));
                                String obg = nqiVar.obg();
                                if (!TextUtils.isEmpty(obg) && !TextUtils.isEmpty(obg)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(obg) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        th.getMessage();
                                    }
                                }
                                if (nqiVar.hr() == null || (obj = nqiVar.hr().get(TTAdConstant.SDK_BIDDING_TYPE)) == null || Integer.parseInt(obj.toString()) != 2 || (obj2 = nqiVar.hr().get("price")) == null) {
                                    return jSONObject3;
                                }
                                jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj2.toString()) * 100000.0d));
                                return jSONObject3;
                            } catch (Throwable unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zn() {
                        try {
                            AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", nqiVar.lt());
                                AnonymousClass49 anonymousClass492 = AnonymousClass49.this;
                                jSONObject.put("real_interaction_method", nqiVar.cd());
                                jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.kgc.fb().rt(String.valueOf(nqiVar.qvo())));
                                jSONObject.put("au_show", str3);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", nqiVar.lt());
                            jSONObject4.put("real_interaction_method", nqiVar.cd());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.kgc.fb().rt(String.valueOf(nqiVar.qvo())));
                            jSONObject4.put("au_show", str3);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zmn() {
                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                        JSONObject jSONObject3 = jSONObject2;
                        return jSONObject3 == null ? zn.fs(nqiVar, new JSONObject()) : zn.fs(nqiVar, jSONObject3);
                    }
                });
                if ("show".equals(str)) {
                    if (!nqiVar.qc()) {
                        if (nqiVar.wir()) {
                            com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(nqiVar.vgx(), new zn.fs("show_urls", nqiVar));
                        } else {
                            zn.zmn(nqiVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int optInt = jSONObject3.optInt("dynamic_show_type");
                        if (nqiVar.vlj() == 1 && (optInt == 7 || optInt == 10)) {
                            com.bytedance.sdk.component.utils.bvs.zmn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.zn.49.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                        zn.fs(nqiVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.rc.fs().uw());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.klz.zn.zmn(nqiVar, str3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject fs(nqi nqiVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (am.fs(nqiVar) && nqiVar.vp()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        zmn(jSONObject);
        fs(jSONObject);
        return jSONObject;
    }

    private static void zmn(JSONObject jSONObject) {
        try {
            jSONObject.put("screen_scale", jy.hhw(com.bytedance.sdk.openadsdk.core.kgc.zmn()));
        } catch (Throwable unused) {
        }
    }

    private static void fs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject zmn2 = zg.zmn();
            if (zmn2 != null) {
                Iterator<String> keys = zmn2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, zmn2.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void zmn(nqi nqiVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(nqiVar.vgx(), true), 1, nqiVar.ji());
    }

    @DungeonFlag
    public static void zmn(final String str, final nqi nqiVar, final String str2, final nps npsVar) {
        if (nqiVar == null || npsVar == null || !npsVar.zmn()) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.50
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                try {
                    nps npsVar2 = npsVar;
                    if (npsVar2 == null || npsVar2.fs() == null) {
                        return null;
                    }
                    JSONObject fs = npsVar.fs();
                    if (str2.equals("open_ad")) {
                        fs.put("is_icon_only", nqiVar.yj() ? 1 : 0);
                    }
                    return fs;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void zmn(final nqi nqiVar, final String str, final ww wwVar) {
        if (nqiVar == null) {
            return;
        }
        final long fb = wwVar.fb();
        zmn(System.currentTimeMillis(), nqiVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", fb);
                    jSONObject.put("click_time", wwVar.zmn);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", nqiVar.yj() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void fs(nqi nqiVar, String str, final long j) {
        if (nqiVar != null && j > 0 && j < 200000) {
            zmn(System.currentTimeMillis(), nqiVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.3
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void zmn(nqi nqiVar, final String str, final int i, final String str2, final long j, final boolean z, final int i2, final long j2) {
        zmn(System.currentTimeMillis(), nqiVar, str, fs.fb, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z);
                    jSONObject.put("arbi_convert_count", i2);
                    jSONObject.put("loading_start_timestamp", j2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, String str, final long j, final boolean z) {
        zmn(System.currentTimeMillis(), nqiVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.5
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zn(nqi nqiVar, String str, final long j) {
        zmn(System.currentTimeMillis(), nqiVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.6
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable th) {
                    th.getMessage();
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void fs(nqi nqiVar, String str, final int i) {
        zmn(System.currentTimeMillis(), nqiVar, str, "check_meta", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.7
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.rc.fs().doe());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zn(nqi nqiVar, String str, int i) {
        zmn(nqiVar, str, i, (String) null);
    }

    public static void zmn(nqi nqiVar, String str, final int i, final String str2) {
        if (i == 200) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.8
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                try {
                    if (str2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("extra", str2);
                        return jSONObject;
                    }
                } catch (Throwable unused) {
                }
                return super.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.rc.fs().doe());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, String str, final int i, final String str2, final int i2) {
        zmn(System.currentTimeMillis(), nqiVar, str, fs.zmn, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.9
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, final String str, final int i, final String str2, final float f) {
        zmn(System.currentTimeMillis(), nqiVar, str, fs.fs, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.10
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, final String str, final int i, final String str2, final String str3, final int i2) {
        zmn(System.currentTimeMillis(), nqiVar, str, fs.zn, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.11
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void fb(final nqi nqiVar, final String str, final int i) {
        zmn(System.currentTimeMillis(), nqiVar, str, "material_status", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.13
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i);
                    jSONObject.put("image_mode", nqiVar.zq());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void fs(final nqi nqiVar, String str) {
        zmn(System.currentTimeMillis(), nqiVar, str, "picture_click", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.14
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", nqi.this.ldx());
                    jSONObject.put("interaction_method", nqi.this.lt());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void zmn(final String str, final nqi nqiVar, final com.bytedance.sdk.openadsdk.core.model.klz klzVar, final String str2, final boolean z, final Map<String, Object> map, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        zmn(new com.bytedance.sdk.component.zg.fs.zn("onClick") { // from class: com.bytedance.sdk.openadsdk.fb.zn.15
            @Override // java.lang.Runnable
            public void run() {
                nqi nqiVar2 = nqiVar;
                if (nqiVar2 == null) {
                    return;
                }
                zn.zmn(currentTimeMillis, nqiVar2, str2, str, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.15.1
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject fs() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.klz klzVar2 = klzVar;
                            if (klzVar2 != null) {
                                JSONObject zmn2 = klzVar2.zmn();
                                zmn2.put("is_valid", z);
                                int i2 = i;
                                if (i2 > 0 && i2 <= 2) {
                                    zmn2.put("user_behavior_type", i2);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey(IronSourceConstants.EVENTS_DURATION)) {
                                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, map.get(IronSourceConstants.EVENTS_DURATION));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!IronSourceConstants.EVENTS_DURATION.equals(entry.getKey())) {
                                            zmn2.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                zmn2.put("interaction_method", nqiVar.lt());
                                if (str2.equals("open_ad")) {
                                    zmn2.put("is_icon_only", nqiVar.yj() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", zmn2.toString());
                            }
                            jSONObject.putOpt("log_extra", nqiVar.ze());
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - nqiVar.sc()).floatValue();
                            if (floatValue <= 0.0f) {
                                floatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(floatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(nqiVar.mig()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(nqiVar.hz(), true), 2, nqiVar.ji());
                }
                if ("click".equals(str)) {
                    zak.zn(nqiVar);
                }
            }
        });
    }

    public static void zmn(nqi nqiVar, String str, String str2, final JSONObject jSONObject) {
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.16
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (jSONObject.has(IronSourceConstants.EVENTS_DURATION)) {
                        jSONObject2.put(IronSourceConstants.EVENTS_DURATION, jSONObject.get(IronSourceConstants.EVENTS_DURATION));
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject2;
            }
        });
        if ("click".equals(str2)) {
            zak.zn(nqiVar);
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()))) {
                return;
            }
            com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(nqiVar.hz(), true), 2, nqiVar.ji());
        }
    }

    public static void zmn(nqi nqiVar, String str, final String str2, final long j, final int i, JSONObject jSONObject, final nps npsVar) {
        final JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.17
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject3.put("percent", i);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                nps npsVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (npsVar2 = npsVar) != null) {
                        npsVar2.zmn(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void fs(nqi nqiVar, String str, String str2, final JSONObject jSONObject) {
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.18
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, String str, String str2, final JSONObject jSONObject, final long j) {
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.19
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                return jSONObject;
            }
        });
    }

    public static void zmn(final nqi nqiVar, String str, String str2, final Map<String, Object> map) {
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.20
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get(IronSourceConstants.EVENTS_DURATION);
                        if (obj instanceof Long) {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", nqiVar.qj());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void zmn(long j, nqi nqiVar, String str, String str2) {
        zmn(j, nqiVar, str, str2, (com.bytedance.sdk.openadsdk.cyb.fs.fs) null);
    }

    @DungeonFlag
    public static void zmn(final long j, final nqi nqiVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.cyb.fs.fs fsVar) {
        if (nqiVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || zmn(nqiVar.kra(), str2)) {
            return;
        }
        zmn(new com.bytedance.sdk.component.zg.fs.zn(str2) { // from class: com.bytedance.sdk.openadsdk.fb.zn.21
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.cyb.fs.fs fsVar2 = fsVar;
                    if (fsVar2 != null) {
                        jSONObject = fsVar2.fs();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.cyb.fs.fs fsVar3 = fsVar;
                    if (fsVar3 != null) {
                        JSONObject zmn2 = fsVar3.zmn();
                        JSONObject zn = fsVar.zn();
                        if (zmn2 != null) {
                            if (zn == null) {
                                zn = new JSONObject();
                            }
                            nqi nqiVar2 = nqiVar;
                            if (nqiVar2 != null) {
                                zmn2.put("render_sequence", nqiVar2.skn());
                            }
                            if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.fs()) {
                                zmn2.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn()));
                            }
                            zn.put("pag_json_data", zmn2.toString());
                            jSONObject.put("ad_extra_data", zn.toString());
                        } else if (zn != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            nqi nqiVar3 = nqiVar;
                            if (nqiVar3 != null) {
                                jSONObject2.put("render_sequence", nqiVar3.skn());
                            }
                            if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.fs()) {
                                jSONObject2.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn()));
                            }
                            zn.put("pag_json_data", jSONObject2.toString());
                            jSONObject.put("ad_extra_data", zn.toString());
                        } else {
                            String optString = jSONObject.optString("ad_extra_data");
                            JSONObject jSONObject3 = TextUtils.isEmpty(optString) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(optString);
                            String optString2 = jSONObject3.optString("pag_json_data");
                            JSONObject jSONObject4 = TextUtils.isEmpty(optString2) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(optString2);
                            if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.fs()) {
                                jSONObject4.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn()));
                            }
                            jSONObject3.putOpt("pag_json_data", jSONObject4.toString());
                            jSONObject.putOpt("ad_extra_data", jSONObject3.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", nqiVar.ze());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(nqiVar.mig()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new zmn.C0192zmn(j, nqiVar).fs(str).zn(str2).btk(nqiVar.ji()).zg(nqiVar.gn()).zmn(nqiVar.kh()).zmn(nqiVar.zp()).zmn(jSONObject).nps(nqiVar.wbj()).zmn((com.bytedance.sdk.openadsdk.fb.fs.zmn) null);
            }
        });
    }

    public static void zmn(nqi nqiVar, String str, final String str2, final int i) {
        zmn(System.currentTimeMillis(), nqiVar, str, "playable_track", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.22
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void fs(final long j, final nqi nqiVar, String str, final String str2) {
        zmn(System.currentTimeMillis(), nqiVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.24
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (nqi.zn(nqiVar)) {
                        if (nqiVar.hgd() != null) {
                            jSONObject.putOpt("url", nqiVar.hgd().zn());
                            jSONObject.putOpt("id", nqiVar.hgd().zmn());
                            jSONObject.putOpt("md5", nqiVar.hgd().fs());
                        }
                        jSONObject.putOpt("from", str2);
                        if (nqiVar.mrt() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.put("url", nqiVar.mrt().klz());
                        jSONObject.put("style_id", nqiVar.tf());
                        if (nqiVar.mrt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void zn(final nqi nqiVar, String str) {
        if (nqiVar == null || !nqi.zn(nqiVar) || nqiVar.hgd() == null) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.25
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", nqi.this.hgd().zn());
                    jSONObject.putOpt("id", nqi.this.hgd().zmn());
                    jSONObject.putOpt("md5", nqi.this.hgd().fs());
                    if (nqi.this.mrt() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(nqi.this.mrt().fb()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, final com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmnVar, final String str) {
        zmn(System.currentTimeMillis(), nqiVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.26
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.zn());
                    jSONObject.put("keyword", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.olo());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void fs(nqi nqiVar, final com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmnVar, final String str) {
        zmn(System.currentTimeMillis(), nqiVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.27
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.zn());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.fb());
                    jSONObject.put("arbi_load_duration", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.kgc());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void zn(nqi nqiVar, final com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmnVar, final String str) {
        zmn(System.currentTimeMillis(), nqiVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.28
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.zn());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.fb());
                    jSONObject.put("arbi_stay_duration", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.rt());
                    jSONObject.put("browsing_percentage", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.cn());
                    jSONObject.put("out_focus_scene", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.cyb());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void fb(nqi nqiVar, final com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmnVar, final String str) {
        zmn(System.currentTimeMillis(), nqiVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.29
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.zn());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.fb());
                    jSONObject.put("trigger_scroll_x", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.bvs());
                    jSONObject.put("trigger_scroll_y", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.iv());
                    jSONObject.put("arbi_offset_y", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.rc());
                    jSONObject.put("scroll_type", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.klz());
                    jSONObject.put("scroll_duration", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.mw());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void btk(nqi nqiVar, final com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmnVar, final String str) {
        zmn(System.currentTimeMillis(), nqiVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.30
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.zn());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.fb());
                    jSONObject.put("arbi_start_x", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.btk());
                    jSONObject.put("arbi_start_y", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.hhw());
                    jSONObject.put("click_duration", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.nps());
                    jSONObject.put("is_trigger_jump", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.zg());
                    jSONObject.put("click_type", String.valueOf(com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.kw()));
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                try {
                    com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmnVar2 = com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this;
                    if (zmnVar2 == null || zmnVar2.zmn() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.zmn());
                    jSONObject.put("hit_extra", com.bytedance.sdk.openadsdk.cyb.zmn.zmn.this.fs());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void zmn(final long j, final nqi nqiVar, String str) {
        if (nqiVar == null || !nqi.zn(nqiVar) || nqiVar.hgd() == null) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.31
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", nqiVar.hgd().zn());
                    jSONObject.putOpt("id", nqiVar.hgd().zmn());
                    jSONObject.putOpt("md5", nqiVar.hgd().fs());
                    if (nqiVar.mrt() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(nqiVar.mrt().fb()));
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, String str, String str2, final long j, final JSONObject jSONObject) {
        if (nqiVar == null || jSONObject == null) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.32
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                return jSONObject;
            }
        });
    }

    public static void fs(nqi nqiVar, String str, String str2, final JSONObject jSONObject, final long j) {
        if (nqiVar == null || jSONObject == null) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.34
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                return jSONObject;
            }
        });
    }

    public static void zn(nqi nqiVar, String str, String str2, final JSONObject jSONObject) {
        if (nqiVar == null || jSONObject == null) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.35
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, String str, final JSONObject jSONObject) {
        zmn(System.currentTimeMillis(), nqiVar, str, fs.btk, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.36
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                return jSONObject;
            }
        });
    }

    public static void fs(nqi nqiVar, String str, final JSONObject jSONObject) {
        zmn(System.currentTimeMillis(), nqiVar, str, fs.hhw, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.37
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                return jSONObject;
            }
        });
    }

    public static void zmn(String str, long j) {
        com.bytedance.sdk.openadsdk.core.bvs.zn.zmn(str, j);
    }

    @DungeonFlag
    public static void zmn(final nqi nqiVar, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject, final boolean z) {
        if (nqiVar == null || zmn(nqiVar.kra(), str3)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zmn(new com.bytedance.sdk.component.zg.fs.zn("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.fb.zn.38
            @Override // java.lang.Runnable
            public void run() {
                JSONArray optJSONArray;
                String kh = nqiVar.kh();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String optString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(optString)) {
                            jSONObject2 = PangleNetworkBridge.jsonObjectInit(optString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.nps(com.bytedance.sdk.openadsdk.core.kgc.zmn()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z) {
                                jSONObject2.put("click_scence", 1);
                            } else if (am.fs(nqiVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (nqiVar.vp()) {
                            try {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                }
                                optJSONObject.put("is_new_playable", 1);
                                if (nqiVar.bl()) {
                                    optJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", optJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                        if (optJSONObject2 == null) {
                            optJSONObject2 = new JSONObject();
                        }
                        optJSONObject2.put("render_sequence", nqiVar.skn());
                        int i = 0;
                        if (com.bytedance.sdk.openadsdk.rt.zn.zn(nqiVar)) {
                            optJSONObject2.put("is_lp_pre_render", nqiVar.gu() ? 1 : 0);
                        }
                        if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.fs()) {
                            optJSONObject2.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn()));
                        }
                        jSONObject2.put("pag_json_data", optJSONObject2.toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int optInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z && optInt == 2) {
                            kh = jSONObject2.optString("app_log_url");
                        }
                        if ("click".equals(str3)) {
                            zak.zn(nqiVar);
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - nqi.fs(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (floatValue <= 0.0f) {
                                floatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(floatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()))) {
                                if (z && optInt == 2) {
                                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (optJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i < optJSONArray2.length()) {
                                            arrayList.add(optJSONArray2.optString(i));
                                            i++;
                                        }
                                        com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn((List<String>) arrayList, true), 2, String.valueOf(j));
                                    }
                                } else {
                                    nqi nqiVar2 = nqiVar;
                                    if (nqiVar2 != null) {
                                        com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(nqiVar2.hz(), true), 2, nqiVar.ji());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn())) && z && optInt == 2 && (optJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i < optJSONArray.length()) {
                                arrayList2.add(optJSONArray.optString(i));
                                i++;
                            }
                            com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn((List<String>) arrayList2, true), 1, String.valueOf(j));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new zmn.C0192zmn(currentTimeMillis, nqiVar).fb(str).fs(str2).zn(str3).btk(String.valueOf(j)).hhw(String.valueOf(j2)).zmn(kh).zmn(nqiVar.zp()).zmn(jSONObject).zg(nqiVar.gn()).nps(nqiVar.wbj()).zmn((com.bytedance.sdk.openadsdk.fb.fs.zmn) null);
            }
        });
    }

    public static void zn(nqi nqiVar, String str, JSONObject jSONObject) {
        if (nqiVar == null) {
            return;
        }
        zmn(nqiVar, str, -1L, jSONObject, (JSONObject) null);
    }

    public static void zmn(final nqi nqiVar, String str, final long j, final JSONObject jSONObject, final JSONObject jSONObject2) {
        zmn(System.currentTimeMillis(), nqiVar, "open_ad", str, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.39
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 != -1) {
                        jSONObject3.put(IronSourceConstants.EVENTS_DURATION, j2);
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                try {
                    JSONObject jSONObject3 = jSONObject;
                    return jSONObject3 != null ? jSONObject3 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    nqi nqiVar2 = nqiVar;
                    if (nqiVar2 != null) {
                        int iv = nqiVar2.iv();
                        jSONObject3.putOpt("start_type", Integer.valueOf(iv == 1 ? 1 : 2));
                        jSONObject3.putOpt("load_index", Integer.valueOf(iv));
                        if (iv == 1) {
                            jSONObject3.putOpt("init_to_ad_load_time", Long.valueOf(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.core.cn.zn));
                        }
                    }
                    jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.nps.zmn.fb()));
                    jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.nps.zmn.fs()));
                } catch (Exception e) {
                    e.getMessage();
                }
                return jSONObject3;
            }
        });
    }

    public static void zmn(final com.bytedance.sdk.component.zg.fs.zn znVar) {
        if (znVar == null) {
            return;
        }
        if (nu.hhw()) {
            com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.zn.40
                @Override // java.lang.Runnable
                public void run() {
                    nu.fs(com.bytedance.sdk.component.zg.fs.zn.this, 10);
                }
            });
        } else if (!nu.nps()) {
            nu.fs(znVar, 10);
        } else {
            znVar.run();
        }
    }

    public static void zmn(final com.bytedance.sdk.openadsdk.cyb.zmn.fs fsVar) {
        if (fsVar == null || fsVar.fs() == null) {
            return;
        }
        final nqi fs = fsVar.fs();
        final int va = fs.va();
        if (va == 2 || va == 8 || (oub.fb(fs) && fs.zmn.fb.equals(fsVar.zmn()))) {
            zmn(System.currentTimeMillis(), fs, fsVar.zn(), "open_browser", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.41
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zn() {
                    JSONArray optJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int fb = com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.fb();
                        jSONObject.put("count", oub.iv(com.bytedance.sdk.openadsdk.core.kgc.zmn()));
                        jSONObject.put("interceptor", fb);
                        jSONObject.put("success", com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.btk());
                        jSONObject.put("link", com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.zmn());
                        jSONObject.put("interaction_type", va);
                        jSONObject.put("real_interaction_type", com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.nps());
                        if (com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.fb() == 9) {
                            jSONObject.put("is_act_signals_api_available", com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.zg());
                            jSONObject.put("is_act_signals_callback", com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.bvs());
                        }
                        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.hhw())) {
                            jSONObject.put("exception_msg", com.bytedance.sdk.openadsdk.cyb.zmn.fs.this.hhw());
                        }
                        if (fb == 2 || fb == 5) {
                            String iyj = fs.iyj();
                            if (!TextUtils.isEmpty(iyj) && (optJSONArray = PangleNetworkBridge.jsonObjectInit(iyj).optJSONArray("creatives")) != null && optJSONArray.length() > 0) {
                                jSONObject.put(Constants.REFERRER_API_META, optJSONArray.optJSONObject(fs.zn()));
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void fs(nqi nqiVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        zmn(nqiVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    public static void zmn(JSONObject jSONObject, int i, int i2) {
        try {
            jSONObject.put("skip_show_time", i);
            jSONObject.put("skip_time", i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i2 - (i * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static class zmn {
        public static void zmn(String str, final JSONObject jSONObject, nqi nqiVar) {
            String zmn = oub.zmn(nqiVar);
            if (zmn == null) {
                return;
            }
            zn.zmn(System.currentTimeMillis(), nqiVar, zmn + "_landingpage", str, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.zmn.1
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zn() {
                    return jSONObject;
                }
            });
        }

        public static void zmn(final int i, final int i2, nqi nqiVar) {
            String zmn = oub.zmn(nqiVar);
            if (zmn == null) {
                return;
            }
            zn.zmn(System.currentTimeMillis(), nqiVar, zmn + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.zmn.2
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i2);
                        jSONObject.put("hit_times", i);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }

        public static void zmn(final long j, final nqi nqiVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            zn.zmn(System.currentTimeMillis(), nqiVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.zmn.3
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject fs() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zn() {
                    int zmn;
                    int i;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        zmn = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(iLoader, str2);
                        jSONObject.put("url", nqiVar.pl());
                        jSONObject.put("channel_name", nqiVar.ltf());
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    if (!TextUtils.isEmpty(nqiVar.ltf()) && zmn > 0) {
                        i = 1;
                        jSONObject.put("interceptor_status", i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", zmn);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    }
                    i = 0;
                    jSONObject.put("interceptor_status", i);
                    JSONObject jSONObject22 = new JSONObject();
                    jSONObject22.put("resource_count", zmn);
                    jSONObject.put("resource_info", jSONObject22);
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zmn() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(nqi.fs, nqiVar.lwz() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
        }

        public static void zmn(final int i, final int i2, final int i3, final int i4, final nqi nqiVar, String str, final int i5) {
            if (str == null || TextUtils.isEmpty(nqiVar.ltf())) {
                return;
            }
            zn.zmn(System.currentTimeMillis(), nqiVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.zmn.4
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", nqi.this.pl());
                        jSONObject.put("channel_name", nqi.this.ltf());
                        jSONObject.put("preload_status", i <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i5);
                        jSONObject.put("preload_h5_type", nqi.this.ww());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i);
                        jSONObject2.put("failResourceCount", i2);
                        jSONObject2.put("successCount", i3);
                        jSONObject2.put("failCount", i4);
                        jSONObject.put("resource_info", jSONObject2);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void zmn(nqi nqiVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        fs(nqiVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void fs(nqi nqiVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        fs(nqiVar, str, "download_app_ad_track", jSONObject);
    }

    public static void zmn(nqi nqiVar, String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i, final Map<String, Object> map) {
        zmn(System.currentTimeMillis(), nqiVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.42
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z);
                    jSONObject.put("force", z2);
                    jSONObject.put("isFromLandingPage", z3);
                    jSONObject.put("finishing", z4);
                    jSONObject.put("from", i);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(final nqi nqiVar, final boolean z, String str, final String str2, final long j, final String str3, final String str4, final int i, final String str5) {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        zmn(System.currentTimeMillis(), nqiVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.43
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|3|(2:5|(8:7|(6:37|11|(1:(1:(1:17))(2:24|(1:26)))(2:27|(2:29|(1:31))(2:32|(1:34)))|18|(1:20)|22)|10|11|(0)(0)|18|(0)|22)(8:38|(6:40|11|(0)(0)|18|(0)|22)|10|11|(0)(0)|18|(0)|22))(8:41|(6:43|11|(0)(0)|18|(0)|22)|10|11|(0)(0)|18|(0)|22)|44|45|46|47|48|22|(1:(1:49))) */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00ea A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0009, B:15:0x0050, B:17:0x0058, B:18:0x00cb, B:20:0x00ea, B:24:0x006e, B:26:0x0076, B:27:0x008c, B:29:0x0090, B:31:0x0098, B:32:0x00ae, B:34:0x00b6, B:35:0x0020, B:38:0x002d, B:41:0x0037), top: B:2:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0009, B:15:0x0050, B:17:0x0058, B:18:0x00cb, B:20:0x00ea, B:24:0x006e, B:26:0x0076, B:27:0x008c, B:29:0x0090, B:31:0x0098, B:32:0x00ae, B:34:0x00b6, B:35:0x0020, B:38:0x002d, B:41:0x0037), top: B:2:0x0009 }] */
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public JSONObject zn() {
                String str6;
                int hashCode;
                char c;
                ev rsi;
                JSONObject jSONObject = new JSONObject();
                try {
                    str6 = str4;
                    hashCode = str6.hashCode();
                } catch (Throwable th) {
                    jSONObject.put("error_code", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                    jSONObject.put("error_msg", "send template error " + th.getMessage());
                }
                if (hashCode == -1606803861) {
                    if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        c = 0;
                        if (c == 0) {
                        }
                        jSONObject.put("ugen_status", str2);
                        jSONObject.put("from", str3);
                        jSONObject.put("ugen_scene", str4);
                        if (X3.g.e.equals(str2)) {
                        }
                        return jSONObject;
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if (X3.g.e.equals(str2)) {
                    }
                    return jSONObject;
                }
                if (hashCode != 3107) {
                    if (hashCode == 2989536 && str6.equals("adv3")) {
                        c = 2;
                        if (c == 0) {
                            if (c == 1) {
                                nqi.zmn ouf = nqiVar.ouf();
                                if (ouf != null) {
                                    jSONObject.putOpt("url", ouf.mw());
                                    jSONObject.putOpt("id", ouf.fb());
                                    jSONObject.putOpt("md5", ouf.rt());
                                }
                            } else if (c == 2 && (rsi = nqiVar.rsi()) != null) {
                                jSONObject.putOpt("url", rsi.zn());
                                jSONObject.putOpt("id", rsi.zmn());
                                jSONObject.putOpt("md5", rsi.fs());
                            }
                        } else if (z) {
                            com.bytedance.sdk.openadsdk.core.mw.zg.zmn nu = nqiVar.nu();
                            if (nu != null) {
                                jSONObject.putOpt("url", nu.zn());
                                jSONObject.putOpt("id", nu.zmn());
                                jSONObject.putOpt("md5", nu.fs());
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.mw.zg.zmn hgd = nqiVar.hgd();
                            if (hgd != null) {
                                jSONObject.putOpt("url", hgd.zn());
                                jSONObject.putOpt("id", hgd.zmn());
                                jSONObject.putOpt("md5", hgd.fs());
                            }
                        }
                        jSONObject.put("ugen_status", str2);
                        jSONObject.put("from", str3);
                        jSONObject.put("ugen_scene", str4);
                        if (X3.g.e.equals(str2)) {
                            jSONObject.put("error_code", i);
                            jSONObject.put("error_msg", str5);
                        }
                        return jSONObject;
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if (X3.g.e.equals(str2)) {
                    }
                    return jSONObject;
                }
                if (str6.equals("ad")) {
                    c = 1;
                    if (c == 0) {
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if (X3.g.e.equals(str2)) {
                    }
                    return jSONObject;
                }
                c = 65535;
                if (c == 0) {
                }
                jSONObject.put("ugen_status", str2);
                jSONObject.put("from", str3);
                jSONObject.put("ugen_scene", str4);
                if (X3.g.e.equals(str2)) {
                }
                return jSONObject;
                jSONObject.put("error_code", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                jSONObject.put("error_msg", "send template error " + th.getMessage());
                return jSONObject;
            }
        });
    }

    private static boolean zmn(int i, String str) {
        int fs;
        try {
            Set<String> bmc = com.bytedance.sdk.openadsdk.core.settings.rc.fs().bmc();
            if ((i == 1 && bmc != null && bmc.contains(str)) || (fs = com.bytedance.sdk.openadsdk.core.settings.rc.fs().fs(str)) == 0) {
                return true;
            }
            if (fs != 100) {
                return ((int) ((Math.random() * 100.0d) + 1.0d)) > fs;
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public static JSONObject zmn(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void fb(nqi nqiVar, String str, final JSONObject jSONObject) {
        zmn(System.currentTimeMillis(), nqiVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.45
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                return jSONObject;
            }
        });
    }

    public static void btk(nqi nqiVar, String str, final JSONObject jSONObject) {
        zmn(System.currentTimeMillis(), nqiVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.46
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                return jSONObject;
            }
        });
    }

    public static void hhw(nqi nqiVar, String str, final JSONObject jSONObject) {
        zmn(System.currentTimeMillis(), nqiVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zn.47
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                return jSONObject;
            }
        });
    }
}
