package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class a21 implements m11 {

    /* renamed from: a, reason: collision with root package name */
    private final rl0 f2564a;

    a21(rl0 rl0Var) {
        this.f2564a = rl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.rl0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.m11
    public final void b(JSONObject jSONObject) {
        this.f2564a.b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
