package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class li implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f4115a;

    public li(JSONObject jSONObject) {
        this.f4115a = jSONObject;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        try {
            return this.f4115a.getJSONObject(((Integer) obj).toString());
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }
}
