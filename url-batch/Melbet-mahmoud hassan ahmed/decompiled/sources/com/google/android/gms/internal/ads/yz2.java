package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yz2 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f14867a;

    /* renamed from: b, reason: collision with root package name */
    private final h03 f14868b;

    public yz2(h03 h03Var) {
        this.f14868b = h03Var;
    }

    public final JSONObject a() {
        return this.f14867a;
    }

    public final void b() {
        this.f14868b.b(new i03(this, null));
    }

    public final void c(JSONObject jSONObject, HashSet<String> hashSet, long j7) {
        this.f14868b.b(new j03(this, hashSet, jSONObject, j7, null));
    }

    public final void d(JSONObject jSONObject, HashSet<String> hashSet, long j7) {
        this.f14868b.b(new k03(this, hashSet, jSONObject, j7, null));
    }

    public final void e(JSONObject jSONObject) {
        this.f14867a = jSONObject;
    }
}
