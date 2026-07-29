package com.applovin.impl.sdk.c;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class g {
    private static final Set<String> B = new HashSet(32);
    private static final Set<g> C = new HashSet(16);

    /* renamed from: a, reason: collision with root package name */
    public static final g f3050a = a("ad_req");

    /* renamed from: b, reason: collision with root package name */
    public static final g f3051b = a("ad_imp");

    /* renamed from: c, reason: collision with root package name */
    public static final g f3052c = a("ad_session_start");

    /* renamed from: d, reason: collision with root package name */
    public static final g f3053d = a("ad_imp_session");
    public static final g e = a("cached_files_expired");
    public static final g f = a("cache_drop_count");
    public static final g g = a("sdk_reset_state_count", true);
    public static final g h = a("ad_response_process_failures", true);
    public static final g i = a("response_process_failures", true);
    public static final g j = a("incent_shown_without_prompt_count", true);
    public static final g k = a("incent_prompt_accepted_count", true);
    public static final g l = a("incent_prompt_rejected_count", true);
    public static final g m = a("incent_failed_to_display_count", true);
    public static final g n = a("app_paused_and_resumed");
    public static final g o = a("cached_video_removed_count", true);
    public static final g p = a("med_ad_req");
    public static final g q = a("med_ad_response_process_failures", true);
    public static final g r = a("med_waterfall_ad_no_fill", true);
    public static final g s = a("med_waterfall_ad_adapter_load_failed", true);
    public static final g t = a("med_waterfall_ad_invalid_response", true);
    public static final g u = a("initial_load_count_inter", true);
    public static final g v = a("initial_load_count_rewarded", true);
    public static final g w = a("initial_load_count_banner", true);
    public static final g x = a("repeated_load_count_inter", true);
    public static final g y = a("repeated_load_count_rewarded", true);
    public static final g z = a("repeated_load_count_banner", true);
    private final String A;

    private g(String str) {
        this.A = str;
    }

    private static g a(String str) {
        return a(str, false);
    }

    private static g a(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        if (B.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        B.add(str);
        g gVar = new g(str);
        if (z2) {
            C.add(gVar);
        }
        return gVar;
    }

    public static Set<g> b() {
        return C;
    }

    public String a() {
        return this.A;
    }
}
