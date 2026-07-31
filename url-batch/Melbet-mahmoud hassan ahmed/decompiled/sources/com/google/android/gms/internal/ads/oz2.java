package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oz2 {

    /* renamed from: a, reason: collision with root package name */
    private n03 f9956a;

    /* renamed from: b, reason: collision with root package name */
    private long f9957b;

    /* renamed from: c, reason: collision with root package name */
    private int f9958c;

    public oz2() {
        b();
        this.f9956a = new n03(null);
    }

    public final WebView a() {
        return this.f9956a.get();
    }

    public final void b() {
        this.f9957b = System.nanoTime();
        this.f9958c = 1;
    }

    public void c() {
        this.f9956a.clear();
    }

    public final void d(String str, long j7) {
        if (j7 < this.f9957b || this.f9958c == 3) {
            return;
        }
        this.f9958c = 3;
        gz2.a().f(a(), str);
    }

    public final void e(String str, long j7) {
        if (j7 >= this.f9957b) {
            this.f9958c = 2;
            gz2.a().f(a(), str);
        }
    }

    public void f(py2 py2Var, ny2 ny2Var) {
        g(py2Var, ny2Var, null);
    }

    protected final void g(py2 py2Var, ny2 ny2Var, JSONObject jSONObject) {
        String h7 = py2Var.h();
        JSONObject jSONObject2 = new JSONObject();
        sz2.g(jSONObject2, "environment", "app");
        sz2.g(jSONObject2, "adSessionType", ny2Var.d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        sz2.g(jSONObject3, "deviceType", sb.toString());
        sz2.g(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        sz2.g(jSONObject3, "os", "Android");
        sz2.g(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        sz2.g(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        sz2.g(jSONObject4, "partnerName", ny2Var.e().b());
        sz2.g(jSONObject4, "partnerVersion", ny2Var.e().c());
        sz2.g(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        sz2.g(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        sz2.g(jSONObject5, "appId", ez2.b().a().getApplicationContext().getPackageName());
        sz2.g(jSONObject2, "app", jSONObject5);
        if (ny2Var.f() != null) {
            sz2.g(jSONObject2, "contentUrl", ny2Var.f());
        }
        sz2.g(jSONObject2, "customReferenceData", ny2Var.g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator<vy2> it = ny2Var.h().iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        gz2.a().g(a(), h7, jSONObject2, jSONObject6, jSONObject);
    }

    public final void h(float f7) {
        gz2.a().e(a(), f7);
    }

    final void i(WebView webView) {
        this.f9956a = new n03(webView);
    }

    public void j() {
    }

    public final boolean k() {
        return this.f9956a.get() != null;
    }
}
