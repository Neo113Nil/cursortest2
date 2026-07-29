package com.tapjoy.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7923a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Float f7924b = null;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7925c = false;

    /* renamed from: d, reason: collision with root package name */
    private final da f7926d;

    private db(da daVar) {
        this.f7926d = daVar;
    }

    public static db a(da daVar) {
        dp.a(daVar, "Position is null");
        return new db(daVar);
    }

    final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f7923a);
            if (this.f7923a) {
                jSONObject.put("skipOffset", this.f7924b);
            }
            jSONObject.put("autoPlay", this.f7925c);
            jSONObject.put("position", this.f7926d);
        } catch (JSONException e) {
            dn.a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
