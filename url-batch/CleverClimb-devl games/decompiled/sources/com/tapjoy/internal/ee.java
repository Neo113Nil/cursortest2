package com.tapjoy.internal;

import com.tapjoy.internal.dz;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ee implements dz.b {

    /* renamed from: a, reason: collision with root package name */
    final ea f7985a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f7986b;

    public ee(ea eaVar) {
        this.f7985a = eaVar;
    }

    @Override // com.tapjoy.internal.dz.b
    public final JSONObject a() {
        return this.f7986b;
    }

    @Override // com.tapjoy.internal.dz.b
    public final void a(JSONObject jSONObject) {
        this.f7986b = jSONObject;
    }

    public final void b() {
        this.f7985a.a(new eb(this));
    }
}
