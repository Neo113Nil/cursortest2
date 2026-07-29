package com.applovin.impl.a;

import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.e.m;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f2398c = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f2400b;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f2401d;
    private final JSONObject e;
    private final com.applovin.impl.sdk.ad.b f;

    /* renamed from: a, reason: collision with root package name */
    protected List<m> f2399a = new ArrayList();
    private final long g = System.currentTimeMillis();

    public c(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        this.f2400b = jVar;
        this.f2401d = jSONObject;
        this.e = jSONObject2;
        this.f = bVar;
    }

    public int a() {
        return this.f2399a.size();
    }

    public List<m> b() {
        return this.f2399a;
    }

    public JSONObject c() {
        return this.f2401d;
    }

    public JSONObject d() {
        return this.e;
    }

    public com.applovin.impl.sdk.ad.b e() {
        return this.f;
    }

    public long f() {
        return this.g;
    }

    public com.applovin.impl.sdk.ad.d g() {
        String a2 = com.applovin.impl.sdk.e.f.a(this.e, "zone_id", (String) null, this.f2400b);
        return com.applovin.impl.sdk.ad.d.a(AppLovinAdSize.fromString(com.applovin.impl.sdk.e.f.a(this.e, "ad_size", (String) null, this.f2400b)), AppLovinAdType.fromString(com.applovin.impl.sdk.e.f.a(this.e, "ad_type", (String) null, this.f2400b)), a2, this.f2400b);
    }

    public List<String> h() {
        List<String> a2 = com.applovin.impl.sdk.e.c.a(com.applovin.impl.sdk.e.f.a(this.f2401d, "vast_preferred_video_types", (String) null, (com.applovin.impl.sdk.j) null));
        return !a2.isEmpty() ? a2 : f2398c;
    }

    public int i() {
        return l.a(this.f2401d);
    }
}
