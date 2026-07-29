package com.applovin.impl.sdk.b;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a<T> extends b<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final b<String> f2995a = a("mediation_endpoint", "https://ms.applovin.com/");

    /* renamed from: b, reason: collision with root package name */
    public static final b<String> f2996b = a("mediation_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: c, reason: collision with root package name */
    public static final b<Boolean> f2997c = a("immediate_mediation_ad_fetch_after_signal_collection", true);

    /* renamed from: d, reason: collision with root package name */
    public static final b<Long> f2998d = a("fetch_next_ad_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));
    public static final b<Long> e = a("fetch_next_ad_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));
    public static final b<Boolean> f = a("pass_extra_parameters", true);
    public static final b<Boolean> g = a("process_ad_waterfall_immediately", false);
    public static final b<String> h = a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
    public static final b<Boolean> i = a("persistent_mediated_postbacks", false);
    public static final b<Integer> j = a("max_signal_collector_threads", 3);
    public static final b<Long> k = a("max_signal_provider_latency_ms", 30000L);
    public static final b<Integer> l = a("max_adapter_version_length", 20);
    public static final b<Integer> m = a("max_adapter_sdk_version_length", 20);
    public static final b<Integer> n = a("max_adapter_signal_length", 5120);
    public static final b<Long> o = a("init_completion_delay_ms", -1L);
    public static final b<Integer> p = a("max_auto_init_adapters_threads", 3);
    public static final b<Boolean> q = a("run_adapter_operations_on_ui_thread", true);
    public static final b<Long> r = a("default_adapter_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> s = a("default_ad_view_width", -1);
    public static final b<Integer> t = a("default_ad_view_height", 50);
    public static final b<Long> u = a("ad_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));
    public static final b<Long> v = a("ad_load_failure_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));
    public static final b<String> w = a("ad_load_failure_refresh_ignore_error_codes", "204");
    public static final b<Long> x = a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
    public static final b<Boolean> y = a("refresh_ad_view_timer_responds_to_background", true);
    public static final b<Boolean> z = a("refresh_ad_view_timer_responds_to_store_kit", true);
    public static final b<Long> A = a("ad_view_fade_in_animation_ms", 150L);
    public static final b<Long> B = a("ad_view_fade_out_animation_ms", 150L);
    public static final b<Long> C = a("fullscreen_display_delay_ms", 600L);
    public static final b<Boolean> D = a("is_testing", false);
    public static final b<Boolean> E = a("process_next_waterfall_ad_on_mediation_main_queue", false);
    public static final b<Boolean> F = a("use_mediated_sdk_queues", true);
    public static final b<Long> G = a("ad_view_refresh_precache_request_viewability_undesired_flags", 118L);
    public static final b<Long> H = a("ad_view_refresh_precache_request_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));
    public static final b<Boolean> I = a("ad_view_block_publisher_load_if_refresh_scheduled", true);
    public static final b<Boolean> J = a("fullscreen_ads_block_publisher_load_if_another_showing", true);
    public static final b<Long> K = a("ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));
}
