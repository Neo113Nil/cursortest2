package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h92 implements c52<at2, z62> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, d52<at2, z62>> f6140a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final rt1 f6141b;

    public h92(rt1 rt1Var) {
        this.f6141b = rt1Var;
    }

    @Override // com.google.android.gms.internal.ads.c52
    public final d52<at2, z62> a(String str, JSONObject jSONObject) {
        d52<at2, z62> d52Var;
        synchronized (this) {
            d52Var = this.f6140a.get(str);
            if (d52Var == null) {
                d52Var = new d52<>(this.f6141b.b(str, jSONObject), new z62(), str);
                this.f6140a.put(str, d52Var);
            }
        }
        return d52Var;
    }
}
