package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.openadsdk.core.ev;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.settings.btk;
import com.bytedance.sdk.openadsdk.core.settings.iv;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zg extends iv {
    static final ArrayList<String> fb = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> btk;
    public boolean zn;

    public zg(iv.zmn zmnVar) {
        super(zmnVar);
        this.btk = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.iv
    protected String zmn() {
        try {
            String str = "tt_sdk_settings_sr.prop";
            if (kgc.zmn() == null || phc.zmn(kgc.zmn())) {
                return str;
            }
            return "tt_sdk_settings_sr_" + phc.zn(kgc.zmn()) + ".prop";
        } catch (Throwable unused) {
            return "tt_sdk_settings_sr";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.btk
    public void zmn(JSONObject jSONObject) {
        int optInt;
        btk.zmn fs = fs();
        JSONObject hhw = rc.fs().hhw();
        JSONObject optJSONObject = jSONObject.optJSONObject("digest");
        this.zn = (optJSONObject == null || hhw == null || !optJSONObject.toString().equals(hhw.toString())) ? false : true;
        if (optJSONObject != null) {
            fs.zmn("digest", optJSONObject.toString());
        } else {
            fs.zmn("digest");
        }
        fs.zmn("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long optLong = jSONObject.optLong("req_inter_min", 10L) * 60000;
            if (optLong < 0 || optLong > 86400000) {
                optLong = 600000;
            }
            fs.zmn("req_inter_min", optLong);
        }
        if (jSONObject.has("lp_new_style")) {
            fs.zmn("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int optInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (optInt2 < 0 || optInt2 > 100) {
                optInt2 = 30;
            }
            fs.zmn("blank_detect_rate", optInt2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject2 != null) {
            if (optJSONObject2.has(IronSourceConstants.EVENTS_DURATION)) {
                fs.zmn(IronSourceConstants.EVENTS_DURATION, optJSONObject2.optLong(IronSourceConstants.EVENTS_DURATION) * 1000);
            }
            if (optJSONObject2.has("max")) {
                fs.zmn("max", optJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            fs.zmn("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("abtest");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("version")) {
                fs.zmn("ab_test_version", optJSONObject3.optString("version"));
            }
            if (optJSONObject3.has("param")) {
                fs.zmn("ab_test_param", optJSONObject3.optString("param"));
            }
        } else {
            rc.fs().zg();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject4 != null && optJSONObject4.has("global_rate")) {
            fs.zmn("global_rate", (float) optJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            fs.zmn("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            fs.zmn("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            fs.zmn("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            fs.zmn("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            fs.zmn("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            fs.zmn("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            fs.zmn("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            fs.zmn("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            fs.zmn("dc", jSONObject.optString("dc"));
        }
        rc.fs().zmn(jSONObject, fs);
        if (jSONObject.has("insert_js_config")) {
            fs.zmn("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            fs.zmn("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            fs.zmn("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject5 != null) {
            if (optJSONObject5.has("force_language")) {
                String optString = optJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(optString) && fb.contains(optString)) {
                    fs.zmn("force_language", optString);
                }
            }
            if (optJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                fs.zmn("fetch_tpl_timeout_ctrl", optJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (optJSONObject5.has("fetch_tpl_second")) {
                fs.zmn("fetch_tpl_second", optJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (optJSONObject5.has("support_gzip")) {
                fs.zmn("support_gzip", optJSONObject5.optBoolean("support_gzip", false));
            }
            if (optJSONObject5.has("aes_key")) {
                fs.zmn("aes_key", optJSONObject5.optString("aes_key"));
            }
            if (optJSONObject5.has("support_rtl")) {
                fs.zmn("support_rtl", optJSONObject5.optBoolean("support_rtl", false));
            }
            if (optJSONObject5.has("ad_revenue_enable")) {
                fs.zmn("ad_revenue_enable", optJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (optJSONObject5.has("gecko_hosts")) {
                try {
                    this.btk.clear();
                    JSONArray optJSONArray = optJSONObject5.optJSONArray("gecko_hosts");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            this.btk.add(optJSONArray.getString(i));
                        }
                    }
                    this.btk = zmn(this.btk);
                    fs.zmn("gecko_hosts", optJSONArray.toString());
                } catch (Throwable th) {
                    iqz.zn("GeckoLog: settings json error ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            fs.zmn("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        zn.zmn(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            if (optJSONObject6.has("ad_enable")) {
                fs.zmn("privacy_ad_enable", optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("personalized_ad")) {
                fs.zmn("privacy_personalized_ad", optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("sladar_enable")) {
                fs.zmn("privacy_sladar_enable", optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("app_log_enable")) {
                fs.zmn("privacy_app_log_enable", optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("debug_unlock")) {
                fs.zmn("privacy_debug_unlock", optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String optString2 = optJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (!TextUtils.isEmpty(optString2)) {
                    fs.zmn("privacy_fields_allowed", optString2);
                } else {
                    fs.zmn("privacy_fields_allowed");
                }
            }
            if (optJSONObject6.has("app_reg")) {
                int optInt3 = optJSONObject6.optInt("app_reg", -1);
                if (optInt3 == 0 && ev.zmn().fb() == 1 && com.bytedance.sdk.openadsdk.uqh.btk.zmn("app_register_alert_enable", false)) {
                    nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.zg.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(kgc.zmn(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                fs.zmn("privacy_app_reg", optInt3 == 1);
                com.bytedance.sdk.openadsdk.core.rc.fs.zmn().zmn(optInt3);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            fs.zmn("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int optInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (optInt4 != 0 && optInt4 != 1) {
                optInt4 = 0;
            }
            fs.zmn("loadedCallbackOpportunity", optInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int optInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (optInt5 < 0 || optInt5 > 3) {
                optInt5 = 0;
            }
            fs.zmn("splash_video_load_strategy", optInt5);
        }
        if (jSONObject.has("user_compliance_status")) {
            com.bytedance.sdk.openadsdk.core.rc.fs.zmn().fs(jSONObject.optInt("user_compliance_status", -1));
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            com.bytedance.sdk.openadsdk.core.rc.fs.zmn().zmn(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            com.bytedance.sdk.openadsdk.core.rc.fs.zmn().zmn(jSONObject.optLong("allow_req_time", com.bytedance.sdk.openadsdk.core.rc.fs.zmn.longValue()));
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            fs.zmn("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (optJSONObject7 != null) {
            if (optJSONObject7.has("bus_con_sec_type")) {
                fs.zmn("bus_con_sec_type", optJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (optJSONObject7.has("bus_con_adshow_check_enable")) {
                fs.zmn("bus_con_adshow_check_enable", optJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (optJSONObject7.has("bus_con_token_thread_count")) {
                fs.zmn("bus_con_token_thread_count", optJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (optJSONObject7.has("bus_con_video_keep_screen_on")) {
                fs.zmn("bus_con_video_keep_screen_on", optJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (optJSONObject7.has("bus_con_auto_click_delay")) {
                fs.zmn("bus_con_auto_click_delay", optJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (optJSONObject7.has("bus_con_express_host")) {
                fs.zmn("bus_con_express_host", optJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (optJSONObject7.has("bus_con_check_clz")) {
                fs.zmn("bus_con_check_clz", optJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (optJSONObject7.has("bus_con_url_check")) {
                fs.zmn("bus_con_url_check", optJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (optJSONObject7.has("bus_con_behavior_count")) {
                fs.zmn("bus_con_behavior_count", optJSONObject7.optInt("bus_con_behavior_count", 300));
            }
            String str = rc.zmn;
            if (optJSONObject7.has(str)) {
                fs.zmn(str, optJSONObject7.optBoolean(str, false));
            }
            String str2 = rc.fs;
            if (optJSONObject7.has(str2)) {
                fs.zmn(str2, optJSONObject7.optInt(str2, 10000));
            }
            String str3 = rc.zn;
            if (optJSONObject7.has(str3)) {
                fs.zmn(str3, (float) optJSONObject7.optDouble(str3, 1.0d));
            }
            if (optJSONObject7.has("bus_con_slide_num")) {
                int optInt6 = optJSONObject7.optInt("bus_con_slide_num", 2);
                if (optInt6 <= 0) {
                    optInt6 = 2;
                }
                fs.zmn("bus_con_slide_num", optInt6);
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (optJSONObject8 != null) {
                    if (optJSONObject8.has("perf_con_applog_send")) {
                        String optString3 = optJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(optString3)) {
                            fs.zmn("perf_con_applog_send", optString3);
                        }
                    }
                    if (optJSONObject8.has("perf_con_apm_native")) {
                        fs.zmn("perf_con_apm_native", optJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache")) {
                        fs.zmn("perf_con_webview_preload_cache", optJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        fs.zmn("perf_con_webview_preload_cache_v3", optJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count")) {
                        fs.zmn("perf_con_webview_cache_count", optJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        fs.zmn("perf_con_webview_cache_count_v3", optJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_stack_size") && (optInt = optJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && optInt <= 0) {
                        fs.zmn("perf_con_thread_stack_size", optInt);
                    }
                    if (optJSONObject8.has("perf_con_thread_pool_config")) {
                        String optString4 = optJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(optString4)) {
                            fs.zmn("perf_con_thread_pool_config", optString4);
                        }
                    }
                    if (optJSONObject8.has("perf_con_is_new_net_thread")) {
                        fs.zmn("perf_con_is_new_net_thread", optJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (optJSONObject8.has("perf_con_adlog_expire_time")) {
                        fs.zmn("perf_con_adlog_expire_time", optJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        fs.zmn("perf_con_adlog_turn_off_retry_ad", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        fs.zmn("perf_con_adlog_turn_off_retry_stats", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (optJSONObject8.has("perf_con_applog_rate")) {
                        fs.zmn("perf_con_applog_rate", optJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (optJSONObject8.has("perf_con_track_url_strategy")) {
                        fs.zmn("perf_con_track_url_strategy", optJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (optJSONObject8.has("perf_con_drawable_code")) {
                        fs.zmn("perf_con_drawable_code", optJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (optJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        fs.zmn("perf_con_close_button_delay_check_time", optJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (optJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        fs.zmn("perf_con_drop2rt_skip_label_list", optJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (optJSONObject8.has("perf_con_sync_gaid")) {
                        fs.zmn("perf_con_sync_gaid", optJSONObject8.optInt("perf_con_sync_gaid"));
                    }
                }
            } catch (Throwable th2) {
                iqz.zn("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", optJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e) {
            iqz.zn("SettingsDefaultRepository", "coreSettingJson", e.getMessage());
        }
        fs.zmn("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            fs.zmn("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            fs.zmn("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String optString5 = jSONObject.optString("token_adx_ids", "");
            if (!TextUtils.isEmpty(optString5)) {
                fs.zmn("token_adx_ids", optString5);
            } else {
                fs.zmn("token_adx_ids");
            }
        }
        if (jSONObject.has("ads_url_backup")) {
            String optString6 = jSONObject.optString("ads_url_backup", "");
            if (!TextUtils.isEmpty(optString6)) {
                fs.zmn("ads_url_backup", optString6);
            } else {
                fs.zmn("ads_url_backup");
            }
        }
        if (jSONObject.has("dual_event_url_backup")) {
            String optString7 = jSONObject.optString("dual_event_url_backup", "");
            if (!TextUtils.isEmpty(optString7)) {
                fs.zmn("dual_event_url_backup", optString7);
            } else {
                fs.zmn("dual_event_url_backup");
            }
        }
        fs.zmn();
        rc.fs().hgd();
        btk();
    }

    public static Set<String> zmn(Set<String> set) {
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
