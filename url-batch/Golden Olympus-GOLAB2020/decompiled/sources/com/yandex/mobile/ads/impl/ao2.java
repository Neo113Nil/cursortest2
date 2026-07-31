package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bo2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ao2 implements bo2.b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f23393a;

    /* renamed from: b, reason: collision with root package name */
    private final fo2 f23394b;

    public ao2(fo2 fo2Var) {
        this.f23394b = fo2Var;
    }

    public final void a() {
        this.f23394b.a(new jo2(this));
    }

    public final JSONObject b() {
        return this.f23393a;
    }

    public final void a(JSONObject jSONObject) {
        this.f23393a = jSONObject;
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f23394b.a(new oo2(this, hashSet, jSONObject, j4));
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f23394b.a(new ro2(this, hashSet, jSONObject, j4));
    }
}
