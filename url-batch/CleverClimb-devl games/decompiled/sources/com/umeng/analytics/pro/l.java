package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DefconProcesser.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8939a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8940b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8941c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8942d = 3;
    private final long e;

    private l() {
        this.e = 60000L;
    }

    /* compiled from: DefconProcesser.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f8943a = new l();

        private a() {
        }
    }

    public static l a() {
        return a.f8943a;
    }

    public int a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    public void a(JSONObject jSONObject, Context context) {
        int a2 = a(context);
        if (a2 == 1) {
            jSONObject.remove("events");
            g.a(context).f();
            return;
        }
        if (a2 != 2) {
            if (a2 == 3) {
                jSONObject.remove("events");
                jSONObject.remove(b.ac);
                jSONObject.remove(b.ah);
                g.a(context).f();
                return;
            }
            return;
        }
        jSONObject.remove("events");
        jSONObject.remove(b.ac);
        jSONObject.remove(b.ah);
        try {
            jSONObject.put(b.ac, c());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        g.a(context).f();
    }

    public void b(JSONObject jSONObject, Context context) {
        int a2 = a(context);
        if (a2 == 1) {
            jSONObject.remove("error");
            jSONObject.remove(b.N);
            jSONObject.remove(b.O);
            g.a(context).a(false, true);
            return;
        }
        if (a2 == 2) {
            jSONObject.remove(b.n);
            try {
                jSONObject.put(b.n, b());
            } catch (Exception unused) {
            }
            jSONObject.remove("error");
            jSONObject.remove(b.N);
            jSONObject.remove(b.O);
            g.a(context).a(false, true);
            return;
        }
        if (a2 == 3) {
            jSONObject.remove(b.n);
            jSONObject.remove("error");
            jSONObject.remove(b.N);
            jSONObject.remove(b.O);
            g.a(context).a(false, true);
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", o.a().d());
            jSONObject.put(b.p, currentTimeMillis);
            jSONObject.put(b.q, currentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            JSONObject j = com.umeng.analytics.b.a().j();
            if (j.length() > 0) {
                jSONObject.put(b.ab, j);
            }
            jSONObject.put(b.ad, o.a().d());
            jSONObject.put(b.ae, currentTimeMillis);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(b.af, o.a().d());
            jSONObject2.put(b.ag, currentTimeMillis + 60000);
            if (j.length() > 0) {
                jSONObject2.put(b.ab, j);
            }
            jSONArray.put(jSONObject).put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONArray;
    }
}
