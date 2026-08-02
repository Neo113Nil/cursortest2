package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Wi extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0977tf f11192b;

    public Wi(X4 x4) {
        this(x4, C0817na.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(p5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f11192b.b(C0900qf.a(jSONObject));
        return false;
    }

    public Wi(X4 x4, C0977tf c0977tf) {
        super(x4);
        this.f11192b = c0977tf;
    }
}
