package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sh implements a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f426a;

    public sh(JSONObject jSONObject) {
        this.f426a = jSONObject;
    }

    @Override // com.startapp.sdk.internal.a7
    public final Object a(Object obj) {
        try {
            return this.f426a.getJSONObject(((Integer) obj).toString());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
