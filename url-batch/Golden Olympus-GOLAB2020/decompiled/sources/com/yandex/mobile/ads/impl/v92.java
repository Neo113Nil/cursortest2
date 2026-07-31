package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v92 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33557a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f33558b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33559c = true;

    /* renamed from: d, reason: collision with root package name */
    private final gj1 f33560d;

    private v92(boolean z4, Float f4, gj1 gj1Var) {
        this.f33557a = z4;
        this.f33558b = f4;
        this.f33560d = gj1Var;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f33557a);
            if (this.f33557a) {
                jSONObject.put("skipOffset", this.f33558b);
            }
            jSONObject.put("autoPlay", this.f33559c);
            jSONObject.put(b9.h.f15451L, this.f33560d);
            return jSONObject;
        } catch (JSONException e4) {
            Log.e("OMIDLIB", "VastProperties: JSON error", e4);
            return jSONObject;
        }
    }

    public static v92 a(gj1 gj1Var) {
        return new v92(false, null, gj1Var);
    }

    public static v92 a(float f4, gj1 gj1Var) {
        return new v92(true, Float.valueOf(f4), gj1Var);
    }
}
