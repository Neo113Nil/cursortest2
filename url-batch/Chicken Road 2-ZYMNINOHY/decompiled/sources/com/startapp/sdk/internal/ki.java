package com.startapp.sdk.internal;

import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ki implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f7193a;

    public ki(JSONArray jSONArray) {
        this.f7193a = jSONArray;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        try {
            return this.f7193a.getJSONObject(((Integer) obj).intValue());
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
