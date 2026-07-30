package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aq {

    /* renamed from: h, reason: collision with root package name */
    public static final String f13693h = "business_type";
    public static final int i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public static final int f13694j = 1001;

    /* renamed from: a, reason: collision with root package name */
    public String f13695a;

    /* renamed from: b, reason: collision with root package name */
    public int f13696b;

    /* renamed from: c, reason: collision with root package name */
    public String f13697c;

    /* renamed from: d, reason: collision with root package name */
    public String f13698d;

    /* renamed from: e, reason: collision with root package name */
    public String f13699e;

    /* renamed from: f, reason: collision with root package name */
    public long f13700f;

    /* renamed from: g, reason: collision with root package name */
    public String f13701g;

    public static String a(int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f13693h, i4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a() {
        return this.f13698d + "--extra: " + this.f13701g + "--requestType: " + this.f13696b + "--content:" + this.f13699e;
    }
}
