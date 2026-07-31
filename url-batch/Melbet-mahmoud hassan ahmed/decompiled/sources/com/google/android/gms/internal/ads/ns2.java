package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ns2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f9303a;

    public ns2(JSONObject jSONObject) {
        this.f9303a = jSONObject;
    }

    public final String a() {
        if (b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int b() {
        int optInt = this.f9303a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
