package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zl2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f15185a;

    public zl2(Map<String, Object> map) {
        this.f15185a = map;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", y2.t.q().N(this.f15185a));
        } catch (JSONException e7) {
            String valueOf = String.valueOf(e7.getMessage());
            a3.r1.k(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
