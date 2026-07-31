package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m31 implements kv3<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<rr2> f8392a;

    public m31(yv3<rr2> yv3Var) {
        this.f8392a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return new JSONObject(((m71) this.f8392a).b().A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
