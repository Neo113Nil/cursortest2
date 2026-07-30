package com.anythink.expressad.videocommon.c;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f22502a;

    /* renamed from: b, reason: collision with root package name */
    private String f22503b;

    private a(String str, String str2) {
        this.f22502a = str;
        this.f22503b = str2;
    }

    private String a() {
        return this.f22502a;
    }

    private String b() {
        return this.f22503b;
    }

    private void a(String str) {
        this.f22502a = str;
    }

    private void b(String str) {
        this.f22503b = str;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString(com.anythink.expressad.videocommon.e.b.f22565u), jSONObject.optString(com.anythink.expressad.videocommon.e.b.f22566v));
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
