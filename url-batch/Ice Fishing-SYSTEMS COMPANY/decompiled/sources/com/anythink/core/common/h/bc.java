package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    int f13768a;

    /* renamed from: b, reason: collision with root package name */
    boolean f13769b;

    /* renamed from: c, reason: collision with root package name */
    String f13770c;

    /* renamed from: d, reason: collision with root package name */
    boolean f13771d;

    private bc() {
    }

    public static bc a(boolean z8, String str, boolean z9) {
        bc bcVar = new bc();
        bcVar.f13768a = 1;
        bcVar.f13769b = z8;
        bcVar.f13770c = str;
        bcVar.f13771d = z9;
        return bcVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f13768a);
            jSONObject.put("is_playend", this.f13769b ? 1 : 2);
            jSONObject.put("url", this.f13770c);
            jSONObject.put("status", this.f13771d ? 1 : 2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
