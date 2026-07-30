package com.baidu.ar;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vb {

    /* renamed from: a, reason: collision with root package name */
    public String f3460a;

    /* renamed from: b, reason: collision with root package name */
    public String f3461b;

    /* renamed from: c, reason: collision with root package name */
    public String f3462c;

    /* renamed from: d, reason: collision with root package name */
    public String f3463d;

    public String a() {
        return this.f3461b;
    }

    public String b() {
        return this.f3463d;
    }

    public String c() {
        return this.f3462c;
    }

    public String d() {
        return this.f3460a;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", d());
            jSONObject.put("action", a());
            jSONObject.put("render", c());
            jSONObject.put(TtmlNode.TAG_BODY, b());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public void a(String str) {
        this.f3461b = str;
    }

    public void b(String str) {
        this.f3463d = str;
    }

    public void c(String str) {
        this.f3462c = str;
    }

    public void d(String str) {
        this.f3460a = str;
    }
}
