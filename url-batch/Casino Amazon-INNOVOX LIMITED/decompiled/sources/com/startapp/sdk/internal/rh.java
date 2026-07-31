package com.startapp.sdk.internal;

import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class rh implements a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f407a;

    public rh(JSONArray jSONArray) {
        this.f407a = jSONArray;
    }

    @Override // com.startapp.sdk.internal.a7
    public final Object a(Object obj) {
        try {
            return this.f407a.getJSONObject(((Integer) obj).intValue());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
