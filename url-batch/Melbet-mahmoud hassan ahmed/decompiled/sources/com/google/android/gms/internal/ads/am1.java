package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class am1 implements kv3<un> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<po0> f2866a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<String> f2867b;

    public am1(yv3<po0> yv3Var, yv3<String> yv3Var2) {
        this.f2866a = yv3Var;
        this.f2867b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        po0 b7 = ((rw0) this.f2866a).b();
        y2.t.q();
        return new un(UUID.randomUUID().toString(), b7, "native", new JSONObject(), false, true);
    }
}
