package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3813qp {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f33880p = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final C3214fi f33881a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f33882b;

    /* renamed from: c, reason: collision with root package name */
    public final C5107a f33883c;

    /* renamed from: d, reason: collision with root package name */
    public final C3226fu f33884d;

    /* renamed from: e, reason: collision with root package name */
    public final SD f33885e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f33886f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33887g;

    /* renamed from: h, reason: collision with root package name */
    public final Yu f33888h;
    public final C3002bo i;

    /* renamed from: j, reason: collision with root package name */
    public final Av f33889j;

    /* renamed from: k, reason: collision with root package name */
    public final C2897Zk f33890k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f33891l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public String f33892m;

    /* renamed from: n, reason: collision with root package name */
    public List f33893n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f33894o;

    public C3813qp(C3214fi c3214fi, Context context, C5107a c5107a, C3226fu c3226fu, SD sd, String str, Yu yu, C3002bo c3002bo, C2837Wb c2837Wb, ScheduledExecutorService scheduledExecutorService, Av av, C2897Zk c2897Zk) {
        this.f33881a = c3214fi;
        this.f33882b = context;
        this.f33883c = c5107a;
        this.f33884d = c3226fu;
        this.f33885e = sd;
        this.f33887g = str;
        this.f33888h = yu;
        this.i = c3002bo;
        this.f33886f = scheduledExecutorService;
        this.f33889j = av;
        this.f33890k = c2897Zk;
    }

    public static final String d(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC3354iD a(String str, String str2) {
        J3.a c4;
        String str3;
        String str4;
        int i = 0;
        int i4 = 7;
        int i9 = 6;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return C3686oN.l(new C3059cr(15, "Invalid ad string."));
        }
        Context context = this.f33882b;
        Vu f6 = Vu.f(context, 11);
        f6.a();
        C2855Xc o9 = p2.j.f39798C.f39817r.o(context, this.f33883c, this.f33881a.c());
        C2837Wb c2837Wb = AbstractC2655Lg.f26168C;
        C2889Zc a9 = o9.a("google.afma.response.normalize", c2837Wb, c2837Wb);
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31612Z7)).booleanValue();
        SD sd = this.f33885e;
        C3002bo c3002bo = this.i;
        if (booleanValue) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.f33892m = jSONObject.optString("fetch_url", "");
                    this.f33893n = p8.g.p(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i10 = t2.C.f40822b;
                    u2.i.f("Invalid ad response.");
                    str4 = this.f33892m;
                    List list = this.f33893n;
                    if (TextUtils.isEmpty(str4)) {
                    }
                    C3945tD y6 = C3686oN.y(C3686oN.y(C3686oN.y(c4, new C3907sc(i4, str2), sd), new C2936ad(5, this, a9), sd), new C3907sc(i9, this), sd);
                    PA.Q(y6, this.f33888h, f6, false);
                    y6.c(new MD(i, y6, new Rx(this)), AbstractC3212fg.f30745h);
                    return y6;
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            str4 = this.f33892m;
            List list2 = this.f33893n;
            if (TextUtils.isEmpty(str4)) {
                c3002bo.b("sst", "2");
                C3151ea c3151ea = AbstractC3368ia.f31632b8;
                q2.r rVar = q2.r.f40116e;
                String str6 = (String) rVar.f40119c.a(c3151ea);
                C3151ea c3151ea2 = AbstractC3368ia.f31622a8;
                if (((Boolean) rVar.f40119c.a(c3151ea2)).booleanValue()) {
                    Pattern pattern = f33880p;
                    YA ya = new YA(pattern);
                    pattern.matcher("").getClass();
                    PA.M(!r4.matches(), "The pattern may not match the empty string: %s", ya);
                    List r9 = new com.bumptech.glide.manager.o(new C4086vt(6, ya)).r(str4);
                    if (r9.size() < 2) {
                        c4 = C3686oN.l(new C3059cr(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) r9.get(1);
                        t2.G g9 = p2.j.f39798C.f39803c;
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                c4 = C3686oN.v((JD) C3686oN.w(JD.s(AbstractC3212fg.f30738a.b(new T6(i4, this, new C2647Kp(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6)))), ((Integer) r10.a(AbstractC3368ia.f31641c8)).intValue(), TimeUnit.MILLISECONDS, this.f33886f), Exception.class, new C2936ad(i9, this, list2), sd);
            } else {
                c4 = C3686oN.c(str3);
                c3002bo.b("sst", "1");
            }
        } else {
            c4 = C3686oN.c(str);
            c3002bo.b("sst", "1");
        }
        C3945tD y62 = C3686oN.y(C3686oN.y(C3686oN.y(c4, new C3907sc(i4, str2), sd), new C2936ad(5, this, a9), sd), new C3907sc(i9, this), sd);
        PA.Q(y62, this.f33888h, f6, false);
        y62.c(new MD(i, y62, new Rx(this)), AbstractC3212fg.f30745h);
        return y62;
    }

    public final void b(int i) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31658e8)).booleanValue()) {
            String a9 = com.anythink.basead.b.c.i.a(i);
            p2.j.f39798C.f39810k.getClass();
            this.i.c(a9, System.currentTimeMillis());
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && com.anythink.core.common.v.m.f16967e.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f33887g));
            }
            return jSONObject.toString();
        } catch (JSONException e6) {
            String concat = "Failed to update the ad types for rendering. ".concat(e6.toString());
            int i = t2.C.f40822b;
            u2.i.f(concat);
            return str;
        }
    }
}
