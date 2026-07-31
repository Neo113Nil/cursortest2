package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f31 implements kv3<un> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<rr2> f4960a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<po0> f4961b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<JSONObject> f4962c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<String> f4963d;

    public f31(yv3<rr2> yv3Var, yv3<po0> yv3Var2, yv3<JSONObject> yv3Var3, yv3<String> yv3Var4) {
        this.f4960a = yv3Var;
        this.f4961b = yv3Var2;
        this.f4962c = yv3Var3;
        this.f4963d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ((m71) this.f4960a).b();
        po0 b7 = ((rw0) this.f4961b).b();
        JSONObject a7 = this.f4962c.a();
        String a8 = this.f4963d.a();
        boolean equals = "native".equals(a8);
        y2.t.q();
        return new un(UUID.randomUUID().toString(), b7, a8, a7, false, equals);
    }
}
