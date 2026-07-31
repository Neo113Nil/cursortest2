package com.my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1671p0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f21480a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21481b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21482c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21483d;

    /* renamed from: e, reason: collision with root package name */
    private final long f21484e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f21485f;

    /* renamed from: g, reason: collision with root package name */
    private Long f21486g;

    C1671p0(JSONObject jSONObject, String str, String str2, boolean z4, long j4) {
        this.f21481b = str;
        this.f21480a = jSONObject;
        this.f21482c = str2;
        this.f21483d = z4;
        this.f21484e = j4;
    }

    public String a() {
        return this.f21481b;
    }

    public Long b() {
        return this.f21486g;
    }

    public String c() {
        return this.f21482c;
    }

    public JSONObject d() {
        return this.f21480a;
    }

    public JSONObject e() {
        return this.f21485f;
    }

    public long f() {
        return this.f21484e;
    }

    public boolean g() {
        return this.f21483d;
    }

    public static C1671p0 a(String str, String str2, long j4) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
                return a(jSONObject, str2, j4);
            }
            AbstractC1708y2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            AbstractC1708y2.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public static C1671p0 a(JSONObject jSONObject, String str, long j4) {
        return new C1671p0(jSONObject, str, jSONObject.optString("productId"), jSONObject.has("autoRenewing"), j4);
    }

    public C1671p0 a(long j4) {
        this.f21486g = Long.valueOf(j4);
        return this;
    }

    public C1671p0 a(JSONObject jSONObject) {
        this.f21485f = jSONObject;
        return this;
    }
}
