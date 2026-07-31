package com.my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1630f {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f21298a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21299b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21300c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21301d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21302e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21303f;

    /* renamed from: g, reason: collision with root package name */
    private final long f21304g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f21305h;

    /* renamed from: i, reason: collision with root package name */
    private Long f21306i;

    C1630f(JSONObject jSONObject, String str, String str2, String str3, int i4, boolean z4, long j4) {
        this.f21299b = str;
        this.f21298a = jSONObject;
        this.f21300c = str2;
        this.f21301d = str3;
        this.f21302e = i4;
        this.f21303f = z4;
        this.f21304g = j4;
    }

    public String a() {
        return this.f21299b;
    }

    public Long b() {
        return this.f21306i;
    }

    public String c() {
        return this.f21301d;
    }

    public JSONObject d() {
        return this.f21305h;
    }

    public JSONObject e() {
        return this.f21298a;
    }

    public String f() {
        return this.f21300c;
    }

    public int g() {
        return this.f21302e;
    }

    public long h() {
        return this.f21304g;
    }

    public static C1630f a(String str, String str2, String str3, int i4, long j4) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("productId");
            if (!TextUtils.isEmpty(optString)) {
                return new C1630f(jSONObject, str2, str3, optString, i4, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j4);
            }
            AbstractC1708y2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            AbstractC1708y2.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public C1630f a(long j4) {
        this.f21306i = Long.valueOf(j4);
        return this;
    }

    public C1630f a(JSONObject jSONObject) {
        this.f21305h = jSONObject;
        return this;
    }
}
