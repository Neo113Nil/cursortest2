package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.yiw.pvs.icD;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdInfoFactory.java */
/* loaded from: classes2.dex */
public class icD {
    private static boolean pvs(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    public static Pair<com.bytedance.sdk.openadsdk.core.model.pvs, ArrayList<Integer>> pvs(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uc ucVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
        com.bytedance.sdk.openadsdk.core.model.icD icd2;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.model.pvs();
            pvsVar.pvs(jSONObject.optString("request_id"));
            pvsVar.pvs(jSONObject.optInt("ret"));
            int i = 0;
            pvsVar.icD(jSONObject.optInt("multi_ad_style", 0));
            pvsVar.icD(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String optString = jSONObject.optString("gdid_encrypted");
            if (jSONObject.has("choose_ui_data")) {
                pvsVar.pvs(jSONObject.optJSONObject("choose_ui_data"));
                pvsVar.pvs(true);
            }
            String optString2 = jSONObject.optString("auction_price");
            if (pvsVar.icD() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = pvsVar.qh() ? new ArrayList() : null;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    com.bytedance.sdk.openadsdk.core.model.cR pvs2 = pvs(optJSONArray.optJSONObject(i2), adSlot, ucVar);
                    if (pvs2 != null && pvsVar.qh()) {
                        if (pvs2.mnm() == 30) {
                            pvs2.Mxy(true);
                        } else {
                            pvsVar.icD(0);
                            arrayList2 = null;
                        }
                    }
                    int pvs3 = pvs(pvs2);
                    if (pvs3 != 200) {
                        if (pvs2 != null) {
                            com.bytedance.sdk.openadsdk.icD.vG.icD(pvs2, jlb.vG(pvs2.LDD()), pvs3);
                        } else {
                            com.bytedance.sdk.openadsdk.icD.vG.icD((com.bytedance.sdk.openadsdk.core.model.cR) null, "", pvs3);
                        }
                        arrayList.add(Integer.valueOf(pvs3));
                        if (arrayList2 != null && pvs2 != null) {
                            arrayList2.add(new pvs(pvs2.cQ(), pvs3));
                        }
                    } else {
                        pvs2.Mxy(optString2);
                        if (!TextUtils.isEmpty(optString)) {
                            pvs2.dX(optString);
                        }
                        pvsVar.pvs(pvs2);
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    pvs((ArrayList<pvs>) arrayList2);
                }
                icd2 = icd;
                i = length;
            } else {
                icd2 = icd;
            }
            pvs(i, pvsVar, (ArrayList<Integer>) arrayList, icd2);
            return new Pair<>(pvsVar, arrayList);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdInfoFactory", th.getMessage());
            return null;
        }
    }

    private static void pvs(int i, final com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, final ArrayList<Integer> arrayList, final com.bytedance.sdk.openadsdk.core.model.icD icd) {
        if (pvsVar == null || i < 2 || !pvsVar.yiw()) {
            return;
        }
        final int size = i - (pvsVar.vG() != null ? pvsVar.vG().size() : 0);
        final boolean z = pvsVar.so() == null;
        if (size > 0 || z) {
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.core.icD.1
                @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", com.bytedance.sdk.openadsdk.core.model.pvs.this.pvs());
                    jSONObject.put("material_error", size);
                    jSONObject.put("choose_ui_error", z ? 1 : 0);
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) arrayList).toString());
                    }
                    com.bytedance.sdk.openadsdk.core.model.icD icd2 = icd;
                    if (icd2 != null) {
                        jSONObject.put("server_res_str", icd2.pvs());
                    }
                    return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("choose_ad_parsing_error").icD(jSONObject.toString());
                }
            });
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.cR pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return pvs(jSONObject, (AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.uc) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x05d0, code lost:
    
        if (r13.optBoolean("is_html", false) != false) goto L147;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.bytedance.sdk.openadsdk.core.model.cR pvs(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uc ucVar) {
        com.bykv.vk.openvk.component.video.api.vG.icD icd;
        com.bykv.vk.openvk.component.video.api.vG.icD icd2;
        com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar;
        icD.pvs pvsVar2;
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.cR vG = com.bytedance.sdk.openadsdk.core.model.cR.vG();
        vG.zM(jSONObject.optInt("interaction_type"));
        vG.cR(jSONObject.optInt("is_arbitrage_sample", 0));
        vG.uc(jSONObject.optInt("is_arbitrage", 0));
        vG.rCZ(jSONObject.optInt("arbitrage_strategy", 0));
        vG.Ju(jSONObject.optString("target_url"));
        vG.cR(jSONObject.optString("ad_id"));
        vG.zM(jSONObject.optString("app_log_url"));
        vG.qh(jSONObject.optString(FirebaseAnalytics.Param.SOURCE));
        vG.kj(jSONObject.optString("app_name"));
        vG.dyT(jSONObject.optInt("dislike_control", 0));
        vG.Ju(jSONObject.optInt("play_bar_show_time", -200));
        vG.rCZ(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("set_click_type");
            vG.icD(optJSONObject2.optDouble("cta", 2.0d));
            vG.pvs(optJSONObject2.optDouble("other", 1.0d));
        }
        vG.Jd(jSONObject.optJSONObject("extension"));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("icon");
        vG.Jd(jSONObject.optBoolean("screenshot", false));
        vG.qh(jSONObject.optInt("play_bar_style", 0));
        vG.OT(jSONObject.optString("market_url", ""));
        vG.Mxy(jSONObject.optInt("video_adaptation", 0));
        vG.sUS(jSONObject.optInt("feed_video_opentype", 0));
        vG.icD(jSONObject.optJSONObject("session_params"));
        vG.Mxy(jSONObject.optString("auction_price", ""));
        vG.gA(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            vG.RGX();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("render");
        if (optJSONObject4 != null) {
            vG.yiw(optJSONObject4.optInt("render_sequence", 0));
            vG.so(optJSONObject4.optInt("backup_render_control", 1));
            vG.jlb(optJSONObject4.optInt("reserve_time", 100));
            vG.dx(optJSONObject4.optInt("render_thread", 0));
        }
        vG.Jd(jSONObject.optInt("render_control", ucVar != null ? ucVar.so : 1));
        if (optJSONObject3 != null) {
            com.bytedance.sdk.openadsdk.core.model.bNS bns = new com.bytedance.sdk.openadsdk.core.model.bNS();
            bns.pvs(optJSONObject3.optString(ImagesContract.URL));
            bns.icD(optJSONObject3.optInt("height"));
            bns.pvs(optJSONObject3.optInt("width"));
            vG.pvs(bns);
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject5 != null) {
            vG.vG(optJSONObject5.optInt("reward_amount", 0));
            vG.yiw(optJSONObject5.optString("reward_name", ""));
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject6 != null) {
            com.bytedance.sdk.openadsdk.core.model.bNS bns2 = new com.bytedance.sdk.openadsdk.core.model.bNS();
            bns2.pvs(optJSONObject6.optString(ImagesContract.URL));
            bns2.icD(optJSONObject6.optInt("height"));
            bns2.pvs(optJSONObject6.optInt("width"));
            vG.icD(bns2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.bytedance.sdk.openadsdk.core.model.bNS bns3 = new com.bytedance.sdk.openadsdk.core.model.bNS();
                JSONObject optJSONObject7 = optJSONArray.optJSONObject(i);
                bns3.pvs(optJSONObject7.optString(ImagesContract.URL));
                bns3.icD(optJSONObject7.optInt("height"));
                bns3.pvs(optJSONObject7.optInt("width"));
                bns3.pvs(optJSONObject7.optBoolean("image_preview"));
                bns3.icD(optJSONObject7.optString("image_key"));
                vG.vG(bns3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                vG.OyE().add(optJSONArray2.optString(i2));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("click_url");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                vG.joF().add(optJSONArray3.optString(i3));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                vG.thO().add(optJSONArray4.optString(i4));
            }
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("click_area");
        if (optJSONObject8 != null) {
            com.bytedance.sdk.openadsdk.core.model.Mxy mxy = new com.bytedance.sdk.openadsdk.core.model.Mxy();
            mxy.pvs = optJSONObject8.optBoolean("click_upper_content_area", true);
            mxy.icD = optJSONObject8.optBoolean("click_upper_non_content_area", true);
            mxy.vG = optJSONObject8.optBoolean("click_lower_content_area", true);
            mxy.Jd = optJSONObject8.optBoolean("click_lower_non_content_area", true);
            mxy.NB = optJSONObject8.optBoolean("click_button_area", true);
            mxy.sUS = optJSONObject8.optBoolean("click_video_area", true);
            vG.pvs(mxy);
        }
        JSONObject optJSONObject9 = jSONObject.optJSONObject("adslot");
        if (optJSONObject9 != null) {
            vG.pvs(Jd(optJSONObject9));
        } else {
            vG.pvs(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey("admob_watermark")) {
                vG.CvL(String.valueOf(requestExtraMap.get("admob_watermark")));
            }
        } else {
            vG.CvL(jSONObject.optString("identificationOverlayContent"));
        }
        vG.kj(jSONObject.optInt("intercept_flag", 0));
        vG.IP(jSONObject.optString("phone_num"));
        vG.bNS(jSONObject.optString(LinkHeader.Parameters.Title));
        vG.mnm(jSONObject.optString("description"));
        vG.vA(jSONObject.optString("button_text"));
        vG.Wyp(jSONObject.optInt("ad_logo", 1));
        vG.uc(jSONObject.optString("ext"));
        vG.mnm(jSONObject.optInt("cover_click_area", 0));
        vG.OT(jSONObject.optInt("image_mode"));
        vG.ZhG(jSONObject.optInt("orientation", 1));
        vG.pvs((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        vG.mnm(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject10 = jSONObject.optJSONObject("app");
        JSONObject optJSONObject11 = jSONObject.optJSONObject("deep_link");
        vG.pvs(sUS(optJSONObject10));
        JSONObject optJSONObject12 = jSONObject.optJSONObject("interaction_method_params");
        vG.pvs(so(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        vG.pvs(yiw(optJSONObject12));
        vG.pvs(Wyp(optJSONObject11));
        vG.pvs(new com.bytedance.sdk.openadsdk.core.model.rCZ(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                FilterWord NB = NB(optJSONArray5.optJSONObject(i5));
                if (NB != null && NB.isValid()) {
                    vG.pvs(NB);
                }
            }
        }
        vG.ny(jSONObject.optInt("count_down"));
        vG.icD(jSONObject.optLong("expiration_time"));
        vG.gSd(jSONObject.optInt("video_encode_type", 0));
        vG.sP(0);
        JSONObject optJSONObject13 = jSONObject.optJSONObject("video");
        if (optJSONObject13 != null) {
            icd = pvs(optJSONObject13, vG, true);
            vG.icD(icd);
            vG.SE(optJSONObject13.optInt("multi_played_percent", 50));
        } else {
            icd = null;
        }
        JSONObject optJSONObject14 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject14 != null) {
            icd2 = pvs(optJSONObject14, vG, false);
            vG.vG(icd2);
        } else {
            icd2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || vG.wr() == 0) {
            vG.pvs(icd);
            vG.gSd(0);
        } else {
            if (icd2 != null && icd != null) {
                if (TextUtils.isEmpty(icd2.kj())) {
                    icd2.Jd(icd.kj());
                }
                if (TextUtils.isEmpty(icd2.Ju())) {
                    icd2.NB(icd.Ju());
                }
                if (icd2.Jd() == -1) {
                    icd2.Jd(icd.Jd());
                }
            }
            if (icd2 != null) {
                vG.pvs(icd2);
            } else {
                vG.pvs(icd);
            }
        }
        JSONObject optJSONObject15 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject15 != null) {
            vG.pvs(Mxy(optJSONObject15));
        }
        vG.pvs(qh(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject16 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject16 != null) {
            cR.pvs pvsVar3 = new cR.pvs();
            pvsVar3.icD(optJSONObject16.optString(FacebookMediationAdapter.KEY_ID));
            pvsVar3.vG(optJSONObject16.optString("md5"));
            pvsVar3.Jd(optJSONObject16.optString(ImagesContract.URL));
            pvsVar3.NB(optJSONObject16.optString("data"));
            pvsVar3.sUS(optJSONObject16.optString("diff_data"));
            String optString = optJSONObject16.optString("dynamic_creative");
            pvsVar3.yiw(optString);
            pvsVar3.pvs(optJSONObject16.optString("version"));
            pvsVar3.so(optJSONObject16.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray6 = new JSONObject(optString).optJSONArray("tag_ids");
                if (optJSONArray6 != null) {
                    for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                        arrayList.add(Integer.valueOf(optJSONArray6.optInt(i6)));
                    }
                }
                pvsVar3.pvs(arrayList);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AdInfoFactory", e.getMessage());
            }
            pvsVar3.Mxy(optJSONObject16.optString("engine_version"));
            pvsVar3.Wyp(optJSONObject16.optString("ugen_url"));
            pvsVar3.qh(optJSONObject16.optString("ugen_md5"));
            pvsVar3.kj(optJSONObject16.optString("ugen_data"));
            vG.pvs(pvsVar3);
        }
        vG.Wyp(jSONObject.optString("creative_extra"));
        vG.NB(jSONObject.optInt("if_block_lp", 0));
        vG.IP(jSONObject.optInt("cache_sort", 1));
        vG.bNS(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject17 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject17 != null) {
            vG.pvs(vG(optJSONObject17));
        }
        vG.dX(jSONObject.optInt("is_package_open", 1));
        vG.so(jSONObject.optString("ad_info", null));
        int i7 = 2;
        vG.vA(jSONObject.optInt("ua_policy", 2));
        vG.CvL(jSONObject.optInt("playable_duration_time", 20));
        vG.Gp(jSONObject.optInt("playable_endcard_close_time", -1));
        vG.ae(jSONObject.optInt("endcard_close_time", -1));
        vG.pvs(jSONObject.optInt("interaction_method"));
        vG.ny(jSONObject.optString("dsp_html"));
        vG.yWX(jSONObject.optInt("image_stay", 0));
        JSONObject optJSONObject18 = jSONObject.optJSONObject("loading_page");
        if (optJSONObject18 != null) {
            vG.Pj(optJSONObject18.optInt("loading_landingpage_type", 0));
            JSONArray optJSONArray7 = optJSONObject18.optJSONArray("landingpage_text");
            if (optJSONArray7 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < optJSONArray7.length(); i8++) {
                    String optString2 = optJSONArray7.optString(i8);
                    if (!TextUtils.isEmpty(optString2)) {
                        arrayList2.add(optString2);
                    }
                }
                vG.pvs((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        int optInt = jSONObject.optInt("dsp_material_type", 0);
        if (optInt < 0 || optInt > 3) {
            optInt = 0;
        }
        if (optInt == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                optInt = 1;
            }
        }
        i7 = optInt;
        vG.od(i7);
        if (i7 == 1 || i7 == 3) {
            int LDD = vG.LDD();
            if (LDD < 0) {
                if (vG.jlb() != null) {
                    LDD = vG.jlb().getDurationSlotType();
                } else {
                    LDD = vG.VLm();
                }
            }
            String vG2 = jlb.vG(LDD);
            if (jSONObject.has("vast_json")) {
                pvsVar = com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs(jSONObject.optJSONObject("vast_json"));
            } else {
                String optString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString3)) {
                    pvs(vG, vG2);
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Pair<com.bytedance.sdk.openadsdk.core.yiw.pvs, icD.pvs> pvs2 = pvs(optString3, vG.rcB(), LDD);
                if (pvs2 != null) {
                    com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar4 = (com.bytedance.sdk.openadsdk.core.yiw.pvs) pvs2.first;
                    pvsVar2 = (icD.pvs) pvs2.second;
                    pvsVar = pvsVar4;
                } else {
                    pvsVar = null;
                    pvsVar2 = null;
                }
                pvs(vG, vG2, pvsVar, currentTimeMillis, pvsVar2);
            }
            if (pvsVar != null) {
                pvsVar.sUS(vG2);
            }
            if (pvsVar == null) {
                return null;
            }
            pvs(pvsVar, vG);
        }
        vG.ZhG(jSONObject.optString("deep_link_appname", ""));
        vG.qD(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject optJSONObject19 = jSONObject.optJSONObject("dsp_style");
        if (optJSONObject19 != null) {
            vG.pvs(new com.bytedance.sdk.openadsdk.core.model.Ju(optJSONObject19));
        }
        JSONObject optJSONObject20 = jSONObject.optJSONObject("dsp_adchoices");
        if (optJSONObject20 != null) {
            vG.NB(optJSONObject20.optString("adchoices_icon", ""));
            vG.sUS(optJSONObject20.optString("adchoices_url", ""));
        }
        String optString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(optString4)) {
            vG.dX(optString4);
        }
        int optInt2 = jSONObject.optInt("jump_probability", 0);
        if (optInt2 < 0 || optInt2 > 100) {
            optInt2 = 0;
        }
        vG.OhP(optInt2);
        vG.Es();
        JSONObject optJSONObject21 = jSONObject.optJSONObject("ugen");
        if (optJSONObject21 != null && (optJSONObject = optJSONObject21.optJSONObject("endcard")) != null) {
            vG.pvs(icD(optJSONObject));
            JSONObject optJSONObject22 = optJSONObject.optJSONObject("overlay");
            if (optJSONObject22 != null) {
                vG.icD(icD(optJSONObject22));
            }
        }
        vG.jhZ(jSONObject.optInt("preload_h5_type", 0));
        vG.so(jSONObject.optBoolean("hasReportShow", false));
        vG.Gp(jSONObject.optString("endcard_creative", ""));
        return vG;
    }

    private static com.bytedance.sdk.openadsdk.core.ugen.NB.pvs icD(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.ugen.NB.pvs();
        pvsVar.pvs(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
        pvsVar.icD(jSONObject.optString("md5"));
        pvsVar.vG(jSONObject.optString(ImagesContract.URL));
        return pvsVar;
    }

    private static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void pvs(final com.bytedance.sdk.openadsdk.core.model.cR cRVar, final String str, final com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar, final long j, final icD.pvs pvsVar2) {
        com.bytedance.sdk.openadsdk.icD.vG.pvs(new com.bytedance.sdk.component.so.so("vast_parser") { // from class: com.bytedance.sdk.openadsdk.core.icD.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar3 = pvsVar;
                    String str2 = "load_vast_fail";
                    if (pvsVar3 != null) {
                        if (!TextUtils.isEmpty(pvsVar3.Mxy()) && !TextUtils.isEmpty(pvsVar.sUS()) && pvsVar.so() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            jSONObject.put(TypedValues.TransitionType.S_DURATION, System.currentTimeMillis() - j);
                            icD.pvs pvsVar4 = pvsVar2;
                            if (pvsVar4 != null) {
                                jSONObject.put("wrapper_count", pvsVar4.icD);
                                jSONObject.put("impression_links_null", pvsVar2.vG);
                            }
                            str2 = "load_vast_success";
                        }
                        jSONObject.put("reason_code", -3);
                        jSONObject.put("error_code", -3);
                    } else {
                        jSONObject.put("reason_code", -2);
                        icD.pvs pvsVar5 = pvsVar2;
                        if (pvsVar5 != null) {
                            jSONObject.put("error_code", pvsVar5.pvs);
                        }
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar6 = pvsVar;
                    if (pvsVar6 == null || pvsVar6.icD() == null || !TextUtils.isEmpty(pvsVar.icD().sUS())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, str, "load_vast_icon_fail", jSONObject2);
                    pvsVar.pvs((com.bytedance.sdk.openadsdk.core.yiw.icD) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.yiw.pvs, icD.pvs> pvs(String str, int i, int i2) {
        int i3;
        int i4;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2 == 1 || i2 == 5) {
            i3 = 0;
            i4 = 0;
        } else {
            i3 = Pj.vG(mnm.pvs());
            i4 = Pj.Jd(mnm.pvs());
            if (i == 2) {
                i4 = i3;
                i3 = i4;
            }
        }
        com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.NB nb = new com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.NB(mnm.pvs(), i3, i4);
        return new Pair<>(nb.pvs(str, new ArrayList()), nb.sUS);
    }

    private static void pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        pvsVar.pvs(cRVar);
        if (!pvs(cRVar.jhZ())) {
            cRVar.zM(2);
        }
        cRVar.Jd(1);
        cRVar.pvs(pvsVar);
        if (!TextUtils.isEmpty(pvsVar.Jd())) {
            cRVar.bNS(pvsVar.Jd());
        }
        if (!TextUtils.isEmpty(pvsVar.NB())) {
            cRVar.mnm(pvsVar.NB());
        }
        cRVar.Ju(pvsVar.sUS());
        cRVar.pvs((com.bytedance.sdk.openadsdk.core.model.vG) null);
        com.bykv.vk.openvk.component.video.api.vG.icD od = cRVar.od();
        if (od == null) {
            od = new com.bykv.vk.openvk.component.video.api.vG.icD();
        }
        od.vG(pvsVar.yiw());
        od.pvs(pvsVar.so());
        od.sUS((String) null);
        od.icD((String) null);
        od.Jd((String) null);
        cRVar.pvs(od);
        if (pvsVar.icD() != null && !TextUtils.isEmpty(pvsVar.icD().NB())) {
            com.bytedance.sdk.openadsdk.core.model.bNS bns = new com.bytedance.sdk.openadsdk.core.model.bNS();
            bns.pvs(pvsVar.icD().NB());
            bns.pvs(pvsVar.icD().icD());
            bns.icD(pvsVar.icD().vG());
            cRVar.pvs(bns);
            return;
        }
        if (cRVar.ea() == null) {
            com.bytedance.sdk.openadsdk.core.model.bNS bns2 = new com.bytedance.sdk.openadsdk.core.model.bNS();
            bns2.pvs("https://sf16-fe-tos-sg.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/2023620white.jpeg");
            bns2.pvs(98);
            bns2.icD(98);
            cRVar.pvs(bns2);
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.Jd vG(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        long optLong = jSONObject.optLong("load_wait_time", 0L);
        long j = optLong >= 0 ? optLong : 0L;
        com.bytedance.sdk.openadsdk.core.model.Jd jd = new com.bytedance.sdk.openadsdk.core.model.Jd();
        jd.pvs(optInt);
        jd.icD(optInt2);
        jd.pvs(j);
        return jd;
    }

    private static AdSlot Jd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mCodeId", "");
        int optInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float optDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        float optDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        int optInt3 = jSONObject.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject.optString("mRewardName", "");
        int optInt4 = jSONObject.optInt("mRewardAmount", 0);
        String optString3 = jSONObject.optString("mMediaExtra", "");
        String optString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int optInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean optBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String optString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize(optDouble, optDouble2).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(optBoolean2).isExpressAd(optBoolean3).withBid(optString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static FilterWord NB(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord NB = NB(optJSONArray.optJSONObject(i));
                    if (NB != null && NB.isValid()) {
                        filterWord.addOption(NB);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.vG sUS(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.vG vGVar = new com.bytedance.sdk.openadsdk.core.model.vG();
        vGVar.icD(jSONObject.optString("app_name"));
        vGVar.vG(jSONObject.optString("package_name"));
        vGVar.pvs(jSONObject.optString("download_url"));
        vGVar.pvs(jSONObject.optDouble(FirebaseAnalytics.Param.SCORE, -1.0d));
        vGVar.pvs(jSONObject.optInt("comment_num", -1));
        vGVar.icD(jSONObject.optInt("app_size", 0));
        vGVar.Jd(jSONObject.optString("app_category"));
        return vGVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.vA yiw(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.vA vAVar = new com.bytedance.sdk.openadsdk.core.model.vA();
        if (jSONObject == null) {
            vAVar.pvs(10L);
            vAVar.icD(20L);
            vAVar.vG(10L);
            vAVar.Jd(20L);
            vAVar.pvs("");
            return vAVar;
        }
        vAVar.pvs(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        vAVar.icD(jSONObject.optLong("straight_lp_showtime", 20L));
        vAVar.vG(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        vAVar.Jd(jSONObject.optLong("straight_agg_showtime", 20L));
        vAVar.pvs(jSONObject.optString("loading_text", ""));
        return vAVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.NB so(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.NB nb = new com.bytedance.sdk.openadsdk.core.model.NB();
        if (jSONObject == null) {
            nb.pvs(0);
            nb.icD(0);
            nb.icD(new ArrayList());
            nb.vG(0);
            nb.pvs(new ArrayList());
            return nb;
        }
        nb.pvs(jSONObject.optInt("interceptor_x", 0));
        nb.icD(jSONObject.optInt("interceptor_y", 0));
        JSONArray optJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
            }
        }
        nb.icD(arrayList);
        nb.vG(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(optJSONArray2.optString(i2));
            }
        }
        nb.pvs(arrayList2);
        return nb;
    }

    private static com.bytedance.sdk.openadsdk.core.model.kj Mxy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.kj kjVar = new com.bytedance.sdk.openadsdk.core.model.kj();
        kjVar.pvs(jSONObject.optInt("if_send_click", 0));
        return kjVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.qh Wyp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.qh qhVar = new com.bytedance.sdk.openadsdk.core.model.qh();
        qhVar.pvs(jSONObject.optString("deeplink_url"));
        qhVar.icD(jSONObject.optString("fallback_url"));
        qhVar.pvs(jSONObject.optInt("fallback_type"));
        return qhVar;
    }

    private static com.bykv.vk.openvk.component.video.api.vG.icD pvs(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.cR cRVar, boolean z) {
        int optInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.component.video.api.vG.icD icd = new com.bykv.vk.openvk.component.video.api.vG.icD();
        icd.icD(jSONObject.optInt("cover_height"));
        icd.vG(jSONObject.optInt("cover_width"));
        icd.pvs(jSONObject.optString("resolution"));
        icd.pvs(jSONObject.optLong(ContentDisposition.Parameters.Size));
        double optDouble = jSONObject.optDouble("video_duration", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        icd.pvs(optDouble);
        int i = 1;
        int optInt2 = jSONObject.optInt("replay_time", 1);
        if (optDouble <= 15.0d && cRVar.OT() != 1 && com.bytedance.sdk.openadsdk.core.model.cR.NB(cRVar)) {
            i = optInt2;
        }
        icd.Wyp(i);
        icd.icD(jSONObject.optString("cover_url"));
        icd.vG(jSONObject.optString("video_url"));
        icd.Jd(jSONObject.optString("endcard"));
        icd.NB(jSONObject.optString("playable_download_url"));
        icd.sUS(jSONObject.optString("file_hash"));
        icd.so(jSONObject.optInt("if_playable_loading_show", 0));
        icd.Mxy(jSONObject.optInt("remove_loading_page_type", 0));
        icd.pvs(jSONObject.optInt("fallback_endcard_judge", 0));
        icd.NB(jSONObject.optInt("video_preload_size", 307200));
        icd.sUS(jSONObject.optInt("reward_video_cached_type", 0));
        icd.yiw(jSONObject.optInt("execute_cached_type", 0));
        if (z) {
            optInt = jSONObject.optInt("endcard_render", 0);
        } else {
            optInt = jSONObject.optInt("endcard_render", -1);
        }
        icd.Jd(optInt);
        return icd;
    }

    private static Map<String, Object> qh(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r0 != 50) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (cRVar == null) {
            com.bytedance.sdk.openadsdk.icD.vG.vG((com.bytedance.sdk.openadsdk.core.model.cR) null, "", 401);
            return 401;
        }
        String vG = jlb.vG(cRVar.LDD());
        if (TextUtils.isEmpty(cRVar.neB()) || cRVar.neB().length() <= 1) {
            com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, 402);
            return 402;
        }
        if (cRVar.Mnp()) {
            if (cRVar.LDD() < 0) {
                if (cRVar.jlb() != null) {
                    cRVar.jlb().getDurationSlotType();
                } else {
                    cRVar.VLm();
                }
            }
            if (cRVar.OBt()) {
                vG = "fullscreen_interstitial_ad";
            }
            if (TextUtils.isEmpty(cRVar.Tdd())) {
                com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, vG, "load_html_fail", (JSONObject) null);
                return 401;
            }
            com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, vG, "load_html_success", (JSONObject) null);
        }
        if (cRVar.xyK() == 0) {
            int Ye = cRVar.Ye();
            if (Ye != 2 && Ye != 3 && Ye != 4) {
                if (Ye != 5 && Ye != 15) {
                    if (Ye != 16) {
                    }
                }
                int pvs2 = pvs(cRVar.od(), cRVar.SJ());
                if (pvs2 != 200) {
                    com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, pvs2);
                    return pvs2;
                }
            }
            int pvs3 = pvs(cRVar.BSi());
            if (pvs3 != 200) {
                com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, pvs3);
                return pvs3;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().ABo()) {
            return vG(cRVar);
        }
        return icD(cRVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r3 != 8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int icD(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        int i;
        String vG = jlb.vG(cRVar.LDD());
        if (cRVar.xyK() == 0) {
            i = pvs(cRVar.Zm());
            com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, i);
        } else {
            i = 200;
        }
        int jhZ = cRVar.jhZ();
        if (jhZ != 2 && jhZ != 3) {
            if (jhZ == 4) {
                com.bytedance.sdk.openadsdk.core.model.vG Ca = cRVar.Ca();
                if (Ca == null) {
                    com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, TTAdConstant.DOWNLOAD_APP_INFO_CODE);
                    i = 407;
                } else if (TextUtils.isEmpty(Ca.vG()) && TextUtils.isEmpty(Ca.pvs())) {
                    com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                    i = 417;
                } else if (TextUtils.isEmpty(Ca.vG())) {
                    i = 416;
                    com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, 416);
                } else if (TextUtils.isEmpty(Ca.pvs())) {
                    i = TTAdConstant.DOWNLOAD_URL_CODE;
                    com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, TTAdConstant.DOWNLOAD_URL_CODE);
                }
            }
            if (i != 417 || i == 407 || i == 406) {
                return i;
            }
            if (i != 200) {
                com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, vG, i);
            }
            return 200;
        }
        if (Jd(cRVar) && TextUtils.isEmpty(cRVar.CjQ())) {
            com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, TTAdConstant.LANDING_PAGE_TYPE_CODE);
            i = 406;
        }
        if (i != 417) {
        }
        return i;
    }

    private static int vG(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        int i;
        String vG = jlb.vG(cRVar.LDD());
        if (cRVar.xyK() == 0) {
            i = pvs(cRVar.Zm());
            if (i != 200) {
                com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, i);
                return i;
            }
        } else {
            i = 200;
        }
        int jhZ = cRVar.jhZ();
        if (jhZ != 2 && jhZ != 3) {
            if (jhZ == 4) {
                int pvs2 = pvs(cRVar.Ca());
                if (pvs2 == 200) {
                    return pvs2;
                }
                com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, pvs2);
                return pvs2;
            }
            if (jhZ != 8) {
                return i;
            }
        }
        if (!Jd(cRVar) || !TextUtils.isEmpty(cRVar.CjQ())) {
            return i;
        }
        com.bytedance.sdk.openadsdk.icD.vG.vG(cRVar, vG, TTAdConstant.LANDING_PAGE_TYPE_CODE);
        return TTAdConstant.LANDING_PAGE_TYPE_CODE;
    }

    private static boolean Jd(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        return (cRVar.SJ() || cRVar.Mnp()) ? false : true;
    }

    private static int pvs(com.bytedance.sdk.openadsdk.core.model.qh qhVar) {
        if (qhVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(qhVar.pvs())) {
            return 403;
        }
        if (TextUtils.isEmpty(qhVar.icD())) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (qhVar.vG() == 1 || qhVar.vG() == 2) {
            return 200;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    private static int pvs(com.bykv.vk.openvk.component.video.api.vG.icD icd, boolean z) {
        if (icd == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(icd.qh())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(icd.Wyp())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int pvs(com.bytedance.sdk.openadsdk.core.model.vG vGVar) {
        return vGVar == null ? TTAdConstant.DOWNLOAD_APP_INFO_CODE : TextUtils.isEmpty(vGVar.pvs()) ? TTAdConstant.DOWNLOAD_URL_CODE : TextUtils.isEmpty(vGVar.vG()) ? 416 : 200;
    }

    private static int pvs(List<com.bytedance.sdk.openadsdk.core.model.bNS> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.bNS bns : list) {
            if (bns == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(bns.pvs())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void pvs(final ArrayList<pvs> arrayList) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.core.icD.3
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pvs pvsVar = (pvs) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cid", pvsVar.pvs);
                    jSONObject2.put("error_msg", pvsVar.icD);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("multiple_ads_parsing_error").icD(jSONObject.toString());
            }
        });
    }

    /* compiled from: AdInfoFactory.java */
    private static class pvs {
        public int icD;
        public String pvs;

        public pvs(String str, int i) {
            this.pvs = str;
            this.icD = i;
        }
    }
}
