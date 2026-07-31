package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.du1;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qu1 implements ar1<du1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f30897a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ar1<String> f30898b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o32 f30899c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b50 f30900d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2167pk f30901e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final w50 f30902f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2111na f30903g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C1821b6 f30904h;

    public qu1(@NotNull mp1 reporter, @NotNull ar1<String> stringResponseParser, @NotNull o32 systemCurrentTimeProvider, @NotNull b50 encryptionParametersParser, @NotNull C2167pk biddingSettingsDataParser, @NotNull w50 exclusionRulesJsonConverter, @NotNull C2111na adaptiveValidationRulesConverter, @NotNull C1821b6 adQualityAdVerificationConfigurationJsonConverter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(stringResponseParser, "stringResponseParser");
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        Intrinsics.checkNotNullParameter(encryptionParametersParser, "encryptionParametersParser");
        Intrinsics.checkNotNullParameter(biddingSettingsDataParser, "biddingSettingsDataParser");
        Intrinsics.checkNotNullParameter(exclusionRulesJsonConverter, "exclusionRulesJsonConverter");
        Intrinsics.checkNotNullParameter(adaptiveValidationRulesConverter, "adaptiveValidationRulesConverter");
        Intrinsics.checkNotNullParameter(adQualityAdVerificationConfigurationJsonConverter, "adQualityAdVerificationConfigurationJsonConverter");
        this.f30897a = reporter;
        this.f30898b = stringResponseParser;
        this.f30899c = systemCurrentTimeProvider;
        this.f30900d = encryptionParametersParser;
        this.f30901e = biddingSettingsDataParser;
        this.f30902f = exclusionRulesJsonConverter;
        this.f30903g = adaptiveValidationRulesConverter;
        this.f30904h = adQualityAdVerificationConfigurationJsonConverter;
    }

    private static Integer a(String str, JSONObject jSONObject) {
        Object m243constructorimpl;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:5|6|(1:8)(1:67)|9|(1:11)(1:66)|12|(1:14)(1:65)|15|16|(1:18)(1:64)|19|(1:63)(2:23|(21:26|27|28|29|30|31|(1:33)|34|35|36|37|(1:39)|40|(1:42)(1:55)|43|(1:45)(1:54)|46|(1:48)|49|50|51))|62|27|28|29|30|31|(0)|34|35|36|37|(0)|40|(0)(0)|43|(0)(0)|46|(0)|49|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x028f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0290, code lost:
    
        r64 = kotlin.Result.Companion;
        r0 = kotlin.Result.m243constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026c, code lost:
    
        r6 = kotlin.Result.Companion;
        r0 = kotlin.Result.m243constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b6 A[Catch: JSONException -> 0x0063, TryCatch #0 {JSONException -> 0x0063, blocks: (B:6:0x001c, B:8:0x0059, B:9:0x0068, B:11:0x00ac, B:12:0x00b7, B:14:0x00fc, B:16:0x0109, B:18:0x0188, B:19:0x0195, B:21:0x01a4, B:23:0x01ac, B:26:0x01c7, B:27:0x01d6, B:31:0x0277, B:34:0x027e, B:37:0x029a, B:40:0x02a1, B:42:0x02b6, B:43:0x02c6, B:45:0x02ce, B:46:0x02de, B:48:0x0343, B:49:0x0347, B:58:0x0290, B:61:0x026c, B:29:0x0259, B:36:0x0280), top: B:5:0x001c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ce A[Catch: JSONException -> 0x0063, TryCatch #0 {JSONException -> 0x0063, blocks: (B:6:0x001c, B:8:0x0059, B:9:0x0068, B:11:0x00ac, B:12:0x00b7, B:14:0x00fc, B:16:0x0109, B:18:0x0188, B:19:0x0195, B:21:0x01a4, B:23:0x01ac, B:26:0x01c7, B:27:0x01d6, B:31:0x0277, B:34:0x027e, B:37:0x029a, B:40:0x02a1, B:42:0x02b6, B:43:0x02c6, B:45:0x02ce, B:46:0x02de, B:48:0x0343, B:49:0x0347, B:58:0x0290, B:61:0x026c, B:29:0x0259, B:36:0x0280), top: B:5:0x001c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0343 A[Catch: JSONException -> 0x0063, TryCatch #0 {JSONException -> 0x0063, blocks: (B:6:0x001c, B:8:0x0059, B:9:0x0068, B:11:0x00ac, B:12:0x00b7, B:14:0x00fc, B:16:0x0109, B:18:0x0188, B:19:0x0195, B:21:0x01a4, B:23:0x01ac, B:26:0x01c7, B:27:0x01d6, B:31:0x0277, B:34:0x027e, B:37:0x029a, B:40:0x02a1, B:42:0x02b6, B:43:0x02c6, B:45:0x02ce, B:46:0x02de, B:48:0x0343, B:49:0x0347, B:58:0x0290, B:61:0x026c, B:29:0x0259, B:36:0x0280), top: B:5:0x001c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c4  */
    @Override // com.yandex.mobile.ads.impl.ar1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final du1 a(pq1 networkResponse) {
        boolean z4;
        C2144ok c2144ok;
        boolean z5;
        a50 a50Var;
        Object obj;
        Object m243constructorimpl;
        JSONArray optJSONArray;
        Set<u50> set;
        JSONObject optJSONObject;
        Map<gs, ? extends Set<String>> map;
        List<String> c4;
        JSONObject optJSONObject2;
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        String a4 = this.f30898b.a(networkResponse);
        if (a4 == null || a4.length() <= 0) {
            return null;
        }
        try {
            JSONObject jsonObject = new JSONObject(a4);
            boolean optBoolean = jsonObject.optBoolean("custom_click_handling_enabled");
            boolean optBoolean2 = jsonObject.optBoolean("legacy_visibility_logic_enabled");
            boolean optBoolean3 = jsonObject.optBoolean("legacy_vast_tracking_enabled");
            boolean optBoolean4 = jsonObject.optBoolean("overlapping_view_tracking_enabled");
            boolean optBoolean5 = jsonObject.optBoolean("overlapping_window_tracking_enabled");
            boolean optBoolean6 = jsonObject.optBoolean("open_measurement_sdk_disabled");
            int i4 = dq0.f24735b;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter("visibility_error_indicator_enabled", "name");
            Boolean valueOf = jsonObject.has("visibility_error_indicator_enabled") ? Boolean.valueOf(jsonObject.optBoolean("visibility_error_indicator_enabled")) : null;
            String optString = jsonObject.optString("mraid_controller", null);
            String optString2 = jsonObject.optString("open_measurement_sdk_controller", null);
            String optString3 = jsonObject.optString("click_handler_type", null);
            String optString4 = jsonObject.optString("ad_host", null);
            String optString5 = jsonObject.optString("divkit_font", null);
            String optString6 = jsonObject.optString("instream_design", null);
            boolean optBoolean7 = jsonObject.optBoolean("sensitive_mode_disabled");
            boolean optBoolean8 = jsonObject.optBoolean("hard_sensitive_mode_enabled");
            boolean optBoolean9 = jsonObject.optBoolean("encrypted_requests_enabled");
            Boolean valueOf2 = jsonObject.has("mediation_sensitive_mode_disabled") ? Boolean.valueOf(jsonObject.optBoolean("mediation_sensitive_mode_disabled")) : null;
            boolean optBoolean10 = jsonObject.optBoolean("fused_location_provider_disabled");
            boolean optBoolean11 = jsonObject.optBoolean("lock_screen_enabled");
            boolean optBoolean12 = jsonObject.optBoolean("impression_validation_on_click_enabled");
            boolean optBoolean13 = jsonObject.optBoolean("required_asset_validation_on_click_disabled");
            boolean optBoolean14 = jsonObject.optBoolean("any_impression_validation_on_click_disabled");
            boolean optBoolean15 = jsonObject.optBoolean("legacy_slider_impression_enabled");
            long optLong = jsonObject.optLong("reload_timeout");
            this.f30899c.getClass();
            long currentTimeMillis = System.currentTimeMillis() + (optLong > 0 ? optLong * 1000 : 86400000L);
            int optInt = jsonObject.optInt("ad_ids_storage_size");
            int optInt2 = jsonObject.optInt("native_web_view_pool_size");
            long optLong2 = jsonObject.optLong("max_disk_cache_size_bytes_for_video");
            Boolean bool = valueOf;
            long optLong3 = jsonObject.optLong("max_disk_cache_size_bytes_for_request_queue");
            Integer b4 = dq0.b("ad_request_max_retries", jsonObject);
            Boolean bool2 = valueOf2;
            Integer b5 = dq0.b("ping_request_max_retries", jsonObject);
            boolean optBoolean16 = jsonObject.optBoolean("show_version_validation_error_log", false);
            boolean optBoolean17 = jsonObject.optBoolean("show_version_validation_error_indicator", false);
            boolean optBoolean18 = jsonObject.optBoolean("fullscreen_back_button_enabled", false);
            boolean optBoolean19 = jsonObject.optBoolean("divkit_disabled", false);
            boolean optBoolean20 = jsonObject.optBoolean("use_okhttp_network_stack", false);
            boolean optBoolean21 = jsonObject.optBoolean("location_consent", false);
            boolean optBoolean22 = jsonObject.optBoolean("libssl_enabled", false);
            boolean optBoolean23 = jsonObject.optBoolean("client_bidding_startup_initialization_enabled");
            JSONObject optJSONObject3 = jsonObject.optJSONObject("bidding_settings");
            if (optJSONObject3 != null) {
                z4 = optBoolean22;
                c2144ok = this.f30901e.b(optJSONObject3);
            } else {
                z4 = optBoolean22;
                c2144ok = null;
            }
            JSONObject optJSONObject4 = jsonObject.optJSONObject("encryption");
            C2144ok c2144ok2 = c2144ok;
            this.f30900d.getClass();
            if (optJSONObject4 == null || (optJSONObject2 = optJSONObject4.optJSONObject("rsa")) == null) {
                z5 = optBoolean23;
            } else {
                z5 = optBoolean23;
                String optString7 = optJSONObject2.optString("public_key", "");
                Integer b6 = dq0.b("version", optJSONObject2);
                Intrinsics.checkNotNull(optString7);
                if (optString7.length() > 0 && b6 != null) {
                    a50Var = new a50(b6.intValue(), optString7);
                    a50 a50Var2 = a50Var;
                    boolean optBoolean24 = jsonObject.optBoolean("legacy_impression_callback_enabled", false);
                    boolean optBoolean25 = jsonObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
                    boolean optBoolean26 = jsonObject.optBoolean("render_asset_validation_enabled", false);
                    boolean optBoolean27 = jsonObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
                    boolean optBoolean28 = jsonObject.optBoolean("native_banner_enabled", false);
                    boolean optBoolean29 = jsonObject.optBoolean("use_divkit_close_action_instead_system_click", false);
                    String optString8 = jsonObject.optString("banner_size_calculation_type", null);
                    String optString9 = jsonObject.optString("startup_version", null);
                    boolean optBoolean30 = jsonObject.optBoolean("app_open_ad_preloading_enabled", false);
                    boolean optBoolean31 = jsonObject.optBoolean("interstitial_preloading_enabled", false);
                    boolean optBoolean32 = jsonObject.optBoolean("rewarded_preloading_enabled", false);
                    boolean optBoolean33 = jsonObject.optBoolean("new_false_click_tracking_enabled", false);
                    boolean optBoolean34 = jsonObject.optBoolean("varioqub_enabled", false);
                    boolean optBoolean35 = jsonObject.optBoolean("crash_tracker_enabled", false);
                    boolean optBoolean36 = jsonObject.optBoolean("error_tracker_enabled", false);
                    boolean optBoolean37 = jsonObject.optBoolean("anr_tracker_enabled", false);
                    Result.Companion companion = Result.Companion;
                    Object m243constructorimpl2 = Result.m243constructorimpl(Long.valueOf(jsonObject.getLong("anr_tracker_interval")));
                    obj = m243constructorimpl2;
                    if (Result.m244isFailureimpl(obj)) {
                        obj = null;
                    }
                    Long l4 = (Long) obj;
                    m243constructorimpl = Result.m243constructorimpl(Long.valueOf(jsonObject.getLong("anr_tracker_threshold")));
                    if (Result.m244isFailureimpl(m243constructorimpl)) {
                        m243constructorimpl = null;
                    }
                    Long l5 = (Long) m243constructorimpl;
                    boolean optBoolean38 = jsonObject.optBoolean("crash_ignore_enabled", false);
                    optJSONArray = jsonObject.optJSONArray("crash_stack_trace_exclusion_rules");
                    if (optJSONArray == null) {
                        this.f30902f.getClass();
                        set = w50.a(optJSONArray);
                    } else {
                        set = null;
                    }
                    optJSONObject = jsonObject.optJSONObject("adaptive_validation_rules");
                    if (optJSONObject == null) {
                        this.f30903g.getClass();
                        map = C2111na.a(optJSONObject);
                    } else {
                        map = null;
                    }
                    boolean optBoolean39 = jsonObject.optBoolean("disable_base64_for_ready_response", false);
                    boolean optBoolean40 = jsonObject.optBoolean("time_stamping_tracking_urls_enabled", false);
                    boolean optBoolean41 = jsonObject.optBoolean("app_ad_analytics_reporting_enabled", true);
                    boolean optBoolean42 = jsonObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
                    Integer a5 = a("network_thread_pool_size", jsonObject);
                    Integer a6 = a("image_loading_thread_pool_size", jsonObject);
                    Integer a7 = a("timeout_interval_for_request", jsonObject);
                    Integer a8 = a("timeout_interval_for_ping_request", jsonObject);
                    C1821b6 c1821b6 = this.f30904h;
                    JSONObject optJSONObject5 = jsonObject.optJSONObject("verification_configuration");
                    c1821b6.getClass();
                    C1989i6 a9 = C1821b6.a(optJSONObject5);
                    boolean optBoolean43 = jsonObject.optBoolean("sdk_tracking_reporter_enabled", false);
                    c4 = dq0.c("fallback_hosts", jsonObject);
                    if (c4 == null) {
                        c4 = CollectionsKt.emptyList();
                    }
                    List<String> list = c4;
                    boolean optBoolean44 = jsonObject.optBoolean("should_prefetch_dns", false);
                    boolean optBoolean45 = jsonObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
                    boolean optBoolean46 = jsonObject.optBoolean("outstream_wrapper_video_supported", false);
                    boolean optBoolean47 = jsonObject.optBoolean("validate_click_in_web_view", false);
                    boolean optBoolean48 = jsonObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
                    Integer a10 = a("instream_qrcode_size_in_px", jsonObject);
                    boolean optBoolean49 = jsonObject.optBoolean("hide_bottom_navigation_bar", false);
                    du1.a r4 = new du1.a().a(b4).e(b5).a(optInt).b(optInt2).c(optLong2).b(optLong3).a(currentTimeMillis).f(optString).g(optString2).k(optBoolean).b(optString8).d(bool).h("7.15.0").B(optBoolean11).b(bool2).N(optBoolean7).s(optBoolean8).r(optBoolean10);
                    int i5 = ew1.f25476l;
                    return r4.c(ew1.a.a().i()).a(ew1.a.a().e()).y(optBoolean2).h(optBoolean25).x(optBoolean3).G(optBoolean4).H(optBoolean5).E(optBoolean6).u(optBoolean12).K(optBoolean13).b(optBoolean14).w(optBoolean15).Q(optBoolean16).P(optBoolean17).e(optString6).q(optBoolean18).g(z5).a(c2144ok2).a(a50Var2).n(optBoolean24).m(optBoolean19).U(optBoolean20).A(optBoolean21).z(z4).a(optString4).d(optString5).o(optBoolean9).J(optBoolean26).c(optString3).f(optBoolean27).C(optBoolean28).T(optBoolean29).i(optString9).e(optBoolean30).v(optBoolean31).L(optBoolean32).D(optBoolean33).W(optBoolean34).j(optBoolean35).p(optBoolean36).a(optBoolean37).a(l4).b(l5).i(optBoolean38).a(set).a(map).l(optBoolean39).S(optBoolean40).c(optBoolean41).d(optBoolean42).d(a5).b(a6).g(a7).f(a8).a(a9).M(optBoolean43).a(list).O(optBoolean44).R(optBoolean45).F(optBoolean46).V(optBoolean47).I(optBoolean48).c(a10).t(optBoolean49).a();
                }
            }
            a50Var = null;
            a50 a50Var22 = a50Var;
            boolean optBoolean242 = jsonObject.optBoolean("legacy_impression_callback_enabled", false);
            boolean optBoolean252 = jsonObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
            boolean optBoolean262 = jsonObject.optBoolean("render_asset_validation_enabled", false);
            boolean optBoolean272 = jsonObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
            boolean optBoolean282 = jsonObject.optBoolean("native_banner_enabled", false);
            boolean optBoolean292 = jsonObject.optBoolean("use_divkit_close_action_instead_system_click", false);
            String optString82 = jsonObject.optString("banner_size_calculation_type", null);
            String optString92 = jsonObject.optString("startup_version", null);
            boolean optBoolean302 = jsonObject.optBoolean("app_open_ad_preloading_enabled", false);
            boolean optBoolean312 = jsonObject.optBoolean("interstitial_preloading_enabled", false);
            boolean optBoolean322 = jsonObject.optBoolean("rewarded_preloading_enabled", false);
            boolean optBoolean332 = jsonObject.optBoolean("new_false_click_tracking_enabled", false);
            boolean optBoolean342 = jsonObject.optBoolean("varioqub_enabled", false);
            boolean optBoolean352 = jsonObject.optBoolean("crash_tracker_enabled", false);
            boolean optBoolean362 = jsonObject.optBoolean("error_tracker_enabled", false);
            boolean optBoolean372 = jsonObject.optBoolean("anr_tracker_enabled", false);
            Result.Companion companion2 = Result.Companion;
            Object m243constructorimpl22 = Result.m243constructorimpl(Long.valueOf(jsonObject.getLong("anr_tracker_interval")));
            obj = m243constructorimpl22;
            if (Result.m244isFailureimpl(obj)) {
            }
            Long l42 = (Long) obj;
            m243constructorimpl = Result.m243constructorimpl(Long.valueOf(jsonObject.getLong("anr_tracker_threshold")));
            if (Result.m244isFailureimpl(m243constructorimpl)) {
            }
            Long l52 = (Long) m243constructorimpl;
            boolean optBoolean382 = jsonObject.optBoolean("crash_ignore_enabled", false);
            optJSONArray = jsonObject.optJSONArray("crash_stack_trace_exclusion_rules");
            if (optJSONArray == null) {
            }
            optJSONObject = jsonObject.optJSONObject("adaptive_validation_rules");
            if (optJSONObject == null) {
            }
            boolean optBoolean392 = jsonObject.optBoolean("disable_base64_for_ready_response", false);
            boolean optBoolean402 = jsonObject.optBoolean("time_stamping_tracking_urls_enabled", false);
            boolean optBoolean412 = jsonObject.optBoolean("app_ad_analytics_reporting_enabled", true);
            boolean optBoolean422 = jsonObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
            Integer a52 = a("network_thread_pool_size", jsonObject);
            Integer a62 = a("image_loading_thread_pool_size", jsonObject);
            Integer a72 = a("timeout_interval_for_request", jsonObject);
            Integer a82 = a("timeout_interval_for_ping_request", jsonObject);
            C1821b6 c1821b62 = this.f30904h;
            JSONObject optJSONObject52 = jsonObject.optJSONObject("verification_configuration");
            c1821b62.getClass();
            C1989i6 a92 = C1821b6.a(optJSONObject52);
            boolean optBoolean432 = jsonObject.optBoolean("sdk_tracking_reporter_enabled", false);
            c4 = dq0.c("fallback_hosts", jsonObject);
            if (c4 == null) {
            }
            List<String> list2 = c4;
            boolean optBoolean442 = jsonObject.optBoolean("should_prefetch_dns", false);
            boolean optBoolean452 = jsonObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
            boolean optBoolean462 = jsonObject.optBoolean("outstream_wrapper_video_supported", false);
            boolean optBoolean472 = jsonObject.optBoolean("validate_click_in_web_view", false);
            boolean optBoolean482 = jsonObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
            Integer a102 = a("instream_qrcode_size_in_px", jsonObject);
            boolean optBoolean492 = jsonObject.optBoolean("hide_bottom_navigation_bar", false);
            du1.a r42 = new du1.a().a(b4).e(b5).a(optInt).b(optInt2).c(optLong2).b(optLong3).a(currentTimeMillis).f(optString).g(optString2).k(optBoolean).b(optString82).d(bool).h("7.15.0").B(optBoolean11).b(bool2).N(optBoolean7).s(optBoolean8).r(optBoolean10);
            int i52 = ew1.f25476l;
            return r42.c(ew1.a.a().i()).a(ew1.a.a().e()).y(optBoolean2).h(optBoolean252).x(optBoolean3).G(optBoolean4).H(optBoolean5).E(optBoolean6).u(optBoolean12).K(optBoolean13).b(optBoolean14).w(optBoolean15).Q(optBoolean16).P(optBoolean17).e(optString6).q(optBoolean18).g(z5).a(c2144ok2).a(a50Var22).n(optBoolean242).m(optBoolean19).U(optBoolean20).A(optBoolean21).z(z4).a(optString4).d(optString5).o(optBoolean9).J(optBoolean262).c(optString3).f(optBoolean272).C(optBoolean282).T(optBoolean292).i(optString92).e(optBoolean302).v(optBoolean312).L(optBoolean322).D(optBoolean332).W(optBoolean342).j(optBoolean352).p(optBoolean362).a(optBoolean372).a(l42).b(l52).i(optBoolean382).a(set).a(map).l(optBoolean392).S(optBoolean402).c(optBoolean412).d(optBoolean422).d(a52).b(a62).g(a72).f(a82).a(a92).M(optBoolean432).a(list2).O(optBoolean442).R(optBoolean452).F(optBoolean462).V(optBoolean472).I(optBoolean482).c(a102).t(optBoolean492).a();
        } catch (JSONException e4) {
            ap0.b(new Object[0]);
            this.f30897a.reportError("Can't parse sdk configuration response", e4);
            return null;
        }
    }
}
