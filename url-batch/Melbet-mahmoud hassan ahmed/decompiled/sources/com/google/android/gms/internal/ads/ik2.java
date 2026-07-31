package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ik2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f6672a;

    public ik2(JSONObject jSONObject) {
        this.f6672a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            JSONObject f7 = a3.a1.f(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f6672a;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f7.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            a3.r1.k("Failed putting app indexing json.");
        }
    }
}
