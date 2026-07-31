package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sg {
    public static final sg b = new sg();

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f425a;

    public sg() {
        this.f425a = new JSONObject();
    }

    public final void a(int i, Object obj) {
        try {
            this.f425a.put(String.valueOf(i), obj);
        } catch (JSONException unused) {
        }
    }

    public final String a(int i) {
        Object opt = this.f425a.opt(String.valueOf(i));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public sg(JSONObject jSONObject) {
        this.f425a = jSONObject;
    }
}
