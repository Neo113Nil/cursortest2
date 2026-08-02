package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class li implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7243a;

    public li(JSONObject jSONObject) {
        this.f7243a = jSONObject;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        try {
            return this.f7243a.getJSONObject(((Integer) obj).toString());
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
