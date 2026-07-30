package com.baidu.mapauto.auth.base;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public String f7735a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f7736b;

    public b(String str) {
        JSONObject jSONObject;
        this.f7735a = str;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        this.f7736b = jSONObject;
    }
}
