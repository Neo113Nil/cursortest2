package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jh {

    /* renamed from: b, reason: collision with root package name */
    public static final jh f7160b = new jh();

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f7161a;

    public jh() {
        this.f7161a = new JSONObject();
    }

    public final void a(int i4, Object obj) {
        try {
            this.f7161a.put(String.valueOf(i4), obj);
        } catch (JSONException unused) {
        }
    }

    public final String a(int i4) {
        Object opt = this.f7161a.opt(String.valueOf(i4));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public jh(JSONObject jSONObject) {
        this.f7161a = jSONObject;
    }
}
