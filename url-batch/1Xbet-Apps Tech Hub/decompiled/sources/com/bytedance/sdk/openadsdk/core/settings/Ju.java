package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.settings.NB;
import com.bytedance.sdk.openadsdk.core.settings.bNS;
import com.bytedance.sdk.openadsdk.utils.OT;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsDefaultRepository.java */
/* loaded from: classes2.dex */
public class Ju extends bNS {
    static final ArrayList<String> Jd = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", FacebookMediationAdapter.KEY_ID, "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> NB;
    public boolean vG;

    public Ju(bNS.pvs pvsVar) {
        super("tt_sdk_settings.prop", pvsVar);
        this.NB = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.NB
    public void pvs(JSONObject jSONObject) {
        int optInt;
        NB.pvs pvs = pvs();
        JSONObject NB = mnm.Lxj().NB();
        JSONObject optJSONObject = jSONObject.optJSONObject("digest");
        this.vG = (optJSONObject == null || NB == null || !optJSONObject.toString().equals(NB.toString())) ? false : true;
        if (optJSONObject != null) {
            pvs.pvs("digest", optJSONObject.toString());
        } else {
            pvs.pvs("digest");
        }
        pvs.pvs("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long optLong = jSONObject.optLong("req_inter_min", 10L) * 60 * 1000;
            if (optLong < 0 || optLong > 86400000) {
                optLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            pvs.pvs("req_inter_min", optLong);
        }
        if (jSONObject.has("lp_new_style")) {
            pvs.pvs("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int optInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (optInt2 < 0 || optInt2 > 100) {
                optInt2 = 30;
            }
            pvs.pvs("blank_detect_rate", optInt2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject2 != null) {
            if (optJSONObject2.has(TypedValues.TransitionType.S_DURATION)) {
                pvs.pvs(TypedValues.TransitionType.S_DURATION, optJSONObject2.optLong(TypedValues.TransitionType.S_DURATION) * 1000);
            }
            if (optJSONObject2.has("max")) {
                pvs.pvs("max", optJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            pvs.pvs("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("abtest");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("version")) {
                pvs.pvs("ab_test_version", optJSONObject3.optString("version"));
            }
            if (optJSONObject3.has("param")) {
                pvs.pvs("ab_test_param", optJSONObject3.optString("param"));
            }
        } else {
            mnm.Lxj().yiw();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject4 != null && optJSONObject4.has("global_rate")) {
            pvs.pvs("global_rate", (float) optJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            pvs.pvs("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            pvs.pvs("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            pvs.pvs("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("app_log_url")) {
            pvs.pvs("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("coppa")) {
            int optInt3 = jSONObject.optInt("coppa", -99);
            com.bytedance.sdk.openadsdk.core.so.icD().Jd(optInt3);
            pvs.pvs("coppa", optInt3);
        }
        if (jSONObject.has("privacy_url")) {
            pvs.pvs("policy_url", jSONObject.optString("privacy_url"));
        }
        if (jSONObject.has("consent_url")) {
            pvs.pvs("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            pvs.pvs("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            pvs.pvs("dc", jSONObject.optString("dc"));
        }
        mnm.Lxj().pvs(jSONObject, pvs);
        mnm.Lxj().icD(jSONObject, pvs);
        if (jSONObject.has("if_both_open")) {
            pvs.pvs("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            pvs.pvs("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            pvs.pvs("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            pvs.pvs("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject5 != null) {
            if (optJSONObject5.has("force_language")) {
                String optString = optJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(optString) && Jd.contains(optString)) {
                    pvs.pvs("force_language", optString);
                }
            }
            if (optJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                pvs.pvs("fetch_tpl_timeout_ctrl", optJSONObject5.optInt("fetch_tpl_timeout_ctrl", PathInterpolatorCompat.MAX_NUM_POINTS));
            }
            if (optJSONObject5.has("fetch_tpl_second")) {
                pvs.pvs("fetch_tpl_second", optJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (optJSONObject5.has("disable_rotate_banner_on_dislike")) {
                pvs.pvs("disable_rotate_banner_on_dislike", optJSONObject5.optInt("disable_rotate_banner_on_dislike", Integer.MAX_VALUE));
            }
            if (optJSONObject5.has("support_gzip")) {
                pvs.pvs("support_gzip", optJSONObject5.optBoolean("support_gzip", false));
            }
            if (optJSONObject5.has("aes_key")) {
                pvs.pvs("aes_key", optJSONObject5.optString("aes_key"));
            }
            if (optJSONObject5.has("support_rtl")) {
                pvs.pvs("support_rtl", optJSONObject5.optBoolean("support_rtl", false));
            }
            if (optJSONObject5.has("ad_revenue_enable")) {
                pvs.pvs("ad_revenue_enable", optJSONObject5.optBoolean("ad_revenue_enable", false));
            }
            if (optJSONObject5.has("gecko_hosts")) {
                try {
                    this.NB.clear();
                    JSONArray optJSONArray = optJSONObject5.optJSONArray("gecko_hosts");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            this.NB.add(optJSONArray.getString(i));
                        }
                    }
                    this.NB = pvs(this.NB);
                    pvs.pvs("gecko_hosts", optJSONArray.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD("GeckoLog: settings json error ".concat(String.valueOf(th)));
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            pvs.pvs("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        vG.pvs(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            if (optJSONObject6.has("ad_enable")) {
                pvs.pvs("privacy_ad_enable", optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("personalized_ad")) {
                pvs.pvs("privacy_personalized_ad", optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("sladar_enable")) {
                pvs.pvs("privacy_sladar_enable", optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("app_log_enable")) {
                pvs.pvs("privacy_app_log_enable", optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("debug_unlock")) {
                pvs.pvs("privacy_debug_unlock", optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("fields_allowed")) {
                String optString2 = optJSONObject6.optString("fields_allowed", "");
                if (!TextUtils.isEmpty(optString2)) {
                    pvs.pvs("privacy_fields_allowed", optString2);
                } else {
                    pvs.pvs("privacy_fields_allowed");
                }
            }
        }
        if (jSONObject.has("video_cache_config")) {
            pvs.pvs("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int optInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (optInt4 != 0 && optInt4 != 1) {
                optInt4 = 0;
            }
            pvs.pvs("loadedCallbackOpportunity", optInt4);
        }
        if (jSONObject.has("load_strategy")) {
            int optInt5 = jSONObject.optInt("load_strategy", 0);
            if (optInt5 != 0 && optInt5 != 1) {
                optInt5 = 0;
            }
            pvs.pvs("load_callback_strategy", optInt5);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int optInt6 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (optInt6 < 0 || optInt6 > 3) {
                optInt6 = 0;
            }
            pvs.pvs("splash_video_load_strategy", optInt6);
        }
        if (jSONObject.has("support_mem_dynamic")) {
            int optInt7 = jSONObject.optInt("support_mem_dynamic", 0);
            if (optInt7 != 0 && optInt7 != 1) {
                optInt7 = 0;
            }
            pvs.pvs("support_mem_dynamic", optInt7);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            pvs.pvs("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (optJSONObject7 != null) {
            if (optJSONObject7.has("bus_con_send_log_type")) {
                pvs.pvs("bus_con_send_log_type", optJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (optJSONObject7.has("bus_con_sec_type")) {
                pvs.pvs("bus_con_sec_type", optJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (optJSONObject7.has("bus_con_dislike_report_raw")) {
                pvs.pvs("bus_con_dislike_report_raw", optJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (optJSONObject7.has("bus_con_adshow_check_enable")) {
                pvs.pvs("bus_con_adshow_check_enable", optJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (optJSONObject7.has("bus_con_tnc_interval")) {
                pvs.pvs("bus_con_tnc_interval", optJSONObject7.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (optJSONObject7.has("bus_con_token_thread_count")) {
                pvs.pvs("bus_con_token_thread_count", optJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (optJSONObject7.has("bus_con_video_keep_screen_on")) {
                pvs.pvs("bus_con_video_keep_screen_on", optJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (optJSONObject7.has("bus_con_auto_click_delay")) {
                pvs.pvs("bus_con_auto_click_delay", optJSONObject7.optInt("bus_con_auto_click_delay", PathInterpolatorCompat.MAX_NUM_POINTS));
            }
            if (optJSONObject7.has("bus_con_express_host")) {
                pvs.pvs("bus_con_express_host", optJSONObject7.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
            }
            if (optJSONObject7.has("bus_con_rewardedfull_link")) {
                pvs.pvs("bus_con_rewardedfull_link", optJSONObject7.optInt("bus_con_rewardedfull_link", 0));
            }
            if (optJSONObject7.has("bus_con_check_clz")) {
                pvs.pvs("bus_con_check_clz", optJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (optJSONObject7.has("bus_con_url_check")) {
                pvs.pvs("bus_con_url_check", optJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (optJSONObject7.has("bus_con_behavior_count")) {
                pvs.pvs("bus_con_behavior_count", optJSONObject7.optInt("bus_con_behavior_count", MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION));
            }
            if (optJSONObject7.has("bus_con_collect_arbitrage")) {
                pvs.pvs("bus_con_collect_arbitrage", optJSONObject7.optBoolean("bus_con_collect_arbitrage", false));
            }
            if (optJSONObject7.has("bus_con_arbitrage_loading_timeout")) {
                pvs.pvs("bus_con_arbitrage_loading_timeout", optJSONObject7.optInt("bus_con_arbitrage_loading_timeout", 10000));
            }
            if (optJSONObject7.has("bus_con_arbitrage_loading_alpha")) {
                pvs.pvs("bus_con_arbitrage_loading_alpha", (float) optJSONObject7.optDouble("bus_con_arbitrage_loading_alpha", 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (optJSONObject8 != null) {
                    if (optJSONObject8.has("perf_con_stats_rate")) {
                        String optString3 = optJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(optString3)) {
                            pvs.pvs("perf_con_stats_rate", optString3);
                        }
                    }
                    if (optJSONObject8.has("perf_con_applog_send")) {
                        String optString4 = optJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(optString4)) {
                            pvs.pvs("perf_con_applog_send", optString4);
                        }
                    }
                    if (optJSONObject8.has("perf_con_apm_native")) {
                        pvs.pvs("perf_con_apm_native", optJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache")) {
                        pvs.pvs("perf_con_webview_preload_cache", optJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        pvs.pvs("perf_con_webview_preload_cache_v3", optJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count")) {
                        pvs.pvs("perf_con_webview_cache_count", optJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        pvs.pvs("perf_con_webview_cache_count_v3", optJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_stack_size") && (optInt = optJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && optInt <= 0) {
                        pvs.pvs("perf_con_thread_stack_size", optInt);
                    }
                    if (optJSONObject8.has("perf_con_use_new_thread_pool")) {
                        pvs.pvs("perf_con_use_new_thread_pool", optJSONObject8.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_pool_config")) {
                        String optString5 = optJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(optString5)) {
                            pvs.pvs("perf_con_thread_pool_config", optString5);
                        }
                    }
                    if (optJSONObject8.has("perf_con_is_new_net_thread")) {
                        pvs.pvs("perf_con_is_new_net_thread", optJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (optJSONObject8.has("perf_con_use_prop")) {
                        OT.pvs(optJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (optJSONObject8.has("perf_con_adlog_expire_time")) {
                        pvs.pvs("perf_con_adlog_expire_time", optJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        pvs.pvs("perf_con_adlog_turn_off_retry_ad", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        pvs.pvs("perf_con_adlog_turn_off_retry_stats", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (optJSONObject8.has("perf_con_applog_rate")) {
                        pvs.pvs("perf_con_applog_rate", optJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (optJSONObject8.has("perf_con_track_url_strategy")) {
                        pvs.pvs("perf_con_track_url_strategy", optJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (optJSONObject8.has("perf_con_drawable_code")) {
                        pvs.pvs("perf_con_drawable_code", optJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (optJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        pvs.pvs("perf_con_close_button_delay_check_time", optJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (optJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        pvs.pvs("perf_con_drop2rt_skip_label_list", optJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4_get_ad")) {
                        pvs.pvs("perf_con_crypt_V4_get_ad", optJSONObject8.optBoolean("perf_con_crypt_V4_get_ad", false));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4_applog")) {
                        pvs.pvs("perf_con_crypt_V4_applog", optJSONObject8.optBoolean("perf_con_crypt_V4_applog", false));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4")) {
                        pvs.pvs("perf_con_crypt_V4", optJSONObject8.optBoolean("perf_con_crypt_V4", false));
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.Ju.pvs("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", optJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("SettingsDefaultRepository", "coreSettingJson", e.getMessage());
        }
        pvs.pvs("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            pvs.pvs("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        pvs.pvs();
        mnm.Lxj().gA();
        Jd();
    }

    public static Set<String> pvs(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
