package com.applovin.impl.sdk.b;

import java.util.HashSet;

/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final d<String> f3007a = new d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b, reason: collision with root package name */
    public static final d<Integer> f3008b = new d<>("com.applovin.sdk.last_version_code", Integer.class);

    /* renamed from: c, reason: collision with root package name */
    public static final d<String> f3009c = new d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: d, reason: collision with root package name */
    public static final d<String> f3010d = new d<>("com.applovin.sdk.variables", String.class);
    public static final d<Boolean> e = new d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final d<Boolean> f = new d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final d<HashSet> g = new d<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);
    public static final d<String> h = new d<>("com.applovin.sdk.stats", String.class);
    public static final d<String> i = new d<>("com.applovin.sdk.errors", String.class);
    public static final d<HashSet> j = new d<>("com.applovin.sdk.task.stats", HashSet.class);
    public static final d<String> k = new d<>("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final d<String> l = new d<>("com.applovin.sdk.zones", String.class);
    public static final d<HashSet> m = new d<>("com.applovin.sdk.ad.stats", HashSet.class);
    public static final d<Integer> n = new d<>("com.applovin.sdk.last_video_position", Integer.class);
    public static final d<Boolean> o = new d<>("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final d<String> p = new d<>("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final d<String> q = new d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final d<String> r = new d<>("com.applovin.sdk.persisted_data", String.class);
    private final String s;
    private final Class<T> t;

    public d(String str, Class<T> cls) {
        this.s = str;
        this.t = cls;
    }

    public String a() {
        return this.s;
    }

    public Class<T> b() {
        return this.t;
    }

    public String toString() {
        return "Key{name='" + this.s + "'type='" + this.t + "'}";
    }
}
