package com.anythink.core.common.g;

import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.j;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f13397a = "api.anythinktech.com";

    /* renamed from: b, reason: collision with root package name */
    public static final String f13398b = "https://se.zxcvbnmpo.com/v2/open/ns";

    /* renamed from: c, reason: collision with root package name */
    public static final String f13399c = "https://api.anythinktech.com/v2/open/app";

    /* renamed from: d, reason: collision with root package name */
    public static final String f13400d = "https://api.anythinktech.com/v2/open/placement";

    /* renamed from: e, reason: collision with root package name */
    public static final String f13401e = "https://ssapi.anythinktech.com/sdk/realtime_waterfall";

    /* renamed from: f, reason: collision with root package name */
    public static final String f13402f = "https://api.anythinktech.com/v2/open/pl_wf";

    /* renamed from: g, reason: collision with root package name */
    public static final String f13403g = "https://da.anythinktech.com/v1/open/da";

    /* renamed from: h, reason: collision with root package name */
    public static final String f13404h = "https://tk.anythinktech.com/v1/open/tk";
    public static final String i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f13405j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f13406k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f13407l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f13408m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f13409n = "";

    /* renamed from: o, reason: collision with root package name */
    public static final String f13410o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f13411p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f13412q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f13413r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f13414s = "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";

    static {
        String d2;
        StringBuilder sb = new StringBuilder("https://");
        if (ATSDK.isCnSDK()) {
            d2 = "api.anythinktech.com";
        } else {
            c.a();
            d2 = c.d();
        }
        i = AbstractC5051n.g(sb, d2, "/v2/open/eu");
        f13405j = "https://adx.anythinktech.com/bid";
        f13406k = "https://adx.anythinktech.com/request";
        f13407l = "https://adxtk.anythinktech.com/v1";
        f13408m = "https://adx.anythinktech.com/openapi/req";
        f13410o = "https://tk.anythinktech.com/ss/rrd";
        f13411p = "https://api.anythinktech.com/v2/open/area";
        f13412q = "https://api.anythinktech.com/v2/open/m_adapter";
        f13413r = "https://api.anythinktech.com/v2/open/dna";
    }

    public static String a() {
        return "api.anythinktech.com";
    }

    private static String b() {
        return j.g.a.f12626b;
    }

    private static String c() {
        return j.g.a.f12627c;
    }

    private static String d() {
        return j.g.a.f12628d;
    }

    private static String e() {
        if (ATSDK.isCnSDK()) {
            return "api.anythinktech.com";
        }
        c.a();
        return c.d();
    }

    private static String f() {
        return j.g.a.f12629e;
    }
}
