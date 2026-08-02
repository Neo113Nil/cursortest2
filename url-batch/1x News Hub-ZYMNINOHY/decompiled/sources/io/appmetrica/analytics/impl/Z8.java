package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Z8 {

    /* renamed from: a, reason: collision with root package name */
    public final zo f6935a;

    public Z8(zo zoVar) {
        this.f6935a = zoVar;
    }

    public final void a(int i3, long j3) {
        JSONObject optJSONObject;
        zo zoVar = this.f6935a;
        synchronized (zoVar) {
            optJSONObject = zoVar.f8716a.a().optJSONObject("numbers_of_type");
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put(String.valueOf(i3), j3);
        this.f6935a.a(optJSONObject);
    }
}
