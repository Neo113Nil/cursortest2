package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13510a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13511b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13512c = 3;

    /* renamed from: d, reason: collision with root package name */
    public int f13513d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f13514e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f13515f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f13516g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f13517h = 1;

    private aa() {
    }

    public static aa a() {
        aa aaVar = new aa();
        aaVar.f13513d = 3;
        aaVar.f13514e = 3;
        aaVar.f13515f = 3;
        aaVar.f13516g = 3;
        aaVar.f13517h = 1;
        return aaVar;
    }

    public final String toString() {
        return super.toString();
    }

    public static aa a(String str) {
        aa aaVar = new aa();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aaVar.f13513d = jSONObject.optInt("b_e", 1);
            aaVar.f13514e = jSONObject.optInt("r_s", 1);
            aaVar.f13515f = jSONObject.optInt("r_f", 1);
            aaVar.f13516g = jSONObject.optInt("g_ad", 1);
            aaVar.f13517h = jSONObject.optInt("ip_af", 1);
        } catch (Throwable unused) {
        }
        return aaVar;
    }
}
