package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2828n9 {

    /* renamed from: a, reason: collision with root package name */
    public final C3024uo f39493a;

    public C2828n9(C3024uo c3024uo) {
        this.f39493a = c3024uo;
    }

    public final void a(int i4, long j4) {
        JSONObject optJSONObject;
        C3024uo c3024uo = this.f39493a;
        synchronized (c3024uo) {
            optJSONObject = c3024uo.f39951a.a().optJSONObject("numbers_of_type");
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put(String.valueOf(i4), j4);
        this.f39493a.a(optJSONObject);
    }
}
