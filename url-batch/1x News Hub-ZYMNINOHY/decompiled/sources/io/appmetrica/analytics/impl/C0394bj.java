package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394bj extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final C0984yf f7095b;

    public C0394bj(C0457e5 c0457e5) {
        this(c0457e5, C0876ua.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(w5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f7095b.b(C0907vf.a(jSONObject));
        return false;
    }

    public C0394bj(C0457e5 c0457e5, C0984yf c0984yf) {
        super(c0457e5);
        this.f7095b = c0984yf;
    }
}
