package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Z8 {

    /* renamed from: a, reason: collision with root package name */
    public final zo f7775a;

    public Z8(zo zoVar) {
        this.f7775a = zoVar;
    }

    public final void a(int i2, long j2) {
        JSONObject optJSONObject;
        zo zoVar = this.f7775a;
        synchronized (zoVar) {
            optJSONObject = zoVar.f9678a.a().optJSONObject("numbers_of_type");
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put(String.valueOf(i2), j2);
        this.f7775a.a(optJSONObject);
    }
}
