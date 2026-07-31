package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2178q8 {

    /* renamed from: a, reason: collision with root package name */
    private zn2 f30702a;

    /* renamed from: b, reason: collision with root package name */
    private C2309w2 f30703b;

    /* renamed from: c, reason: collision with root package name */
    private lv0 f30704c;

    /* renamed from: d, reason: collision with root package name */
    private int f30705d;

    /* renamed from: e, reason: collision with root package name */
    private long f30706e;

    public AbstractC2178q8() {
        g();
        this.f30702a = new zn2(null);
    }

    public void a() {
    }

    public void b() {
        this.f30702a.clear();
    }

    public final C2309w2 c() {
        return this.f30703b;
    }

    public final lv0 d() {
        return this.f30704c;
    }

    public final void e() {
        mo2.a(this.f30702a.get());
    }

    public final void f() {
        mo2.b(this.f30702a.get());
    }

    public final void g() {
        this.f30706e = System.nanoTime();
        this.f30705d = 1;
    }

    public final void a(float f4) {
        mo2.a(this.f30702a.get(), f4);
    }

    public final void b(String str, long j4) {
        if (j4 < this.f30706e || this.f30705d == 3) {
            return;
        }
        this.f30705d = 3;
        mo2.a(this.f30702a.get(), str);
    }

    final void a(WebView webView) {
        this.f30702a = new zn2(webView);
    }

    public final void a(C2309w2 c2309w2) {
        this.f30703b = c2309w2;
    }

    public final void a(C2086m8 c2086m8) {
        mo2.a(this.f30702a.get(), c2086m8.d());
    }

    public final void a(lv0 lv0Var) {
        this.f30704c = lv0Var;
    }

    public void a(ln2 ln2Var, C2109n8 c2109n8) {
        a(ln2Var, c2109n8, null);
    }

    protected final void a(ln2 ln2Var, C2109n8 c2109n8, JSONObject jSONObject) {
        String i4 = ln2Var.i();
        JSONObject jSONObject2 = new JSONObject();
        yn2.a(jSONObject2, "environment", "app");
        yn2.a(jSONObject2, "adSessionType", c2109n8.a());
        yn2.a(jSONObject2, "deviceInfo", on2.a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        yn2.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        yn2.a(jSONObject3, "partnerName", c2109n8.f().b());
        yn2.a(jSONObject3, "partnerVersion", c2109n8.f().c());
        yn2.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        yn2.a(jSONObject4, "libraryVersion", "1.3.26-Yandex");
        yn2.a(jSONObject4, "appId", ho2.a().b().getApplicationContext().getPackageName());
        yn2.a(jSONObject2, "app", jSONObject4);
        if (c2109n8.b() != null) {
            yn2.a(jSONObject2, "contentUrl", c2109n8.b());
        }
        if (c2109n8.c() != null) {
            yn2.a(jSONObject2, "customReferenceData", c2109n8.c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (ta2 ta2Var : c2109n8.g()) {
            yn2.a(jSONObject5, ta2Var.b(), ta2Var.c());
        }
        mo2.a(this.f30702a.get(), i4, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a(String str) {
        mo2.a(this.f30702a.get(), str, (JSONObject) null);
    }

    public final void a(String str, long j4) {
        if (j4 >= this.f30706e) {
            this.f30705d = 2;
            mo2.a(this.f30702a.get(), str);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        mo2.a(this.f30702a.get(), str, jSONObject);
    }

    public final void a(@NonNull JSONObject jSONObject) {
        mo2.b(this.f30702a.get(), jSONObject);
    }

    public final void a(boolean z4) {
        if (this.f30702a.get() != null) {
            mo2.b(this.f30702a.get(), z4 ? "foregrounded" : "backgrounded");
        }
    }
}
