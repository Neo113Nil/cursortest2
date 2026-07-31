package com.bytedance.sdk.openadsdk.core;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.zmn.fs;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fs {
    private static boolean zmn(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Nullable
    public static Pair<com.bytedance.sdk.openadsdk.core.model.zmn, ArrayList<Integer>> zmn(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.model.zmn();
            zmnVar.zmn(jSONObject.optString("request_id"));
            zmnVar.zmn(jSONObject.optInt("ret"));
            zmnVar.fs(jSONObject.optInt("multi_ad_style", 0));
            zmnVar.fs(jSONObject.optString("message"));
            String optString = jSONObject.optString("gdid_encrypted");
            zmnVar.zmn(com.bytedance.sdk.openadsdk.core.model.doe.zmn(jSONObject.optJSONObject("loop_config")));
            String optString2 = jSONObject.optString("auction_price");
            if (zmnVar.fb() != 0) {
                return null;
            }
            zmnVar.zmn(com.bytedance.sdk.openadsdk.core.model.bjh.zmn(jSONObject.optString("multi_ad_config")));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                optJSONArray.length();
                int i = 0;
                ArrayList arrayList2 = zmnVar.bvs() ? new ArrayList() : null;
                while (i < optJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.nqi zmn2 = zmn(optJSONArray.optJSONObject(i), adSlot, kjbVar, zmnVar, i);
                    ?? r9 = arrayList2;
                    if (!zmnVar.bvs()) {
                        r9 = nqiVar;
                    }
                    int zmn3 = zmn(zmn2);
                    if (zmn3 != 200) {
                        if (zmn2 != null) {
                            com.bytedance.sdk.openadsdk.fb.zn.fs(zmn2, com.bytedance.sdk.openadsdk.utils.oub.zn(zmn2.sft()), zmn3);
                        } else {
                            com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, "", zmn3);
                        }
                        arrayList.add(Integer.valueOf(zmn3));
                        if (r9 != 0 && zmn2 != null) {
                            r9.add(new zmn(zmn2.gn(), zmn3));
                        }
                        if (zmn2 != null && (zmn2.cd() == 39 || zmn2.cd() == 41)) {
                            zmnVar.fs(0);
                        }
                        optJSONArray.remove(i);
                        i--;
                    } else {
                        zmn2.rt(optString2);
                        if (!TextUtils.isEmpty(optString)) {
                            zmn2.bvs(optString);
                        }
                        zmnVar.zmn(zmn2);
                    }
                    i++;
                    nqiVar = null;
                    arrayList2 = r9;
                }
                List<com.bytedance.sdk.openadsdk.core.model.nqi> btk = zmnVar.btk();
                zmn(btk, zmnVar);
                if (btk != null) {
                    if (zmnVar.bvs() && btk.size() == 1) {
                        zmnVar.fs(0);
                        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = btk.get(0);
                        if (nqiVar2 != null) {
                            nqiVar2.rc(false);
                        }
                    }
                    int size = btk.size();
                    jSONObject.put("creatives", optJSONArray);
                    for (int i2 = 0; i2 < size; i2++) {
                        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar3 = btk.get(i2);
                        if (nqiVar3 != null) {
                            if (i2 > 0) {
                                nqiVar3.xl();
                            }
                            nqiVar3.tf(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    zmn((ArrayList<zmn>) arrayList2);
                }
            }
            return new Pair<>(zmnVar, arrayList);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.AdInfoFactory", th.getMessage());
            return null;
        }
    }

    private static void zmn(List<com.bytedance.sdk.openadsdk.core.model.nqi> list, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = list.get(0);
        if (!zmnVar.bvs() || nqiVar == null || !nqiVar.sv() || com.bytedance.sdk.openadsdk.utils.oub.so() == 0) {
            return;
        }
        zmnVar.fs(0);
        nqiVar.rc(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x06dc, code lost:
    
        if (r16.optBoolean("is_html", false) != false) goto L183;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.sdk.openadsdk.core.model.nqi zmn(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, int i) {
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar;
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar2;
        com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar2;
        fs.zmn zmnVar3;
        com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar4;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = new com.bytedance.sdk.openadsdk.core.model.nqi();
        if (zmnVar != null) {
            nqiVar.zmn(zmnVar);
            if (zmnVar.bvs()) {
                int optInt = jSONObject.optInt("interaction_method");
                if (optInt == 30 || optInt == 39 || optInt == 40 || optInt == 41 || optInt == 43 || optInt == 44) {
                    nqiVar.rc(true);
                } else {
                    zmnVar.fs(0);
                    nqiVar.rc(false);
                }
            }
        }
        nqiVar.zmn(i);
        zmn(jSONObject, nqiVar);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (optJSONObject4 != null) {
            nqiVar.zmn(com.bytedance.sdk.openadsdk.core.model.rp.zmn(optJSONObject4));
        }
        if (jSONObject.has("raw_response_info")) {
            nqiVar.tf(jSONObject.optString("raw_response_info"));
        }
        nqiVar.cn(jSONObject.optInt("proportion_watching", -1));
        nqiVar.olo(jSONObject.optBoolean("mate_disable_cache", false));
        nqiVar.so(jSONObject.optInt("interaction_type"));
        nqiVar.yj(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.nqi.zn, 0));
        nqiVar.ev(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.nqi.fs, 0));
        nqiVar.tf(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.nqi.fb, 0));
        nqiVar.kgc(jSONObject.optString("target_url"));
        nqiVar.nqi(jSONObject.optString(CreativeInfo.c));
        nqiVar.uqh(jSONObject.optString("app_log_url"));
        nqiVar.bjh(jSONObject.optString("settings_url"));
        nqiVar.cyb(jSONObject.optString("source"));
        nqiVar.olo(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        nqiVar.ww(jSONObject.optInt("dislike_control", 0));
        nqiVar.bjh(jSONObject.optInt("play_bar_show_time", -200));
        nqiVar.kjb(jSONObject.optString("gecko_id"));
        nqiVar.fs(jSONObject.optInt("lp_cache_count", 0));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject5 = jSONObject.optJSONObject("set_click_type");
            nqiVar.fs(optJSONObject5.optDouble("cta", 2.0d));
            nqiVar.zmn(optJSONObject5.optDouble("other", 1.0d));
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject(ShareConstants.MEDIA_EXTENSION);
        nqiVar.hhw(optJSONObject6);
        if (optJSONObject6 != null) {
            nqiVar.zmn(new com.bytedance.sdk.openadsdk.core.model.olo(optJSONObject6));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("icon");
        nqiVar.klz(jSONObject.optBoolean("screenshot", false));
        nqiVar.nqi(jSONObject.optInt("play_bar_style", 0));
        nqiVar.zak(jSONObject.optString("market_url", ""));
        nqiVar.phc(jSONObject.optInt("video_adaptation", 0));
        nqiVar.kgc(jSONObject.optInt("feed_video_opentype", 0));
        nqiVar.zn(jSONObject.optJSONObject("session_params"));
        JSONObject optJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        nqiVar.fb(optJSONObject8);
        if (optJSONObject8 != null && (optJSONObject3 = optJSONObject8.optJSONObject("speed_config")) != null) {
            com.bytedance.sdk.openadsdk.core.model.yj yjVar = new com.bytedance.sdk.openadsdk.core.model.yj();
            yjVar.zmn((float) optJSONObject3.optDouble("speed", 1.0d));
            yjVar.zmn(optJSONObject3.optInt("type", 0));
            nqiVar.zmn(yjVar);
        }
        nqiVar.rt(jSONObject.optString("auction_price", ""));
        nqiVar.cud(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            nqiVar.xt();
        }
        JSONObject optJSONObject9 = jSONObject.optJSONObject("render");
        if (optJSONObject9 != null) {
            nqiVar.kw(optJSONObject9.optInt("render_sequence", 0));
            nqiVar.iqz(optJSONObject9.optInt("backup_render_control", 1));
            nqiVar.gn(optJSONObject9.optInt("reserve_time", 100));
            nqiVar.uqd(optJSONObject9.optInt("render_thread", 0));
        }
        nqiVar.cyb(jSONObject.optInt("render_control", kjbVar != null ? kjbVar.bvs : 1));
        if (optJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.model.kgc kgcVar = new com.bytedance.sdk.openadsdk.core.model.kgc();
            kgcVar.zmn(optJSONObject7.optString("url"));
            kgcVar.fs(optJSONObject7.optInt("height"));
            kgcVar.zmn(optJSONObject7.optInt("width"));
            nqiVar.zmn(kgcVar);
        }
        JSONObject optJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject10 != null) {
            nqiVar.rt(optJSONObject10.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            nqiVar.klz(optJSONObject10.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject optJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject11 != null) {
            com.bytedance.sdk.openadsdk.core.model.kgc kgcVar2 = new com.bytedance.sdk.openadsdk.core.model.kgc();
            kgcVar2.zmn(optJSONObject11.optString("url"));
            kgcVar2.fs(optJSONObject11.optInt("height"));
            kgcVar2.zmn(optJSONObject11.optInt("width"));
            nqiVar.fs(kgcVar2);
        }
        if (jSONObject.has("banner") && (optJSONObject2 = jSONObject.optJSONObject("banner")) != null) {
            nqiVar.zmn(new PAGBannerSize(optJSONObject2.optInt("width", 0), optJSONObject2.optInt("height", 0)));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.kgc kgcVar3 = new com.bytedance.sdk.openadsdk.core.model.kgc();
                JSONObject optJSONObject12 = optJSONArray.optJSONObject(i2);
                kgcVar3.zmn(optJSONObject12.optString("url"));
                kgcVar3.fs(optJSONObject12.optInt("height"));
                kgcVar3.zmn(optJSONObject12.optInt("width"));
                kgcVar3.zmn(optJSONObject12.optBoolean("image_preview"));
                kgcVar3.fs(optJSONObject12.optString("image_key"));
                nqiVar.zn(kgcVar3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                nqiVar.vgx().add(optJSONArray2.optString(i3));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("click_url");
        if (optJSONArray3 != null) {
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                nqiVar.hz().add(optJSONArray3.optString(i4));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                nqiVar.sl().add(optJSONArray4.optString(i5));
            }
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("click_area");
        if (optJSONObject13 != null) {
            com.bytedance.sdk.openadsdk.core.model.rc rcVar = new com.bytedance.sdk.openadsdk.core.model.rc();
            rcVar.zmn = optJSONObject13.optBoolean("click_upper_content_area", true);
            rcVar.fs = optJSONObject13.optBoolean("click_upper_non_content_area", true);
            rcVar.zn = optJSONObject13.optBoolean("click_lower_content_area", true);
            rcVar.fb = optJSONObject13.optBoolean("click_lower_non_content_area", true);
            rcVar.btk = optJSONObject13.optBoolean("click_button_area", true);
            rcVar.hhw = optJSONObject13.optBoolean("click_video_area", true);
            nqiVar.zmn(rcVar);
        }
        JSONObject optJSONObject14 = jSONObject.optJSONObject("adslot");
        if (optJSONObject14 != null) {
            nqiVar.zmn(zmn(optJSONObject14));
        } else {
            nqiVar.zmn(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey(POBConstants.KEY_POB_ADMOB_WATERMARK)) {
                nqiVar.iv(String.valueOf(requestExtraMap.get(POBConstants.KEY_POB_ADMOB_WATERMARK)));
            }
        } else {
            nqiVar.iv(jSONObject.optString("identificationOverlayContent"));
        }
        nqiVar.uqh(jSONObject.optInt("intercept_flag", 0));
        nqiVar.kw(jSONObject.optString("phone_num"));
        nqiVar.iqz(jSONObject.optString("title"));
        nqiVar.phc(jSONObject.optString("description"));
        nqiVar.doe(jSONObject.optString("button_text"));
        nqiVar.doe(jSONObject.optInt("ad_logo", 1));
        nqiVar.rp(jSONObject.optString("ext"));
        nqiVar.zak(jSONObject.optInt("cover_click_area", 0));
        nqiVar.fkt(jSONObject.optInt("image_mode"));
        nqiVar.nu(jSONObject.optInt(X3.i.n, 1));
        nqiVar.zmn((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        nqiVar.zak(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject15 = jSONObject.optJSONObject("app");
        JSONObject optJSONObject16 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        JSONObject optJSONObject17 = jSONObject.optJSONObject("oem");
        nqiVar.hhw(jSONObject.optInt("is_web_jump_ip", 0));
        nqiVar.zmn(com.bytedance.sdk.openadsdk.core.model.zak.zmn(optJSONObject17));
        nqiVar.zmn(btk(optJSONObject15));
        JSONObject optJSONObject18 = jSONObject.optJSONObject("interaction_method_params");
        nqiVar.zmn(zg(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        nqiVar.zmn(hhw(optJSONObject18));
        nqiVar.zmn(nps(optJSONObject18));
        nqiVar.zmn(iv(optJSONObject16));
        nqiVar.zmn(new com.bytedance.sdk.openadsdk.core.model.am(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                FilterWord fs = fs(optJSONArray5.optJSONObject(i6));
                if (fs != null && fs.isValid()) {
                    nqiVar.zmn(fs);
                }
            }
        }
        nqiVar.hgd(jSONObject.optInt("count_down"));
        nqiVar.zn(jSONObject.optLong("expiration_time"));
        nqiVar.mhu(jSONObject.optInt("video_encode_type", 0));
        nqiVar.bxw(jSONObject.optInt("video_black_fallback", 1));
        nqiVar.na(0);
        JSONObject optJSONObject19 = jSONObject.optJSONObject("video");
        if (optJSONObject19 != null) {
            fsVar = zmn(optJSONObject19, nqiVar, true);
            nqiVar.fs(fsVar);
            nqiVar.zg(optJSONObject19.optInt("multi_played_percent", 50));
        } else {
            fsVar = null;
        }
        JSONObject optJSONObject20 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject20 != null) {
            fsVar2 = zmn(optJSONObject20, nqiVar, false);
            nqiVar.zn(fsVar2);
        } else {
            fsVar2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || nqiVar.dz() == 0 || com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(nqiVar)) {
            nqiVar.zmn(fsVar);
            nqiVar.mhu(0);
        } else {
            if (fsVar2 != null && fsVar != null) {
                if (TextUtils.isEmpty(fsVar2.klz())) {
                    fsVar2.fb(fsVar.klz());
                }
                if (TextUtils.isEmpty(fsVar2.mw())) {
                    fsVar2.btk(fsVar.mw());
                }
                if (fsVar2.fb() == -1) {
                    fsVar2.fb(fsVar.fb());
                }
            }
            if (fsVar2 != null) {
                nqiVar.zmn(fsVar2);
            } else {
                nqiVar.zmn(fsVar);
            }
        }
        JSONObject optJSONObject21 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject21 != null) {
            nqiVar.zmn(bvs(optJSONObject21));
        }
        nqiVar.zmn(rc(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject22 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject22 != null) {
            nqi.zmn zmnVar5 = new nqi.zmn();
            zmnVar5.zn(optJSONObject22.optString("id"));
            zmnVar5.fb(optJSONObject22.optString("md5"));
            zmnVar5.btk(optJSONObject22.optString("url"));
            zmnVar5.hhw(optJSONObject22.optString("data"));
            zmnVar5.nps(optJSONObject22.optString("diff_data"));
            String optString = optJSONObject22.optString("dynamic_creative");
            zmnVar5.zg(optString);
            zmnVar5.fs(optJSONObject22.optString("version"));
            zmnVar5.bvs(optJSONObject22.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(optString);
                JSONArray optJSONArray6 = jsonObjectInit.optJSONArray("tag_ids");
                if (optJSONArray6 != null) {
                    for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                        arrayList.add(Integer.valueOf(optJSONArray6.optInt(i7)));
                    }
                }
                String optString2 = jsonObjectInit.optString("music_url");
                zmnVar5.zmn(arrayList);
                zmnVar5.zmn(optString2);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.iqz.zn("TTAD.AdInfoFactory", e.getMessage());
            }
            zmnVar5.iv(optJSONObject22.optString("engine_version"));
            zmnVar5.rc(optJSONObject22.optString("ugen_url"));
            zmnVar5.klz(optJSONObject22.optString("ugen_md5"));
            zmnVar5.mw(optJSONObject22.optString("ugen_data"));
            nqiVar.zmn(zmnVar5);
        }
        JSONObject optJSONObject23 = jSONObject.optJSONObject("tpl_info_v3");
        if (optJSONObject23 != null) {
            nqiVar.zmn(com.bytedance.sdk.openadsdk.core.model.ev.zmn(optJSONObject23));
        }
        JSONObject optJSONObject24 = jSONObject.optJSONObject("dynamic_creative");
        if (optJSONObject24 != null) {
            nqiVar.fs(optJSONObject24);
        }
        nqiVar.cn(jSONObject.optString("creative_extra"));
        nqiVar.olo(jSONObject.optInt("if_block_lp", 0));
        nqiVar.rp(jSONObject.optInt("cache_sort", 1));
        nqiVar.kjb(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject25 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject25 != null) {
            nqiVar.zmn(fb(optJSONObject25));
        }
        nqiVar.oub(jSONObject.optInt("is_package_open", 1));
        nqiVar.mw(jSONObject.optString("ad_info", null));
        int i8 = 2;
        nqiVar.am(jSONObject.optInt("ua_policy", 2));
        nqiVar.jy(jSONObject.optInt("playable_duration_time", 30));
        nqiVar.vlj(jSONObject.optInt("playable_close_time", -1));
        nqiVar.yof(jSONObject.optInt("playable_endcard_close_time", -1));
        nqiVar.dgt(jSONObject.optInt("endcard_close_time", -1));
        nqiVar.iv(jSONObject.optInt("interaction_method"));
        nqiVar.rc(jSONObject.optInt("top_area_leave_blank", 0));
        nqiVar.ve(jSONObject.optInt("lp_click_type", -1));
        nqiVar.btk(jSONObject.optInt("lp_click_interval", -1));
        nqiVar.am(jSONObject.optString("dsp_html"));
        nqiVar.bvs(jSONObject.optInt("image_stay", 0));
        int optInt2 = jSONObject.optInt("dsp_material_type", 0);
        if (optInt2 < 0 || optInt2 > 3) {
            optInt2 = 0;
        }
        if (optInt2 == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                optInt2 = 1;
            }
        }
        i8 = optInt2;
        nqiVar.yo(i8);
        if (i8 == 1 || i8 == 3) {
            int sft = nqiVar.sft();
            if (sft < 0) {
                if (nqiVar.utx() != null) {
                    sft = nqiVar.utx().getDurationSlotType();
                } else {
                    sft = nqiVar.ldx();
                }
            }
            String zn = com.bytedance.sdk.openadsdk.utils.oub.zn(sft);
            if (jSONObject.has("vast_json")) {
                zmnVar4 = com.bytedance.sdk.openadsdk.core.rt.zmn.zmn(jSONObject.optJSONObject("vast_json"));
            } else {
                String optString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString3)) {
                    zmn(nqiVar, zn);
                    return null;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Pair<com.bytedance.sdk.openadsdk.core.rt.zmn, fs.zmn> zmn2 = zmn(optString3, nqiVar.ol(), sft);
                if (zmn2 != null) {
                    zmnVar2 = (com.bytedance.sdk.openadsdk.core.rt.zmn) zmn2.first;
                    zmnVar3 = (fs.zmn) zmn2.second;
                } else {
                    zmnVar2 = null;
                    zmnVar3 = null;
                }
                com.bytedance.sdk.openadsdk.core.rt.zn.fb.fs(nqiVar, zn, zmnVar2, elapsedRealtime, zmnVar3);
                zmnVar4 = zmnVar2;
            }
            if (zmnVar4 == null) {
                return null;
            }
            zmn(zmnVar4, nqiVar);
        }
        nqiVar.yj(jSONObject.optString("deep_link_appname", ""));
        nqiVar.tet(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject optJSONObject26 = jSONObject.optJSONObject("dsp_style");
        if (optJSONObject26 != null) {
            nqiVar.zmn(new com.bytedance.sdk.openadsdk.core.model.cn(optJSONObject26));
        }
        JSONObject optJSONObject27 = jSONObject.optJSONObject("dsp_adchoices");
        if (optJSONObject27 != null) {
            nqiVar.nps(optJSONObject27.optString("adchoices_icon", ""));
            nqiVar.zg(optJSONObject27.optString("adchoices_url", ""));
        }
        String optString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(optString4)) {
            nqiVar.bvs(optString4);
        }
        nqiVar.mhu();
        JSONObject optJSONObject28 = jSONObject.optJSONObject("ugen");
        if (optJSONObject28 != null && (optJSONObject = optJSONObject28.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) != null) {
            nqiVar.zmn(zn(optJSONObject));
            JSONObject optJSONObject29 = optJSONObject.optJSONObject("overlay");
            if (optJSONObject29 != null) {
                nqiVar.fs(zn(optJSONObject29));
            }
        }
        nqiVar.nps(jSONObject.optInt("preload_h5_type", 0));
        nqiVar.iv(jSONObject.optBoolean("hasReportShow", false));
        nqiVar.rc(jSONObject.optString("endcard_creative", ""));
        nqiVar.nps(jSONObject.optJSONObject("ad_label"));
        JSONObject optJSONObject30 = jSONObject.optJSONObject("ev");
        if (optJSONObject30 != null) {
            nqiVar.kgc(optJSONObject30.optBoolean(a.k, com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn));
            nqiVar.cd(optJSONObject30.optInt("wait_time", com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs));
            nqiVar.fkt(optJSONObject30.optString("label", com.bytedance.sdk.openadsdk.bjh.zmn.zn.zn));
            nqiVar.zmn(new com.bytedance.sdk.openadsdk.bjh.zmn.fs(nqiVar));
        }
        JSONArray optJSONArray7 = jSONObject.optJSONArray("ad_tracks");
        if (optJSONArray7 != null && optJSONArray7.length() > 0) {
            com.bytedance.sdk.openadsdk.core.model.btk btkVar = new com.bytedance.sdk.openadsdk.core.model.btk(optJSONArray7);
            if (btkVar.zn()) {
                nqiVar.zmn(btkVar);
            }
        }
        JSONObject optJSONObject31 = jSONObject.optJSONObject("popup");
        if (optJSONObject31 != null) {
            nqiVar.zmn(new com.bytedance.sdk.openadsdk.core.model.uqh(optJSONObject31));
        }
        JSONArray optJSONArray8 = jSONObject.optJSONArray("app_log_url_backup");
        if (optJSONArray8 != null && optJSONArray8.length() > 0) {
            for (int i9 = 0; i9 < optJSONArray8.length(); i9++) {
                String optString5 = optJSONArray8.optString(i9);
                if (!TextUtils.isEmpty(optString5)) {
                    nqiVar.hgd(optString5);
                }
            }
        }
        JSONObject optJSONObject32 = jSONObject.optJSONObject("pixel_domain_backup");
        if (optJSONObject32 != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            Iterator<String> keys = optJSONObject32.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        String optString6 = optJSONObject32.optString(next, "");
                        if (!TextUtils.isEmpty(optString6)) {
                            hashMap.put(next, optString6);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            nqiVar.zmn(hashMap);
        }
        return nqiVar;
    }

    private static void zmn(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("iv_skip_time", -1);
            int optInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (optInt != -1) {
                nqiVar.lt(optInt);
            }
            if (optInt2 != -1) {
                nqiVar.io(optInt2);
            }
        }
    }

    private static com.bytedance.sdk.openadsdk.core.mw.zg.zmn zn(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.mw.zg.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.mw.zg.zmn();
        zmnVar.zmn(jSONObject.optString("id"));
        zmnVar.fs(jSONObject.optString("md5"));
        zmnVar.zn(jSONObject.optString("url"));
        return zmnVar;
    }

    private static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.rt.zmn, fs.zmn> zmn(String str, int i, int i2) {
        int i3;
        int i4;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2 == 1 || i2 == 5) {
            i3 = 0;
            i4 = 0;
        } else {
            i3 = jy.zn(kgc.zmn());
            i4 = jy.btk(kgc.zmn());
            if (i == 2) {
                i4 = i3;
                i3 = i4;
            }
        }
        com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk btkVar = new com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk(kgc.zmn(), i3, i4);
        return new Pair<>(btkVar.zmn(str, (File) null, new ArrayList()), btkVar.hhw);
    }

    private static void zmn(com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        zmnVar.zmn(nqiVar);
        if (!zmn(nqiVar.va())) {
            nqiVar.so(2);
        }
        nqiVar.cyb(1);
        nqiVar.zmn(zmnVar);
        if (!TextUtils.isEmpty(zmnVar.fb())) {
            nqiVar.iqz(zmnVar.fb());
        }
        if (!TextUtils.isEmpty(zmnVar.btk())) {
            nqiVar.phc(zmnVar.btk());
        }
        nqiVar.kgc(zmnVar.hhw());
        nqiVar.zmn((com.bytedance.sdk.openadsdk.core.model.hhw) null);
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
        if (mrt == null) {
            mrt = new com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs();
        }
        mrt.zn(zmnVar.nps());
        mrt.zmn(zmnVar.zg());
        mrt.hhw((String) null);
        mrt.fs((String) null);
        mrt.fb((String) null);
        nqiVar.zmn(mrt);
        if (zmnVar.fs() != null && !TextUtils.isEmpty(zmnVar.fs().fb())) {
            com.bytedance.sdk.openadsdk.core.model.kgc kgcVar = new com.bytedance.sdk.openadsdk.core.model.kgc();
            kgcVar.zmn(zmnVar.fs().fb());
            kgcVar.zmn(zmnVar.fs().zmn());
            kgcVar.fs(zmnVar.fs().fs());
            nqiVar.zmn(kgcVar);
            return;
        }
        if (nqiVar.uaq() == null) {
            com.bytedance.sdk.openadsdk.core.model.kgc kgcVar2 = new com.bytedance.sdk.openadsdk.core.model.kgc();
            kgcVar2.zmn("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            kgcVar2.zmn(98);
            kgcVar2.fs(98);
            nqiVar.zmn(kgcVar2);
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.nps fb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        long optLong = jSONObject.optLong("load_wait_time", 0L);
        long j = optLong >= 0 ? optLong : 0L;
        int optInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.nps npsVar = new com.bytedance.sdk.openadsdk.core.model.nps();
        npsVar.fs(optInt);
        npsVar.zn(optInt2);
        npsVar.zmn(j);
        npsVar.zmn(optInt3);
        return npsVar;
    }

    public static AdSlot zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mCodeId", "");
        int optInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float optDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float optDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
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

    public static FilterWord fs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord fs = fs(optJSONArray.optJSONObject(i));
                    if (fs != null && fs.isValid()) {
                        filterWord.addOption(fs);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.hhw btk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.model.hhw();
        hhwVar.fs(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        hhwVar.zn(jSONObject.optString("package_name"));
        hhwVar.zmn(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        hhwVar.zmn(jSONObject.optDouble("score", -1.0d));
        hhwVar.zmn(jSONObject.optInt("comment_num", -1));
        hhwVar.fs(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        hhwVar.fb(jSONObject.optString("app_category"));
        return hhwVar;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.phc hhw(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.phc phcVar = new com.bytedance.sdk.openadsdk.core.model.phc();
        if (jSONObject == null) {
            phcVar.zmn(10L);
            phcVar.fs(20L);
            phcVar.zn(10L);
            phcVar.fb(20L);
            phcVar.zmn("");
            return phcVar;
        }
        phcVar.zmn(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        phcVar.fs(jSONObject.optLong("straight_lp_showtime", 20L));
        phcVar.zn(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        phcVar.fb(jSONObject.optLong("straight_agg_showtime", 20L));
        phcVar.zmn(jSONObject.optString("loading_text", ""));
        return phcVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.kw nps(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.kw kwVar = new com.bytedance.sdk.openadsdk.core.model.kw();
        if (jSONObject == null) {
            kwVar.fb(5);
            kwVar.btk(30);
            kwVar.hhw(70);
            kwVar.nps(1);
            kwVar.zg(com.bytedance.sdk.openadsdk.core.model.kw.zmn);
            kwVar.zn(0);
            kwVar.fs(0);
            kwVar.zmn(3);
            return kwVar;
        }
        kwVar.fb(jSONObject.optInt("ceiling_time", 5));
        kwVar.btk(jSONObject.optInt("ceiling_ratio", 30));
        kwVar.hhw(jSONObject.optInt("expand_ratio", 70));
        kwVar.nps(jSONObject.optInt("back_type", 1));
        kwVar.zg(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.kw.zmn));
        kwVar.zn(jSONObject.optInt("pre_render_status", 0));
        kwVar.fs(jSONObject.optInt("pre_render_use_gecko", 0));
        kwVar.zmn(jSONObject.optInt("pre_render_add_type", 3));
        return kwVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.zg zg(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.zg zgVar = new com.bytedance.sdk.openadsdk.core.model.zg();
        if (jSONObject == null) {
            zgVar.zn(0);
            zgVar.fb(0);
            zgVar.fs(new ArrayList());
            zgVar.btk(0);
            zgVar.zmn(new ArrayList());
            zgVar.fs(0);
            zgVar.zmn(0);
            return zgVar;
        }
        zgVar.zn(jSONObject.optInt("interceptor_x", 0));
        zgVar.fb(jSONObject.optInt("interceptor_y", 0));
        JSONArray optJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
            }
        }
        zgVar.fs(arrayList);
        zgVar.btk(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(optJSONArray2.optString(i2));
            }
        }
        zgVar.zmn(arrayList2);
        zgVar.fs(jSONObject.optInt("boc_index", 0));
        zgVar.zmn(jSONObject.optInt("is_act", 0));
        return zgVar;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.rt bvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.rt rtVar = new com.bytedance.sdk.openadsdk.core.model.rt();
        rtVar.zmn(jSONObject.optInt("if_send_click", 0));
        return rtVar;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.mw iv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.mw mwVar = new com.bytedance.sdk.openadsdk.core.model.mw();
        mwVar.zmn(jSONObject.optString("deeplink_url"));
        mwVar.fs(jSONObject.optString("fallback_url"));
        mwVar.zmn(jSONObject.optInt("fallback_type"));
        return mwVar;
    }

    @Nullable
    private static com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs zmn(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, boolean z) {
        int optInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar = new com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs();
        fsVar.fs(jSONObject.optInt("cover_height"));
        fsVar.zn(jSONObject.optInt("cover_width"));
        fsVar.zmn(jSONObject.optString("resolution"));
        fsVar.zmn(jSONObject.optLong("size"));
        double optDouble = jSONObject.optDouble("video_duration", 0.0d);
        fsVar.zmn(optDouble);
        int i = 1;
        int optInt2 = jSONObject.optInt("replay_time", 1);
        if (optDouble <= 15.0d && nqiVar.nkt() != 1 && com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar)) {
            i = optInt2;
        }
        fsVar.iv(i);
        fsVar.fs(jSONObject.optString("cover_url"));
        fsVar.zn(jSONObject.optString("video_url"));
        fsVar.fb(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        fsVar.btk(jSONObject.optString("playable_download_url"));
        fsVar.hhw(jSONObject.optString("file_hash"));
        fsVar.zg(jSONObject.optInt("if_playable_loading_show", 0));
        fsVar.bvs(jSONObject.optInt("remove_loading_page_type", 0));
        fsVar.zmn(jSONObject.optInt("fallback_endcard_judge", 0));
        fsVar.btk(jSONObject.optInt("video_preload_size", 307200));
        fsVar.hhw(jSONObject.optInt("reward_video_cached_type", 0));
        fsVar.nps(jSONObject.optInt("execute_cached_type", 0));
        if (z) {
            optInt = jSONObject.optInt("endcard_render", 0);
        } else {
            optInt = jSONObject.optInt("endcard_render", -1);
        }
        fsVar.fb(optInt);
        return fsVar;
    }

    private static Map<String, Object> rc(JSONObject jSONObject) {
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
    private static int zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null) {
            com.bytedance.sdk.openadsdk.fb.zn.zn((com.bytedance.sdk.openadsdk.core.model.nqi) null, "", 401);
            return 401;
        }
        String zn = com.bytedance.sdk.openadsdk.utils.oub.zn(nqiVar.sft());
        if (TextUtils.isEmpty(nqiVar.ji()) || nqiVar.ji().length() <= 1) {
            com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, 402);
            return 402;
        }
        if (nqiVar.xup()) {
            if (nqiVar.sft() < 0) {
                if (nqiVar.utx() != null) {
                    nqiVar.utx().getDurationSlotType();
                } else {
                    nqiVar.ldx();
                }
            }
            if (nqiVar.wir()) {
                zn = "fullscreen_interstitial_ad";
            }
            if (TextUtils.isEmpty(nqiVar.xhx())) {
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, zn, "load_html_fail", (JSONObject) null);
                return 401;
            }
            com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, zn, "load_html_success", (JSONObject) null);
        }
        if (nqiVar.qj() == 0) {
            int zq = nqiVar.zq();
            if (zq != 2 && zq != 3 && zq != 4) {
                if (zq != 5 && zq != 15) {
                    if (zq != 16) {
                    }
                }
                int zmn2 = zmn(nqiVar.mrt(), nqiVar.ch());
                if (zmn2 != 200) {
                    com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, zmn2);
                    return zmn2;
                }
            }
            int zmn3 = zmn(nqiVar.tj());
            if (zmn3 != 200) {
                com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, zmn3);
                return zmn3;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().doe()) {
            return zn(nqiVar);
        }
        return fs(nqiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3 != 8) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int fs(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        int i;
        String zn = com.bytedance.sdk.openadsdk.utils.oub.zn(nqiVar.sft());
        if (nqiVar.qj() == 0) {
            i = zmn(nqiVar.my());
            com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, i);
        } else {
            i = 200;
        }
        int va = nqiVar.va();
        if (va != 2 && va != 3) {
            if (va == 4) {
                com.bytedance.sdk.openadsdk.core.model.hhw pw = nqiVar.pw();
                if (pw == null) {
                    com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, 407);
                    i = 407;
                } else if (TextUtils.isEmpty(pw.zn()) && TextUtils.isEmpty(pw.zmn())) {
                    com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                    i = 417;
                } else if (TextUtils.isEmpty(pw.zn())) {
                    i = TTAdConstant.PACKAGE_NAME_CODE;
                    com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, TTAdConstant.PACKAGE_NAME_CODE);
                } else if (TextUtils.isEmpty(pw.zmn())) {
                    i = 408;
                    com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, 408);
                }
            }
            if (i != 417 || i == 407 || i == 406) {
                return i;
            }
            if (i != 200) {
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, zn, i);
            }
            return 200;
        }
        int fs = fs(nqiVar, zn);
        if (fs != 200) {
            i = fs;
        }
        if (i != 417) {
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r3 != 8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        int i;
        String zn = com.bytedance.sdk.openadsdk.utils.oub.zn(nqiVar.sft());
        if (nqiVar.qj() == 0) {
            i = zmn(nqiVar.my());
            if (i != 200) {
                com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, i);
                return i;
            }
        } else {
            i = 200;
        }
        int va = nqiVar.va();
        if (va != 2 && va != 3) {
            if (va == 4) {
                i = zmn(nqiVar.pw());
                if (i != 200) {
                    com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, zn, i);
                    return i;
                }
            }
        }
        int fs = fs(nqiVar, zn);
        return fs != 200 ? fs : i;
    }

    private static boolean fb(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        return (nqiVar.ch() || nqiVar.xup()) ? false : true;
    }

    private static int zmn(com.bytedance.sdk.openadsdk.core.model.mw mwVar) {
        if (mwVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(mwVar.zmn())) {
            return 403;
        }
        if (TextUtils.isEmpty(mwVar.fs())) {
            return 404;
        }
        return (mwVar.zn() == 1 || mwVar.zn() == 2) ? 200 : 405;
    }

    private static int zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar, boolean z) {
        if (fsVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(fsVar.rc())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(fsVar.iv())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int zmn(com.bytedance.sdk.openadsdk.core.model.hhw hhwVar) {
        if (hhwVar == null) {
            return 407;
        }
        if (TextUtils.isEmpty(hhwVar.zmn())) {
            return 408;
        }
        if (TextUtils.isEmpty(hhwVar.zn())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int zmn(List<com.bytedance.sdk.openadsdk.core.model.kgc> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.kgc kgcVar : list) {
            if (kgcVar == null) {
                return 411;
            }
            if (TextUtils.isEmpty(kgcVar.zmn())) {
                return 412;
            }
        }
        return 200;
    }

    private static void zmn(final ArrayList<zmn> arrayList) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.fs.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zmn zmnVar = (zmn) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cid", zmnVar.zmn);
                    jSONObject2.put("error_msg", zmnVar.fs);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("multiple_ads_parsing_error").fs(jSONObject.toString());
            }
        });
    }

    private static class zmn {
        public int fs;
        public String zmn;

        public zmn(String str, int i) {
            this.zmn = str;
            this.fs = i;
        }
    }

    public static boolean zmn(String str) {
        if (str == null) {
            return false;
        }
        try {
            return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("ttclid"));
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private static int fs(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str) {
        if (fb(nqiVar)) {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.fs.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("web_ad_target_url");
                    return zmnVar;
                }
            });
            String pl = nqiVar.pl();
            if (TextUtils.isEmpty(pl)) {
                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.fs.3
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar.fs("web_ad_target_url");
                        return zmnVar;
                    }
                });
                return 406;
            }
            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.fs.4
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("web_ad_target_url");
                    return zmnVar;
                }
            });
            if (!zmn(pl)) {
                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, TTAdConstant.TARGET_URL_NOT_CONTAINS_TTCLID_CODE, pl);
            }
        }
        return 200;
    }
}
