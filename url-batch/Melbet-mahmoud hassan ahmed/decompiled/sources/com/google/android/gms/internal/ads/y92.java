package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y92 implements c52<cf0, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final db2 f14586a;

    public y92(db2 db2Var) {
        this.f14586a = db2Var;
    }

    @Override // com.google.android.gms.internal.ads.c52
    public final d52<cf0, y62> a(String str, JSONObject jSONObject) {
        cf0 a7 = this.f14586a.a(str);
        if (a7 == null) {
            return null;
        }
        return new d52<>(a7, new y62(), str);
    }
}
